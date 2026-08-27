import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byk extends bze {
   private static final agn<hx> d = agq.a(byk.class, agp.n);
   private static final agn<Boolean> e = agq.a(byk.class, agp.k);
   private static final agn<Integer> bU = agq.a(byk.class, agp.b);
   static final bxd bV = bxd.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bW = 2400;
   public static final Predicate<ccb> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public byk(bmc<? extends byk> $$0, ctx $$1) {
      super($$0, $$1);
      this.bM = new bsp(this, 85, 10, 0.02F, 0.1F, true);
      this.bL = new bso(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bnh a(cum $$0, bka $$1, bms $$2, @Nullable bnh $$3, @Nullable so $$4) {
      this.j(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(hx $$0) {
      this.an.b(d, $$0);
   }

   public hx u() {
      return this.an.b(d);
   }

   public boolean w() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int A() {
      return this.an.b(bU);
   }

   public void c(int $$0) {
      this.an.b(bU, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, hx.b);
      this.an.a(e, false);
      this.an.a(bU, 2400);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(so $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new hx($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bP.a(0, new bsv(this));
      this.bP.a(0, new buu(this));
      this.bP.a(1, new byk.a(this));
      this.bP.a(2, new byk.b(this, 4.0));
      this.bP.a(4, new bui(this, 1.0, 10));
      this.bP.a(4, new buf(this));
      this.bP.a(5, new bts(this, cfq.class, 6.0F));
      this.bP.a(5, new bta(this, 10));
      this.bP.a(6, new btu(this, 1.2F, true));
      this.bP.a(8, new byk.c());
      this.bP.a(8, new btf(this));
      this.bP.a(9, new bsr<>(this, ccs.class, 8.0F, 1.0, 1.0));
      this.bQ.a(1, new bvc(this, ccs.class).a());
   }

   public static bnt.a gf() {
      return bmq.C().a(bnu.n, 10.0).a(bnu.o, 1.2F).a(bnu.c, 3.0);
   }

   @Override
   protected bvy b(ctx $$0) {
      return new bwa(this, $$0);
   }

   @Override
   public boolean B(blw $$0) {
      boolean $$1 = $$0.a(this.dM().b((bmo)this), (float)((int)this.g(bnu.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(art.gJ, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int ch() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.ch();
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   public int fH() {
      return 1;
   }

   @Override
   protected boolean n(blw $$0) {
      return true;
   }

   @Override
   public boolean f(cng $$0) {
      bmd $$1 = bmq.h($$0);
      return !this.c($$1).b() ? false : $$1 == bmd.a && super.f($$0);
   }

   @Override
   protected void b(ccb $$0) {
      if (this.c(bmd.a).b()) {
         cng $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bmd.a, $$1);
            this.e(bmd.a);
            this.a($$0, $$1.L());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fV()) {
         this.j(this.ch());
      } else {
         if (this.bb()) {
            this.c(2400);
         } else {
            this.c(this.A() - 1);
            if (this.A() <= 0) {
               this.a(this.dM().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dL().B && this.aZ() && this.do().g() > 0.03) {
            emc $$0 = this.f(0.0F);
            float $$1 = aup.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aup.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dL()
                  .a(jx.ap, this.dq() - $$0.c * (double)$$3 + (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dL()
                  .a(jx.ap, this.dq() - $$0.c * (double)$$3 - (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(jx.M);
      } else {
         super.b($$0);
      }
   }

   private void a(jv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dL().a($$0, this.d(1.0), this.dt() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bkc b(cfq $$0, bkb $$1) {
      cng $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(asq.ao)) {
         if (!this.dL().B) {
            this.a(art.gL, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bkc.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ars d(bkv $$0) {
      return art.gM;
   }

   @Nullable
   @Override
   protected ars n_() {
      return art.gK;
   }

   @Nullable
   @Override
   protected ars y() {
      return this.aZ() ? art.gI : art.gH;
   }

   @Override
   protected ars aO() {
      return art.gP;
   }

   @Override
   protected ars aN() {
      return art.gQ;
   }

   protected boolean gg() {
      hx $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void a(emc $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmu.a, this.do());
         this.g(this.do().a(0.9));
         if (this.q() == null) {
            this.g(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfq $$0) {
      return true;
   }

   static class a extends btk {
      private final byk a;
      private boolean b;

      a(byk $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.w() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         hx $$0 = this.a.u();
         return !hx.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dL() instanceof ane) {
            ane $$0 = (ane)this.a.dL();
            this.b = false;
            this.a.N().n();
            hx $$1 = this.a.dl();
            hx $$2 = $$0.a(ast.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void d() {
         hx $$0 = this.a.u();
         if (hx.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         ctx $$0 = this.a.dL();
         if (this.a.gg() || this.a.N().l()) {
            emc $$1 = emc.b(this.a.u());
            emc $$2 = bxh.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bxh.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hx $$3 = hx.a($$2);
               if (!$$0.b_($$3).a(asn.a) || !$$0.a_($$3).a($$0, $$3, efp.b)) {
                  $$2 = bxh.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.I().a($$2.c, $$2.d, $$2.e, (float)(this.a.fH() + 20), (float)this.a.ab());
            this.a.N().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends btk {
      private final byk a;
      private final double b;
      @Nullable
      private cfq c;

      b(byk $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(btk.a.a, btk.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(byk.bV, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new blj(bll.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.c, (float)(this.a.fH() + 20), (float)this.a.ab());
         if (this.a.f(this.c) < 6.25) {
            this.a.N().n();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dL().z.a(6) == 0) {
            this.c.b(new blj(bll.D, 100), this.a);
         }
      }
   }

   class c extends btk {
      private int b;

      @Override
      public boolean a() {
         if (this.b > byk.this.ah) {
            return false;
         } else {
            List<ccb> $$0 = byk.this.dL().a(ccb.class, byk.this.cH().c(8.0, 8.0, 8.0), byk.c);
            return !$$0.isEmpty() || !byk.this.c(bmd.a).b();
         }
      }

      @Override
      public void c() {
         List<ccb> $$0 = byk.this.dL().a(ccb.class, byk.this.cH().c(8.0, 8.0, 8.0), byk.c);
         if (!$$0.isEmpty()) {
            byk.this.N().a($$0.get(0), 1.2F);
            byk.this.a(art.gO, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cng $$0 = byk.this.c(bmd.a);
         if (!$$0.b()) {
            this.a($$0);
            byk.this.a(bmd.a, cng.f);
            this.b = byk.this.ah + byk.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<ccb> $$0 = byk.this.dL().a(ccb.class, byk.this.cH().c(8.0, 8.0, 8.0), byk.c);
         cng $$1 = byk.this.c(bmd.a);
         if (!$$1.b()) {
            this.a($$1);
            byk.this.a(bmd.a, cng.f);
         } else if (!$$0.isEmpty()) {
            byk.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cng $$0) {
         if (!$$0.b()) {
            double $$1 = byk.this.du() - 0.3F;
            ccb $$2 = new ccb(byk.this.dL(), byk.this.dq(), $$1, byk.this.dw(), $$0);
            $$2.b(40);
            $$2.a(byk.this);
            float $$3 = 0.3F;
            float $$4 = byk.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * byk.this.ag.i();
            $$2.o(
               (double)(0.3F * -aup.a(byk.this.dB() * (float) (Math.PI / 180.0)) * aup.b(byk.this.dD() * (float) (Math.PI / 180.0)) + aup.b($$4) * $$5),
               (double)(0.3F * aup.a(byk.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aup.b(byk.this.dB() * (float) (Math.PI / 180.0)) * aup.b(byk.this.dD() * (float) (Math.PI / 180.0)) + aup.a($$4) * $$5)
            );
            byk.this.dL().b($$2);
         }
      }
   }
}
