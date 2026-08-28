import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpr extends dkl implements dqg {
   public static final MapCodec<dpr> a = b(dpr::new);
   public static final dyr<jm.a> b = dyk.I;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fcr d = dkl.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcr e = dkl.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dpr> a() {
      return a;
   }

   public dpr(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.G_().j() && $$1.N().b(dhd.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bvq.bR)) {
            bvj $$4 = bvq.bR.a($$1, $$2.d(), bvp.d);
            if ($$4 != null) {
               $$4.aB();
               bvj $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      jm.a $$8 = $$4.o();
      jm.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !euv.a($$1, $$3, $$9).b() ? dkn.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, bvj $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ash $$0, bvj $$1) {
      return $$1 instanceof cpw $$2 ? Math.max(0, $$0.N().c($$2.gh().a ? dhd.G : dhd.F)) : 0;
   }

   @Nullable
   @Override
   public euw a(ash $$0, bvj $$1, jh $$2) {
      aly<dhh> $$3 = $$0.ah() == dhh.j ? dhh.i : dhh.j;
      ash $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ah() == dhh.j;
         dzk $$6 = $$4.F_();
         double $$7 = ebp.a($$0.G_(), $$4.G_());
         jh $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private euw a(ash $$0, bvj $$1, jh $$2, jh $$3, boolean $$4, dzk $$5) {
      Optional<jh> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      euw.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dxu $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dyk.I), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = euw.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dV().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = euw.b.then(euw.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static euw a(bvj $$0, jh $$1, l.a $$2, ash $$3, euw.a $$4) {
      dxu $$5 = $$0.dV().a_($$1);
      jm.a $$6;
      fbx $$8;
      if ($$5.b(dyk.I)) {
         $$6 = $$5.c(dyk.I);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new fbx(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static euw a(ash $$0, l.a $$1, jm.a $$2, fbx $$3, bvj $$4, euw.a $$5) {
      jh $$6 = $$1.a;
      dxu $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dyk.I).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bvm $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      fbx $$17 = new fbx((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fbx $$18 = euv.a($$17, $$0, $$4, $$11);
      return new euw($$0, $$18, fbx.c, (float)$$12, 0.0F, bwt.a(bwt.l, bwt.k), $$5);
   }

   @Override
   public dqg.a b() {
      return dqg.a.a;
   }

   @Override
   public void a(dxu $$0, dhh $$1, jh $$2, bam $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.vb, axg.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ls.ad, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cxo a(dhk $$0, jh $$1, dxu $$2) {
      return cxo.k;
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
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
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(b);
   }
}
