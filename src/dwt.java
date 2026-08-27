import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dwt {
   Codec<dwt> a = axh.a(dwt.b.d, axh.a(dwt.a.d, dwt.c.d)).xmap(dwt::a, dwt::a);
   dwt b = b(0);
   dwt c = c(0);

   static dwt a(int $$0) {
      return new dwt.b($$0);
   }

   static dwt b(int $$0) {
      return new dwt.a($$0);
   }

   static dwt c(int $$0) {
      return new dwt.c($$0);
   }

   static dwt a() {
      return b;
   }

   static dwt b() {
      return c;
   }

   private static dwt a(Either<dwt.b, Either<dwt.a, dwt.c>> $$0) {
      return (dwt)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dwt.b, Either<dwt.a, dwt.c>> a(dwt $$0) {
      return $$0 instanceof dwt.b ? Either.left((dwt.b)$$0) : Either.right($$0 instanceof dwt.a ? Either.left((dwt.a)$$0) : Either.right((dwt.c)$$0));
   }

   int a(dww var1);

   public static record a(int e) implements dwt {
      public static final Codec<dwt.a> d = Codec.intRange(dtz.e, dtz.d).fieldOf("above_bottom").xmap(dwt.a::new, dwt.a::c).codec();

      @Override
      public int a(dww $$0) {
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

   public static record b(int e) implements dwt {
      public static final Codec<dwt.b> d = Codec.intRange(dtz.e, dtz.d).fieldOf("absolute").xmap(dwt.b::new, dwt.b::c).codec();

      @Override
      public int a(dww $$0) {
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

   public static record c(int e) implements dwt {
      public static final Codec<dwt.c> d = Codec.intRange(dtz.e, dtz.d).fieldOf("below_top").xmap(dwt.c::new, dwt.c::c).codec();

      @Override
      public int a(dww $$0) {
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
