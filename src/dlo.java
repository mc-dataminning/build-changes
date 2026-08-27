import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlo {
   Codec<dlo> a = arh.a(dlo.b.d, arh.a(dlo.a.d, dlo.c.d)).xmap(dlo::a, dlo::a);
   dlo b = b(0);
   dlo c = c(0);

   static dlo a(int $$0) {
      return new dlo.b($$0);
   }

   static dlo b(int $$0) {
      return new dlo.a($$0);
   }

   static dlo c(int $$0) {
      return new dlo.c($$0);
   }

   static dlo a() {
      return b;
   }

   static dlo b() {
      return c;
   }

   private static dlo a(Either<dlo.b, Either<dlo.a, dlo.c>> $$0) {
      return (dlo)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlo.b, Either<dlo.a, dlo.c>> a(dlo $$0) {
      return $$0 instanceof dlo.b ? Either.left((dlo.b)$$0) : Either.right($$0 instanceof dlo.a ? Either.left((dlo.a)$$0) : Either.right((dlo.c)$$0));
   }

   int a(dlr var1);

   public static record a(int e) implements dlo {
      public static final Codec<dlo.a> d = Codec.intRange(diu.e, diu.d).fieldOf("above_bottom").xmap(dlo.a::new, dlo.a::c).codec();

      @Override
      public int a(dlr $$0) {
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

   public static record b(int e) implements dlo {
      public static final Codec<dlo.b> d = Codec.intRange(diu.e, diu.d).fieldOf("absolute").xmap(dlo.b::new, dlo.b::c).codec();

      @Override
      public int a(dlr $$0) {
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

   public static record c(int e) implements dlo {
      public static final Codec<dlo.c> d = Codec.intRange(diu.e, diu.d).fieldOf("below_top").xmap(dlo.c::new, dlo.c::c).codec();

      @Override
      public int a(dlr $$0) {
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
