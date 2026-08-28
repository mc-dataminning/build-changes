import java.util.UUID;
import javax.annotation.Nullable;

public class cfk extends ces implements bti {
   private static final ajp<Boolean> ca = ajt.a(cfk.class, ajr.k);
   private static final float cb = 6.0F;
   private float cd;
   private float ce;
   private int cf;
   private static final bps cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cfk(bsn<? extends cfk> $$0, dcg $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsb a(aqm $$0, bsb $$1) {
      return bsn.aD.a((dcg)$$0);
   }

   @Override
   public boolean o(cud $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzu(this));
      this.bU.a(1, new cfk.c());
      this.bU.a(1, new cfk.d());
      this.bU.a(4, new bzz(this, 1.25));
      this.bU.a(5, new cax(this, 1.0));
      this.bU.a(6, new cai(this, cml.class, 6.0F));
      this.bU.a(7, new cav(this));
      this.bV.a(1, new cfk.b());
      this.bV.a(2, new cfk.a());
      this.bV.a(3, new cbt<>(this, cml.class, 10, true, false, this::a_));
      this.bV.a(4, new cbt<>(this, cfc.class, 10, true, true, null));
      this.bV.a(5, new cbz<>(this, false));
   }

   public static buj.a s() {
      return bte.A().a(buk.s, 30.0).a(buk.m, 20.0).a(buk.v, 0.25).a(buk.c, 6.0);
   }

   public static boolean c(bsn<cfk> $$0, dch $$1, btg $$2, ja $$3, ayo $$4) {
      jj<ddg> $$5 = $$1.t($$3);
      return !$$5.a(avv.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avw.cc);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dR(), $$0);
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      this.c($$0);
   }

   @Override
   public void c() {
      this.a(cg.a(this.ah));
   }

   @Override
   public void a(int $$0) {
      this.ch = $$0;
   }

   @Override
   public int a() {
      return this.ch;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ci;
   }

   @Override
   protected avg v() {
      return this.o_() ? avh.ux : avh.uw;
   }

   @Override
   protected avg d(bra $$0) {
      return avh.uz;
   }

   @Override
   protected avg n_() {
      return avh.uy;
   }

   @Override
   protected void b(ja $$0, dsl $$1) {
      this.a(avh.uA, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cf <= 0) {
         this.b(avh.uB);
         this.cf = 40;
      }
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(ca, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dR().B) {
         if (this.ce != this.cd) {
            this.i_();
         }

         this.cd = this.ce;
         if (this.x()) {
            this.ce = ayg.a(this.ce + 1.0F, 0.0F, 6.0F);
         } else {
            this.ce = ayg.a(this.ce - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (!this.dR().B) {
         this.a((aqm)this.dR(), true);
      }
   }

   @Override
   public bsk e(bto $$0) {
      if (this.ce > 0.0F) {
         float $$1 = this.ce / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.ao.a(ca);
   }

   public void w(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   public float H(float $$0) {
      return ayg.i($$0, this.cd, this.ce) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public btv a(dcv $$0, bqf $$1, btg $$2, @Nullable btv $$3) {
      if ($$3 == null) {
         $$3 = new bsb.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbt<cml> {
      public a() {
         super(cfk.this, cml.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfk.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfk $$1 : cfk.this.dR().a(cfk.class, cfk.this.cM().c(8.0, 4.0, 8.0))) {
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

   class b extends cbs {
      public b() {
         super(cfk.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfk.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bte $$0, btc $$1) {
         if ($$0 instanceof cfk && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cak {
      public c() {
         super(cfk.this, 1.25, true);
      }

      @Override
      protected void a(btc $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfk.this.w(false);
         } else if (this.a.g((bsh)$$0) < (double)(($$0.dl() + 3.0F) * ($$0.dl() + 3.0F))) {
            if (this.i()) {
               cfk.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfk.this.w(true);
               cfk.this.t();
            }
         } else {
            this.h();
            cfk.this.w(false);
         }
      }

      @Override
      public void d() {
         cfk.this.w(false);
         super.d();
      }
   }

   class d extends cat {
      public d() {
         super(cfk.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ek() != null && this.b.o_() || this.b.bS();
      }
   }
}
