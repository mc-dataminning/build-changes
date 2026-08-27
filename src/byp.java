import java.util.UUID;
import javax.annotation.Nullable;

public class byp extends bxx implements bmr {
   private static final agm<Boolean> bT = agp.a(byp.class, ago.k);
   private static final float bU = 6.0F;
   private float bW;
   private float bX;
   private int bY;
   private static final bjl bZ = avo.a(20, 39);
   private int ca;
   @Nullable
   private UUID cb;

   public byp(bly<? extends byp> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public blp a(and $$0, blp $$1) {
      return bly.aA.a((cto)$$0);
   }

   @Override
   public boolean m(cmx $$0) {
      return false;
   }

   @Override
   protected void B() {
      super.B();
      this.bO.a(0, new bta(this));
      this.bO.a(1, new byp.c());
      this.bO.a(1, new byp.d());
      this.bO.a(4, new btf(this, 1.25));
      this.bO.a(5, new bud(this, 1.0));
      this.bO.a(6, new bto(this, cfh.class, 6.0F));
      this.bO.a(7, new bub(this));
      this.bP.a(1, new byp.b());
      this.bP.a(2, new byp.a());
      this.bP.a(3, new buz<>(this, cfh.class, 10, true, false, this::a_));
      this.bP.a(4, new buz<>(this, byh.class, 10, true, true, null));
      this.bP.a(5, new bvf<>(this, false));
   }

   public static bnp.a u() {
      return bmm.C().a(bnq.l, 30.0).a(bnq.g, 20.0).a(bnq.m, 0.25).a(bnq.c, 6.0);
   }

   public static boolean c(bly<byp> $$0, ctp $$1, bmo $$2, hx $$3, auu $$4) {
      ih<cun> $$5 = $$1.t($$3);
      return !$$5.a(asf.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.d()).a(asg.bU);
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
   protected arq y() {
      return this.o_() ? arr.tA : arr.tz;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.tC;
   }

   @Override
   protected arq n_() {
      return arr.tB;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.tD, 0.15F, 1.0F);
   }

   protected void w() {
      if (this.bY <= 0) {
         this.a(arr.tE, 1.0F, this.eX());
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
            this.bX = aun.a(this.bX + 1.0F, 0.0F, 6.0F);
         } else {
            this.bX = aun.a(this.bX - 1.0F, 0.0F, 6.0F);
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
   public blv a(bmw $$0) {
      if (this.bX > 0.0F) {
         float $$1 = this.bX / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.a($$0).a(1.0F, $$2);
      } else {
         return super.a($$0);
      }
   }

   @Override
   public boolean C(blu $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmk)this), (float)((int)this.b(bnq.c)));
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
      return aun.i($$0, this.bW, this.bX) / 6.0F;
   }

   @Override
   protected float fd() {
      return 0.98F;
   }

   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      if ($$3 == null) {
         $$3 = new blp.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   class a extends buz<cfh> {
      public a() {
         super(byp.this, cfh.class, 20, true, true, null);
      }

      @Override
      public boolean a() {
         if (byp.this.o_()) {
            return false;
         } else {
            if (super.a()) {
               for (byp $$1 : byp.this.dM().a(byp.class, byp.this.cH().c(8.0, 4.0, 8.0))) {
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

   class b extends buy {
      public b() {
         super(byp.this);
      }

      @Override
      public void c() {
         super.c();
         if (byp.this.o_()) {
            this.h();
            this.d();
         }
      }

      @Override
      protected void a(bmm $$0, bmk $$1) {
         if ($$0 instanceof byp && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends btq {
      public c() {
         super(byp.this, 1.25, true);
      }

      @Override
      protected void a(bmk $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.C($$0);
            byp.this.w(false);
         } else if (this.a.f((blu)$$0) < (double)(($$0.dg() + 3.0F) * ($$0.dg() + 3.0F))) {
            if (this.i()) {
               byp.this.w(false);
               this.h();
            }

            if (this.k() <= 10) {
               byp.this.w(true);
               byp.this.w();
            }
         } else {
            this.h();
            byp.this.w(false);
         }
      }

      @Override
      public void d() {
         byp.this.w(false);
         super.d();
      }
   }

   class d extends btz {
      public d() {
         super(byp.this, 2.0);
      }

      @Override
      protected boolean h() {
         return this.b.eh() != null && this.b.o_() || this.b.bN();
      }
   }
}
