import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dka extends dfd implements dcy, djw {
   public static final MapCodec<dka> c = b(dka::new);
   private static final dqp g = dqo.C;
   public static final dqs d = dqo.R;
   protected static final float e = 6.0F;
   protected static final ety f = dcv.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dka> a() {
      return c;
   }

   public dka(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqu.b).a(g, Boolean.valueOf(false)).a(d, ir.c));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return f;
   }

   @Override
   protected boolean b(dpy $$0, cza $$1, im $$2) {
      return $$0.a(avo.bx) || $$1.b_($$2.c()).a(els.c) && super.b($$0, $$1, $$2);
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      dpy $$1 = super.a($$0);
      return $$1 != null ? c($$0.q(), $$0.a(), $$1.a(d, $$0.g().g())) : null;
   }

   @Override
   public void a(czu $$0, im $$1, dpy $$2, bre $$3, csd $$4) {
      if (!$$0.x_()) {
         im $$5 = $$1.c();
         dpy $$6 = dfd.c($$0, $$5, this.n().a(b, dqu.a).a(d, $$2.c(d)));
         $$0.a($$5, $$6, 3);
      }
   }

   @Override
   protected elr c_(dpy $$0) {
      return $$0.c(g) ? els.c.a(false) : super.c_($$0);
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      if ($$0.c(b) == dqu.a) {
         return super.a($$0, $$1, $$2);
      } else {
         im $$3 = $$2.d();
         dpy $$4 = $$1.a_($$3);
         return this.b($$4, $$1, $$3);
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      if ($$0.c(g)) {
         $$3.a($$4, els.c, els.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, g, d);
   }

   @Override
   public boolean b(czx $$0, im $$1, dpy $$2) {
      return true;
   }

   @Override
   public boolean a(czu $$0, ayd $$1, im $$2, dpy $$3) {
      return true;
   }

   @Override
   public void a(aqe $$0, ayd $$1, im $$2, dpy $$3) {
      if ($$3.c(dfd.b) == dqu.b) {
         im $$4 = $$2.c();
         $$0.a($$4, $$0.b_($$4).g(), 18);
         dcs.a($$0, $$1, $$2, $$3.c(d));
      } else {
         im $$5 = $$2.d();
         this.a($$0, $$1, $$5, $$0.a_($$5));
      }
   }

   @Override
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(d, $$1.a($$0.c(d)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(d)));
   }

   @Override
   protected float at_() {
      return 0.1F;
   }
}
