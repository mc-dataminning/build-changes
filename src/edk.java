import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface edk {
   Codec<edk> a = Codec.xor(edk.b.d, Codec.xor(edk.a.d, edk.c.d)).xmap(edk::a, edk::a);
   edk b = b(0);
   edk c = c(0);

   static edk a(int $$0) {
      return new edk.b($$0);
   }

   static edk b(int $$0) {
      return new edk.a($$0);
   }

   static edk c(int $$0) {
      return new edk.c($$0);
   }

   static edk a() {
      return b;
   }

   static edk b() {
      return c;
   }

   private static edk a(Either<edk.b, Either<edk.a, edk.c>> $$0) {
      return (edk)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<edk.b, Either<edk.a, edk.c>> a(edk $$0) {
      return $$0 instanceof edk.b ? Either.left((edk.b)$$0) : Either.right($$0 instanceof edk.a ? Either.left((edk.a)$$0) : Either.right((edk.c)$$0));
   }

   int a(edn var1);

   public static record a(int e) implements edk {
      public static final Codec<edk.a> d = Codec.intRange(eaq.e, eaq.d).fieldOf("above_bottom").xmap(edk.a::new, edk.a::c).codec();

      @Override
      public int a(edn $$0) {
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

   public static record b(int e) implements edk {
      public static final Codec<edk.b> d = Codec.intRange(eaq.e, eaq.d).fieldOf("absolute").xmap(edk.b::new, edk.b::c).codec();

      @Override
      public int a(edn $$0) {
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

   public static record c(int e) implements edk {
      public static final Codec<edk.c> d = Codec.intRange(eaq.e, eaq.d).fieldOf("below_top").xmap(edk.c::new, edk.c::c).codec();

      @Override
      public int a(edn $$0) {
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
