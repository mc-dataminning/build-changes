import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface egh {
   Codec<egh> a = Codec.xor(egh.b.d, Codec.xor(egh.a.d, egh.c.d)).xmap(egh::a, egh::a);
   egh b = b(0);
   egh c = c(0);

   static egh a(int $$0) {
      return new egh.b($$0);
   }

   static egh b(int $$0) {
      return new egh.a($$0);
   }

   static egh c(int $$0) {
      return new egh.c($$0);
   }

   static egh a() {
      return b;
   }

   static egh b() {
      return c;
   }

   private static egh a(Either<egh.b, Either<egh.a, egh.c>> $$0) {
      return (egh)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<egh.b, Either<egh.a, egh.c>> a(egh $$0) {
      return $$0 instanceof egh.b ? Either.left((egh.b)$$0) : Either.right($$0 instanceof egh.a ? Either.left((egh.a)$$0) : Either.right((egh.c)$$0));
   }

   int a(egk var1);

   public static record a(int e) implements egh {
      public static final Codec<egh.a> d = Codec.intRange(edl.e, edl.d).fieldOf("above_bottom").xmap(egh.a::new, egh.a::c).codec();

      @Override
      public int a(egk $$0) {
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

   public static record b(int e) implements egh {
      public static final Codec<egh.b> d = Codec.intRange(edl.e, edl.d).fieldOf("absolute").xmap(egh.b::new, egh.b::c).codec();

      @Override
      public int a(egk $$0) {
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

   public static record c(int e) implements egh {
      public static final Codec<egh.c> d = Codec.intRange(edl.e, edl.d).fieldOf("below_top").xmap(egh.c::new, egh.c::c).codec();

      @Override
      public int a(egk $$0) {
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
