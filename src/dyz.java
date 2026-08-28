import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyz {
   Codec<dyz> a = Codec.xor(dyz.b.d, Codec.xor(dyz.a.d, dyz.c.d)).xmap(dyz::a, dyz::a);
   dyz b = b(0);
   dyz c = c(0);

   static dyz a(int $$0) {
      return new dyz.b($$0);
   }

   static dyz b(int $$0) {
      return new dyz.a($$0);
   }

   static dyz c(int $$0) {
      return new dyz.c($$0);
   }

   static dyz a() {
      return b;
   }

   static dyz b() {
      return c;
   }

   private static dyz a(Either<dyz.b, Either<dyz.a, dyz.c>> $$0) {
      return (dyz)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyz.b, Either<dyz.a, dyz.c>> a(dyz $$0) {
      return $$0 instanceof dyz.b ? Either.left((dyz.b)$$0) : Either.right($$0 instanceof dyz.a ? Either.left((dyz.a)$$0) : Either.right((dyz.c)$$0));
   }

   int a(dzc var1);

   public static record a(int e) implements dyz {
      public static final Codec<dyz.a> d = Codec.intRange(dwf.e, dwf.d).fieldOf("above_bottom").xmap(dyz.a::new, dyz.a::c).codec();

      @Override
      public int a(dzc $$0) {
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

   public static record b(int e) implements dyz {
      public static final Codec<dyz.b> d = Codec.intRange(dwf.e, dwf.d).fieldOf("absolute").xmap(dyz.b::new, dyz.b::c).codec();

      @Override
      public int a(dzc $$0) {
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

   public static record c(int e) implements dyz {
      public static final Codec<dyz.c> d = Codec.intRange(dwf.e, dwf.d).fieldOf("below_top").xmap(dyz.c::new, dyz.c::c).codec();

      @Override
      public int a(dzc $$0) {
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
