import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cht extends cci implements bqq, bri {
   private static final UUID bX = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bry bY = new bry(bX, "Strider suffocating modifier", -0.34F, bry.a.b);
   private static final float ca = 0.35F;
   private static final float cb = 0.55F;
   private static final cvp cc = cvp.a(crv.dC);
   private static final cvp cd = cvp.a(crv.dC, crv.nR);
   private static final aja<Integer> ce = aje.a(cht.class, ajc.b);
   private static final aja<Boolean> cf = aje.a(cht.class, ajc.k);
   private static final aja<Boolean> cg = aje.a(cht.class, ajc.k);
   private final bqp ch = new bqp(this.an, ce, cg);
   @Nullable
   private byy ci;

   public cht(bqg<? extends cht> $$0, czg $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(els.j, -1.0F);
      this.a(els.i, 0.0F);
      this.a(els.n, 0.0F);
      this.a(els.o, 0.0F);
   }

   public static boolean c(bqg<cht> $$0, czh $$1, bqx $$2, id $$3, axt $$4) {
      id.a $$5 = $$3.j();

      do {
         $$5.c(ij.b);
      } while ($$1.b_($$5).a(avj.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(aja<?> $$0) {
      if (ce.equals($$0) && this.dM().B) {
         this.ch.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(ce, 0);
      $$0.a(cf, false);
      $$0.a(cg, false);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      this.ch.a($$0);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      this.ch.b($$0);
   }

   @Override
   public boolean i() {
      return this.ch.d();
   }

   @Override
   public boolean f() {
      return this.bA() && !this.p_();
   }

   @Override
   public void a(@Nullable aup $$0) {
      this.ch.a(true);
      if ($$0 != null) {
         this.dM().a(null, this, auo.xI, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bR.a(1, new byj(this, 1.65));
      this.bR.a(2, new bxc(this, 1.0));
      this.ci = new byy(this, 1.4, cd, false);
      this.bR.a(3, this.ci);
      this.bR.a(4, new cht.a(this, 1.0));
      this.bR.a(5, new bxp(this, 1.0));
      this.bR.a(7, new byn(this, 1.0, 60));
      this.bR.a(8, new bxy(this, cka.class, 8.0F));
      this.bR.a(8, new byl(this));
      this.bR.a(9, new bxy(this, cht.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.an.a(cf, $$0);
      brw $$1 = this.f(bsa.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bY);
         } else {
            $$1.e(bY);
         }
      }
   }

   public boolean r() {
      return this.an.a(cf);
   }

   @Override
   public boolean a(elb $$0) {
      return $$0.a(avj.b);
   }

   @Override
   protected esj a(bqa $$0, bqd $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aT.a());
      float $$4 = this.aT.b();
      float $$5 = 0.12F * axm.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(czj $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bqt cN() {
      return (bqt)(this.i() && this.cQ() instanceof cka $$0 && $$0.b(crv.nR) ? $$0 : super.cN());
   }

   @Override
   public esj b(bqt $$0) {
      esj[] $$1 = new esj[]{
         a((double)this.dg(), (double)$$0.dg(), $$0.dC()),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 22.5F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() - 45.0F),
         a((double)this.dg(), (double)$$0.dg(), $$0.dC() + 45.0F)
      };
      Set<id> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cH().e;
      double $$4 = this.cH().b - 0.5;
      id.a $$5 = new id.a();

      for (esj $$6 : $$1) {
         $$5.b(this.dr() + $$6.c, $$3, this.dx() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(ij.a);
         }
      }

      for (id $$8 : $$2) {
         if (!this.dM().b_($$8).a(avj.b)) {
            double $$9 = this.dM().j($$8);
            if (cma.a($$9)) {
               esj $$10 = esj.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fF().iterator();

               while (var14.hasNext()) {
                  bre $$11 = (bre)var14.next();
                  ese $$12 = $$0.f($$11);
                  if (cma.a(this.dM(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new esj(this.dr(), this.cH().e, this.dx());
   }

   @Override
   protected void a(cka $$0, esj $$1) {
      this.a($$0.dC(), $$0.dE() * 0.5F);
      this.N = this.aX = this.aZ = this.dC();
      this.ch.b();
      super.a($$0, $$1);
   }

   @Override
   protected esj b(cka $$0, esj $$1) {
      return new esj(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cka $$0) {
      return (float)(this.g(bsa.r) * (double)(this.r() ? 0.35F : 0.55F) * (double)this.ch.c());
   }

   @Override
   protected float aM() {
      return this.Z + 0.6F;
   }

   @Override
   protected void b(id $$0, dpi $$1) {
      this.a(this.bq() ? auo.xG : auo.xF, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.ch.a(this.ei());
   }

   @Override
   protected void a(double $$0, boolean $$1, dpi $$2, id $$3) {
      this.aQ();
      if (this.bq()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ag.a(140) == 0) {
         this.b(auo.xB);
      } else if (this.gk() && this.ag.a(60) == 0) {
         this.b(auo.xC);
      }

      if (!this.gd()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dpi $$0 = this.dM().a_(this.dm());
            dpi $$1 = this.bm();
            $$2 = $$0.a(ave.aU) || $$1.a(ave.aU) || this.b(avj.b) > 0.0;
            if (this.cZ() instanceof cht $$3 && $$3.r()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gn();
      this.aQ();
   }

   private boolean y() {
      return this.ci != null && this.ci.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gn() {
      if (this.bq()) {
         eso $$0 = eso.a(this);
         if ($$0.a(dgw.d, this.dm(), true) && !this.dM().b_(this.dm().c()).a(avj.b)) {
            this.c(true);
         } else {
            this.g(this.dp().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static brz.a u() {
      return bqv.A().a(bsa.r, 0.175F).a(bsa.k, 16.0);
   }

   @Override
   protected aun v() {
      return !this.gk() && !this.y() ? auo.xA : null;
   }

   @Override
   protected aun d(boy $$0) {
      return auo.xE;
   }

   @Override
   protected aun o_() {
      return auo.xD;
   }

   @Override
   protected boolean r(bqa $$0) {
      return !this.bP() && !this.a(avj.b);
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public boolean bN() {
      return false;
   }

   @Override
   protected cae b(czg $$0) {
      return new cht.b(this, $$0);
   }

   @Override
   public float a(id $$0, czj $$1) {
      if ($$1.a_($$0).u().a(avj.b)) {
         return 10.0F;
      } else {
         return this.bq() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cht b(apu $$0, bpu $$1) {
      return bqg.aY.a((czg)$$0);
   }

   @Override
   public boolean o(crs $$0) {
      return cc.a($$0);
   }

   @Override
   protected void eA() {
      super.eA();
      if (this.i()) {
         this.a(crv.nK);
      }
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bP() && !$$0.fO()) {
         if (!this.dM().B) {
            $$0.n(this);
         }

         return bof.a(this.dM().B);
      } else {
         bof $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            crs $$4 = $$0.b($$1);
            return $$4.a(crv.nK) ? $$4.a($$0, this, $$1) : bof.d;
         } else {
            if ($$2 && !this.aU()) {
               this.dM().a(null, this.dr(), this.dt(), this.dx(), auo.xH, this.db(), 1.0F, 1.0F + (this.ag.i() - this.ag.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.6F * this.cI()), (double)(this.dg() * 0.4F));
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         axt $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bqv $$5 = bqg.bw.a((czg)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new chz.b(chz.a($$4), false));
               $$5.a(bqh.a, new crs(crv.nR));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bpu $$6 = bqg.aY.a((czg)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bpu.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private brl a(czv $$0, bod $$1, bqv $$2, @Nullable brl $$3) {
      $$2.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
      $$2.a($$0, $$1, bqx.g, $$3);
      $$2.a(this, true);
      return new bpu.a(0.0F);
   }

   static class a extends byd {
      private final cht g;

      a(cht $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public id k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bq() && this.a(this.g.dM(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bq() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(czj $$0, id $$1) {
         return $$0.a_($$1).a(dcj.H) && $$0.a_($$1.c()).a(elq.a);
      }
   }

   static class b extends cad {
      b(cht $$0, czg $$1) {
         super($$0, $$1);
      }

      @Override
      protected elr a(int $$0) {
         this.o = new elx();
         this.o.a(true);
         return new elr(this.o, $$0);
      }

      @Override
      protected boolean a(els $$0) {
         return $$0 != els.i && $$0 != els.o && $$0 != els.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(id $$0) {
         return this.b.a_($$0).a(dcj.H) || super.a($$0);
      }
   }
}
