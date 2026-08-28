import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class ckq extends cff implements btm, buf {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final buv bZ = new buv(bY, "Strider suffocating modifier", -0.34F, buv.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final akk<Integer> cd = ako.a(ckq.class, akm.b);
   private static final akk<Boolean> ce = ako.a(ckq.class, akm.k);
   private static final akk<Boolean> cf = ako.a(ckq.class, akm.k);
   private final btl cg = new btl(this.ao, cd, cf);
   @Nullable
   private cbv ch;

   public ckq(bta<? extends ckq> $$0, dby $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eom.j, -1.0F);
      this.a(eom.i, 0.0F);
      this.a(eom.n, 0.0F);
      this.a(eom.o, 0.0F);
   }

   public static boolean c(bta<ckq> $$0, dbz $$1, btt $$2, iz $$3, azh $$4) {
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
      this.bS.a(1, new cbg(this, 1.65));
      this.bS.a(2, new bzz(this, 1.0));
      this.ch = new cbv(this, 1.4, $$0 -> $$0.a(awy.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new ckq.a(this, 1.0));
      this.bS.a(5, new cam(this, 1.0));
      this.bS.a(7, new cbk(this, 1.0, 60));
      this.bS.a(8, new cav(this, cmx.class, 8.0F));
      this.bS.a(8, new cbi(this));
      this.bS.a(9, new cav(this, ckq.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      but $$1 = this.f(bux.r);
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
   public boolean a(env $$0) {
      return $$0.a(awv.b);
   }

   @Override
   protected evr a(bsu $$0, bsx $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayz.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dcb $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btp cQ() {
      return (btp)(this.i() && this.cT() instanceof cmx $$0 && $$0.b(cus.nS) ? $$0 : super.cQ());
   }

   @Override
   public evr b(btp $$0) {
      evr[] $$1 = new evr[]{
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

      for (evr $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(je.a);
         }
      }

      for (iz $$8 : $$2) {
         if (!this.dP().b_($$8).a(awv.b)) {
            double $$9 = this.dP().j($$8);
            if (coy.a($$9)) {
               evr $$10 = evr.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  bub $$11 = (bub)var14.next();
                  evm $$12 = $$0.f($$11);
                  if (coy.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evr(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cmx $$0, evr $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected evr b(cmx $$0, evr $$1) {
      return new evr(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmx $$0) {
      return (float)(this.g(bux.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(iz $$0, dsc $$1) {
      this.a(this.bs() ? awa.xZ : awa.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsc $$2, iz $$3) {
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
            dsc $$0 = this.dP().a_(this.dp());
            dsc $$1 = this.bo();
            $$2 = $$0.a(awp.aU) || $$1.a(awp.aU) || this.b(awv.b) > 0.0;
            if (this.dc() instanceof ckq $$3 && $$3.s()) {
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
         evw $$0 = evw.a(this);
         if ($$0.a(djp.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awv.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buw.a u() {
      return btr.A().a(bux.r, 0.175F).a(bux.k, 16.0);
   }

   @Override
   protected avz v() {
      return !this.gn() && !this.y() ? awa.xT : null;
   }

   @Override
   protected avz d(brn $$0) {
      return awa.xX;
   }

   @Override
   protected avz o_() {
      return awa.xW;
   }

   @Override
   protected boolean r(bsu $$0) {
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
   protected cdb b(dby $$0) {
      return new ckq.b(this, $$0);
   }

   @Override
   public float a(iz $$0, dcb $$1) {
      if ($$1.a_($$0).u().a(awv.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public ckq b(arf $$0, bso $$1) {
      return bta.aZ.a((dby)$$0);
   }

   @Override
   public boolean o(cup $$0) {
      return $$0.a(awy.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cus.nL);
      }
   }

   @Override
   public bqu b(cmx $$0, bqt $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqu.a(this.dP().B);
      } else {
         bqu $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cup $$4 = $$0.b($$1);
            return $$4.a(cus.nL) ? $$4.a($$0, this, $$1) : bqu.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), awa.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evr cM() {
      return new evr(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public bui a(dcn $$0, bqs $$1, btt $$2, @Nullable bui $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azh $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btr $$5 = bta.bx.a((dby)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new ckw.b(ckw.a($$4), false));
               $$5.a(btb.a, new cup(cus.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bso $$6 = bta.aZ.a((dby)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bso.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bui a(dcn $$0, bqs $$1, btr $$2, @Nullable bui $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btt.g, $$3);
      $$2.a(this, true);
      return new bso.a(0.0F);
   }

   static class a extends cba {
      private final ckq g;

      a(ckq $$0, double $$1) {
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
      protected boolean a(dcb $$0, iz $$1) {
         return $$0.a_($$1).a(dfb.H) && $$0.a_($$1.c()).a(eok.a);
      }
   }

   static class b extends cda {
      b(ckq $$0, dby $$1) {
         super($$0, $$1);
      }

      @Override
      protected eol a(int $$0) {
         this.o = new eor();
         this.o.a(true);
         return new eol(this.o, $$0);
      }

      @Override
      protected boolean a(eom $$0) {
         return $$0 != eom.i && $$0 != eom.o && $$0 != eom.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iz $$0) {
         return this.b.a_($$0).a(dfb.H) || super.a($$0);
      }
   }
}
