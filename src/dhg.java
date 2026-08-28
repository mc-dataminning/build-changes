import com.mojang.serialization.MapCodec;
import java.util.List;
import javax.annotation.Nullable;

public class dhg extends dhy implements dio {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dty<dtt> b = dtq.bd;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(aE, ji.c).a(d, Boolean.valueOf(false)).a(b, dtt.a));
   }

   @Override
   protected int g(dta $$0) {
      return 2;
   }

   @Override
   public dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      return $$1 == ji.a && !this.b($$3, $$5, $$2) ? dfy.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected int a(dca $$0, jd $$1, dta $$2) {
      dqf $$3 = $$0.c_($$1);
      return $$3 instanceof dqq ? ((dqq)$$3).b() : 0;
   }

   private int e(dcu $$0, jd $$1, dta $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return 0;
      } else {
         int $$4 = this.a((ddk)$$0, $$1, $$2);
         if ($$4 > $$3) {
            return 0;
         } else {
            return $$2.c(b) == dtt.b ? $$3 - $$4 : $$3;
         }
      }
   }

   @Override
   protected boolean a(dcu $$0, jd $$1, dta $$2) {
      int $$3 = this.b($$0, $$1, $$2);
      if ($$3 == 0) {
         return false;
      } else {
         int $$4 = this.a((ddk)$$0, $$1, $$2);
         return $$3 > $$4 ? true : $$3 == $$4 && $$2.c(b) == dtt.a;
      }
   }

   @Override
   protected int b(dcu $$0, jd $$1, dta $$2) {
      int $$3 = super.b($$0, $$1, $$2);
      ji $$4 = $$2.c(aE);
      jd $$5 = $$1.a($$4);
      dta $$6 = $$0.a_($$5);
      if ($$6.n()) {
         $$3 = $$6.a($$0, $$5);
      } else if ($$3 < 15 && $$6.g($$0, $$5)) {
         $$5 = $$5.a($$4);
         $$6 = $$0.a_($$5);
         ciy $$7 = this.a($$0, $$4, $$5);
         int $$8 = Math.max($$7 == null ? Integer.MIN_VALUE : $$7.I(), $$6.n() ? $$6.a($$0, $$5) : Integer.MIN_VALUE);
         if ($$8 != Integer.MIN_VALUE) {
            $$3 = $$8;
         }
      }

      return $$3;
   }

   @Nullable
   private ciy a(dcu $$0, ji $$1, jd $$2) {
      List<ciy> $$3 = $$0.a(
         ciy.class,
         new ewr((double)$$2.u(), (double)$$2.v(), (double)$$2.w(), (double)($$2.u() + 1), (double)($$2.v() + 1), (double)($$2.w() + 1)),
         $$1x -> $$1x != null && $$1x.cI() == $$1
      );
      return $$3.size() == 1 ? $$3.get(0) : null;
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if (!$$3.ga().e) {
         return bqq.e;
      } else {
         $$0 = $$0.a(b);
         float $$5 = $$0.c(b) == dtt.b ? 0.55F : 0.5F;
         $$1.a($$3, $$2, avo.fr, avp.e, 0.3F, $$5);
         $$1.a($$2, $$0, 2);
         this.f($$1, $$2, $$0);
         return bqq.a($$1.B);
      }
   }

   @Override
   protected void c(dcu $$0, jd $$1, dta $$2) {
      if (!$$0.P().b($$1, this)) {
         int $$3 = this.e($$0, $$1, $$2);
         dqf $$4 = $$0.c_($$1);
         int $$5 = $$4 instanceof dqq ? ((dqq)$$4).b() : 0;
         if ($$3 != $$5 || $$2.c(d) != this.a($$0, $$1, $$2)) {
            eyr $$6 = this.b($$0, $$1, $$2) ? eyr.c : eyr.d;
            $$0.a($$1, this, 2, $$6);
         }
      }
   }

   private void f(dcu $$0, jd $$1, dta $$2) {
      int $$3 = this.e($$0, $$1, $$2);
      dqf $$4 = $$0.c_($$1);
      int $$5 = 0;
      if ($$4 instanceof dqq $$6) {
         $$5 = $$6.b();
         $$6.a($$3);
      }

      if ($$5 != $$3 || $$2.c(b) == dtt.a) {
         boolean $$7 = this.a($$0, $$1, $$2);
         boolean $$8 = $$2.c(d);
         if ($$8 && !$$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(false)), 2);
         } else if (!$$8 && $$7) {
            $$0.a($$1, $$2.a(d, Boolean.valueOf(true)), 2);
         }

         this.d($$0, $$1, $$2);
      }
   }

   @Override
   protected void a(dta $$0, aqt $$1, jd $$2, ayv $$3) {
      this.f($$1, $$2, $$0);
   }

   @Override
   protected boolean a(dta $$0, dcu $$1, jd $$2, int $$3, int $$4) {
      super.a($$0, $$1, $$2, $$3, $$4);
      dqf $$5 = $$1.c_($$2);
      return $$5 != null && $$5.a_($$3, $$4);
   }

   @Override
   public dqf a(jd $$0, dta $$1) {
      return new dqq($$0, $$1);
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(aE, b, d);
   }
}
