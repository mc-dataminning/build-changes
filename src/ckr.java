import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckr extends cfg implements btn, bug {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final buw bZ = new buw(bY, "Strider suffocating modifier", -0.34F, buw.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final akk<Integer> cd = ako.a(ckr.class, akm.b);
   private static final akk<Boolean> ce = ako.a(ckr.class, akm.k);
   private static final akk<Boolean> cf = ako.a(ckr.class, akm.k);
   private final btm cg = new btm(this.ao, cd, cf);
   @Nullable
   private cbw ch;

   public ckr(btb<? extends ckr> $$0, dbz $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eon.j, -1.0F);
      this.a(eon.i, 0.0F);
      this.a(eon.n, 0.0F);
      this.a(eon.o, 0.0F);
   }

   public static boolean c(btb<ckr> $$0, dca $$1, btu $$2, iz $$3, azh $$4) {
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
      this.bS.a(1, new cbh(this, 1.65));
      this.bS.a(2, new caa(this, 1.0));
      this.ch = new cbw(this, 1.4, $$0 -> $$0.a(awy.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new ckr.a(this, 1.0));
      this.bS.a(5, new can(this, 1.0));
      this.bS.a(7, new cbl(this, 1.0, 60));
      this.bS.a(8, new caw(this, cmy.class, 8.0F));
      this.bS.a(8, new cbj(this));
      this.bS.a(9, new caw(this, ckr.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      buu $$1 = this.f(buy.r);
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
   public boolean a(enw $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected evs a(bsv $$0, bsy $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btq cQ() {
      return (btq)(this.i() && this.cT() instanceof cmy $$0 && $$0.b(cut.nS) ? $$0 : super.cQ());
   }

   @Override
   public evs b(btq $$0) {
      evs[] $$1 = new evs[]{
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

      for (evs $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(je.a);
         }
      }

      for (iz $$8 : $$2) {
         if (!this.dP().b_($$8).a(awv.b)) {
            double $$9 = this.dP().j($$8);
            if (coz.a($$9)) {
               evs $$10 = evs.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  buc $$11 = (buc)var14.next();
                  evn $$12 = $$0.f($$11);
                  if (coz.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evs(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cmy $$0, evs $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected evs b(cmy $$0, evs $$1) {
      return new evs(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmy $$0) {
      return (float)(this.g(buy.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(iz $$0, dsd $$1) {
      this.a(this.bs() ? awa.xZ : awa.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsd $$2, iz $$3) {
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
            dsd $$0 = this.dP().a_(this.dp());
            dsd $$1 = this.bo();
            $$2 = $$0.a(awp.aU) || $$1.a(awp.aU) || this.b(awv.b) > 0.0;
            if (this.dc() instanceof ckr $$3 && $$3.s()) {
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
         evx $$0 = evx.a(this);
         if ($$0.a(djq.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awv.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bux.a u() {
      return bts.A().a(buy.r, 0.175F).a(buy.k, 16.0);
   }

   @Override
   protected avz v() {
      return !this.gn() && !this.y() ? awa.xT : null;
   }

   @Override
   protected avz d(bro $$0) {
      return awa.xX;
   }

   @Override
   protected avz o_() {
      return awa.xW;
   }

   @Override
   protected boolean r(bsv $$0) {
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
   protected cdc b(dbz $$0) {
      return new ckr.b(this, $$0);
   }

   @Override
   public float a(iz $$0, dcc $$1) {
      if ($$1.a_($$0).u().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ckr b(arf $$0, bsp $$1) {
      return btb.aZ.a((dbz)$$0);
   }

   @Override
   public boolean o(cuq $$0) {
      return $$0.a(awy.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cut.nL);
      }
   }

   @Override
   public bqv b(cmy $$0, bqu $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqv.a(this.dP().B);
      } else {
         bqv $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cuq $$4 = $$0.b($$1);
            return $$4.a(cut.nL) ? $$4.a($$0, this, $$1) : bqv.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evs cM() {
      return new evs(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public buj a(dco $$0, bqt $$1, btu $$2, @Nullable buj $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bts $$5 = btb.bx.a((dbz)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckx.b(ckx.a($$4), false));
               $$5.a(btc.a, new cuq(cut.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsp $$6 = btb.aZ.a((dbz)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsp.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private buj a(dco $$0, bqt $$1, bts $$2, @Nullable buj $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btu.g, $$3);
      $$2.a(this, true);
      return new bsp.a(0.0F);
   }

   static class a extends cbb {
      private final ckr g;

      a(ckr $$0, double $$1) {
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
      protected boolean a(dcc $$0, iz $$1) {
         return $$0.a_($$1).a(dfc.H) && $$0.a_($$1.c()).a(eol.a);
      }
   }

   static class b extends cdb {
      b(ckr $$0, dbz $$1) {
         super($$0, $$1);
      }

      @Override
      protected eom a(int $$0) {
         this.o = new eos();
         this.o.a(true);
         return new eom(this.o, $$0);
      }

      @Override
      protected boolean a(eon $$0) {
         return $$0 != eon.i && $$0 != eon.o && $$0 != eon.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iz $$0) {
         return this.b.a_($$0).a(dfc.H) || super.a($$0);
      }
   }
}
