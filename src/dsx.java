import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsx extends dkl {
   public static final MapCodec<dsx> a = b(dsx::new);
   public static final dyl b = dyk.C;

   @Override
   public MapCodec<dsx> a() {
      return a;
   }

   public dsx(dxt.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dkl $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dxu a(dhh $$0, jh $$1, dxu $$2, cpw $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ash $$0, jh $$1, dgz $$2) {
      cmb $$3 = new cmb($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dhh $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dhh $$0, jh $$1, @Nullable bwf $$2) {
      if (!$$0.C) {
         cmb $$3 = new cmb($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dB(), $$3.dD(), $$3.dH(), axf.zX, axg.e, 1.0F, 1.0F);
         $$0.a($$2, ecq.I, $$1);
      }
   }

   @Override
   protected bti a(cxo $$0, dxu $$1, dhh $$2, jh $$3, cpw $$4, bth $$5, fbt $$6) {
      if (!$$0.a(cxs.oO) && !$$0.a(cxs.uM)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dkn.a.m(), 11);
         cxk $$7 = $$0.h();
         if ($$0.a(cxs.oO)) {
            $$0.a(1, $$4, bwf.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(axp.c.b($$7));
         return bti.a;
      }
   }

   @Override
   protected void a(dhh $$0, dxu $$1, fbt $$2, cqp $$3) {
      if ($$0 instanceof ash $$4) {
         jh $$5 = $$2.b();
         bvj $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bwf ? (bwf)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dgz $$0) {
      return false;
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
