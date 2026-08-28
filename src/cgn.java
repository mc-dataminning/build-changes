import java.util.UUID;
import javax.annotation.Nullable;

public class cgn extends cfv implements buk {
   private static final akg<Boolean> bZ = akk.a(cgn.class, aki.k);
   private static final float ca = 6.0F;
   private float cb;
   private float cd;
   private int ce;
   private static final bqv cf = bad.a(20, 39);
   private int cg;
   @Nullable
   private UUID ch;

   public cgn(btq<? extends cgn> $$0, dds $$1) {
      super($$0, $$1);
   }

   @Nullable
   @Override
   public btc a(arg $$0, btc $$1) {
      return btq.aD.a($$0, btp.e);
   }

   @Override
   public boolean p(cvl $$0) {
      return false;
   }

   @Override
   protected void D() {
      super.D();
      this.bT.a(0, new caw(this));
      this.bT.a(1, new cgn.c());
      this.bT.a(1, new cbv(this, 2.0, $$0 -> $$0.o_() ? awu.F : awu.G));
      this.bT.a(4, new cbb(this, 1.25));
      this.bT.a(5, new cbz(this, 1.0));
      this.bT.a(6, new cbk(this, cnp.class, 6.0F));
      this.bT.a(7, new cbx(this));
      this.bU.a(1, new cgn.b());
      this.bU.a(2, new cgn.a());
      this.bU.a(3, new ccv<>(this, cnp.class, 10, true, false, this::a_));
      this.bU.a(4, new ccv<>(this, cgf.class, 10, true, true, null));
      this.bU.a(5, new cdb<>(this, false));
   }

   public static bvl.a q() {
      return cfv.gt().a(bvm.s, 30.0).a(bvm.m, 20.0).a(bvm.v, 0.25).a(bvm.c, 6.0);
   }

   public static boolean c(btq<cgn> $$0, ddt $$1, btp $$2, je $$3, azk $$4) {
      jn<det> $$5 = $$1.t($$3);
      return !$$5.a(awr.ao) ? b($$0, $$1, $$2, $$3, $$4) : a($$1, $$3) && $$1.a_($$3.e()).a(aws.cd);
   }

   @Override
   public void a(uf $$0) {
      super.a($$0);
      this.a(this.dS(), $$0);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      this.a_($$0);
   }

   @Override
   public void c() {
      this.a(cf.a(this.af));
   }

   @Override
   public void a(int $$0) {
      this.cg = $$0;
   }

   @Override
   public int a() {
      return this.cg;
   }

   @Override
   public void a(@Nullable UUID $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public UUID b() {
      return this.ch;
   }

   @Override
   protected awc w() {
      return this.o_() ? awd.uy : awd.ux;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.uA;
   }

   @Override
   protected awc n_() {
      return awd.uz;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.uB, 0.15F, 1.0F);
   }

   protected void t() {
      if (this.ce <= 0) {
         this.b(awd.uC);
         this.ce = 40;
      }
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, false);
   }

   @Override
   public void l() {
      super.l();
      if (this.dS().B) {
         if (this.cd != this.cb) {
            this.i_();
         }

         this.cb = this.cd;
         if (this.y()) {
            this.cd = azc.a(this.cd + 1.0F, 0.0F, 6.0F);
         } else {
            this.cd = azc.a(this.cd - 1.0F, 0.0F, 6.0F);
         }
      }

      if (this.ce > 0) {
         this.ce--;
      }

      if (!this.dS().B) {
         this.a((arg)this.dS(), true);
      }
   }

   @Override
   public btm e(bur $$0) {
      if (this.cd > 0.0F) {
         float $$1 = this.cd / 6.0F;
         float $$2 = 1.0F + $$1;
         return super.e($$0).a(1.0F, $$2);
      } else {
         return super.e($$0);
      }
   }

   public boolean y() {
      return this.am.a(bZ);
   }

   public void x(boolean $$0) {
      this.am.a(bZ, $$0);
   }

   public float J(float $$0) {
      return azc.h($$0, this.cb, this.cd) / 6.0F;
   }

   @Override
   protected float fj() {
      return 0.98F;
   }

   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      if ($$3 == null) {
         $$3 = new btc.a(1.0F);
      }

      return super.a($$0, $$1, $$2, $$3);
   }

   class a extends ccv<cnp> {
      public a() {
         super(cgn.this, cnp.class, 20, true, true, null);
      }

      @Override
      public boolean b() {
         if (cgn.this.o_()) {
            return false;
         } else {
            if (super.b()) {
               for (cgn $$1 : cgn.this.dS().a(cgn.class, cgn.this.cO().c(8.0, 4.0, 8.0))) {
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

   class b extends ccu {
      public b() {
         super(cgn.this);
      }

      @Override
      public void d() {
         super.d();
         if (cgn.this.o_()) {
            this.h();
            this.e();
         }
      }

      @Override
      protected void a(buh $$0, buf $$1) {
         if ($$0 instanceof cgn && !$$0.o_()) {
            super.a($$0, $$1);
         }
      }
   }

   class c extends cbm {
      public c() {
         super(cgn.this, 1.25, true);
      }

      @Override
      protected void a(buf $$0) {
         if (this.b($$0)) {
            this.h();
            this.a.E($$0);
            cgn.this.x(false);
         } else if (this.a.g((btj)$$0) < (double)(($$0.dn() + 3.0F) * ($$0.dn() + 3.0F))) {
            if (this.i()) {
               cgn.this.x(false);
               this.h();
            }

            if (this.k() <= 10) {
               cgn.this.x(true);
               cgn.this.t();
            }
         } else {
            this.h();
            cgn.this.x(false);
         }
      }

      @Override
      public void e() {
         cgn.this.x(false);
         super.e();
      }
   }
}
