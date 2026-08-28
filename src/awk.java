import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class awk {
   private static final Codec<awk> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(axo.r.fieldOf("id").forGetter(awk::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, awk::new)
   );
   public static final Codec<awk> a = Codec.either(axo.r, b)
      .xmap($$0 -> (awk)$$0.map($$0x -> new awk($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final akk c;
   private final boolean d;
   private final boolean e;

   private awk(akk $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private awk(axo.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private axo.c a() {
      return new axo.c(this.c, this.d);
   }

   public static awk a(akk $$0) {
      return new awk($$0, false, true);
   }

   public static awk b(akk $$0) {
      return new awk($$0, false, false);
   }

   public static awk c(akk $$0) {
      return new awk($$0, true, true);
   }

   public static awk d(akk $$0) {
      return new awk($$0, true, false);
   }

   public <T> boolean a(awk.a<T> $$0, Consumer<T> $$1) {
      if (this.d) {
         Collection<T> $$2 = $$0.b(this.c);
         if ($$2 == null) {
            return !this.e;
         }

         $$2.forEach($$1);
      } else {
         T $$3 = $$0.a(this.c);
         if ($$3 == null) {
            return !this.e;
         }

         $$1.accept($$3);
      }

      return true;
   }

   public void a(Consumer<akk> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<akk> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<akk> $$0, Predicate<akk> $$1) {
      return !this.e || (this.d ? $$1 : $$0).test(this.c);
   }

   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder();
      if (this.d) {
         $$0.append('#');
      }

      $$0.append(this.c);
      if (!this.e) {
         $$0.append('?');
      }

      return $$0.toString();
   }

   public interface a<T> {
      @Nullable
      T a(akk var1);

      @Nullable
      Collection<T> b(akk var1);
   }
}
