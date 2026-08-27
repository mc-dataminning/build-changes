import javax.annotation.Nullable;

public class bzw extends bpa implements bpd<bzx> {
   public static final double bW = 0.6;
   public static final double bX = 0.8;
   public static final double bY = 1.33;
   private static final cry bZ = cry.a(cpc.qY, cpc.qZ);
   private static final aie<bzx> ca = aih.a(bzw.class, aig.w);
   private static final aie<Boolean> cb = aih.a(bzw.class, aig.k);
   private static final aie<Boolean> cc = aih.a(bzw.class, aig.k);
   private static final aie<Integer> cd = aih.a(bzw.class, aig.b);
   private bzw.a<chh> ce;
   @Nullable
   private bwj cf;
   private float cg;
   private float ch;
   private float ci;
   private float cj;
   private float ck;
   private float cl;

   public bzw(bnu<? extends bzw> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public aiy gm() {
      return this.gn().a();
   }

   @Override
   protected void B() {
      this.cf = new bzw.c(this, 0.6, bZ, true);
      this.bO.a(1, new buv(this));
      this.bO.a(1, new bvu(this, 1.5));
      this.bO.a(2, new bwg(this));
      this.bO.a(3, new bzw.b(this));
      this.bO.a(4, this.cf);
      this.bO.a(5, new buo(this, 1.1, 8));
      this.bO.a(6, new buz(this, 1.0, 10.0F, 5.0F, false));
      this.bO.a(7, new bup(this, 0.8));
      this.bO.a(8, new bvh(this, 0.3F));
      this.bO.a(9, new bvr(this));
      this.bO.a(10, new bun(this, 0.8));
      this.bO.a(11, new bwo(this, 0.8, 1.0000001E-5F));
      this.bO.a(12, new bvj(this, chh.class, 10.0F));
      this.bP.a(1, new bwx<>(this, can.class, false, null));
      this.bP.a(1, new bwx<>(this, cau.class, false, cau.bU));
   }

   public bzx gn() {
      return this.am.b(ca);
   }

   public void a(bzx $$0) {
      this.am.b(ca, $$0);
   }

   public void A(boolean $$0) {
      this.am.b(cb, $$0);
   }

   public boolean go() {
      return this.am.b(cb);
   }

   public void B(boolean $$0) {
      this.am.b(cc, $$0);
   }

   public boolean gp() {
      return this.am.b(cc);
   }

   public cnn gq() {
      return cnn.a(this.am.b(cd));
   }

   public void a(cnn $$0) {
      this.am.b(cd, $$0.a());
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, kf.ak.e(bzx.b));
      this.am.a(cb, false);
      this.am.a(cc, false);
      this.am.a(cd, cnn.o.a());
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      $$0.a("variant", kf.ak.b(this.gn()).toString());
      $$0.a("CollarColor", (byte)this.gq().a());
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      bzx $$1 = kf.ak.a(aiy.a($$0.l("variant")));
      if ($$1 != null) {
         this.a($$1);
      }

      if ($$0.b("CollarColor", 99)) {
         this.a(cnn.a($$0.h("CollarColor")));
      }
   }

   @Override
   public void aa() {
      if (this.K().b()) {
         double $$0 = this.K().c();
         if ($$0 == 0.6) {
            this.b(bor.f);
            this.g(false);
         } else if ($$0 == 1.33) {
            this.b(bor.a);
            this.g(true);
         } else {
            this.b(bor.a);
            this.g(false);
         }
      } else {
         this.b(bor.a);
         this.g(false);
      }
   }

   @Nullable
   @Override
   protected atj y() {
      if (this.u()) {
         if (this.gk()) {
            return atk.dO;
         } else {
            return this.af.a(4) == 0 ? atk.dP : atk.dH;
         }
      } else {
         return atk.dI;
      }
   }

   @Override
   public int Q() {
      return 120;
   }

   public void gr() {
      this.b(atk.dL);
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.dN;
   }

   @Override
   protected atj n_() {
      return atk.dJ;
   }

   public static bpk.a gs() {
      return boi.C().a(bpl.n, 10.0).a(bpl.o, 0.3F).a(bpl.c, 3.0);
   }

   @Override
   protected void a(chh $$0, blt $$1, coz $$2) {
      if (this.m($$2)) {
         this.a(atk.dK, 1.0F, 1.0F);
      }

      super.a($$0, $$1, $$2);
   }

   private float gt() {
      return (float)this.g(bpl.c);
   }

   @Override
   public boolean B(bno $$0) {
      return $$0.a(this.dN().b((bog)this), this.gt());
   }

