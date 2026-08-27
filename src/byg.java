import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class byg extends bza {
   private static final agm<hx> d = agp.a(byg.class, ago.n);
   private static final agm<Boolean> e = agp.a(byg.class, ago.k);
   private static final agm<Integer> bT = agp.a(byg.class, ago.b);
   static final bwz bU = bwz.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cbu> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public byg(blz<? extends byg> $$0, ctp $$1) {
      super($$0, $$1);
      this.bL = new bsm(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bsl(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
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
      this.bO.a(0, new bss(this));
      this.bO.a(0, new bur(this));
      this.bO.a(1, new byg.a(this));
      this.bO.a(2, new byg.b(this, 4.0));
      this.bO.a(4, new buf(this, 1.0, 10));
      this.bO.a(4, new buc(this));
      this.bO.a(5, new btp(this, cfi.class, 6.0F));
      this.bO.a(5, new bsx(this, 10));
      this.bO.a(6, new btr(this, 1.2F, true));
      this.bO.a(8, new byg.c());
      this.bO.a(8, new btc(this));
      this.bO.a(9, new bso<>(this, ccl.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new buz(this, ccl.class).a());
   }

   public static bnq.a ge() {
      return bmn.C().a(bnr.l, 10.0).a(bnr.m, 1.2F).a(bnr.c, 3.0);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvx(this, $$0);
   }

   @Override
   public boolean C(blv $$0) {
      boolean $$1 = $$0.a(this.dN().b((bml)this), (float)((int)this.b(bnr.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(ars.gu, 1.0F, 1.0F);
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
   protected float b(bmx $$0, blw $$1) {
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
   protected boolean o(blv $$0) {
      return true;
   }

   @Override
   public boolean f(cmy $$0) {
      bma $$1 = bmn.h($$0);
      return !this.c($$1).b() ? false : $$1 == bma.a && super.f($$0);
   }

   @Override
   protected void b(cbu $$0) {
      if (this.c(bma.a).b()) {
         cmy $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bma.a, $$1);
            this.e(bma.a);
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
            elt $$0 = this.f(0.0F);
            float $$1 = auo.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = auo.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(asp.ao)) {
         if (!this.dM().B) {
            this.a(ars.gw, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bkb.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.gx;
   }

   @Nullable
   @Override
   protected arr n_() {
      return ars.gv;
   }

   @Nullable
   @Override
   protected arr y() {
      return this.aZ() ? ars.gt : ars.gs;
   }

   @Override
   protected arr aO() {
      return ars.gA;
   }

   @Override
   protected arr aN() {
      return ars.gB;
   }

   protected boolean gf() {
      hx $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(elt $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmr.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cfi $$0) {
      return true;
   }

   static class a extends bth {
      private final byg a;
      private boolean b;

      a(byg $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bth.a.a, bth.a.b));
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
            hx $$2 = $$0.a(ass.b, $$1, 50, false);
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
         ctp $$0 = this.a.dM();
         if (this.a.gf() || this.a.N().l()) {
            elt $$1 = elt.b(this.a.u());
            elt $$2 = bxd.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bxd.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hx $$3 = hx.a($$2);
               if (!$$0.b_($$3).a(asm.a) || !$$0.a_($$3).a($$0, $$3, efh.b)) {
                  $$2 = bxd.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bth {
      private final byg a;
      private final double b;
      @Nullable
      private cfi c;

      b(byg $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bth.a.a, bth.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(byg.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bli(blk.D, 100), this.a);
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
            this.c.b(new bli(blk.D, 100), this.a);
         }
      }
   }

   class c extends bth {
      private int b;

      @Override
      public boolean a() {
         if (this.b > byg.this.ah) {
            return false;
         } else {
            List<cbu> $$0 = byg.this.dM().a(cbu.class, byg.this.cH().c(8.0, 8.0, 8.0), byg.c);
            return !$$0.isEmpty() || !byg.this.c(bma.a).b();
         }
      }

      @Override
      public void c() {
         List<cbu> $$0 = byg.this.dM().a(cbu.class, byg.this.cH().c(8.0, 8.0, 8.0), byg.c);
         if (!$$0.isEmpty()) {
            byg.this.N().a($$0.get(0), 1.2F);
            byg.this.a(ars.gz, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmy $$0 = byg.this.c(bma.a);
         if (!$$0.b()) {
            this.a($$0);
            byg.this.a(bma.a, cmy.f);
            this.b = byg.this.ah + byg.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cbu> $$0 = byg.this.dM().a(cbu.class, byg.this.cH().c(8.0, 8.0, 8.0), byg.c);
         cmy $$1 = byg.this.c(bma.a);
         if (!$$1.b()) {
            this.a($$1);
            byg.this.a(bma.a, cmy.f);
         } else if (!$$0.isEmpty()) {
            byg.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cmy $$0) {
         if (!$$0.b()) {
            double $$1 = byg.this.dv() - 0.3F;
            cbu $$2 = new cbu(byg.this.dM(), byg.this.dr(), $$1, byg.this.dx(), $$0);
            $$2.b(40);
            $$2.a(byg.this);
            float $$3 = 0.3F;
            float $$4 = byg.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * byg.this.ag.i();
            $$2.o(
               (double)(0.3F * -auo.a(byg.this.dC() * (float) (Math.PI / 180.0)) * auo.b(byg.this.dE() * (float) (Math.PI / 180.0)) + auo.b($$4) * $$5),
               (double)(0.3F * auo.a(byg.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * auo.b(byg.this.dC() * (float) (Math.PI / 180.0)) * auo.b(byg.this.dE() * (float) (Math.PI / 180.0)) + auo.a($$4) * $$5)
            );
            byg.this.dM().b($$2);
         }
      }
   }
}
