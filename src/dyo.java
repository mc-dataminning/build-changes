import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyo {
   Codec<dyo> a = Codec.xor(dyo.b.d, Codec.xor(dyo.a.d, dyo.c.d)).xmap(dyo::a, dyo::a);
   dyo b = b(0);
   dyo c = c(0);

   static dyo a(int $$0) {
      return new dyo.b($$0);
   }

   static dyo b(int $$0) {
      return new dyo.a($$0);
   }

   static dyo c(int $$0) {
      return new dyo.c($$0);
   }

   static dyo a() {
      return b;
   }

   static dyo b() {
      return c;
   }

   private static dyo a(Either<dyo.b, Either<dyo.a, dyo.c>> $$0) {
      return (dyo)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyo.b, Either<dyo.a, dyo.c>> a(dyo $$0) {
      return $$0 instanceof dyo.b ? Either.left((dyo.b)$$0) : Either.right($$0 instanceof dyo.a ? Either.left((dyo.a)$$0) : Either.right((dyo.c)$$0));
   }

   int a(dyr var1);

   public static record a(int e) implements dyo {
      public static final Codec<dyo.a> d = Codec.intRange(dvu.e, dvu.d).fieldOf("above_bottom").xmap(dyo.a::new, dyo.a::c).codec();

      @Override
      public int a(dyr $$0) {
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

   public static record b(int e) implements dyo {
      public static final Codec<dyo.b> d = Codec.intRange(dvu.e, dvu.d).fieldOf("absolute").xmap(dyo.b::new, dyo.b::c).codec();

      @Override
      public int a(dyr $$0) {
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

   public static record c(int e) implements dyo {
      public static final Codec<dyo.c> d = Codec.intRange(dvu.e, dvu.d).fieldOf("below_top").xmap(dyo.c::new, dyo.c::c).codec();

      @Override
      public int a(dyr $$0) {
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