   @Override
   public void l() {
      super.l();
      if (this.cf != null && this.cf.i() && !this.u() && this.ag % 100 == 0) {
         this.a(atk.dM, 1.0F, 1.0F);
      }

      this.gu();
   }

   private void gu() {
      if ((this.go() || this.gp()) && this.ag % 5 == 0) {
         this.a(atk.dO, 0.6F + 0.4F * (this.af.i() - this.af.i()), 1.0F);
      }

      this.gv();
      this.gw();
   }

   private void gv() {
      this.ch = this.cg;
      this.cj = this.ci;
      if (this.go()) {
         this.cg = Math.min(1.0F, this.cg + 0.15F);
         this.ci = Math.min(1.0F, this.ci + 0.08F);
      } else {
         this.cg = Math.max(0.0F, this.cg - 0.22F);
         this.ci = Math.max(0.0F, this.ci - 0.13F);
      }
   }

   private void gw() {
      this.cl = this.ck;
      if (this.gp()) {
         this.ck = Math.min(1.0F, this.ck + 0.1F);
      } else {
         this.ck = Math.max(0.0F, this.ck - 0.13F);
      }
   }

   public float E(float $$0) {
      return awh.i($$0, this.ch, this.cg);
   }

   public float F(float $$0) {
      return awh.i($$0, this.cj, this.ci);
   }

   public float G(float $$0) {
      return awh.i($$0, this.cl, this.ck);
   }

   @Nullable
   public bzw b(aov $$0, bnj $$1) {
      bzw $$2 = bnu.o.a((cvn)$$0);
      if ($$2 != null && $$1 instanceof bzw $$3) {
         if (this.af.h()) {
            $$2.a(this.gn());
         } else {
            $$2.a($$3.gn());
         }

         if (this.u()) {
            $$2.b(this.d());
            $$2.x(true);
            if (this.af.h()) {
               $$2.a(this.gq());
            } else {
               $$2.a($$3.gq());
            }
         }
      }

      return $$2;
   }

   @Override
   public boolean a(bzt $$0) {
      if (!this.u()) {
         return false;
      } else {
         return !($$0 instanceof bzw $$1) ? false : $$1.u() && super.a($$0);
      }
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      boolean $$5 = $$0.ap() > 0.9F;
      auo<bzx> $$6 = $$5 ? aua.b : aua.a;
      kf.ak.a($$6, $$0.F_()).ifPresent($$0x -> this.a((bzx)$$0x.a()));
      aov $$7 = $$0.E();
      if ($$7.a().a(this.dm(), auk.n).b()) {
         this.a(kf.ak.e(bzx.k));
         this.fL();
      }

      return $$3;
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      cou $$3 = $$2.d();
      if (this.dM().B) {
         if (this.u() && this.j($$0)) {
            return blu.a;
         } else {
            return !this.m($$2) || !(this.ew() < this.eN()) && this.u() ? blu.d : blu.a;
         }
      } else {
         if (this.u()) {
            if (this.j($$0)) {
               if (!($$3 instanceof cno)) {
                  if ($$3.t() && this.m($$2) && this.ew() < this.eN()) {
                     this.a($$0, $$1, $$2);
                     this.c((float)$$3.u().a());
                     return blu.b;
                  }

                  blu $$5 = super.b($$0, $$1);
                  if (!$$5.a() || this.o_()) {
                     this.z(!this.gg());
                  }

                  return $$5;
               }

               cnn $$4 = ((cno)$$3).d();
               if ($$4 != this.gq()) {
                  this.a($$4);
                  if (!$$0.fU().d) {
                     $$2.h(1);
                  }

                  this.fL();
                  return blu.b;
               }
            }
         } else if (this.m($$2)) {
            this.a($$0, $$1, $$2);
            if (this.af.a(3) == 0) {
               this.f($$0);
               this.z(true);
               this.dM().a(this, (byte)7);
            } else {
               this.dM().a(this, (byte)6);
            }

            this.fL();
            return blu.b;
         }

         blu $$6 = super.b($$0, $$1);
         if ($$6.a()) {
            this.fL();
         }

         return $$6;
      }
   }

   @Override
   public boolean m(coz $$0) {
      return bZ.a($$0);
   }

   @Override
   public boolean h(double $$0) {
      return !this.u() && this.ag > 2400;
   }

   @Override
   protected void w() {
      if (this.ce == null) {
         this.ce = new bzw.a<>(this, chh.class, 16.0F, 0.8, 1.33);
      }

      this.bO.a(this.ce);
      if (!this.u()) {
         this.bO.a(4, this.ce);
      }
   }

