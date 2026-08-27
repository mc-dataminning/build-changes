import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dzo {
   Codec<dzo> a = axu.a(dzo.b.d, axu.a(dzo.a.d, dzo.c.d)).xmap(dzo::a, dzo::a);
   dzo b = b(0);
   dzo c = c(0);

   static dzo a(int $$0) {
      return new dzo.b($$0);
   }

   static dzo b(int $$0) {
      return new dzo.a($$0);
   }

   static dzo c(int $$0) {
      return new dzo.c($$0);
   }

   static dzo a() {
      return b;
   }

   static dzo b() {
      return c;
   }

   private static dzo a(Either<dzo.b, Either<dzo.a, dzo.c>> $$0) {
      return (dzo)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dzo.b, Either<dzo.a, dzo.c>> a(dzo $$0) {
      return $$0 instanceof dzo.b ? Either.left((dzo.b)$$0) : Either.right($$0 instanceof dzo.a ? Either.left((dzo.a)$$0) : Either.right((dzo.c)$$0));
   }

   int a(dzr var1);

   public static record a(int e) implements dzo {
      public static final Codec<dzo.a> d = Codec.intRange(dwu.e, dwu.d).fieldOf("above_bottom").xmap(dzo.a::new, dzo.a::c).codec();

      @Override
      public int a(dzr $$0) {
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

   public static record b(int e) implements dzo {
      public static final Codec<dzo.b> d = Codec.intRange(dwu.e, dwu.d).fieldOf("absolute").xmap(dzo.b::new, dzo.b::c).codec();

      @Override
      public int a(dzr $$0) {
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

   public static record c(int e) implements dzo {
      public static final Codec<dzo.c> d = Codec.intRange(dwu.e, dwu.d).fieldOf("below_top").xmap(dzo.c::new, dzo.c::c).codec();

      @Override
      public int a(dzr $$0) {
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
