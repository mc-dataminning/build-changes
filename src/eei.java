import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eei {
   Codec<eei> a = Codec.xor(eei.b.d, Codec.xor(eei.a.d, eei.c.d)).xmap(eei::a, eei::a);
   eei b = b(0);
   eei c = c(0);

   static eei a(int $$0) {
      return new eei.b($$0);
   }

   static eei b(int $$0) {
      return new eei.a($$0);
   }

   static eei c(int $$0) {
      return new eei.c($$0);
   }

   static eei a() {
      return b;
   }

   static eei b() {
      return c;
   }

   private static eei a(Either<eei.b, Either<eei.a, eei.c>> $$0) {
      return (eei)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eei.b, Either<eei.a, eei.c>> a(eei $$0) {
      return $$0 instanceof eei.b ? Either.left((eei.b)$$0) : Either.right($$0 instanceof eei.a ? Either.left((eei.a)$$0) : Either.right((eei.c)$$0));
   }

   int a(eel var1);

   public static record a(int e) implements eei {
      public static final Codec<eei.a> d = Codec.intRange(ebm.e, ebm.d).fieldOf("above_bottom").xmap(eei.a::new, eei.a::c).codec();

      @Override
      public int a(eel $$0) {
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

   public static record b(int e) implements eei {
      public static final Codec<eei.b> d = Codec.intRange(ebm.e, ebm.d).fieldOf("absolute").xmap(eei.b::new, eei.b::c).codec();

      @Override
      public int a(eel $$0) {
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

   public static record c(int e) implements eei {
      public static final Codec<eei.c> d = Codec.intRange(ebm.e, ebm.d).fieldOf("below_top").xmap(eei.c::new, eei.c::c).codec();

      @Override
      public int a(eel $$0) {
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
