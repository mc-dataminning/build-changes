import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dhl implements dff, dmr {
   public static final MapCodec<dmv> c = b(dmv::new);
   private static final dtt g = dts.C;
   public static final dtw d = dts.R;
   protected static final float e = 6.0F;
   protected static final exn f = dfc.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dmv> a() {
      return c;
   }

   public dmv(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dty.b).a(g, Boolean.valueOf(false)).a(d, iw.c));
   }

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
      return f;
   }

   @Override
   protected boolean b(dtc $$0, dbg $$1, ir $$2) {
      return $$0.a(awe.bz) || $$1.b_($$2.c()).a(epf.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dtc a(cyd $$0) {
      dtc $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(dca $$0, ir $$1, dtc $$2, bso $$3, cuh $$4) {
      if (!$$0.x_()) {
         ir $$5 = $$1.c();
         dtc $$6 = dhl.c($$0, $$5, this.n().a(b, dty.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(g) ? epf.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      if ($$0.c(b) == dty.a) {
         return super.a($$0, $$1, $$2);
      } else {
         ir $$3 = $$2.d();
         dtc $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(dcd $$0, ir $$1, dtc $$2) {
      return true;
   }

   @Override
   public boolean a(dca $$0, ayt $$1, ir $$2, dtc $$3) {
      return true;
   }

   @Override
   public void a(aqt $$0, ayt $$1, ir $$2, dtc $$3) {
      if ($$3.c(dhl.b) == dty.b) {
         ir $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dez.a($$0, $$1, $$2, $$3.c(d));
      } else {
         ir $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float ar_() {
      return 0.1F;
   }
}
