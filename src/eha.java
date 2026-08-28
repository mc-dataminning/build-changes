import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eha {
   Codec<eha> a = Codec.xor(eha.b.d, Codec.xor(eha.a.d, eha.c.d)).xmap(eha::a, eha::a);
   eha b = b(0);
   eha c = c(0);

   static eha a(int $$0) {
      return new eha.b($$0);
   }

   static eha b(int $$0) {
      return new eha.a($$0);
   }

   static eha c(int $$0) {
      return new eha.c($$0);
   }

   static eha a() {
      return b;
   }

   static eha b() {
      return c;
   }

   private static eha a(Either<eha.b, Either<eha.a, eha.c>> $$0) {
      return (eha)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eha.b, Either<eha.a, eha.c>> a(eha $$0) {
      return $$0 instanceof eha.b ? Either.left((eha.b)$$0) : Either.right($$0 instanceof eha.a ? Either.left((eha.a)$$0) : Either.right((eha.c)$$0));
   }

   int a(ehd var1);

   public static record a(int e) implements eha {
      public static final Codec<eha.a> d = Codec.intRange(eee.e, eee.d).fieldOf("above_bottom").xmap(eha.a::new, eha.a::c).codec();

      @Override
      public int a(ehd $$0) {
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

   public static record b(int e) implements eha {
      public static final Codec<eha.b> d = Codec.intRange(eee.e, eee.d).fieldOf("absolute").xmap(eha.b::new, eha.b::c).codec();

      @Override
      public int a(ehd $$0) {
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

   public static record c(int e) implements eha {
      public static final Codec<eha.c> d = Codec.intRange(eee.e, eee.d).fieldOf("below_top").xmap(eha.c::new, eha.c::c).codec();

      @Override
      public int a(ehd $$0) {
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
