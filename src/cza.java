import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cza extends cvd<dhj> implements ddj {
   public static final MapCodec<cza> b = b(cza::new);
   public static final dju c = dae.aE;
   public static final djr d = djq.C;
   protected static final emf e = cwj.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vd f = vd.c("container.enderchest");

   @Override
   public MapCodec<cza> a() {
      return b;
   }

   protected cza(diz.d $$0) {
      super($$0, () -> dgq.d);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyq.c<? extends dgv> a(dja $$0, cti $$1, hx $$2, boolean $$3) {
      return cyq.b::b;
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return e;
   }

   @Override
   public dco b_(dja $$0) {
      return dco.b;
   }

   @Override
   public dja a(cpa $$0) {
      eek $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eel.c));
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cjg $$6 = $$3.gf();
      dgo $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dhj) {
         hx $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bjv.a($$1.B);
         } else if ($$1.B) {
            return bjv.a;
         } else {
            dhj $$9 = (dhj)$$7;
            $$6.a($$9);
            $$3.a(new bke(($$1x, $$2x, $$3x) -> cib.a($$1x, $$2x, $$6), f));
            $$3.a(arw.aj);
            cds.a($$3, true);
            return bjv.b;
         }
      } else {
         return bjv.a($$1.B);
      }
   }

   @Override
   public dgo a(hx $$0, dja $$1) {
      return new dhj($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgo> dgp<T> a(cti $$0, dja $$1, dgq<T> $$2) {
      return $$0.B ? a($$2, dgq.d, dhj::a) : null;
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, aup $$3) {
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
   public dja a(dja $$0, dcv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public dja a(dja $$0, dbf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c, d);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(d) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eel.c, eel.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      dgo $$4 = $$1.c_($$2);
      if ($$4 instanceof dhj) {
         ((dhj)$$4).c();
      }
   }
}
