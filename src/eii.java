import com.mojang.serialization.MapCodec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class eii extends eit {
   public static final MapCodec<eii> a = bpv.b(0, 256).fieldOf("count").xmap(eii::new, $$0 -> $$0.c);
   private final bpv c;

   private eii(bpv $$0) {
      this.c = $$0;
   }

   public static eii a(bpv $$0) {
      return new eii($$0);
   }

   public static eii a(int $$0) {
      return a(bps.a($$0));
   }

   @Override
   public Stream<jd> a_(eir $$0, ayv $$1, jd $$2) {
      Builder<jd> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dyv.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new jd($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public eiu<?> b() {
      return eiu.i;
   }

   private static int a(eir $$0, int $$1, int $$2, int $$3, int $$4) {
      jd.a $$5 = new jd.a($$1, $$2, $$3);
      int $$6 = 0;
      dta $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dta $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(dfy.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dta $$0) {
      return $$0.i() || $$0.a(dfy.G) || $$0.a(dfy.H);
   }
}
