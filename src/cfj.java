import java.util.UUID;
import javax.annotation.Nullable;

public class cfj extends cer implements bth {
   private static final ajp<Boolean> ca = ajt.a(cfj.class, ajr.k);
   private static final float cb = 6.0F;
   private float cd;
   private float ce;
   private int cf;
   private static final bpr cg = azh.a(20, 39);
   private int ch;
   @Nullable
   private UUID ci;

   public cfj(bsm<? extends cfj> $$0, dcf $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bsa a(aqm $$0, bsa $$1) {
      return bsm.aD.a((dcf)$$0);
   }

   @Override
   public boolean o(cuc $$0) {
      return false;
   }

   @Override
   protected void z() {
      super.z();
      this.bU.a(0, new bzt(this));
      this.bU.a(1, new cfj.c());
      this.bU.a(1, new cfj.d());
      this.bU.a(4, new bzy(this, 1.25));
      this.bU.a(5, new caw(this, 1.0));
      this.bU.a(6, new cah(this, cmk.class, 6.0F));
      this.bU.a(7, new cau(this));
      this.bV.a(1, new cfj.b());
      this.bV.a(2, new cfj.a());
      this.bV.a(3, new cbs<>(this, cmk.class, 10, true, false, this::a_));
      this.bV.a(4, new cbs<>(this, cfb.class, 10, true, true, null));
      this.bV.a(5, new cby<>(this, false));
   }

   public static bui.a s() {
      return btd.A().a(buj.s, 30.0).a(buj.m, 20.0).a(buj.v, 0.25).a(buj.c, 6.0);
   }

   public static boolean c(bsm<cfj> $$0, dcg $$1, btf $$2, ja $$3, ayo $$4) {
      jj<ddf> $$5 = $$1.t($$3);
      return !$$5.a(avv.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(avw.cc);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      this.a(this.dQ(), $$0);
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
      return this.p_() ? avh.ux : avh.uw;
   }

   @Override
   protected avg d(bqz $$0) {
      return avh.uz;
   }

   @Override
   protected avg o_() {
      return avh.uy;
   }

   @Override
   protected void b(ja $$0, dsk $$1) {
      this.a(avh.uA, 0.15F, 1.0F);
   }

   protected void u() {
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
      if (this.dQ().B) {
         if (this.ce != this.cd) {
            this.j_();
         }

         this.cd = this.ce;
         if (this.y()) {
            this.ce = ayg.a(this.ce + 1.0F, 0.0F, 6.0F);
         } else {
            this.ce = ayg.a(this.ce - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cf > 0) {
         this.cf--;
      }

      if (!this.dQ().B) {
         this.a((aqm)this.dQ(), true);
      }
   }

   @Override
   public bsj e(btn $$0) {
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
      return ayg.i($$0, this.cd, this.ce) / 6.0F;
   }

   @Override
   protected float fi() {
      return 0.98F;
   }

   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      if ($$3 == null) {
         $$3 = new bsa.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cbs<cmk> {
      public a() {
         super(cfj.this, cmk.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (cfj.this.p_()) {
            return false;
         } else {
            if (super.a()) {
               for (cfj $$1 : cfj.this.dQ().a(cfj.class, cfj.this.cL().c(8.0, 4.0, 8.0))) {
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

   class b extends cbr {
      public b() {
         super(cfj.this);
      }

      @Override
      public void c() {
         super.c();
         if (cfj.this.p_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(btd $$0, btb $$1) {
         if ($$0 instanceof cfj && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends caj {
      public c() {
         super(cfj.this, 1.25, true);
      }

      @Override
      protected void a(btb $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.D($$0);
            cfj.this.w(false);
         } else if (this.a.g((bsg)$$0) < (double)(($$0.dk() + 3.0F) * ($$0.dk() + 3.0F))) {
            if (this.i()) {
               cfj.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               cfj.this.w(true);
               cfj.this.u();
            }
         } else {
            this.h();
            cfj.this.w(false);
         }
      }

      @Override
      public void d() {
         cfj.this.w(false);
         super.d();
      }
   }

   class d extends cas {
      public d() {
         super(cfj.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ej() != null && this.b.p_() || this.b.bR();
      }
   }
}
