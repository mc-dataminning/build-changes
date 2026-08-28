import java.util.EnumSet;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cgi extends cfz {
   private static final akg<je> cb = akk.a(cgi.class, aki.o);
   private static final akg<Boolean> cc = akk.a(cgi.class, aki.k);
   private static final akg<Integer> cd = akk.a(cgi.class, aki.b);
   static final cfa ce = cfa.b().a(10.0).d();
   public static final int bY = 4800;
   private static final int cf = 2400;
   public static final Predicate<cke> bZ = $$0 -> !$$0.w() && $$0.bI() && $$0.bi();
   public static final float ca = 0.65F;

   public cgi(btv<? extends cgi> $$0, deg $$1) {
      super($$0, $$1);
      this.bP = new cam(this, 85, 10, 0.02F, 0.1F, true);
      this.bO = new cal(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      this.j(this.cp());
      this.w(0.0F);
      return super.a($$0, $$1, $$2, new bth.a(true, 0.1F));
   }

   @Nullable
   public cgi b(arh $$0, bth $$1) {
      return btv.y.a($$0, btu.e);
   }

   @Override
   public float ee() {
      return this.o_() ? 0.65F : 1.0F;
   }

   @Override
   protected void s(int $$0) {
   }

   public void h(je $$0) {
      this.am.a(cb, $$0);
   }

   public je q() {
      return this.am.a(cb);
   }

   public boolean t() {
      return this.am.a(cc);
   }

   public void x(boolean $$0) {
      this.am.a(cc, $$0);
   }

   public int y() {
      return this.am.a(cd);
   }

   public void t(int $$0) {
      this.am.a(cd, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cb, je.c);
      $$0.a(cc, false);
      $$0.a(cd, 2400);
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
      this.bS.a(0, new cas(this));
      this.bS.a(0, new ccr(this));
      this.bS.a(1, new cgi.a(this));
      this.bS.a(2, new cgi.b(this, 4.0));
      this.bS.a(4, new ccf(this, 1.0, 10));
      this.bS.a(4, new ccc(this));
      this.bS.a(5, new cbp(this, cnu.class, 6.0F));
      this.bS.a(5, new cax(this, 10));
      this.bS.a(6, new cbr(this, 1.2F, true));
      this.bS.a(8, new cgi.c());
      this.bS.a(8, new cbc(this));
      this.bS.a(9, new cao<>(this, ckw.class, 8.0F, 1.0, 1.0));
      this.bT.a(1, new ccz(this, ckw.class).a());
   }

   public static bvq.a gp() {
      return bum.E().a(bvr.s, 10.0).a(bvr.v, 1.2F).a(bvr.c, 3.0);
   }

   @Override
   protected cdv b(deg $$0) {
      return new cdx(this, $$0);
   }

   @Override
   public void gi() {
      this.a(awe.gY, 1.0F, 1.0F);
   }

   @Override
   public boolean c(buk $$0) {
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
   protected boolean o(bto $$0) {
      return true;
   }

   @Override
   public boolean e(cvp $$0) {
      btw $$1 = this.g($$0);
      return !this.a($$1).f() ? false : $$1 == btw.a && super.e($$0);
   }

   @Override
   protected void b(cke $$0) {
      if (this.a(btw.a).f()) {
         cvp $$1 = $$0.m();
         if (this.i($$1)) {
            this.a($$0);
            this.a(btw.a, $$1);
            this.f(btw.a);
            this.a($$0, $$1.J());
            $$0.as();
         }
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.ge()) {
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
            eys $$0 = this.g(0.0F);
            float $$1 = azd.b(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azd.a(this.dI() * (float) (Math.PI / 180.0)) * 0.3F;
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
   protected brp b(cnu $$0, bro $$1) {
      cvp $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axc.aP)) {
         if (!this.dS().B) {
            this.a(awe.ha, 1.0F, 1.0F);
         }

         this.x(true);
         $$2.a(1, $$0);
         return brp.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.hb;
   }

   @Nullable
   @Override
   protected awd n_() {
      return awe.gZ;
   }

   @Nullable
   @Override
   protected awd w() {
      return this.bi() ? awe.gX : awe.gW;
   }

   @Override
   protected awd aU() {
      return awe.he;
   }

   @Override
   protected awd aT() {
      return awe.hf;
   }

   protected boolean gq() {
      je $$0 = this.P().i();
      return $$0 != null ? $$0.a(this.dq(), 12.0) : false;
   }

   @Override
   public void a_(eys $$0) {
      if (this.de() && this.bi()) {
         this.a(this.fm(), $$0);
         this.a(buo.a, this.dv());
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

   static class a extends cbh {
      private final cgi a;
      private boolean b;

      a(cgi $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
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
         if (this.a.dS() instanceof arh) {
            arh $$0 = (arh)this.a.dS();
            this.b = false;
            this.a.P().o();
            je $$1 = this.a.ds();
            je $$2 = $$0.a(axf.b, $$1, 50, false);
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
         deg $$0 = this.a.dS();
         if (this.a.gq() || this.a.P().m()) {
            eys $$1 = eys.b(this.a.q());
            eys $$2 = cfe.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = cfe.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               je $$3 = je.a((jx)$$2);
               if (!$$0.b_($$3).a(awz.a) || !$$0.a_($$3).a(ere.b)) {
                  $$2 = cfe.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
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

   static class b extends cbh {
      private final cgi a;
      private final double b;
      @Nullable
      private cnu c;

      b(cgi $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cbh.a.a, cbh.a.b));
      }

      @Override
      public boolean b() {
         this.c = this.a.dS().a(cgi.ce, this.a);
         return this.c == null ? false : this.c.ch() && this.a.m() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ch() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new bsv(bsx.D, 100), this.a);
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
            this.c.b(new bsv(bsx.D, 100), this.a);
         }
      }
   }

   class c extends cbh {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cgi.this.ag) {
            return false;
         } else {
            List<cke> $$0 = cgi.this.dS().a(cke.class, cgi.this.cO().c(8.0, 8.0, 8.0), cgi.bZ);
            return !$$0.isEmpty() || !cgi.this.a(btw.a).f();
         }
      }

      @Override
      public void d() {
         List<cke> $$0 = cgi.this.dS().a(cke.class, cgi.this.cO().c(8.0, 8.0, 8.0), cgi.bZ);
         if (!$$0.isEmpty()) {
            cgi.this.P().a($$0.get(0), 1.2F);
            cgi.this.a(awe.hd, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cvp $$0 = cgi.this.a(btw.a);
         if (!$$0.f()) {
            this.a($$0);
            cgi.this.a(btw.a, cvp.k);
            this.b = cgi.this.ag + cgi.this.af.a(100);
         }
      }

      @Override
      public void a() {
         List<cke> $$0 = cgi.this.dS().a(cke.class, cgi.this.cO().c(8.0, 8.0, 8.0), cgi.bZ);
         cvp $$1 = cgi.this.a(btw.a);
         if (!$$1.f()) {
            this.a($$1);
            cgi.this.a(btw.a, cvp.k);
         } else if (!$$0.isEmpty()) {
            cgi.this.P().a($$0.get(0), 1.2F);
         }
      }

      private void a(cvp $$0) {
         if (!$$0.f()) {
            double $$1 = cgi.this.dB() - 0.3F;
            cke $$2 = new cke(cgi.this.dS(), cgi.this.dx(), $$1, cgi.this.dD(), $$0);
            $$2.b(40);
            $$2.b(cgi.this);
            float $$3 = 0.3F;
            float $$4 = cgi.this.af.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cgi.this.af.i();
            $$2.n(
               (double)(0.3F * -azd.a(cgi.this.dI() * (float) (Math.PI / 180.0)) * azd.b(cgi.this.dK() * (float) (Math.PI / 180.0)) + azd.b($$4) * $$5),
               (double)(0.3F * azd.a(cgi.this.dK() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azd.b(cgi.this.dI() * (float) (Math.PI / 180.0)) * azd.b(cgi.this.dK() * (float) (Math.PI / 180.0)) + azd.a($$4) * $$5)
            );
            cgi.this.dS().b($$2);
         }
      }
   }
}
