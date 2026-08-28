import javax.annotation.Nullable;

public class ctn extends cvg {
   public static final int a = 3;
   public static final int b = 1;
   public static final int c = 3;

   public ctn(cvg.a $$0) {
      super($$0);
   }

   @Override
   public brk a(cyy $$0) {
      dds $$1 = $$0.q();
      je $$2 = $$0.a();
      je $$3 = $$2.a($$0.k());
      if (a($$0.n(), $$1, $$2)) {
         if (!$$1.B) {
            $$0.o().a(dyx.C);
            $$1.c(1505, $$2, 15);
         }

         return brk.a;
      } else {
         dua $$4 = $$1.a_($$2);
         boolean $$5 = $$4.c($$1, $$2, $$0.k());
         if ($$5 && a($$0.n(), $$1, $$3, $$0.k())) {
            if (!$$1.B) {
               $$0.o().a(dyx.C);
               $$1.c(1505, $$3, 15);
            }

            return brk.a;
         } else {
            return brk.e;
         }
      }
   }

   public static boolean a(cvl $$0, dds $$1, je $$2) {
      dua $$3 = $$1.a_($$2);
      if ($$3.b() instanceof dgy $$4 && $$4.b($$1, $$2, $$3)) {
         if ($$1 instanceof arg) {
            if ($$4.a($$1, $$1.z, $$2, $$3)) {
               $$4.a((arg)$$1, $$1.z, $$2, $$3);
            }

            $$0.h(1);
         }

         return true;
      }

      return false;
   }

   public static boolean a(cvl $$0, dds $$1, je $$2, @Nullable jj $$3) {
      if ($$1.a_($$2).a(dgx.G) && $$1.b_($$2).e() == 8) {
         if (!($$1 instanceof arg)) {
            return true;
         } else {
            azk $$4 = $$1.C_();

            label78:
            for (int $$5 = 0; $$5 < 128; $$5++) {
               je $$6 = $$2;
               dua $$7 = dgx.bw.o();

               for (int $$8 = 0; $$8 < $$5 / 16; $$8++) {
                  $$6 = $$6.b($$4.a(3) - 1, ($$4.a(3) - 1) * $$4.a(3) / 2, $$4.a(3) - 1);
                  if ($$1.a_($$6).m($$1, $$6)) {
                     continue label78;
                  }
               }

               jn<det> $$9 = $$1.t($$6);
               if ($$9.a(awr.ac)) {
                  if ($$5 == 0 && $$3 != null && $$3.o().d()) {
                     $$7 = lu.e.a(aws.as, $$1.z).map($$0x -> ((dgv)$$0x.a()).o()).orElse($$7);
                     if ($$7.b(dgg.c)) {
                        $$7 = $$7.b(dgg.c, $$3);
                     }
                  } else if ($$4.a(4) == 0) {
                     $$7 = lu.e.a(aws.aq, $$1.z).map($$0x -> ((dgv)$$0x.a()).o()).orElse($$7);
                  }
               }

               if ($$7.a(aws.as, $$0x -> $$0x.b(dgg.c))) {
                  for (int $$10 = 0; !$$7.a((ddv)$$1, $$6) && $$10 < 4; $$10++) {
                     $$7 = $$7.b(dgg.c, jj.c.a.a($$4));
                  }
               }

               if ($$7.a((ddv)$$1, $$6)) {
                  dua $$11 = $$1.a_($$6);
                  if ($$11.a(dgx.G) && $$1.b_($$6).e() == 8) {
                     $$1.a($$6, $$7, 3);
                  } else if ($$11.a(dgx.bw) && $$4.a(10) == 0) {
                     ((dgy)dgx.bw).a((arg)$$1, $$4, $$6, $$11);
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

   public static void a(ddt $$0, je $$1, int $$2) {
      dua $$3 = $$0.a_($$1);
      if ($$3.b() instanceof dgy $$4) {
         je $$5 = $$4.a($$1);
         switch ($$4.at_()) {
            case a:
               azg.a($$0, $$5, $$2 * 3, 3.0, 1.0, false, ln.O);
               break;
            case b:
               azg.a($$0, $$5, $$2, ln.O);
         }
      } else if ($$3.a(dgx.G)) {
         azg.a($$0, $$1, $$2 * 3, 3.0, 1.0, false, ln.O);
      }
   }
}
