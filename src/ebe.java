import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ebe {
   Codec<ebe> a = Codec.xor(ebe.b.d, Codec.xor(ebe.a.d, ebe.c.d)).xmap(ebe::a, ebe::a);
   ebe b = b(0);
   ebe c = c(0);

   static ebe a(int $$0) {
      return new ebe.b($$0);
   }

   static ebe b(int $$0) {
      return new ebe.a($$0);
   }

   static ebe c(int $$0) {
      return new ebe.c($$0);
   }

   static ebe a() {
      return b;
   }

   static ebe b() {
      return c;
   }

   private static ebe a(Either<ebe.b, Either<ebe.a, ebe.c>> $$0) {
      return (ebe)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ebe.b, Either<ebe.a, ebe.c>> a(ebe $$0) {
      return $$0 instanceof ebe.b ? Either.left((ebe.b)$$0) : Either.right($$0 instanceof ebe.a ? Either.left((ebe.a)$$0) : Either.right((ebe.c)$$0));
   }

   int a(ebh var1);

   public static record a(int e) implements ebe {
      public static final Codec<ebe.a> d = Codec.intRange(dyk.e, dyk.d).fieldOf("above_bottom").xmap(ebe.a::new, ebe.a::c).codec();

      @Override
      public int a(ebh $$0) {
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

   public static record b(int e) implements ebe {
      public static final Codec<ebe.b> d = Codec.intRange(dyk.e, dyk.d).fieldOf("absolute").xmap(ebe.b::new, ebe.b::c).codec();

      @Override
      public int a(ebh $$0) {
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

   public static record c(int e) implements ebe {
      public static final Codec<ebe.c> d = Codec.intRange(dyk.e, dyk.d).fieldOf("below_top").xmap(ebe.c::new, ebe.c::c).codec();

      @Override
      public int a(ebh $$0) {
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
