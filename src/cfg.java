import java.util.UUID;
import javax.annotation.Nullable;

public class cfg extends ceo implements bte {
   private static final ajp<Boolean> ca = ajt.a(cfg.class, ajr.k);
   private static final float cb = 6.0F;
   private float cd;
   private float ce;
   private int cf;
   private static final bpo cg = aze.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cfg(bsj<? extends cfg> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public brx a(aqk $$0, brx $$1) {
      return bsj.aD.a((dcd)$$0);
   }

   @Override
   public boolean o(cua $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzq(this));
      this.bU.a(1, new cfg.c());
      this.bU.a(1, new cfg.d());
      this.bU.a(4, new bzv(this, 1.25));
      this.bU.a(5, new cat(this, 1.0));
      this.bU.a(6, new cae(this, cmh.class, 6.0F));
      this.bU.a(7, new car(this));
      this.bV.a(1, new cfg.b());
      this.bV.a(2, new cfg.a());
      this.bV.a(3, new cbp<>(this, cmh.class, 10, true, false, this::a_));
      this.bV.a(4, new cbp<>(this, cey.class, 10, true, true, null));
      this.bV.a(5, new cbv<>(this, false));
   }

   public static buf.a s() {
      return bta.A().a(bug.s, 30.0).a(bug.m, 20.0).a(bug.v, 0.25).a(bug.c, 6.0);
   }

   public static boolean c(bsj<cfg> $$0, dce $$1, btc $$2, ja $$3, aym $$4) {
      jj<ddd> $$5 = $$1.t($$3);
      return !$$5.a(avt.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avu.cc);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dP(), $$0);
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
   protected ave v() {
      return this.p_() ? avf.ux : avf.uw;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.uz;
   }

   @Override
   protected ave o_() {
      return avf.uy;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.uA, 0.15F, 1.0F);
   }

   protected void u() {
      if (this.cf <= 0) {
         this.b(avf.uB);
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
      if (this.dP().B) {
         if (this.ce != this.cd) {
            this.j_();
         }

         this.cd = this.ce;
         if (this.y()) {
            this.ce = aye.a(this.ce + 1.0F, 0.0F, 6.0F);
         } else {
            this.ce = aye.a(this.ce - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (!this.dP().B) {
         this.a((aqk)this.dP(), true);
      }
   }

   @Override
   public bsg e(btk $$0) {
      if (this.ce > 0.0F) {
         float $$1 = this.ce / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean y() {
      return this.ao.a(ca);
   }

   public void w(boolean $$0) {
      this.ao.a(ca, $$0);
   }

   public float H(float $$0) {
      return aye.i($$0, this.cd, this.ce) / 6.0F;
   }

   @Override
   protected float fh() {
      return 0.98F;
   }

   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      if ($$3 == null) {
         $$3 = new brx.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbp<cmh> {
      public a() {
         super(cfg.this, cmh.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfg.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfg $$1 : cfg.this.dP().a(cfg.class, cfg.this.cK().c(8.0, 4.0, 8.0))) {
                  if ($$1.p_()) {
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

   class b extends cbo {
      public b() {
         super(cfg.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfg.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bta $$0, bsy $$1) {
         if ($$0 instanceof cfg && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cag {
      public c() {
         super(cfg.this, 1.25, true);
      }

      @Override
      protected void a(bsy $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfg.this.w(false);
         } else if (this.a.g((bsd)$$0) < (double)(($$0.dj() + 3.0F) * ($$0.dj() + 3.0F))) {
            if (this.i()) {
               cfg.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfg.this.w(true);
               cfg.this.u();
            }
         } else {
            this.h();
            cfg.this.w(false);
         }
      }

      @Override
      public void d() {
         cfg.this.w(false);
         super.d();
      }
   }

   class d extends cap {
      public d() {
         super(cfg.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ei() != null && this.b.p_() || this.b.bQ();
      }
   }
}
