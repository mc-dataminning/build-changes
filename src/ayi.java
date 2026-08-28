import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class ayi {
   private static final Codec<ayi> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(azn.t.fieldOf("id").forGetter(ayi::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, ayi::new)
   );
   public static final Codec<ayi> a = Codec.either(azn.t, b)
      .xmap($$0 -> (ayi)$$0.map($$0x -> new ayi($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final alz c;
   private final boolean d;
   private final boolean e;

   private ayi(alz $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private ayi(azn.c $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private azn.c a() {
      return new azn.c(this.c, this.d);
   }

   public static ayi a(alz $$0) {
      return new ayi($$0, false, true);
   }

   public static ayi b(alz $$0) {
      return new ayi($$0, false, false);
   }

   public static ayi c(alz $$0) {
      return new ayi($$0, true, true);
   }

   public static ayi d(alz $$0) {
      return new ayi($$0, true, false);
   }

   public <T> boolean a(ayi.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<alz> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<alz> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<alz> $$0, Predicate<alz> $$1) {
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
      T a(alz var1, boolean var2);

      @Nullable
      Collection<T> a(alz var1);
   }
}
