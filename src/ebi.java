import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface ebi {
   Codec<ebi> a = Codec.xor(ebi.b.d, Codec.xor(ebi.a.d, ebi.c.d)).xmap(ebi::a, ebi::a);
   ebi b = b(0);
   ebi c = c(0);

   static ebi a(int $$0) {
      return new ebi.b($$0);
   }

   static ebi b(int $$0) {
      return new ebi.a($$0);
   }

   static ebi c(int $$0) {
      return new ebi.c($$0);
   }

   static ebi a() {
      return b;
   }

   static ebi b() {
      return c;
   }

   private static ebi a(Either<ebi.b, Either<ebi.a, ebi.c>> $$0) {
      return (ebi)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<ebi.b, Either<ebi.a, ebi.c>> a(ebi $$0) {
      return $$0 instanceof ebi.b ? Either.left((ebi.b)$$0) : Either.right($$0 instanceof ebi.a ? Either.left((ebi.a)$$0) : Either.right((ebi.c)$$0));
   }

   int a(ebl var1);

   public static record a(int e) implements ebi {
      public static final Codec<ebi.a> d = Codec.intRange(dyo.e, dyo.d).fieldOf("above_bottom").xmap(ebi.a::new, ebi.a::c).codec();

      @Override
      public int a(ebl $$0) {
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

   public static record b(int e) implements ebi {
      public static final Codec<ebi.b> d = Codec.intRange(dyo.e, dyo.d).fieldOf("absolute").xmap(ebi.b::new, ebi.b::c).codec();

      @Override
      public int a(ebl $$0) {
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

   public static record c(int e) implements ebi {
      public static final Codec<ebi.c> d = Codec.intRange(dyo.e, dyo.d).fieldOf("below_top").xmap(ebi.c::new, ebi.c::c).codec();

      @Override
      public int a(ebl $$0) {
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
