import java.util.UUID;
import javax.annotation.Nullable;

public class bxj extends bwr implements bln {
   private static final afo<Boolean> bT = afr.a(bxj.class, afq.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bii bZ = aul.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bxj(bku<? extends bxj> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bkl a(ame $$0, bkl $$1) {
      return bku.az.a((csa)$$0);
   }

   @Override
   public boolean m(clj $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new brv(this));
      this.bO.a(1, new bxj.c());
      this.bO.a(1, new bxj.d());
      this.bO.a(4, new bsa(this, 1.25));
      this.bO.a(5, new bsy(this, 1.0));
      this.bO.a(6, new bsj(this, cdu.class, 6.0F));
      this.bO.a(7, new bsw(this));
      this.bP.a(1, new bxj.b());
      this.bP.a(2, new bxj.a());
      this.bP.a(3, new btu<>(this, cdu.class, 10, true, false, this::a_));
      this.bP.a(4, new btu<>(this, bxb.class, 10, true, true, null));
      this.bP.a(5, new bua<>(this, false));
   }

   public static bml.a u() {
      return bli.C().a(bmm.l, 30.0).a(bmm.g, 20.0).a(bmm.m, 0.25).a(bmm.c, 6.0);
   }

   public static boolean c(bku<bxj> $$0, csb $$1, blk $$2, ht $$3, ats $$4) {
      ib<csy> $$5 = $$1.s($$3);
      return !$$5.a(arf.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(arg.bU);
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(bZ.a(this.ag));
   }

   @Override
   public void a(int $$0) {
      this.ca = $$0;
   }

   @Override
   public int a() {
      return this.ca;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cb = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cb;
   }

   @Override
   protected aqq y() {
      return this.n_() ? aqr.tf : aqr.te;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.th;
   }

   @Override
   protected aqq m_() {
      return aqr.tg;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.ti, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(aqr.tj, 1.0F, this.eY());
         this.bY = 40;
      }
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         if (this.bX != this.bW) {
            this.j_();
         }

         this.bW = this.bX;
         if (this.A()) {
            this.bX = atm.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = atm.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dN().B) {
         this.a((ame)this.dN(), true);
      }
   }

   @Override
   public bkr a(bls $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = $$0.a(this.dO().b((blg)this), (float)((int)this.b(bmm.c)));
      if ($$1) {
         this.a(this, $$0);
      }

      return $$1;
   }

   public boolean A() {
      return this.an.b(bT);
   }

   public void w(boolean $$0) {
      this.an.b(bT, $$0);
   }

   public float E(float $$0) {
      return atm.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fe() {
      return 0.98F;
   }

   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      if ($$3 == null) {
         $$3 = new bkl.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends btu<cdu> {
      public a() {
         super(bxj.this, cdu.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bxj.this.n_()) {
            return false;
         } else {
            if (super.a()) {
               for (bxj $$1 : bxj.this.dN().a(bxj.class, bxj.this.cH().c(8.0, 4.0, 8.0))) {
                  if ($$1.n_()) {
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

   class b extends btt {
      public b() {
         super(bxj.this);
      }

      @Override
      public void c() {
         super.c();
         if (bxj.this.n_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bli $$0, blg $$1) {
         if ($$0 instanceof bxj && !$$0.n_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bsl {
      public c() {
         super(bxj.this, 1.25, true);
      }

      @Override
      protected void a(blg $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxj.this.w(false);
         } else if (this.a.f((bkq)$$0) < (double)(($$0.dh() + 3.0F) * ($$0.dh() + 3.0F))) {
            if (this.i()) {
               bxj.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bxj.this.w(true);
               bxj.this.w();
            }
         } else {
            this.h();
            bxj.this.w(false);
         }
      }

      @Override
      public void d() {
         bxj.this.w(false);
         super.d();
      }
   }

   class d extends bsu {
      public d() {
         super(bxj.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ei() != null && this.b.n_() || this.b.bN();
      }
   }
}
