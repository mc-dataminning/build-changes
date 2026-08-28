import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cih extends cid implements bvj<cih.d>, cle {
   private static final int bY = 5;
   private static final akg<Integer> bZ = akk.a(cih.class, aki.b);
   private static final akg<Integer> ca = akk.a(cih.class, aki.b);
   private static final btr cc = btv.an.n().a(btq.a().a(btp.a, 0.0F, btv.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cih ce;
   @Nullable
   private cih cf;

   public cih(btv<? extends cih> $$0, deg $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gs() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azl $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gt() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gC().g);
      $$0.a("Strength", this.gt());
   }

   @Override
   public void a(uf $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cih.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbb(this));
      this.bS.a(1, new ccl(this, 1.2));
      this.bS.a(2, new cbo(this, 2.1F));
      this.bS.a(3, new ccg(this, 1.25, 40, 20.0F));
      this.bS.a(3, new cca(this, 1.2));
      this.bS.a(4, new cat(this, 1.0));
      this.bS.a(5, new ccp(this, 1.25, $$0 -> $$0.a(axc.ao), false));
      this.bS.a(6, new cbg(this, 1.0));
      this.bS.a(7, new ccu(this, 0.7));
      this.bS.a(8, new cbp(this, cnu.class, 6.0F));
      this.bS.a(9, new ccc(this));
      this.bT.a(1, new cih.c(this));
      this.bT.a(2, new cih.a(this));
   }

   public static bvq.a gB() {
      return q();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cih.d gC() {
      return cih.d.a(this.am.a(ca));
   }

   public void a(cih.d $$0) {
      this.am.a(ca, $$0.g);
   }

   @Override
   public boolean n(cvp $$0) {
      return $$0.a(axc.an);
   }

   @Override
   protected boolean a(cnu $$0, cvp $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cvt.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dhl.ij.q())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gG() && this.g() == 0 && this.gw()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eA() < this.eQ() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.o_() && $$2 > 0) {
         this.dS().a(ln.O, this.d(1.0), this.dA() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dS().B) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gG()) && this.gM() < this.gS()) {
         $$5 = true;
         if (!this.dS().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.ba()) {
         awd $$6 = this.gr();
         if ($$6 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), this.gr(), this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eB() || this.gJ();
   }

   @Nullable
   @Override
   public bvc a(dew $$0, brn $$1, btu $$2, @Nullable bvc $$3) {
      azl $$4 = $$0.C_();
      this.b($$4);
      cih.d $$5;
      if ($$3 instanceof cih.b) {
         $$5 = ((cih.b)$$3).a;
      } else {
         $$5 = ad.a(cih.d.values(), $$4);
         $$3 = new cih.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   protected awd gQ() {
      return awe.oa;
   }

   @Override
   protected awd w() {
      return awe.nZ;
   }

   @Override
   protected awd d(bsg $$0) {
      return awe.oe;
   }

   @Override
   protected awd n_() {
      return awe.oc;
   }

   @Nullable
   @Override
   protected awd gr() {
      return awe.od;
   }

   @Override
   protected void b(je $$0, duo $$1) {
      this.a(awe.og, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awe.ob, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? this.gt() : 0;
   }

   @Override
   public boolean e(btw $$0) {
      return true;
   }

   @Override
   public boolean k(cvp $$0) {
      return $$0.a(axc.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cuj m(cvp $$0) {
      dhj $$1 = dhj.a($$0.h());
      return $$1 instanceof drf ? ((drf)$$1).b() : null;
   }

   @Nullable
   public cuj gD() {
      return m(this.a(btw.g));
   }

   @Override
   public int gS() {
      return 30;
   }

   @Override
   public boolean a(cga $$0) {
      return $$0 != this && $$0 instanceof cih && this.gZ() && ((cih)$$0).gZ();
   }

   @Nullable
   public cih b(arh $$0, bth $$1) {
      cih $$2 = this.gE();
      if ($$2 != null) {
         this.a($$1, $$2);
         cih $$3 = (cih)$$1;
         int $$4 = this.af.a(Math.max(this.gt(), $$3.gt())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gC() : $$3.gC());
      }

      return $$2;
   }

   @Nullable
   protected cih gE() {
      return btv.an.a(this.dS(), btu.e);
   }

   private void k(buk $$0) {
      com $$1 = new com(this.dS(), this);
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dz();
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arh $$6) {
         coo.a($$1, $$6, cvp.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awe.of, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsg $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bX()) {
               for (bto $$4 : this.da()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eM();
         return true;
      }
   }

   public void gF() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cih $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean hc() {
      return this.cf != null;
   }

   public boolean hd() {
      return this.ce != null;
   }

   @Nullable
   public cih he() {
      return this.ce;
   }

   @Override
   protected double go() {
      return 2.0;
   }

   @Override
   protected void gT() {
      if (!this.hd() && this.o_()) {
         super.gT();
      }
   }

   @Override
   public boolean gU() {
      return false;
   }

   @Override
   public void a(buk $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eys cQ() {
      return new eys(0.0, 0.75 * (double)this.cP(), (double)this.dn() * 0.5);
   }

   @Override
   public btr e(buw $$0) {
      return this.o_() ? cc : super.e($$0);
   }

   @Override
   protected eys a(bto $$0, btr $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cda<chd> {
      public a(cih $$0) {
         super($$0, chd.class, 16, false, true, $$0x -> !((chd)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends bth.a {
      public final cih.d a;

      b(cih.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ccz {
      public c(cih $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cih $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azz {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cih.d> e = azz.a(cih.d::values);
      private static final IntFunction<cih.d> f = axu.a(cih.d::a, values(), axu.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cih.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