   @Override
   public boolean bT() {
      return this.bX() || super.bT();
   }

   static class a<T extends bog> extends bui<T> {
      private final bzw i;

      public a(bzw $$0, Class<T> $$1, float $$2, double $$3, double $$4) {
         super($$0, $$1, $$2, $$3, $$4, bnt.e::test);
         this.i = $$0;
      }

      @Override
      public boolean a() {
         return !this.i.u() && super.a();
      }

      @Override
      public boolean b() {
         return !this.i.u() && super.b();
      }
   }

   static class b extends bvb {
      private final bzw a;
      @Nullable
      private chh b;
      @Nullable
      private hz c;
      private int d;

      public b(bzw $$0) {
         this.a = $$0;
      }

      @Override
      public boolean a() {
         if (!this.a.u()) {
            return false;
         } else if (this.a.gg()) {
            return false;
         } else {
            bog $$0 = this.a.R_();
            if ($$0 instanceof chh) {
               this.b = (chh)$$0;
               if (!$$0.fD()) {
                  return false;
               }

               if (this.a.f((bno)this.b) > 100.0) {
                  return false;
               }

               hz $$1 = this.b.dm();
               dlf $$2 = this.a.dM().a_($$1);
               if ($$2.a(atz.R)) {
                  this.c = $$2.d(cyh.aE).map($$1x -> $$1.a($$1x.g())).orElseGet(() -> new hz($$1));
                  return !this.h();
               }
            }

            return false;
         }
      }

      private boolean h() {
         for (bzw $$1 : this.a.dM().a(bzw.class, new enn(this.c).g(2.0))) {
            if ($$1 != this.a && ($$1.go() || $$1.gp())) {
               return true;
            }
         }

         return false;
      }

      @Override
      public boolean b() {
         return this.a.u() && !this.a.gg() && this.b != null && this.b.fD() && this.c != null && !this.h();
      }

      @Override
      public void c() {
         if (this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
         }
      }

      @Override
      public void d() {
         this.a.A(false);
         float $$0 = this.a.dM().f(1.0F);
         if (this.b.fX() >= 100 && (double)$$0 > 0.77 && (double)$$0 < 0.8 && (double)this.a.dM().F_().i() < 0.7) {
            this.i();
         }

         this.d = 0;
         this.a.B(false);
         this.a.N().n();
      }

      private void i() {
         awo $$0 = this.a.eh();
         hz.a $$1 = new hz.a();
         $$1.g(this.a.fU() ? this.a.fV().dm() : this.a.dm());
         this.a.b((double)($$1.u() + $$0.a(11) - 5), (double)($$1.v() + $$0.a(5) - 2), (double)($$1.w() + $$0.a(11) - 5), false);
         $$1.g(this.a.dm());
         ejd $$2 = this.a.dM().o().aJ().getLootTable(eit.aw);
         ejb $$3 = new ejb.a((aov)this.a.dM()).a(elg.f, this.a.dk()).a(elg.a, this.a).a(elf.i);

         for (coz $$5 : $$2.a($$3)) {
            this.a
               .dM()
               .b(
                  new cds(
                     this.a.dM(),
                     (double)$$1.u() - (double)awh.a(this.a.aU * (float) (Math.PI / 180.0)),
                     (double)$$1.v(),
                     (double)$$1.w() + (double)awh.b(this.a.aU * (float) (Math.PI / 180.0)),
                     $$5
                  )
               );
         }
      }

      @Override
      public void e() {
         if (this.b != null && this.c != null) {
            this.a.y(false);
            this.a.N().a((double)this.c.u(), (double)this.c.v(), (double)this.c.w(), 1.1F);
            if (this.a.f((bno)this.b) < 2.5) {
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

   static class c extends bwj {
      @Nullable
      private chh c;
      private final bzw d;

      public c(bzw $$0, double $$1, cry $$2, boolean $$3) {
         super($$0, $$1, $$2, $$3);
         this.d = $$0;
      }

      @Override
      public void e() {
         super.e();
         if (this.c == null && this.a.eh().a(this.a(600)) == 0) {
            this.c = this.b;
         } else if (this.a.eh().a(this.a(500)) == 0) {
            this.c = null;
         }
      }

      @Override
      protected boolean h() {
         return this.c != null && this.c.equals(this.b) ? false : super.h();
      }

      @Override
      public boolean a() {
         return super.a() && !this.d.u();
      }
   }
}
