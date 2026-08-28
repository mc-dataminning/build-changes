import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eej {
   Codec<eej> a = Codec.xor(eej.b.d, Codec.xor(eej.a.d, eej.c.d)).xmap(eej::a, eej::a);
   eej b = b(0);
   eej c = c(0);

   static eej a(int $$0) {
      return new eej.b($$0);
   }

   static eej b(int $$0) {
      return new eej.a($$0);
   }

   static eej c(int $$0) {
      return new eej.c($$0);
   }

   static eej a() {
      return b;
   }

   static eej b() {
      return c;
   }

   private static eej a(Either<eej.b, Either<eej.a, eej.c>> $$0) {
      return (eej)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eej.b, Either<eej.a, eej.c>> a(eej $$0) {
      return $$0 instanceof eej.b ? Either.left((eej.b)$$0) : Either.right($$0 instanceof eej.a ? Either.left((eej.a)$$0) : Either.right((eej.c)$$0));
   }

   int a(eem var1);

   public static record a(int e) implements eej {
      public static final Codec<eej.a> d = Codec.intRange(ebp.e, ebp.d).fieldOf("above_bottom").xmap(eej.a::new, eej.a::c).codec();

      @Override
      public int a(eem $$0) {
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

   public static record b(int e) implements eej {
      public static final Codec<eej.b> d = Codec.intRange(ebp.e, ebp.d).fieldOf("absolute").xmap(eej.b::new, eej.b::c).codec();

      @Override
      public int a(eem $$0) {
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

   public static record c(int e) implements eej {
      public static final Codec<eej.c> d = Codec.intRange(ebp.e, ebp.d).fieldOf("below_top").xmap(eej.c::new, eej.c::c).codec();

      @Override
      public int a(eem $$0) {
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
