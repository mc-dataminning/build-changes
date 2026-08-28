import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import javax.annotation.Nullable;

public class cjf extends cjb implements bwh<cjf.d>, cmc {
   private static final int bY = 5;
   private static final akm<Integer> bZ = akq.a(cjf.class, ako.b);
   private static final akm<Integer> ca = akq.a(cjf.class, ako.b);
   private static final buo cc = bus.aw.n().a(bun.a().a(bum.a, 0.0F, bus.aw.m() - 0.8125F, -0.3F)).a(0.5F);
   boolean cd;
   @Nullable
   private cjf ce;
   @Nullable
   private cjf cf;

   public cjf(bus<? extends cjf> $$0, dfm $$1) {
      super($$0, $$1);
      this.L().a(40.0F);
   }

   public boolean gp() {
      return false;
   }

   private void w(int $$0) {
      this.al.a(bZ, Math.max(1, Math.min(5, $$0)));
   }

   private void b(azu $$0) {
      int $$1 = $$0.i() < 0.04F ? 5 : 3;
      this.w(1 + $$0.a($$1));
   }

   public int gq() {
      return this.al.a(bZ);
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("Variant", this.gz().g);
      $$0.a("Strength", this.gq());
   }

   @Override
   public void a(ul $$0) {
      this.w($$0.h("Strength"));
      super.a($$0);
      this.a(cjf.d.a($$0.h("Variant")));
   }

