import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface edn {
   Codec<edn> a = Codec.xor(edn.b.d, Codec.xor(edn.a.d, edn.c.d)).xmap(edn::a, edn::a);
   edn b = b(0);
   edn c = c(0);

   static edn a(int $$0) {
      return new edn.b($$0);
   }

   static edn b(int $$0) {
      return new edn.a($$0);
   }

   static edn c(int $$0) {
      return new edn.c($$0);
   }

   static edn a() {
      return b;
   }

   static edn b() {
      return c;
   }

   private static edn a(Either<edn.b, Either<edn.a, edn.c>> $$0) {
      return (edn)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<edn.b, Either<edn.a, edn.c>> a(edn $$0) {
      return $$0 instanceof edn.b ? Either.left((edn.b)$$0) : Either.right($$0 instanceof edn.a ? Either.left((edn.a)$$0) : Either.right((edn.c)$$0));
   }

   int a(edq var1);

   public static record a(int e) implements edn {
      public static final Codec<edn.a> d = Codec.intRange(eat.e, eat.d).fieldOf("above_bottom").xmap(edn.a::new, edn.a::c).codec();

      @Override
      public int a(edq $$0) {
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

   public static record b(int e) implements edn {
      public static final Codec<edn.b> d = Codec.intRange(eat.e, eat.d).fieldOf("absolute").xmap(edn.b::new, edn.b::c).codec();

      @Override
      public int a(edq $$0) {
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

   public static record c(int e) implements edn {
      public static final Codec<edn.c> d = Codec.intRange(eat.e, eat.d).fieldOf("below_top").xmap(edn.c::new, edn.c::c).codec();

      @Override
      public int a(edq $$0) {
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
