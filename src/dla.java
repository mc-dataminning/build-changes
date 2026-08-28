import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class dla extends dfw implements dlp {
   public static final MapCodec<dla> a = b(dla::new);
   public static final dty<ji.a> b = dtq.H;
   private static final Logger f = LogUtils.getLogger();
   protected static final int c = 2;
   protected static final exp d = dfw.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final exp e = dfw.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   @Override
   public MapCodec<dla> a() {
      return a;
   }

   public dla(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.a.a));
   }

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
      switch ((ji.a)$$0.c(b)) {
         case c:
            return e;
         case a:
         default:
            return d;
      }
   }

   @Override
   protected void b(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      if ($$1.D_().j() && $$1.ab().b(dcq.e) && $$3.a(2000) < $$1.al().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bsw.bx)) {
            bsq $$4 = bsw.bx.a($$1, $$2.c(), btp.d);
            if ($$4 != null) {
               $$4.ay();
            }
         }
      }
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      ji.a $$6 = $$1.o();
      ji.a $$7 = $$0.c(b);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new epy($$3, $$4, $$7).c() ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, bsq $$3) {
      if ($$3.cx()) {
         $$3.a(this, $$2);
      }
   }

   @Override
   public int a(aqt $$0, bsq $$1) {
      return $$1 instanceof cmv $$2 ? Math.max(1, $$0.ab().c($$2.ga().a ? dcq.F : dcq.E)) : 0;
   }

   @Nullable
   @Override
   public epw a(aqt $$0, bsq $$1, jd $$2) {
      akp<dcu> $$3 = $$0.af() == dcu.i ? dcu.h : dcu.i;
      aqt $$4 = $$0.o().a($$3);
      boolean $$5 = $$4.af() == dcu.i;
      dur $$6 = $$4.C_();
      double $$7 = dwv.a($$0.D_(), $$4.D_());
      jd $$8 = $$6.b($$1.dv() * $$7, $$1.dx(), $$1.dB() * $$7);
      return this.a($$4, $$1, $$2, $$8, $$5, $$6);
   }

   @Nullable
   private epw a(aqt $$0, bsq $$1, jd $$2, jd $$3, boolean $$4, dur $$5) {
      Optional<l.a> $$6 = $$0.p().a($$3, $$4, $$5);
      if ($$6.isEmpty()) {
         ji.a $$7 = $$1.dQ().a_($$2).d(b).orElse(ji.a.a);
         Optional<l.a> $$8 = $$0.p().a($$3, $$7);
         if ($$8.isEmpty()) {
            f.error("Unable to create a portal, likely target out of worldborder");
            return null;
         } else {
            return a($$1, $$2, $$8.get(), $$0);
         }
      } else {
         return $$6.<epw>map($$3x -> a($$1, $$2, $$3x, $$0)).orElse(null);
      }
   }

   private static epw a(bsq $$0, jd $$1, l.a $$2, aqt $$3) {
      dta $$4 = $$0.dQ().a_($$1);
      ji.a $$5;
      eww $$7;
      if ($$4.b(dtq.H)) {
         $$5 = $$4.c(dtq.H);
         l.a $$6 = l.a($$1, $$5, 21, ji.a.b, 21, $$2x -> $$0.dQ().a_($$2x) == $$4);
         $$7 = $$0.a($$5, $$6);
      } else {
         $$5 = ji.a.a;
         $$7 = new eww(0.5, 0.0, 0.0);
      }

      return a($$3, $$2, $$5, $$7, $$0, $$0.dt(), $$0.dG(), $$0.dI());
   }

   private static epw a(aqt $$0, l.a $$1, ji.a $$2, eww $$3, bsq $$4, eww $$5, float $$6, float $$7) {
      jd $$8 = $$1.a;
      dta $$9 = $$0.a_($$8);
      ji.a $$10 = $$9.d(dtq.H).orElse(ji.a.a);
      double $$11 = (double)$$1.b;
      double $$12 = (double)$$1.c;
      bst $$13 = $$4.a($$4.at());
      int $$14 = $$2 == $$10 ? 0 : 90;
      eww $$15 = $$2 == $$10 ? $$5 : new eww($$5.e, $$5.d, -$$5.c);
      double $$16 = (double)$$13.a() / 2.0 + ($$11 - (double)$$13.a()) * $$3.a();
      double $$17 = ($$12 - (double)$$13.b()) * $$3.b();
      double $$18 = 0.5 + $$3.c();
      boolean $$19 = $$10 == ji.a.a;
      eww $$20 = new eww((double)$$8.u() + ($$19 ? $$16 : $$18), (double)$$8.v() + $$17, (double)$$8.w() + ($$19 ? $$18 : $$16));
      eww $$21 = epy.a($$20, $$0, $$4, $$13);
      return new epw($$0, $$21, $$15, $$6 + (float)$$14, $$7);
   }

   @Override
   public dlp.a b() {
      return dlp.a.a;
   }

   @Override
   public void a(dta $$0, dcu $$1, jd $$2, ayv $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.uH, avp.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
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
   public cuo a(dcx $$0, jd $$1, dta $$2) {
      return cuo.l;
   }

   @Override
   protected dta a(dta $$0, dmk $$1) {
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
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b);
   }
}
