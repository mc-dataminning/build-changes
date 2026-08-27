import javax.annotation.Nullable;

public class cyc extends csv {
   public static final dgh<dgk> a = dfz.bf;
   public static final dga b = dfz.w;
   public static final dgj c = dfz.aR;
   public static final int d = 3;

   public cyc(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgk.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   private dfj b(cpw $$0, gw $$1, dfj $$2) {
      dgk $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(a, $$3);
      } else {
         dgk $$4 = $$0.a_($$1.d()).A();
         dgk $$5 = $$4.e() ? dgk.a : $$4;
         return $$2.a(a, $$5);
      }
   }

   @Override
   public dfj a(cln $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      boolean $$6 = $$1.o() == hc.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, csv $$3, gw $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable biq $$0, dfj $$1, cpv $$2, gw $$3) {
      if ($$1.c(a).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, djt.H, $$3);
      }
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      if ($$6.a(aqb.aG) && $$5.b() == hc.b) {
         return bgy.d;
      } else if ($$1.B) {
         return bgy.a;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apo.ag);
         return bgy.b;
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, cbu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apo.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dfj $$0, cpv $$1, gw $$2, int $$3, int $$4) {
      dgk $$5 = $$0.c(a);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(c);
         $$7 = b($$6);
         $$1.a(ix.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      hg<apd> $$10;
      if ($$5.d()) {
         aex $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = hg.a(apd.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, apf.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aex a(cpv $$0, gw $$1) {
      return $$0.c_($$1.c()) instanceof def $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c);
   }
}
