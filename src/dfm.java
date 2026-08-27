import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfm extends dbp<dny> implements djw {
   public static final MapCodec<dfm> b = b(dfm::new);
   public static final dqs c = dgr.aE;
   public static final dqp d = dqo.C;
   protected static final ety e = dcv.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final ws f = ws.c("container.enderchest");

   @Override
   public MapCodec<dfm> a() {
      return b;
   }

   protected dfm(dpx.d $$0) {
      super($$0, () -> dnf.d);
      this.k(this.E.b().a(c, ir.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dfc.c<? extends dnk> a(dpy $$0, czu $$1, im $$2, boolean $$3) {
      return dfc.b::b;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e;
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.b;
   }

   @Override
   public dpy a(cvl $$0) {
      elr $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == els.c));
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      cou $$5 = $$3.gn();
      dnd $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dny) {
         im $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return boq.a($$1.B);
         } else if ($$1.B) {
            return boq.a;
         } else {
            dny $$8 = (dny)$$6;
            $$5.a($$8);
            $$3.a(new bpa(($$1x, $$2x, $$3x) -> cno.a($$1x, $$2x, $$5), f));
            $$3.a(avj.aj);
            cjc.a($$3, true);
            return boq.b;
         }
      } else {
         return boq.a($$1.B);
      }
   }

   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dny($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return $$0.B ? a($$2, dnf.d, dny::a) : null;
   }

   @Override
   public void a(dpy $$0, czu $$1, im $$2, ayd $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kw.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(d) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      dnd $$4 = $$1.c_($$2);
      if ($$4 instanceof dny) {
         ((dny)$$4).b();
      }
   }
}
