import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Set;
import javax.annotation.Nullable;

public class cnw extends cig implements bwo {
   private static final ald bE = ald.b("suffocating");
   private static final bxv bF = new bxv(bE, -0.34F, bxv.a.b);
   private static final float bG = 0.35F;
   private static final float bI = 0.55F;
   private static final akg<Integer> bJ = akk.a(cnw.class, aki.b);
   private static final akg<Boolean> bK = akk.a(cnw.class, aki.k);
   private final bwn bL = new bwn(this.al, bJ);
   @Nullable
   private cev bM;

   public cnw(bwb<? extends cnw> $$0, dhp $$1) {
      super($$0, $$1);
      this.I = true;
      this.a(evk.j, -1.0F);
      this.a(evk.i, 0.0F);
      this.a(evk.n, 0.0F);
      this.a(evk.o, 0.0F);
   }

   public static boolean c(bwb<cnw> $$0, dhq $$1, bwa $$2, jj $$3, azs $$4) {
      jj.a $$5 = $$3.k();

      do {
         $$5.c(jo.b);
      } while ($$1.b_($$5).a(axf.b));

      return $$1.a_($$5).l();
   }

   @Override
   public void a(akg<?> $$0) {
      if (bJ.equals($$0) && this.dV().C) {
         this.bL.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(bJ, 0);
      $$0.a(bK, false);
   }

   @Override
   public boolean e(bwc $$0) {
      return $$0 != bwc.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwc $$0) {
      return $$0 == bwc.h || super.f($$0);
   }

   @Override
   protected js<awj> a(bwc $$0, cxy $$1, dgc $$2) {
      return (js<awj>)($$0 == bwc.h ? awk.zc : super.a($$0, $$1, $$2));
   }

   @Override
   protected void D() {
      this.bB.a(1, new ceg(this, 1.65));
      this.bB.a(2, new ccz(this, 1.0));
      this.bM = new cev(this, 1.4, $$0 -> $$0.a(axi.ay), false);
      this.bB.a(3, this.bM);
      this.bB.a(4, new cnw.a(this, 1.0));
      this.bB.a(5, new cdm(this, 1.0));
      this.bB.a(7, new cek(this, 1.0, 60));
      this.bB.a(8, new cdv(this, cqi.class, 8.0F));
      this.bB.a(8, new cei(this));
      this.bB.a(9, new cdv(this, cnw.class, 8.0F));
   }

   public void w(boolean $$0) {
      this.al.a(bK, $$0);
      bxt $$1 = this.g(bxx.v);
      if ($$1 != null) {
         if ($$0) {
            $$1.a(bF);
         } else {
            $$1.c(bE);
         }
      }
   }

   public boolean q() {
      return this.al.a(bK);
   }

   @Override
   public boolean a(eut $$0) {
      return $$0.a(axf.b);
   }

   @Override
   protected fcu a(bvs $$0, bvv $$1, float $$2) {
      if (!this.dV().w_()) {
         return super.a($$0, $$1, $$2);
      } else {
         float $$3 = Math.min(0.25F, this.aS.b());
         float $$4 = this.aS.c();
         float $$5 = 0.12F * azk.b($$4 * 1.5F) * 2.0F * $$3;
         return super.a($$0, $$1, $$2).b(0.0, (double)($$5 * $$2), 0.0);
      }
   }

   @Override
   public boolean a(dhs $$0) {
      return $$0.f(this);
   }

   @Nullable
   @Override
   public bwr cW() {
      return (bwr)(this.ak() && this.cZ() instanceof cqi $$0 && $$0.b(cyc.ow) ? $$0 : super.cW());
   }

   @Override
   public fcu b(bwr $$0) {
      fcu[] $$1 = new fcu[]{
         a((double)this.dq(), (double)$$0.dq(), $$0.dL()),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 22.5F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() - 45.0F),
         a((double)this.dq(), (double)$$0.dq(), $$0.dL() + 45.0F)
      };
      Set<jj> $$2 = Sets.newLinkedHashSet();
      double $$3 = this.cR().e;
      double $$4 = this.cR().b - 0.5;
      jj.a $$5 = new jj.a();

      for (fcu $$6 : $$1) {
         $$5.b(this.dA() + $$6.d, $$3, this.dG() + $$6.f);

         for (double $$7 = $$3; $$7 > $$4; $$7--) {
            $$2.add($$5.j());
            $$5.c(jo.a);
         }
      }

      for (jj $$8 : $$2) {
         if (!this.dV().b_($$8).a(axf.b)) {
            double $$9 = this.dV().j($$8);
            if (csn.a($$9)) {
               fcu $$10 = fcu.a($$8, $$9);
               UnmodifiableIterator var14 = $$0.fN().iterator();

               while (var14.hasNext()) {
                  bxd $$11 = (bxd)var14.next();
                  fcp $$12 = $$0.f($$11);
                  if (csn.a(this.dV(), $$0, $$12.c($$10))) {
                     $$0.b($$11);
                     return $$10;
                  }
               }
            }
         }
      }

      return new fcu(this.dA(), this.cR().e, this.dG());
   }

   @Override
   protected void a(cqi $$0, fcu $$1) {
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aU = this.aW = this.dL();
      this.bL.b();
      super.a($$0, $$1);
   }

