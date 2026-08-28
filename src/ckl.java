import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckl extends cfa implements bth, bua {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final buq bZ = new buq(bY, "Strider suffocating modifier", -0.34F, buq.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final akg<Integer> cd = akk.a(ckl.class, aki.b);
   private static final akg<Boolean> ce = akk.a(ckl.class, aki.k);
   private static final akg<Boolean> cf = akk.a(ckl.class, aki.k);
   private final btg cg = new btg(this.ao, cd, cf);
   @Nullable
   private cbq ch;

   public ckl(bsv<? extends ckl> $$0, dbt $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eoh.j, -1.0F);
      this.a(eoh.i, 0.0F);
      this.a(eoh.n, 0.0F);
      this.a(eoh.o, 0.0F);
   }

   public static boolean c(bsv<ckl> $$0, dbu $$1, bto $$2, iz $$3, azc $$4) {
      iz.a $$5 = $$3.j();

      do {
         $$5.c(je.b);
      } while ($$1.b_($$5).a(awr.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(akg<?> $$0) {
      if (cd.equals($$0) && this.dP().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.cg.b($$0);
   }

   @Override
   public boolean i() {
      return this.cg.d();
   }

   @Override
   public boolean f() {
      return this.bD() && !this.p_();
   }

   @Override
   public void a(@Nullable avx $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avw.yb, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbb(this, 1.65));
      this.bS.a(2, new bzu(this, 1.0));
      this.ch = new cbq(this, 1.4, $$0 -> $$0.a(awu.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new ckl.a(this, 1.0));
      this.bS.a(5, new cah(this, 1.0));
      this.bS.a(7, new cbf(this, 1.0, 60));
      this.bS.a(8, new caq(this, cms.class, 8.0F));
      this.bS.a(8, new cbd(this));
      this.bS.a(9, new caq(this, ckl.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      buo $$1 = this.f(bus.r);
      if ($$1 != null) {
         if ($$0) {
            $$1.b(bZ);
         } else {
            $$1.e(bZ);
         }
      }
   }

   public boolean s() {
      return this.ao.a(ce);
   }

   @Override
   public boolean a(enq $$0) {
      return $$0.a(awr.b);
   }

   @Override
   protected evm a(bsp $$0, bss $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayu.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dbw $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btk cQ() {
      return (btk)(this.i() && this.cT() instanceof cms $$0 && $$0.b(cun.nS) ? $$0 : super.cQ());
   }

   @Override
   public evm b(btk $$0) {
      evm[] $$1 = new evm[]{
         a((double)this.dj(), (double)$$0.dj(), $$0.dF()),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 45.0F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 45.0F)
      };
      Set<iz> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cK().e;
      double $$4 = this.cK().b - 0.5;
      iz.a $$5 = new iz.a();

      for (evm $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(je.a);
         }
      }

      for (iz $$8 : $$2) {
         if (!this.dP().b_($$8).a(awr.b)) {
            double $$9 = this.dP().j($$8);
            if (cot.a($$9)) {
               evm $$10 = evm.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  btw $$11 = (btw)var14.next();
                  evh $$12 = $$0.f($$11);
                  if (cot.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evm(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cms $$0, evm $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected evm b(cms $$0, evm $$1) {
      return new evm(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cms $$0) {
      return (float)(this.g(bus.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(iz $$0, drx $$1) {
      this.a(this.bs() ? avw.xZ : avw.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, drx $$2, iz $$3) {
      this.aS();
      if (this.bs()) {
         this.n();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void l() {
      if (this.y() && this.ah.a(140) == 0) {
         this.b(avw.xU);
      } else if (this.gn() && this.ah.a(60) == 0) {
         this.b(avw.xV);
      }

      if (!this.gg()) {
         boolean $$2;
         boolean var10000;
         label36: {
            drx $$0 = this.dP().a_(this.dp());
            drx $$1 = this.bo();
            $$2 = $$0.a(awl.aU) || $$1.a(awl.aU) || this.b(awr.b) > 0.0;
            if (this.dc() instanceof ckl $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gq();
      this.aS();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gq() {
      if (this.bs()) {
         evr $$0 = evr.a(this);
         if ($$0.a(djk.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awr.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bur.a u() {
      return btm.A().a(bus.r, 0.175F).a(bus.k, 16.0);
   }

   @Override
   protected avv v() {
      return !this.gn() && !this.y() ? avw.xT : null;
   }

   @Override
   protected avv d(bri $$0) {
      return avw.xX;
   }

   @Override
   protected avv o_() {
      return avw.xW;
   }

   @Override
   protected boolean r(bsp $$0) {
      return !this.bS() && !this.a(awr.b);
   }

   @Override
   public boolean fp() {
      return true;
   }

   @Override
   public boolean bQ() {
      return false;
   }

   @Override
   protected ccw b(dbt $$0) {
      return new ckl.b(this, $$0);
   }

   @Override
   public float a(iz $$0, dbw $$1) {
      if ($$1.a_($$0).u().a(awr.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ckl b(arb $$0, bsj $$1) {
      return bsv.aZ.a((dbt)$$0);
   }

   @Override
   public boolean o(cuk $$0) {
      return $$0.a(awu.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cun.nL);
      }
   }

   @Override
   public bqp b(cms $$0, bqo $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqp.a(this.dP().B);
      } else {
         bqp $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuk $$4 = $$0.b($$1);
            return $$4.a(cun.nL) ? $$4.a($$0, this, $$1) : bqp.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avw.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evm cM() {
      return new evm(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public bud a(dci $$0, bqn $$1, bto $$2, @Nullable bud $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azc $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btm $$5 = bsv.bx.a((dbt)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckr.b(ckr.a($$4), false));
               $$5.a(bsw.a, new cuk(cun.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsj $$6 = bsv.aZ.a((dbt)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsj.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bud a(dci $$0, bqn $$1, btm $$2, @Nullable bud $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, bto.g, $$3);
      $$2.a(this, true);
      return new bsj.a(0.0F);
   }

   static class a extends cav {
      private final ckl g;

      a(ckl $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public iz k() {
         return this.e;
      }

      @Override
      public boolean b() {
         return !this.g.bs() && this.a(this.g.dP(), this.e);
      }

      @Override
      public boolean a() {
         return !this.g.bs() && super.a();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dbw $$0, iz $$1) {
         return $$0.a_($$1).a(dew.H) && $$0.a_($$1.c()).a(eof.a);
      }
   }

   static class b extends ccv {
      b(ckl $$0, dbt $$1) {
         super($$0, $$1);
      }

      @Override
      protected eog a(int $$0) {
         this.o = new eom();
         this.o.a(true);
         return new eog(this.o, $$0);
      }

      @Override
      protected boolean a(eoh $$0) {
         return $$0 != eoh.i && $$0 != eoh.o && $$0 != eoh.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iz $$0) {
         return this.b.a_($$0).a(dew.H) || super.a($$0);
      }
   }
}
