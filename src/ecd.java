import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ecd {
   Codec<ecd> a = Codec.xor(ecd.b.d, Codec.xor(ecd.a.d, ecd.c.d)).xmap(ecd::a, ecd::a);
   ecd b = b(0);
   ecd c = c(0);

   static ecd a(int $$0) {
      return new ecd.b($$0);
   }

   static ecd b(int $$0) {
      return new ecd.a($$0);
   }

   static ecd c(int $$0) {
      return new ecd.c($$0);
   }

   static ecd a() {
      return b;
   }

   static ecd b() {
      return c;
   }

   private static ecd a(Either<ecd.b, Either<ecd.a, ecd.c>> $$0) {
      return (ecd)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ecd.b, Either<ecd.a, ecd.c>> a(ecd $$0) {
      return $$0 instanceof ecd.b ? Either.left((ecd.b)$$0) : Either.right($$0 instanceof ecd.a ? Either.left((ecd.a)$$0) : Either.right((ecd.c)$$0));
   }

   int a(ecg var1);

   public static record a(int e) implements ecd {
      public static final Codec<ecd.a> d = Codec.intRange(dzj.e, dzj.d).fieldOf("above_bottom").xmap(ecd.a::new, ecd.a::c).codec();

      @Override
      public int a(ecg $$0) {
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

   public static record b(int e) implements ecd {
      public static final Codec<ecd.b> d = Codec.intRange(dzj.e, dzj.d).fieldOf("absolute").xmap(ecd.b::new, ecd.b::c).codec();

      @Override
      public int a(ecg $$0) {
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

   public static record c(int e) implements ecd {
      public static final Codec<ecd.c> d = Codec.intRange(dzj.e, dzj.d).fieldOf("below_top").xmap(ecd.c::new, ecd.c::c).codec();

      @Override
      public int a(ecg $$0) {
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
