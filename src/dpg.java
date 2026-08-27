import com.mojang.serialization.Codec;

public class dpg extends dnn<dpy> {
   private static final ha[] a = ha.values();

   public dpg(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnp<dpy> $$0) {
      cqg $$1 = $$0.b();
      gu $$2 = $$0.e();
      aru $$3 = $$0.d();
      if (!$$1.t($$2)) {
         return false;
      } else {
         dfa $$4 = $$1.a_($$2.c());
         if (!$$4.a(csn.dW) && !$$4.a(csn.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(cpn $$0, aru $$1, gu $$2) {
      $$0.a($$2, csn.kK.n(), 2);
      gu.a $$3 = new gu.a();
      gu.a $$4 = new gu.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.t($$3)) {
            int $$6 = 0;

            for (ha $$7 : a) {
               dfa $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(csn.dW) || $$8.a(csn.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, csn.kK.n(), 2);
            }
         }
      }
   }

   private void b(cpn $$0, aru $$1, gu $$2) {
      gu.a $$3 = new gu.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.t($$3)) {
            dfa $$5 = $$0.a_($$3.c());
            if ($$5.a(csn.dW) || $$5.a(csn.kK)) {
               int $$6 = arp.a($$1, 1, 8);
               if ($$1.a(6) == 0) {
                  $$6 *= 2;
               }

               if ($$1.a(5) == 0) {
                  $$6 = 1;
               }

               int $$7 = 17;
               int $$8 = 25;
               a($$0, $$1, $$3, $$6, 17, 25);
            }
         }
      }
   }

   public static void a(cpn $$0, aru $$1, gu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.t($$2)) {
            if ($$6 == $$3 || !$$0.t($$2.d())) {
               $$0.a($$2, csn.oz.n().a(cvz.d, Integer.valueOf(arp.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, csn.oA.n(), 2);
         }

         $$2.c(ha.a);
      }
   }
}
