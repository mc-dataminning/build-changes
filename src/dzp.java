import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dzp {
   Codec<dzp> a = Codec.xor(dzp.b.d, Codec.xor(dzp.a.d, dzp.c.d)).xmap(dzp::a, dzp::a);
   dzp b = b(0);
   dzp c = c(0);

   static dzp a(int $$0) {
      return new dzp.b($$0);
   }

   static dzp b(int $$0) {
      return new dzp.a($$0);
   }

   static dzp c(int $$0) {
      return new dzp.c($$0);
   }

   static dzp a() {
      return b;
   }

   static dzp b() {
      return c;
   }

   private static dzp a(Either<dzp.b, Either<dzp.a, dzp.c>> $$0) {
      return (dzp)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dzp.b, Either<dzp.a, dzp.c>> a(dzp $$0) {
      return $$0 instanceof dzp.b ? Either.left((dzp.b)$$0) : Either.right($$0 instanceof dzp.a ? Either.left((dzp.a)$$0) : Either.right((dzp.c)$$0));
   }

   int a(dzs var1);

   public static record a(int e) implements dzp {
      public static final Codec<dzp.a> d = Codec.intRange(dwv.e, dwv.d).fieldOf("above_bottom").xmap(dzp.a::new, dzp.a::c).codec();

      @Override
      public int a(dzs $$0) {
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

   public static record b(int e) implements dzp {
      public static final Codec<dzp.b> d = Codec.intRange(dwv.e, dwv.d).fieldOf("absolute").xmap(dzp.b::new, dzp.b::c).codec();

      @Override
      public int a(dzs $$0) {
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

   public static record c(int e) implements dzp {
      public static final Codec<dzp.c> d = Codec.intRange(dwv.e, dwv.d).fieldOf("below_top").xmap(dzp.c::new, dzp.c::c).codec();

      @Override
      public int a(dzs $$0) {
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
