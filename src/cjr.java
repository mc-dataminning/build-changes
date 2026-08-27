import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import java.util.UUID;
import javax.annotation.Nullable;

public class cjr extends ceg implements bsn, btg {
   private static final UUID bY = UUID.fromString("9e362924-01de-4ddd-a2b2-d0f7a405a174");
   private static final btw bZ = new btw(bY, "Strider suffocating modifier", -0.34F, btw.a.b);
   private static final float cb = 0.35F;
   private static final float cc = 0.55F;
   private static final ajs<Integer> cd = ajw.a(cjr.class, aju.b);
   private static final ajs<Boolean> ce = ajw.a(cjr.class, aju.k);
   private static final ajs<Boolean> cf = ajw.a(cjr.class, aju.k);
   private final bsm cg = new bsm(this.ao, cd, cf);
   @Nullable
   private caw ch;

   public cjr(bsc<? extends cjr> $$0, daz $$1) {
      super($$0, $$1);
      this.J = true;
      this.a(enn.j, -1.0F);
      this.a(enn.i, 0.0F);
      this.a(enn.n, 0.0F);
      this.a(enn.o, 0.0F);
   }

   public static boolean c(bsc<cjr> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      io.a $$5 = $$3.j();

      do {
         $$5.c(it.b);
      } while ($$1.b_($$5).a(awc.b));

      return $$1.a_($$5).i();
   }

