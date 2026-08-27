import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends dbb<dnj> implements djh {
   public static final MapCodec<dey> b = b(dey::new);
   public static final dqc c = dgc.aE;
   public static final dpz d = dpy.C;
   protected static final etc e = dch.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wi f = wi.c("container.enderchest");

   @Override
   public MapCodec<dey> a() {
      return b;
   }

   protected dey(dph.d $$0) {
      super($$0, () -> dmq.d);
      this.k(this.E.b().a(c, ij.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public deo.c<? extends dmv> a(dpi $$0, czg $$1, id $$2, boolean $$3) {
      return deo.b::b;
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return e;
   }

   @Override
   protected dim b_(dpi $$0) {
      return dim.b;
   }

   @Override
   public dpi a(cux $$0) {
      elb $$1 = $$0.q().b_($$0.a());
      return this.n().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == elc.c));
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      coi $$5 = $$3.gm();
      dmo $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dnj) {
         id $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bof.a($$1.B);
         } else if ($$1.B) {
            return bof.a;
         } else {
            dnj $$8 = (dnj)$$6;
            $$5.a($$8);
            $$3.a(new bop(($$1x, $$2x, $$3x) -> cnd.a($$1x, $$2x, $$5), f));
            $$3.a(auz.aj);
            cir.a($$3, true);
            return bof.b;
         }
      } else {
         return bof.a($$1.B);
      }
   }

   @Override
   public dmo a(id $$0, dpi $$1) {
      return new dnj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dmo> dmp<T> a(czg $$0, dpi $$1, dmq<T> $$2) {
      return $$0.B ? a($$2, dmq.d, dnj::a) : null;
   }

   @Override
   public void a(dpi $$0, czg $$1, id $$2, axt $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kn.aa, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected elb c_(dpi $$0) {
      return $$0.c(d) ? elc.c.a(false) : super.c_($$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, elc.c, elc.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dpi $$0, elq $$1) {
      return false;
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      dmo $$4 = $$1.c_($$2);
      if ($$4 instanceof dnj) {
         ((dnj)$$4).b();
      }
   }
}
