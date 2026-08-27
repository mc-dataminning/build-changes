import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eed extends eeo {
   public static final Codec<eed> a = bnf.b(0, 256).fieldOf("count").xmap(eed::new, $$0 -> $$0.c).codec();
   private final bnf c;

   private eed(bnf $$0) {
      this.c = $$0;
   }

   public static eed a(bnf $$0) {
      return new eed($$0);
   }

   public static eed a(int $$0) {
      return a(bnc.a($$0));
   }

   @Override
   public Stream<ib> a_(eem $$0, axr $$1, ib $$2) {
      Builder<ib> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dur.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new ib($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eep<?> b() {
      return eep.i;
   }

   private static int a(eem $$0, int $$1, int $$2, int $$3, int $$4) {
      ib.a $$5 = new ib.a($$1, $$2, $$3);
      int $$6 = 0;
      doz $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         doz $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dca.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(doz $$0) {
      return $$0.i() || $$0.a(dca.G) || $$0.a(dca.H);
   }
}
