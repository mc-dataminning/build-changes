import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwv extends bwr implements bkg<bwv.d>, bzo {
   private static final int bU = 5;
   private static final cmi bW = cmi.a(cjk.oI, csy.ij.k());
   private static final aeg<Integer> bX = aej.a(bwv.class, aei.b);
   private static final aeg<Integer> bY = aej.a(bwv.class, aei.b);
   private static final aeg<Integer> bZ = aej.a(bwv.class, aei.b);
   boolean ca;
   @Nullable
   private bwv cb;
   @Nullable
   private bwv cc;

   public bwv(biw<? extends bwv> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public boolean gm() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ase $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gn() {
      return this.an.b(bX);
   }

   @Override
   public void b(qy $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().g);
      $$0.a("Strength", this.gn());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qy()));
      }
   }

   @Override
   public void a(qy $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwv.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cjh.a($$0.p("DecorItem")));
      }

      this.gA();
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpx(this));
      this.bO.a(1, new brh(this, 1.2));
      this.bO.a(2, new bqk(this, 2.1F));
      this.bO.a(3, new brc(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bqw(this, 1.2));
      this.bO.a(4, new bpp(this, 1.0));
      this.bO.a(5, new brl(this, 1.25, cmi.a(cjk.hh), false));
      this.bO.a(6, new bqc(this, 1.0));
      this.bO.a(7, new brq(this, 0.7));
      this.bO.a(8, new bql(this, cbw.class, 6.0F));
      this.bO.a(9, new bqy(this));
      this.bP.a(1, new bwv.c(this));
      this.bP.a(2, new bwv.a(this));
   }

   public static bkn.a go() {
      return s().a(bko.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwv.d gp() {
      return bwv.d.a(this.an.b(bZ));
   }

   public void a(bwv.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int Z_() {
      return this.t() ? 2 + 3 * this.gl() : super.Z_();
   }

   @Override
   public boolean m(cjh $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbw $$0, cjh $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cjk.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csy.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gs() && this.h() == 0 && this.ge()) {
            $$5 = true;
            this.g($$0);
         }
      }

      if (this.eu() < this.eL() && $$4 > 0.0F) {
         this.b($$4);
         $$5 = true;
      }

      if (this.m_() && $$2 > 0) {
         this.dL().a(ix.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dL().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gs()) && this.gy() < this.gE()) {
         $$5 = true;
         if (!this.dL().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         ape $$6 = this.gk();
         if ($$6 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), this.gk(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eX() {
      return this.ev() || this.gv();
   }

   @Nullable
   @Override
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      ase $$5 = $$0.D_();
      this.b($$5);
      bwv.d $$6;
      if ($$3 instanceof bwv.b) {
         $$6 = ((bwv.b)$$3).a;
      } else {
         $$6 = ac.a(bwv.d.values(), $$5);
         $$3 = new bwv.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gj() {
      return false;
   }

   @Override
   protected ape gC() {
      return apf.mx;
   }

   @Override
   protected ape w() {
      return apf.mw;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.mB;
   }

   @Override
   protected ape l_() {
      return apf.mz;
   }

   @Nullable
   @Override
   protected ape gk() {
      return apf.mA;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.mD, 0.15F, 1.0F);
   }

   @Override
   protected void gd() {
      this.a(apf.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gl() {
      return this.gn();
   }

   @Override
   public boolean gM() {
      return true;
   }

   @Override
   public boolean gN() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(cjh $$0) {
      return $$0.a(aqc.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgt $$0) {
      chv $$1 = this.gq();
      super.a($$0);
      chv $$2 = this.gq();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(apf.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gA() {
      if (!this.dL().B) {
         super.gA();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable chv $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static chv n(cjh $$0) {
      csx $$1 = csx.a($$0.d());
      return $$1 instanceof dcl ? ((dcl)$$1).a() : null;
   }

   @Nullable
   public chv gq() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : chv.a($$0);
   }

   @Override
   public int gE() {
      return 30;
   }

   @Override
   public boolean a(but $$0) {
      return $$0 != this && $$0 instanceof bwv && this.gL() && ((bwv)$$0).gL();
   }

   @Nullable
   public bwv b(aks $$0, bin $$1) {
      bwv $$2 = this.gr();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwv $$3 = (bwv)$$1;
         int $$4 = this.ag.a(Math.max(this.gn(), $$3.gn())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gp() : $$3.gp());
      }

      return $$2;
   }

   @Nullable
   protected bwv gr() {
      return biw.aj.a(this.dL());
   }

   private void k(bji $$0) {
      ccn $$1 = new ccn(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apf.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bhq $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (bis $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eH();
         return true;
      }
   }

   public void gP() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bwv $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gQ() {
      return this.cc != null;
   }

   public boolean gR() {
      return this.cb != null;
   }

   @Nullable
   public bwv gS() {
      return this.cb;
   }

   @Override
   protected double gc() {
      return 2.0;
   }

   @Override
   protected void gF() {
      if (!this.gR() && this.m_()) {
         super.gF();
      }
   }

   @Override
   public boolean gG() {
      return false;
   }

   @Override
   public void a(bji $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ehp cI() {
      return new ehp(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.m_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends brw<bvw> {
      public a(bwv $$0) {
         super($$0, bvw.class, 16, false, true, $$0x -> !((bvw)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bin.a {
      public final bwv.d a;

      b(bwv.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brv {
      public c(bwv $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwv $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements asr {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwv.d> e = asr.a(bwv.d::values);
      private static final IntFunction<bwv.d> f = aqt.a(bwv.d::a, values(), aqt.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwv.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
