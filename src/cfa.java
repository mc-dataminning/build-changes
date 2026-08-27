import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cfa extends cew implements bsd<cfa.d>, chv {
   private static final int bZ = 5;
   private static final cwd cb = cwd.a(csg.pw, dcx.ij.p());
   private static final ajk<Integer> cc = ajo.a(cfa.class, ajm.b);
   private static final ajk<Integer> cd = ajo.a(cfa.class, ajm.b);
   private static final bqo ce = bqr.am.n().a(bqn.a().a(bqm.a, 0.0F, bqr.am.l() - 0.8125F, -0.3F)).a(0.5F);
   boolean cf;
   @Nullable
   private cfa cg;
   @Nullable
   private cfa ch;

   public cfa(bqr<? extends cfa> $$0, czu $$1) {
      super($$0, $$1);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.ao.a(cc, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ayd $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gz() {
      return this.ao.a(cc);
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gz());
   }

   @Override
   public void a(ty $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cfa.d.a($$0.h("Variant")));
   }

   @Override
   protected void z() {
      this.bS.a(0, new bxv(this));
      this.bS.a(1, new bzf(this, 1.2));
      this.bS.a(2, new byi(this, 2.1F));
      this.bS.a(3, new bza(this, 1.25, 40, 20.0F));
      this.bS.a(3, new byu(this, 1.2));
      this.bS.a(4, new bxn(this, 1.0));
      this.bS.a(5, new bzj(this, 1.25, cwd.a(csg.hD), false));
      this.bS.a(6, new bya(this, 1.0));
      this.bS.a(7, new bzo(this, 0.7));
      this.bS.a(8, new byj(this, ckl.class, 6.0F));
      this.bS.a(9, new byw(this));
      this.bT.a(1, new cfa.c(this));
      this.bT.a(2, new cfa.a(this));
   }

   public static bsk.a gA() {
      return r().a(bsl.k, 40.0);
   }

   @Override
   protected void a(ajo.a $$0) {
      super.a($$0);
      $$0.a(cc, 0);
      $$0.a(cd, 0);
   }

   public cfa.d gB() {
      return cfa.d.a(this.ao.a(cd));
   }

   public void a(cfa.d $$0) {
      this.ao.a(cd, $$0.g);
   }

   @Override
   protected int ab_() {
      return this.u() ? 1 + 3 * this.gx() : super.ab_();
   }

   @Override
   public boolean o(csd $$0) {
      return cb.a($$0);
   }

   @Override
   protected boolean a(ckl $$0, csd $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(csg.pw)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dcx.ij.p())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gE() && this.g() == 0 && this.gq()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ey() < this.eP() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dN().a(kw.M, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gE()) && this.gK() < this.gP()) {
         $$5 = true;
         if (!this.dN().B) {
            this.w($$3);
         }
      }

      if ($$5 && !this.aU()) {
         auy $$6 = this.gw();
         if ($$6 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), this.gw(), this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fe() {
      return this.ez() || this.gH();
   }

   @Nullable
   @Override
   public brw a(daj $$0, boo $$1, bri $$2, @Nullable brw $$3) {
      ayd $$4 = $$0.E_();
      this.b($$4);
      cfa.d $$5;
      if ($$3 instanceof cfa.b) {
         $$5 = ((cfa.b)$$3).a;
      } else {
         $$5 = ac.a(cfa.d.values(), $$4);
         $$3 = new cfa.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gv() {
      return false;
   }

   @Override
   protected auy gN() {
      return auz.nP;
   }

   @Override
   protected auy v() {
      return auz.nO;
   }

   @Override
   protected auy d(bpj $$0) {
      return auz.nT;
   }

   @Override
   protected auy o_() {
      return auz.nR;
   }

   @Nullable
   @Override
   protected auy gw() {
      return auz.nS;
   }

   @Override
   protected void b(im $$0, dpy $$1) {
      this.a(auz.nV, 0.15F, 1.0F);
   }

   @Override
   protected void gp() {
      this.a(auz.nQ, 1.0F, (this.ah.i() - this.ah.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gx() {
      return this.gz();
   }

   @Override
   public boolean fR() {
      return true;
   }

   @Override
   public boolean l(csd $$0) {
      return $$0.a(avw.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public void a(boj $$0) {
      cqw $$1 = this.gC();
      super.a($$0);
      cqw $$2 = this.gC();
      if (this.ai > 20 && $$2 != null && $$2 != $$1) {
         this.a(auz.nW, 0.5F, 1.0F);
      }
   }

   @Nullable
   private static cqw n(csd $$0) {
      dcv $$1 = dcv.a($$0.f());
      return $$1 instanceof dmq ? ((dmq)$$1).b() : null;
   }

   @Nullable
   public cqw gC() {
      return n(this.d(bqs.g));
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(cct $$0) {
      return $$0 != this && $$0 instanceof cfa && this.gW() && ((cfa)$$0).gW();
   }

   @Nullable
   public cfa b(aqe $$0, bqf $$1) {
      cfa $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cfa $$3 = (cfa)$$1;
         int $$4 = this.ah.a(Math.max(this.gz(), $$3.gz())) + 1;
         if (this.ah.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.ah.h() ? this.gB() : $$3.gB());
      }

      return $$2;
   }

   @Nullable
   protected cfa gD() {
      return bqr.am.a(this.dN());
   }

   private void k(bre $$0) {
      clc $$1 = new clc(this.dN(), this);
      double $$2 = $$0.ds() - this.ds();
      double $$3 = $$0.e(0.3333333333333333) - $$1.du();
      double $$4 = $$0.dy() - this.dy();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), auz.nU, this.dc(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
      }

      this.dN().b($$1);
      this.cf = true;
   }

   void D(boolean $$0) {
      this.cf = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bpj $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bQ()) {
               for (bql $$4 : this.cU()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eL();
         return true;
      }
   }

   public void gZ() {
      if (this.cg != null) {
         this.cg.ch = null;
      }

      this.cg = null;
   }

   public void a(cfa $$0) {
      this.cg = $$0;
      this.cg.ch = this;
   }

   public boolean ha() {
      return this.ch != null;
   }

   public boolean hb() {
      return this.cg != null;
   }

   @Nullable
   public cfa hc() {
      return this.cg;
   }

   @Override
   protected double go() {
      return 2.0;
   }

   @Override
   protected void gQ() {
      if (!this.hb() && this.p_()) {
         super.gQ();
      }
   }

   @Override
   public boolean gR() {
      return false;
   }

   @Override
   public void a(bre $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public etf cK() {
      return new etf(0.0, 0.75 * (double)this.cJ(), (double)this.dh() * 0.5);
   }

   @Override
   public bqo e(brp $$0) {
      return this.p_() ? ce : super.e($$0);
   }

   @Override
   protected etf a(bql $$0, bqo $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends bzu<cdw> {
      public a(cfa $$0) {
         super($$0, cdw.class, 16, false, true, $$0x -> !((cdw)$$0x).r());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bqf.a {
      public final cfa.d a;

      b(cfa.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bzt {
      public c(cfa $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof cfa $$0 && $$0.cf) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ayq {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cfa.d> e = ayq.a(cfa.d::values);
      private static final IntFunction<cfa.d> f = awn.a(cfa.d::a, values(), awn.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cfa.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
