import java.util.UUID;
import javax.annotation.Nullable;

public class cew extends cee implements bsu {
   private static final ajy<Boolean> ch = akc.a(cew.class, aka.k);
   private static final float ci = 6.0F;
   private float ck;
   private float cl;
   private int cm;
   private static final bpl cn = azl.a(20, 39);
   private int co;
   @Nullable
   private UUID cp;

   public cew(bsb<? extends cew> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public brp a(aqt $$0, brp $$1) {
      return bsb.aF.a((dca)$$0);
   }

   @Override
   public boolean o(cuh $$0) {
      return false;
   }

   @Override
   protected void y() {
      super.y();
      this.cb.a(0, new bzf(this));
      this.cb.a(1, new cew.c());
      this.cb.a(1, new cew.d());
      this.cb.a(4, new bzk(this, 1.25));
      this.cb.a(5, new cai(this, 1.0));
      this.cb.a(6, new bzt(this, cly.class, 6.0F));
      this.cb.a(7, new cag(this));
      this.cc.a(1, new cew.b());
      this.cc.a(2, new cew.a());
      this.cc.a(3, new cbe<>(this, cly.class, 10, true, false, this::a_));
      this.cc.a(4, new cbe<>(this, ceo.class, 10, true, true, null));
      this.cc.a(5, new cbk<>(this, false));
   }

   public static btu.a r() {
      return bsq.A().a(btv.q, 30.0).a(btv.k, 20.0).a(btv.r, 0.25).a(btv.c, 6.0);
   }

   public static boolean c(bsb<cew> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      ja<dcz> $$5 = $$1.t($$3);
      return !$$5.a(awd.as) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(awe.cf);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(this.dU(), $$0);
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cn.a(this.al));
   }

   @Override
   public void a(int $$0) {
      this.co = $$0;
   }

   @Override
   public int a() {
      return this.co;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cp = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cp;
   }

   @Override
   protected avn u() {
      return this.o_() ? avo.uS : avo.uR;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.uU;
   }

   @Override
   protected avn n_() {
      return avo.uT;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.uV, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cm <= 0) {
         this.b(avo.uW);
         this.cm = 40;
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dU().C) {
         if (this.cl != this.ck) {
            this.i_();
         }

         this.ck = this.cl;
         if (this.x()) {
            this.cl = aym.a(this.cl + 1.0F, 0.0F, 6.0F);
         } else {
            this.cl = aym.a(this.cl - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cm > 0) {
         this.cm--;
      }

      if (!this.dU().C) {
         this.a_((aqt)this.dU(), true);
      }
   }

   @Override
   public bry e(bsz $$0) {
      if (this.cl > 0.0F) {
         float $$1 = this.cl / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   @Override
   public boolean C(brv $$0) {
      boolean $$1 = $$0.a(this.dX().b((bso)this), (float)((int)this.g(btv.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean x() {
      return this.as.a(ch);
   }

   public void w(boolean $$0) {
      this.as.a(ch, $$0);
   }

   public float G(float $$0) {
      return aym.i($$0, this.ck, this.cl) / 6.0F;
   }

   @Override
   protected float fu() {
      return 0.98F;
   }

   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      if ($$3 == null) {
         $$3 = new brp.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbe<cly> {
      public a() {
         super(cew.this, cly.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cew.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cew $$1 : cew.this.dU().a(cew.class, cew.this.cP().c(8.0, 4.0, 8.0))) {
                  if ($$1.o_()) {
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      protected double l() {
         return super.l() * 0.5;
      }
   }

   class b extends cbd {
      public b() {
         super(cew.this);
      }

      @Override
      public void c() {
         super.c();
         if (cew.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bsq $$0, bso $$1) {
         if ($$0 instanceof cew && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bzv {
      public c() {
         super(cew.this, 1.25, true);
      }

      @Override
      protected void a(bso $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            cew.this.w(false);
         } else if (this.a.g((brv)$$0) < (double)(($$0.do() + 3.0F) * ($$0.do() + 3.0F))) {
            if (this.i()) {
               cew.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cew.this.w(true);
               cew.this.t();
            }
         } else {
            this.h();
            cew.this.w(false);
         }
      }

      @Override
      public void d() {
         cew.this.w(false);
         super.d();
      }
   }

   class d extends cae {
      public d() {
         super(cew.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eu() != null && this.b.o_() || this.b.bV();
      }
   }
}
