import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbv extends dfr {
   public static final MapCodec<dbv> a = b(dbv::new);
   public static final dqs b = dgr.aE;
   private static final ety c = dcv.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final ety d = dcv.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final ety e = dcv.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final ety f = dcv.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final ety g = dcv.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final ety h = dcv.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final ety i = dcv.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final ety j = etv.a(c, d, e, f);
   private static final ety k = etv.a(c, g, h, i);
   private static final ws l = ws.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dbv> a() {
      return a;
   }

   public dbv(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c));
   }

   @Override
   public dpy a(cvl $$0) {
      return this.n().a(b, $$0.g().h());
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avj.aC);
         return boq.b;
      }
   }

   @Nullable
   @Override
   protected bou b(dpy $$0, czu $$1, im $$2) {
      return new bpa(($$2x, $$3, $$4) -> new cnj($$2x, $$3, cns.a($$1, $$2)), l);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      ir $$4 = $$0.c(b);
      return $$4.o() == ir.a.a ? j : k;
   }

   @Override
   protected void a(cgu $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, dpy $$3, cgu $$4) {
      if (!$$4.aU()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(czu $$0, im $$1, cgu $$2) {
      if (!$$2.aU()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public bpj a(bql $$0) {
      return $$0.dO().b($$0);
   }

   @Nullable
   public static dpy e(dpy $$0) {
      if ($$0.a(dcx.gS)) {
         return dcx.gT.n().a(b, $$0.c(b));
      } else {
         return $$0.a(dcx.gT) ? dcx.gU.n().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   public int b(dpy $$0, cza $$1, im $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
