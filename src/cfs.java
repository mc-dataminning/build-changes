import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cfs extends cfe {
   public static final double bY = 0.6;
   public static final double bZ = 0.8;
   public static final double cb = 1.33;
   private static final akj<Boolean> cc = akn.a(cfs.class, akl.k);
   @Nullable
   private cfs.a<cmw> cd;
   @Nullable
   private cfs.b ce;

   public cfs(bsz<? extends cfs> $$0, dbx $$1) {
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
      this.ce = new cfs.b(this, 0.6, $$0 -> $$0.a(awx.ap), true);
      this.bS.a(1, new cag(this));
      this.bS.a(3, this.ce);
      this.bS.a(7, new cas(this, 0.3F));
      this.bS.a(8, new cbc(this));
      this.bS.a(9, new bzy(this, 0.8));
      this.bS.a(10, new cbz(this, 0.8, 1.0000001E-5F));
      this.bS.a(11, new cau(this, cmw.class, 10.0F));
      this.bT.a(1, new ccf<>(this, cfj.class, false));
      this.bT.a(1, new ccf<>(this, cgf.class, 10, false, false, cgf.bY));
   }

   @Override
   public void Z() {
      if (this.H().b()) {
         double $$0 = this.H().c();
         if ($$0 == 0.6) {
            this.b(bua.f);
            this.h(false);
         } else if ($$0 == 1.33) {
            this.b(bua.a);
            this.h(true);
         } else {
            this.b(bua.a);
            this.h(false);
         }
      } else {
         this.b(bua.a);
         this.h(false);
      }
   }

   @Override
   public boolean h(double $$0) {
      return !this.y() && this.ai > 2400;
   }

   public static buv.a s() {
      return btq.A().a(buw.q, 10.0).a(buw.r, 0.3F).a(buw.c, 3.0);
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
   protected avy d(brm $$0) {
      return avz.sl;
   }

   @Override
   protected avy o_() {
      return avz.sn;
   }

   private float gq() {
      return (float)this.g(buw.c);
   }

   @Override
   public boolean C(bst $$0) {
      return $$0.a(this.dQ().b((bto)this), this.gq());
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
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

         return bqt.a(this.dP().B);
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
         this.cd = new cfs.a<>(this, cmw.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.cd);
      if (!this.y()) {
         this.bS.a(4, this.cd);
      }
   }

   @Nullable
   public cfs b(are $$0, bsn $$1) {
      return bsz.au.a((dbx)$$0);
   }

   @Override
   public boolean o(cuo $$0) {
      return $$0.a(awx.ap);
   }

   public static boolean c(bsz<cfs> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$4.a(3) != 0;
   }

   @Override
   public boolean a(dca $$0) {
      if ($$0.f(this) && !$$0.d(this.cK())) {
         iz $$1 = this.dp();
         if ($$1.v() < $$0.z_()) {
            return false;
         }

         dsb $$2 = $$0.a_($$1.d());
         if ($$2.a(dfa.i) || $$2.a(awo.O)) {
            return true;
         }
      }

      return false;
   }

   @Nullable
   @Override
   public buh a(dcm $$0, bqr $$1, bts $$2, @Nullable buh $$3) {
      if ($$3 == null) {
         $$3 = new bsn.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public evq cM() {
      return new evq(0.0, (double)(0.5F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Override
   public boolean bW() {
      return this.ca() || super.bW();
   }

   static class a<T extends bto> extends bzt<T> {
      private final cfs i;

      public a(cfs $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bsy.e::test);
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

   static class b extends cbu {
      private final cfs c;

      public b(cfs $$0, double $$1, Predicate<cuo> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.c = $$0;
      }

      @Override
      protected boolean h() {
         return super.h() && !this.c.y();
      }
   }
}
