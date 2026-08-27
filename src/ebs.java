import com.mojang.serialization.Codec;

public class ebs extends dzz<eck> {
   private static final it[] a = it.values();

   public ebs(Codec<eck> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<eck> $$0) {
      dbu $$1 = $$0.b();
      io $$2 = $$0.e();
      aym $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         drd $$4 = $$1.a_($$2.c());
         if (!$$4.a(dec.dV) && !$$4.a(dec.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dba $$0, aym $$1, io $$2) {
      $$0.a($$2, dec.kK.n(), 2);
      io.a $$3 = new io.a();
      io.a $$4 = new io.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (it $$7 : a) {
               drd $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dec.dV) || $$8.a(dec.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dec.kK.n(), 2);
            }
         }
      }
   }

   private void b(dba $$0, aym $$1, io $$2) {
      io.a $$3 = new io.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            drd $$5 = $$0.a_($$3.c());
            if ($$5.a(dec.dV) || $$5.a(dec.kK)) {
               int $$6 = ayf.a($$1, 1, 8);
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

   public static void a(dba $$0, aym $$1, io.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.d())) {
               $$0.a($$2, dec.oz.n().a(dhp.e, Integer.valueOf(ayf.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dec.oA.n(), 2);
         }

         $$2.c(it.a);
      }
   }
}
