import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bwo extends bwk implements bjz<bwo.d>, bzh {
   private static final int bU = 5;
   private static final cmb bW = cmb.a(cjd.oI, csr.ij.k());
   private static final aec<Integer> bX = aef.a(bwo.class, aee.b);
   private static final aec<Integer> bY = aef.a(bwo.class, aee.b);
   private static final aec<Integer> bZ = aef.a(bwo.class, aee.b);
   boolean ca;
   @Nullable
   private bwo cb;
   @Nullable
   private bwo cc;

   public bwo(bip<? extends bwo> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public boolean gj() {
      return false;
   }

   private void w(int $$0) {
      this.an.b(bX, Math.max(1, Math.min(5, $$0)));
   }

   private void b(arx $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gk() {
      return this.an.b(bX);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      $$0.a("Variant", this.gm().g);
      $$0.a("Strength", this.gk());
      if (!this.cp.a(1).b()) {
         $$0.a("DecorItem", this.cp.a(1).b(new qu()));
      }
   }

   @Override
   public void a(qu $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(bwo.d.a($$0.h("Variant")));
      if ($$0.b("DecorItem", 10)) {
         this.cp.a(1, cja.a($$0.p("DecorItem")));
      }

      this.gx();
   }

   @Override
   protected void w() {
      this.bO.a(0, new bpq(this));
      this.bO.a(1, new bra(this, 1.2));
      this.bO.a(2, new bqd(this, 2.1F));
      this.bO.a(3, new bqv(this, 1.25, 40, 20.0F));
      this.bO.a(3, new bqp(this, 1.2));
      this.bO.a(4, new bpi(this, 1.0));
      this.bO.a(5, new bre(this, 1.25, cmb.a(cjd.hh), false));
      this.bO.a(6, new bpv(this, 1.0));
      this.bO.a(7, new brj(this, 0.7));
      this.bO.a(8, new bqe(this, cbp.class, 6.0F));
      this.bO.a(9, new bqr(this));
      this.bP.a(1, new bwo.c(this));
      this.bP.a(2, new bwo.a(this));
   }

   public static bkg.a gl() {
      return p().a(bkh.b, 40.0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bX, 0);
      this.an.a(bY, -1);
      this.an.a(bZ, 0);
   }

   public bwo.d gm() {
      return bwo.d.a(this.an.b(bZ));
   }

   public void a(bwo.d $$0) {
      this.an.b(bZ, $$0.g);
   }

   @Override
   protected int U_() {
      return this.q() ? 2 + 3 * this.gi() : super.U_();
   }

   @Override
   public boolean m(cja $$0) {
      return bW.a($$0);
   }

   @Override
   protected boolean a(cbp $$0, cja $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cjd.oI)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(csr.ij.k())) {
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
         this.dK().a(ix.K, this.d(1.0), this.ds() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
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
         aoy $$6 = this.gh();
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
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      arx $$5 = $$0.y_();
      this.b($$5);
      bwo.d $$6;
      if ($$3 instanceof bwo.b) {
         $$6 = ((bwo.b)$$3).a;
      } else {
         $$6 = ac.a(bwo.d.values(), $$5);
         $$3 = new bwo.b($$6);
      }

      this.a($$6);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   protected aoy gz() {
      return aoz.mx;
   }

   @Override
   protected aoy r() {
      return aoz.mw;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.mB;
   }

   @Override
   protected aoy h_() {
      return aoz.mz;
   }

   @Nullable
   @Override
   protected aoy gh() {
      return aoz.mA;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.mD, 0.15F, 1.0F);
   }

   @Override
   protected void ga() {
      this.a(aoz.my, 1.0F, (this.ag.i() - this.ag.i()) * 0.2F + 1.0F);
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
   public boolean l(cja $$0) {
      return $$0.a(apw.g);
   }

   @Override
   public boolean g() {
      return false;
   }

   @Override
   public void a(bgm $$0) {
      cho $$1 = this.gn();
      super.a($$0);
      cho $$2 = this.gn();
      if (this.ah > 20 && $$2 != null && $$2 != $$1) {
         this.a(aoz.mE, 0.5F, 1.0F);
      }
   }

   @Override
   protected void gx() {
      if (!this.dK().B) {
         super.gx();
         this.a(n(this.cp.a(1)));
      }
   }

   private void a(@Nullable cho $$0) {
      this.an.b(bY, $$0 == null ? -1 : $$0.a());
   }

   @Nullable
   private static cho n(cja $$0) {
      csq $$1 = csq.a($$0.d());
      return $$1 instanceof dce ? ((dce)$$1).a() : null;
   }

   @Nullable
   public cho gn() {
      int $$0 = this.an.b(bY);
      return $$0 == -1 ? null : cho.a($$0);
   }

   @Override
   public int gB() {
      return 30;
   }

   @Override
   public boolean a(bum $$0) {
      return $$0 != this && $$0 instanceof bwo && this.gI() && ((bwo)$$0).gI();
   }

   @Nullable
   public bwo b(akn $$0, big $$1) {
      bwo $$2 = this.go();
      if ($$2 != null) {
         this.a($$1, $$2);
         bwo $$3 = (bwo)$$1;
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
   protected bwo go() {
      return bip.aj.a(this.dK());
   }

   private void k(bjb $$0) {
      ccg $$1 = new ccg(this.dK(), this);
      double $$2 = $$0.dp() - this.dp();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dr();
      double $$4 = $$0.dv() - this.dv();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      $$1.c($$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      if (!this.aS()) {
         this.dK().a(null, this.dp(), this.dr(), this.dv(), aoz.mC, this.da(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
      }

      this.dK().b($$1);
      this.ca = true;
   }

   void D(boolean $$0) {
      this.ca = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bhj $$2) {
      int $$3 = this.d($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bO()) {
               for (bil $$4 : this.cT()) {
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

   public void a(bwo $$0) {
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
   public bwo gP() {
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
   public void a(bjb $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ehi cI() {
      return new ehi(0.0, 0.75 * (double)this.cH(), (double)this.df() * 0.5);
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b - (this.i_() ? 0.8125F : 0.5F) * $$2, -0.3F * $$2);
   }

   static class a extends brp<bvp> {
      public a(bwo $$0) {
         super($$0, bvp.class, 16, false, true, $$0x -> !((bvp)$$0x).p());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends big.a {
      public final bwo.d a;

      b(bwo.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends bro {
      public c(bwo $$0) {
         super($$0);
      }

      @Override
      public boolean b() {
         if (this.e instanceof bwo $$0 && $$0.ca) {
            $$0.D(false);
            return false;
         }

         return super.b();
      }
   }

   public static enum d implements ask {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<bwo.d> e = ask.a(bwo.d::values);
      private static final IntFunction<bwo.d> f = aqn.a(bwo.d::a, values(), aqn.a.c);
      final int g;
      private final String h;

      private d(int $$0, String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bwo.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
