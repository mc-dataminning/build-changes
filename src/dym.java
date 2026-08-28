import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dym {
   Codec<dym> a = Codec.xor(dym.b.d, Codec.xor(dym.a.d, dym.c.d)).xmap(dym::a, dym::a);
   dym b = b(0);
   dym c = c(0);

   static dym a(int $$0) {
      return new dym.b($$0);
   }

   static dym b(int $$0) {
      return new dym.a($$0);
   }

   static dym c(int $$0) {
      return new dym.c($$0);
   }

   static dym a() {
      return b;
   }

   static dym b() {
      return c;
   }

   private static dym a(Either<dym.b, Either<dym.a, dym.c>> $$0) {
      return (dym)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dym.b, Either<dym.a, dym.c>> a(dym $$0) {
      return $$0 instanceof dym.b ? Either.left((dym.b)$$0) : Either.right($$0 instanceof dym.a ? Either.left((dym.a)$$0) : Either.right((dym.c)$$0));
   }

   int a(dyp var1);

   public static record a(int e) implements dym {
      public static final Codec<dym.a> d = Codec.intRange(dvs.e, dvs.d).fieldOf("above_bottom").xmap(dym.a::new, dym.a::c).codec();

      @Override
      public int a(dyp $$0) {
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

   public static record b(int e) implements dym {
      public static final Codec<dym.b> d = Codec.intRange(dvs.e, dvs.d).fieldOf("absolute").xmap(dym.b::new, dym.b::c).codec();

      @Override
      public int a(dyp $$0) {
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

   public static record c(int e) implements dym {
      public static final Codec<dym.c> d = Codec.intRange(dvs.e, dvs.d).fieldOf("below_top").xmap(dym.c::new, dym.c::c).codec();

      @Override
      public int a(dyp $$0) {
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
