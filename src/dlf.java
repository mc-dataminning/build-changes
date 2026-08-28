import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlf extends dfw {
   public static final MapCodec<dlf> a = b(dlf::new);
   public static final dty<dub> b = dtq.bf;
   public static final dtr c = dtq.w;
   public static final dua d = dtq.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dlf> a() {
      return a;
   }

   public dlf(dsz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dub.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dta b(dcv $$0, jd $$1, dta $$2) {
      dub $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dub $$4 = $$0.a_($$1.d()).A();
         dub $$5 = $$4.e() ? dub.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dta a(cyb $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dta a(dta $$0, ji $$1, dta $$2, dcv $$3, jd $$4, jd $$5) {
      boolean $$6 = $$1.o() == ji.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dta $$0, dcu $$1, jd $$2, dfw $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsq $$0, dta $$1, dcu $$2, jd $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxw.H, $$3);
      }
   }

   @Override
   protected bqs a(cuo $$0, dta $$1, dcu $$2, jd $$3, cmv $$4, bqp $$5, ews $$6) {
      return $$0.a(awm.bf) && $$6.b() == ji.b ? bqs.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqq a(dta $$0, dcu $$1, jd $$2, cmv $$3, ews $$4) {
      if ($$1.B) {
         return bqq.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avy.ag);
         return bqq.c;
      }
   }

   @Override
   protected void a_(dta $$0, dcu $$1, jd $$2, cmv $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avy.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dta $$0, dcu $$1, jd $$2, int $$3, int $$4) {
      dub $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lm.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jm<avn> $$10;
      if ($$5.d()) {
         akq $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jm.a(avn.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avp.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akq a(dcu $$0, jd $$1) {
      return $$0.c_($$1.c()) instanceof drs $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dtb.a<dfw, dta> $$0) {
      $$0.a(b, c, d);
   }
}
