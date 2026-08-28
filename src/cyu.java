import javax.annotation.Nullable;

public class cyu extends dag {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cyu(dag.a $$0) {
      super($$0);
   }

   @Override
   public bvc a(def $$0) {
      dkj $$1 = $$0.q();
      iw $$2 = $$0.a();
      iw $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(egq.C);
            $$1.c(1505, $$2, 15);
         }

         return bvc.a;
      } else {
         ebq $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(egq.C);
               $$1.c(1505, $$3, 15);
            }

            return bvc.a;
         } else {
            return bvc.e;
         }
      }
   }

   public static boolean a(dak $$0, dkj $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dnr $$4 && $$4.a((dkm)$$1, $$2, $$3)) {
         if ($$1 instanceof asb) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((asb)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(dak $$0, dkj $$1, iw $$2, @Nullable jc $$3) {
      if ($$1.a_($$2).a(dnq.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof asb)) {
            return true;
         } else {
            bai $$4 = $$1.G_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               iw $$6 = $$2;
               ebq $$7 = dnq.bG.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jg<dlm> $$9 = $$1.u($$6);
               if ($$9.a(axm.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mh.e.a(axn.au, $$1.A).map($$0x -> ((dno)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dmz.d)) {
                        $$7 = $$7.b(dmz.d, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mh.e.a(axn.as, $$1.A).map($$0x -> ((dno)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(axn.au, $$0x -> $$0x.b(dmz.d))) {
                  for (int $$10 = 0; !$$7.a((dkm)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dmz.d, jc.c.a.a($$4));
                  }
               }

               if ($$7.a((dkm)$$1, $$6)) {
                  ebq $$11 = $$1.a_($$6);
                  if ($$11.a(dnq.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dnq.bG) && ((dnr)dnq.bG).a((dkm)$$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((dnr)dnq.bG).a((asb)$$1, $$4, $$6, $$11);
                  }
               }
            }

            $$0.h(1);
            return true;
         }
      } else {
         return false;
      }
   }

   public static void a(dkk $$0, iw $$1, int $$2) {
      ebq $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dnr $$4) {
         iw $$5 = $$4.a($$1);
         switch ($$4.an_()) {
            case a:
               bad.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lz.Q);
               break;
            case b:
               bad.a($$0, $$5, $$2, lz.Q);
         }
      } else if ($$3.a(dnq.J)) {
         bad.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lz.Q);
      }
   }
}
