import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dyt {
   Codec<dyt> a = Codec.xor(dyt.b.d, Codec.xor(dyt.a.d, dyt.c.d)).xmap(dyt::a, dyt::a);
   dyt b = b(0);
   dyt c = c(0);

   static dyt a(int $$0) {
      return new dyt.b($$0);
   }

   static dyt b(int $$0) {
      return new dyt.a($$0);
   }

   static dyt c(int $$0) {
      return new dyt.c($$0);
   }

   static dyt a() {
      return b;
   }

   static dyt b() {
      return c;
   }

   private static dyt a(Either<dyt.b, Either<dyt.a, dyt.c>> $$0) {
      return (dyt)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<dyt.b, Either<dyt.a, dyt.c>> a(dyt $$0) {
      return $$0 instanceof dyt.b ? Either.left((dyt.b)$$0) : Either.right($$0 instanceof dyt.a ? Either.left((dyt.a)$$0) : Either.right((dyt.c)$$0));
   }

   int a(dyw var1);

   public static record a(int e) implements dyt {
      public static final Codec<dyt.a> d = Codec.intRange(dvz.e, dvz.d).fieldOf("above_bottom").xmap(dyt.a::new, dyt.a::c).codec();

      @Override
      public int a(dyw $$0) {
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

   public static record b(int e) implements dyt {
      public static final Codec<dyt.b> d = Codec.intRange(dvz.e, dvz.d).fieldOf("absolute").xmap(dyt.b::new, dyt.b::c).codec();

      @Override
      public int a(dyw $$0) {
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

   public static record c(int e) implements dyt {
      public static final Codec<dyt.c> d = Codec.intRange(dvz.e, dvz.d).fieldOf("below_top").xmap(dyt.c::new, dyt.c::c).codec();

      @Override
      public int a(dyw $$0) {
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
