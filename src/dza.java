import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dza {
   Codec<dza> a = Codec.xor(dza.b.d, Codec.xor(dza.a.d, dza.c.d)).xmap(dza::a, dza::a);
   dza b = b(0);
   dza c = c(0);

   static dza a(int $$0) {
      return new dza.b($$0);
   }

   static dza b(int $$0) {
      return new dza.a($$0);
   }

   static dza c(int $$0) {
      return new dza.c($$0);
   }

   static dza a() {
      return b;
   }

   static dza b() {
      return c;
   }

   private static dza a(Either<dza.b, Either<dza.a, dza.c>> $$0) {
      return (dza)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dza.b, Either<dza.a, dza.c>> a(dza $$0) {
      return $$0 instanceof dza.b ? Either.left((dza.b)$$0) : Either.right($$0 instanceof dza.a ? Either.left((dza.a)$$0) : Either.right((dza.c)$$0));
   }

   int a(dzd var1);

   public static record a(int e) implements dza {
      public static final Codec<dza.a> d = Codec.intRange(dwg.e, dwg.d).fieldOf("above_bottom").xmap(dza.a::new, dza.a::c).codec();

      @Override
      public int a(dzd $$0) {
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

   public static record b(int e) implements dza {
      public static final Codec<dza.b> d = Codec.intRange(dwg.e, dwg.d).fieldOf("absolute").xmap(dza.b::new, dza.b::c).codec();

      @Override
      public int a(dzd $$0) {
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

   public static record c(int e) implements dza {
      public static final Codec<dza.c> d = Codec.intRange(dwg.e, dwg.d).fieldOf("below_top").xmap(dza.c::new, dza.c::c).codec();

      @Override
      public int a(dzd $$0) {
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
