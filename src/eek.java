import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eek {
   Codec<eek> a = Codec.xor(eek.b.d, Codec.xor(eek.a.d, eek.c.d)).xmap(eek::a, eek::a);
   eek b = b(0);
   eek c = c(0);

   static eek a(int $$0) {
      return new eek.b($$0);
   }

   static eek b(int $$0) {
      return new eek.a($$0);
   }

   static eek c(int $$0) {
      return new eek.c($$0);
   }

   static eek a() {
      return b;
   }

   static eek b() {
      return c;
   }

   private static eek a(Either<eek.b, Either<eek.a, eek.c>> $$0) {
      return (eek)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eek.b, Either<eek.a, eek.c>> a(eek $$0) {
      return $$0 instanceof eek.b ? Either.left((eek.b)$$0) : Either.right($$0 instanceof eek.a ? Either.left((eek.a)$$0) : Either.right((eek.c)$$0));
   }

   int a(een var1);

   public static record a(int e) implements eek {
      public static final Codec<eek.a> d = Codec.intRange(ebq.e, ebq.d).fieldOf("above_bottom").xmap(eek.a::new, eek.a::c).codec();

      @Override
      public int a(een $$0) {
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

   public static record b(int e) implements eek {
      public static final Codec<eek.b> d = Codec.intRange(ebq.e, ebq.d).fieldOf("absolute").xmap(eek.b::new, eek.b::c).codec();

      @Override
      public int a(een $$0) {
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

   public static record c(int e) implements eek {
      public static final Codec<eek.c> d = Codec.intRange(ebq.e, ebq.d).fieldOf("below_top").xmap(eek.c::new, eek.c::c).codec();

      @Override
      public int a(een $$0) {
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
