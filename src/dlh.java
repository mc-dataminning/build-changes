import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlh {
   Codec<dlh> a = arb.a(dlh.b.d, arb.a(dlh.a.d, dlh.c.d)).xmap(dlh::a, dlh::a);
   dlh b = b(0);
   dlh c = c(0);

   static dlh a(int $$0) {
      return new dlh.b($$0);
   }

   static dlh b(int $$0) {
      return new dlh.a($$0);
   }

   static dlh c(int $$0) {
      return new dlh.c($$0);
   }

   static dlh a() {
      return b;
   }

   static dlh b() {
      return c;
   }

   private static dlh a(Either<dlh.b, Either<dlh.a, dlh.c>> $$0) {
      return (dlh)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlh.b, Either<dlh.a, dlh.c>> a(dlh $$0) {
      return $$0 instanceof dlh.b ? Either.left((dlh.b)$$0) : Either.right($$0 instanceof dlh.a ? Either.left((dlh.a)$$0) : Either.right((dlh.c)$$0));
   }

   int a(dlk var1);

   public static record a(int e) implements dlh {
      public static final Codec<dlh.a> d = Codec.intRange(din.e, din.d).fieldOf("above_bottom").xmap(dlh.a::new, dlh.a::c).codec();

      @Override
      public int a(dlk $$0) {
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

   public static record b(int e) implements dlh {
      public static final Codec<dlh.b> d = Codec.intRange(din.e, din.d).fieldOf("absolute").xmap(dlh.b::new, dlh.b::c).codec();

      @Override
      public int a(dlk $$0) {
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

   public static record c(int e) implements dlh {
      public static final Codec<dlh.c> d = Codec.intRange(din.e, din.d).fieldOf("below_top").xmap(dlh.c::new, dlh.c::c).codec();

      @Override
      public int a(dlk $$0) {
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
