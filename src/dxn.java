import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dxn {
   Codec<dxn> a = Codec.xor(dxn.b.d, Codec.xor(dxn.a.d, dxn.c.d)).xmap(dxn::a, dxn::a);
   dxn b = b(0);
   dxn c = c(0);

   static dxn a(int $$0) {
      return new dxn.b($$0);
   }

   static dxn b(int $$0) {
      return new dxn.a($$0);
   }

   static dxn c(int $$0) {
      return new dxn.c($$0);
   }

   static dxn a() {
      return b;
   }

   static dxn b() {
      return c;
   }

   private static dxn a(Either<dxn.b, Either<dxn.a, dxn.c>> $$0) {
      return (dxn)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dxn.b, Either<dxn.a, dxn.c>> a(dxn $$0) {
      return $$0 instanceof dxn.b ? Either.left((dxn.b)$$0) : Either.right($$0 instanceof dxn.a ? Either.left((dxn.a)$$0) : Either.right((dxn.c)$$0));
   }

   int a(dxq var1);

   public static record a(int e) implements dxn {
      public static final Codec<dxn.a> d = Codec.intRange(dut.e, dut.d).fieldOf("above_bottom").xmap(dxn.a::new, dxn.a::c).codec();

      @Override
      public int a(dxq $$0) {
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

   public static record b(int e) implements dxn {
      public static final Codec<dxn.b> d = Codec.intRange(dut.e, dut.d).fieldOf("absolute").xmap(dxn.b::new, dxn.b::c).codec();

      @Override
      public int a(dxq $$0) {
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

   public static record c(int e) implements dxn {
      public static final Codec<dxn.c> d = Codec.intRange(dut.e, dut.d).fieldOf("below_top").xmap(dxn.c::new, dxn.c::c).codec();

      @Override
      public int a(dxq $$0) {
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
