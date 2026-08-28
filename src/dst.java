import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dst extends dke {
   public static final MapCodec<dst> a = b(dst::new);
   public static final dyh b = dyg.H;

   @Override
   public MapCodec<dst> a() {
      return a;
   }

   public dst(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dxq $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         if ($$1.C($$2)) {
            a($$1, $$2);
            $$1.a($$2, false);
         }
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1.C($$2)) {
         a($$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   public dxq a(dgz $$0, ji $$1, dxq $$2, cpr $$3) {
      if (!$$0.w_() && !$$3.gm().d && $$2.c(b)) {
         a($$0, $$1);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(ard $$0, ji $$1, dgs $$2) {
      clx $$3 = new clx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2.c());
      int $$4 = $$3.g();
      $$3.b((short)($$0.A.a($$4 / 4) + $$4 / 8));
      $$0.b($$3);
   }

   public static void a(dgz $$0, ji $$1) {
      a($$0, $$1, null);
   }

   private static void a(dgz $$0, ji $$1, @Nullable bvy $$2) {
      if (!$$0.C) {
         clx $$3 = new clx($$0, (double)$$1.u() + 0.5, (double)$$1.v(), (double)$$1.w() + 0.5, $$2);
         $$0.b($$3);
         $$0.a(null, $$3.dz(), $$3.dB(), $$3.dF(), awa.Aw, awb.e, 1.0F, 1.0F);
         $$0.a($$2, ecp.I, $$1);
      }
   }

   @Override
   protected bsy a(cxh $$0, dxq $$1, dgz $$2, ji $$3, cpr $$4, bsx $$5, fbt $$6) {
      if (!$$0.a(cxl.oZ) && !$$0.a(cxl.uX)) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
      } else {
         a($$2, $$3, $$4);
         $$2.a($$3, dkg.a.m(), 11);
         cxd $$7 = $$0.h();
         if ($$0.a(cxl.oZ)) {
            $$0.a(1, $$4, bvy.d($$5));
         } else {
            $$0.a(1, $$4);
         }

         $$4.b(awk.c.b($$7));
         return bsy.a;
      }
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      if ($$0 instanceof ard $$4) {
         ji $$5 = $$2.b();
         bva $$6 = $$3.q();
         if ($$3.bX() && $$3.c($$4, $$5)) {
            a($$0, $$5, $$6 instanceof bvy ? (bvy)$$6 : null);
            $$0.a($$5, false);
         }
      }
   }

   @Override
   public boolean a(dgs $$0) {
      return false;
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
