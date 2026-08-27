import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dpd {
   Codec<dpd> a = atq.a(dpd.b.d, atq.a(dpd.a.d, dpd.c.d)).xmap(dpd::a, dpd::a);
   dpd b = b(0);
   dpd c = c(0);

   static dpd a(int $$0) {
      return new dpd.b($$0);
   }

   static dpd b(int $$0) {
      return new dpd.a($$0);
   }

   static dpd c(int $$0) {
      return new dpd.c($$0);
   }

   static dpd a() {
      return b;
   }

   static dpd b() {
      return c;
   }

   private static dpd a(Either<dpd.b, Either<dpd.a, dpd.c>> $$0) {
      return (dpd)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dpd.b, Either<dpd.a, dpd.c>> a(dpd $$0) {
      return $$0 instanceof dpd.b ? Either.left((dpd.b)$$0) : Either.right($$0 instanceof dpd.a ? Either.left((dpd.a)$$0) : Either.right((dpd.c)$$0));
   }

   int a(dpg var1);

   public static record a(int e) implements dpd {
      public static final Codec<dpd.a> d = Codec.intRange(dmj.e, dmj.d).fieldOf("above_bottom").xmap(dpd.a::new, dpd.a::c).codec();

      @Override
      public int a(dpg $$0) {
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

   public static record b(int e) implements dpd {
      public static final Codec<dpd.b> d = Codec.intRange(dmj.e, dmj.d).fieldOf("absolute").xmap(dpd.b::new, dpd.b::c).codec();

      @Override
      public int a(dpg $$0) {
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

   public static record c(int e) implements dpd {
      public static final Codec<dpd.c> d = Codec.intRange(dmj.e, dmj.d).fieldOf("below_top").xmap(dpd.c::new, dpd.c::c).codec();

      @Override
      public int a(dpg $$0) {
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
