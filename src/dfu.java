import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.BiConsumer;

public class dfu extends dgr {
   public static final MapCodec<dfu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(drl.a.fieldOf("wood_type").forGetter($$0x -> $$0x.G), u()).apply($$0, dfu::new)
   );
   public static final dqp b = dqo.u;
   public static final dqp c = dqo.w;
   public static final dqp d = dqo.q;
   protected static final ety e = dcv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ety f = dcv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);
   protected static final ety g = dcv.a(0.0, 0.0, 6.0, 16.0, 13.0, 10.0);
   protected static final ety h = dcv.a(6.0, 0.0, 0.0, 10.0, 13.0, 16.0);
   protected static final ety i = dcv.a(0.0, 0.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ety j = dcv.a(6.0, 0.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ety k = dcv.a(0.0, 5.0, 6.0, 16.0, 24.0, 10.0);
   protected static final ety l = dcv.a(6.0, 5.0, 0.0, 10.0, 24.0, 16.0);
   protected static final ety m = etv.a(dcv.a(0.0, 5.0, 7.0, 2.0, 16.0, 9.0), dcv.a(14.0, 5.0, 7.0, 16.0, 16.0, 9.0));
   protected static final ety n = etv.a(dcv.a(7.0, 5.0, 0.0, 9.0, 16.0, 2.0), dcv.a(7.0, 5.0, 14.0, 9.0, 16.0, 16.0));
   protected static final ety o = etv.a(dcv.a(0.0, 2.0, 7.0, 2.0, 13.0, 9.0), dcv.a(14.0, 2.0, 7.0, 16.0, 13.0, 9.0));
   protected static final ety F = etv.a(dcv.a(7.0, 2.0, 0.0, 9.0, 13.0, 2.0), dcv.a(7.0, 2.0, 14.0, 9.0, 13.0, 16.0));
   private final drl G;

   @Override
   public MapCodec<dfu> a() {
      return a;
   }

   public dfu(drl $$0, dpx.d $$1) {
      super($$1.a($$0.d()));
      this.G = $$0;
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(c, Boolean.valueOf(false)).a(d, Boolean.valueOf(false)));
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ir.a.a ? h : g;
      } else {
         return $$0.c(aE).o() == ir.a.a ? f : e;
      }
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      ir.a $$6 = $$1.o();
      if ($$0.c(aE).h().o() != $$6) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$7 = this.m($$2) || this.m($$3.a_($$4.a($$1.g())));
         return $$0.a(d, Boolean.valueOf($$7));
      }
   }

   @Override
   protected ety b_(dpy $$0, cza $$1, im $$2) {
      if ($$0.c(b)) {
         return etv.a();
      } else {
         return $$0.c(aE).o() == ir.a.c ? k : l;
      }
   }

   @Override
   protected ety b(dpy $$0, cza $$1, im $$2, etk $$3) {
      if ($$0.c(b)) {
         return etv.a();
      } else {
         return $$0.c(aE).o() == ir.a.c ? i : j;
      }
   }

   @Override
   protected ety f(dpy $$0, cza $$1, im $$2) {
      if ($$0.c(d)) {
         return $$0.c(aE).o() == ir.a.a ? F : o;
      } else {
         return $$0.c(aE).o() == ir.a.a ? n : m;
      }
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      switch ($$1) {
         case a:
            return $$0.c(b);
         case b:
            return false;
         case c:
            return $$0.c(b);
         default:
            return false;
      }
   }

   @Override
   public dpy a(cvl $$0) {
      czu $$1 = $$0.q();
      im $$2 = $$0.a();
      boolean $$3 = $$1.C($$2);
      ir $$4 = $$0.g();
      ir.a $$5 = $$4.o();
      boolean $$6 = $$5 == ir.a.c && (this.m($$1.a_($$2.g())) || this.m($$1.a_($$2.h())))
         || $$5 == ir.a.a && (this.m($$1.a_($$2.e())) || this.m($$1.a_($$2.f())));
      return this.n().a(aE, $$4).a(b, Boolean.valueOf($$3)).a(c, Boolean.valueOf($$3)).a(d, Boolean.valueOf($$6));
   }

   private boolean m(dpy $$0) {
      return $$0.a(avo.L);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$0.c(b)) {
         $$0 = $$0.a(b, Boolean.valueOf(false));
         $$1.a($$2, $$0, 10);
      } else {
         ir $$5 = $$3.cF();
         if ($$0.c(aE) == $$5.g()) {
            $$0 = $$0.a(aE, $$5);
         }

         $$0 = $$0.a(b, Boolean.valueOf(true));
         $$1.a($$2, $$0, 10);
      }

      boolean $$6 = $$0.c(b);
      $$1.a($$3, $$2, $$6 ? this.G.g() : this.G.f(), ava.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
      $$1.a($$3, $$6 ? dur.h : dur.d, $$2);
      return boq.a($$1.B);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, czm $$3, BiConsumer<csd, im> $$4) {
      if ($$3.j() == czm.a.d && !$$1.x_() && !$$0.c(c)) {
         boolean $$5 = $$0.c(b);
         $$1.b($$2, $$0.a(b, Boolean.valueOf(!$$5)));
         $$1.a(null, $$2, $$5 ? this.G.f() : this.G.g(), ava.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
         $$1.a($$5 ? dur.d : dur.h, $$2, dur.a.a($$0));
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      if (!$$1.B) {
         boolean $$6 = $$1.C($$2);
         if ($$0.c(c) != $$6) {
            $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)).a(b, Boolean.valueOf($$6)), 2);
            if ($$0.c(b) != $$6) {
               $$1.a(null, $$2, $$6 ? this.G.g() : this.G.f(), ava.e, 1.0F, $$1.E_().i() * 0.1F + 0.9F);
               $$1.a(null, $$6 ? dur.h : dur.d, $$2);
            }
         }
      }
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(aE, b, c, d);
   }

   public static boolean a(dpy $$0, ir $$1) {
      return $$0.c(aE).o() == $$1.h().o();
   }
}
