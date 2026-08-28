import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface egs {
   Codec<egs> a = Codec.xor(egs.b.d, Codec.xor(egs.a.d, egs.c.d)).xmap(egs::a, egs::a);
   egs b = b(0);
   egs c = c(0);

   static egs a(int $$0) {
      return new egs.b($$0);
   }

   static egs b(int $$0) {
      return new egs.a($$0);
   }

   static egs c(int $$0) {
      return new egs.c($$0);
   }

   static egs a() {
      return b;
   }

   static egs b() {
      return c;
   }

   private static egs a(Either<egs.b, Either<egs.a, egs.c>> $$0) {
      return (egs)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<egs.b, Either<egs.a, egs.c>> a(egs $$0) {
      return $$0 instanceof egs.b ? Either.left((egs.b)$$0) : Either.right($$0 instanceof egs.a ? Either.left((egs.a)$$0) : Either.right((egs.c)$$0));
   }

   int a(egv var1);

   public static record a(int e) implements egs {
      public static final Codec<egs.a> d = Codec.intRange(edw.e, edw.d).fieldOf("above_bottom").xmap(egs.a::new, egs.a::c).codec();

      @Override
      public int a(egv $$0) {
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

   public static record b(int e) implements egs {
      public static final Codec<egs.b> d = Codec.intRange(edw.e, edw.d).fieldOf("absolute").xmap(egs.b::new, egs.b::c).codec();

      @Override
      public int a(egv $$0) {
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

   public static record c(int e) implements egs {
      public static final Codec<egs.c> d = Codec.intRange(edw.e, edw.d).fieldOf("below_top").xmap(egs.c::new, egs.c::c).codec();

      @Override
      public int a(egv $$0) {
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
