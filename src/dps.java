import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dps {
   Codec<dps> a = atx.a(dps.b.d, atx.a(dps.a.d, dps.c.d)).xmap(dps::a, dps::a);
   dps b = b(0);
   dps c = c(0);

   static dps a(int $$0) {
      return new dps.b($$0);
   }

   static dps b(int $$0) {
      return new dps.a($$0);
   }

   static dps c(int $$0) {
      return new dps.c($$0);
   }

   static dps a() {
      return b;
   }

   static dps b() {
      return c;
   }

   private static dps a(Either<dps.b, Either<dps.a, dps.c>> $$0) {
      return (dps)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dps.b, Either<dps.a, dps.c>> a(dps $$0) {
      return $$0 instanceof dps.b ? Either.left((dps.b)$$0) : Either.right($$0 instanceof dps.a ? Either.left((dps.a)$$0) : Either.right((dps.c)$$0));
   }

   int a(dpv var1);

   public static record a(int e) implements dps {
      public static final Codec<dps.a> d = Codec.intRange(dmy.e, dmy.d).fieldOf("above_bottom").xmap(dps.a::new, dps.a::c).codec();

      @Override
      public int a(dpv $$0) {
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

   public static record b(int e) implements dps {
      public static final Codec<dps.b> d = Codec.intRange(dmy.e, dmy.d).fieldOf("absolute").xmap(dps.b::new, dps.b::c).codec();

      @Override
      public int a(dpv $$0) {
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

   public static record c(int e) implements dps {
      public static final Codec<dps.c> d = Codec.intRange(dmy.e, dmy.d).fieldOf("below_top").xmap(dps.c::new, dps.c::c).codec();

      @Override
      public int a(dpv $$0) {
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
