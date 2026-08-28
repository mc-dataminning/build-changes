import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfr extends cfd {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final akj<Boolean> cc = akn.a(cfr.class, akl.k);
   @Nullable
   private cfr.a<cmv> cd;
   @Nullable
   private cfr.b ce;

   public cfr(bsy<? extends cfr> $$0, dbw $$1) {
      super($$0, $$1);
      this.u();
   }

   boolean y() {
      return this.ao.a(cc);
   }

   private void w(boolean $$0) {
      this.ao.a(cc, $$0);
      this.u();
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Trusting", this.y());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.w($$0.q("Trusting"));
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(cc, false);
   }

   @Override
   protected void z() {
      this.ce = new cfr.b(this, 0.6, $$0 -> $$0.a(awx.ap), true);
      this.bS.a(1, new caf(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new car(this, 0.3F));
      this.bS.a(8, new cbb(this));
      this.bS.a(9, new bzx(this, 0.8));
      this.bS.a(10, new cby(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cat(this, cmv.class, 10.0F));
      this.bT.a(1, new cce<>(this, cfi.class, false));
      this.bT.a(1, new cce<>(this, cge.class, 10, false, false, cge.bY));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(btz.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(btz.a);
            this.h(true);
         } else {
            this.b(btz.a);
            this.h(false);
         }
      } else {
         this.b(btz.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static buu.a s() {
      return btp.A().a(buv.q, 10.0).a(buv.r, 0.3F).a(buv.c, 3.0);
   }

   @Nullable
   @Override
   protected avy v() {
      return avz.sm;
   }

   @Override
   public int P() {
      return 900;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.sl;
   }

   @Override
   protected avy o_() {
      return avz.sn;
   }

   private float gq() {
      return (float)this.g(buv.c);
   }

   @Override
   public boolean C(bss $$0) {
      return $$0.a(this.dQ().b((btn)this), this.gq());
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ((this.ce == null || this.ce.i()) && !this.y() && this.o($$2) && $$0.g(this) < 9.0) {
         this.a($$0, $$1, $$2);
         if (!this.dP().B) {
            if (this.ah.a(3) == 0) {
               this.w(true);
               this.x(true);
               this.dP().a(this, (byte)41);
            } else {
               this.x(false);
               this.dP().a(this, (byte)40);
            }
         }

         return bqs.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 41) {
         this.x(true);
      } else if ($$0 == 40) {
         this.x(false);
      } else {
         super.b($$0);
      }
   }

   private void x(boolean $$0) {
      lg $$1 = li.Q;
      if (!$$0) {
         $$1 = li.ae;
      }

      for (int $$2 = 0; $$2 < 7; $$2++) {
         double $$3 = this.ah.k() * 0.02;
         double $$4 = this.ah.k() * 0.02;
         double $$5 = this.ah.k() * 0.02;
         this.dP().a($$1, this.d(1.0), this.dx() + 0.5, this.g(1.0), $$3, $$4, $$5);
      }
   }

   protected void u() {
      if (this.cd == null) {
         this.cd = new cfr.a<>(this, cmv.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cfr b(are $$0, bsm $$1) {
      return bsy.au.a((dbw)$$0);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.ap);
   }

   public static boolean c(bsy<cfr> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dbz $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         iz $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dsa $$2 = $$0.a_($$1.d());
         if ($$2.a(dez.i) || $$2.a(awo.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if ($$3 == null) {
         $$3 = new bsm.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evp cM() {
      return new evp(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends btn> extends bzs<T> {
      private final cfr i;

      public a(cfr $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsx.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.y() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.y() && super.b();
      }
   }

   static class b extends cbt {
      private final cfr c;

      public b(cfr $$0, double $$1, Predicate<cun> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
