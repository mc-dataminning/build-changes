import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eaq {
   Codec<eaq> a = Codec.xor(eaq.b.d, Codec.xor(eaq.a.d, eaq.c.d)).xmap(eaq::a, eaq::a);
   eaq b = b(0);
   eaq c = c(0);

   static eaq a(int $$0) {
      return new eaq.b($$0);
   }

   static eaq b(int $$0) {
      return new eaq.a($$0);
   }

   static eaq c(int $$0) {
      return new eaq.c($$0);
   }

   static eaq a() {
      return b;
   }

   static eaq b() {
      return c;
   }

   private static eaq a(Either<eaq.b, Either<eaq.a, eaq.c>> $$0) {
      return (eaq)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eaq.b, Either<eaq.a, eaq.c>> a(eaq $$0) {
      return $$0 instanceof eaq.b ? Either.left((eaq.b)$$0) : Either.right($$0 instanceof eaq.a ? Either.left((eaq.a)$$0) : Either.right((eaq.c)$$0));
   }

   int a(eat var1);

   public static record a(int e) implements eaq {
      public static final Codec<eaq.a> d = Codec.intRange(dxw.e, dxw.d).fieldOf("above_bottom").xmap(eaq.a::new, eaq.a::c).codec();

      @Override
      public int a(eat $$0) {
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

   public static record b(int e) implements eaq {
      public static final Codec<eaq.b> d = Codec.intRange(dxw.e, dxw.d).fieldOf("absolute").xmap(eaq.b::new, eaq.b::c).codec();

      @Override
      public int a(eat $$0) {
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

   public static record c(int e) implements eaq {
      public static final Codec<eaq.c> d = Codec.intRange(dxw.e, dxw.d).fieldOf("below_top").xmap(eaq.c::new, eaq.c::c).codec();

      @Override
      public int a(eat $$0) {
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
