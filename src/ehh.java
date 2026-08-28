import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ehh {
   Codec<ehh> a = Codec.xor(ehh.b.d, Codec.xor(ehh.a.d, ehh.c.d)).xmap(ehh::a, ehh::a);
   ehh b = b(0);
   ehh c = c(0);

   static ehh a(int $$0) {
      return new ehh.b($$0);
   }

   static ehh b(int $$0) {
      return new ehh.a($$0);
   }

   static ehh c(int $$0) {
      return new ehh.c($$0);
   }

   static ehh a() {
      return b;
   }

   static ehh b() {
      return c;
   }

   private static ehh a(Either<ehh.b, Either<ehh.a, ehh.c>> $$0) {
      return (ehh)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ehh.b, Either<ehh.a, ehh.c>> a(ehh $$0) {
      return $$0 instanceof ehh.b ? Either.left((ehh.b)$$0) : Either.right($$0 instanceof ehh.a ? Either.left((ehh.a)$$0) : Either.right((ehh.c)$$0));
   }

   int a(ehk var1);

   public static record a(int e) implements ehh {
      public static final Codec<ehh.a> d = Codec.intRange(eel.e, eel.d).fieldOf("above_bottom").xmap(ehh.a::new, ehh.a::c).codec();

      @Override
      public int a(ehk $$0) {
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

   public static record b(int e) implements ehh {
      public static final Codec<ehh.b> d = Codec.intRange(eel.e, eel.d).fieldOf("absolute").xmap(ehh.b::new, ehh.b::c).codec();

      @Override
      public int a(ehk $$0) {
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

   public static record c(int e) implements ehh {
      public static final Codec<ehh.c> d = Codec.intRange(eel.e, eel.d).fieldOf("below_top").xmap(ehh.c::new, ehh.c::c).codec();

      @Override
      public int a(ehk $$0) {
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