   @Override
   protected fcu b(cqi $$0, fcu $$1) {
      return new fcu(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqi $$0) {
      return (float)(this.h(bxx.v) * (double)(this.q() ? 0.35F : 0.55F) * (double)this.bL.c());
   }

   @Override
   protected float aU() {
      return this.X + 0.6F;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(this.bw() ? awk.za : awk.yZ, 1.0F, 1.0F);
   }

   @Override
   public boolean a() {
      return this.bL.a(this.dY());
   }

   @Override
   protected void a(double $$0, boolean $$1, dym $$2, jj $$3) {
      if (this.bw()) {
         this.k();
      } else {
         super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   public void h() {
      if (this.x() && this.ae.a(140) == 0) {
         this.b(awk.yV);
      } else if (this.gn() && this.ae.a(60) == 0) {
         this.b(awk.yW);
      }

      if (!this.gf()) {
         boolean $$2;
         boolean var10000;
         label36: {
            dym $$0 = this.dV().a_(this.dv());
            dym $$1 = this.bs();
            $$2 = $$0.a(awz.aW) || $$1.a(awz.aW) || this.b(axf.b) > 0.0;
            if (this.dk() instanceof cnw $$3 && $$3.q()) {
               var10000 = true;
               break label36;
            }

            var10000 = false;
         }

         boolean $$4 = var10000;
         this.w(!$$2 || $$4);
      }

      super.h();
      this.gq();
   }

   private boolean x() {
      return this.bM != null && this.bM.i();
   }

   @Override
   protected boolean F() {
      return true;
   }

   private void gq() {
      if (this.bw()) {
         fcz $$0 = fcz.a(this);
         if ($$0.a(dpo.d, this.dv(), true) && !this.dV().b_(this.dv().d()).a(axf.b)) {
            this.d(true);
         } else {
            this.i(this.dy().c(0.5).b(0.0, 0.05, 0.0));
         }
      }
   }

   public static bxw.a t() {
      return cig.gv().a(bxx.v, 0.175F);
   }

   @Override
   protected awj u() {
      return !this.gn() && !this.x() ? awk.yU : null;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.yY;
   }

   @Override
   protected awj l_() {
      return awk.yX;
   }

   @Override
   protected boolean r(bvs $$0) {
      return !this.ca() && !this.a(axf.b);
   }

   @Override
   public boolean fq() {
      return true;
   }

   @Override
   public boolean bY() {
      return false;
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cnw.b(this, $$0);
   }

   @Override
   public float a(jj $$0, dhs $$1) {
      if ($$1.a_($$0).y().a(axf.b)) {
         return 10.0F;
      } else {
         return this.bw() ? Float.NEGATIVE_INFINITY : 0.0F;
      }
   }

   @Nullable
   public cnw b(arn $$0, bvi $$1) {
      return bwb.bs.a($$0, bwa.e);
   }

   @Override
   public boolean k(cxy $$0) {
      return $$0.a(axi.ax);
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      boolean $$2 = this.k($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return btq.a;
      } else {
         btq $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxy $$4 = $$0.b($$1);
            return (btq)(this.a($$4, bwc.h) ? $$4.a($$0, this, $$1) : btq.e);
         } else {
            if ($$2 && !this.bb()) {
               this.dV().a(null, this.dA(), this.dC(), this.dG(), awk.zb, this.dm(), 1.0F, 1.0F + (this.ae.i() - this.ae.i()) * 0.2F);
            }

            return $$3;
         }
      }
   }

   @Override
   public fcu cT() {
      return new fcu(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      if (this.n_()) {
         return super.a($$0, $$1, $$2, $$3);
      } else {
         azs $$4 = $$0.C_();
         if ($$4.a(30) == 0) {
            bwt $$5 = bwb.bQ.a($$0.a(), bwa.g);
            if ($$5 != null) {
               $$3 = this.a($$0, $$1, $$5, new coc.b(coc.a($$4), false));
               $$5.a(bwc.a, new cxy(cyc.ow));
               this.a(bwc.h, new cxy(cyc.op));
               this.g(bwc.h);
            }
         } else if ($$4.a(10) == 0) {
            bvi $$6 = bwb.bs.a($$0.a(), bwa.g);
            if ($$6 != null) {
               $$6.c_(-24000);
               $$3 = this.a($$0, $$1, $$6, null);
            }
         } else {
            $$3 = new bvi.a(0.5F);
         }

         return super.a($$0, $$1, $$2, $$3);
      }
   }

   private bxj a(dig $$0, bto $$1, bwt $$2, @Nullable bxj $$3) {
      $$2.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
      $$2.a($$0, $$1, bwa.g, $$3);
      $$2.a(this, true);
      return new bvi.a(0.0F);
   }

   static class a extends cea {
      private final cnw g;

      a(cnw $$0, double $$1) {
         super($$0, $$1, 8, 2);
         this.g = $$0;
      }

      @Override
      public jj k() {
         return this.e;
      }

      @Override
      public boolean c() {
         return !this.g.bw() && this.a(this.g.dV(), this.e);
      }

      @Override
      public boolean b() {
         return !this.g.bw() && super.b();
      }

      @Override
      public boolean l() {
         return this.d % 20 == 0;
      }

      @Override
      protected boolean a(dhs $$0, jj $$1) {
         return $$0.a_($$1).a(dkw.K) && $$0.a_($$1.d()).a(evi.a);
      }
   }

   static class b extends cga {
      b(cnw $$0, dhp $$1) {
         super($$0, $$1);
      }

      @Override
      protected evj a(int $$0) {
         this.o = new evp();
         return new evj(this.o, $$0);
      }

      @Override
      protected boolean a(evk $$0) {
         return $$0 != evk.i && $$0 != evk.o && $$0 != evk.n ? super.a($$0) : true;
      }

      @Override
      public boolean a(jj $$0) {
         return this.b.a_($$0).a(dkw.K) || super.a($$0);
      }
   }
}
