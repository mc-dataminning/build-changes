import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ehx {
   Codec<ehx> a = Codec.xor(ehx.b.d, Codec.xor(ehx.a.d, ehx.c.d)).xmap(ehx::a, ehx::a);
   ehx b = b(0);
   ehx c = c(0);

   static ehx a(int $$0) {
      return new ehx.b($$0);
   }

   static ehx b(int $$0) {
      return new ehx.a($$0);
   }

   static ehx c(int $$0) {
      return new ehx.c($$0);
   }

   static ehx a() {
      return b;
   }

   static ehx b() {
      return c;
   }

   private static ehx a(Either<ehx.b, Either<ehx.a, ehx.c>> $$0) {
      return (ehx)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ehx.b, Either<ehx.a, ehx.c>> a(ehx $$0) {
      return $$0 instanceof ehx.b ? Either.left((ehx.b)$$0) : Either.right($$0 instanceof ehx.a ? Either.left((ehx.a)$$0) : Either.right((ehx.c)$$0));
   }

   int a(eia var1);

   public static record a(int e) implements ehx {
      public static final Codec<ehx.a> d = Codec.intRange(efb.e, efb.d).fieldOf("above_bottom").xmap(ehx.a::new, ehx.a::c).codec();

      @Override
      public int a(eia $$0) {
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

   public static record b(int e) implements ehx {
      public static final Codec<ehx.b> d = Codec.intRange(efb.e, efb.d).fieldOf("absolute").xmap(ehx.b::new, ehx.b::c).codec();

      @Override
      public int a(eia $$0) {
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

   public static record c(int e) implements ehx {
      public static final Codec<ehx.c> d = Codec.intRange(efb.e, efb.d).fieldOf("below_top").xmap(ehx.c::new, ehx.c::c).codec();

      @Override
      public int a(eia $$0) {
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
