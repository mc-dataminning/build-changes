import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cio extends cif {
   private static final akg<jj> bH = akk.a(cio.class, aki.o);
   private static final akg<Boolean> bI = akk.a(cio.class, aki.k);
   private static final akg<Integer> bJ = akk.a(cio.class, aki.b);
   static final chg bK = chg.b().a(10.0).d();
   public static final int bE = 4800;
   private static final int bL = 2400;
   public static final Predicate<cmn> bF = $$0 -> !$$0.o() && $$0.bK() && $$0.bj();
   public static final float bG = 0.65F;

   public cio(bwb<? extends cio> $$0, dhp $$1) {
      super($$0, $$1);
      this.by = new ccs(this, 85, 10, 0.02F, 0.1F, true);
      this.bx = new ccr(this, 10);
      this.a_(true);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.j(this.cs());
      this.x(0.0F);
      bxj $$4 = Objects.requireNonNullElseGet($$3, () -> new bvi.a(0.1F));
      return super.a($$0, $$1, $$2, $$4);
   }

   @Nullable
   public cio b(arn $$0, bvi $$1) {
      return bwb.H.a($$0, bwa.e);
   }

   @Override
   public float ej() {
      return this.n_() ? 0.65F : 1.0F;
   }

   @Override
   protected void r(int $$0) {
   }

   public void i(jj $$0) {
      this.al.a(bH, $$0);
   }

   public jj q() {
      return this.al.a(bH);
   }

   public boolean t() {
      return this.al.a(bI);
   }

   public void w(boolean $$0) {
      this.al.a(bI, $$0);
   }

   public int x() {
      return this.al.a(bJ);
   }

   public void s(int $$0) {
      this.al.a(bJ, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bH, jj.c);
      $$0.a(bI, false);
      $$0.a(bJ, 2400);
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      $$0.a("TreasurePosX", this.q().u());
      $$0.a("TreasurePosY", this.q().v());
      $$0.a("TreasurePosZ", this.q().w());
      $$0.a("GotFish", this.t());
      $$0.a("Moistness", this.x());
   }

   @Override
   public void a(tw $$0) {
      int $$1 = $$0.h("TreasurePosX");
      int $$2 = $$0.h("TreasurePosY");
      int $$3 = $$0.h("TreasurePosZ");
      this.i(new jj($$1, $$2, $$3));
      super.a($$0);
      this.w($$0.q("GotFish"));
      this.s($$0.h("Moistness"));
   }

   @Override
   protected void D() {
      this.bB.a(0, new ccy(this));
      this.bB.a(0, new cex(this));
      this.bB.a(1, new cio.a(this));
      this.bB.a(2, new cio.b(this, 4.0));
      this.bB.a(4, new cel(this, 1.0, 10));
      this.bB.a(4, new cei(this));
      this.bB.a(5, new cdv(this, cqi.class, 6.0F));
      this.bB.a(5, new cdd(this, 10));
      this.bB.a(6, new cdx(this, 1.2F, true));
      this.bB.a(8, new cio.c());
      this.bB.a(8, new cdi(this));
      this.bB.a(9, new ccu<>(this, cnf.class, 8.0F, 1.0, 1.0));
      this.bC.a(1, new cff(this, cnf.class).a());
   }

   public static bxw.a gq() {
      return bwt.E().a(bxx.s, 10.0).a(bxx.v, 1.2F).a(bxx.c, 3.0);
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cgd(this, $$0);
   }

   @Override
   public void gj() {
      this.a(awk.hs, 1.0F, 1.0F);
   }

   @Override
   public boolean c(bwr $$0) {
      return !this.n_() && super.c($$0);
   }

   @Override
   public int cs() {
      return 4800;
   }

   @Override
   protected int m(int $$0) {
      return this.cs();
   }

   @Override
   public int ac() {
      return 1;
   }

   @Override
   public int ad() {
      return 1;
   }

   @Override
   protected boolean o(bvs $$0) {
      return true;
   }

   @Override
   protected boolean f(bwc $$0) {
      return $$0 == bwc.a && this.fM();
   }

   @Override
   protected void a(arn $$0, cmn $$1) {
      if (this.a(bwc.a).f()) {
         cxy $$2 = $$1.f();
         if (this.h($$2)) {
            this.a($$1);
            this.a(bwc.a, $$2);
            this.g(bwc.a);
            this.a($$1, $$2.M());
            $$1.at();
         }
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.gf()) {
         this.j(this.cs());
      } else {
         if (this.bl()) {
            this.s(2400);
         } else {
            this.s(this.x() - 1);
            if (this.x() <= 0) {
               this.a(this.dW().t(), 1.0F);
            }

            if (this.aJ()) {
               this.i(this.dy().b((double)((this.ae.i() * 2.0F - 1.0F) * 0.2F), 0.5, (double)((this.ae.i() * 2.0F - 1.0F) * 0.2F)));
               this.w(this.ae.i() * 360.0F);
               this.d(false);
               this.ar = true;
            }
         }

         if (this.dV().C && this.bj() && this.dy().h() > 0.03) {
            fcu $$0 = this.h(0.0F);
            float $$1 = azk.b(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$2 = azk.a(this.dL() * (float) (Math.PI / 180.0)) * 0.3F;
            float $$3 = 1.2F - this.ae.i() * 0.7F;

            for (int $$4 = 0; $$4 < 2; $$4++) {
               this.dV()
                  .a(lv.av, this.dA() - $$0.d * (double)$$3 + (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 + (double)$$2, 0.0, 0.0, 0.0);
               this.dV()
                  .a(lv.av, this.dA() - $$0.d * (double)$$3 - (double)$$1, this.dC() - $$0.e, this.dG() - $$0.f * (double)$$3 - (double)$$2, 0.0, 0.0, 0.0);
            }
         }
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 38) {
         this.a(lv.Q);
      } else {
         super.b($$0);
      }
   }

   private void a(lt $$0) {
      for (int $$1 = 0; $$1 < 7; $$1++) {
         double $$2 = this.ae.k() * 0.01;
         double $$3 = this.ae.k() * 0.01;
         double $$4 = this.ae.k() * 0.01;
         this.dV().a($$0, this.d(1.0), this.dD() + 0.2, this.g(1.0), $$2, $$3, $$4);
      }
   }

   @Override
   protected btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if (!$$2.f() && $$2.a(axi.aT)) {
         if (!this.dV().C) {
            this.a(awk.hu, 1.0F, 1.0F);
         }

         if (this.n_()) {
            $$2.a(1, $$0);
            this.a(d_(-this.b), true);
         } else {
            this.w(true);
            $$2.a(1, $$0);
         }

         return btq.a;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected awj e(buh $$0) {
      return awk.hv;
   }

   @Nullable
   @Override
   protected awj l_() {
      return awk.ht;
   }

   @Nullable
   @Override
   protected awj u() {
      return this.bj() ? awk.hr : awk.hq;
   }

   @Override
   protected awj aW() {
      return awk.hy;
   }

   @Override
   protected awj aV() {
      return awk.hz;
   }

   protected boolean gr() {
      jj $$0 = this.O().g();
      return $$0 != null ? $$0.a(this.dt(), 12.0) : false;
   }

   @Override
   public void a_(fcu $$0) {
      if (this.bj()) {
         this.a(this.fn(), $$0);
         this.a(bwv.a, this.dy());
         this.i(this.dy().c(0.9));
         if (this.f() == null) {
            this.i(this.dy().b(0.0, -0.005, 0.0));
         }
      } else {
         super.a_($$0);
      }
   }

   @Override
   public boolean w() {
      return true;
   }

   static class a extends cdn {
      private final cio a;
      private boolean b;

      a(cio $$0) {
         this.a = $$0;
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean P_() {
         return false;
      }

      @Override
      public boolean b() {
         return this.a.t() && this.a.ct() >= 100;
      }

      @Override
      public boolean c() {
         jj $$0 = this.a.q();
         return !jj.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) && !this.b && this.a.ct() >= 100;
      }

      @Override
      public void d() {
         if (this.a.dV() instanceof arn) {
            arn $$0 = (arn)this.a.dV();
            this.b = false;
            this.a.O().m();
            jj $$1 = this.a.dv();
            jj $$2 = $$0.a(axl.b, $$1, 50, false);
            if ($$2 != null) {
               this.a.i($$2);
               $$0.a(this.a, (byte)38);
            } else {
               this.b = true;
            }
         }
      }

      @Override
      public void e() {
         jj $$0 = this.a.q();
         if (jj.a((double)$$0.u(), this.a.dC(), (double)$$0.w()).a(this.a.dt(), 4.0) || this.b) {
            this.a.w(false);
         }
      }

      @Override
      public void a() {
         dhp $$0 = this.a.dV();
         if (this.a.gr() || this.a.O().k()) {
            fcu $$1 = fcu.b(this.a.q());
            fcu $$2 = chk.a(this.a, 16, 1, $$1, (float) (Math.PI / 8));
            if ($$2 == null) {
               $$2 = chk.a(this.a, 8, 4, $$1, (float) (Math.PI / 2));
            }

            if ($$2 != null) {
               jj $$3 = jj.a((kc)$$2);
               if (!$$0.b_($$3).a(axf.a) || !$$0.a_($$3).a(evi.b)) {
                  $$2 = chk.a(this.a, 8, 5, $$1, (float) (Math.PI / 2));
               }
            }

            if ($$2 == null) {
               this.b = true;
               return;
            }

            this.a.J().a($$2.d, $$2.e, $$2.f, (float)(this.a.ad() + 20), (float)this.a.ac());
            this.a.O().a($$2.d, $$2.e, $$2.f, 1.3);
            if ($$0.A.a(this.a(80)) == 0) {
               $$0.a(this.a, (byte)38);
            }
         }
      }
   }

   static class b extends cdn {
      private final cio a;
      private final double b;
      @Nullable
      private cqi c;

      b(cio $$0, double $$1) {
         this.a = $$0;
         this.b = $$1;
         this.a(EnumSet.of(cdn.a.a, cdn.a.b));
      }

      @Override
      public boolean b() {
         this.c = a(this.a).a(cio.bK, this.a);
         return this.c == null ? false : this.c.ck() && this.a.f() != this.c;
      }

      @Override
      public boolean c() {
         return this.c != null && this.c.ck() && this.a.g(this.c) < 256.0;
      }

      @Override
      public void d() {
         this.c.b(new buw(buy.D, 100), this.a);
      }

      @Override
      public void e() {
         this.c = null;
         this.a.O().m();
      }

      @Override
      public void a() {
         this.a.J().a(this.c, (float)(this.a.ad() + 20), (float)this.a.ac());
         if (this.a.g(this.c) < 6.25) {
            this.a.O().m();
         } else {
            this.a.O().a(this.c, this.b);
         }

         if (this.c.ck() && this.c.dV().A.a(6) == 0) {
            this.c.b(new buw(buy.D, 100), this.a);
         }
      }
   }

   class c extends cdn {
      private int b;

      @Override
      public boolean b() {
         if (this.b > cio.this.af) {
            return false;
         } else {
            List<cmn> $$0 = cio.this.dV().a(cmn.class, cio.this.cR().c(8.0, 8.0, 8.0), cio.bF);
            return !$$0.isEmpty() || !cio.this.a(bwc.a).f();
         }
      }

      @Override
      public void d() {
         List<cmn> $$0 = cio.this.dV().a(cmn.class, cio.this.cR().c(8.0, 8.0, 8.0), cio.bF);
         if (!$$0.isEmpty()) {
            cio.this.O().a($$0.get(0), 1.2F);
            cio.this.a(awk.hx, 1.0F, 1.0F);
         }

         this.b = 0;
      }

      @Override
      public void e() {
         cxy $$0 = cio.this.a(bwc.a);
         if (!$$0.f()) {
            this.a($$0);
            cio.this.a(bwc.a, cxy.k);
            this.b = cio.this.af + cio.this.ae.a(100);
         }
      }

      @Override
      public void a() {
         List<cmn> $$0 = cio.this.dV().a(cmn.class, cio.this.cR().c(8.0, 8.0, 8.0), cio.bF);
         cxy $$1 = cio.this.a(bwc.a);
         if (!$$1.f()) {
            this.a($$1);
            cio.this.a(bwc.a, cxy.k);
         } else if (!$$0.isEmpty()) {
            cio.this.O().a($$0.get(0), 1.2F);
         }
      }

      private void a(cxy $$0) {
         if (!$$0.f()) {
            double $$1 = cio.this.dE() - 0.3F;
            cmn $$2 = new cmn(cio.this.dV(), cio.this.dA(), $$1, cio.this.dG(), $$0);
            $$2.b(40);
            $$2.b(cio.this);
            float $$3 = 0.3F;
            float $$4 = cio.this.ae.i() * (float) (Math.PI * 2);
            float $$5 = 0.02F * cio.this.ae.i();
            $$2.n(
               (double)(0.3F * -azk.a(cio.this.dL() * (float) (Math.PI / 180.0)) * azk.b(cio.this.dN() * (float) (Math.PI / 180.0)) + azk.b($$4) * $$5),
               (double)(0.3F * azk.a(cio.this.dN() * (float) (Math.PI / 180.0)) * 1.5F),
               (double)(0.3F * azk.b(cio.this.dL() * (float) (Math.PI / 180.0)) * azk.b(cio.this.dN() * (float) (Math.PI / 180.0)) + azk.a($$4) * $$5)
            );
            cio.this.dV().b($$2);
         }
      }
   }
}
