import java.util.UUID;
import javax.annotation.Nullable;

public class byk extends bxs implements bmm {
   private static final agj<Boolean> bT = agm.a(byk.class, agl.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bjg bZ = avj.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byk(blt<? extends byk> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public blk a(amz $$0, blk $$1) {
      return blt.aA.a((cti)$$0);
   }

   @Override
   public boolean m(cmr $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsv(this));
      this.bO.a(1, new byk.c());
      this.bO.a(1, new byk.d());
      this.bO.a(4, new bta(this, 1.25));
      this.bO.a(5, new bty(this, 1.0));
      this.bO.a(6, new btj(this, cfb.class, 6.0F));
      this.bO.a(7, new btw(this));
      this.bP.a(1, new byk.b());
      this.bP.a(2, new byk.a());
      this.bP.a(3, new buu<>(this, cfb.class, 10, true, false, this::a_));
      this.bP.a(4, new buu<>(this, byc.class, 10, true, true, null));
      this.bP.a(5, new bva<>(this, false));
   }

   public static bnk.a u() {
      return bmh.C().a(bnl.l, 30.0).a(bnl.g, 20.0).a(bnl.m, 0.25).a(bnl.c, 6.0);
   }

   public static boolean c(blt<byk> $$0, ctj $$1, bmj $$2, hx $$3, aup $$4) {
      ih<cuh> $$5 = $$1.t($$3);
      return !$$5.a(asa.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(asb.bU);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.a(this.dM(), $$0);
   }

   @Override
   public void b(sl $$0) {
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
   protected arl y() {
      return this.o_() ? arm.tA : arm.tz;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.tC;
   }

   @Override
   protected arl n_() {
      return arm.tB;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.tD, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(arm.tE, 1.0F, this.eX());
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
            this.bX = aui.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = aui.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dM().B) {
         this.a((amz)this.dM(), true);
      }
   }

   @Override
   public blq a(bmr $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(blp $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmf)this), (float)((int)this.b(bnl.c)));
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
      return aui.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      if ($$3 == null) {
         $$3 = new blk.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends buu<cfb> {
      public a() {
         super(byk.this, cfb.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (byk.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (byk $$1 : byk.this.dM().a(byk.class, byk.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends but {
      public b() {
         super(byk.this);
      }

      @Override
      public void c() {
         super.c();
         if (byk.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bmh $$0, bmf $$1) {
         if ($$0 instanceof byk && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends btl {
      public c() {
         super(byk.this, 1.25, true);
      }

      @Override
      protected void a(bmf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byk.this.w(false);
         } else if (this.a.f((blp)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               byk.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               byk.this.w(true);
               byk.this.w();
            }
         } else {
            this.h();
            byk.this.w(false);
         }
      }

      @Override
      public void d() {
         byk.this.w(false);
         super.d();
      }
   }

   class d extends btu {
      public d() {
         super(byk.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eh() != null && this.b.o_() || this.b.bN();
      }
   }
}
