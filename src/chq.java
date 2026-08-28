import java.util.UUID;
import javax.annotation.Nullable;

public class chq extends cgy implements bvm {
   private static final ajy<Boolean> bY = akc.a(chq.class, aka.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brv ce = bab.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public chq(bus<? extends chq> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public buc a(ard $$0, buc $$1) {
      return bus.aU.a($$0, bur.e);
   }

   @Override
   public boolean j(cwp $$0) {
      return false;
   }

   @Override
   protected void E() {
      super.E();
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new chq.c());
      this.bS.a(1, new ccy(this, 2.0, $$0 -> $$0.e_() ? awr.F : awr.G));
      this.bS.a(4, new cce(this, 1.25));
      this.bS.a(5, new cdc(this, 1.0));
      this.bS.a(6, new ccn(this, cox.class, 6.0F));
      this.bS.a(7, new cda(this));
      this.bT.a(1, new chq.b());
      this.bT.a(2, new chq.a());
      this.bT.a(3, new cdy<>(this, cox.class, 10, true, false, this::a));
      this.bT.a(4, new cdy<>(this, chi.class, 10, true, true, null));
      this.bT.a(5, new cee<>(this, false));
   }

   public static bwo.a p() {
      return cgy.gx().a(bwp.s, 30.0).a(bwp.m, 20.0).a(bwp.v, 0.25).a(bwp.c, 6.0);
   }

   public static boolean c(bus<chq> $$0, dgj $$1, bur $$2, ji $$3, azh $$4) {
      jr<dhk> $$5 = $$1.t($$3);
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
   protected avz e(btb $$0) {
      return awa.uZ;
   }

   @Override
   protected avz o_() {
      return awa.uY;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
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
   public buo e(bvt $$0) {
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      if ($$3 == null) {
         $$3 = new buc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdy<cox> {
      public a() {
         super(chq.this, cox.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (chq.this.e_()) {
            return false;
         } else {
            if (super.b()) {
               for (chq $$1 : chq.this.dV().a(chq.class, chq.this.cR().c(8.0, 4.0, 8.0))) {
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

   class b extends cdx {
      public b() {
         super(chq.this);
      }

      @Override
      public void d() {
         super.d();
         if (chq.this.e_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvj $$0, bvh $$1) {
         if ($$0 instanceof chq && !$$0.e_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends ccp {
      public c() {
         super(chq.this, 1.25, true);
      }

      @Override
      protected void a(bvh $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.c(a(this.a), $$0);
            chq.this.x(false);
         } else if (this.a.g((bul)$$0) < (double)(($$0.dq() + 3.0F) * ($$0.dq() + 3.0F))) {
            if (this.i()) {
               chq.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               chq.this.x(true);
               chq.this.t();
            }
         } else {
            this.h();
            chq.this.x(false);
         }
      }

      @Override
      public void e() {
         chq.this.x(false);
         super.e();
      }
   }
}
