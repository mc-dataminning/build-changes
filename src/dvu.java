import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dvu {
   Codec<dvu> a = awu.a(dvu.b.d, awu.a(dvu.a.d, dvu.c.d)).xmap(dvu::a, dvu::a);
   dvu b = b(0);
   dvu c = c(0);

   static dvu a(int $$0) {
      return new dvu.b($$0);
   }

   static dvu b(int $$0) {
      return new dvu.a($$0);
   }

   static dvu c(int $$0) {
      return new dvu.c($$0);
   }

   static dvu a() {
      return b;
   }

   static dvu b() {
      return c;
   }

   private static dvu a(Either<dvu.b, Either<dvu.a, dvu.c>> $$0) {
      return (dvu)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dvu.b, Either<dvu.a, dvu.c>> a(dvu $$0) {
      return $$0 instanceof dvu.b ? Either.left((dvu.b)$$0) : Either.right($$0 instanceof dvu.a ? Either.left((dvu.a)$$0) : Either.right((dvu.c)$$0));
   }

   int a(dvx var1);

   public static record a(int e) implements dvu {
      public static final Codec<dvu.a> d = Codec.intRange(dta.e, dta.d).fieldOf("above_bottom").xmap(dvu.a::new, dvu.a::c).codec();

      @Override
      public int a(dvx $$0) {
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

   public static record b(int e) implements dvu {
      public static final Codec<dvu.b> d = Codec.intRange(dta.e, dta.d).fieldOf("absolute").xmap(dvu.b::new, dvu.b::c).codec();

      @Override
      public int a(dvx $$0) {
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

   public static record c(int e) implements dvu {
      public static final Codec<dvu.c> d = Codec.intRange(dta.e, dta.d).fieldOf("below_top").xmap(dvu.c::new, dvu.c::c).codec();

      @Override
      public int a(dvx $$0) {
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
