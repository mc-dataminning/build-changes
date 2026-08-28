import com.mojang.serialization.Codec;

public class emd extends ekk<emw> {
   private static final jb[] a = jb.values();

   public emd(Codec<emw> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ekm<emw> $$0) {
      dkw $$1 = $$0.b();
      iv $$2 = $$0.e();
      azx $$3 = $$0.d();
      if (!$$1.v($$2)) {
         return false;
      } else {
         ebe $$4 = $$1.a_($$2.d());
         if (!$$4.a(dne.em) && !$$4.a(dne.lq)) {
            return false;
         } else {
            this.a($$1, $$3, $$2);
            this.b($$1, $$3, $$2);
            return true;
         }
      }
   }

   private void a(djy $$0, azx $$1, iv $$2) {
      $$0.a($$2, dne.lq.m(), 2);
      iv.a $$3 = new iv.a();
      iv.a $$4 = new iv.a();

      for (int $$5 = 0; $$5 < 200; $$5++) {
         $$3.a($$2, $$1.a(6) - $$1.a(6), $$1.a(2) - $$1.a(5), $$1.a(6) - $$1.a(6));
         if ($$0.v($$3)) {
            int $$6 = 0;

            for (jb $$7 : a) {
               ebe $$8 = $$0.a_($$4.a($$3, $$7));
               if ($$8.a(dne.em) || $$8.a(dne.lq)) {
                  $$6++;
               }

               if ($$6 > 1) {
                  break;
               }
            }

            if ($$6 == 1) {
               $$0.a($$3, dne.lq.m(), 2);
            }
         }
      }
   }

   private void b(djy $$0, azx $$1, iv $$2) {
      iv.a $$3 = new iv.a();

      for (int $$4 = 0; $$4 < 100; $$4++) {
         $$3.a($$2, $$1.a(8) - $$1.a(8), $$1.a(2) - $$1.a(7), $$1.a(8) - $$1.a(8));
         if ($$0.v($$3)) {
            ebe $$5 = $$0.a_($$3.d());
            if ($$5.a(dne.em) || $$5.a(dne.lq)) {
               int $$6 = azo.a($$1, 1, 8);
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

   public static void a(djy $$0, azx $$1, iv.a $$2, int $$3, int $$4, int $$5) {
      for (int $$6 = 0; $$6 <= $$3; $$6++) {
         if ($$0.v($$2)) {
            if ($$6 == $$3 || !$$0.v($$2.e())) {
               $$0.a($$2, dne.pf.m().b(dqv.e, Integer.valueOf(azo.a($$1, $$4, $$5))), 2);
               break;
            }

            $$0.a($$2, dne.pg.m(), 2);
         }

         $$2.c(jb.a);
      }
   }
}
