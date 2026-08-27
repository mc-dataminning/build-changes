import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czg extends cvj<dhp> implements ddp {
   public static final MapCodec<czg> b = b(czg::new);
   public static final dka c = dak.aE;
   public static final djx d = djw.C;
   protected static final eml e = cwp.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vf f = vf.c("container.enderchest");

   @Override
   public MapCodec<czg> a() {
      return b;
   }

   protected czg(djf.d $$0) {
      super($$0, () -> dgw.d);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyw.c<? extends dhb> a(djg $$0, cto $$1, hx $$2, boolean $$3) {
      return cyw.b::b;
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return e;
   }

   @Override
   public dcu b_(djg $$0) {
      return dcu.b;
   }

   @Override
   public djg a(cpg $$0) {
      eeq $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eer.c));
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cjm $$6 = $$3.gf();
      dgu $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dhp) {
         hx $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bka.a($$1.B);
         } else if ($$1.B) {
            return bka.a;
         } else {
            dhp $$9 = (dhp)$$7;
            $$6.a($$9);
            $$3.a(new bkj(($$1x, $$2x, $$3x) -> cih.a($$1x, $$2x, $$6), f));
            $$3.a(asb.aj);
            cdy.a($$3, true);
            return bka.b;
         }
      } else {
         return bka.a($$1.B);
      }
   }

   @Override
   public dgu a(hx $$0, djg $$1) {
      return new dhp($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgu> dgv<T> a(cto $$0, djg $$1, dgw<T> $$2) {
      return $$0.B ? a($$2, dgw.d, dhp::a) : null;
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, auu $$3) {
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
   public djg a(djg $$0, ddb $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djg a(djg $$0, dbl $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(c, d);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(d) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eer.c, eer.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      dgu $$4 = $$1.c_($$2);
      if ($$4 instanceof dhp) {
         ((dhp)$$4).c();
      }
   }
}
