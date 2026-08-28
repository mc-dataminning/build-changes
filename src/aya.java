import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class aya {
   private static final Codec<aya> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(azg.t.fieldOf("id").forGetter(aya::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, aya::new)
   );
   public static final Codec<aya> a = Codec.either(azg.t, b)
      .xmap($$0 -> (aya)$$0.map($$0x -> new aya($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final alr c;
   private final boolean d;
   private final boolean e;

   private aya(alr $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private aya(azg.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private azg.d a() {
      return new azg.d(this.c, this.d);
   }

   public static aya a(alr $$0) {
      return new aya($$0, false, true);
   }

   public static aya b(alr $$0) {
      return new aya($$0, false, false);
   }

   public static aya c(alr $$0) {
      return new aya($$0, true, true);
   }

   public static aya d(alr $$0) {
      return new aya($$0, true, false);
   }

   public <T> boolean a(aya.a<T> $$0, Consumer<T> $$1) {
      if (this.d) {
         Collection<T> $$2 = $$0.a(this.c);
         if ($$2 == null) {
            return !this.e;
         }

         $$2.forEach($$1);
      } else {
         T $$3 = $$0.a(this.c, this.e);
         if ($$3 == null) {
            return !this.e;
         }

         $$1.accept($$3);
      }

      return true;
   }

   public void a(Consumer<alr> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<alr> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<alr> $$0, Predicate<alr> $$1) {
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
      T a(alr var1, boolean var2);

      @Nullable
      Collection<T> a(alr var1);
   }
}
