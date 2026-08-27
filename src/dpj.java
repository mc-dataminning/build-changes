import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dpj {
   Codec<dpj> a = atv.a(dpj.b.d, atv.a(dpj.a.d, dpj.c.d)).xmap(dpj::a, dpj::a);
   dpj b = b(0);
   dpj c = c(0);

   static dpj a(int $$0) {
      return new dpj.b($$0);
   }

   static dpj b(int $$0) {
      return new dpj.a($$0);
   }

   static dpj c(int $$0) {
      return new dpj.c($$0);
   }

   static dpj a() {
      return b;
   }

   static dpj b() {
      return c;
   }

   private static dpj a(Either<dpj.b, Either<dpj.a, dpj.c>> $$0) {
      return (dpj)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dpj.b, Either<dpj.a, dpj.c>> a(dpj $$0) {
      return $$0 instanceof dpj.b ? Either.left((dpj.b)$$0) : Either.right($$0 instanceof dpj.a ? Either.left((dpj.a)$$0) : Either.right((dpj.c)$$0));
   }

   int a(dpm var1);

   public static record a(int e) implements dpj {
      public static final Codec<dpj.a> d = Codec.intRange(dmp.e, dmp.d).fieldOf("above_bottom").xmap(dpj.a::new, dpj.a::c).codec();

      @Override
      public int a(dpm $$0) {
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

   public static record b(int e) implements dpj {
      public static final Codec<dpj.b> d = Codec.intRange(dmp.e, dmp.d).fieldOf("absolute").xmap(dpj.b::new, dpj.b::c).codec();

      @Override
      public int a(dpm $$0) {
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

   public static record c(int e) implements dpj {
      public static final Codec<dpj.c> d = Codec.intRange(dmp.e, dmp.d).fieldOf("below_top").xmap(dpj.c::new, dpj.c::c).codec();

      @Override
      public int a(dpm $$0) {
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
