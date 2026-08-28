import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsc extends dmm {
   public static final MapCodec<dsc> a = b(dsc::new);
   public static final ebm<ebp> b = ebe.bi;
   public static final ebf c = ebe.A;
   public static final ebo d = ebe.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dsc> a() {
      return a;
   }

   public dsc(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebp.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private eao a(djk $$0, iv $$1, eao $$2) {
      ebp $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         ebp $$4 = $$0.a_($$1.e()).E();
         ebp $$5 = $$4.e() ? ebp.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public eao a(ddd $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      boolean $$8 = $$4.o() == jb.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bwi $$0, eao $$1, djh $$2, iv $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, efo.H, $$3);
      }
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      return (bug)($$0.a(axk.bx) && $$6.c() == jb.b ? bug.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.ag);
      }

      return bug.a;
   }

   @Override
   protected void a_(eao $$0, djh $$1, iv $$2, crj $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(eao $$0, djh $$1, iv $$2, int $$3, int $$4) {
      ebp $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ly.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jf<awm> $$10;
      if ($$5.d()) {
         alg $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jf.a(awm.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awo.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alg a(djh $$0, iv $$1) {
      return $$0.c_($$1.d()) instanceof dzc $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d);
   }
}
