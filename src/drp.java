import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface drp {
   Codec<drp> a = avq.a(drp.b.d, avq.a(drp.a.d, drp.c.d)).xmap(drp::a, drp::a);
   drp b = b(0);
   drp c = c(0);

   static drp a(int $$0) {
      return new drp.b($$0);
   }

   static drp b(int $$0) {
      return new drp.a($$0);
   }

   static drp c(int $$0) {
      return new drp.c($$0);
   }

   static drp a() {
      return b;
   }

   static drp b() {
      return c;
   }

   private static drp a(Either<drp.b, Either<drp.a, drp.c>> $$0) {
      return (drp)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<drp.b, Either<drp.a, drp.c>> a(drp $$0) {
      return $$0 instanceof drp.b ? Either.left((drp.b)$$0) : Either.right($$0 instanceof drp.a ? Either.left((drp.a)$$0) : Either.right((drp.c)$$0));
   }

   int a(drs var1);

   public static record a(int e) implements drp {
      public static final Codec<drp.a> d = Codec.intRange(dov.e, dov.d).fieldOf("above_bottom").xmap(drp.a::new, drp.a::c).codec();

      @Override
      public int a(drs $$0) {
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

   public static record b(int e) implements drp {
      public static final Codec<drp.b> d = Codec.intRange(dov.e, dov.d).fieldOf("absolute").xmap(drp.b::new, drp.b::c).codec();

      @Override
      public int a(drs $$0) {
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

   public static record c(int e) implements drp {
      public static final Codec<drp.c> d = Codec.intRange(dov.e, dov.d).fieldOf("below_top").xmap(drp.c::new, drp.c::c).codec();

      @Override
      public int a(drs $$0) {
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
