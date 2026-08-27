import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwm extends bwi implements bjx<bwm.d>, bzf {
   private static final int bU = 5;
   private static final cly bW = cly.a(cjb.oI, csn.ij.k());
   private static final adz<Integer> bX = aec.a(bwm.class, aeb.b);
   private static final adz<Integer> bY = aec.a(bwm.class, aeb.b);
   private static final adz<Integer> bZ = aec.a(bwm.class, aeb.b);
   boolean ca;
   @Nullable
   private bwm cb;
   @Nullable
   private bwm cc;

   public bwm(bim<? extends bwm> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public boolean gi() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(aru $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gj() {
      return this.an.b(bX);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gl().g);
      $$0.a("Strength", this.gj());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwm.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, ciy.a($$0.p("DecorItem")));
      }

      this.gw();
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpo(this));
      this.bO.a(1, new bqy(this, 1.2));
      this.bO.a(2, new bqb(this, 2.1F));
      this.bO.a(3, new bqt(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bqn(this, 1.2));
      this.bO.a(4, new bpg(this, 1.0));
      this.bO.a(5, new brc(this, 1.25, cly.a(cjb.hh), false));
      this.bO.a(6, new bpt(this, 1.0));
      this.bO.a(7, new brh(this, 0.7));
      this.bO.a(8, new bqc(this, cbn.class, 6.0F));
      this.bO.a(9, new bqp(this));
      this.bP.a(1, new bwm.c(this));
      this.bP.a(2, new bwm.a(this));
   }

   public static bke.a gk() {
      return p().a(bkf.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwm.d gl() {
      return bwm.d.a(this.an.b(bZ));
   }

   public void a(bwm.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int V_() {
      return this.q() ? 2 + 3 * this.gh() : super.V_();
   }

   @Override
   public boolean m(ciy $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbn $$0, ciy $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cjb.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csn.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.go() && this.h() == 0 && this.ga()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.et() < this.eK() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.i_() && $$2 > 0) {
         this.dK().a(iv.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dK().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.go()) && this.gu() < this.gA()) {
         $$5 = true;
         if (!this.dK().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         aov $$6 = this.gg();
         if ($$6 != null) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), this.gg(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eW() {
      return this.eu() || this.gr();
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.b($$5);
      bwm.d $$6;
      if ($$3 instanceof bwm.b) {
         $$6 = ((bwm.b)$$3).a;
      } else {
         $$6 = ac.a(bwm.d.values(), $$5);
         $$3 = new bwm.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   protected aov gy() {
      return aow.mx;
   }

   @Override
   protected aov r() {
      return aow.mw;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.mB;
   }

   @Override
   protected aov h_() {
      return aow.mz;
   }

   @Nullable
   @Override
   protected aov gg() {
      return aow.mA;
   }

   @Override
   protected void b(gu $$0, dfa $$1) {
      this.a(aow.mD, 0.15F, 1.0F);
   }

   @Override
   protected void fZ() {
      this.a(aow.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gh() {
      return this.gj();
   }

   @Override
   public boolean gI() {
      return true;
   }

   @Override
   public boolean gJ() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(ciy $$0) {
      return $$0.a(apt.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgj $$0) {
      chm $$1 = this.gm();
      super.a($$0);
      chm $$2 = this.gm();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aow.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gw() {
      if (!this.dK().B) {
         super.gw();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable chm $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static chm n(ciy $$0) {
      csm $$1 = csm.a($$0.d());
      return $$1 instanceof dca ? ((dca)$$1).a() : null;
   }

   @Nullable
   public chm gm() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : chm.a($$0);
   }

   @Override
   public int gA() {
      return 30;
   }

   @Override
   public boolean a(buk $$0) {
      return $$0 != this && $$0 instanceof bwm && this.gH() && ((bwm)$$0).gH();
   }

   @Nullable
   public bwm b(akk $$0, bid $$1) {
      bwm $$2 = this.gn();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwm $$3 = (bwm)$$1;
         int $$4 = this.ag.a(Math.max(this.gj(), $$3.gj())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gl() : $$3.gl());
      }

      return $$2;
   }

   @Nullable
   protected bwm gn() {
      return bim.aj.a(this.dK());
   }

   private void m(biy $$0) {
      cce $$1 = new cce(this.dK(), this);
      double $$2 = $$0.dp() - this.dp();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dr();
      double $$4 = $$0.dv() - this.dv();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aow.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dK().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bhg $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (bii $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eG();
         return true;
      }
   }

   public void gL() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bwm $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gM() {
      return this.cc != null;
   }

   public boolean gN() {
      return this.cb != null;
   }

   @Nullable
   public bwm gO() {
      return this.cb;
   }

   @Override
   protected double fY() {
      return 2.0;
   }

   @Override
   protected void gB() {
      if (!this.gN() && this.i_()) {
         super.gB();
      }
   }

   @Override
   public boolean gC() {
      return false;
   }

   @Override
   public void a(biy $$0, float $$1) {
      this.m($$0);
   }

   @Override
   public ehe cI() {
      return new ehe(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends brn<bvn> {
      public a(bwm $$0) {
         super($$0, bvn.class, 16, false, true, $$0x -> !((bvn)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bid.a {
      public final bwm.d a;

      b(bwm.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brm {
      public c(bwm $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwm $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ash {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwm.d> e = ash.a(bwm.d::values);
      private static final IntFunction<bwm.d> f = aqk.a(bwm.d::a, values(), aqk.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwm.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
