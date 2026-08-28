import com.mojang.serialization.Codec;

public class elf extends ejm<elx> {
   private static final ja[] a = ja.values();

   public elf(Codec<elx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elx> $$0) {
      djz $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         eah $$4 = $$1.a_($$2.d());
         if (!$$4.a(dmh.em) && !$$4.a(dmh.lq)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(djb $$0, azv $$1, iu $$2) {
      $$0.a($$2, dmh.lq.m(), 2);
      iu.a $$3 = new iu.a();
      iu.a $$4 = new iu.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.v($$3)) {
            int $$6 = 0;

            for (ja $$7 : a) {
               eah $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dmh.em) || $$8.a(dmh.lq)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dmh.lq.m(), 2);
            }
         }
      }
   }

   private void b(djb $$0, azv $$1, iu $$2) {
      iu.a $$3 = new iu.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.v($$3)) {
            eah $$5 = $$0.a_($$3.d());
            if ($$5.a(dmh.em) || $$5.a(dmh.lq)) {
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

   public static void a(djb $$0, azv $$1, iu.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.e())) {
               $$0.a($$2, dmh.pf.m().b(dpy.e, Integer.valueOf(azm.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dmh.pg.m(), 2);
         }

         $$2.c(ja.a);
      }
   }
}
