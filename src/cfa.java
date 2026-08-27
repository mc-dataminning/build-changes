import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfa extends bzt implements bod, bov {
   private static final UUID bT = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bpj bU = new bpj(bT, "Strider suffocating modifier", -0.34F, bpj.a.b);
   private static final float bW = 0.35F;
   private static final float bX = 0.55F;
   private static final cry bY = cry.a(cpc.dC);
   private static final cry bZ = cry.a(cpc.dC, cpc.nR);
   private static final aie<Integer> ca = aih.a(cfa.class, aig.b);
   private static final aie<Boolean> cb = aih.a(cfa.class, aig.k);
   private static final aie<Boolean> cc = aih.a(cfa.class, aig.k);
   private final boc cd = new boc(this.am, ca, cc);
   @Nullable
   private bwj ce;

   public cfa(bnu<? extends cfa> $$0, cvn $$1) {
      super($$0, $$1);
      this.H = true;
      this.a(eha.j, -1.0F);
      this.a(eha.i, 0.0F);
      this.a(eha.n, 0.0F);
      this.a(eha.o, 0.0F);
   }

   public static boolean c(bnu<cfa> $$0, cvo $$1, bok $$2, hz $$3, awo $$4) {
      hz.a $$5 = $$3.j();

      do {
         $$5.c(ie.b);
      } while ($$1.b_($$5).a(aue.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aie<?> $$0) {
      if (ca.equals($$0) && this.dM().B) {
         this.cd.a();
      }

      super.a($$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(ca, 0);
      this.am.a(cb, false);
      this.am.a(cc, false);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      this.cd.a($$0);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.cd.b($$0);
   }

   @Override
   public boolean i() {
      return this.cd.d();
   }

   @Override
   public boolean g() {
      return this.bx() && !this.o_();
   }

   @Override
   public void a(@Nullable atl $$0) {
      this.cd.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, atk.xw, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void B() {
      this.bO.a(1, new bvu(this, 1.65));
      this.bO.a(2, new bun(this, 1.0));
      this.ce = new bwj(this, 1.4, bZ, false);
      this.bO.a(3, this.ce);
      this.bO.a(4, new cfa.a(this, 1.0));
      this.bO.a(5, new bva(this, 1.0));
      this.bO.a(7, new bvy(this, 1.0, 60));
      this.bO.a(8, new bvj(this, chh.class, 8.0F));
      this.bO.a(8, new bvw(this));
      this.bO.a(9, new bvj(this, cfa.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.am.b(cb, $$0);
      bph $$1 = this.f(bpl.o);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bU);
         } else {
            $$1.e(bU);
         }
      }
   }

   @Override
   public boolean u() {
      return this.am.b(cb);
   }

   @Override
   public boolean a(egp $$0) {
      return $$0.a(aue.b);
   }

   @Override
   protected ens a(bno $$0, bnr $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aQ.a());
      float $$4 = this.aQ.b();
      float $$5 = 0.12F * awh.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(cvq $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bog cN() {
      return (bog)(this.i() && this.cQ() instanceof chh $$0 && $$0.b(cpc.nR) ? $$0 : super.cN());
   }

   @Override
   public ens b(bog $$0) {
      ens[] $$1 = new ens[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<hz> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      hz.a $$5 = new hz.a();

      for (ens $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ie.a);
         }
      }

      for (hz $$8 : $$2) {
         if (!this.dM().b_($$8).a(aue.b)) {
            double $$9 = this.dM().j($$8);
            if (cjf.a($$9)) {
               ens $$10 = ens.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fA().iterator();

               while (var14.hasNext()) {
                  bor $$11 = (bor)var14.next();
                  enn $$12 = $$0.f($$11);
                  if (cjf.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new ens(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(chh $$0, ens $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.M = this.aU = this.aW = this.dC();
      this.cd.b();
      super.a($$0, $$1);
   }

   @Override
   protected ens b(chh $$0, ens $$1) {
      return new ens(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(chh $$0) {
      return (float)(this.g(bpl.o) * (double)(this.u() ? 0.35F : 0.55F) * (double)this.cd.c());
   }

   @Override
   protected float aM() {
      return this.Y + 0.6F;
   }

   @Override
   protected void b(hz $$0, dlf $$1) {
      this.a(this.bn() ? atk.xu : atk.xt, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cd.a(this.eh());
   }

   @Override
   protected void a(double $$0, boolean $$1, dlf $$2, hz $$3) {
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
         this.b(atk.xp);
      } else if (this.gd() && this.af.a(60) == 0) {
         this.b(atk.xq);
      }

      if (!this.fW()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dlf $$0 = this.dM().a_(this.dm());
            dlf $$1 = this.bj();
            $$2 = $$0.a(atz.aT) || $$1.a(atz.aT) || this.b(aue.b) > 0.0;
            if (this.cZ() instanceof cfa $$3 && $$3.u()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gg();
      this.aQ();
   }

   private boolean A() {
      return this.ce != null && this.ce.i();
   }

   @Override
   protected boolean D() {
      return true;
   }

   private void gg() {
      if (this.bn()) {
         enx $$0 = enx.a(this);
         if ($$0.a(ddd.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(aue.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bpk.a w() {
      return boi.C().a(bpl.o, 0.175F).a(bpl.i, 16.0);
   }

   @Override
   protected atj y() {
      return !this.gd() && !this.A() ? atk.xo : null;
   }

   @Override
   protected atj d(bmn $$0) {
      return atk.xs;
   }

   @Override
   protected atj n_() {
      return atk.xr;
   }

   @Override
   protected boolean q(bno $$0) {
      return !this.bP() && !this.a(aue.b);
   }

   @Override
   public boolean fh() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected bxp b(cvn $$0) {
      return new cfa.b(this, $$0);
   }

   @Override
   public float a(hz $$0, cvq $$1) {
      if ($$1.a_($$0).u().a(aue.b)) {
         return 10.0F;
      } else {
         return this.bn() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cfa b(aov $$0, bnj $$1) {
      return bnu.aX.a((cvn)$$0);
   }

   @Override
   public boolean m(coz $$0) {
      return bY.a($$0);
   }

   @Override
   protected void ez() {
      super.ez();
      if (this.i()) {
         this.a(cpc.nK);
      }
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      boolean $$2 = this.m($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fI()) {
         if (!this.dM().B) {
            $$0.m(this);
         }

         return blu.a(this.dM().B);
      } else {
         blu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            coz $$4 = $$0.b($$1);
            return $$4.a(cpc.nK) ? $$4.a($$0, this, $$1) : blu.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.xv, this.db(), 1.0F, 1.0F + (this.af.i() - this.af.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public ens cJ() {
      return new ens(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      if (this.o_()) {
         return super.a($$0, $$1, $$2, $$3, $$4);
      } else {
         awo $$5 = $$0.F_();
         if ($$5.a(30) == 0) {
            boi $$6 = bnu.bv.a((cvn)$$0.E());
            if ($$6 != null) {
               $$3 = this.a($$0, $$1, $$6, new cfg.b(cfg.a($$5), false));
               $$6.a(bnv.a, new coz(cpc.nR));
               this.a(null);
            }
         } else if ($$5.a(10) == 0) {
            bnj $$7 = bnu.aX.a((cvn)$$0.E());
            if ($$7 != null) {
               $$7.c_(-24000);
               $$3 = this.a($$0, $$1, $$7, null);
            }
         } else {
            $$3 = new bnj.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   private boy a(cwc $$0, bls $$1, boi $$2, @Nullable boy $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bok.g, $$3, null);
      $$2.a(this, true);
      return new bnj.a(0.0F);
   }

   static class a extends bvo {
      private final cfa g;

      a(cfa $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public hz k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bn() && this.a(this.g.dM(), this.e);
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
      protected boolean a(cvq $$0, hz $$1) {
         return $$0.a_($$1).a(cyq.H) && $$0.a_($$1.c()).a($$0, $$1, ehf.a);
      }
   }

   static class b extends bxo {
      b(cfa $$0, cvn $$1) {
         super($$0, $$1);
      }

      @Override
      protected ehg a(int $$0) {
         this.o = new ehj();
         this.o.a(true);
         return new ehg(this.o, $$0);
      }

      @Override
      protected boolean a(eha $$0) {
         return $$0 != eha.i && $$0 != eha.o && $$0 != eha.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(hz $$0) {
         return this.b.a_($$0).a(cyq.H) || super.a($$0);
      }
   }
}
