import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Collection;
import java.util.function.Consumer;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class apy {
   private static final Codec<apy> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(aqy.o.fieldOf("id").forGetter(apy::a), Codec.BOOL.optionalFieldOf("required", true).forGetter($$0x -> $$0x.e)).apply($$0, apy::new)
   );
   public static final Codec<apy> a = Codec.either(aqy.o, b)
      .xmap($$0 -> (apy)$$0.map($$0x -> new apy($$0x, true), $$0x -> $$0x), $$0 -> $$0.e ? Either.left($$0.a()) : Either.right($$0));
   private final aer c;
   private final boolean d;
   private final boolean e;

   private apy(aer $$0, boolean $$1, boolean $$2) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
   }

   private apy(aqy.e $$0, boolean $$1) {
      this.c = $$0.a();
      this.d = $$0.b();
      this.e = $$1;
   }

   private aqy.e a() {
      return new aqy.e(this.c, this.d);
   }

   public static apy a(aer $$0) {
      return new apy($$0, false, true);
   }

   public static apy b(aer $$0) {
      return new apy($$0, false, false);
   }

   public static apy c(aer $$0) {
      return new apy($$0, true, true);
   }

   public static apy d(aer $$0) {
      return new apy($$0, true, false);
   }

   public <T> boolean a(apy.a<T> $$0, Consumer<T> $$1) {
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

   public void a(Consumer<aer> $$0) {
      if (this.d && this.e) {
         $$0.accept(this.c);
      }
   }

   public void b(Consumer<aer> $$0) {
      if (this.d && !this.e) {
         $$0.accept(this.c);
      }
   }

   public boolean a(Predicate<aer> $$0, Predicate<aer> $$1) {
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
      T a(aer var1);

      @Nullable
      Collection<T> b(aer var1);
   }
}
