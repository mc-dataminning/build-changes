import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djp extends dch implements djw {
   public static final MapCodec<djp> a = b(djp::new);
   public static final dqp b = dqo.F;
   public static final dqp c = dqo.C;
   public static final dqp d = dqo.G;
   protected static final ety e = dcv.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final double f = e.c(ir.a.b);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   public djp(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b);
      $$0.a(c);
      $$0.a(d);
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bql $$3) {
      if ($$0 instanceof aqe $$4) {
         aqf $$5 = dol.a($$3);
         if ($$5 != null) {
            $$4.a($$1, dnf.L).ifPresent($$2x -> $$2x.a($$4, $$5));
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dpy $$3, boolean $$4) {
      if ($$1 instanceof aqe $$5 && $$0.c(b) && !$$0.a($$3.b())) {
         $$5.a($$2, dnf.L).ifPresent($$1x -> $$1x.a($$5));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, ayd $$3) {
      if ($$0.c(b)) {
         $$1.a($$2, $$0.a(b, Boolean.valueOf(false)), 3);
         $$1.a($$2, dnf.L).ifPresent($$1x -> $$1x.a($$1));
      }
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return e;
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      return e;
   }

   @Override
   protected boolean g_(dpy $$0) {
      return true;
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dol($$0, $$1);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      return this.n().a(c, Boolean.valueOf($$0.q().b_($$0.a()).a() == els.c));
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(c) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected void a(dpy $$0, aqe $$1, im $$2, csd $$3, boolean $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      if ($$4) {
         this.a($$1, $$2, $$3, bns.a(5));
      }
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return !$$0.B ? dch.a($$2, dnf.L, ($$0x, $$1x, $$2x, $$3) -> dva.c.a($$0x, $$3.gr(), $$3.gs())) : null;
   }
}
