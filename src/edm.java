import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface edm {
   Codec<edm> a = Codec.xor(edm.b.d, Codec.xor(edm.a.d, edm.c.d)).xmap(edm::a, edm::a);
   edm b = b(0);
   edm c = c(0);

   static edm a(int $$0) {
      return new edm.b($$0);
   }

   static edm b(int $$0) {
      return new edm.a($$0);
   }

   static edm c(int $$0) {
      return new edm.c($$0);
   }

   static edm a() {
      return b;
   }

   static edm b() {
      return c;
   }

   private static edm a(Either<edm.b, Either<edm.a, edm.c>> $$0) {
      return (edm)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<edm.b, Either<edm.a, edm.c>> a(edm $$0) {
      return $$0 instanceof edm.b ? Either.left((edm.b)$$0) : Either.right($$0 instanceof edm.a ? Either.left((edm.a)$$0) : Either.right((edm.c)$$0));
   }

   int a(edp var1);

   public static record a(int e) implements edm {
      public static final Codec<edm.a> d = Codec.intRange(eas.e, eas.d).fieldOf("above_bottom").xmap(edm.a::new, edm.a::c).codec();

      @Override
      public int a(edp $$0) {
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

   public static record b(int e) implements edm {
      public static final Codec<edm.b> d = Codec.intRange(eas.e, eas.d).fieldOf("absolute").xmap(edm.b::new, edm.b::c).codec();

      @Override
      public int a(edp $$0) {
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

   public static record c(int e) implements edm {
      public static final Codec<edm.c> d = Codec.intRange(eas.e, eas.d).fieldOf("below_top").xmap(edm.c::new, edm.c::c).codec();

      @Override
      public int a(edp $$0) {
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
