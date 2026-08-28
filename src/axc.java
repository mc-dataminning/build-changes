import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axc {
   private static final Codec<axc> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayg.r.fieldOf("id").forGetter(axc::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axc::new)
   );
   public static final Codec<axc> a = Codec.either(ayg.r, b)
      .xmap($$0 -> (axc)$$0.map($$0x -> new axc($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final ale c;
   private final boolean d;
   private final boolean e;

   private axc(ale $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axc(ayg.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private ayg.c a() {
      return new ayg.c(this.c, this.d);
   }

   public static axc a(ale $$0) {
      return new axc($$0, false, true);
   }

   public static axc b(ale $$0) {
      return new axc($$0, false, false);
   }

   public static axc c(ale $$0) {
      return new axc($$0, true, true);
   }

   public static axc d(ale $$0) {
      return new axc($$0, true, false);
   }

   public <T> boolean a(axc.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<ale> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<ale> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<ale> $$0, Predicate<ale> $$1) {
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
      T a(ale var1);

      @Nullable
      Collection<T> b(ale var1);
   }
}
