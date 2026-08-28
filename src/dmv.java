import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmv extends dix<dvn> implements drj {
   public static final MapCodec<dmv> b = b(dmv::new);
   public static final dyl<jm> c = dob.aF;
   public static final dyf d = dye.J;
   protected static final fcl e = dkd.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xk f = xk.c("container.enderchest");

   @Override
   public MapCodec<dmv> a() {
      return b;
   }

   protected dmv(dxn.d $$0) {
      super($$0, () -> dus.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dml.c<? extends dux> a(dxo $$0, dgz $$1, jh $$2, boolean $$3) {
      return dml.b::b;
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return e;
   }

   @Override
   protected dqo a_(dxo $$0) {
      return dqo.b;
   }

   @Override
   public dxo a(dax $$0) {
      etq $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == etr.c));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      cuh $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dvn $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bta.a;
         } else {
            if ($$1 instanceof arx $$10) {
               $$5.a($$7);
               $$3.a(new bti(($$1x, $$2x, $$3x) -> ctc.a($$1x, $$2x, $$5), f));
               $$3.a(axf.aj);
               cod.a($$10, $$3, true);
            }

            return bta.a;
         }
      } else {
         return bta.a;
      }
   }

   @Override
   public duq a(jh $$0, dxo $$1) {
      return new dvn($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends duq> dur<T> a(dgz $$0, dxo $$1, dus<T> $$2) {
      return $$0.C ? a($$2, dus.d, dvn::a) : null;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(ls.ae, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dxo a(dxo $$0, dpc $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(d) ? etr.c.a(false) : super.b_($$0);
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, etr.c, etr.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dxo $$0, euf $$1) {
      return false;
   }

   @Override
   protected void a(dxo $$0, arx $$1, jh $$2, bac $$3) {
      duq $$4 = $$1.c_($$2);
      if ($$4 instanceof dvn) {
         ((dvn)$$4).b();
      }
   }
}
