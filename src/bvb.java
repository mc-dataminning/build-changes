import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bvb extends bvv {
   private static final aeg<gw> d = aej.a(bvb.class, aei.n);
   private static final aeg<Boolean> e = aej.a(bvb.class, aei.k);
   private static final aeg<Integer> bT = aej.a(bvb.class, aei.b);
   static final btu bU = btu.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<byp> c = $$0 -> !$$0.y() && $$0.bv() && $$0.aX();

   public bvb(biw<? extends bvb> $$0, cpx $$1) {
      super($$0, $$1);
      this.bL = new bpi(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new bph(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      this.j(this.cg());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean dQ() {
      return false;
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(gw $$0) {
      this.an.b(d, $$0);
   }

   public gw s() {
      return this.an.b(d);
   }

   public boolean t() {
      return this.an.b(e);
   }

   public void w(boolean $$0) {
      this.an.b(e, $$0);
   }

   public int y() {
      return this.an.b(bT);
   }

   public void c(int $$0) {
      this.an.b(bT, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(d, gw.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.s().u());
      $$0.a("TreasurePosY", this.s().v());
      $$0.a("TreasurePosZ", this.s().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(qy $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new gw($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpo(this));
      this.bO.a(0, new brn(this));
      this.bO.a(1, new bvb.a(this));
      this.bO.a(2, new bvb.b(this, 4.0));
      this.bO.a(4, new brb(this, 1.0, 10));
      this.bO.a(4, new bqy(this));
      this.bO.a(5, new bql(this, cbw.class, 6.0F));
      this.bO.a(5, new bpt(this, 10));
      this.bO.a(6, new bqn(this, 1.2F, true));
      this.bO.a(8, new bvb.c());
      this.bO.a(8, new bpy(this));
      this.bO.a(9, new bpk<>(this, bzg.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new brv(this, bzg.class).a());
   }

   public static bkn.a gd() {
      return bjk.A().a(bko.a, 10.0).a(bko.d, 1.2F).a(bko.f, 3.0);
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bst(this, $$0);
   }

   @Override
   public boolean C(bis $$0) {
      boolean $$1 = $$0.a(this.dM().b((bji)this), (float)((int)this.b(bko.f)));
      if ($$1) {
         this.a(this, $$0);
         this.a(apf.fR, 1.0F, 1.0F);
      }

      return $$1;
   }

   @Override
   public int cg() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cg();
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.3F;
   }

   @Override
   public int Y() {
      return 1;
   }

   @Override
   public int Z() {
      return 1;
   }

   @Override
   protected boolean o(bis $$0) {
      return true;
   }

   @Override
   public boolean f(cjh $$0) {
      bix $$1 = bjk.h($$0);
      return !this.c($$1).b() ? false : $$1 == bix.a && super.f($$0);
   }

   @Override
   protected void b(byp $$0) {
      if (this.c(bix.a).b()) {
         cjh $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bix.a, $$1);
            this.e(bix.a);
            this.a($$0, $$1.L());
            $$0.ak();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.fT()) {
         this.j(this.cg());
      } else {
         if (this.aZ()) {
            this.c(2400);
         } else {
            this.c(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dM().r(), 1.0F);
            }

            if (this.aA()) {
               this.f(this.do().b((double)((this.ag.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ag.i() * 2.0F - 1.0F) * 0.2F)));
               this.r(this.ag.i() * 360.0F);
               this.c(false);
               this.au = true;
            }
         }

         if (this.dL().B && this.aX() && this.do().g() > 0.03) {
            ehp $$0 = this.f(0.0F);
            float $$1 = ary.b(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = ary.a(this.dB() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dL()
                  .a(ix.am, this.dq() - $$0.c * (double)$$3 + (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dL()
                  .a(ix.am, this.dq() - $$0.c * (double)$$3 - (double)$$1, this.ds() - $$0.d, this.dw() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ix.K);
      } else {
         super.b($$0);
      }
   }

   private void a(iv $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dL().a($$0, this.d(1.0), this.dt() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bha b(cbw $$0, bgz $$1) {
      cjh $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aqc.ao)) {
         if (!this.dL().B) {
            this.a(apf.fT, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fS().d) {
            $$2.h(1);
         }

         return bha.a(this.dL().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.fU;
   }

   @Nullable
   @Override
   protected ape l_() {
      return apf.fS;
   }

   @Nullable
   @Override
   protected ape w() {
      return this.aX() ? apf.fQ : apf.fP;
   }

   @Override
   protected ape aM() {
      return apf.fX;
   }

   @Override
   protected ape aL() {
      return apf.fY;
   }

   protected boolean ge() {
      gw $$0 = this.L().h();
      return $$0 != null ? $$0.a(this.dj(), 12.0) : false;
   }

   @Override
   public void h(ehp $$0) {
      if (this.cX() && this.aX()) {
         this.a(this.fe(), $$0);
         this.a(bjo.a, this.do());
         this.f(this.do().a(0.9));
         if (this.q() == null) {
            this.f(this.do().b(0.0, -0.005, 0.0));
         }
      } else {
         super.h($$0);
      }
   }

   @Override
   public boolean a(cbw $$0) {
      return true;
   }

   static class a extends bqd {
      private final bvb a;
      private boolean b;

      a(bvb $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.t() && this.a.ch() >= 100;
      }

      @Override
      public boolean b() {
         gw $$0 = this.a.s();
         return !gw.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) && !this.b && this.a.ch() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dL() instanceof aks) {
            aks $$0 = (aks)this.a.dL();
            this.b = false;
            this.a.L().n();
            gw $$1 = this.a.dl();
            gw $$2 = $$0.a(aqf.b, $$1, 50, false);
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
         gw $$0 = this.a.s();
         if (gw.a((double)$$0.u(), this.a.ds(), (double)$$0.w()).a(this.a.dj(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         cpx $$0 = this.a.dL();
         if (this.a.ge() || this.a.L().l()) {
            ehp $$1 = ehp.b(this.a.s());
            ehp $$2 = bty.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bty.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               gw $$3 = gw.a($$2);
               if (!$$0.b_($$3).a(apz.a) || !$$0.a_($$3).a($$0, $$3, ebe.b)) {
                  $$2 = bty.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.G().a($$2.c, $$2.d, $$2.e, (float)(this.a.Z() + 20), (float)this.a.Y());
            this.a.L().a($$2.c, $$2.d, $$2.e, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends bqd {
      private final bvb a;
      private final double b;
      @Nullable
      private cbw c;

      b(bvb $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bqd.a.a, bqd.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dL().a(bvb.bU, this.a);
         return this.c == null ? false : this.c.bY() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bY() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bif(bih.D, 100), this.a);
      }

      @Override
      public void d() {
         this.c = null;
         this.a.L().n();
      }

      @Override
      public void e() {
         this.a.G().a(this.c, (float)(this.a.Z() + 20), (float)this.a.Y());
         if (this.a.f(this.c) < 6.25) {
            this.a.L().n();
         } else {
            this.a.L().a(this.c, this.b);
         }

         if (this.c.bY() && this.c.dL().z.a(6) == 0) {
            this.c.b(new bif(bih.D, 100), this.a);
         }
      }
   }

   class c extends bqd {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bvb.this.ah) {
            return false;
         } else {
            List<byp> $$0 = bvb.this.dL().a(byp.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.c);
            return !$$0.isEmpty() || !bvb.this.c(bix.a).b();
         }
      }

      @Override
      public void c() {
         List<byp> $$0 = bvb.this.dL().a(byp.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.c);
         if (!$$0.isEmpty()) {
            bvb.this.L().a($$0.get(0), 1.2F);
            bvb.this.a(apf.fW, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         cjh $$0 = bvb.this.c(bix.a);
         if (!$$0.b()) {
            this.a($$0);
            bvb.this.a(bix.a, cjh.b);
            this.b = bvb.this.ah + bvb.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<byp> $$0 = bvb.this.dL().a(byp.class, bvb.this.cG().c(8.0, 8.0, 8.0), bvb.c);
         cjh $$1 = bvb.this.c(bix.a);
         if (!$$1.b()) {
            this.a($$1);
            bvb.this.a(bix.a, cjh.b);
         } else if (!$$0.isEmpty()) {
            bvb.this.L().a($$0.get(0), 1.2F);
         }
      }

      private void a(cjh $$0) {
         if (!$$0.b()) {
            double $$1 = bvb.this.du() - 0.3F;
            byp $$2 = new byp(bvb.this.dL(), bvb.this.dq(), $$1, bvb.this.dw(), $$0);
            $$2.b(40);
            $$2.c(bvb.this.cv());
            float $$3 = 0.3F;
            float $$4 = bvb.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bvb.this.ag.i();
            $$2.o(
               (double)(0.3F * -ary.a(bvb.this.dB() * (float) (Math.PI / 180.0)) * ary.b(bvb.this.dD() * (float) (Math.PI / 180.0)) + ary.b($$4) * $$5),
               (double)(0.3F * ary.a(bvb.this.dD() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * ary.b(bvb.this.dB() * (float) (Math.PI / 180.0)) * ary.b(bvb.this.dD() * (float) (Math.PI / 180.0)) + ary.a($$4) * $$5)
            );
            bvb.this.dL().b($$2);
         }
      }
   }
}
