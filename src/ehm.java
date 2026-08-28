import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ehm {
   Codec<ehm> a = Codec.xor(ehm.b.d, Codec.xor(ehm.a.d, ehm.c.d)).xmap(ehm::a, ehm::a);
   ehm b = b(0);
   ehm c = c(0);

   static ehm a(int $$0) {
      return new ehm.b($$0);
   }

   static ehm b(int $$0) {
      return new ehm.a($$0);
   }

   static ehm c(int $$0) {
      return new ehm.c($$0);
   }

   static ehm a() {
      return b;
   }

   static ehm b() {
      return c;
   }

   private static ehm a(Either<ehm.b, Either<ehm.a, ehm.c>> $$0) {
      return (ehm)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ehm.b, Either<ehm.a, ehm.c>> a(ehm $$0) {
      return $$0 instanceof ehm.b ? Either.left((ehm.b)$$0) : Either.right($$0 instanceof ehm.a ? Either.left((ehm.a)$$0) : Either.right((ehm.c)$$0));
   }

   int a(ehp var1);

   public static record a(int e) implements ehm {
      public static final Codec<ehm.a> d = Codec.intRange(eeq.e, eeq.d).fieldOf("above_bottom").xmap(ehm.a::new, ehm.a::c).codec();

      @Override
      public int a(ehp $$0) {
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

   public static record b(int e) implements ehm {
      public static final Codec<ehm.b> d = Codec.intRange(eeq.e, eeq.d).fieldOf("absolute").xmap(ehm.b::new, ehm.b::c).codec();

      @Override
      public int a(ehp $$0) {
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

   public static record c(int e) implements ehm {
      public static final Codec<ehm.c> d = Codec.intRange(eeq.e, eeq.d).fieldOf("below_top").xmap(ehm.c::new, ehm.c::c).codec();

      @Override
      public int a(ehp $$0) {
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
