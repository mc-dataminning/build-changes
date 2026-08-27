import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czp extends cvs<dhy> implements ddy {
   public static final MapCodec<czp> b = b(czp::new);
   public static final dkj c = dat.aE;
   public static final dkg d = dkf.C;
   protected static final emv e = cwy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vg f = vg.c("container.enderchest");

   @Override
   public MapCodec<czp> a() {
      return b;
   }

   protected czp(djo.d $$0) {
      super($$0, () -> dhf.d);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public czf.c<? extends dhk> a(djp $$0, ctx $$1, hx $$2, boolean $$3) {
      return czf.b::b;
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return e;
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.b;
   }

   @Override
   public djp a(cpp $$0) {
      eez $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == efa.c));
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      cjv $$5 = $$3.gf();
      dhd $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dhy) {
         hx $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bkc.a($$1.B);
         } else if ($$1.B) {
            return bkc.a;
         } else {
            dhy $$8 = (dhy)$$6;
            $$5.a($$8);
            $$3.a(new bkm(($$1x, $$2x, $$3x) -> ciq.a($$1x, $$2x, $$5), f));
            $$3.a(asd.aj);
            ceh.a($$3, true);
            return bkc.b;
         }
      } else {
         return bkc.a($$1.B);
      }
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhy($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? a($$2, dhf.d, dhy::a) : null;
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(jx.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public djp a(djp $$0, ddk $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djp a(djp $$0, dbu $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c, d);
   }

   @Override
   public eez c_(djp $$0) {
      return $$0.c(d) ? efa.c.a(false) : super.c_($$0);
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, efa.c, efa.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      dhd $$4 = $$1.c_($$2);
      if ($$4 instanceof dhy) {
         ((dhy)$$4).c();
      }
   }
}
