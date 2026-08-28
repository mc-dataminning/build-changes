import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eec {
   Codec<eec> a = Codec.xor(eec.b.d, Codec.xor(eec.a.d, eec.c.d)).xmap(eec::a, eec::a);
   eec b = b(0);
   eec c = c(0);

   static eec a(int $$0) {
      return new eec.b($$0);
   }

   static eec b(int $$0) {
      return new eec.a($$0);
   }

   static eec c(int $$0) {
      return new eec.c($$0);
   }

   static eec a() {
      return b;
   }

   static eec b() {
      return c;
   }

   private static eec a(Either<eec.b, Either<eec.a, eec.c>> $$0) {
      return (eec)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eec.b, Either<eec.a, eec.c>> a(eec $$0) {
      return $$0 instanceof eec.b ? Either.left((eec.b)$$0) : Either.right($$0 instanceof eec.a ? Either.left((eec.a)$$0) : Either.right((eec.c)$$0));
   }

   int a(eef var1);

   public static record a(int e) implements eec {
      public static final Codec<eec.a> d = Codec.intRange(ebi.e, ebi.d).fieldOf("above_bottom").xmap(eec.a::new, eec.a::c).codec();

      @Override
      public int a(eef $$0) {
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

   public static record b(int e) implements eec {
      public static final Codec<eec.b> d = Codec.intRange(ebi.e, ebi.d).fieldOf("absolute").xmap(eec.b::new, eec.b::c).codec();

      @Override
      public int a(eef $$0) {
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

   public static record c(int e) implements eec {
      public static final Codec<eec.c> d = Codec.intRange(ebi.e, ebi.d).fieldOf("below_top").xmap(eec.c::new, eec.c::c).codec();

      @Override
      public int a(eef $$0) {
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
