import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bwg extends bwh {
   private static final List<cry> c = ImmutableList.of(csg.pv, csg.vl);

   @Override
   protected void a(aqe $$0, cjy $$1) {
      Optional<iu> $$2 = $$1.dQ().c(cah.c);
      if (!$$2.isEmpty()) {
         iu $$3 = $$2.get();
         dpy $$4 = $$0.a_($$3.b());
         if ($$4.a(dcx.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(aqe $$0, cjy $$1, iu $$2, dpy $$3) {
      im $$4 = $$2.b();
      if ($$3.c(deg.e) == 8) {
         $$3 = deg.a($$1, $$3, (czu)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      boz $$8 = $$1.y();
      int $$9 = $$8.b();
      dpy $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         csd $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.f());
         if ($$13 != -1) {
            int $$14 = $$12.G();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = deg.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(deg.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(aqe $$0, dpy $$1, im $$2, dpy $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cjy $$0) {
      boz $$1 = $$0.y();
      if ($$1.a_(csg.px) <= 36) {
         int $$2 = $$1.a_(csg.pw);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(csg.pw, $$6);
            csd $$7 = $$1.a(new csd(csg.px, $$5));
            if (!$$7.d()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
