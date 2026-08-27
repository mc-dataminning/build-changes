import java.util.UUID;
import javax.annotation.Nullable;

public class bxo extends bww implements bls {
   private static final afs<Boolean> bT = afv.a(bxo.class, afu.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bim bZ = aup.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public bxo(bkz<? extends bxo> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bkq a(ami $$0, bkq $$1) {
      return bkz.az.a((csf)$$0);
   }

   @Override
   public boolean m(clo $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new bxo.c());
      this.bO.a(1, new bxo.d());
      this.bO.a(4, new bsf(this, 1.25));
      this.bO.a(5, new btd(this, 1.0));
      this.bO.a(6, new bso(this, cdz.class, 6.0F));
      this.bO.a(7, new btb(this));
      this.bP.a(1, new bxo.b());
      this.bP.a(2, new bxo.a());
      this.bP.a(3, new btz<>(this, cdz.class, 10, true, false, this::a_));
      this.bP.a(4, new btz<>(this, bxg.class, 10, true, true, null));
      this.bP.a(5, new buf<>(this, false));
   }

   public static bmq.a u() {
      return bln.C().a(bmr.l, 30.0).a(bmr.g, 20.0).a(bmr.m, 0.25).a(bmr.c, 6.0);
   }

   public static boolean c(bkz<bxo> $$0, csg $$1, blp $$2, hx $$3, atw $$4) {
      ig<ctd> $$5 = $$1.s($$3);
      return !$$5.a(arj.an) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(ark.bU);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      this.a(this.dN(), $$0);
   }

   @Override
   public void b(sd $$0) {
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
   protected aqu y() {
      return this.o_() ? aqv.tf : aqv.te;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.th;
   }

   @Override
   protected aqu n_() {
      return aqv.tg;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.ti, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(aqv.tj, 1.0F, this.eY());
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
      if (this.dN().B) {
         if (this.bX != this.bW) {
            this.k_();
         }

         this.bW = this.bX;
         if (this.A()) {
            this.bX = atq.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = atq.a(this.bX - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.bY > 0) {
         this.bY--;
      }

      if (!this.dN().B) {
         this.a((ami)this.dN(), true);
      }
   }

   @Override
   public bkw a(blx $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = $$0.a(this.dO().b((bll)this), (float)((int)this.b(bmr.c)));
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
      return atq.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fe() {
      return 0.98F;
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      if ($$3 == null) {
         $$3 = new bkq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends btz<cdz> {
      public a() {
         super(bxo.this, cdz.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (bxo.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (bxo $$1 : bxo.this.dN().a(bxo.class, bxo.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends bty {
      public b() {
         super(bxo.this);
      }

      @Override
      public void c() {
         super.c();
         if (bxo.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bln $$0, bll $$1) {
         if ($$0 instanceof bxo && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends bsq {
      public c() {
         super(bxo.this, 1.25, true);
      }

      @Override
      protected void a(bll $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            bxo.this.w(false);
         } else if (this.a.f((bkv)$$0) < (double)(($$0.dh() + 3.0F) * ($$0.dh() + 3.0F))) {
            if (this.i()) {
               bxo.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               bxo.this.w(true);
               bxo.this.w();
            }
         } else {
            this.h();
            bxo.this.w(false);
         }
      }

      @Override
      public void d() {
         bxo.this.w(false);
         super.d();
      }
   }

   class d extends bsz {
      public d() {
         super(bxo.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.ei() != null && this.b.o_() || this.b.bN();
      }
   }
}
