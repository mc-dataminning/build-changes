import com.mojang.serialization.MapCodec;

public class drg extends dmy implements drf {
   public static final MapCodec<drg> b = b(drg::new);

   @Override
   public MapCodec<drg> a() {
      return b;
   }

   public drg(dxu.d $$0) {
      super(bsl.a(1), $$0);
   }

   @Override
   public int a(drk.a $$0, dhj $$1, jh $$2, bam $$3, drk $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         jh $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               jh $$10 = $$7.d();
               dxv $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), axg.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(drk $$0, jh $$1, jh $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = bae.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = bae.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dxv a(dhj $$0, jh $$1, bam $$2, boolean $$3) {
      dxv $$4;
      if ($$2.a(11) == 0) {
         $$4 = dko.rq.m().b(drj.d, Boolean.valueOf($$3));
      } else {
         $$4 = dko.rl.m();
      }

      return $$4.b(dyl.D) && !$$0.b_($$1).c() ? $$4.b(dyl.D, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dhj $$0, jh $$1) {
      dxv $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(dko.J) && $$2.y().b(ety.c)) {
         int $$3 = 0;

         for (jh $$4 : jh.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dxv $$5 = $$0.a_($$4);
            if ($$5.a(dko.rl) || $$5.a(dko.rq)) {
               $$3++;
            }

            if ($$3 > 2) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean d() {
      return false;
   }
}
