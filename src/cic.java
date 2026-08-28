import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cic extends chy implements bve<cic.d>, ckz {
   private static final int bZ = 5;
   private static final akg<Integer> ca = akk.a(cic.class, aki.b);
   private static final akg<Integer> cb = akk.a(cic.class, aki.b);
   private static final btm cd = btq.an.n().a(btl.a().a(btk.a, 0.0F, btq.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean ce;
   @Nullable
   private cic cf;
   @Nullable
   private cic cg;

   public cic(btq<? extends cic> $$0, dds $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gr() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(ca, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azk $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gs() {
      return this.am.a(ca);
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      $$0.a("Variant", this.gB().g);
      $$0.a("Strength", this.gs());
   }

   @Override
   public void a(uf $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cic.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bT.a(0, new caw(this));
      this.bT.a(1, new ccg(this, 1.2));
      this.bT.a(2, new cbj(this, 2.1F));
      this.bT.a(3, new ccb(this, 1.25, 40, 20.0F));
      this.bT.a(3, new cbv(this, 1.2));
      this.bT.a(4, new cao(this, 1.0));
      this.bT.a(5, new cck(this, 1.25, $$0 -> $$0.a(axb.ao), false));
      this.bT.a(6, new cbb(this, 1.0));
      this.bT.a(7, new ccp(this, 0.7));
      this.bT.a(8, new cbk(this, cnp.class, 6.0F));
      this.bT.a(9, new cbx(this));
      this.bU.a(1, new cic.c(this));
      this.bU.a(2, new cic.a(this));
   }

   public static bvl.a gA() {
      return q();
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(ca, 0);
      $$0.a(cb, 0);
   }

   public cic.d gB() {
      return cic.d.a(this.am.a(cb));
   }

   public void a(cic.d $$0) {
      this.am.a(cb, $$0.g);
   }

   @Override
   public boolean p(cvl $$0) {
      return $$0.a(axb.an);
   }

   @Override
   protected boolean a(cnp $$0, cvl $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cvo.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dgx.ij.r())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gF() && this.g() == 0 && this.gv()) {
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

      if ($$3 > 0 && ($$5 || !this.gF()) && this.gL() < this.gR()) {
         $$5 = true;
         if (!this.dS().B) {
            this.v($$3);
         }
      }

      if ($$5 && !this.ba()) {
         awc $$6 = this.gq();
         if ($$6 != null) {
            this.dS().a(null, this.dx(), this.dz(), this.dD(), this.gq(), this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean ff() {
      return this.eB() || this.gI();
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      azk $$4 = $$0.C_();
      this.b($$4);
      cic.d $$5;
      if ($$3 instanceof cic.b) {
         $$5 = ((cic.b)$$3).a;
      } else {
         $$5 = ad.a(cic.d.values(), $$4);
         $$3 = new cic.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   protected awc gP() {
      return awd.oa;
   }

   @Override
   protected awc w() {
      return awd.nZ;
   }

   @Override
   protected awc d(bsb $$0) {
      return awd.oe;
   }

   @Override
   protected awc n_() {
      return awd.oc;
   }

   @Nullable
   @Override
   protected awc gq() {
      return awd.od;
   }

   @Override
   protected void b(je $$0, dua $$1) {
      this.a(awd.og, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awd.ob, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ae_() {
      return this.t() ? this.gs() : 0;
   }

   @Override
   public boolean e(btr $$0) {
      return true;
   }

   @Override
   public boolean m(cvl $$0) {
      return $$0.a(axb.g);
   }

   @Override
   public boolean f() {
      return false;
   }

   @Nullable
   private static cue o(cvl $$0) {
      dgv $$1 = dgv.a($$0.h());
      return $$1 instanceof dqr ? ((dqr)$$1).b() : null;
   }

   @Nullable
   public cue gC() {
      return o(this.a(btr.g));
   }

   @Override
   public int gR() {
      return 30;
   }

   @Override
   public boolean a(cfv $$0) {
      return $$0 != this && $$0 instanceof cic && this.gY() && ((cic)$$0).gY();
   }

   @Nullable
   public cic b(arg $$0, btc $$1) {
      cic $$2 = this.gD();
      if ($$2 != null) {
         this.a($$1, $$2);
         cic $$3 = (cic)$$1;
         int $$4 = this.af.a(Math.max(this.gs(), $$3.gs())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gB() : $$3.gB());
      }

      return $$2;
   }

   @Nullable
   protected cic gD() {
      return btq.an.a(this.dS(), btp.e);
   }

   private void k(buf $$0) {
      coh $$1 = new coh(this.dS(), this);
      double $$2 = $$0.dx() - this.dx();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dz();
      double $$4 = $$0.dD() - this.dD();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dS() instanceof arg $$6) {
         coi.a($$1, $$6, cvl.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.ba()) {
         this.dS().a(null, this.dx(), this.dz(), this.dD(), awd.of, this.di(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.ce = true;
   }

   void E(boolean $$0) {
      this.ce = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsb $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.bX()) {
               for (btj $$4 : this.da()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eM();
         return true;
      }
   }

   public void gE() {
      if (this.cf != null) {
         this.cf.cg = null;
      }

      this.cf = null;
   }

   public void a(cic $$0) {
      this.cf = $$0;
      this.cf.cg = this;
   }

   public boolean hb() {
      return this.cg != null;
   }

   public boolean hc() {
      return this.cf != null;
   }

   @Nullable
   public cic hd() {
      return this.cf;
   }

   @Override
   protected double gn() {
      return 2.0;
   }

   @Override
   protected void gS() {
      if (!this.hc() && this.o_()) {
         super.gS();
      }
   }

   @Override
   public boolean gT() {
      return false;
   }

   @Override
   public void a(buf $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public eye cQ() {
      return new eye(0.0, 0.75 * (double)this.cP(), (double)this.dn() * 0.5);
   }

   @Override
   public btm e(bur $$0) {
      return this.o_() ? cd : super.e($$0);
   }

   @Override
   protected eye a(btj $$0, btm $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends ccv<cgy> {
      public a(cic $$0) {
         super($$0, cgy.class, 16, false, true, $$0x -> !((cgy)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends btc.a {
      public final cic.d a;

      b(cic.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends ccu {
      public c(cic $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cic $$0 && $$0.ce) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements azy {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cic.d> e = azy.a(cic.d::values);
      private static final IntFunction<cic.d> f = axt.a(cic.d::a, values(), axt.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cic.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
