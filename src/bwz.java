import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class bwz extends bxt {
   private static final afo<ht> d = afr.a(bwz.class, afq.n);
   private static final afo<Boolean> e = afr.a(bwz.class, afq.k);
   private static final afo<Integer> bT = afr.a(bwz.class, afq.b);
   static final bvs bU = bvs.b().a(10.0).d();
   public static final int b = 4800;
   private static final int bV = 2400;
   public static final Predicate<can> c = $$0 -> !$$0.z() && $$0.bx() && $$0.aZ();

   public bwz(bku<? extends bwz> $$0, csa $$1) {
      super($$0, $$1);
      this.bL = new brg(this, 85, 10, 0.02F, 0.1F, true);
      this.bK = new brf(this, 10);
      this.s(true);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      this.j(this.ch());
      this.s(0.0F);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void b(int $$0) {
   }

   public void i(ht $$0) {
      this.an.b(d, $$0);
   }

   public ht u() {
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
   protected void b_() {
      super.b_();
      this.an.a(d, ht.b);
      this.an.a(e, false);
      this.an.a(bT, 2400);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.u().u());
      $$0.a("TreasurePosY", this.u().v());
      $$0.a("TreasurePosZ", this.u().w());
      $$0.a("GotFish", this.w());
      $$0.a("Moistness", this.A());
   }

   @Override
   public void a(rz $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new ht($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.c($$0.h("Moistness"));
   }

   @Override
   protected void B() {
      this.bO.a(0, new brm(this));
      this.bO.a(0, new btl(this));
      this.bO.a(1, new bwz.a(this));
      this.bO.a(2, new bwz.b(this, 4.0));
      this.bO.a(4, new bsz(this, 1.0, 10));
      this.bO.a(4, new bsw(this));
      this.bO.a(5, new bsj(this, cdu.class, 6.0F));
      this.bO.a(5, new brr(this, 10));
      this.bO.a(6, new bsl(this, 1.2F, true));
      this.bO.a(8, new bwz.c());
      this.bO.a(8, new brw(this));
      this.bO.a(9, new bri<>(this, cbe.class, 8.0F, 1.0, 1.0));
      this.bP.a(1, new btt(this, cbe.class).a());
   }

   public static bml.a gf() {
      return bli.C().a(bmm.l, 10.0).a(bmm.m, 1.2F).a(bmm.c, 3.0);
   }

   @Override
   protected bup b(csa $$0) {
      return new bur(this, $$0);
   }

   @Override
   public boolean C(bkq $$0) {
      boolean $$1 = $$0.a(this.dO().b((blg)this), (float)((int)this.b(bmm.c)));
      if ($$1) {
         this.a(this, $$0);
         this.a(aqr.gl, 1.0F, 1.0F);
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
   protected float b(bls $$0, bkr $$1) {
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
   protected boolean o(bkq $$0) {
      return true;
   }

   @Override
   public boolean f(clj $$0) {
      bkv $$1 = bli.h($$0);
      return !this.c($$1).b() ? false : $$1 == bkv.a && super.f($$0);
   }

   @Override
   protected void b(can $$0) {
      if (this.c(bkv.a).b()) {
         clj $$1 = $$0.q();
         if (this.j($$1)) {
            this.a($$0);
            this.a(bkv.a, $$1);
            this.e(bkv.a);
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
            eju $$0 = this.f(0.0F);
            float $$1 = atm.b(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = atm.a(this.dD() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ag.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dN()
                  .a(js.an, this.ds() - $$0.c * (double)$$3 + (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dN()
                  .a(js.an, this.ds() - $$0.c * (double)$$3 - (double)$$1, this.du() - $$0.d, this.dy() - $$0.e * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(js.K);
      } else {
         super.b($$0);
      }
   }

   private void a(jq $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ag.k() * 0.01;
         double $$3 = this.ag.k() * 0.01;
         double $$4 = this.ag.k() * 0.01;
         this.dN().a($$0, this.d(1.0), this.dv() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected bix b(cdu $$0, biw $$1) {
      clj $$2 = $$0.b($$1);
      if (!$$2.b() && $$2.a(aro.ao)) {
         if (!this.dN().B) {
            this.a(aqr.gn, 1.0F, 1.0F);
         }

         this.w(true);
         if (!$$0.fU().d) {
            $$2.h(1);
         }

         return bix.a(this.dN().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.go;
   }

   @Nullable
   @Override
   protected aqq m_() {
      return aqr.gm;
   }

   @Nullable
   @Override
   protected aqq y() {
      return this.aZ() ? aqr.gk : aqr.gj;
   }

   @Override
   protected aqq aO() {
      return aqr.gr;
   }

   @Override
   protected aqq aN() {
      return aqr.gs;
   }

   protected boolean gg() {
      ht $$0 = this.N().h();
      return $$0 != null ? $$0.a(this.dl(), 12.0) : false;
   }

   @Override
   public void a(eju $$0) {
      if (this.cZ() && this.aZ()) {
         this.a(this.fg(), $$0);
         this.a(blm.a, this.dq());
         this.g(this.dq().a(0.9));
         if (this.q() == null) {
            this.g(this.dq().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a($$0);
      }
   }

   @Override
   public boolean a(cdu $$0) {
      return true;
   }

   static class a extends bsb {
      private final bwz a;
      private boolean b;

      a(bwz $$0) {
         this.a = $$0;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean R_() {
         return false;
      }

      @Override
      public boolean a() {
         return this.a.w() && this.a.ci() >= 100;
      }

      @Override
      public boolean b() {
         ht $$0 = this.a.u();
         return !ht.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) && !this.b && this.a.ci() >= 100;
      }

      @Override
      public void c() {
         if (this.a.dN() instanceof ame) {
            ame $$0 = (ame)this.a.dN();
            this.b = false;
            this.a.N().n();
            ht $$1 = this.a.dn();
            ht $$2 = $$0.a(arr.b, $$1, 50, false);
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
         ht $$0 = this.a.u();
         if (ht.a((double)$$0.u(), this.a.du(), (double)$$0.w()).a(this.a.dl(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void e() {
         csa $$0 = this.a.dN();
         if (this.a.gg() || this.a.N().l()) {
            eju $$1 = eju.b(this.a.u());
            eju $$2 = bvw.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = bvw.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               ht $$3 = ht.a($$2);
               if (!$$0.b_($$3).a(arl.a) || !$$0.a_($$3).a($$0, $$3, edi.b)) {
                  $$2 = bvw.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends bsb {
      private final bwz a;
      private final double b;
      @Nullable
      private cdu c;

      b(bwz $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(bsb.a.a, bsb.a.b));
      }

      @Override
      public boolean a() {
         this.c = this.a.dN().a(bwz.bU, this.a);
         return this.c == null ? false : this.c.bZ() && this.a.q() != this.c;
      }

      @Override
      public boolean b() {
         return this.c != null && this.c.bZ() && this.a.f(this.c) < 256.0;
      }

      @Override
      public void c() {
         this.c.b(new bkd(bkf.D, 100), this.a);
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
            this.c.b(new bkd(bkf.D, 100), this.a);
         }
      }
   }

   class c extends bsb {
      private int b;

      @Override
      public boolean a() {
         if (this.b > bwz.this.ah) {
            return false;
         } else {
            List<can> $$0 = bwz.this.dN().a(can.class, bwz.this.cH().c(8.0, 8.0, 8.0), bwz.c);
            return !$$0.isEmpty() || !bwz.this.c(bkv.a).b();
         }
      }

      @Override
      public void c() {
         List<can> $$0 = bwz.this.dN().a(can.class, bwz.this.cH().c(8.0, 8.0, 8.0), bwz.c);
         if (!$$0.isEmpty()) {
            bwz.this.N().a($$0.get(0), 1.2F);
            bwz.this.a(aqr.gq, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void d() {
         clj $$0 = bwz.this.c(bkv.a);
         if (!$$0.b()) {
            this.a($$0);
            bwz.this.a(bkv.a, clj.b);
            this.b = bwz.this.ah + bwz.this.ag.a(100);
         }
      }

      @Override
      public void e() {
         List<can> $$0 = bwz.this.dN().a(can.class, bwz.this.cH().c(8.0, 8.0, 8.0), bwz.c);
         clj $$1 = bwz.this.c(bkv.a);
         if (!$$1.b()) {
            this.a($$1);
            bwz.this.a(bkv.a, clj.b);
         } else if (!$$0.isEmpty()) {
            bwz.this.N().a($$0.get(0), 1.2F);
         }
      }

      private void a(clj $$0) {
         if (!$$0.b()) {
            double $$1 = bwz.this.dw() - 0.3F;
            can $$2 = new can(bwz.this.dN(), bwz.this.ds(), $$1, bwz.this.dy(), $$0);
            $$2.b(40);
            $$2.a(bwz.this);
            float $$3 = 0.3F;
            float $$4 = bwz.this.ag.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * bwz.this.ag.i();
            $$2.o(
               (double)(0.3F * -atm.a(bwz.this.dD() * (float) (Math.PI / 180.0)) * atm.b(bwz.this.dF() * (float) (Math.PI / 180.0)) + atm.b($$4) * $$5),
               (double)(0.3F * atm.a(bwz.this.dF() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * atm.b(bwz.this.dD() * (float) (Math.PI / 180.0)) * atm.b(bwz.this.dF() * (float) (Math.PI / 180.0)) + atm.a($$4) * $$5)
            );
            bwz.this.dN().b($$2);
         }
      }
   }
}
