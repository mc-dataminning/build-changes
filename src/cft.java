import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cft extends cam implements bou, bpm {
   private static final UUID bV = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bqc bW = new bqc(bV, "Strider suffocating modifier", -0.34F, bqc.a.b);
   private static final float bY = 0.35F;
   private static final float bZ = 0.55F;
   private static final csp ca = csp.a(cpt.dC);
   private static final csp cb = csp.a(cpt.dC, cpt.nR);
   private static final aii<Integer> cc = ail.a(cft.class, aik.b);
   private static final aii<Boolean> cd = ail.a(cft.class, aik.k);
   private static final aii<Boolean> ce = ail.a(cft.class, aik.k);
   private final bot cf = new bot(this.am, cc, ce);
   @Nullable
   private bxc cg;

   public cft(bol<? extends cft> $$0, cwe $$1) {
      super($$0, $$1);
      this.H = true;
      this.a(eic.j, -1.0F);
      this.a(eic.i, 0.0F);
      this.a(eic.n, 0.0F);
      this.a(eic.o, 0.0F);
   }

   public static boolean c(bol<cft> $$0, cwf $$1, bpb $$2, ib $$3, awt $$4) {
      ib.a $$5 = $$3.j();

      do {
         $$5.c(ih.b);
      } while ($$1.b_($$5).a(auj.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aii<?> $$0) {
      if (cc.equals($$0) && this.dJ().B) {
         this.cf.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(cc, 0);
      this.am.a(cd, false);
      this.am.a(ce, false);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      this.cf.a($$0);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      this.cf.b($$0);
   }

   @Override
   public boolean i() {
      return this.cf.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable atq $$0) {
      this.cf.a(true);
      if ($$0 != null) {
         this.dJ().a(null, this, atp.xx, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bP.a(1, new bwn(this, 1.65));
      this.bP.a(2, new bvg(this, 1.0));
      this.cg = new bxc(this, 1.4, cb, false);
      this.bP.a(3, this.cg);
      this.bP.a(4, new cft.a(this, 1.0));
      this.bP.a(5, new bvt(this, 1.0));
      this.bP.a(7, new bwr(this, 1.0, 60));
      this.bP.a(8, new bwc(this, cia.class, 8.0F));
      this.bP.a(8, new bwp(this));
      this.bP.a(9, new bwc(this, cft.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.am.b(cd, $$0);
      bqa $$1 = this.f(bqe.o);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bW);
         } else {
            $$1.e(bW);
         }
      }
   }

   @Override
   public boolean u() {
      return this.am.b(cd);
   }

   @Override
   public boolean a(ehr $$0) {
      return $$0.a(auj.b);
   }

   @Override
   protected eov a(bof $$0, boi $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aR.a());
      float $$4 = this.aR.b();
      float $$5 = 0.12F * awm.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cwh $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public box cK() {
      return (box)(this.i() && this.cN() instanceof cia $$0 && $$0.b(cpt.nR) ? $$0 : super.cK());
   }

   @Override
   public eov b(box $$0) {
      eov[] $$1 = new eov[]{
         a((double)this.dd(), (double)$$0.dd(), $$0.dz()),
         a((double)this.dd(), (double)$$0.dd(), $$0.dz() - 22.5F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dz() + 22.5F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dz() - 45.0F),
         a((double)this.dd(), (double)$$0.dd(), $$0.dz() + 45.0F)
      };
      Set<ib> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cE().e;
      double $$4 = this.cE().b - 0.5;
      ib.a $$5 = new ib.a();

      for (eov $$6 : $$1) {
         $$5.b(this.do() + $$6.c, $$3, this.du() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ih.a);
         }
      }

      for (ib $$8 : $$2) {
         if (!this.dJ().b_($$8).a(auj.b)) {
            double $$9 = this.dJ().j($$8);
            if (cjy.a($$9)) {
               eov $$10 = eov.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fC().iterator();

               while (var14.hasNext()) {
                  bpi $$11 = (bpi)var14.next();
                  eoq $$12 = $$0.f($$11);
                  if (cjy.a(this.dJ(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eov(this.do(), this.cE().e, this.du());
   }

   @Override
   protected void a(cia $$0, eov $$1) {
      this.a($$0.dz(), $$0.dB() * 0.5F);
      this.M = this.aV = this.aX = this.dz();
      this.cf.b();
      super.a($$0, $$1);
   }

   @Override
   protected eov b(cia $$0, eov $$1) {
      return new eov(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cia $$0) {
      return (float)(this.g(bqe.o) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cf.c());
   }

   @Override
   protected float aM() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(ib $$0, dme $$1) {
      this.a(this.bn() ? atp.xv : atp.xu, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cf.a(this.ef());
   }

   @Override
   protected void a(double $$0, boolean $$1, dme $$2, ib $$3) {
      this.aQ();
      if (this.bn()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.A() && this.af.a(140) == 0) {
         this.b(atp.xq);
      } else if (this.gi() && this.af.a(60) == 0) {
         this.b(atp.xr);
      }

      if (!this.gb()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dme $$0 = this.dJ().a_(this.dj());
            dme $$1 = this.bj();
            $$2 = $$0.a(aue.aT) || $$1.a(aue.aT) || this.b(auj.b) > 0.0;
            if (this.cW() instanceof cft $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gl();
      this.aQ();
   }

   private boolean A() {
      return this.cg != null && this.cg.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gl() {
      if (this.bn()) {
         epa $$0 = epa.a(this);
         if ($$0.a(ddu.d, this.dj(), true) && !this.dJ().b_(this.dj().c()).a(auj.b)) {
            this.c(true);
         } else {
            this.g(this.dm().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bqd.a w() {
      return boz.C().a(bqe.o, 0.175F).a(bqe.i, 16.0);
   }

   @Override
   protected ato y() {
      return !this.gi() && !this.A() ? atp.xp : null;
   }

   @Override
   protected ato d(bne $$0) {
      return atp.xt;
   }

   @Override
   protected ato n_() {
      return atp.xs;
   }

   @Override
   protected boolean q(bof $$0) {
      return !this.bM() && !this.a(auj.b);
   }

   @Override
   public boolean fj() {
      return true;
   }

   @Override
   public boolean bK() {
      return false;
   }

   @Override
   protected byi b(cwe $$0) {
      return new cft.b(this, $$0);
   }

   @Override
   public float a(ib $$0, cwh $$1) {
      if ($$1.a_($$0).u().a(auj.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cft b(apa $$0, boa $$1) {
      return bol.aX.a((cwe)$$0);
   }

   @Override
   public boolean o(cpq $$0) {
      return ca.a($$0);
   }

   @Override
   protected void ex() {
      super.ex();
      if (this.i()) {
         this.a(cpt.nK);
      }
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bM() && !$$0.fK()) {
         if (!this.dJ().B) {
            $$0.m(this);
         }

         return bml.a(this.dJ().B);
      } else {
         bml $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cpq $$4 = $$0.b($$1);
            return $$4.a(cpt.nK) ? $$4.a($$0, this, $$1) : bml.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dJ().a(null, this.do(), this.dq(), this.du(), atp.xw, this.cY(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eov cG() {
      return new eov(0.0, (double)(0.6F * this.cF()), (double)(this.dd() * 0.4F));
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         awt $$4 = $$0.F_();
         if ($$4.a(30) == 0) {
            boz $$5 = bol.bv.a((cwe)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cfz.b(cfz.a($$4), false));
               $$5.a(bom.a, new cpq(cpt.nR));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            boa $$6 = bol.aX.a((cwe)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new boa.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bpp a(cwt $$0, bmj $$1, boz $$2, @Nullable bpp $$3) {
      $$2.b(this.do(), this.dq(), this.du(), this.dz(), 0.0F);
      $$2.a($$0, $$1, bpb.g, $$3);
      $$2.a(this, true);
      return new boa.a(0.0F);
   }

   static class a extends bwh {
      private final cft g;

      a(cft $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public ib k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dJ(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bn() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(cwh $$0, ib $$1) {
         return $$0.a_($$1).a(czh.H) && $$0.a_($$1.c()).a($$0, $$1, eih.a);
      }
   }

   static class b extends byh {
      b(cft $$0, cwe $$1) {
         super($$0, $$1);
      }

      @Override
      protected eii a(int $$0) {
         this.o = new eil();
         this.o.a(true);
         return new eii(this.o, $$0);
      }

      @Override
      protected boolean a(eic $$0) {
         return $$0 != eic.i && $$0 != eic.o && $$0 != eic.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(ib $$0) {
         return this.b.a_($$0).a(czh.H) || super.a($$0);
      }
   }
}
