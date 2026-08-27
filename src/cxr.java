import javax.annotation.Nullable;

public class cxr extends csk {
   public static final dfw<dfz> a = dfo.bf;
   public static final dfp b = dfo.w;
   public static final dfy c = dfo.aR;
   public static final int d = 3;

   public cxr(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dfz.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   private dey b(cpl $$0, gv $$1, dey $$2) {
      dfz $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(a, $$3);
      } else {
         dfz $$4 = $$0.a_($$1.d()).A();
         dfz $$5 = $$4.e() ? dfz.a : $$4;
         return $$2.a(a, $$5);
      }
   }

   @Override
   public dey a(cle $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      boolean $$6 = $$1.o() == hb.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable big $$0, dey $$1, cpk $$2, gv $$3) {
      if ($$1.c(a).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dji.H, $$3);
      }
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      if ($$6.a(apr.aG) && $$5.b() == hb.b) {
         return bgo.d;
      } else if ($$1.B) {
         return bgo.a;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(ape.ag);
         return bgo.b;
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, cbl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(ape.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dey $$0, cpk $$1, gv $$2, int $$3, int $$4) {
      dfz $$5 = $$0.c(a);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(c);
         $$7 = b($$6);
         $$1.a(iw.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      hf<aot> $$10;
      if ($$5.d()) {
         aep $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = hf.a(aot.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aov.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aep a(cpk $$0, gv $$1) {
      return $$0.c_($$1.c()) instanceof ddu $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c);
   }
}
