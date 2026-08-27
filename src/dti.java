import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dti {
   Codec<dti> a = awe.a(dti.b.d, awe.a(dti.a.d, dti.c.d)).xmap(dti::a, dti::a);
   dti b = b(0);
   dti c = c(0);

   static dti a(int $$0) {
      return new dti.b($$0);
   }

   static dti b(int $$0) {
      return new dti.a($$0);
   }

   static dti c(int $$0) {
      return new dti.c($$0);
   }

   static dti a() {
      return b;
   }

   static dti b() {
      return c;
   }

   private static dti a(Either<dti.b, Either<dti.a, dti.c>> $$0) {
      return (dti)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dti.b, Either<dti.a, dti.c>> a(dti $$0) {
      return $$0 instanceof dti.b ? Either.left((dti.b)$$0) : Either.right($$0 instanceof dti.a ? Either.left((dti.a)$$0) : Either.right((dti.c)$$0));
   }

   int a(dtl var1);

   public static record a(int e) implements dti {
      public static final Codec<dti.a> d = Codec.intRange(dqo.e, dqo.d).fieldOf("above_bottom").xmap(dti.a::new, dti.a::c).codec();

      @Override
      public int a(dtl $$0) {
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

   public static record b(int e) implements dti {
      public static final Codec<dti.b> d = Codec.intRange(dqo.e, dqo.d).fieldOf("absolute").xmap(dti.b::new, dti.b::c).codec();

      @Override
      public int a(dtl $$0) {
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

   public static record c(int e) implements dti {
      public static final Codec<dti.c> d = Codec.intRange(dqo.e, dqo.d).fieldOf("below_top").xmap(dti.c::new, dti.c::c).codec();

      @Override
      public int a(dtl $$0) {
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
