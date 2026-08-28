import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsq extends dke {
   public static final MapCodec<dsq> a = b(dsq::new);
   public static final dye b = dyd.C;

   @Override
   public MapCodec<dsq> a() {
      return a;
   }

   public dsq(dxm.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void b(dxn $$0, dha $$1, jh $$2, dxn $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, dke $$3, @Nullable eux $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dxn a(dha $$0, jh $$1, dxn $$2, cps $$3) {
      if (!$$0.B_() && !$$3.b() && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ash $$0, jh $$1, dgs $$2) {
      clx $$3 = new clx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.m();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dha $$0, jh $$1) {
      a($$0, $$1, null);
   }

   private static void a(dha $$0, jh $$1, @Nullable bwb $$2) {
      if (!$$0.C) {
         clx $$3 = new clx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dA(), $$3.dC(), $$3.dG(), axf.zW, axg.e, 1.0F, 1.0F);
         $$0.a($$2, ecj.I, $$1);
      }
   }

   @Override
   protected bte a(cxk $$0, dxn $$1, dha $$2, jh $$3, cps $$4, btd $$5, fbo $$6) {
      if (!$$0.a(cxo.oO) && !$$0.a(cxo.uM)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dkg.a.m(), 11);
         cxg $$7 = $$0.h();
         if ($$0.a(cxo.oO)) {
            $$0.a(1, $$4, bwb.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(axp.c.b($$7));
         return bte.a;
      }
   }

   @Override
   protected void a(dha $$0, dxn $$1, fbo $$2, cql $$3) {
      if ($$0 instanceof ash $$4) {
         jh $$5 = $$2.b();
         bvf $$6 = $$3.p();
         if ($$3.bY() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bwb ? (bwb)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dgs $$0) {
      return false;
   }

   @Override
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }
}
