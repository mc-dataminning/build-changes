import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwl extends bwh implements bjw<bwl.d>, bze {
   private static final int bU = 5;
   private static final clx bW = clx.a(cja.oI, csm.ij.k());
   private static final adz<Integer> bX = aec.a(bwl.class, aeb.b);
   private static final adz<Integer> bY = aec.a(bwl.class, aeb.b);
   private static final adz<Integer> bZ = aec.a(bwl.class, aeb.b);
   boolean ca;
   @Nullable
   private bwl cb;
   @Nullable
   private bwl cc;

   public bwl(bim<? extends bwl> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public boolean gj() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(aru $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gk() {
      return this.an.b(bX);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().g);
      $$0.a("Strength", this.gk());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qr()));
      }
   }

   @Override
   public void a(qr $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwl.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cix.a($$0.p("DecorItem")));
      }

      this.gx();
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpn(this));
      this.bO.a(1, new bqx(this, 1.2));
      this.bO.a(2, new bqa(this, 2.1F));
      this.bO.a(3, new bqs(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bqm(this, 1.2));
      this.bO.a(4, new bpf(this, 1.0));
      this.bO.a(5, new brb(this, 1.25, clx.a(cja.hh), false));
      this.bO.a(6, new bps(this, 1.0));
      this.bO.a(7, new brg(this, 0.7));
      this.bO.a(8, new bqb(this, cbm.class, 6.0F));
      this.bO.a(9, new bqo(this));
      this.bP.a(1, new bwl.c(this));
      this.bP.a(2, new bwl.a(this));
   }

   public static bkd.a gl() {
      return p().a(bke.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwl.d gm() {
      return bwl.d.a(this.an.b(bZ));
   }

   public void a(bwl.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int U_() {
      return this.q() ? 2 + 3 * this.gi() : super.U_();
   }

   @Override
   public boolean m(cix $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbm $$0, cix $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cja.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csm.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gp() && this.h() == 0 && this.gb()) {
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

      if ($$3 > 0 && ($$5 || !this.gp()) && this.gv() < this.gB()) {
         $$5 = true;
         if (!this.dK().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         aov $$6 = this.gh();
         if ($$6 != null) {
            this.dK().a(null, this.dp(), this.dr(), this.dv(), this.gh(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eW() {
      return this.eu() || this.gs();
   }

   @Nullable
   @Override
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      aru $$5 = $$0.y_();
      this.b($$5);
      bwl.d $$6;
      if ($$3 instanceof bwl.b) {
         $$6 = ((bwl.b)$$3).a;
      } else {
         $$6 = ac.a(bwl.d.values(), $$5);
         $$3 = new bwl.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   protected aov gz() {
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
   protected aov gh() {
      return aow.mA;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.mD, 0.15F, 1.0F);
   }

   @Override
   protected void ga() {
      this.a(aow.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gi() {
      return this.gk();
   }

   @Override
   public boolean gJ() {
      return true;
   }

   @Override
   public boolean gK() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(cix $$0) {
      return $$0.a(apt.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgj $$0) {
      chl $$1 = this.gn();
      super.a($$0);
      chl $$2 = this.gn();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aow.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gx() {
      if (!this.dK().B) {
         super.gx();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable chl $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static chl n(cix $$0) {
      csl $$1 = csl.a($$0.d());
      return $$1 instanceof dbz ? ((dbz)$$1).a() : null;
   }

   @Nullable
   public chl gn() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : chl.a($$0);
   }

   @Override
   public int gB() {
      return 30;
   }

   @Override
   public boolean a(buj $$0) {
      return $$0 != this && $$0 instanceof bwl && this.gI() && ((bwl)$$0).gI();
   }

   @Nullable
   public bwl b(akk $$0, bid $$1) {
      bwl $$2 = this.go();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwl $$3 = (bwl)$$1;
         int $$4 = this.ag.a(Math.max(this.gk(), $$3.gk())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gm() : $$3.gm());
      }

      return $$2;
   }

   @Nullable
   protected bwl go() {
      return bim.aj.a(this.dK());
   }

   private void k(biy $$0) {
      ccd $$1 = new ccd(this.dK(), this);
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

   public void gM() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bwl $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gN() {
      return this.cc != null;
   }

   public boolean gO() {
      return this.cb != null;
   }

   @Nullable
   public bwl gP() {
      return this.cb;
   }

   @Override
   protected double fZ() {
      return 2.0;
   }

   @Override
   protected void gC() {
      if (!this.gO() && this.i_()) {
         super.gC();
      }
   }

   @Override
   public boolean gD() {
      return false;
   }

   @Override
   public void a(biy $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ehd cI() {
      return new ehd(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends brm<bvm> {
      public a(bwl $$0) {
         super($$0, bvm.class, 16, false, true, $$0x -> !((bvm)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bid.a {
      public final bwl.d a;

      b(bwl.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brl {
      public c(bwl $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwl $$0 && $$0.ca) {
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

      public static final Codec<bwl.d> e = ash.a(bwl.d::values);
      private static final IntFunction<bwl.d> f = aqk.a(bwl.d::a, values(), aqk.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwl.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
