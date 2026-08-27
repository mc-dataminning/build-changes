import java.util.UUID;
import javax.annotation.Nullable;

public class byq extends bxy implements bms {
   private static final agm<Boolean> bT = agp.a(byq.class, ago.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bjm bZ = avp.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byq(blz<? extends byq> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public blq a(and $$0, blq $$1) {
      return blz.aA.a((ctp)$$0);
   }

   @Override
   public boolean m(cmy $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new btb(this));
      this.bO.a(1, new byq.c());
      this.bO.a(1, new byq.d());
      this.bO.a(4, new btg(this, 1.25));
      this.bO.a(5, new bue(this, 1.0));
      this.bO.a(6, new btp(this, cfi.class, 6.0F));
      this.bO.a(7, new buc(this));
      this.bP.a(1, new byq.b());
      this.bP.a(2, new byq.a());
      this.bP.a(3, new bva<>(this, cfi.class, 10, true, false, this::a_));
      this.bP.a(4, new bva<>(this, byi.class, 10, true, true, null));
      this.bP.a(5, new bvg<>(this, false));
   }

   public static bnq.a u() {
      return bmn.C().a(bnr.l, 30.0).a(bnr.g, 20.0).a(bnr.m, 0.25).a(bnr.c, 6.0);
   }

   public static boolean c(blz<byq> $$0, ctq $$1, bmp $$2, hx $$3, auv $$4) {
      ih<cuo> $$5 = $$1.t($$3);
      return !$$5.a(asg.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(ash.bU);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(sn $$0) {
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
   protected arr y() {
      return this.o_() ? ars.tA : ars.tz;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.tC;
   }

   @Override
   protected arr n_() {
      return ars.tB;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.tD, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(ars.tE, 1.0F, this.eX());
         this.bY = 40;
      }
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bT, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         if (this.bX != this.bW) {
            this.k_();
         }

         this.bW = this.bX;
         if (this.A()) {
            this.bX = auo.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = auo.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dM().B) {
         this.a((and)this.dM(), true);
      }
   }

   @Override
   public blw a(bmx $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(blv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bml)this), (float)((int)this.b(bnr.c)));
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
      return auo.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      if ($$3 == null) {
         $$3 = new blq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends bva<cfi> {
      public a() {
         super(byq.this, cfi.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (byq.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (byq $$1 : byq.this.dM().a(byq.class, byq.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends buz {
      public b() {
         super(byq.this);
      }

      @Override
      public void c() {
         super.c();
         if (byq.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bmn $$0, bml $$1) {
         if ($$0 instanceof byq && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends btr {
      public c() {
         super(byq.this, 1.25, true);
      }

      @Override
      protected void a(bml $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byq.this.w(false);
         } else if (this.a.f((blv)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               byq.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               byq.this.w(true);
               byq.this.w();
            }
         } else {
            this.h();
            byq.this.w(false);
         }
      }

      @Override
      public void d() {
         byq.this.w(false);
         super.d();
      }
   }

   class d extends bua {
      public d() {
         super(byq.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eh() != null && this.b.o_() || this.b.bN();
      }
   }
}
