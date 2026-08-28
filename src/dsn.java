import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dsn extends dnc implements dtb {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<dsn> a = b(dsn::new);
   public static final ecc<jb.a> b = ebu.J;
   private static final Map<jb.a, fgk> d = fgh.a(dnc.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   public dsn(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a.a));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, bwt $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if ($$1.F_().j() && $$1.O().c(djt.f) && $$3.a(2000) < $$1.an().a() && $$1.g($$2)) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bxc.bS)) {
            bwt $$4 = bxc.bS.a($$1, $$2.d(), bxb.d);
            if ($$4 != null) {
               $$4.ay();
               bwt $$5 = $$4.dk();
               if ($$5 != null) {
                  $$5.ay();
               }
            }
         }
      }
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      jb.a $$8 = $$4.o();
      jb.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !eyn.a($$1, $$3, $$9).b() ? dne.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, bwt $$3, bxm $$4) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(ars $$0, bwt $$1) {
      return $$1 instanceof crx $$2 ? Math.max(0, $$0.O().d($$2.gk().a ? djt.H : djt.G)) : 0;
   }

   @Nullable
   @Override
   public eyo a(ars $$0, bwt $$1, iv $$2) {
      alh<djx> $$3 = $$0.aj() == djx.j ? djx.i : djx.j;
      ars $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == djx.j;
         ecw $$6 = $$4.E_();
         double $$7 = efb.a($$0.F_(), $$4.F_());
         iv $$8 = $$6.b($$1.dA() * $$7, $$1.dC(), $$1.dG() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eyo a(ars $$0, bwt $$1, iv $$2, iv $$3, boolean $$4, ecw $$5) {
      Optional<iv> $$6 = $$0.q().a($$3, $$4, $$5);
      m.a $$9;
      eyo.a $$10;
      if ($$6.isPresent()) {
         iv $$7 = $$6.get();
         ebe $$8 = $$0.a_($$7);
         $$9 = m.a($$7, $$8.c(ebu.J), 21, jb.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eyo.b.then($$1x -> $$1x.f($$7));
      } else {
         jb.a $$11 = $$1.dV().a_($$2).d(b).orElse(jb.a.a);
         Optional<m.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eyo.b.then(eyo.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eyo a(bwt $$0, iv $$1, m.a $$2, ars $$3, eyo.a $$4) {
      ebe $$5 = $$0.dV().a_($$1);
      jb.a $$6;
      ffq $$8;
      if ($$5.b(ebu.J)) {
         $$6 = $$5.c(ebu.J);
         m.a $$7 = m.a($$1, $$6, 21, jb.a.b, 21, $$2x -> $$0.dV().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jb.a.a;
         $$8 = new ffq(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static eyo a(ars $$0, m.a $$1, jb.a $$2, ffq $$3, bwt $$4, eyo.a $$5) {
      iv $$6 = $$1.a;
      ebe $$7 = $$0.a_($$6);
      jb.a $$8 = $$7.d(ebu.J).orElse(jb.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bww $$11 = $$4.a($$4.at());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jb.a.a;
      ffq $$17 = new ffq((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      ffq $$18 = eyn.a($$17, $$0, $$4, $$11);
      return new eyo($$0, $$18, ffq.c, (float)$$12, 0.0F, byi.a(byi.l, byi.k), $$5);
   }

   @Override
   public dtb.a b() {
      return dtb.a.a;
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.vv, awq.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ly.af, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   protected czy a(dka $$0, iv $$1, ebe $$2, boolean $$3) {
      return czy.k;
   }

   @Override
   protected ebe a(ebe $$0, dtw $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((jb.a)$$0.c(b)) {
               case a:
                  return $$0.b(b, jb.a.c);
               case c:
                  return $$0.b(b, jb.a.a);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b);
   }
}
