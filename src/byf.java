import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byf extends byz {
   private static final agm<hx> d = agp.a(byf.class, ago.n);
   private static final agm<Boolean> e = agp.a(byf.class, ago.k);
   private static final agm<Integer> bT = agp.a(byf.class, ago.b);
   static final bwy bU = bwy.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cbt> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public byf(bly<? extends byf> $$0, cto $$1) {
      super($$0, $$1);
      this.bL = new bsl(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bsk(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
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
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(sn $$0) {
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
      this.bO.a(0, new bsr(this));
      this.bO.a(0, new buq(this));
      this.bO.a(1, new byf.a(this));
      this.bO.a(2, new byf.b(this, 4.0));
      this.bO.a(4, new bue(this, 1.0, 10));
      this.bO.a(4, new bub(this));
      this.bO.a(5, new bto(this, cfh.class, 6.0F));
      this.bO.a(5, new bsw(this, 10));
      this.bO.a(6, new btq(this, 1.2F, true));
      this.bO.a(8, new byf.c());
      this.bO.a(8, new btb(this));
      this.bO.a(9, new bsn<>(this, cck.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new buy(this, cck.class).a());
   }

   public static bnp.a ge() {
      return bmm.C().a(bnq.l, 10.0).a(bnq.m, 1.2F).a(bnq.c, 3.0);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvw(this, $$0);
   }

   @Override
   public boolean C(blu $$0) {
      boolean $$1 = $$0.a(this.dN().b((bmk)this), (float)((int)this.b(bnq.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(arr.gu, 1.0F, 1.0F);
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
   protected float b(bmw $$0, blv $$1) {
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
   protected boolean o(blu $$0) {
      return true;
   }

   @Override
   public boolean f(cmx $$0) {
      blz $$1 = bmm.h($$0);
      return !this.c($$1).b() ? false : $$1 == blz.a && super.f($$0);
   }

   @Override
   protected void b(cbt $$0) {
      if (this.c(blz.a).b()) {
         cmx $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(blz.a, $$1);
            this.e(blz.a);
            this.a($$0, $$1.L());
            $$0.am();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fU()) {
         this.j(this.ch());
      } else {
         if (this.bb()) {
            this.c(2400);
         } else {
            this.c(this.A() - 1);
            if (this.A() <= 0) {
               this.a(this.dN().r(), 1.0F);
            }

            if (this.aC()) {
               this.g(this.dp().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dM().B && this.aZ() && this.dp().g() > 0.03) {
            els $$0 = this.f(0.0F);
            float $$1 = aun.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aun.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(jx.ap, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(jx.ap, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
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
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bka b(cfh $$0, bjz $$1) {
      cmx $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aso.ao)) {
         if (!this.dM().B) {
            this.a(arr.gw, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bka.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected arq d(bks $$0) {
      return arr.gx;
   }

   @Nullable
   @Override
   protected arq n_() {
      return arr.gv;
   }

   @Nullable
   @Override
   protected arq y() {
      return this.aZ() ? arr.gt : arr.gs;
   }

   @Override
   protected arq aO() {
      return arr.gA;
   }

   @Override
   protected arq aN() {
      return arr.gB;
   }

   protected boolean gf() {
      hx $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(els $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmq.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfh $$0) {
      return true;
   }

   static class a extends btg {
      private final byf a;
      private boolean b;

      a(byf $$0) {
         this.a = $$0;
         this.a(EnumSet.of(btg.a.a, btg.a.b));
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
         return !hx.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof and) {
            and $$0 = (and)this.a.dM();
            this.b = false;
            this.a.N().n();
            hx $$1 = this.a.dm();
            hx $$2 = $$0.a(asr.b, $$1, 50, false);
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
         if (hx.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cto $$0 = this.a.dM();
         if (this.a.gf() || this.a.N().l()) {
            els $$1 = els.b(this.a.u());
            els $$2 = bxc.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bxc.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hx $$3 = hx.a($$2);
               if (!$$0.b_($$3).a(asl.a) || !$$0.a_($$3).a($$0, $$3, efg.b)) {
                  $$2 = bxc.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends btg {
      private final byf a;
      private final double b;
      @Nullable
      private cfh c;

      b(byf $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(btg.a.a, btg.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(byf.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new blh(blj.D, 100), this.a);
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

         if (this.c.bZ() && this.c.dM().z.a(6) == 0) {
            this.c.b(new blh(blj.D, 100), this.a);
         }
      }
   }

   class c extends btg {
      private int b;

      @Override
      public boolean a() {
         if (this.b > byf.this.ah) {
            return false;
         } else {
            List<cbt> $$0 = byf.this.dM().a(cbt.class, byf.this.cH().c(8.0, 8.0, 8.0), byf.c);
            return !$$0.isEmpty() || !byf.this.c(blz.a).b();
         }
      }

      @Override
      public void c() {
         List<cbt> $$0 = byf.this.dM().a(cbt.class, byf.this.cH().c(8.0, 8.0, 8.0), byf.c);
         if (!$$0.isEmpty()) {
            byf.this.N().a($$0.get(0), 1.2F);
            byf.this.a(arr.gz, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmx $$0 = byf.this.c(blz.a);
         if (!$$0.b()) {
            this.a($$0);
            byf.this.a(blz.a, cmx.f);
            this.b = byf.this.ah + byf.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cbt> $$0 = byf.this.dM().a(cbt.class, byf.this.cH().c(8.0, 8.0, 8.0), byf.c);
         cmx $$1 = byf.this.c(blz.a);
         if (!$$1.b()) {
            this.a($$1);
            byf.this.a(blz.a, cmx.f);
         } else if (!$$0.isEmpty()) {
            byf.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cmx $$0) {
         if (!$$0.b()) {
            double $$1 = byf.this.dv() - 0.3F;
            cbt $$2 = new cbt(byf.this.dM(), byf.this.dr(), $$1, byf.this.dx(), $$0);
            $$2.b(40);
            $$2.a(byf.this);
            float $$3 = 0.3F;
            float $$4 = byf.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * byf.this.ag.i();
            $$2.o(
               (double)(0.3F * -aun.a(byf.this.dC() * (float) (Math.PI / 180.0)) * aun.b(byf.this.dE() * (float) (Math.PI / 180.0)) + aun.b($$4) * $$5),
               (double)(0.3F * aun.a(byf.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aun.b(byf.this.dC() * (float) (Math.PI / 180.0)) * aun.b(byf.this.dE() * (float) (Math.PI / 180.0)) + aun.a($$4) * $$5)
            );
            byf.this.dM().b($$2);
         }
      }
   }
}
