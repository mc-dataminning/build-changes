import com.mojang.serialization.MapCodec;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

public class dcr extends dch {
   public static final MapCodec<dcr> a = b(dcr::new);
   public static final dqs b = dgr.aE;
   public static final dqw<dqm> c = dqo.V;
   public static final dqp d = dqo.w;
   private static final ety f = dcv.a(0.0, 0.0, 4.0, 16.0, 16.0, 12.0);
   private static final ety g = dcv.a(4.0, 0.0, 0.0, 12.0, 16.0, 16.0);
   private static final ety h = dcv.a(5.0, 6.0, 5.0, 11.0, 13.0, 11.0);
   private static final ety i = dcv.a(4.0, 4.0, 4.0, 12.0, 6.0, 12.0);
   private static final ety j = etv.a(i, h);
   private static final ety k = etv.a(j, dcv.a(7.0, 13.0, 0.0, 9.0, 15.0, 16.0));
   private static final ety l = etv.a(j, dcv.a(0.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ety m = etv.a(j, dcv.a(0.0, 13.0, 7.0, 13.0, 15.0, 9.0));
   private static final ety n = etv.a(j, dcv.a(3.0, 13.0, 7.0, 16.0, 15.0, 9.0));
   private static final ety o = etv.a(j, dcv.a(7.0, 13.0, 0.0, 9.0, 15.0, 13.0));
   private static final ety F = etv.a(j, dcv.a(7.0, 13.0, 3.0, 9.0, 15.0, 16.0));
   private static final ety G = etv.a(j, dcv.a(7.0, 13.0, 7.0, 9.0, 16.0, 9.0));
   public static final int e = 1;

   @Override
   public MapCodec<dcr> a() {
      return a;
   }

   public dcr(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ir.c).a(c, dqm.a).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(d)) {
         if ($$6) {
            this.a($$1, $$2, null);
         }

         $$1.a($$2, $$0.a(d, Boolean.valueOf($$6)), 3);
      }
   }

   @Override
   protected void a(czu $$0, dpy $$1, etb $$2, cld $$3) {
      bql $$4 = $$3.u();
      ckl $$5 = $$4 instanceof ckl ? (ckl)$$4 : null;
      this.a($$0, $$1, $$2, $$5, true);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      return this.a($$1, $$0, $$4, $$3, true) ? boq.a($$1.B) : boq.d;
   }

   public boolean a(czu $$0, dpy $$1, etb $$2, @Nullable ckl $$3, boolean $$4) {
      ir $$5 = $$2.b();
      im $$6 = $$2.a();
      boolean $$7 = !$$4 || this.a($$1, $$5, $$2.e().d - (double)$$6.v());
      if ($$7) {
         boolean $$8 = this.a($$3, $$0, $$6, $$5);
         if ($$8 && $$3 != null) {
            $$3.a(avj.az);
         }

         return true;
      } else {
         return false;
      }
   }

   private boolean a(dpy $$0, ir $$1, double $$2) {
      if ($$1.o() != ir.a.b && !($$2 > 0.8124F)) {
         ir $$3 = $$0.c(b);
         dqm $$4 = $$0.c(c);
         switch ($$4) {
            case a:
               return $$3.o() == $$1.o();
            case c:
            case d:
               return $$3.o() != $$1.o();
            case b:
               return true;
            default:
               return false;
         }
      } else {
         return false;
      }
   }

   public boolean a(czu $$0, im $$1, @Nullable ir $$2) {
      return this.a(null, $$0, $$1, $$2);
   }

   public boolean a(@Nullable bql $$0, czu $$1, im $$2, @Nullable ir $$3) {
      dnd $$4 = $$1.c_($$2);
      if (!$$1.B && $$4 instanceof dnb) {
         if ($$3 == null) {
            $$3 = $$1.a_($$2).c(b);
         }

         ((dnb)$$4).a($$3);
         $$1.a(null, $$2, auz.bZ, ava.e, 2.0F, 1.0F);
         $$1.a($$0, dur.c, $$2);
         return true;
      } else {
         return false;
      }
   }

   private ety m(dpy $$0) {
      ir $$1 = $$0.c(b);
      dqm $$2 = $$0.c(c);
      if ($$2 == dqm.a) {
         return $$1 != ir.c && $$1 != ir.d ? g : f;
      } else if ($$2 == dqm.b) {
         return G;
      } else if ($$2 == dqm.d) {
         return $$1 != ir.c && $$1 != ir.d ? l : k;
      } else if ($$1 == ir.c) {
         return o;
      } else if ($$1 == ir.d) {
         return F;
      } else {
         return $$1 == ir.f ? n : m;
      }
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.m($$0);
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return this.m($$0);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.c;
   }

   @Nullable
   @Override
   public dpy a(cvl $$0) {
      ir $$1 = $$0.k();
      im $$2 = $$0.a();
      czu $$3 = $$0.q();
      ir.a $$4 = $$1.o();
      if ($$4 == ir.a.b) {
         dpy $$5 = this.n().a(c, $$1 == ir.a ? dqm.b : dqm.a).a(b, $$0.g());
         if ($$5.a((czx)$$0.q(), $$2)) {
            return $$5;
         }
      } else {
         boolean $$6 = $$4 == ir.a.a && $$3.a_($$2.g()).d($$3, $$2.g(), ir.f) && $$3.a_($$2.h()).d($$3, $$2.h(), ir.e)
            || $$4 == ir.a.c && $$3.a_($$2.e()).d($$3, $$2.e(), ir.d) && $$3.a_($$2.f()).d($$3, $$2.f(), ir.c);
         dpy $$7 = this.n().a(b, $$1.g()).a(c, $$6 ? dqm.d : dqm.c);
         if ($$7.a((czx)$$0.q(), $$0.a())) {
            return $$7;
         }

         boolean $$8 = $$3.a_($$2.d()).d($$3, $$2.d(), ir.b);
         $$7 = $$7.a(c, $$8 ? dqm.a : dqm.b);
         if ($$7.a((czx)$$0.q(), $$0.a())) {
            return $$7;
         }
      }

      return null;
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_()) {
         this.a($$1, $$2, null);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      dqm $$6 = $$0.c(c);
      ir $$7 = n($$0).g();
      if ($$7 == $$1 && !$$0.a($$3, $$4) && $$6 != dqm.d) {
         return dcx.a.n();
      } else {
         if ($$1.o() == $$0.c(b).o()) {
            if ($$6 == dqm.d && !$$2.d($$3, $$5, $$1)) {
               return $$0.a(c, dqm.c).a(b, $$1.g());
            }

            if ($$6 == dqm.c && $$7.g() == $$1 && $$2.d($$3, $$5, $$0.c(b))) {
               return $$0.a(c, dqm.d);
            }
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   protected boolean a(dpy $$0, czx $$1, im $$2) {
      ir $$3 = n($$0).g();
      return $$3 == ir.b ? dcv.a($$1, $$2.c(), ir.a) : dfp.b($$1, $$2, $$3);
   }

   private static ir n(dpy $$0) {
      switch ((dqm)$$0.c(c)) {
         case a:
            return ir.b;
         case b:
            return ir.a;
         default:
            return $$0.c(b).g();
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d);
   }

   @Nullable
   @Override
   public dnd a(im $$0, dpy $$1) {
      return new dnb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dnd> dne<T> a(czu $$0, dpy $$1, dnf<T> $$2) {
      return a($$2, dnf.E, $$0.B ? dnb::a : dnb::b);
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }

   @Override
   public dpy a(dpy $$0, dji $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dpy a(dpy $$0, dhs $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }
}
