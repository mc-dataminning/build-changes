import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxe extends bxy {
   private static final afs<hx> d = afv.a(bxe.class, afu.n);
   private static final afs<Boolean> e = afv.a(bxe.class, afu.k);
   private static final afs<Integer> bT = afv.a(bxe.class, afu.b);
   static final bvx bU = bvx.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cas> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public bxe(bkz<? extends bxe> $$0, csf $$1) {
      super($$0, $$1);
      this.bL = new brl(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brk(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
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
      return this.an.b(bT);
   }

   public void c(int $$0) {
      this.an.b(bT, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, hx.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(sd $$0) {
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
      this.bO.a(0, new brr(this));
      this.bO.a(0, new btq(this));
      this.bO.a(1, new bxe.a(this));
      this.bO.a(2, new bxe.b(this, 4.0));
      this.bO.a(4, new bte(this, 1.0, 10));
      this.bO.a(4, new btb(this));
      this.bO.a(5, new bso(this, cdz.class, 6.0F));
      this.bO.a(5, new brw(this, 10));
      this.bO.a(6, new bsq(this, 1.2F, true));
      this.bO.a(8, new bxe.c());
      this.bO.a(8, new bsb(this));
      this.bO.a(9, new brn<>(this, cbj.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new bty(this, cbj.class).a());
   }

   public static bmq.a gf() {
      return bln.C().a(bmr.l, 10.0).a(bmr.m, 1.2F).a(bmr.c, 3.0);
   }

   @Override
   protected buu b(csf $$0) {
      return new buw(this, $$0);
   }

   @Override
   public boolean C(bkv $$0) {
      boolean $$1 = $$0.a(this.dO().b((bll)this), (float)((int)this.b(bmr.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqv.gl, 1.0F, 1.0F);
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
   protected float b(blx $$0, bkw $$1) {
      return 0.3F;
   }

   @Override
   public int aa() {
      return 1;
   }

   @Override
   public int ab() {
      return 1;
   }

   @Override
   protected boolean o(bkv $$0) {
      return true;
   }

   @Override
   public boolean f(clo $$0) {
      bla $$1 = bln.h($$0);
      return !this.c($$1).b() ? false : $$1 == bla.a && super.f($$0);
   }

   @Override
   protected void b(cas $$0) {
      if (this.c(bla.a).b()) {
         clo $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bla.a, $$1);
            this.e(bla.a);
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
               this.a(this.dO().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dq().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dN().B && this.aZ() && this.dq().g() > 0.03) {
            ejz $$0 = this.f(0.0F);
            float $$1 = atq.b(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = atq.a(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dN()
                  .a(jw.an, this.ds() - $$0.c * (double)$$3 + (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dN()
                  .a(jw.an, this.ds() - $$0.c * (double)$$3 - (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(jw.K);
      } else {
         super.b($$0);
      }
   }

   private void a(ju $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dN().a($$0, this.d(1.0), this.dv() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(ars.ao)) {
         if (!this.dN().B) {
            this.a(aqv.gn, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         return bjb.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.go;
   }

   @Nullable
   @Override
   protected aqu n_() {
      return aqv.gm;
   }

   @Nullable
   @Override
   protected aqu y() {
      return this.aZ() ? aqv.gk : aqv.gj;
   }

   @Override
   protected aqu aO() {
      return aqv.gr;
   }

   @Override
   protected aqu aN() {
      return aqv.gs;
   }

   protected boolean gg() {
      hx $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dl(), 12.0) : false;
   }

   @Override
   public void a(ejz $$0) {
      if (this.cZ() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blr.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cdz $$0) {
      return true;
   }

   static class a extends bsg {
      private final bxe a;
      private boolean b;

      a(bxe $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
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
         return !hx.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dN() instanceof ami) {
            ami $$0 = (ami)this.a.dN();
            this.b = false;
            this.a.N().n();
            hx $$1 = this.a.dn();
            hx $$2 = $$0.a(arv.b, $$1, 50, false);
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
         if (hx.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         csf $$0 = this.a.dN();
         if (this.a.gg() || this.a.N().l()) {
            ejz $$1 = ejz.b(this.a.u());
            ejz $$2 = bwb.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bwb.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hx $$3 = hx.a($$2);
               if (!$$0.b_($$3).a(arp.a) || !$$0.a_($$3).a($$0, $$3, edn.b)) {
                  $$2 = bwb.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.I().a($$2.c, $$2.d, $$2.e, (float)(this.a.ab() + 20), (float)this.a.aa());
            this.a.N().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bsg {
      private final bxe a;
      private final double b;
      @Nullable
      private cdz c;

      b(bxe $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bsg.a.a, bsg.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dN().a(bxe.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bki(bkk.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.N().n();
      }

      @Override
      public void e() {
         this.a.I().a(this.c, (float)(this.a.ab() + 20), (float)this.a.aa());
         if (this.a.f(this.c) < 6.25) {
            this.a.N().n();
         } else {
            this.a.N().a(this.c, this.b);
         }

         if (this.c.bZ() && this.c.dN().z.a(6) == 0) {
            this.c.b(new bki(bkk.D, 100), this.a);
         }
      }
   }

   class c extends bsg {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bxe.this.ah) {
            return false;
         } else {
            List<cas> $$0 = bxe.this.dN().a(cas.class, bxe.this.cH().c(8.0, 8.0, 8.0), bxe.c);
            return !$$0.isEmpty() || !bxe.this.c(bla.a).b();
         }
      }

      @Override
      public void c() {
         List<cas> $$0 = bxe.this.dN().a(cas.class, bxe.this.cH().c(8.0, 8.0, 8.0), bxe.c);
         if (!$$0.isEmpty()) {
            bxe.this.N().a($$0.get(0), 1.2F);
            bxe.this.a(aqv.gq, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clo $$0 = bxe.this.c(bla.a);
         if (!$$0.b()) {
            this.a($$0);
            bxe.this.a(bla.a, clo.b);
            this.b = bxe.this.ah + bxe.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cas> $$0 = bxe.this.dN().a(cas.class, bxe.this.cH().c(8.0, 8.0, 8.0), bxe.c);
         clo $$1 = bxe.this.c(bla.a);
         if (!$$1.b()) {
            this.a($$1);
            bxe.this.a(bla.a, clo.b);
         } else if (!$$0.isEmpty()) {
            bxe.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(clo $$0) {
         if (!$$0.b()) {
            double $$1 = bxe.this.dw() - 0.3F;
            cas $$2 = new cas(bxe.this.dN(), bxe.this.ds(), $$1, bxe.this.dy(), $$0);
            $$2.b(40);
            $$2.a(bxe.this);
            float $$3 = 0.3F;
            float $$4 = bxe.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bxe.this.ag.i();
            $$2.o(
               (double)(0.3F * -atq.a(bxe.this.dD() * (float) (Math.PI / 180.0)) * atq.b(bxe.this.dF() * (float) (Math.PI / 180.0)) + atq.b($$4) * $$5),
               (double)(0.3F * atq.a(bxe.this.dF() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * atq.b(bxe.this.dD() * (float) (Math.PI / 180.0)) * atq.b(bxe.this.dF() * (float) (Math.PI / 180.0)) + atq.a($$4) * $$5)
            );
            bxe.this.dN().b($$2);
         }
      }
   }
}
