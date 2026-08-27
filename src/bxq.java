import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bxq extends byk {
   private static final afz<hv> d = agc.a(bxq.class, agb.n);
   private static final afz<Boolean> e = agc.a(bxq.class, agb.k);
   private static final afz<Integer> bT = agc.a(bxq.class, agb.b);
   static final bwj bU = bwj.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<cbe> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public bxq(blj<? extends bxq> $$0, csy $$1) {
      super($$0, $$1);
      this.bL = new brw(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brv(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.j(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(hv $$0) {
      this.an.b(d, $$0);
   }

   public hv u() {
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
      this.an.a(d, hv.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(sj $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new hv($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsc(this));
      this.bO.a(0, new bub(this));
      this.bO.a(1, new bxq.a(this));
      this.bO.a(2, new bxq.b(this, 4.0));
      this.bO.a(4, new btp(this, 1.0, 10));
      this.bO.a(4, new btm(this));
      this.bO.a(5, new bsz(this, cer.class, 6.0F));
      this.bO.a(5, new bsh(this, 10));
      this.bO.a(6, new btb(this, 1.2F, true));
      this.bO.a(8, new bxq.c());
      this.bO.a(8, new bsm(this));
      this.bO.a(9, new bry<>(this, cbv.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new buj(this, cbv.class).a());
   }

   public static bna.a ge() {
      return blx.C().a(bnb.l, 10.0).a(bnb.m, 1.2F).a(bnb.c, 3.0);
   }

   @Override
   protected bvf b(csy $$0) {
      return new bvh(this, $$0);
   }

   @Override
   public boolean C(blf $$0) {
      boolean $$1 = $$0.a(this.dN().b((blv)this), (float)((int)this.b(bnb.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(arc.gu, 1.0F, 1.0F);
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
   protected float b(bmh $$0, blg $$1) {
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
   protected boolean o(blf $$0) {
      return true;
   }

   @Override
   public boolean f(cmh $$0) {
      blk $$1 = blx.h($$0);
      return !this.c($$1).b() ? false : $$1 == blk.a && super.f($$0);
   }

   @Override
   protected void b(cbe $$0) {
      if (this.c(blk.a).b()) {
         cmh $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(blk.a, $$1);
            this.e(blk.a);
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
            elb $$0 = this.f(0.0F);
            float $$1 = aty.b(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = aty.a(this.dC() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dM()
                  .a(jv.ap, this.dr() - $$0.c * (double)$$3 + (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dM()
                  .a(jv.ap, this.dr() - $$0.c * (double)$$3 - (double)$$1, this.dt() - $$0.d, this.dx() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(jv.M);
      } else {
         super.b($$0);
      }
   }

   private void a(jt $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dM().a($$0, this.d(1.0), this.du() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(arz.ao)) {
         if (!this.dM().B) {
            this.a(arc.gw, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fT().d) {
            $$2.h(1);
         }

         return bjl.a(this.dM().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.gx;
   }

   @Nullable
   @Override
   protected arb n_() {
      return arc.gv;
   }

   @Nullable
   @Override
   protected arb y() {
      return this.aZ() ? arc.gt : arc.gs;
   }

   @Override
   protected arb aO() {
      return arc.gA;
   }

   @Override
   protected arb aN() {
      return arc.gB;
   }

   protected boolean gf() {
      hv $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dk(), 12.0) : false;
   }

   @Override
   public void a(elb $$0) {
      if (this.cY() && this.aZ()) {
         this.a(this.ff(), $$0);
         this.a(bmb.a, this.dp());
         this.g(this.dp().a(0.9));
         if (this.q() == null) {
            this.g(this.dp().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cer $$0) {
      return true;
   }

   static class a extends bsr {
      private final bxq a;
      private boolean b;

      a(bxq $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
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
         hv $$0 = this.a.u();
         return !hv.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dM() instanceof amp) {
            amp $$0 = (amp)this.a.dM();
            this.b = false;
            this.a.N().n();
            hv $$1 = this.a.dm();
            hv $$2 = $$0.a(asc.b, $$1, 50, false);
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
         hv $$0 = this.a.u();
         if (hv.a((double)$$0.u(), this.a.dt(), (double)$$0.w()).a(this.a.dk(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         csy $$0 = this.a.dM();
         if (this.a.gf() || this.a.N().l()) {
            elb $$1 = elb.b(this.a.u());
            elb $$2 = bwn.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bwn.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               hv $$3 = hv.a($$2);
               if (!$$0.b_($$3).a(arw.a) || !$$0.a_($$3).a($$0, $$3, eep.b)) {
                  $$2 = bwn.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bsr {
      private final bxq a;
      private final double b;
      @Nullable
      private cer c;

      b(bxq $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bsr.a.a, bsr.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dM().a(bxq.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bks(bku.D, 100), this.a);
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
            this.c.b(new bks(bku.D, 100), this.a);
         }
      }
   }

   class c extends bsr {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bxq.this.ah) {
            return false;
         } else {
            List<cbe> $$0 = bxq.this.dM().a(cbe.class, bxq.this.cH().c(8.0, 8.0, 8.0), bxq.c);
            return !$$0.isEmpty() || !bxq.this.c(blk.a).b();
         }
      }

      @Override
      public void c() {
         List<cbe> $$0 = bxq.this.dM().a(cbe.class, bxq.this.cH().c(8.0, 8.0, 8.0), bxq.c);
         if (!$$0.isEmpty()) {
            bxq.this.N().a($$0.get(0), 1.2F);
            bxq.this.a(arc.gz, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cmh $$0 = bxq.this.c(blk.a);
         if (!$$0.b()) {
            this.a($$0);
            bxq.this.a(blk.a, cmh.f);
            this.b = bxq.this.ah + bxq.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<cbe> $$0 = bxq.this.dM().a(cbe.class, bxq.this.cH().c(8.0, 8.0, 8.0), bxq.c);
         cmh $$1 = bxq.this.c(blk.a);
         if (!$$1.b()) {
            this.a($$1);
            bxq.this.a(blk.a, cmh.f);
         } else if (!$$0.isEmpty()) {
            bxq.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(cmh $$0) {
         if (!$$0.b()) {
            double $$1 = bxq.this.dv() - 0.3F;
            cbe $$2 = new cbe(bxq.this.dM(), bxq.this.dr(), $$1, bxq.this.dx(), $$0);
            $$2.b(40);
            $$2.a(bxq.this);
            float $$3 = 0.3F;
            float $$4 = bxq.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bxq.this.ag.i();
            $$2.o(
               (double)(0.3F * -aty.a(bxq.this.dC() * (float) (Math.PI / 180.0)) * aty.b(bxq.this.dE() * (float) (Math.PI / 180.0)) + aty.b($$4) * $$5),
               (double)(0.3F * aty.a(bxq.this.dE() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * aty.b(bxq.this.dC() * (float) (Math.PI / 180.0)) * aty.b(bxq.this.dE() * (float) (Math.PI / 180.0)) + aty.a($$4) * $$5)
            );
            bxq.this.dM().b($$2);
         }
      }
   }
}
