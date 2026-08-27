import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dlc {
   Codec<dlc> a = aqy.a(dlc.b.d, aqy.a(dlc.a.d, dlc.c.d)).xmap(dlc::a, dlc::a);
   dlc b = b(0);
   dlc c = c(0);

   static dlc a(int $$0) {
      return new dlc.b($$0);
   }

   static dlc b(int $$0) {
      return new dlc.a($$0);
   }

   static dlc c(int $$0) {
      return new dlc.c($$0);
   }

   static dlc a() {
      return b;
   }

   static dlc b() {
      return c;
   }

   private static dlc a(Either<dlc.b, Either<dlc.a, dlc.c>> $$0) {
      return (dlc)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dlc.b, Either<dlc.a, dlc.c>> a(dlc $$0) {
      return $$0 instanceof dlc.b ? Either.left((dlc.b)$$0) : Either.right($$0 instanceof dlc.a ? Either.left((dlc.a)$$0) : Either.right((dlc.c)$$0));
   }

   int a(dlf var1);

   public static record a(int e) implements dlc {
      public static final Codec<dlc.a> d = Codec.intRange(dii.e, dii.d).fieldOf("above_bottom").xmap(dlc.a::new, dlc.a::c).codec();

      @Override
      public int a(dlf $$0) {
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

   public static record b(int e) implements dlc {
      public static final Codec<dlc.b> d = Codec.intRange(dii.e, dii.d).fieldOf("absolute").xmap(dlc.b::new, dlc.b::c).codec();

      @Override
      public int a(dlf $$0) {
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

   public static record c(int e) implements dlc {
      public static final Codec<dlc.c> d = Codec.intRange(dii.e, dii.d).fieldOf("below_top").xmap(dlc.c::new, dlc.c::c).codec();

      @Override
      public int a(dlf $$0) {
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
