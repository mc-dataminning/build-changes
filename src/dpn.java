import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dpn extends dke implements dqb {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dpn> a = b(dpn::new);
   public static final dyo<jn.a> b = dyg.J;
   private static final Map<jn.a, fcr> d = fco.a(dke.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dpn> a() {
      return a;
   }

   public dpn(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jn.a.a));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected void b(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.B_().j() && $$1.O().b(dgv.e) && $$3.a(2000) < $$1.an().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bvi.bQ)) {
            bva $$4 = bvi.bQ.a($$1, $$2.d(), bvh.d);
            if ($$4 != null) {
               $$4.aB();
               bva $$5 = $$4.dj();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      jn.a $$8 = $$4.o();
      jn.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !euv.a($$1, $$3, $$9).b() ? dkg.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ard $$0, bva $$1) {
      return $$1 instanceof cpr $$2 ? Math.max(0, $$0.O().c($$2.gm().a ? dgv.G : dgv.F)) : 0;
   }

   @Nullable
   @Override
   public euw a(ard $$0, bva $$1, ji $$2) {
      akt<dgz> $$3 = $$0.aj() == dgz.j ? dgz.i : dgz.j;
      ard $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == dgz.j;
         dzh $$6 = $$4.A_();
         double $$7 = ebm.a($$0.B_(), $$4.B_());
         ji $$8 = $$6.b($$1.dz() * $$7, $$1.dB(), $$1.dF() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private euw a(ard $$0, bva $$1, ji $$2, ji $$3, boolean $$4, dzh $$5) {
      Optional<ji> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      euw.a $$10;
      if ($$6.isPresent()) {
         ji $$7 = $$6.get();
         dxq $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dyg.J), 21, jn.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = euw.b.then($$1x -> $$1x.g($$7));
      } else {
         jn.a $$11 = $$1.dU().a_($$2).d(b).orElse(jn.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = euw.b.then(euw.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static euw a(bva $$0, ji $$1, l.a $$2, ard $$3, euw.a $$4) {
      dxq $$5 = $$0.dU().a_($$1);
      jn.a $$6;
      fbx $$8;
      if ($$5.b(dyg.J)) {
         $$6 = $$5.c(dyg.J);
         l.a $$7 = l.a($$1, $$6, 21, jn.a.b, 21, $$2x -> $$0.dU().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jn.a.a;
         $$8 = new fbx(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static euw a(ard $$0, l.a $$1, jn.a $$2, fbx $$3, bva $$4, euw.a $$5) {
      ji $$6 = $$1.a;
      dxq $$7 = $$0.a_($$6);
      jn.a $$8 = $$7.d(dyg.J).orElse(jn.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bvd $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jn.a.a;
      fbx $$17 = new fbx((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fbx $$18 = euv.a($$17, $$0, $$4, $$11);
      return new euw($$0, $$18, fbx.c, (float)$$12, 0.0F, bwm.a(bwm.l, bwm.k), $$5);
   }

   @Override
   public dqb.a b() {
      return dqb.a.a;
   }

   @Override
   public void a(dxq $$0, dgz $$1, ji $$2, azh $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vr, awb.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lt.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cxh a(dhc $$0, ji $$1, dxq $$2, boolean $$3) {
      return cxh.k;
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jn.a.c);
               case c:
                  return $$0.b(b, jn.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }
}
