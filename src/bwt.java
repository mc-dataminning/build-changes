import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwt extends bwp implements bke<bwt.d>, bzm {
   private static final int bU = 5;
   private static final cmg bW = cmg.a(cji.oI, csw.ij.k());
   private static final aee<Integer> bX = aeh.a(bwt.class, aeg.b);
   private static final aee<Integer> bY = aeh.a(bwt.class, aeg.b);
   private static final aee<Integer> bZ = aeh.a(bwt.class, aeg.b);
   boolean ca;
   @Nullable
   private bwt cb;
   @Nullable
   private bwt cc;

   public bwt(biu<? extends bwt> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public boolean gm() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(asc $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gn() {
      return this.an.b(bX);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gp().g);
      $$0.a("Strength", this.gn());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qw()));
      }
   }

   @Override
   public void a(qw $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwt.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cjf.a($$0.p("DecorItem")));
      }

      this.gA();
   }

   @Override
   protected void z() {
      this.bO.a(0, new bpv(this));
      this.bO.a(1, new brf(this, 1.2));
      this.bO.a(2, new bqi(this, 2.1F));
      this.bO.a(3, new bra(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bqu(this, 1.2));
      this.bO.a(4, new bpn(this, 1.0));
      this.bO.a(5, new brj(this, 1.25, cmg.a(cji.hh), false));
      this.bO.a(6, new bqa(this, 1.0));
      this.bO.a(7, new bro(this, 0.7));
      this.bO.a(8, new bqj(this, cbu.class, 6.0F));
      this.bO.a(9, new bqw(this));
      this.bP.a(1, new bwt.c(this));
      this.bP.a(2, new bwt.a(this));
   }

   public static bkl.a go() {
      return s().a(bkm.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwt.d gp() {
      return bwt.d.a(this.an.b(bZ));
   }

   public void a(bwt.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int Z_() {
      return this.t() ? 2 + 3 * this.gl() : super.Z_();
   }

   @Override
   public boolean m(cjf $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbu $$0, cjf $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cji.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csw.ij.k())) {
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
         this.dL().a(iv.K, this.d(1.0), this.dt() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         apc $$6 = this.gk();
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
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      asc $$5 = $$0.D_();
      this.b($$5);
      bwt.d $$6;
      if ($$3 instanceof bwt.b) {
         $$6 = ((bwt.b)$$3).a;
      } else {
         $$6 = ac.a(bwt.d.values(), $$5);
         $$3 = new bwt.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gj() {
      return false;
   }

   @Override
   protected apc gC() {
      return apd.mx;
   }

   @Override
   protected apc w() {
      return apd.mw;
   }

   @Override
   protected apc d(bho $$0) {
      return apd.mB;
   }

   @Override
   protected apc l_() {
      return apd.mz;
   }

   @Nullable
   @Override
   protected apc gk() {
      return apd.mA;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(apd.mD, 0.15F, 1.0F);
   }

   @Override
   protected void gd() {
      this.a(apd.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
   public boolean l(cjf $$0) {
      return $$0.a(aqa.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgr $$0) {
      cht $$1 = this.gq();
      super.a($$0);
      cht $$2 = this.gq();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(apd.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gA() {
      if (!this.dL().B) {
         super.gA();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cht $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cht n(cjf $$0) {
      csv $$1 = csv.a($$0.d());
      return $$1 instanceof dcj ? ((dcj)$$1).a() : null;
   }

   @Nullable
   public cht gq() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : cht.a($$0);
   }

   @Override
   public int gE() {
      return 30;
   }

   @Override
   public boolean a(bur $$0) {
      return $$0 != this && $$0 instanceof bwt && this.gL() && ((bwt)$$0).gL();
   }

   @Nullable
   public bwt b(akq $$0, bil $$1) {
      bwt $$2 = this.gr();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwt $$3 = (bwt)$$1;
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
   protected bwt gr() {
      return biu.aj.a(this.dL());
   }

   private void k(bjg $$0) {
      ccl $$1 = new ccl(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apd.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bho $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (biq $$4 : this.cT()) {
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

   public void a(bwt $$0) {
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
   public bwt gS() {
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
   public void a(bjg $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ehn cI() {
      return new ehn(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.m_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends bru<bvu> {
      public a(bwt $$0) {
         super($$0, bvu.class, 16, false, true, $$0x -> !((bvu)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bil.a {
      public final bwt.d a;

      b(bwt.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brt {
      public c(bwt $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwt $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements asp {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwt.d> e = asp.a(bwt.d::values);
      private static final IntFunction<bwt.d> f = aqr.a(bwt.d::a, values(), aqr.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwt.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
