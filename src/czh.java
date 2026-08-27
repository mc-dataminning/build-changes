import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czh extends cvk<dhq> implements ddq {
   public static final MapCodec<czh> b = b(czh::new);
   public static final dkb c = dal.aE;
   public static final djy d = djx.C;
   protected static final emm e = cwq.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vf f = vf.c("container.enderchest");

   @Override
   public MapCodec<czh> a() {
      return b;
   }

   protected czh(djg.d $$0) {
      super($$0, () -> dgx.d);
      this.k(this.E.b().a(c, ic.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public cyx.c<? extends dhc> a(djh $$0, ctp $$1, hx $$2, boolean $$3) {
      return cyx.b::b;
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return e;
   }

   @Override
   public dcv b_(djh $$0) {
      return dcv.b;
   }

   @Override
   public djh a(cph $$0) {
      eer $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ees.c));
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cjn $$6 = $$3.gf();
      dgv $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dhq) {
         hx $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bkb.a($$1.B);
         } else if ($$1.B) {
            return bkb.a;
         } else {
            dhq $$9 = (dhq)$$7;
            $$6.a($$9);
            $$3.a(new bkk(($$1x, $$2x, $$3x) -> cii.a($$1x, $$2x, $$6), f));
            $$3.a(asc.aj);
            cdz.a($$3, true);
            return bkb.b;
         }
      } else {
         return bkb.a($$1.B);
      }
   }

   @Override
   public dgv a(hx $$0, djh $$1) {
      return new dhq($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dgv> dgw<T> a(ctp $$0, djh $$1, dgx<T> $$2) {
      return $$0.B ? a($$2, dgx.d, dhq::a) : null;
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, auv $$3) {
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
   public djh a(djh $$0, ddc $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   public djh a(djh $$0, dbm $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(c, d);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(d) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ees.c, ees.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      dgv $$4 = $$1.c_($$2);
      if ($$4 instanceof dhq) {
         ((dhq)$$4).c();
      }
   }
}