   @Override
   protected void B() {
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new cdj(this, 1.2));
      this.bS.a(2, new ccm(this, 2.1F));
      this.bS.a(3, new cde(this, 1.25, 40, 20.0F));
      this.bS.a(3, new ccy(this, 1.2));
      this.bS.a(4, new cbr(this, 1.0));
      this.bS.a(5, new cdn(this, 1.25, $$0 -> $$0.a(axl.as), false));
      this.bS.a(6, new cce(this, 1.0));
      this.bS.a(7, new cds(this, 0.7));
      this.bS.a(8, new ccn(this, cou.class, 6.0F));
      this.bS.a(9, new cda(this));
      this.bT.a(1, new cjf.c(this));
      this.bT.a(2, new cjf.a(this));
   }

   public static bwo.a gy() {
      return n();
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(bZ, 0);
      $$0.a(ca, 0);
   }

   public cjf.d gz() {
      return cjf.d.a(this.al.a(ca));
   }

   public void a(cjf.d $$0) {
      this.al.a(ca, $$0.g);
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ar);
   }

   @Override
   protected boolean a(cou $$0, cwm $$1) {
      int $$2 = 0;
      int $$3 = 0;
      float $$4 = 0.0F;
      boolean $$5 = false;
      if ($$1.a(cwq.px)) {
         $$2 = 10;
         $$3 = 3;
         $$4 = 2.0F;
      } else if ($$1.a(dis.ij.j())) {
         $$2 = 90;
         $$3 = 6;
         $$4 = 10.0F;
         if (this.gD() && this.X_() == 0 && this.gt()) {
            $$5 = true;
            this.f($$0);
         }
      }

      if (this.eD() < this.eR() && $$4 > 0.0F) {
         this.c($$4);
         $$5 = true;
      }

      if (this.e_() && $$2 > 0) {
         this.dV().a(ls.O, this.d(1.0), this.dD() + 0.5, this.g(1.0), 0.0, 0.0, 0.0);
         if (!this.dV().C) {
            this.b_($$2);
         }

         $$5 = true;
      }

      if ($$3 > 0 && ($$5 || !this.gD()) && this.gJ() < this.gP()) {
         $$5 = true;
         if (!this.dV().C) {
            this.u($$3);
         }
      }

      if ($$5 && !this.bb()) {
         awm $$6 = this.go();
         if ($$6 != null) {
            this.dV().a(null, this.dA(), this.dC(), this.dG(), this.go(), this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
         }
      }

      return $$5;
   }

   @Override
   public boolean fg() {
      return this.eE() || this.gG();
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      azu $$4 = $$0.G_();
      this.b($$4);
      cjf.d $$5;
      if ($$3 instanceof cjf.b) {
         $$5 = ((cjf.b)$$3).a;
      } else {
         $$5 = ae.a(cjf.d.values(), $$4);
         $$3 = new cjf.b($$5);
      }

      this.a($$5);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   protected awm gN() {
      return awn.nY;
   }

   @Override
   protected awm t() {
      return awn.nX;
   }

   @Override
   protected awm e(btb $$0) {
      return awn.oc;
   }

   @Override
   protected awm n_() {
      return awn.oa;
   }

   @Nullable
   @Override
   protected awm go() {
      return awn.ob;
   }

   @Override
   protected void b(jh $$0, dvv $$1) {
      this.a(awn.oe, 0.15F, 1.0F);
   }

   @Override
   protected void v() {
      this.a(awn.nZ, 1.0F, (this.ae.i() - this.ae.i()) * 0.2F + 1.0F);
   }

   @Override
   public int af_() {
      return this.q() ? this.gq() : 0;
   }

   @Override
   public boolean e(but $$0) {
      return true;
   }

   @Override
   public boolean f() {
      return false;
   }

   @Override
   public int gP() {
      return 30;
   }

   @Override
   public boolean a(cgy $$0) {
      return $$0 != this && $$0 instanceof cjf && this.gV() && ((cjf)$$0).gV();
   }

   @Nullable
   public cjf b(arp $$0, buc $$1) {
      cjf $$2 = this.gA();
      if ($$2 != null) {
         this.a($$1, $$2);
         cjf $$3 = (cjf)$$1;
         int $$4 = this.ae.a(Math.max(this.gq(), $$3.gq())) + 1;
         if (this.ae.i() < 0.03F) {
            $$4++;
         }

         $$2.w($$4);
         $$2.a(this.ae.h() ? this.gz() : $$3.gz());
      }

      return $$2;
   }

   @Nullable
   protected cjf gA() {
      return bus.aw.a(this.dV(), bur.e);
   }

   private void k(bvh $$0) {
      cpm $$1 = new cpm(this.dV(), this);
      double $$2 = $$0.dA() - this.dA();
      double $$3 = $$0.e(0.3333333333333333) - $$1.dC();
      double $$4 = $$0.dG() - this.dG();
      double $$5 = Math.sqrt($$2 * $$2 + $$4 * $$4) * 0.2F;
      if (this.dV() instanceof arp $$6) {
         cpn.a($$1, $$6, cwm.k, $$2, $$3 + $$5, $$4, 1.5F, 10.0F);
      }

      if (!this.bb()) {
         this.dV().a(null, this.dA(), this.dC(), this.dG(), awn.od, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
      }

      this.cd = true;
   }

   void E(boolean $$0) {
      this.cd = $$0;
   }

   @Override
   public boolean a(float $$0, float $$1, btb $$2) {
      int $$3 = this.e($$0, $$1);
      if ($$3 <= 0) {
         return false;
      } else {
         if ($$0 >= 6.0F) {
            this.a($$2, (float)$$3);
            if (this.ca()) {
               for (bul $$4 : this.dd()) {
                  $$4.a($$2, (float)$$3);
               }
            }
         }

         this.eN();
         return true;
      }
   }

   public void gB() {
      if (this.ce != null) {
         this.ce.cf = null;
      }

      this.ce = null;
   }

   public void a(cjf $$0) {
      this.ce = $$0;
      this.ce.cf = this;
   }

   public boolean gC() {
      return this.cf != null;
   }

   public boolean gY() {
      return this.ce != null;
   }

   @Nullable
   public cjf gZ() {
      return this.ce;
   }

   @Override
   protected double gl() {
      return 2.0;
   }

   @Override
   protected void g(arp $$0) {
      if (!this.gY() && this.e_()) {
         super.g($$0);
      }
   }

   @Override
   public boolean gQ() {
      return false;
   }

   @Override
   public void a(bvh $$0, float $$1) {
      this.k($$0);
   }

   @Override
   public ezy cT() {
      return new ezy(0.0, 0.75 * (double)this.cS(), (double)this.dq() * 0.5);
   }

   @Override
   public buo e(bvt $$0) {
      return this.e_() ? cc : super.e($$0);
   }

   @Override
   protected ezy a(bul $$0, buo $$1, float $$2) {
      return a(this, $$0, $$1.d());
   }

   static class a extends cdy<cib> {
      public a(cjf $$0) {
         super($$0, cib.class, 16, false, true, ($$0x, $$1) -> !((cib)$$0x).n());
      }

      @Override
      protected double l() {
         return super.l() * 0.25;
      }
   }

   static class b extends buc.a {
      public final cjf.d a;

      b(cjf.d $$0) {
         super(true);
         this.a = $$0;
      }
   }

   static class c extends cdx {
      public c(cjf $$0) {
         super($$0);
      }

      @Override
      public boolean c() {
         if (this.e instanceof cjf $$0 && $$0.cd) {
            $$0.E(false);
            return false;
         }

         return super.c();
      }
   }

   public static enum d implements bai {
      a(0, "creamy"),
      b(1, "white"),
      c(2, "brown"),
      d(3, "gray");

      public static final Codec<cjf.d> e = bai.a(cjf.d::values);
      private static final IntFunction<cjf.d> f = ayd.a(cjf.d::a, values(), ayd.a.c);
      final int g;
      private final String h;

      private d(final int $$0, final String $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.g;
      }

      public static cjf.d a(int $$0) {
         return f.apply($$0);
      }

      @Override
      public String c() {
         return this.h;
      }
   }
}
