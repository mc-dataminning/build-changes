import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgd extends cfu {
   private static final akg<je> cc = akk.a(cgd.class, aki.o);
   private static final akg<Boolean> cd = akk.a(cgd.class, aki.k);
   private static final akg<Integer> ce = akk.a(cgd.class, aki.b);
   static final cev cf = cev.b().a(10.0).d();
   public static final int bZ = 4800;
   private static final int cg = 2400;
   public static final Predicate<cjz> ca = $$0 -> !$$0.w() && $$0.bI() && $$0.bi();
   public static final float cb = 0.65F;

   public cgd(btq<? extends cgd> $$0, dds $$1) {
      super($$0, $$1);
      this.bQ = new cah(this, 85, 10, 0.02F, 0.1F, true);
      this.bP = new cag(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.j(this.cp());
      this.w(0.0F);
      return super.a($$0, $$1, $$2, new btc.a(true, 0.1F));
   }

   @Nullable
   public cgd b(arg $$0, btc $$1) {
      return btq.y.a($$0, btp.e);
   }

   @Override
   public float ee() {
      return this.o_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(je $$0) {
      this.am.a(cc, $$0);
   }

   public je q() {
      return this.am.a(cc);
   }

   public boolean t() {
      return this.am.a(cd);
   }

   public void x(boolean $$0) {
      this.am.a(cd, $$0);
   }

   public int y() {
      return this.am.a(ce);
   }

   public void t(int $$0) {
      this.am.a(ce, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cc, je.c);
      $$0.a(cd, false);
      $$0.a(ce, 2400);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.y());
   }

   @Override
   public void a(uf $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.h(new je($$1, $$2, $$3));
      super.a($$0);
      this.x($$0.q("GotFish"));
      this.t($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bT.a(0, new can(this));
      this.bT.a(0, new ccm(this));
      this.bT.a(1, new cgd.a(this));
      this.bT.a(2, new cgd.b(this, 4.0));
      this.bT.a(4, new cca(this, 1.0, 10));
      this.bT.a(4, new cbx(this));
      this.bT.a(5, new cbk(this, cnp.class, 6.0F));
      this.bT.a(5, new cas(this, 10));
      this.bT.a(6, new cbm(this, 1.2F, true));
      this.bT.a(8, new cgd.c());
      this.bT.a(8, new cax(this));
      this.bT.a(9, new caj<>(this, ckr.class, 8.0F, 1.0, 1.0));
      this.bU.a(1, new ccu(this, ckr.class).a());
   }

   public static bvl.a go() {
      return buh.E().a(bvm.s, 10.0).a(bvm.v, 1.2F).a(bvm.c, 3.0);
   }

   @Override
   protected cdq b(dds $$0) {
      return new cds(this, $$0);
   }

   @Override
   public void gh() {
      this.a(awd.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(buf $$0) {
      return !this.o_() && super.c($$0);
   }

   @Override
   public int cp() {
      return 4800;
   }

   @Override
   protected int n(int $$0) {
      return this.cp();
   }

   @Override
   public int ae() {
      return 1;
   }

   @Override
   public int ag() {
      return 1;
   }

   @Override
   protected boolean o(btj $$0) {
      return true;
   }

   @Override
   public boolean g(cvl $$0) {
      btr $$1 = this.i($$0);
      return !this.a($$1).f() ? false : $$1 == btr.a && super.g($$0);
   }

   @Override
   protected void b(cjz $$0) {
      if (this.a(btr.a).f()) {
         cvl $$1 = $$0.m();
         if (this.k($$1)) {
            this.a($$0);
            this.a(btr.a, $$1);
            this.f(btr.a);
            this.a($$0, $$1.J());
            $$0.as();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.gd()) {
         this.j(this.cp());
      } else {
         if (this.bk()) {
            this.t(2400);
         } else {
            this.t(this.y() - 1);
            if (this.y() <= 0) {
               this.a(this.dT().t(), 1.0F);
            }

            if (this.aH()) {
               this.h(this.dv().b((double)((this.af.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.af.i() * 2.0F - 1.0F) * 0.2F)));
               this.v(this.af.i() * 360.0F);
               this.d(false);
               this.as = true;
            }
         }

         if (this.dS().B && this.bi() && this.dv().h() > 0.03) {
            eye $$0 = this.g(0.0F);
            float $$1 = azc.b(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azc.a(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.af.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dS()
                  .a(ln.as, this.dx() - $$0.d * (double)$$3 + (double)$$1, this.dz() - $$0.e, this.dD() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dS()
                  .a(ln.as, this.dx() - $$0.d * (double)$$3 - (double)$$1, this.dz() - $$0.e, this.dD() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(ln.O);
      } else {
         super.b($$0);
      }
   }

   private void a(ll $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.af.k() * 0.01;
         double $$3 = this.af.k() * 0.01;
         double $$4 = this.af.k() * 0.01;
         this.dS().a($$0, this.d(1.0), this.dA() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axb.aP)) {
         if (!this.dS().B) {
            this.a(awd.ha, 1.0F, 1.0F);
         }

         this.x(true);
         $$2.a(1, $$0);
         return brk.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.hb;
   }

   @Nullable
   @Override
   protected awc n_() {
      return awd.gZ;
   }

   @Nullable
   @Override
   protected awc w() {
      return this.bi() ? awd.gX : awd.gW;
   }

   @Override
   protected awc aU() {
      return awd.he;
   }

   @Override
   protected awc aT() {
      return awd.hf;
   }

   protected boolean gp() {
      je $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dq(), 12.0) : false;
   }

   @Override
   public void a_(eye $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buj.a, this.dv());
         this.h(this.dv().c(0.9));
         if (this.m() == null) {
            this.h(this.dv().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean A() {
      return true;
   }

   static class a extends cbc {
      private final cgd a;
      private boolean b;

      a(cgd $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean S_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.cq() >= 100;
      }

      @Override
      public boolean c() {
         je $$0 = this.a.q();
         return !je.a((double)$$0.u(), this.a.dz(), (double)$$0.w()).a(this.a.dq(), 4.0) && !this.b && this.a.cq() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dS() instanceof arg) {
            arg $$0 = (arg)this.a.dS();
            this.b = false;
            this.a.P().o();
            je $$1 = this.a.ds();
            je $$2 = $$0.a(axe.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.h($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         je $$0 = this.a.q();
         if (je.a((double)$$0.u(), this.a.dz(), (double)$$0.w()).a(this.a.dq(), 4.0) || this.b) {
            this.a.x(false);
         }
      }

      @Override
      public void a() {
         dds $$0 = this.a.dS();
         if (this.a.gp() || this.a.P().m()) {
            eye $$1 = eye.b(this.a.q());
            eye $$2 = cez.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cez.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               je $$3 = je.a((jx)$$2);
               if (!$$0.b_($$3).a(awy.a) || !$$0.a_($$3).a(eqq.b)) {
                  $$2 = cez.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.K().a($$2.d, $$2.e, $$2.f, (float)(this.a.ag() + 20), (float)this.a.ae());
            this.a.P().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.z.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cbc {
      private final cgd a;
      private final double b;
      @Nullable
      private cnp c;

      b(cgd $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cbc.a.a, cbc.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dS().a(cgd.cf, this.a);
         return this.c == null ? false : this.c.ch() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ch() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bsq(bss.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.P().o();
      }

      @Override
      public void a() {
         this.a.K().a(this.c, (float)(this.a.ag() + 20), (float)this.a.ae());
         if (this.a.g(this.c) < 6.25) {
            this.a.P().o();
         } else {
            this.a.P().a(this.c, this.b);
         }

         if (this.c.ch() && this.c.dS().z.a(6) == 0) {
            this.c.b(new bsq(bss.D, 100), this.a);
         }
      }
   }

   class c extends cbc {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cgd.this.ag) {
            return false;
         } else {
            List<cjz> $$0 = cgd.this.dS().a(cjz.class, cgd.this.cO().c(8.0, 8.0, 8.0), cgd.ca);
            return !$$0.isEmpty() || !cgd.this.a(btr.a).f();
         }
      }

      @Override
      public void d() {
         List<cjz> $$0 = cgd.this.dS().a(cjz.class, cgd.this.cO().c(8.0, 8.0, 8.0), cgd.ca);
         if (!$$0.isEmpty()) {
            cgd.this.P().a($$0.get(0), 1.2F);
            cgd.this.a(awd.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvl $$0 = cgd.this.a(btr.a);
         if (!$$0.f()) {
            this.a($$0);
            cgd.this.a(btr.a, cvl.k);
            this.b = cgd.this.ag + cgd.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<cjz> $$0 = cgd.this.dS().a(cjz.class, cgd.this.cO().c(8.0, 8.0, 8.0), cgd.ca);
         cvl $$1 = cgd.this.a(btr.a);
         if (!$$1.f()) {
            this.a($$1);
            cgd.this.a(btr.a, cvl.k);
         } else if (!$$0.isEmpty()) {
            cgd.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cvl $$0) {
         if (!$$0.f()) {
            double $$1 = cgd.this.dB() - 0.3F;
            cjz $$2 = new cjz(cgd.this.dS(), cgd.this.dx(), $$1, cgd.this.dD(), $$0);
            $$2.b(40);
            $$2.b(cgd.this);
            float $$3 = 0.3F;
            float $$4 = cgd.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cgd.this.af.i();
            $$2.n(
               (double)(0.3F * -azc.a(cgd.this.dI() * (float) (Math.PI / 180.0)) * azc.b(cgd.this.dK() * (float) (Math.PI / 180.0)) + azc.b($$4) * $$5),
               (double)(0.3F * azc.a(cgd.this.dK() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azc.b(cgd.this.dI() * (float) (Math.PI / 180.0)) * azc.b(cgd.this.dK() * (float) (Math.PI / 180.0)) + azc.a($$4) * $$5)
            );
            cgd.this.dS().b($$2);
         }
      }
   }
}
