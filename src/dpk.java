import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpk extends dkd implements dqa {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final dyl<jm.a> b = dye.K;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fcl d = dkd.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcl e = dkd.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dxo $$0, arx $$1, jh $$2, bac $$3) {
      if ($$1.G_().j() && $$1.O().b(dgv.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bvi.bR)) {
            bvb $$4 = bvi.bR.a($$1, $$2.d(), bvh.d);
            if ($$4 != null) {
               $$4.aB();
               bvb $$5 = $$4.dl();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      jm.a $$8 = $$4.o();
      jm.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !eup.a($$1, $$3, $$9).b() ? dkf.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, bvb $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arx $$0, bvb $$1) {
      return $$1 instanceof cpo $$2 ? Math.max(0, $$0.O().c($$2.gj().a ? dgv.G : dgv.F)) : 0;
   }

   @Nullable
   @Override
   public euq a(arx $$0, bvb $$1, jh $$2) {
      alo<dgz> $$3 = $$0.ai() == dgz.j ? dgz.i : dgz.j;
      arx $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ai() == dgz.j;
         dze $$6 = $$4.F_();
         double $$7 = ebj.a($$0.G_(), $$4.G_());
         jh $$8 = $$6.b($$1.dB() * $$7, $$1.dD(), $$1.dH() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private euq a(arx $$0, bvb $$1, jh $$2, jh $$3, boolean $$4, dze $$5) {
      Optional<jh> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      euq.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dxo $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dye.K), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = euq.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dW().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = euq.b.then(euq.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static euq a(bvb $$0, jh $$1, l.a $$2, arx $$3, euq.a $$4) {
      dxo $$5 = $$0.dW().a_($$1);
      jm.a $$6;
      fbr $$8;
      if ($$5.b(dye.K)) {
         $$6 = $$5.c(dye.K);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dW().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new fbr(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static euq a(arx $$0, l.a $$1, jm.a $$2, fbr $$3, bvb $$4, euq.a $$5) {
      jh $$6 = $$1.a;
      dxo $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dye.K).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bve $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      fbr $$17 = new fbr((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fbr $$18 = eup.a($$17, $$0, $$4, $$11);
      return new euq($$0, $$18, fbr.c, (float)$$12, 0.0F, bwl.a(bwl.l, bwl.k), $$5);
   }

   @Override
   public dqa.a b() {
      return dqa.a.a;
   }

   @Override
   public void a(dxo $$0, dgz $$1, jh $$2, bac $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awv.vh, aww.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.h()).a(this) && !$$1.a_($$2.i()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(ls.ae, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cxg a(dhc $$0, jh $$1, dxo $$2) {
      return cxg.j;
   }

   @Override
   protected dxo a(dxo $$0, dqv $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jm.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jm.a.a);
               case a:
                  return $$0.b(b, jm.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b);
   }
}
