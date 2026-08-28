import com.mojang.serialization.Codec;

public class egp extends eew<ehh> {
   private static final jm[] a = jm.values();

   public egp(Codec<ehh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eey<ehh> $$0) {
      dgk $$1 = $$0.b();
      jh $$2 = $$0.e();
      azu $$3 = $$0.d();
      if (!$$1.u($$2)) {
         return false;
      } else {
         dvv $$4 = $$1.a_($$2.d());
         if (!$$4.a(dis.dV) && !$$4.a(dis.kK)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(dfn $$0, azu $$1, jh $$2) {
      $$0.a($$2, dis.kK.m(), 2);
      jh.a $$3 = new jh.a();
      jh.a $$4 = new jh.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.u($$3)) {
            int $$6 = 0;

            for (jm $$7 : a) {
               dvv $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dis.dV) || $$8.a(dis.kK)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dis.kK.m(), 2);
            }
         }
      }
   }

   private void b(dfn $$0, azu $$1, jh $$2) {
      jh.a $$3 = new jh.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.u($$3)) {
            dvv $$5 = $$0.a_($$3.d());
            if ($$5.a(dis.dV) || $$5.a(dis.kK)) {
               int $$6 = azm.a($$1, 1, 8);
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

   public static void a(dfn $$0, azu $$1, jh.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.u($$2)) {
            if ($$6 == $$3 || !$$0.u($$2.e())) {
               $$0.a($$2, dis.oz.m().b(dme.e, Integer.valueOf(azm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dis.oA.m(), 2);
         }

         $$2.c(jm.a);
      }
   }
}
