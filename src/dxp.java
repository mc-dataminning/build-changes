import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dxp {
   Codec<dxp> a = Codec.xor(dxp.b.d, Codec.xor(dxp.a.d, dxp.c.d)).xmap(dxp::a, dxp::a);
   dxp b = b(0);
   dxp c = c(0);

   static dxp a(int $$0) {
      return new dxp.b($$0);
   }

   static dxp b(int $$0) {
      return new dxp.a($$0);
   }

   static dxp c(int $$0) {
      return new dxp.c($$0);
   }

   static dxp a() {
      return b;
   }

   static dxp b() {
      return c;
   }

   private static dxp a(Either<dxp.b, Either<dxp.a, dxp.c>> $$0) {
      return (dxp)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dxp.b, Either<dxp.a, dxp.c>> a(dxp $$0) {
      return $$0 instanceof dxp.b ? Either.left((dxp.b)$$0) : Either.right($$0 instanceof dxp.a ? Either.left((dxp.a)$$0) : Either.right((dxp.c)$$0));
   }

   int a(dxs var1);

   public static record a(int e) implements dxp {
      public static final Codec<dxp.a> d = Codec.intRange(duv.e, duv.d).fieldOf("above_bottom").xmap(dxp.a::new, dxp.a::c).codec();

      @Override
      public int a(dxs $$0) {
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

   public static record b(int e) implements dxp {
      public static final Codec<dxp.b> d = Codec.intRange(duv.e, duv.d).fieldOf("absolute").xmap(dxp.b::new, dxp.b::c).codec();

      @Override
      public int a(dxs $$0) {
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

   public static record c(int e) implements dxp {
      public static final Codec<dxp.c> d = Codec.intRange(duv.e, duv.d).fieldOf("below_top").xmap(dxp.c::new, dxp.c::c).codec();

      @Override
      public int a(dxs $$0) {
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
