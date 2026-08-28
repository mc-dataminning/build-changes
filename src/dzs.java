import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dzs {
   Codec<dzs> a = Codec.xor(dzs.b.d, Codec.xor(dzs.a.d, dzs.c.d)).xmap(dzs::a, dzs::a);
   dzs b = b(0);
   dzs c = c(0);

   static dzs a(int $$0) {
      return new dzs.b($$0);
   }

   static dzs b(int $$0) {
      return new dzs.a($$0);
   }

   static dzs c(int $$0) {
      return new dzs.c($$0);
   }

   static dzs a() {
      return b;
   }

   static dzs b() {
      return c;
   }

   private static dzs a(Either<dzs.b, Either<dzs.a, dzs.c>> $$0) {
      return (dzs)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dzs.b, Either<dzs.a, dzs.c>> a(dzs $$0) {
      return $$0 instanceof dzs.b ? Either.left((dzs.b)$$0) : Either.right($$0 instanceof dzs.a ? Either.left((dzs.a)$$0) : Either.right((dzs.c)$$0));
   }

   int a(dzv var1);

   public static record a(int e) implements dzs {
      public static final Codec<dzs.a> d = Codec.intRange(dwy.e, dwy.d).fieldOf("above_bottom").xmap(dzs.a::new, dzs.a::c).codec();

      @Override
      public int a(dzv $$0) {
         return $$0.a() + this.e;
      }

      @Override
      public String toString() {
         return this.e + " above bottom";
      }

      public int c() {
         return this.e;
      }
   }

   public static record b(int e) implements dzs {
      public static final Codec<dzs.b> d = Codec.intRange(dwy.e, dwy.d).fieldOf("absolute").xmap(dzs.b::new, dzs.b::c).codec();

      @Override
      public int a(dzv $$0) {
         return this.e;
      }

      @Override
      public String toString() {
         return this.e + " absolute";
      }

      public int c() {
         return this.e;
      }
   }

   public static record c(int e) implements dzs {
      public static final Codec<dzs.c> d = Codec.intRange(dwy.e, dwy.d).fieldOf("below_top").xmap(dzs.c::new, dzs.c::c).codec();

      @Override
      public int a(dzv $$0) {
         return $$0.b() - 1 + $$0.a() - this.e;
      }

      @Override
      public String toString() {
         return this.e + " below top";
      }

      public int c() {
         return this.e;
      }
   }
}
