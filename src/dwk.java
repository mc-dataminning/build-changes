import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dwk {
   Codec<dwk> a = axe.a(dwk.b.d, axe.a(dwk.a.d, dwk.c.d)).xmap(dwk::a, dwk::a);
   dwk b = b(0);
   dwk c = c(0);

   static dwk a(int $$0) {
      return new dwk.b($$0);
   }

   static dwk b(int $$0) {
      return new dwk.a($$0);
   }

   static dwk c(int $$0) {
      return new dwk.c($$0);
   }

   static dwk a() {
      return b;
   }

   static dwk b() {
      return c;
   }

   private static dwk a(Either<dwk.b, Either<dwk.a, dwk.c>> $$0) {
      return (dwk)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dwk.b, Either<dwk.a, dwk.c>> a(dwk $$0) {
      return $$0 instanceof dwk.b ? Either.left((dwk.b)$$0) : Either.right($$0 instanceof dwk.a ? Either.left((dwk.a)$$0) : Either.right((dwk.c)$$0));
   }

   int a(dwn var1);

   public static record a(int e) implements dwk {
      public static final Codec<dwk.a> d = Codec.intRange(dtq.e, dtq.d).fieldOf("above_bottom").xmap(dwk.a::new, dwk.a::c).codec();

      @Override
      public int a(dwn $$0) {
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

   public static record b(int e) implements dwk {
      public static final Codec<dwk.b> d = Codec.intRange(dtq.e, dtq.d).fieldOf("absolute").xmap(dwk.b::new, dwk.b::c).codec();

      @Override
      public int a(dwn $$0) {
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

   public static record c(int e) implements dwk {
      public static final Codec<dwk.c> d = Codec.intRange(dtq.e, dtq.d).fieldOf("below_top").xmap(dwk.c::new, dwk.c::c).codec();

      @Override
      public int a(dwn $$0) {
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
