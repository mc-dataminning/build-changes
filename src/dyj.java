import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyj {
   Codec<dyj> a = Codec.xor(dyj.b.d, Codec.xor(dyj.a.d, dyj.c.d)).xmap(dyj::a, dyj::a);
   dyj b = b(0);
   dyj c = c(0);

   static dyj a(int $$0) {
      return new dyj.b($$0);
   }

   static dyj b(int $$0) {
      return new dyj.a($$0);
   }

   static dyj c(int $$0) {
      return new dyj.c($$0);
   }

   static dyj a() {
      return b;
   }

   static dyj b() {
      return c;
   }

   private static dyj a(Either<dyj.b, Either<dyj.a, dyj.c>> $$0) {
      return (dyj)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyj.b, Either<dyj.a, dyj.c>> a(dyj $$0) {
      return $$0 instanceof dyj.b ? Either.left((dyj.b)$$0) : Either.right($$0 instanceof dyj.a ? Either.left((dyj.a)$$0) : Either.right((dyj.c)$$0));
   }

   int a(dym var1);

   public static record a(int e) implements dyj {
      public static final Codec<dyj.a> d = Codec.intRange(dvp.e, dvp.d).fieldOf("above_bottom").xmap(dyj.a::new, dyj.a::c).codec();

      @Override
      public int a(dym $$0) {
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

   public static record b(int e) implements dyj {
      public static final Codec<dyj.b> d = Codec.intRange(dvp.e, dvp.d).fieldOf("absolute").xmap(dyj.b::new, dyj.b::c).codec();

      @Override
      public int a(dym $$0) {
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

   public static record c(int e) implements dyj {
      public static final Codec<dyj.c> d = Codec.intRange(dvp.e, dvp.d).fieldOf("below_top").xmap(dyj.c::new, dyj.c::c).codec();

      @Override
      public int a(dym $$0) {
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
