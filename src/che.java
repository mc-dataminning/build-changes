import java.util.UUID;
import javax.annotation.Nullable;

public class che extends cgm implements bva {
   private static final akk<Boolean> bY = ako.a(che.class, akm.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final brj ce = bak.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public che(bug<? extends che> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public btq a(arm $$0, btq $$1) {
      return bug.aD.a($$0, buf.e);
   }

   @Override
   public boolean l(cvx $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new che.c());
      this.bS.a(1, new ccm(this, 2.0, $$0 -> $$0.p_() ? axb.F : axb.G));
      this.bS.a(4, new cbs(this, 1.25));
      this.bS.a(5, new ccq(this, 1.0));
      this.bS.a(6, new ccb(this, coh.class, 6.0F));
      this.bS.a(7, new cco(this));
      this.bT.a(1, new che.b());
      this.bT.a(2, new che.a());
      this.bT.a(3, new cdm<>(this, coh.class, 10, true, false, this::a_));
      this.bT.a(4, new cdm<>(this, cgw.class, 10, true, true, null));
      this.bT.a(5, new cds<>(this, false));
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 30.0).a(bwd.m, 20.0).a(bwd.v, 0.25).a(bwd.c, 6.0);
   }

   public static boolean c(bug<che> $$0, dew $$1, buf $$2, jg $$3, azr $$4) {
      jp<dfw> $$5 = $$1.t($$3);
      return !$$5.a(awy.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(awz.cd);
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.a(this.dX(), $$0);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(ce.a(this.af));
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
   protected awj w() {
      return this.p_() ? awk.uw : awk.uv;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.uy;
   }

   @Override
   protected awj o_() {
      return awk.ux;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.uz, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awk.uA);
         this.cd = 40;
      }
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bY, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dX().C) {
         if (this.cc != this.ca) {
            this.j_();
         }

         this.ca = this.cc;
         if (this.y()) {
            this.cc = azj.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = azj.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dX().C) {
         this.a((arm)this.dX(), true);
      }
   }

   @Override
   public buc e(bvh $$0) {
      if (this.cc > 0.0F) {
         float $$1 = this.cc / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean y() {
      return this.am.a(bY);
   }

   public void x(boolean $$0) {
      this.am.a(bY, $$0);
   }

   public float J(float $$0) {
      return azj.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fo() {
      return 0.98F;
   }

   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      if ($$3 == null) {
         $$3 = new btq.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdm<coh> {
      public a() {
         super(che.this, coh.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (che.this.p_()) {
            return false;
         } else {
            if (super.b()) {
               for (che $$1 : che.this.dX().a(che.class, che.this.cS().c(8.0, 4.0, 8.0))) {
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

   class b extends cdl {
      public b() {
         super(che.this);
      }

      @Override
      public void d() {
         super.d();
         if (che.this.p_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bux $$0, buv $$1) {
         if ($$0 instanceof che && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends ccd {
      public c() {
         super(che.this, 1.25, true);
      }

      @Override
      protected void a(buv $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            che.this.x(false);
         } else if (this.a.g((btz)$$0) < (double)(($$0.ds() + 3.0F) * ($$0.ds() + 3.0F))) {
            if (this.i()) {
               che.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               che.this.x(true);
               che.this.t();
            }
         } else {
            this.h();
            che.this.x(false);
         }
      }

      @Override
      public void e() {
         che.this.x(false);
         super.e();
      }
   }
}
