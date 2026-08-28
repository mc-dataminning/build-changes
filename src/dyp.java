import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyp {
   Codec<dyp> a = Codec.xor(dyp.b.d, Codec.xor(dyp.a.d, dyp.c.d)).xmap(dyp::a, dyp::a);
   dyp b = b(0);
   dyp c = c(0);

   static dyp a(int $$0) {
      return new dyp.b($$0);
   }

   static dyp b(int $$0) {
      return new dyp.a($$0);
   }

   static dyp c(int $$0) {
      return new dyp.c($$0);
   }

   static dyp a() {
      return b;
   }

   static dyp b() {
      return c;
   }

   private static dyp a(Either<dyp.b, Either<dyp.a, dyp.c>> $$0) {
      return (dyp)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyp.b, Either<dyp.a, dyp.c>> a(dyp $$0) {
      return $$0 instanceof dyp.b ? Either.left((dyp.b)$$0) : Either.right($$0 instanceof dyp.a ? Either.left((dyp.a)$$0) : Either.right((dyp.c)$$0));
   }

   int a(dys var1);

   public static record a(int e) implements dyp {
      public static final Codec<dyp.a> d = Codec.intRange(dvv.e, dvv.d).fieldOf("above_bottom").xmap(dyp.a::new, dyp.a::c).codec();

      @Override
      public int a(dys $$0) {
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

   public static record b(int e) implements dyp {
      public static final Codec<dyp.b> d = Codec.intRange(dvv.e, dvv.d).fieldOf("absolute").xmap(dyp.b::new, dyp.b::c).codec();

      @Override
      public int a(dys $$0) {
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

   public static record c(int e) implements dyp {
      public static final Codec<dyp.c> d = Codec.intRange(dvv.e, dvv.d).fieldOf("below_top").xmap(dyp.c::new, dyp.c::c).codec();

      @Override
      public int a(dys $$0) {
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
