import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cks extends cfh implements bto, buh {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final bux bZ = new bux(bY, "Strider suffocating modifier", -0.34F, bux.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final akk<Integer> cd = ako.a(cks.class, akm.b);
   private static final akk<Boolean> ce = ako.a(cks.class, akm.k);
   private static final akk<Boolean> cf = ako.a(cks.class, akm.k);
   private final btn cg = new btn(this.ao, cd, cf);
   @Nullable
   private cbx ch;

   public cks(btc<? extends cks> $$0, dca $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eoo.j, -1.0F);
      this.a(eoo.i, 0.0F);
      this.a(eoo.n, 0.0F);
      this.a(eoo.o, 0.0F);
   }

   public static boolean c(btc<cks> $$0, dcb $$1, btv $$2, iz $$3, azh $$4) {
      iz.a $$5 = $$3.j();

      do {
         $$5.c(je.b);
      } while ($$1.b_($$5).a(awv.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(akk<?> $$0) {
      if (cd.equals($$0) && this.dP().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(us $$0) {
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
   public void a(@Nullable awb $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, awa.yb, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbi(this, 1.65));
      this.bS.a(2, new cab(this, 1.0));
      this.ch = new cbx(this, 1.4, $$0 -> $$0.a(awy.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cks.a(this, 1.0));
      this.bS.a(5, new cao(this, 1.0));
      this.bS.a(7, new cbm(this, 1.0, 60));
      this.bS.a(8, new cax(this, cmz.class, 8.0F));
      this.bS.a(8, new cbk(this));
      this.bS.a(9, new cax(this, cks.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      buv $$1 = this.f(buz.r);
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
   public boolean a(enx $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected evt a(bsw $$0, bsz $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcd $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btr cQ() {
      return (btr)(this.i() && this.cT() instanceof cmz $$0 && $$0.b(cuu.nS) ? $$0 : super.cQ());
   }

   @Override
   public evt b(btr $$0) {
      evt[] $$1 = new evt[]{
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

      for (evt $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(je.a);
         }
      }

      for (iz $$8 : $$2) {
         if (!this.dP().b_($$8).a(awv.b)) {
            double $$9 = this.dP().j($$8);
            if (cpa.a($$9)) {
               evt $$10 = evt.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  bud $$11 = (bud)var14.next();
                  evo $$12 = $$0.f($$11);
                  if (cpa.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evt(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cmz $$0, evt $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected evt b(cmz $$0, evt $$1) {
      return new evt(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmz $$0) {
      return (float)(this.g(buz.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(iz $$0, dse $$1) {
      this.a(this.bs() ? awa.xZ : awa.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, dse $$2, iz $$3) {
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
         this.b(awa.xU);
      } else if (this.gn() && this.ah.a(60) == 0) {
         this.b(awa.xV);
      }

      if (!this.gg()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dse $$0 = this.dP().a_(this.dp());
            dse $$1 = this.bo();
            $$2 = $$0.a(awp.aU) || $$1.a(awp.aU) || this.b(awv.b) > 0.0;
            if (this.dc() instanceof cks $$3 && $$3.s()) {
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
         evy $$0 = evy.a(this);
         if ($$0.a(djr.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awv.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buy.a u() {
      return btt.A().a(buz.r, 0.175F).a(buz.k, 16.0);
   }

   @Override
   protected avz v() {
      return !this.gn() && !this.y() ? awa.xT : null;
   }

   @Override
   protected avz d(brp $$0) {
      return awa.xX;
   }

   @Override
   protected avz o_() {
      return awa.xW;
   }

   @Override
   protected boolean r(bsw $$0) {
      return !this.bS() && !this.a(awv.b);
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
   protected cdd b(dca $$0) {
      return new cks.b(this, $$0);
   }

   @Override
   public float a(iz $$0, dcd $$1) {
      if ($$1.a_($$0).u().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cks b(arf $$0, bsq $$1) {
      return btc.aZ.a((dca)$$0);
   }

   @Override
   public boolean o(cur $$0) {
      return $$0.a(awy.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cuu.nL);
      }
   }

   @Override
   public bqw b(cmz $$0, bqv $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqw.a(this.dP().B);
      } else {
         bqw $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cur $$4 = $$0.b($$1);
            return $$4.a(cuu.nL) ? $$4.a($$0, this, $$1) : bqw.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evt cM() {
      return new evt(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public buk a(dcp $$0, bqu $$1, btv $$2, @Nullable buk $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btt $$5 = btc.bx.a((dca)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cky.b(cky.a($$4), false));
               $$5.a(btd.a, new cur(cuu.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsq $$6 = btc.aZ.a((dca)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private buk a(dcp $$0, bqu $$1, btt $$2, @Nullable buk $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btv.g, $$3);
      $$2.a(this, true);
      return new bsq.a(0.0F);
   }

   static class a extends cbc {
      private final cks g;

      a(cks $$0, double $$1) {
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
      protected boolean a(dcd $$0, iz $$1) {
         return $$0.a_($$1).a(dfd.H) && $$0.a_($$1.c()).a(eom.a);
      }
   }

   static class b extends cdc {
      b(cks $$0, dca $$1) {
         super($$0, $$1);
      }

      @Override
      protected eon a(int $$0) {
         this.o = new eot();
         this.o.a(true);
         return new eon(this.o, $$0);
      }

      @Override
      protected boolean a(eoo $$0) {
         return $$0 != eoo.i && $$0 != eoo.o && $$0 != eoo.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iz $$0) {
         return this.b.a_($$0).a(dfd.H) || super.a($$0);
      }
   }
}
