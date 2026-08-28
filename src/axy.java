import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class axy {
   private static final Codec<axy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(azd.t.fieldOf("id").forGetter(axy::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, axy::new)
   );
   public static final Codec<axy> a = Codec.either(azd.t, b)
      .xmap($$0 -> (axy)$$0.map($$0x -> new axy($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final alp c;
   private final boolean d;
   private final boolean e;

   private axy(alp $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private axy(azd.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private azd.c a() {
      return new azd.c(this.c, this.d);
   }

   public static axy a(alp $$0) {
      return new axy($$0, false, true);
   }

   public static axy b(alp $$0) {
      return new axy($$0, false, false);
   }

   public static axy c(alp $$0) {
      return new axy($$0, true, true);
   }

   public static axy d(alp $$0) {
      return new axy($$0, true, false);
   }

   public <T> boolean a(axy.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<alp> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<alp> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<alp> $$0, Predicate<alp> $$1) {
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
      T a(alp var1, boolean var2);

      @Nullable
      Collection<T> a(alp var1);
   }
}
