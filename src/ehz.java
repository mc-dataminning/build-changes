import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ehz {
   Codec<ehz> a = Codec.xor(ehz.b.d, Codec.xor(ehz.a.d, ehz.c.d)).xmap(ehz::a, ehz::a);
   ehz b = b(0);
   ehz c = c(0);

   static ehz a(int $$0) {
      return new ehz.b($$0);
   }

   static ehz b(int $$0) {
      return new ehz.a($$0);
   }

   static ehz c(int $$0) {
      return new ehz.c($$0);
   }

   static ehz a() {
      return b;
   }

   static ehz b() {
      return c;
   }

   private static ehz a(Either<ehz.b, Either<ehz.a, ehz.c>> $$0) {
      return (ehz)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ehz.b, Either<ehz.a, ehz.c>> a(ehz $$0) {
      return $$0 instanceof ehz.b ? Either.left((ehz.b)$$0) : Either.right($$0 instanceof ehz.a ? Either.left((ehz.a)$$0) : Either.right((ehz.c)$$0));
   }

   int a(eic var1);

   public static record a(int e) implements ehz {
      public static final Codec<ehz.a> d = Codec.intRange(efd.e, efd.d).fieldOf("above_bottom").xmap(ehz.a::new, ehz.a::c).codec();

      @Override
      public int a(eic $$0) {
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

   public static record b(int e) implements ehz {
      public static final Codec<ehz.b> d = Codec.intRange(efd.e, efd.d).fieldOf("absolute").xmap(ehz.b::new, ehz.b::c).codec();

      @Override
      public int a(eic $$0) {
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

   public static record c(int e) implements ehz {
      public static final Codec<ehz.c> d = Codec.intRange(efd.e, efd.d).fieldOf("below_top").xmap(ehz.c::new, ehz.c::c).codec();

      @Override
      public int a(eic $$0) {
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
