import javax.annotation.Nullable;

public class cxt extends csm {
   public static final dfy<dgb> a = dfq.bf;
   public static final dfr b = dfq.w;
   public static final dga c = dfq.aR;
   public static final int d = 3;

   public cxt(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, dgb.a).a(c, Integer.valueOf(0)).a(b, Boolean.valueOf(false)));
   }

   private dfa b(cpn $$0, gu $$1, dfa $$2) {
      dgb $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(a, $$3);
      } else {
         dgb $$4 = $$0.a_($$1.d()).A();
         dgb $$5 = $$4.e() ? dgb.a : $$4;
         return $$2.a(a, $$5);
      }
   }

   @Override
   public dfa a(clg $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      boolean $$6 = $$1.o() == ha.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, csm $$3, gu $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(b)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(b, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bii $$0, dfa $$1, cpm $$2, gu $$3) {
      if ($$1.c(a).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, djk.H, $$3);
      }
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      if ($$6.a(apt.aG) && $$5.b() == ha.b) {
         return bgq.d;
      } else if ($$1.B) {
         return bgq.a;
      } else {
         $$0 = $$0.a(c);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apg.ag);
         return bgq.b;
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, cbn $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(apg.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dfa $$0, cpm $$1, gu $$2, int $$3, int $$4) {
      dgb $$5 = $$0.c(a);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(c);
         $$7 = b($$6);
         $$1.a(iv.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      he<aov> $$10;
      if ($$5.d()) {
         aer $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = he.a(aov.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aox.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private aer a(cpm $$0, gu $$1) {
      return $$0.c_($$1.c()) instanceof ddw $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c);
   }
}
