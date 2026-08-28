import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dor extends djk implements dph {
   public static final MapCodec<dor> a = b(dor::new);
   public static final dxs<jn.a> b = dxl.K;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fbs d = djk.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fbs e = djk.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dor> a() {
      return a;
   }

   public dor(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.a.a));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      switch ((jn.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.G_().j() && $$1.O().b(dgc.e) && $$3.a(2000) < $$1.am().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, buq.bQ)) {
            buj $$4 = buq.bQ.a($$1, $$2.d(), bup.d);
            if ($$4 != null) {
               $$4.aB();
               buj $$5 = $$4.dl();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      jn.a $$8 = $$4.o();
      jn.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !etw.a($$1, $$3, $$9).b() ? djm.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arc $$0, buj $$1) {
      return $$1 instanceof cov $$2 ? Math.max(0, $$0.O().c($$2.gj().a ? dgc.G : dgc.F)) : 0;
   }

   @Nullable
   @Override
   public etx a(arc $$0, buj $$1, ji $$2) {
      akt<dgg> $$3 = $$0.ai() == dgg.j ? dgg.i : dgg.j;
      arc $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ai() == dgg.j;
         dyl $$6 = $$4.F_();
         double $$7 = eaq.a($$0.G_(), $$4.G_());
         ji $$8 = $$6.b($$1.dB() * $$7, $$1.dD(), $$1.dH() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private etx a(arc $$0, buj $$1, ji $$2, ji $$3, boolean $$4, dyl $$5) {
      Optional<ji> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      etx.a $$10;
      if ($$6.isPresent()) {
         ji $$7 = $$6.get();
         dwv $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dxl.K), 21, jn.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = etx.b.then($$1x -> $$1x.f($$7));
      } else {
         jn.a $$11 = $$1.dW().a_($$2).d(b).orElse(jn.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = etx.b.then(etx.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static etx a(buj $$0, ji $$1, l.a $$2, arc $$3, etx.a $$4) {
      dwv $$5 = $$0.dW().a_($$1);
      jn.a $$6;
      fay $$8;
      if ($$5.b(dxl.K)) {
         $$6 = $$5.c(dxl.K);
         l.a $$7 = l.a($$1, $$6, 21, jn.a.b, 21, $$2x -> $$0.dW().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jn.a.a;
         $$8 = new fay(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static etx a(arc $$0, l.a $$1, jn.a $$2, fay $$3, buj $$4, etx.a $$5) {
      ji $$6 = $$1.a;
      dwv $$7 = $$0.a_($$6);
      jn.a $$8 = $$7.d(dxl.K).orElse(jn.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bum $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jn.a.a;
      fay $$17 = new fay((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fay $$18 = etw.a($$17, $$0, $$4, $$11);
      return new etx($$0, $$18, fay.c, (float)$$12, 0.0F, bvt.a(bvt.l, bvt.k), $$5);
   }

   @Override
   public dph.a b() {
      return dph.a.a;
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vh, awa.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lt.ae, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected cwn a(dgj $$0, ji $$1, dwv $$2, boolean $$3) {
      return cwn.j;
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jn.a)$$0.c(b)) {
               case c:
                  return $$0.b(b, jn.a.a);
               case a:
                  return $$0.b(b, jn.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b);
   }
}
