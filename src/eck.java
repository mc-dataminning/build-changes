import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eck {
   Codec<eck> a = Codec.xor(eck.b.d, Codec.xor(eck.a.d, eck.c.d)).xmap(eck::a, eck::a);
   eck b = b(0);
   eck c = c(0);

   static eck a(int $$0) {
      return new eck.b($$0);
   }

   static eck b(int $$0) {
      return new eck.a($$0);
   }

   static eck c(int $$0) {
      return new eck.c($$0);
   }

   static eck a() {
      return b;
   }

   static eck b() {
      return c;
   }

   private static eck a(Either<eck.b, Either<eck.a, eck.c>> $$0) {
      return (eck)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eck.b, Either<eck.a, eck.c>> a(eck $$0) {
      return $$0 instanceof eck.b ? Either.left((eck.b)$$0) : Either.right($$0 instanceof eck.a ? Either.left((eck.a)$$0) : Either.right((eck.c)$$0));
   }

   int a(ecn var1);

   public static record a(int e) implements eck {
      public static final Codec<eck.a> d = Codec.intRange(dzq.e, dzq.d).fieldOf("above_bottom").xmap(eck.a::new, eck.a::c).codec();

      @Override
      public int a(ecn $$0) {
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

   public static record b(int e) implements eck {
      public static final Codec<eck.b> d = Codec.intRange(dzq.e, dzq.d).fieldOf("absolute").xmap(eck.b::new, eck.b::c).codec();

      @Override
      public int a(ecn $$0) {
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

   public static record c(int e) implements eck {
      public static final Codec<eck.c> d = Codec.intRange(dzq.e, dzq.d).fieldOf("below_top").xmap(eck.c::new, eck.c::c).codec();

      @Override
      public int a(ecn $$0) {
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
