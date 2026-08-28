import java.util.UUID;
import javax.annotation.Nullable;

public class chj extends cgr implements bvf {
   private static final akl<Boolean> bY = akp.a(chj.class, akn.k);
   private static final float bZ = 6.0F;
   private float ca;
   private float cc;
   private int cd;
   private static final bro ce = bal.a(20, 39);
   private int cf;
   @Nullable
   private UUID cg;

   public chj(bul<? extends chj> $$0, dfb $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public btv a(arn $$0, btv $$1) {
      return bul.aD.a($$0, buk.e);
   }

   @Override
   public boolean l(cwb $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bS.a(0, new cbs(this));
      this.bS.a(1, new chj.c());
      this.bS.a(1, new ccr(this, 2.0, $$0 -> $$0.p_() ? axc.F : axc.G));
      this.bS.a(4, new cbx(this, 1.25));
      this.bS.a(5, new ccv(this, 1.0));
      this.bS.a(6, new ccg(this, com.class, 6.0F));
      this.bS.a(7, new cct(this));
      this.bT.a(1, new chj.b());
      this.bT.a(2, new chj.a());
      this.bT.a(3, new cdr<>(this, com.class, 10, true, false, this::a_));
      this.bT.a(4, new cdr<>(this, chb.class, 10, true, true, null));
      this.bT.a(5, new cdx<>(this, false));
   }

   public static bwh.a q() {
      return cgr.gz().a(bwi.s, 30.0).a(bwi.m, 20.0).a(bwi.v, 0.25).a(bwi.c, 6.0);
   }

   public static boolean c(bul<chj> $$0, dfc $$1, buk $$2, jh $$3, azs $$4) {
      jq<dgc> $$5 = $$1.t($$3);
      return !$$5.a(awz.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(axa.cd);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(this.dX(), $$0);
   }

   @Override
   public void b(uk $$0) {
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
   protected awk w() {
      return this.p_() ? awl.uw : awl.uv;
   }

   @Override
   protected awk d(bsu $$0) {
      return awl.uy;
   }

   @Override
   protected awk o_() {
      return awl.ux;
   }

   @Override
   protected void b(jh $$0, dvj $$1) {
      this.a(awl.uz, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.cd <= 0) {
         this.b(awl.uA);
         this.cd = 40;
      }
   }

   @Override
   protected void a(akp.a $$0) {
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
            this.cc = azk.a(this.cc + 1.0F, 0.0F, 6.0F);
         } else {
            this.cc = azk.a(this.cc - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.cd > 0) {
         this.cd--;
      }

      if (!this.dX().C) {
         this.a((arn)this.dX(), true);
      }
   }

   @Override
   public buh e(bvm $$0) {
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
      return azk.h($$0, this.ca, this.cc) / 6.0F;
   }

   @Override
   protected float fo() {
      return 0.98F;
   }

   @Override
   public bvt a(dfr $$0, bsb $$1, buk $$2, @Nullable bvt $$3) {
      if ($$3 == null) {
         $$3 = new btv.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends cdr<com> {
      public a() {
         super(chj.this, com.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (chj.this.p_()) {
            return false;
         } else {
            if (super.b()) {
               for (chj $$1 : chj.this.dX().a(chj.class, chj.this.cS().c(8.0, 4.0, 8.0))) {
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

   class b extends cdq {
      public b() {
         super(chj.this);
      }

      @Override
      public void d() {
         super.d();
         if (chj.this.p_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(bvc $$0, bva $$1) {
         if ($$0 instanceof chj && !$$0.p_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cci {
      public c() {
         super(chj.this, 1.25, true);
      }

      @Override
      protected void a(bva $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            chj.this.x(false);
         } else if (this.a.g((bue)$$0) < (double)(($$0.ds() + 3.0F) * ($$0.ds() + 3.0F))) {
            if (this.i()) {
               chj.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               chj.this.x(true);
               chj.this.t();
            }
         } else {
            this.h();
            chj.this.x(false);
         }
      }

      @Override
      public void e() {
         chj.this.x(false);
         super.e();
      }
   }
}
