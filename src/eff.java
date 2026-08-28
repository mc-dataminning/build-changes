import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface eff {
   Codec<eff> a = Codec.xor(eff.b.d, Codec.xor(eff.a.d, eff.c.d)).xmap(eff::a, eff::a);
   eff b = b(0);
   eff c = c(0);

   static eff a(int $$0) {
      return new eff.b($$0);
   }

   static eff b(int $$0) {
      return new eff.a($$0);
   }

   static eff c(int $$0) {
      return new eff.c($$0);
   }

   static eff a() {
      return b;
   }

   static eff b() {
      return c;
   }

   private static eff a(Either<eff.b, Either<eff.a, eff.c>> $$0) {
      return (eff)$$0.map(Function.identity(), Either::unwrap);
   }

   private static Either<eff.b, Either<eff.a, eff.c>> a(eff $$0) {
      return $$0 instanceof eff.b ? Either.left((eff.b)$$0) : Either.right($$0 instanceof eff.a ? Either.left((eff.a)$$0) : Either.right((eff.c)$$0));
   }

   int a(efi var1);

   public static record a(int e) implements eff {
      public static final Codec<eff.a> d = Codec.intRange(ecj.e, ecj.d).fieldOf("above_bottom").xmap(eff.a::new, eff.a::c).codec();

      @Override
      public int a(efi $$0) {
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

   public static record b(int e) implements eff {
      public static final Codec<eff.b> d = Codec.intRange(ecj.e, ecj.d).fieldOf("absolute").xmap(eff.b::new, eff.b::c).codec();

      @Override
      public int a(efi $$0) {
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

   public static record c(int e) implements eff {
      public static final Codec<eff.c> d = Codec.intRange(ecj.e, ecj.d).fieldOf("below_top").xmap(eff.c::new, eff.c::c).codec();

      @Override
      public int a(efi $$0) {
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
