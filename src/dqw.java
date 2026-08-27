import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

@Deprecated
public class dqw extends drh {
   public static final Codec<dqw> a = bdc.b(0, 256).fieldOf("count").xmap(dqw::new, $$0 -> $$0.c).codec();
   private final bdc c;

   private dqw(bdc $$0) {
      this.c = $$0;
   }

   public static dqw a(bdc $$0) {
      return new dqw($$0);
   }

   public static dqw a(int $$0) {
      return a(bcz.a($$0));
   }

   @Override
   public Stream<gu> a_(drf $$0, apf $$1, gu $$2) {
      Builder<gu> $$3 = Stream.builder();
      int $$4 = 0;

      boolean $$5;
      do {
         $$5 = false;

         for (int $$6 = 0; $$6 < this.c.a($$1); $$6++) {
            int $$7 = $$1.a(16) + $$2.u();
            int $$8 = $$1.a(16) + $$2.w();
            int $$9 = $$0.a(dhk.a.e, $$7, $$8);
            int $$10 = a($$0, $$7, $$9, $$8, $$4);
            if ($$10 != Integer.MAX_VALUE) {
               $$3.add(new gu($$7, $$10, $$8));
               $$5 = true;
            }
         }

         $$4++;
      } while ($$5);

      return $$3.build();
   }

   @Override
   public dri<?> b() {
      return dri.i;
   }

   private static int a(drf $$0, int $$1, int $$2, int $$3, int $$4) {
      gu.a $$5 = new gu.a($$1, $$2, $$3);
      int $$6 = 0;
      dcb $$7 = $$0.a($$5);

      for (int $$8 = $$2; $$8 >= $$0.c() + 1; $$8--) {
         $$5.q($$8 - 1);
         dcb $$9 = $$0.a($$5);
         if (!a($$9) && a($$7) && !$$9.a(cpo.F)) {
            if ($$6 == $$4) {
               return $$5.v() + 1;
            }

            $$6++;
         }

         $$7 = $$9;
      }

      return Integer.MAX_VALUE;
   }

   private static boolean a(dcb $$0) {
      return $$0.i() || $$0.a(cpo.G) || $$0.a(cpo.H);
   }
}
