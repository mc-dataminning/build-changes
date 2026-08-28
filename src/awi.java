import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class awi {
   private static final Codec<awi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(axm.r.fieldOf("id").forGetter(awi::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, awi::new)
   );
   public static final Codec<awi> a = Codec.either(axm.r, b)
      .xmap($$0 -> (awi)$$0.map($$0x -> new awi($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final akk c;
   private final boolean d;
   private final boolean e;

   private awi(akk $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private awi(axm.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private axm.c a() {
      return new axm.c(this.c, this.d);
   }

   public static awi a(akk $$0) {
      return new awi($$0, false, true);
   }

   public static awi b(akk $$0) {
      return new awi($$0, false, false);
   }

   public static awi c(akk $$0) {
      return new awi($$0, true, true);
   }

   public static awi d(akk $$0) {
      return new awi($$0, true, false);
   }

   public <T> boolean a(awi.a<T> $$0, Consumer<T> $$1) {
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
