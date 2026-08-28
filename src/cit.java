import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cit extends cip implements bvv<cit.d>, clq {
   private static final int bY = 5;
   private static final akk<Integer> bZ = ako.a(cit.class, akm.b);
   private static final akk<Integer> ca = ako.a(cit.class, akm.b);
   private static final buc cc = bug.an.n().a(bub.a().a(bua.a, 0.0F, bug.an.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cit ce;
   @Nullable
   private cit cf;

   public cit(bug<? extends cit> $$0, dev $$1) {
      super($$0, $$1);
      this.P().a(40.0F);
   }

   public boolean gy() {
      return false;
   }

   private void x(int $$0) {
      this.am.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azr $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.x(1 + $$0.a($$1));
   }

   public int gz() {
      return this.am.a(bZ);
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Variant", this.gI().g);
      $$0.a("Strength", this.gz());
   }

   @Override
   public void a(uj $$0) {
      this.x($$0.h("Strength"));
      super.a($$0);
      this.a(cit.d.a($$0.h("Variant")));
   }

   @Override
   protected void D() {
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccx(this, 1.2));
      this.bS.a(2, new cca(this, 2.1F));
      this.bS.a(3, new ccs(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccm(this, 1.2));
      this.bS.a(4, new cbf(this, 1.0));
      this.bS.a(5, new cdb(this, 1.25, $$0 -> $$0.a(axi.ap), false));
      this.bS.a(6, new cbs(this, 1.0));
      this.bS.a(7, new cdg(this, 0.7));
      this.bS.a(8, new ccb(this, coh.class, 6.0F));
      this.bS.a(9, new cco(this));
      this.bT.a(1, new cit.c(this));
      this.bT.a(2, new cit.a(this));
   }

   public static bwc.a gH() {
      return q();
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cit.d gI() {
      return cit.d.a(this.am.a(ca));
   }

   public void a(cit.d $$0) {
      this.am.a(ca, $$0.g);
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ao);
   }

   @Override
   protected boolean a(coh $$0, cvx $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwb.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dia.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gM() && this.g() == 0 && this.gC()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eG() < this.eV() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.p_() && $$2 > 0) {
         this.dX().a(lq.O, this.d(1.0), this.dF() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dX().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gM()) && this.gS() < this.gY()) {
         $$5 = true;
         if (!this.dX().C) {
            this.v($$3);
         }
      }

      if ($$5 && !this.bc()) {
         awj $$6 = this.gx();
         if ($$6 != null) {
            this.dX().a(null, this.dC(), this.dE(), this.dI(), this.gx(), this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fk() {
      return this.eH() || this.gP();
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      azr $$4 = $$0.E_();
      this.b($$4);
      cit.d $$5;
      if ($$3 instanceof cit.b) {
         $$5 = ((cit.b)$$3).a;
      } else {
         $$5 = ad.a(cit.d.values(), $$4);
         $$3 = new cit.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   protected awj gW() {
      return awk.nY;
   }

   @Override
   protected awj w() {
      return awk.nX;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.oc;
   }

   @Override
   protected awj o_() {
      return awk.oa;
   }

   @Nullable
   @Override
   protected awj gx() {
      return awk.ob;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.oe, 0.15F, 1.0F);
   }

   @Override
   protected void y() {
      this.a(awk.nZ, 1.0F, (this.af.i() - this.af.i()) * 0.2F + 1.0F);
   }

   @Override
   public int ag_() {
      return this.t() ? this.gz() : 0;
   }

   @Override
   public boolean e(buh $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gY() {
      return 30;
   }

   @Override
   public boolean a(cgm $$0) {
      return $$0 != this && $$0 instanceof cit && this.hf() && ((cit)$$0).hf();
   }

   @Nullable
   public cit b(arm $$0, btq $$1) {
      cit $$2 = this.gJ();
      if ($$2 != null) {
         this.a($$1, $$2);
         cit $$3 = (cit)$$1;
         int $$4 = this.af.a(Math.max(this.gz(), $$3.gz())) + 1;
         if (this.af.i() < 0.03F) {
            $$4++;
         }

         $$2.x($$4);
         $$2.a(this.af.h() ? this.gI() : $$3.gI());
      }

      return $$2;
   }

   @Nullable
   protected cit gJ() {
      return bug.an.a(this.dX(), buf.e);
   }

   private void k(buv $$0) {
      cpa $$1 = new cpa(this.dX(), this);
      double $$2 = $$0.dC() - this.dC();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dE();
      double $$4 = $$0.dI() - this.dI();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dX() instanceof arm $$6) {
         cpb.a($$1, $$6, cvx.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bc()) {
         this.dX().a(null, this.dC(), this.dE(), this.dI(), awk.od, this.dn(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, bsp $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.cb()) {
               for (btz $$4 : this.de()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eR();
         return true;
      }
   }

   public void gK() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cit $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gL() {
      return this.cf != null;
   }

   public boolean hi() {
      return this.ce != null;
   }

   @Nullable
   public cit hj() {
      return this.ce;
   }

   @Override
   protected double gu() {
      return 2.0;
   }

   @Override
   protected void gZ() {
      if (!this.hi() && this.p_()) {
         super.gZ();
      }
   }

   @Override
   public boolean ha() {
      return false;
   }

   @Override
   public void a(buv $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ezh cU() {
      return new ezh(0.0, 0.75 * (double)this.cT(), (double)this.ds() * 0.5);
   }

   @Override
   public buc e(bvh $$0) {
      return this.p_() ? cc : super.e($$0);
   }

   @Override
   protected ezh a(btz $$0, buc $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdm<chp> {
      public a(cit $$0) {
         super($$0, chp.class, 16, false, true, $$0x -> !((chp)$$0x).q());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends btq.a {
      public final cit.d a;

      b(cit.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdl {
      public c(cit $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cit $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements baf {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cit.d> e = baf.a(cit.d::values);
      private static final IntFunction<cit.d> f = aya.a(cit.d::a, values(), aya.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cit.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
