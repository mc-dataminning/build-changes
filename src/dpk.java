import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpk extends dke implements dpz {
   public static final MapCodec<dpk> a = b(dpk::new);
   public static final dyk<jm.a> b = dyd.I;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fcm d = dke.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fcm e = dke.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dpk> a() {
      return a;
   }

   public dpk(dxm.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dxn $$0, ash $$1, jh $$2, bam $$3) {
      if ($$1.G_().j() && $$1.N().b(dgw.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bvm.bR)) {
            bvf $$4 = bvm.bR.a($$1, $$2.d(), bvl.d);
            if ($$4 != null) {
               $$4.aB();
               bvf $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dxn a(dxn $$0, dhd $$1, dhp $$2, jh $$3, jm $$4, jh $$5, dxn $$6, bam $$7) {
      jm.a $$8 = $$4.o();
      jm.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !euo.a($$1, $$3, $$9).b() ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxn $$0, dha $$1, jh $$2, bvf $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ash $$0, bvf $$1) {
      return $$1 instanceof cps $$2 ? Math.max(0, $$0.N().c($$2.gh().a ? dgw.F : dgw.E)) : 0;
   }

   @Nullable
   @Override
   public eup a(ash $$0, bvf $$1, jh $$2) {
      aly<dha> $$3 = $$0.ah() == dha.j ? dha.i : dha.j;
      ash $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ah() == dha.j;
         dzd $$6 = $$4.F_();
         double $$7 = ebi.a($$0.G_(), $$4.G_());
         jh $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eup a(ash $$0, bvf $$1, jh $$2, jh $$3, boolean $$4, dzd $$5) {
      Optional<jh> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      eup.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dxn $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dyd.I), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eup.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dV().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eup.b.then(eup.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eup a(bvf $$0, jh $$1, l.a $$2, ash $$3, eup.a $$4) {
      dxn $$5 = $$0.dV().a_($$1);
      jm.a $$6;
      fbs $$8;
      if ($$5.b(dyd.I)) {
         $$6 = $$5.c(dyd.I);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new fbs(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static eup a(ash $$0, l.a $$1, jm.a $$2, fbs $$3, bvf $$4, eup.a $$5) {
      jh $$6 = $$1.a;
      dxn $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dyd.I).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bvi $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      fbs $$17 = new fbs((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fbs $$18 = euo.a($$17, $$0, $$4, $$11);
      return new eup($$0, $$18, fbs.c, (float)$$12, 0.0F, bwp.a(bwp.l, bwp.k), $$5);
   }

   @Override
   public dpz.a b() {
      return dpz.a.a;
   }

   @Override
   public void a(dxn $$0, dha $$1, jh $$2, bam $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, axf.va, axg.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   public cxk a(dhd $$0, jh $$1, dxn $$2) {
      return cxk.k;
   }

   @Override
   protected dxn a(dxn $$0, dqu $$1) {
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
   protected void a(dxo.a<dke, dxn> $$0) {
      $$0.a(b);
   }
}
