import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyn {
   Codec<dyn> a = Codec.xor(dyn.b.d, Codec.xor(dyn.a.d, dyn.c.d)).xmap(dyn::a, dyn::a);
   dyn b = b(0);
   dyn c = c(0);

   static dyn a(int $$0) {
      return new dyn.b($$0);
   }

   static dyn b(int $$0) {
      return new dyn.a($$0);
   }

   static dyn c(int $$0) {
      return new dyn.c($$0);
   }

   static dyn a() {
      return b;
   }

   static dyn b() {
      return c;
   }

   private static dyn a(Either<dyn.b, Either<dyn.a, dyn.c>> $$0) {
      return (dyn)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyn.b, Either<dyn.a, dyn.c>> a(dyn $$0) {
      return $$0 instanceof dyn.b ? Either.left((dyn.b)$$0) : Either.right($$0 instanceof dyn.a ? Either.left((dyn.a)$$0) : Either.right((dyn.c)$$0));
   }

   int a(dyq var1);

   public static record a(int e) implements dyn {
      public static final Codec<dyn.a> d = Codec.intRange(dvt.e, dvt.d).fieldOf("above_bottom").xmap(dyn.a::new, dyn.a::c).codec();

      @Override
      public int a(dyq $$0) {
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

   public static record b(int e) implements dyn {
      public static final Codec<dyn.b> d = Codec.intRange(dvt.e, dvt.d).fieldOf("absolute").xmap(dyn.b::new, dyn.b::c).codec();

      @Override
      public int a(dyq $$0) {
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

   public static record c(int e) implements dyn {
      public static final Codec<dyn.c> d = Codec.intRange(dvt.e, dvt.d).fieldOf("below_top").xmap(dyn.c::new, dyn.c::c).codec();

      @Override
      public int a(dyq $$0) {
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
