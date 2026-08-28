import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyq {
   Codec<dyq> a = Codec.xor(dyq.b.d, Codec.xor(dyq.a.d, dyq.c.d)).xmap(dyq::a, dyq::a);
   dyq b = b(0);
   dyq c = c(0);

   static dyq a(int $$0) {
      return new dyq.b($$0);
   }

   static dyq b(int $$0) {
      return new dyq.a($$0);
   }

   static dyq c(int $$0) {
      return new dyq.c($$0);
   }

   static dyq a() {
      return b;
   }

   static dyq b() {
      return c;
   }

   private static dyq a(Either<dyq.b, Either<dyq.a, dyq.c>> $$0) {
      return (dyq)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyq.b, Either<dyq.a, dyq.c>> a(dyq $$0) {
      return $$0 instanceof dyq.b ? Either.left((dyq.b)$$0) : Either.right($$0 instanceof dyq.a ? Either.left((dyq.a)$$0) : Either.right((dyq.c)$$0));
   }

   int a(dyt var1);

   public static record a(int e) implements dyq {
      public static final Codec<dyq.a> d = Codec.intRange(dvw.e, dvw.d).fieldOf("above_bottom").xmap(dyq.a::new, dyq.a::c).codec();

      @Override
      public int a(dyt $$0) {
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

   public static record b(int e) implements dyq {
      public static final Codec<dyq.b> d = Codec.intRange(dvw.e, dvw.d).fieldOf("absolute").xmap(dyq.b::new, dyq.b::c).codec();

      @Override
      public int a(dyt $$0) {
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

   public static record c(int e) implements dyq {
      public static final Codec<dyq.c> d = Codec.intRange(dvw.e, dvw.d).fieldOf("below_top").xmap(dyq.c::new, dyq.c::c).codec();

      @Override
      public int a(dyt $$0) {
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
