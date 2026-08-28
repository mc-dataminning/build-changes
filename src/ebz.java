import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ebz {
   Codec<ebz> a = Codec.xor(ebz.b.d, Codec.xor(ebz.a.d, ebz.c.d)).xmap(ebz::a, ebz::a);
   ebz b = b(0);
   ebz c = c(0);

   static ebz a(int $$0) {
      return new ebz.b($$0);
   }

   static ebz b(int $$0) {
      return new ebz.a($$0);
   }

   static ebz c(int $$0) {
      return new ebz.c($$0);
   }

   static ebz a() {
      return b;
   }

   static ebz b() {
      return c;
   }

   private static ebz a(Either<ebz.b, Either<ebz.a, ebz.c>> $$0) {
      return (ebz)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ebz.b, Either<ebz.a, ebz.c>> a(ebz $$0) {
      return $$0 instanceof ebz.b ? Either.left((ebz.b)$$0) : Either.right($$0 instanceof ebz.a ? Either.left((ebz.a)$$0) : Either.right((ebz.c)$$0));
   }

   int a(ecc var1);

   public static record a(int e) implements ebz {
      public static final Codec<ebz.a> d = Codec.intRange(dzf.e, dzf.d).fieldOf("above_bottom").xmap(ebz.a::new, ebz.a::c).codec();

      @Override
      public int a(ecc $$0) {
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

   public static record b(int e) implements ebz {
      public static final Codec<ebz.b> d = Codec.intRange(dzf.e, dzf.d).fieldOf("absolute").xmap(ebz.b::new, ebz.b::c).codec();

      @Override
      public int a(ecc $$0) {
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

   public static record c(int e) implements ebz {
      public static final Codec<ebz.c> d = Codec.intRange(dzf.e, dzf.d).fieldOf("below_top").xmap(ebz.c::new, ebz.c::c).codec();

      @Override
      public int a(ecc $$0) {
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
