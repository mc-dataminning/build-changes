import com.mojang.serialization.MapCodec;

public class dqg extends dlv implements dqf {
   public static final MapCodec<dqg> b = b(dqg::new);

   @Override
   public MapCodec<dqg> a() {
      return b;
   }

   public dqg(dwu.d $$0) {
      super(brk.a(1), $$0);
   }

   @Override
   public int a(dqk.a $$0, dgh $$1, ji $$2, azg $$3, dqk $$4, boolean $$5) {
      int $$6 = $$0.b();
      if ($$6 != 0 && $$3.a($$4.f()) == 0) {
         ji $$7 = $$0.a();
         boolean $$8 = $$7.a($$2, (double)$$4.e());
         if (!$$8 && a($$1, $$7)) {
            int $$9 = $$4.d();
            if ($$3.a($$9) < $$6) {
               ji $$10 = $$7.d();
               dwv $$11 = this.a($$1, $$10, $$3, $$4.h());
               $$1.a($$10, $$11, 3);
               $$1.a(null, $$7, $$11.A().e(), awa.e, 1.0F, 1.0F);
            }

            return Math.max(0, $$6 - $$9);
         } else {
            return $$3.a($$4.g()) != 0 ? $$6 : $$6 - ($$8 ? 1 : a($$4, $$7, $$2, $$6));
         }
      } else {
         return $$6;
      }
   }

   private static int a(dqk $$0, ji $$1, ji $$2, int $$3) {
      int $$4 = $$0.e();
      float $$5 = ayy.l((float)Math.sqrt($$1.j($$2)) - (float)$$4);
      int $$6 = ayy.h(24 - $$4);
      float $$7 = Math.min(1.0F, $$5 / (float)$$6);
      return Math.max(1, (int)((float)$$3 * $$7 * 0.5F));
   }

   private dwv a(dgh $$0, ji $$1, azg $$2, boolean $$3) {
      dwv $$4;
      if ($$2.a(11) == 0) {
         $$4 = djm.rx.m().b(dqj.d, Boolean.valueOf($$3));
      } else {
         $$4 = djm.rs.m();
      }

      return $$4.b(dxl.J) && !$$0.b_($$1).c() ? $$4.b(dxl.J, Boolean.valueOf(true)) : $$4;
   }

   private static boolean a(dgh $$0, ji $$1) {
      dwv $$2 = $$0.a_($$1.d());
      if ($$2.l() || $$2.a(djm.J) && $$2.y().b(esy.c)) {
         int $$3 = 0;

         for (ji $$4 : ji.c($$1.b(-4, 0, -4), $$1.b(4, 2, 4))) {
            dwv $$5 = $$0.a_($$4);
            if ($$5.a(djm.rs) || $$5.a(djm.rx)) {
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
