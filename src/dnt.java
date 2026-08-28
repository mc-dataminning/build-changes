import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dnt extends diq implements doi {
   public static final MapCodec<dnt> a = b(dnt::new);
   public static final dws<jm.a> b = dwl.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final fas d = diq.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final fas e = diq.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   public dnt(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.a.a));
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      switch ((jm.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.F_().j() && $$1.N().b(dfi.e) && $$3.a(2000) < $$1.ak().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bus.bN)) {
            bul $$4 = bus.bN.a($$1, $$2.d(), bur.d);
            if ($$4 != null) {
               $$4.aB();
               bul $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.aB();
               }
            }
         }
      }
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      jm.a $$8 = $$4.o();
      jm.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !esv.a($$1, $$3, $$9).b() ? dis.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arp $$0, bul $$1) {
      return $$1 instanceof cou $$2 ? Math.max(0, $$0.N().c($$2.gh().a ? dfi.F : dfi.E)) : 0;
   }

   @Nullable
   @Override
   public est a(arp $$0, bul $$1, jh $$2) {
      ali<dfm> $$3 = $$0.ag() == dfm.j ? dfm.i : dfm.j;
      arp $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.ag() == dfm.j;
         dxl $$6 = $$4.E_();
         double $$7 = dzq.a($$0.F_(), $$4.F_());
         jh $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private est a(arp $$0, bul $$1, jh $$2, jh $$3, boolean $$4, dxl $$5) {
      Optional<jh> $$6 = $$0.q().a($$3, $$4, $$5);
      l.a $$9;
      est.a $$10;
      if ($$6.isPresent()) {
         jh $$7 = $$6.get();
         dvv $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dwl.H), 21, jm.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = est.b.then($$1x -> $$1x.f($$7));
      } else {
         jm.a $$11 = $$1.dV().a_($$2).d(b).orElse(jm.a.a);
         Optional<l.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = est.b.then(est.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static est a(bul $$0, jh $$1, l.a $$2, arp $$3, est.a $$4) {
      dvv $$5 = $$0.dV().a_($$1);
      jm.a $$6;
      ezy $$8;
      if ($$5.b(dwl.H)) {
         $$6 = $$5.c(dwl.H);
         l.a $$7 = l.a($$1, $$6, 21, jm.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jm.a.a;
         $$8 = new ezy(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static est a(arp $$0, l.a $$1, jm.a $$2, ezy $$3, bul $$4, est.a $$5) {
      jh $$6 = $$1.a;
      dvv $$7 = $$0.a_($$6);
      jm.a $$8 = $$7.d(dwl.H).orElse(jm.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      buo $$11 = $$4.a($$4.aw());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jm.a.a;
      ezy $$17 = new ezy((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ezy $$18 = esv.a($$17, $$0, $$4, $$11);
      return new est($$0, $$18, ezy.c, (float)$$12, 0.0F, bvv.a(bvv.l, bvv.k), $$5);
   }

   @Override
   public doi.a b() {
      return doi.a.a;
   }

   @Override
   public void a(dvv $$0, dfm $$1, jh $$2, azu $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.uG, awo.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ls.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cwm a(dfp $$0, jh $$1, dvv $$2) {
      return cwm.k;
   }

   @Override
   protected dvv a(dvv $$0, dpd $$1) {
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
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }
}
