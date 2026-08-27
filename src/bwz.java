import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwz extends bwv implements bkk<bwz.d>, bzs {
   private static final int bU = 5;
   private static final cmm bW = cmm.a(cjo.oI, cte.ij.k());
   private static final aef<Integer> bX = aei.a(bwz.class, aeh.b);
   private static final aef<Integer> bY = aei.a(bwz.class, aeh.b);
   private static final aef<Integer> bZ = aei.a(bwz.class, aeh.b);
   boolean ca;
   @Nullable
   private bwz cb;
   @Nullable
   private bwz cc;

   public bwz(bja<? extends bwz> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public boolean gn() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(ash $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int go() {
      return this.an.b(bX);
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      $$0.a("Variant", this.gq().g);
      $$0.a("Strength", this.go());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qw()));
      }
   }

   @Override
   public void a(qw $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwz.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cjl.a($$0.p("DecorItem")));
      }

      this.gB();
   }

   @Override
   protected void z() {
      this.bO.a(0, new bqb(this));
      this.bO.a(1, new brl(this, 1.2));
      this.bO.a(2, new bqo(this, 2.1F));
      this.bO.a(3, new brg(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bra(this, 1.2));
      this.bO.a(4, new bpt(this, 1.0));
      this.bO.a(5, new brp(this, 1.25, cmm.a(cjo.hh), false));
      this.bO.a(6, new bqg(this, 1.0));
      this.bO.a(7, new bru(this, 0.7));
      this.bO.a(8, new bqp(this, cca.class, 6.0F));
      this.bO.a(9, new brc(this));
      this.bP.a(1, new bwz.c(this));
      this.bP.a(2, new bwz.a(this));
   }

   public static bkr.a gp() {
      return s().a(bks.g, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwz.d gq() {
      return bwz.d.a(this.an.b(bZ));
   }

   public void a(bwz.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int Z_() {
      return this.t() ? 2 + 3 * this.gm() : super.Z_();
   }

   @Override
   public boolean m(cjl $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cca $$0, cjl $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cjo.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(cte.ij.k())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gt() && this.h() == 0 && this.gf()) {
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

      if ($$3 > 0 && ($$5 || !this.gt()) && this.gz() < this.gF()) {
         $$5 = true;
         if (!this.dL().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.aS()) {
         apf $$6 = this.gl();
         if ($$6 != null) {
            this.dL().a(null, this.dq(), this.ds(), this.dw(), this.gl(), this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean eX() {
      return this.ev() || this.gw();
   }

   @Nullable
   @Override
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      ash $$5 = $$0.D_();
      this.b($$5);
      bwz.d $$6;
      if ($$3 instanceof bwz.b) {
         $$6 = ((bwz.b)$$3).a;
      } else {
         $$6 = ac.a(bwz.d.values(), $$5);
         $$3 = new bwz.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gk() {
      return false;
   }

   @Override
   protected apf gD() {
      return apg.mx;
   }

   @Override
   protected apf w() {
      return apg.mw;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.mB;
   }

   @Override
   protected apf l_() {
      return apg.mz;
   }

   @Nullable
   @Override
   protected apf gl() {
      return apg.mA;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.mD, 0.15F, 1.0F);
   }

   @Override
   protected void ge() {
      this.a(apg.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
   }

   @Override
   public int gm() {
      return this.go();
   }

   @Override
   public boolean gN() {
      return true;
   }

   @Override
   public boolean gO() {
      return !this.cp.a(1).b();
   }

   @Override
   public boolean l(cjl $$0) {
      return $$0.a(aqd.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgx $$0) {
      chz $$1 = this.gr();
      super.a($$0);
      chz $$2 = this.gr();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(apg.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gB() {
      if (!this.dL().B) {
         super.gB();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable chz $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static chz n(cjl $$0) {
      ctc $$1 = ctc.a($$0.d());
      return $$1 instanceof dcn ? ((dcn)$$1).b() : null;
   }

   @Nullable
   public chz gr() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : chz.a($$0);
   }

   @Override
   public int gF() {
      return 30;
   }

   @Override
   public boolean a(bux $$0) {
      return $$0 != this && $$0 instanceof bwz && this.gM() && ((bwz)$$0).gM();
   }

   @Nullable
   public bwz b(akt $$0, bir $$1) {
      bwz $$2 = this.gs();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwz $$3 = (bwz)$$1;
         int $$4 = this.ag.a(Math.max(this.go(), $$3.go())) + 1;
         if (this.ag.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ag.h() ? this.gq() : $$3.gq());
      }

      return $$2;
   }

   @Nullable
   protected bwz gs() {
      return bja.aj.a(this.dL());
   }

   private void k(bjm $$0) {
      ccr $$1 = new ccr(this.dL(), this);
      double $$2 = $$0.dq() - this.dq();
      double $$3 = $$0.e(0.3333333333333333) - $$1.ds();
      double $$4 = $$0.dw() - this.dw();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dL().a(null, this.dq(), this.ds(), this.dw(), apg.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dL().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bhu $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (biw $$4 : this.cT()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eH();
         return true;
      }
   }

   public void gQ() {
      if (this.cb != null) {
         this.cb.cc = null;
      }

      this.cb = null;
   }

   public void a(bwz $$0) {
      this.cb = $$0;
      this.cb.cc = this;
   }

   public boolean gR() {
      return this.cc != null;
   }

   public boolean gS() {
      return this.cb != null;
   }

   @Nullable
   public bwz gT() {
      return this.cb;
   }

   @Override
   protected double gd() {
      return 2.0;
   }

   @Override
   protected void gG() {
      if (!this.gS() && this.m_()) {
         super.gG();
      }
   }

   @Override
   public boolean gH() {
      return false;
   }

   @Override
   public void a(bjm $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ehh cI() {
      return new ehh(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.m_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends bsa<bwa> {
      public a(bwz $$0) {
         super($$0, bwa.class, 16, false, true, $$0x -> !((bwa)$$0x).s());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bir.a {
      public final bwz.d a;

      b(bwz.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends brz {
      public c(bwz $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwz $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements asu {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwz.d> e = asu.a(bwz.d::values);
      private static final IntFunction<bwz.d> f = aqu.a(bwz.d::a, values(), aqu.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwz.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
