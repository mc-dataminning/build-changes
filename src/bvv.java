import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class bvv extends bvw {
   private static final List<crn> c = ImmutableList.of(crv.pu, crv.vj);

   @Override
   protected void a(apu $$0, cjn $$1) {
      Optional<im> $$2 = $$1.dP().c(bzw.c);
      if (!$$2.isEmpty()) {
         im $$3 = $$2.get();
         dpi $$4 = $$0.a_($$3.b());
         if ($$4.a(dcj.pc)) {
            this.a($$1);
            this.a($$0, $$1, $$3, $$4);
         }
      }
   }

   private void a(apu $$0, cjn $$1, im $$2, dpi $$3) {
      id $$4 = $$2.b();
      if ($$3.c(dds.e) == 8) {
         $$3 = dds.a($$1, $$3, (czg)$$0, $$4);
      }

      int $$5 = 20;
      int $$6 = 10;
      int[] $$7 = new int[c.size()];
      boo $$8 = $$1.y();
      int $$9 = $$8.b();
      dpi $$10 = $$3;

      for (int $$11 = $$9 - 1; $$11 >= 0 && $$5 > 0; $$11--) {
         crs $$12 = $$8.a($$11);
         int $$13 = c.indexOf($$12.f());
         if ($$13 != -1) {
            int $$14 = $$12.G();
            int $$15 = $$7[$$13] + $$14;
            $$7[$$13] = $$15;
            int $$16 = Math.min(Math.min($$15 - 10, $$5), $$14);
            if ($$16 > 0) {
               $$5 -= $$16;

               for (int $$17 = 0; $$17 < $$16; $$17++) {
                  $$10 = dds.a($$1, $$10, $$0, $$12, $$4);
                  if ($$10.c(dds.e) == 7) {
                     this.a($$0, $$3, $$4, $$10);
                     return;
                  }
               }
            }
         }
      }

      this.a($$0, $$3, $$4, $$10);
   }

   private void a(apu $$0, dpi $$1, id $$2, dpi $$3) {
      $$0.c(1500, $$2, $$3 != $$1 ? 1 : 0);
   }

   private void a(cjn $$0) {
      boo $$1 = $$0.y();
      if ($$1.a_(crv.pw) <= 36) {
         int $$2 = $$1.a_(crv.pv);
         int $$3 = 3;
         int $$4 = 3;
         int $$5 = Math.min(3, $$2 / 3);
         if ($$5 != 0) {
            int $$6 = $$5 * 3;
            $$1.a(crv.pv, $$6);
            crs $$7 = $$1.a(new crs(crv.pw, $$5));
            if (!$$7.d()) {
               $$0.a($$7, 0.5F);
            }
         }
      }
   }
}
