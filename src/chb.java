import java.util.Optional;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class chb extends bwe implements bwh<jq<chc>> {
   public static final double cc = 0.6;
   public static final double cd = 0.8;
   public static final double ce = 1.33;
   private static final akm<jq<chc>> cf = akq.a(chb.class, ako.x);
   private static final akm<Boolean> cg = akq.a(chb.class, ako.k);
   private static final akm<Boolean> ch = akq.a(chb.class, ako.k);
   private static final akm<Integer> ci = akq.a(chb.class, ako.b);
   private static final ali<chc> cj = chc.c;
   @Nullable
   private chb.a<cou> ck;
   @Nullable
   private cdn cl;
   private float cm;
   private float cn;
   private float co;
   private float cp;
   private boolean cq;
   private float cr;
   private float cs;

   public chb(bus<? extends chb> $$0, dfm $$1) {
      super($$0, $$1);
      this.gE();
   }

   @Override
   protected void B() {
      this.cl = new chb.c(this, 0.6, $$0 -> $$0.a(axl.ai), true);
      this.bS.a(1, new cbz(this));
      this.bS.a(1, new bwe.a(1.5));
      this.bS.a(2, new cdk(this));
      this.bS.a(3, new chb.b(this));
      this.bS.a(4, this.cl);
      this.bS.a(5, new cbs(this, 1.1, 8));
      this.bS.a(6, new ccd(this, 1.0, 10.0F, 5.0F));
      this.bS.a(7, new cbt(this, 0.8));
      this.bS.a(8, new ccl(this, 0.3F));
      this.bS.a(9, new ccv(this));
      this.bS.a(10, new cbr(this, 0.8));
      this.bS.a(11, new cds(this, 0.8, 1.0000001E-5F));
      this.bS.a(12, new ccn(this, cou.class, 10.0F));
      this.bT.a(1, new ceb<>(this, chs.class, false, null));
      this.bT.a(1, new ceb<>(this, chz.class, false, chz.bY));
   }

   public jq<chc> gy() {
      return this.al.a(cf);
   }

   public void j(jq<chc> $$0) {
      this.al.a(cf, $$0);
   }

   public void A(boolean $$0) {
      this.al.a(cg, $$0);
   }

   public boolean gz() {
      return this.al.a(cg);
   }

   void B(boolean $$0) {
      this.al.a(ch, $$0);
   }

   boolean gF() {
      return this.al.a(ch);
   }

   public cvj gA() {
      return cvj.a(this.al.a(ci));
   }

   private void a(cvj $$0) {
      this.al.a(ci, $$0.a());
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(cf, lz.ai.b(cj));
      $$0.a(cg, false);
      $$0.a(ch, false);
      $$0.a(ci, cvj.o.a());
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      $$0.a("variant", this.gy().e().orElse(cj).a().toString());
      $$0.a("CollarColor", (byte)this.gA().a());
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      Optional.ofNullable(alj.c($$0.l("variant"))).map($$0x -> ali.a(ma.l, $$0x)).flatMap(lz.ai::a).ifPresent(this::j);
      if ($$0.b("CollarColor", 99)) {
         this.a(cvj.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void a(arp $$0) {
      if (this.I().b()) {
         double $$1 = this.I().c();
         if ($$1 == 0.6) {
            this.b(bvt.f);
            this.h(false);
         } else if ($$1 == 1.33) {
            this.b(bvt.a);
            this.h(true);
         } else {
            this.b(bvt.a);
            this.h(false);
         }
      } else {
         this.b(bvt.a);
         this.h(false);
      }
   }

   @Nullable
   @Override
   protected awm t() {
      if (this.n()) {
         if (this.gw()) {
            return awn.dY;
         } else {
            return this.ae.a(4) == 0 ? awn.dZ : awn.dR;
         }
      } else {
         return awn.dS;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gB() {
      this.b(awn.dV);
   }

   @Override
   protected awm e(btb $$0) {
      return awn.dX;
   }

   @Override
   protected awm n_() {
      return awn.dT;
   }

   public static bwo.a gC() {
      return cgy.gr().a(bwp.s, 10.0).a(bwp.v, 0.3F).a(bwp.c, 3.0);
   }

   @Override
   protected void gs() {
      this.a(awn.dU, 1.0F, 1.0F);
   }

   @Override
   public void h() {
      super.h();
      if (this.cl != null && this.cl.i() && !this.n() && this.af % 100 == 0) {
         this.a(awn.dW, 1.0F, 1.0F);
      }

      this.gG();
   }

   private void gG() {
      if ((this.gz() || this.gF()) && this.af % 5 == 0) {
         this.a(awn.dY, 0.6F + 0.4F * (this.ae.i() - this.ae.i()), 1.0F);
      }

      this.gH();
      this.gI();
      this.cq = false;
      if (this.gz()) {
         jh $$0 = this.dv();

         for (cou $$2 : this.dV().a(cou.class, new ezt($$0).c(2.0, 2.0, 2.0))) {
            if ($$2.fP()) {
               this.cq = true;
               break;
            }
         }
      }
   }

   public boolean gD() {
      return this.cq;
   }

   private void gH() {
      this.cn = this.cm;
      this.cp = this.co;
      if (this.gz()) {
         this.cm = Math.min(1.0F, this.cm + 0.15F);
         this.co = Math.min(1.0F, this.co + 0.08F);
      } else {
         this.cm = Math.max(0.0F, this.cm - 0.22F);
         this.co = Math.max(0.0F, this.co - 0.13F);
      }
   }

   private void gI() {
      this.cs = this.cr;
      if (this.gF()) {
         this.cr = Math.min(1.0F, this.cr + 0.1F);
      } else {
         this.cr = Math.max(0.0F, this.cr - 0.13F);
      }
   }

   public float J(float $$0) {
      return azm.h($$0, this.cn, this.cm);
   }

   public float K(float $$0) {
      return azm.h($$0, this.cp, this.co);
   }

   public float L(float $$0) {
      return azm.h($$0, this.cs, this.cr);
   }

   @Nullable
   public chb b(arp $$0, buc $$1) {
      chb $$2 = bus.u.a($$0, bur.e);
      if ($$2 != null && $$1 instanceof chb $$3) {
         if (this.ae.h()) {
            $$2.j(this.gy());
         } else {
            $$2.j($$3.gy());
         }

         if (this.n()) {
            $$2.b(this.Z_());
            $$2.b(true, true);
            if (this.ae.h()) {
               $$2.a(this.gA());
            } else {
               $$2.a($$3.gA());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(cgy $$0) {
      if (!this.n()) {
         return false;
      } else {
         return !($$0 instanceof chb $$1) ? false : $$1.n() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      boolean $$4 = $$0.ap() > 0.9F;
      axs<chc> $$5 = $$4 ? axd.b : axd.a;
      lz.ai.a($$5, $$0.G_()).ifPresent(this::j);
      arp $$6 = $$0.a();
      if ($$6.b().a(this.dv(), axo.o).b()) {
         this.j(lz.ai.b(chc.l));
         this.ai();
      }

      return $$3;
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      cwi $$3 = $$2.h();
      if (this.n()) {
         if (this.j($$0)) {
            if ($$3 instanceof cvk $$4) {
               cvj $$5 = $$4.b();
               if ($$5 != this.gA()) {
                  if (!this.dV().A_()) {
                     this.a($$5);
                     $$2.a(1, $$0);
                     this.ai();
                  }

                  return bsk.a;
               }
            } else if (this.j($$2) && this.eD() < this.eR()) {
               if (!this.dV().A_()) {
                  this.a($$0, $$1, $$2);
                  crw $$6 = $$2.a(ku.w);
                  this.c($$6 != null ? (float)$$6.a() : 1.0F);
                  this.gs();
               }

               return bsk.a;
            }

            bsk $$7 = super.b($$0, $$1);
            if (!$$7.a()) {
               this.z(!this.gm());
               return bsk.a;
            }

            return $$7;
         }
      } else if (this.j($$2)) {
         if (!this.dV().A_()) {
            this.a($$0, $$1, $$2);
            this.g($$0);
            this.ai();
            this.gs();
         }

         return bsk.a;
      }

      bsk $$8 = super.b($$0, $$1);
      if ($$8.a()) {
         this.ai();
      }

      return $$8;
   }

   @Override
   public boolean j(cwm $$0) {
      return $$0.a(axl.ai);
   }

   @Override
   public boolean h(double $$0) {
      return !this.n() && this.af > 2400;
   }

   @Override
   public void b(boolean $$0, boolean $$1) {
      super.b($$0, $$1);
      this.gE();
   }

   protected void gE() {
      if (this.ck == null) {
         this.ck = new chb.a<>(this, cou.class, 16.0F, 0.8, 1.33);
      }

      this.bS.a(this.ck);
      if (!this.n()) {
         this.bS.a(4, this.ck);
      }
   }

   private void g(cou $$0) {
      if (this.ae.a(3) == 0) {
         this.a($$0);
         this.z(true);
         this.dV().a(this, (byte)7);
      } else {
         this.dV().a(this, (byte)6);
      }
   }

   @Override
   public boolean ce() {
      return this.ci() || super.ce();
   }

   static class a<T extends bvh> extends cbm<T> {
      private final chb i;

      public a(chb $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, buq.e::test);
         this.i = $$0;
      }

      @Override
      public boolean b() {
         return !this.i.n() && super.b();
      }

      @Override
      public boolean c() {
         return !this.i.n() && super.c();
      }
   }

   static class b extends ccf {
      private final chb a;
      @Nullable
      private cou b;
      @Nullable
      private jh c;
      private int d;

      public b(chb $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         if (!this.a.n()) {
            return false;
         } else if (this.a.gm()) {
            return false;
         } else {
            bvh $$0 = this.a.ag_();
            if ($$0 instanceof cou) {
               this.b = (cou)$$0;
               if (!$$0.fP()) {
                  return false;
               }

               if (this.a.g(this.b) > 100.0) {
                  return false;
               }

               jh $$1 = this.b.dv();
               dvv $$2 = this.a.dV().a_($$1);
               if ($$2.a(axc.S)) {
                  this.c = $$2.d(dij.aF).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new jh($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (chb $$1 : this.a.dV().a(chb.class, new ezt(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.gz() || $$1.gF())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean c() {
         return this.a.n() && !this.a.gm() && this.b != null && this.b.fP() && this.c != null && !this.h();
      }

      @Override
      public void d() {
         if (this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void e() {
         this.a.A(false);
         float $$0 = this.a.dV().f(1.0F);
         if (this.b.gl() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dV().G_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.L().o();
      }

      private void i() {
         azu $$0 = this.a.dY();
         jh.a $$1 = new jh.a();
         $$1.g(this.a.N_() ? this.a.A().dv() : this.a.dv());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dv());
         this.a
            .a(
               a(this.a),
               euj.aq,
               ($$1x, $$2) -> $$1x.b(
                     new clc(
                        $$1x,
                        (double)$$1.u() - (double)azm.a(this.a.aW * (float) (Math.PI / 180.0)),
                        (double)$$1.v(),
                        (double)$$1.w() + (double)azm.b(this.a.aW * (float) (Math.PI / 180.0)),
                        $$2
                     )
                  )
            );
      }

      @Override
      public void a() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.L().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.g(this.b) < 2.5) {
               this.d++;
               if (this.d > this.a(16)) {
                  this.a.A(true);
                  this.a.B(false);
               } else {
                  this.a.a(this.b, 45.0F, 45.0F);
                  this.a.B(true);
               }
            } else {
               this.a.A(false);
            }
         }
      }
   }

   static class c extends cdn {
      @Nullable
      private cou c;
      private final chb d;

      public c(chb $$0, double $$1, Predicate<cwm> $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void a() {
         super.a();
         if (this.c == null && this.a.dY().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.dY().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean b() {
         return super.b() && !this.d.n();
      }
   }
}
