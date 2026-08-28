import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ebt {
   Codec<ebt> a = Codec.xor(ebt.b.d, Codec.xor(ebt.a.d, ebt.c.d)).xmap(ebt::a, ebt::a);
   ebt b = b(0);
   ebt c = c(0);

   static ebt a(int $$0) {
      return new ebt.b($$0);
   }

   static ebt b(int $$0) {
      return new ebt.a($$0);
   }

   static ebt c(int $$0) {
      return new ebt.c($$0);
   }

   static ebt a() {
      return b;
   }

   static ebt b() {
      return c;
   }

   private static ebt a(Either<ebt.b, Either<ebt.a, ebt.c>> $$0) {
      return (ebt)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ebt.b, Either<ebt.a, ebt.c>> a(ebt $$0) {
      return $$0 instanceof ebt.b ? Either.left((ebt.b)$$0) : Either.right($$0 instanceof ebt.a ? Either.left((ebt.a)$$0) : Either.right((ebt.c)$$0));
   }

   int a(ebw var1);

   public static record a(int e) implements ebt {
      public static final Codec<ebt.a> d = Codec.intRange(dyz.e, dyz.d).fieldOf("above_bottom").xmap(ebt.a::new, ebt.a::c).codec();

      @Override
      public int a(ebw $$0) {
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

   public static record b(int e) implements ebt {
      public static final Codec<ebt.b> d = Codec.intRange(dyz.e, dyz.d).fieldOf("absolute").xmap(ebt.b::new, ebt.b::c).codec();

      @Override
      public int a(ebw $$0) {
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

   public static record c(int e) implements ebt {
      public static final Codec<ebt.c> d = Codec.intRange(dyz.e, dyz.d).fieldOf("below_top").xmap(ebt.c::new, ebt.c::c).codec();

      @Override
      public int a(ebw $$0) {
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