   @Override
   public void a(ajs<?> $$0) {
      if (cd.equals($$0) && this.dP().B) {
         this.cg.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(cd, 0);
      $$0.a(ce, false);
      $$0.a(cf, false);
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      this.cg.a($$0);
   }

   @Override
   public void a(ud $$0) {
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
   public void a(@Nullable avj $$0) {
      this.cg.a(true);
      if ($$0 != null) {
         this.dP().a(null, this, avi.yb, $$0, 0.5F, 1.0F);
      }
   }

   @Override
   protected void z() {
      this.bS.a(1, new cah(this, 1.65));
      this.bS.a(2, new bza(this, 1.0));
      this.ch = new caw(this, 1.4, $$0 -> $$0.a(awf.au), false);
      this.bS.a(3, this.ch);
      this.bS.a(4, new cjr.a(this, 1.0));
      this.bS.a(5, new bzn(this, 1.0));
      this.bS.a(7, new cal(this, 1.0, 60));
      this.bS.a(8, new bzw(this, cly.class, 8.0F));
      this.bS.a(8, new caj(this));
      this.bS.a(9, new bzw(this, cjr.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.ao.a(ce, $$0);
      btu $$1 = this.f(bty.r);
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
   public boolean a(emw $$0) {
      return $$0.a(awc.b);
   }

   @Override
   protected eum a(brw $$0, brz $$1, float $$2) {
      float $$3 = Math.min(0.25F, this.aU.a());
      float $$4 = this.aU.b();
      float $$5 = 0.12F * ayf.b($$4 * 1.5F) * 2.0F * $$3;
      return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
   }

   @Override
   public boolean a(dbc $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bsq cQ() {
      return (bsq)(this.i() && this.cT() instanceof cly $$0 && $$0.b(ctt.nS) ? $$0 : super.cQ());
   }

   @Override
   public eum b(bsq $$0) {
      eum[] $$1 = new eum[]{
         a((double)this.dj(), (double)$$0.dj(), $$0.dF()),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 22.5F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() - 45.0F),
         a((double)this.dj(), (double)$$0.dj(), $$0.dF() + 45.0F)
      };
      Set<io> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cK().e;
      double $$4 = this.cK().b - 0.5;
      io.a $$5 = new io.a();

      for (eum $$6 : $$1) {
         $$5.b(this.du() + $$6.c, $$3, this.dA() + $$6.e);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.i());
            $$5.c(it.a);
         }
      }

      for (io $$8 : $$2) {
         if (!this.dP().b_($$8).a(awc.b)) {
            double $$9 = this.dP().j($$8);
            if (cny.a($$9)) {
               eum $$10 = eum.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fI().iterator();

               while (var14.hasNext()) {
                  btc $$11 = (btc)var14.next();
                  euh $$12 = $$0.f($$11);
                  if (cny.a(this.dP(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new eum(this.du(), this.cK().e, this.dA());
   }

   @Override
   protected void a(cly $$0, eum $$1) {
      this.a($$0.dF(), $$0.dH() * 0.5F);
      this.O = this.aY = this.ba = this.dF();
      this.cg.b();
      super.a($$0, $$1);
   }

   @Override
   protected eum b(cly $$0, eum $$1) {
      return new eum(0.0, 0.0, 1.0);
   }

   @Override
   protected float e(cly $$0) {
      return (float)(this.g(bty.r) * (double)(this.s() ? 0.35F : 0.55F) * (double)this.cg.c());
   }

   @Override
   protected float aO() {
      return this.aa + 0.6F;
   }

   @Override
   protected void b(io $$0, drd $$1) {
      this.a(this.bs() ? avi.xZ : avi.xY, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.cg.a(this.el());
   }

   @Override
   protected void a(double $$0, boolean $$1, drd $$2, io $$3) {
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
         this.b(avi.xU);
      } else if (this.gm() && this.ah.a(60) == 0) {
         this.b(avi.xV);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            drd $$0 = this.dP().a_(this.dp());
            drd $$1 = this.bo();
            $$2 = $$0.a(avx.aU) || $$1.a(avx.aU) || this.b(awc.b) > 0.0;
            if (this.dc() instanceof cjr $$3 && $$3.s()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.l();
      this.gp();
      this.aS();
   }

   private boolean y() {
      return this.ch != null && this.ch.i();
   }

   @Override
   protected boolean B() {
      return true;
   }

   private void gp() {
      if (this.bs()) {
         eur $$0 = eur.a(this);
         if ($$0.a(diq.d, this.dp(), true) && !this.dP().b_(this.dp().c()).a(awc.b)) {
            this.d(true);
         } else {
            this.g(this.ds().a(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static btx.a u() {
      return bss.A().a(bty.r, 0.175F).a(bty.k, 16.0);
   }

   @Override
   protected avh v() {
      return !this.gm() && !this.y() ? avi.xT : null;
   }

   @Override
   protected avh d(bqp $$0) {
      return avi.xX;
   }

   @Override
   protected avh o_() {
      return avi.xW;
   }

   @Override
   protected boolean r(brw $$0) {
      return !this.bS() && !this.a(awc.b);
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
   protected ccc b(daz $$0) {
      return new cjr.b(this, $$0);
   }

   @Override
   public float a(io $$0, dbc $$1) {
      if ($$1.a_($$0).u().a(awc.b)) {
         return 10.0F;
      } else {
         return this.bs() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cjr b(aqn $$0, brq $$1) {
      return bsc.aZ.a((daz)$$0);
   }

   @Override
   public boolean o(ctq $$0) {
      return $$0.a(awf.at);
   }

   @Override
   protected void eD() {
      super.eD();
      if (this.i()) {
         this.a(ctt.nL);
      }
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      boolean $$2 = this.o($$0.b($$1));
      if (!$$2 && this.i() && !this.bS() && !$$0.fR()) {
         if (!this.dP().B) {
            $$0.n(this);
         }

         return bpw.a(this.dP().B);
      } else {
         bpw $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            ctq $$4 = $$0.b($$1);
            return $$4.a(ctt.nL) ? $$4.a($$0, this, $$1) : bpw.d;
         } else {
            if ($$2 && !this.aW()) {
               this.dP().a(null, this.du(), this.dw(), this.dA(), avi.ya, this.de(), 1.0F, 1.0F + (this.ah.i() - this.ah.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public eum cM() {
      return new eum(0.0, (double)(0.6F * this.cL()), (double)(this.dj() * 0.4F));
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      if (this.p_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         aym $$4 = $$0.E_();
         if ($$4.a(30) == 0) {
            bss $$5 = bsc.bx.a((daz)$$0.E());
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new cjx.b(cjx.a($$4), false));
               $$5.a(bsd.a, new ctq(ctt.nS));
               this.a(null);
            }
         } else if ($$4.a(10) == 0) {
            brq $$6 = bsc.aZ.a((daz)$$0.E());
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new brq.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private btj a(dbo $$0, bpu $$1, bss $$2, @Nullable btj $$3) {
      $$2.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
      $$2.a($$0, $$1, bsu.g, $$3);
      $$2.a(this, true);
      return new brq.a(0.0F);
   }

   static class a extends cab {
      private final cjr g;

      a(cjr $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public io k() {
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
      protected boolean a(dbc $$0, io $$1) {
         return $$0.a_($$1).a(dec.H) && $$0.a_($$1.c()).a(enl.a);
      }
   }

   static class b extends ccb {
      b(cjr $$0, daz $$1) {
         super($$0, $$1);
      }

      @Override
      protected enm a(int $$0) {
         this.o = new ens();
         this.o.a(true);
         return new enm(this.o, $$0);
      }

      @Override
      protected boolean a(enn $$0) {
         return $$0 != enn.i && $$0 != enn.o && $$0 != enn.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(io $$0) {
         return this.b.a_($$0).a(dec.H) || super.a($$0);
      }
   }
}
