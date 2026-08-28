import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class drx extends dmm implements dsl {
   private static final Logger c = LogUtils.getLogger();
   public static final MapCodec<drx> a = b(drx::new);
   public static final ebm<jb.a> b = ebe.J;
   private static final Map<jb.a, ffr> d = ffo.a(dmm.a(4.0, 16.0, 0.0, 16.0));

   @Override
   public MapCodec<drx> a() {
      return a;
   }

   public drx(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, jb.a.a));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return d.get($$0.c(b));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, bwi $$3) {
      return $$0.f($$1, $$2);
   }

   @Override
   protected void b(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.B_().j() && $$1.O().c(djd.f) && $$3.a(2000) < $$1.an().a() && $$1.g($$2)) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.e();
         }

         if ($$1.a_($$2).a($$1, $$2, bwr.bR)) {
            bwi $$4 = bwr.bR.a($$1, $$2.d(), bwq.d);
            if ($$4 != null) {
               $$4.ay();
               bwi $$5 = $$4.dj();
               if ($$5 != null) {
                  $$5.ay();
               }
            }
         }
      }
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      jb.a $$8 = $$4.o();
      jb.a $$9 = $$0.c(b);
      boolean $$10 = $$9 != $$8 && $$8.d();
      return !$$10 && !$$6.a(this) && !exu.a($$1, $$3, $$9).b() ? dmo.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if ($$3.n(false)) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(arq $$0, bwi $$1) {
      return $$1 instanceof crj $$2 ? Math.max(0, $$0.O().d($$2.gj().a ? djd.H : djd.G)) : 0;
   }

   @Nullable
   @Override
   public exv a(arq $$0, bwi $$1, iv $$2) {
      alf<djh> $$3 = $$0.aj() == djh.j ? djh.i : djh.j;
      arq $$4 = $$0.p().a($$3);
      if ($$4 == null) {
         return null;
      } else {
         boolean $$5 = $$4.aj() == djh.j;
         ecg $$6 = $$4.A_();
         double $$7 = eel.a($$0.B_(), $$4.B_());
         iv $$8 = $$6.b($$1.dz() * $$7, $$1.dB(), $$1.dF() * $$7);
         return this.a($$4, $$1, $$2, $$8, $$5, $$6);
      }
   }

   @Nullable
   private exv a(arq $$0, bwi $$1, iv $$2, iv $$3, boolean $$4, ecg $$5) {
      Optional<iv> $$6 = $$0.q().a($$3, $$4, $$5);
      m.a $$9;
      exv.a $$10;
      if ($$6.isPresent()) {
         iv $$7 = $$6.get();
         eao $$8 = $$0.a_($$7);
         $$9 = m.a($$7, $$8.c(ebe.J), 21, jb.a.b, 21, $$2x -> $$0.a_($$2x) == $$8);
         $$10 = exv.b.then($$1x -> $$1x.f($$7));
      } else {
         jb.a $$11 = $$1.dU().a_($$2).d(b).orElse(jb.a.a);
         Optional<m.a> $$12 = $$0.q().a($$3, $$11);
         if ($$12.isEmpty()) {
            c.error("Unable to create a portal, likely target out of worldborder");
            return null;
         }

         $$9 = $$12.get();
         $$10 = exv.b.then(exv.c);
      }

      return a($$1, $$2, $$9, $$0, $$10);
   }

   private static exv a(bwi $$0, iv $$1, m.a $$2, arq $$3, exv.a $$4) {
      eao $$5 = $$0.dU().a_($$1);
      jb.a $$6;
      fex $$8;
      if ($$5.b(ebe.J)) {
         $$6 = $$5.c(ebe.J);
         m.a $$7 = m.a($$1, $$6, 21, jb.a.b, 21, $$2x -> $$0.dU().a_($$2x) == $$5);
         $$8 = $$0.a($$6, $$7);
      } else {
         $$6 = jb.a.a;
         $$8 = new fex(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$6, $$8, $$0, $$4);
   }

   private static exv a(arq $$0, m.a $$1, jb.a $$2, fex $$3, bwi $$4, exv.a $$5) {
      iv $$6 = $$1.a;
      eao $$7 = $$0.a_($$6);
      jb.a $$8 = $$7.d(ebe.J).orElse(jb.a.a);
      double $$9 = (double)$$1.b;
      double $$10 = (double)$$1.c;
      bwl $$11 = $$4.a($$4.at());
      int $$12 = $$2 == $$8 ? 0 : 90;
      double $$13 = (double)$$11.a() / 2.0 + ($$9 - (double)$$11.a()) * $$3.a();
      double $$14 = ($$10 - (double)$$11.b()) * $$3.b();
      double $$15 = 0.5 + $$3.c();
      boolean $$16 = $$8 == jb.a.a;
      fex $$17 = new fex((double)$$6.u() + ($$16 ? $$13 : $$15), (double)$$6.v() + $$14, (double)$$6.w() + ($$16 ? $$15 : $$13));
      fex $$18 = exu.a($$17, $$0, $$4, $$11);
      return new exv($$0, $$18, fex.c, (float)$$12, 0.0F, bxx.a(bxx.l, bxx.k), $$5);
   }

   @Override
   public dsl.a b() {
      return dsl.a.a;
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.vv, awo.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   protected czk a(djk $$0, iv $$1, eao $$2, boolean $$3) {
      return czk.k;
   }

   @Override
   protected eao a(eao $$0, dtg $$1) {
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
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b);
   }
}
