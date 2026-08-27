import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dnq {
   Codec<dnq> a = asy.a(dnq.b.d, asy.a(dnq.a.d, dnq.c.d)).xmap(dnq::a, dnq::a);
   dnq b = b(0);
   dnq c = c(0);

   static dnq a(int $$0) {
      return new dnq.b($$0);
   }

   static dnq b(int $$0) {
      return new dnq.a($$0);
   }

   static dnq c(int $$0) {
      return new dnq.c($$0);
   }

   static dnq a() {
      return b;
   }

   static dnq b() {
      return c;
   }

   private static dnq a(Either<dnq.b, Either<dnq.a, dnq.c>> $$0) {
      return (dnq)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dnq.b, Either<dnq.a, dnq.c>> a(dnq $$0) {
      return $$0 instanceof dnq.b ? Either.left((dnq.b)$$0) : Either.right($$0 instanceof dnq.a ? Either.left((dnq.a)$$0) : Either.right((dnq.c)$$0));
   }

   int a(dnt var1);

   public static record a(int e) implements dnq {
      public static final Codec<dnq.a> d = Codec.intRange(dkw.e, dkw.d).fieldOf("above_bottom").xmap(dnq.a::new, dnq.a::c).codec();

      @Override
      public int a(dnt $$0) {
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

   public static record b(int e) implements dnq {
      public static final Codec<dnq.b> d = Codec.intRange(dkw.e, dkw.d).fieldOf("absolute").xmap(dnq.b::new, dnq.b::c).codec();

      @Override
      public int a(dnt $$0) {
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

   public static record c(int e) implements dnq {
      public static final Codec<dnq.c> d = Codec.intRange(dkw.e, dkw.d).fieldOf("below_top").xmap(dnq.c::new, dnq.c::c).codec();

      @Override
      public int a(dnt $$0) {
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
