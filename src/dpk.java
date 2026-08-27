import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dpk {
   Codec<dpk> a = atw.a(dpk.b.d, atw.a(dpk.a.d, dpk.c.d)).xmap(dpk::a, dpk::a);
   dpk b = b(0);
   dpk c = c(0);

   static dpk a(int $$0) {
      return new dpk.b($$0);
   }

   static dpk b(int $$0) {
      return new dpk.a($$0);
   }

   static dpk c(int $$0) {
      return new dpk.c($$0);
   }

   static dpk a() {
      return b;
   }

   static dpk b() {
      return c;
   }

   private static dpk a(Either<dpk.b, Either<dpk.a, dpk.c>> $$0) {
      return (dpk)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dpk.b, Either<dpk.a, dpk.c>> a(dpk $$0) {
      return $$0 instanceof dpk.b ? Either.left((dpk.b)$$0) : Either.right($$0 instanceof dpk.a ? Either.left((dpk.a)$$0) : Either.right((dpk.c)$$0));
   }

   int a(dpn var1);

   public static record a(int e) implements dpk {
      public static final Codec<dpk.a> d = Codec.intRange(dmq.e, dmq.d).fieldOf("above_bottom").xmap(dpk.a::new, dpk.a::c).codec();

      @Override
      public int a(dpn $$0) {
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

   public static record b(int e) implements dpk {
      public static final Codec<dpk.b> d = Codec.intRange(dmq.e, dmq.d).fieldOf("absolute").xmap(dpk.b::new, dpk.b::c).codec();

      @Override
      public int a(dpn $$0) {
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

   public static record c(int e) implements dpk {
      public static final Codec<dpk.c> d = Codec.intRange(dmq.e, dmq.d).fieldOf("below_top").xmap(dpk.c::new, dpk.c::c).codec();

      @Override
      public int a(dpn $$0) {
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
