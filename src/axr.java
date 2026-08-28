import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axr {
   private static final Codec<axr> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayw.t.fieldOf("id").forGetter(axr::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axr::new)
   );
   public static final Codec<axr> a = Codec.either(ayw.t, b)
      .xmap($$0 -> (axr)$$0.map($$0x -> new axr($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final ali c;
   private final boolean d;
   private final boolean e;

   private axr(ali $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axr(ayw.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private ayw.d a() {
      return new ayw.d(this.c, this.d);
   }

   public static axr a(ali $$0) {
      return new axr($$0, false, true);
   }

   public static axr b(ali $$0) {
      return new axr($$0, false, false);
   }

   public static axr c(ali $$0) {
      return new axr($$0, true, true);
   }

   public static axr d(ali $$0) {
      return new axr($$0, true, false);
   }

   public <T> boolean a(axr.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<ali> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<ali> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<ali> $$0, Predicate<ali> $$1) {
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
      T a(ali var1, boolean var2);

      @Nullable
      Collection<T> a(ali var1);
   }
}
