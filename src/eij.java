import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eij {
   Codec<eij> a = Codec.xor(eij.b.d, Codec.xor(eij.a.d, eij.c.d)).xmap(eij::a, eij::a);
   eij b = b(0);
   eij c = c(0);

   static eij a(int $$0) {
      return new eij.b($$0);
   }

   static eij b(int $$0) {
      return new eij.a($$0);
   }

   static eij c(int $$0) {
      return new eij.c($$0);
   }

   static eij a() {
      return b;
   }

   static eij b() {
      return c;
   }

   private static eij a(Either<eij.b, Either<eij.a, eij.c>> $$0) {
      return (eij)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eij.b, Either<eij.a, eij.c>> a(eij $$0) {
      return $$0 instanceof eij.b ? Either.left((eij.b)$$0) : Either.right($$0 instanceof eij.a ? Either.left((eij.a)$$0) : Either.right((eij.c)$$0));
   }

   int a(eim var1);

   public static record a(int e) implements eij {
      public static final Codec<eij.a> d = Codec.intRange(efn.e, efn.d).fieldOf("above_bottom").xmap(eij.a::new, eij.a::c).codec();

      @Override
      public int a(eim $$0) {
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

   public static record b(int e) implements eij {
      public static final Codec<eij.b> d = Codec.intRange(efn.e, efn.d).fieldOf("absolute").xmap(eij.b::new, eij.b::c).codec();

      @Override
      public int a(eim $$0) {
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

   public static record c(int e) implements eij {
      public static final Codec<eij.c> d = Codec.intRange(efn.e, efn.d).fieldOf("below_top").xmap(eij.c::new, eij.c::c).codec();

      @Override
      public int a(eim $$0) {
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
