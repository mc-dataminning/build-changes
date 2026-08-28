import javax.annotation.Nullable;

public class cux extends cwl {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public cux(cwl.a $$0) {
      super($$0);
   }

   @Override
   public bsj a(dai $$0) {
      dgi $$1 = $$0.q();
      ji $$2 = $$0.a();
      ji $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.C) {
            $$0.o().a(ebt.C);
            $$1.c(1505, $$2, 15);
         }

         return bsj.a;
      } else {
         dwx $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.C) {
               $$0.o().a(ebt.C);
               $$1.c(1505, $$3, 15);
            }

            return bsj.a;
         } else {
            return bsj.e;
         }
      }
   }

   public static boolean a(cwp $$0, dgi $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2);
      if ($$3.b() instanceof djp $$4 && $$4.a($$1, $$2, $$3)) {
         if ($$1 instanceof arc) {
            if ($$4.a($$1, $$1.A, $$2, $$3)) {
               $$4.a((arc)$$1, $$1.A, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cwp $$0, dgi $$1, ji $$2, @Nullable jn $$3) {
      if ($$1.a_($$2).a(djo.J) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arc)) {
            return true;
         } else {
            azh $$4 = $$1.H_();

            label80:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               ji $$6 = $$2;
               dwx $$7 = djo.bD.m();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label80;
                  }
               }

               jr<dhk> $$9 = $$1.t($$6);
               if ($$9.a(awo.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = mb.e.a(awp.au, $$1.A).map($$0x -> ((djm)$$0x.a()).m()).orElse($$7);
                     if ($$7.b(dix.c)) {
                        $$7 = $$7.b(dix.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = mb.e.a(awp.as, $$1.A).map($$0x -> ((djm)$$0x.a()).m()).orElse($$7);
                  }
               }

               if ($$7.a(awp.au, $$0x -> $$0x.b(dix.c))) {
                  for (int $$10 = 0; !$$7.a((dgl)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dix.c, jn.c.a.a($$4));
                  }
               }

               if ($$7.a((dgl)$$1, $$6)) {
                  dwx $$11 = $$1.a_($$6);
                  if ($$11.a(djo.J) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(djo.bD) && ((djp)djo.bD).a($$1, $$6, $$11) && $$4.a(10) == 0) {
                     ((djp)djo.bD).a((arc)$$1, $$4, $$6, $$11);
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

   public static void a(dgj $$0, ji $$1, int $$2) {
      dwx $$3 = $$0.a_($$1);
      if ($$3.b() instanceof djp $$4) {
         ji $$5 = $$4.a($$1);
         switch ($$4.aq_()) {
            case a:
               azd.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, lt.P);
               break;
            case b:
               azd.a($$0, $$5, $$2, lt.P);
         }
      } else if ($$3.a(djo.J)) {
         azd.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, lt.P);
      }
   }
}
