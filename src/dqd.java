import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dqd extends dku implements dqr {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dqd> a = b(dqd::new);
   public static final dzk<jo.a> b = dzc.J;
   private static final Map<jo.a, fdo> d = fdl.a(dku.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dqd> a() {
      return a;
   }

   public dqd(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, jo.a.a));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.B_().j() && $$1.O().c(dhl.e) && $$3.a(2000) < $$1.an().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bwb.bQ)) {
            bvs $$4 = bwb.bQ.a($$1, $$2.d(), bwa.d);
            if ($$4 != null) {
               $$4.aB();
               bvs $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      jo.a $$8 = $$4.o();
      jo.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !evs.a($$1, $$3, $$9).b() ? dkw.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arn $$0, bvs $$1) {
      return $$1 instanceof cqi $$2 ? Math.max(0, $$0.O().d($$2.gj().a ? dhl.G : dhl.F)) : 0;
   }

   @Nullable
   @Override
   public evt a(arn $$0, bvs $$1, jj $$2) {
      alc<dhp> $$3 = $$0.aj() == dhp.j ? dhp.i : dhp.j;
      arn $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == dhp.j;
         eae $$6 = $$4.A_();
         double $$7 = ecj.a($$0.B_(), $$4.B_());
         jj $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private evt a(arn $$0, bvs $$1, jj $$2, jj $$3, boolean $$4, eae $$5) {
      Optional<jj> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      evt.a $$10;
      if ($$6.isPresent()) {
         jj $$7 = $$6.get();
         dym $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dzc.J), 21, jo.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = evt.b.then($$1x -> $$1x.g($$7));
      } else {
         jo.a $$11 = $$1.dV().a_($$2).d(b).orElse(jo.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = evt.b.then(evt.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static evt a(bvs $$0, jj $$1, l.a $$2, arn $$3, evt.a $$4) {
      dym $$5 = $$0.dV().a_($$1);
      jo.a $$6;
      fcu $$8;
      if ($$5.b(dzc.J)) {
         $$6 = $$5.c(dzc.J);
         l.a $$7 = l.a($$1, $$6, 21, jo.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jo.a.a;
         $$8 = new fcu(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static evt a(arn $$0, l.a $$1, jo.a $$2, fcu $$3, bvs $$4, evt.a $$5) {
      jj $$6 = $$1.a;
      dym $$7 = $$0.a_($$6);
      jo.a $$8 = $$7.d(dzc.J).orElse(jo.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bvv $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jo.a.a;
      fcu $$17 = new fcu((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fcu $$18 = evs.a($$17, $$0, $$4, $$11);
      return new evt($$0, $$18, fcu.c, (float)$$12, 0.0F, bxf.a(bxf.l, bxf.k), $$5);
   }

   @Override
   public dqr.a b() {
      return dqr.a.a;
   }

   @Override
   public void a(dym $$0, dhp $$1, jj $$2, azs $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awk.vr, awl.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lv.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cxy a(dhs $$0, jj $$1, dym $$2, boolean $$3) {
      return cxy.k;
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jo.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jo.a.c);
               case c:
                  return $$0.b(b, jo.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b);
   }
}
