import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import java.util.function.Function;

public interface dtg {
   Codec<dtg> a = awe.a(dtg.b.d, awe.a(dtg.a.d, dtg.c.d)).xmap(dtg::a, dtg::a);
   dtg b = b(0);
   dtg c = c(0);

   static dtg a(int $$0) {
      return new dtg.b($$0);
   }

   static dtg b(int $$0) {
      return new dtg.a($$0);
   }

   static dtg c(int $$0) {
      return new dtg.c($$0);
   }

   static dtg a() {
      return b;
   }

   static dtg b() {
      return c;
   }

   private static dtg a(Either<dtg.b, Either<dtg.a, dtg.c>> $$0) {
      return (dtg)$$0.map(Function.identity(), $$0x -> (Record)$$0x.map(Function.identity(), Function.identity()));
   }

   private static Either<dtg.b, Either<dtg.a, dtg.c>> a(dtg $$0) {
      return $$0 instanceof dtg.b ? Either.left((dtg.b)$$0) : Either.right($$0 instanceof dtg.a ? Either.left((dtg.a)$$0) : Either.right((dtg.c)$$0));
   }

   int a(dtj var1);

   public static record a(int e) implements dtg {
      public static final Codec<dtg.a> d = Codec.intRange(dqm.e, dqm.d).fieldOf("above_bottom").xmap(dtg.a::new, dtg.a::c).codec();

      @Override
      public int a(dtj $$0) {
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

   public static record b(int e) implements dtg {
      public static final Codec<dtg.b> d = Codec.intRange(dqm.e, dqm.d).fieldOf("absolute").xmap(dtg.b::new, dtg.b::c).codec();

      @Override
      public int a(dtj $$0) {
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

   public static record c(int e) implements dtg {
      public static final Codec<dtg.c> d = Codec.intRange(dqm.e, dqm.d).fieldOf("below_top").xmap(dtg.c::new, dtg.c::c).codec();

      @Override
      public int a(dtj $$0) {
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
