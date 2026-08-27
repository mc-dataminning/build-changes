import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dnl {
   Codec<dnl> a = asu.a(dnl.b.d, asu.a(dnl.a.d, dnl.c.d)).xmap(dnl::a, dnl::a);
   dnl b = b(0);
   dnl c = c(0);

   static dnl a(int $$0) {
      return new dnl.b($$0);
   }

   static dnl b(int $$0) {
      return new dnl.a($$0);
   }

   static dnl c(int $$0) {
      return new dnl.c($$0);
   }

   static dnl a() {
      return b;
   }

   static dnl b() {
      return c;
   }

   private static dnl a(Either<dnl.b, Either<dnl.a, dnl.c>> $$0) {
      return (dnl)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dnl.b, Either<dnl.a, dnl.c>> a(dnl $$0) {
      return $$0 instanceof dnl.b ? Either.left((dnl.b)$$0) : Either.right($$0 instanceof dnl.a ? Either.left((dnl.a)$$0) : Either.right((dnl.c)$$0));
   }

   int a(dno var1);

   public static record a(int e) implements dnl {
      public static final Codec<dnl.a> d = Codec.intRange(dkr.e, dkr.d).fieldOf("above_bottom").xmap(dnl.a::new, dnl.a::c).codec();

      @Override
      public int a(dno $$0) {
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

   public static record b(int e) implements dnl {
      public static final Codec<dnl.b> d = Codec.intRange(dkr.e, dkr.d).fieldOf("absolute").xmap(dnl.b::new, dnl.b::c).codec();

      @Override
      public int a(dno $$0) {
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

   public static record c(int e) implements dnl {
      public static final Codec<dnl.c> d = Codec.intRange(dkr.e, dkr.d).fieldOf("below_top").xmap(dnl.c::new, dnl.c::c).codec();

      @Override
      public int a(dno $$0) {
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
