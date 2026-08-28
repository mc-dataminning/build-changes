import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cko extends cfd implements btk, bud {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final but bZ = new but(bY, "Strider suffocating modifier", -0.34F, but.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final akj<Integer> cd = akn.a(cko.class, akl.b);
   private static final akj<Boolean> ce = akn.a(cko.class, akl.k);
   private static final akj<Boolean> cf = akn.a(cko.class, akl.k);
   private final btj cg = new btj(this.ao, cd, cf);
   @Nullable
   private cbt ch;

   public cko(bsy<? extends cko> $$0, dbw $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(eok.j, -1.0F);
      this.a(eok.i, 0.0F);
      this.a(eok.n, 0.0F);
      this.a(eok.o, 0.0F);
   }

   public static boolean c(bsy<cko> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      iz.a $$5 = $$3.j();

      do {
         $$5.c(je.b);
      } while ($$1.b_($$5).a(awu.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(akj<?> $$0) {
      if (cd.equals($$0) && this.dP().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
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
   public void a(@Nullable awa $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avz.yb, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new cbe(this, 1.65));
      this.bS.a(2, new bzx(this, 1.0));
      this.ch = new cbt(this, 1.4, $$0 -> $$0.a(awx.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cko.a(this, 1.0));
      this.bS.a(5, new cak(this, 1.0));
      this.bS.a(7, new cbi(this, 1.0, 60));
      this.bS.a(8, new cat(this, cmv.class, 8.0F));
      this.bS.a(8, new cbg(this));
      this.bS.a(9, new cat(this, cko.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      bur $$1 = this.f(buv.r);
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
   public boolean a(ent $$0) {
      return $$0.a(awu.b);
   }

   @Override
   protected evp a(bss $$0, bsv $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayx.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dbz $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public btn cQ() {
      return (btn)(this.i() && this.cT() instanceof cmv $$0 && $$0.b(cuq.nS) ? $$0 : super.cQ());
   }

   @Override
   public evp b(btn $$0) {
      evp[] $$1 = new evp[]{
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

      for (evp $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(je.a);
         }
      }

      for (iz $$8 : $$2) {
         if (!this.dP().b_($$8).a(awu.b)) {
            double $$9 = this.dP().j($$8);
            if (cow.a($$9)) {
               evp $$10 = evp.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  btz $$11 = (btz)var14.next();
                  evk $$12 = $$0.f($$11);
                  if (cow.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new evp(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cmv $$0, evp $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected evp b(cmv $$0, evp $$1) {
      return new evp(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cmv $$0) {
      return (float)(this.g(buv.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(iz $$0, dsa $$1) {
      this.a(this.bs() ? avz.xZ : avz.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, dsa $$2, iz $$3) {
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
         this.b(avz.xU);
      } else if (this.gn() && this.ah.a(60) == 0) {
         this.b(avz.xV);
      }

      if (!this.gg()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dsa $$0 = this.dP().a_(this.dp());
            dsa $$1 = this.bo();
            $$2 = $$0.a(awo.aU) || $$1.a(awo.aU) || this.b(awu.b) > 0.0;
            if (this.dc() instanceof cko $$3 && $$3.s()) {
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
         evu $$0 = evu.a(this);
         if ($$0.a(djn.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awu.b)) {
            this.d(true);
         } else {
            this.h(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static buu.a u() {
      return btp.A().a(buv.r, 0.175F).a(buv.k, 16.0);
   }

   @Override
   protected avy v() {
      return !this.gn() && !this.y() ? avz.xT : null;
   }

   @Override
   protected avy d(brl $$0) {
      return avz.xX;
   }

   @Override
   protected avy o_() {
      return avz.xW;
   }

   @Override
   protected boolean r(bss $$0) {
      return !this.bS() && !this.a(awu.b);
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
   protected ccz b(dbw $$0) {
      return new cko.b(this, $$0);
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      if ($$1.a_($$0).u().a(awu.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cko b(are $$0, bsm $$1) {
      return bsy.aZ.a((dbw)$$0);
   }

   @Override
   public boolean o(cun $$0) {
      return $$0.a(awx.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(cuq.nL);
      }
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bqs.a(this.dP().B);
      } else {
         bqs $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cun $$4 = $$0.b($$1);
            return $$4.a(cuq.nL) ? $$4.a($$0, this, $$1) : bqs.e;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avz.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public evp cM() {
      return new evp(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public bug a(dcl $$0, bqq $$1, btr $$2, @Nullable bug $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azf $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            btp $$5 = bsy.bx.a((dbw)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cku.b(cku.a($$4), false));
               $$5.a(bsz.a, new cun(cuq.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            bsm $$6 = bsy.aZ.a((dbw)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bsm.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bug a(dcl $$0, bqq $$1, btp $$2, @Nullable bug $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, btr.g, $$3);
      $$2.a(this, true);
      return new bsm.a(0.0F);
   }

   static class a extends cay {
      private final cko g;

      a(cko $$0, double $$1) {
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
      protected boolean a(dbz $$0, iz $$1) {
         return $$0.a_($$1).a(dez.H) && $$0.a_($$1.c()).a(eoi.a);
      }
   }

   static class b extends ccy {
      b(cko $$0, dbw $$1) {
         super($$0, $$1);
      }

      @Override
      protected eoj a(int $$0) {
         this.o = new eop();
         this.o.a(true);
         return new eoj(this.o, $$0);
      }

      @Override
      protected boolean a(eok $$0) {
         return $$0 != eok.i && $$0 != eok.o && $$0 != eok.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(iz $$0) {
         return this.b.a_($$0).a(dez.H) || super.a($$0);
      }
   }
}
