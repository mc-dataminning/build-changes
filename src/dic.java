import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dic extends dfc {
   public static final MapCodec<dic> a = b(dic::new);
   public static final duc b = dts.aQ;
   protected static final exn c = dfc.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dic> a() {
      return a;
   }

   protected dic(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$1 == iw.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof die || $$3.b() instanceof dsu;
   }

   @Override
   public dtc a(cyd $$0) {
      return !this.n().a((dcd)$$0.q(), $$0.a()) ? ($$0.q().z_() ? dfe.n : dfe.m).n() : super.a($$0);
   }

   @Override
   protected boolean f_(dtc $$0) {
      return true;
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return c;
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      int $$4 = $$0.c(b);
      if (!a((dcd)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((dbg)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dca $$0, dtc $$1, ir $$2, brv $$3, float $$4) {
      if (!$$0.C && $$0.A.i() < $$4 - 0.5F && $$3 instanceof bso && ($$3 instanceof cly || $$0.ab().b(dbw.c)) && $$3.do() * $$3.do() * $$3.dp() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable brv $$0, dtc $$1, dca $$2, ir $$3) {
      dtc $$4 = a($$1, ($$2.z_() ? dfe.n : dfe.m).n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dxv.c, $$3, dxv.a.a($$0, $$4));
   }

   private static boolean a(dbg $$0, ir $$1) {
      return $$0.z_() ? true : $$0.a_($$1.c()).a(awe.cA);
   }

   private static boolean a(dcd $$0, ir $$1) {
      for (ir $$2 : ir.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(awj.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
