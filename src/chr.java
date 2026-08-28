import java.util.UUID;
import javax.annotation.Nullable;

public class chr extends cgz implements bvn {
   private static final ajy<Boolean> bY = akc.a(chr.class, aka.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brw ce = bab.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public chr(but<? extends chr> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public bud a(ard $$0, bud $$1) {
      return but.aU.a($$0, bus.e);
   }

   @Override
   public boolean j(cwq $$0) {
      return false;
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cca(this));
      this.bS.a(1, new chr.c());
      this.bS.a(1, new ccz(this, 2.0, $$0 -> $$0.e_() ? awr.F : awr.G));
      this.bS.a(4, new ccf(this, 1.25));
      this.bS.a(5, new cdd(this, 1.0));
      this.bS.a(6, new cco(this, coy.class, 6.0F));
      this.bS.a(7, new cdb(this));
      this.bT.a(1, new chr.b());
      this.bT.a(2, new chr.a());
      this.bT.a(3, new cdz<>(this, coy.class, 10, true, false, this::a));
      this.bT.a(4, new cdz<>(this, chj.class, 10, true, true, null));
      this.bT.a(5, new cef<>(this, false));
   }

   public static bwp.a p() {
      return cgz.gx().a(bwq.s, 30.0).a(bwq.m, 20.0).a(bwq.v, 0.25).a(bwq.c, 6.0);
   }

   public static boolean c(but<chr> $$0, dgk $$1, bus $$2, ji $$3, azh $$4) {
      jr<dhl> $$5 = $$1.t($$3);
      return !$$5.a(awo.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awp.ce);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.a(this.dV(), $$0);
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.ae));
   }

   @Override
   public void a(int $$0) {
      this.cf = $$0;
   }

   @Override
   public int a() {
      return this.cf;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.cg;
   }

   @Override
   protected avz u() {
      return this.e_() ? awa.uX : awa.uW;
   }

   @Override
   protected avz e(btc $$0) {
      return awa.uZ;
   }

   @Override
   protected avz o_() {
      return awa.uY;
   }

   @Override
   protected void b(ji $$0, dwy $$1) {
      this.a(awa.va, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awa.vb);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         if (this.cc != this.ca) {
            this.m_();
         }

         this.ca = this.cc;
         if (this.x()) {
            this.cc = ayz.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = ayz.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dV().C) {
         this.a((ard)this.dV(), true);
      }
   }

   @Override
   public bup e(bvu $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean x() {
      return this.al.a(bY);
   }

   public void x(boolean $$0) {
      this.al.a(bY, $$0);
   }

   public float J(float $$0) {
      return ayz.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fm() {
      return 0.98F;
   }

   @Override
   public bwb a(dha $$0, bsj $$1, bus $$2, @Nullable bwb $$3) {
      if ($$3 == null) {
         $$3 = new bud.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdz<coy> {
      public a() {
         super(chr.this, coy.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (chr.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (chr $$1 : chr.this.dV().a(chr.class, chr.this.cR().c(8.0, 4.0, 8.0))) {
                  if ($$1.e_()) {
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

   class b extends cdy {
      public b() {
         super(chr.this);
      }

      @Override
      public void d() {
         super.d();
         if (chr.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvk $$0, bvi $$1) {
         if ($$0 instanceof chr && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends ccq {
      public c() {
         super(chr.this, 1.25, true);
      }

      @Override
      protected void a(bvi $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chr.this.x(false);
         } else if (this.a.g((bum)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               chr.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               chr.this.x(true);
               chr.this.t();
            }
         } else {
            this.h();
            chr.this.x(false);
         }
      }

      @Override
      public void e() {
         chr.this.x(false);
         super.e();
      }
   }
}
