import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dlc extends dfy implements dlr {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final dua<ji.a> b = dts.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final exv d = dfy.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exv e = dfy.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.a.a));
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      switch ((ji.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if ($$1.D_().j() && $$1.ab().b(dcs.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bsx.bx)) {
            bsr $$4 = bsx.bx.a($$1, $$2.d(), btr.d);
            if ($$4 != null) {
               $$4.ay();
            }
         }
      }
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      ji.a $$6 = $$1.o();
      ji.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eqe($$3, $$4, $$7).c() ? dga.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, bsr $$3) {
      if ($$3.o(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(aqu $$0, bsr $$1) {
      return $$1 instanceof cmx $$2 ? Math.max(1, $$0.ab().c($$2.fZ().a ? dcs.F : dcs.E)) : 0;
   }

   @Nullable
   @Override
   public eqc a(aqu $$0, bsr $$1, jd $$2) {
      akq<dcw> $$3 = $$0.af() == dcw.i ? dcw.h : dcw.i;
      aqu $$4 = $$0.o().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.af() == dcw.i;
         dut $$6 = $$4.C_();
         double $$7 = dwy.a($$0.D_(), $$4.D_());
         jd $$8 = $$6.b($$1.dt() * $$7, $$1.dv(), $$1.dz() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private eqc a(aqu $$0, bsr $$1, jd $$2, jd $$3, boolean $$4, dut $$5) {
      Optional<jd> $$6 = $$0.p().a($$3, $$4, $$5);
      l.a $$9;
      eqc.a $$10;
      if ($$6.isPresent()) {
         jd $$7 = $$6.get();
         dtc $$8 = $$0.a_($$7);
         $$9 = l.a($$7, $$8.c(dts.H), 21, ji.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = eqc.b.then($$1x -> $$1x.f($$7));
      } else {
         ji.a $$11 = $$1.dO().a_($$2).d(b).orElse(ji.a.a);
         Optional<l.a> $$12 = $$0.p().a($$3, $$11);
         if ($$12.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = eqc.b.then(eqc.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static eqc a(bsr $$0, jd $$1, l.a $$2, aqu $$3, eqc.a $$4) {
      dtc $$5 = $$0.dO().a_($$1);
      ji.a $$6;
      exc $$8;
      if ($$5.b(dts.H)) {
         $$6 = $$5.c(dts.H);
         l.a $$7 = l.a($$1, $$6, 21, ji.a.b, 21, $$2x -> $$0.dO().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = ji.a.a;
         $$8 = new exc(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$0.dr(), $$0.dE(), $$0.dG(), $$4);
   }

   private static eqc a(aqu $$0, l.a $$1, ji.a $$2, exc $$3, bsr $$4, exc $$5, float $$6, float $$7, eqc.a $$8) {
      jd $$9 = $$1.a;
      dtc $$10 = $$0.a_($$9);
      ji.a $$11 = $$10.d(dts.H).orElse(ji.a.a);
      double $$12 = (double)$$1.b;
      double $$13 = (double)$$1.c;
      bsu $$14 = $$4.a($$4.at());
      int $$15 = $$2 == $$11 ? 0 : 90;
      exc $$16 = $$2 == $$11 ? $$5 : new exc($$5.e, $$5.d, -$$5.c);
      double $$17 = (double)$$14.a() / 2.0 + ($$12 - (double)$$14.a()) * $$3.a();
      double $$18 = ($$13 - (double)$$14.b()) * $$3.b();
      double $$19 = 0.5 + $$3.c();
      boolean $$20 = $$11 == ji.a.a;
      exc $$21 = new exc((double)$$9.u() + ($$20 ? $$17 : $$19), (double)$$9.v() + $$18, (double)$$9.w() + ($$20 ? $$19 : $$17));
      exc $$22 = eqe.a($$21, $$0, $$4, $$14);
      return new eqc($$0, $$22, $$16, $$6 + (float)$$15, $$7, $$8);
   }

   @Override
   public dlr.a b() {
      return dlr.a.a;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avp.uH, avq.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(lm.ac, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cuq a(dcz $$0, jd $$1, dtc $$2) {
      return cuq.l;
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ji.a)$$0.c(b)) {
               case c:
                  return $$0.a(b, ji.a.a);
               case a:
                  return $$0.a(b, ji.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }
}
