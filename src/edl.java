import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface edl {
   Codec<edl> a = Codec.xor(edl.b.d, Codec.xor(edl.a.d, edl.c.d)).xmap(edl::a, edl::a);
   edl b = b(0);
   edl c = c(0);

   static edl a(int $$0) {
      return new edl.b($$0);
   }

   static edl b(int $$0) {
      return new edl.a($$0);
   }

   static edl c(int $$0) {
      return new edl.c($$0);
   }

   static edl a() {
      return b;
   }

   static edl b() {
      return c;
   }

   private static edl a(Either<edl.b, Either<edl.a, edl.c>> $$0) {
      return (edl)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<edl.b, Either<edl.a, edl.c>> a(edl $$0) {
      return $$0 instanceof edl.b ? Either.left((edl.b)$$0) : Either.right($$0 instanceof edl.a ? Either.left((edl.a)$$0) : Either.right((edl.c)$$0));
   }

   int a(edo var1);

   public static record a(int e) implements edl {
      public static final Codec<edl.a> d = Codec.intRange(ear.e, ear.d).fieldOf("above_bottom").xmap(edl.a::new, edl.a::c).codec();

      @Override
      public int a(edo $$0) {
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

   public static record b(int e) implements edl {
      public static final Codec<edl.b> d = Codec.intRange(ear.e, ear.d).fieldOf("absolute").xmap(edl.b::new, edl.b::c).codec();

      @Override
      public int a(edo $$0) {
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

   public static record c(int e) implements edl {
      public static final Codec<edl.c> d = Codec.intRange(ear.e, ear.d).fieldOf("below_top").xmap(edl.c::new, edl.c::c).codec();

      @Override
      public int a(edo $$0) {
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
