import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dvl {
   Codec<dvl> a = aws.a(dvl.b.d, aws.a(dvl.a.d, dvl.c.d)).xmap(dvl::a, dvl::a);
   dvl b = b(0);
   dvl c = c(0);

   static dvl a(int $$0) {
      return new dvl.b($$0);
   }

   static dvl b(int $$0) {
      return new dvl.a($$0);
   }

   static dvl c(int $$0) {
      return new dvl.c($$0);
   }

   static dvl a() {
      return b;
   }

   static dvl b() {
      return c;
   }

   private static dvl a(Either<dvl.b, Either<dvl.a, dvl.c>> $$0) {
      return (dvl)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dvl.b, Either<dvl.a, dvl.c>> a(dvl $$0) {
      return $$0 instanceof dvl.b ? Either.left((dvl.b)$$0) : Either.right($$0 instanceof dvl.a ? Either.left((dvl.a)$$0) : Either.right((dvl.c)$$0));
   }

   int a(dvo var1);

   public static record a(int e) implements dvl {
      public static final Codec<dvl.a> d = Codec.intRange(dsr.e, dsr.d).fieldOf("above_bottom").xmap(dvl.a::new, dvl.a::c).codec();

      @Override
      public int a(dvo $$0) {
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

   public static record b(int e) implements dvl {
      public static final Codec<dvl.b> d = Codec.intRange(dsr.e, dsr.d).fieldOf("absolute").xmap(dvl.b::new, dvl.b::c).codec();

      @Override
      public int a(dvo $$0) {
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

   public static record c(int e) implements dvl {
      public static final Codec<dvl.c> d = Codec.intRange(dsr.e, dsr.d).fieldOf("below_top").xmap(dvl.c::new, dvl.c::c).codec();

      @Override
      public int a(dvo $$0) {
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
