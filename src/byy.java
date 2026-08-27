import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class byy extends byu implements bmj<byy.d>, cbr {
   private static final int bU = 5;
   private static final coq bW = coq.a(clr.pt, cvh.ij.k());
   private static final afs<Integer> bX = afv.a(byy.class, afu.b);
   private static final afs<Integer> bY = afv.a(byy.class, afu.b);
   private static final afs<Integer> bZ = afv.a(byy.class, afu.b);
   boolean ca;
   @Nullable
   private byy cb;
   @Nullable
   private byy cc;

   public byy(bkz<? extends byy> $$0, csf $$1) {
      super($$0, $$1);
   }

   public boolean go() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(atw $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gp() {
      return this.an.b(bX);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Variant", this.gr().g);
      $$0.a("Strength", this.gp());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new sd()));
      }
   }

   @Override
   public void a(sd $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(byy.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, clo.a($$0.p("DecorItem")));
      }

      this.gC();
   }

   @Override
   protected void B() {
      this.bO.a(0, new bsa(this));
      this.bO.a(1, new btk(this, 1.2));
      this.bO.a(2, new bsn(this, 2.1F));
      this.bO.a(3, new btf(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bsz(this, 1.2));
      this.bO.a(4, new brs(this, 1.0));
      this.bO.a(5, new bto(this, 1.25, coq.a(clr.hC), false));
      this.bO.a(6, new bsf(this, 1.0));
      this.bO.a(7, new btt(this, 0.7));
      this.bO.a(8, new bso(this, cdz.class, 6.0F));
      this.bO.a(9, new btb(this));
      this.bP.a(1, new byy.c(this));
      this.bP.a(2, new byy.a(this));
   }

   public static bmq.a gq() {
      return u().a(bmr.g, 40.0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public byy.d gr() {
      return byy.d.a(this.an.b(bZ));
   }

   public void a(byy.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int ac_() {
      return this.w() ? 2 + 3 * this.gn() : super.ac_();
   }

   @Override
   public boolean m(clo $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cdz $$0, clo $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(clr.pt)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cvh.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gu() && this.h() == 0 && this.gg()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.ew() < this.eN() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dN().a(jw.K, this.d(1.0), this.dv() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dN().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gu()) && this.gA() < this.gG()) {
         $$5 = true;
         if (!this.dN().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aU()) {
         aqu $$6 = this.gm();
         if ($$6 != null) {
            this.dN().a(null, this.ds(), this.du(), this.dy(), this.gm(), this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eZ() {
      return this.ex() || this.gx();
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      atw $$5 = $$0.F_();
      this.b($$5);
      byy.d $$6;
      if ($$3 instanceof byy.b) {
         $$6 = ((byy.b)$$3).a;
      } else {
         $$6 = ac.a(byy.d.values(), $$5);
         $$3 = new byy.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gl() {
      return false;
   }

   @Override
   protected aqu gE() {
      return aqv.mR;
   }

   @Override
   protected aqu y() {
      return aqv.mQ;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.mV;
   }

   @Override
   protected aqu n_() {
      return aqv.mT;
   }

   @Nullable
   @Override
   protected aqu gm() {
      return aqv.mU;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.mX, 0.15F, 1.0F);
   }

   @Override
   protected void gf() {
      this.a(aqv.mS, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gn() {
      return this.gp();
   }

   @Override
   public boolean gO() {
      return true;
   }

   @Override
   public boolean gP() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(clo $$0) {
      return $$0.a(ars.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(biu $$0) {
      ckc $$1 = this.gs();
      super.a($$0);
      ckc $$2 = this.gs();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aqv.mY, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gC() {
      if (!this.dN().B) {
         super.gC();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable ckc $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static ckc n(clo $$0) {
      cvf $$1 = cvf.a($$0.d());
      return $$1 instanceof dew ? ((dew)$$1).b() : null;
   }

   @Nullable
   public ckc gs() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : ckc.a($$0);
   }

   @Override
   public int gG() {
      return 30;
   }

   @Override
   public boolean a(bww $$0) {
      return $$0 != this && $$0 instanceof byy && this.gN() && ((byy)$$0).gN();
   }

   @Nullable
   public byy b(ami $$0, bkq $$1) {
      byy $$2 = this.gt();
      if ($$2 != null) {
         this.a($$1, $$2);
         byy $$3 = (byy)$$1;
         int $$4 = this.ag.a(Math.max(this.gp(), $$3.gp())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gr() : $$3.gr());
      }

      return $$2;
   }

   @Nullable
   protected byy gt() {
      return bkz.aj.a(this.dN());
   }

   private void k(bll $$0) {
      ceq $$1 = new ceq(this.dN(), this);
      double $$2 = $$0.ds() - this.ds();
      double $$3 = $$0.e(0.3333333333333333) - $$1.du();
      double $$4 = $$0.dy() - this.dy();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aU()) {
         this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.mW, this.dc(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dN().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bjt $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bP()) {
               for (bkv $$4 : this.cU()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eJ();
         return true;
      }
   }

   public void gR() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(byy $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gS() {
      return this.cc != null;
   }

   public boolean gT() {
      return this.cb != null;
   }

   @Nullable
   public byy gU() {
      return this.cb;
   }

   @Override
   protected double ge() {
      return 2.0;
   }

   @Override
   protected void gH() {
      if (!this.gT() && this.o_()) {
         super.gH();
      }
   }

   @Override
   public boolean gI() {
      return false;
   }

   @Override
   public void a(bll $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ejz cJ() {
      return new ejz(0.0, 0.75 * (double)this.cI(), (double)this.dh() * 0.5);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.o_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends btz<bxz> {
      public a(byy $$0) {
         super($$0, bxz.class, 16, false, true, $$0x -> !((bxz)$$0x).u());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bkq.a {
      public final byy.d a;

      b(byy.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bty {
      public c(byy $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof byy $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements auk {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<byy.d> e = auk.a(byy.d::values);
      private static final IntFunction<byy.d> f = asj.a(byy.d::a, values(), asj.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static byy.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
