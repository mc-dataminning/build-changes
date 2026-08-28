import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axd {
   private static final Codec<axd> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(ayi.t.fieldOf("id").forGetter(axd::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axd::new)
   );
   public static final Codec<axd> a = Codec.either(ayi.t, b)
      .xmap($$0 -> (axd)$$0.map($$0x -> new axd($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final akv c;
   private final boolean d;
   private final boolean e;

   private axd(akv $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axd(ayi.d $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private ayi.d a() {
      return new ayi.d(this.c, this.d);
   }

   public static axd a(akv $$0) {
      return new axd($$0, false, true);
   }

   public static axd b(akv $$0) {
      return new axd($$0, false, false);
   }

   public static axd c(akv $$0) {
      return new axd($$0, true, true);
   }

   public static axd d(akv $$0) {
      return new axd($$0, true, false);
   }

   public <T> boolean a(axd.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<akv> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<akv> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<akv> $$0, Predicate<akv> $$1) {
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
      T a(akv var1, boolean var2);

      @Nullable
      Collection<T> a(akv var1);
   }
}
