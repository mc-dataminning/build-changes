import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface die {
   Codec<die> a = aoi.a(die.b.d, aoi.a(die.a.d, die.c.d)).xmap(die::a, die::a);
   die b = b(0);
   die c = c(0);

   static die a(int $$0) {
      return new die.b($$0);
   }

   static die b(int $$0) {
      return new die.a($$0);
   }

   static die c(int $$0) {
      return new die.c($$0);
   }

   static die a() {
      return b;
   }

   static die b() {
      return c;
   }

   private static die a(Either<die.b, Either<die.a, die.c>> $$0) {
      return (die)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<die.b, Either<die.a, die.c>> a(die $$0) {
      return $$0 instanceof die.b ? Either.left((die.b)$$0) : Either.right($$0 instanceof die.a ? Either.left((die.a)$$0) : Either.right((die.c)$$0));
   }

   int a(dih var1);

   public static record a(int e) implements die {
      public static final Codec<die.a> d = Codec.intRange(dfk.e, dfk.d).fieldOf("above_bottom").xmap(die.a::new, die.a::c).codec();

      @Override
      public int a(dih $$0) {
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

   public static record b(int e) implements die {
      public static final Codec<die.b> d = Codec.intRange(dfk.e, dfk.d).fieldOf("absolute").xmap(die.b::new, die.b::c).codec();

      @Override
      public int a(dih $$0) {
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

   public static record c(int e) implements die {
      public static final Codec<die.c> d = Codec.intRange(dfk.e, dfk.d).fieldOf("below_top").xmap(die.c::new, die.c::c).codec();

      @Override
      public int a(dih $$0) {
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
