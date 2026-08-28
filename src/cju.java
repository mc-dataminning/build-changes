import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cju extends ciz implements bxg {
   private static final akj<Integer> bG = akn.a(cju.class, akl.b);
   private static final akj<jf<cjv>> bH = akn.a(cju.class, akl.C);
   private final bxf bI = new bxf(this.al, bG);

   public cju(bwr<? extends cju> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdz(this));
      this.bD.a(1, new cey(this, 1.25));
      this.bD.a(3, new cdr(this, 1.0));
      this.bD.a(4, new cfn(this, 1.2, $$0 -> $$0.a(czo.oA), false));
      this.bD.a(4, new cfn(this, 1.2, $$0 -> $$0.a(axk.aw), false));
      this.bD.a(5, new cee(this, 1.1));
      this.bD.a(6, new cfs(this, 1.0));
      this.bD.a(7, new cen(this, crj.class, 6.0F));
      this.bD.a(8, new cfa(this));
   }

   public static byo.a q() {
      return ciz.gy().a(byp.s, 10.0).a(byp.v, 0.25);
   }

   @Nullable
   @Override
   public bxj cV() {
      return (bxj)(this.fY() && this.cY() instanceof crj $$0 && $$0.b(czo.oA) ? $$0 : super.cV());
   }

   @Override
   public void a(akj<?> $$0) {
      if (bG.equals($$0) && this.dU().C) {
         this.bI.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bH, cts.a(this.dW(), cjw.d));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cts.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cts.a($$0, this.dW(), mh.ba).ifPresent(this::j);
   }

   @Override
   protected awm u() {
      return awn.uo;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.uq;
   }

   @Override
   protected awm l_() {
      return awn.up;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.us, 0.15F, 1.0F);
   }

   @Override
   public bug b(crj $$0, buf $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fY() && !this.bY() && !$$0.fX()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bug.a;
      } else {
         bug $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czk $$4 = $$0.b($$1);
            return (bug)(this.a($$4, bws.h) ? $$4.a($$0, this, $$1) : bug.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bws $$0) {
      return $$0 != bws.h ? super.e($$0) : this.bI() && !this.n_();
   }

   @Override
   protected boolean f(bws $$0) {
      return $$0 == bws.h || super.f($$0);
   }

   @Override
   protected jf<awm> a(bws $$0, czk $$1, dht $$2) {
      return (jf<awm>)($$0 == bws.h ? awn.ur : super.a($$0, $$1, $$2));
   }

   @Override
   public fex b(bxj $$0) {
      jb $$1 = this.cO();
      if ($$1.o() == jb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cuc.a($$1);
         iv $$3 = this.du();
         iv.a $$4 = new iv.a();
         UnmodifiableIterator var6 = $$0.fN().iterator();

         while (var6.hasNext()) {
            bxv $$5 = (bxv)var6.next();
            fes $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dU().j($$4);
               if (cuc.a($$8)) {
                  fex $$9 = fex.a($$4, $$8);
                  if (cuc.a(this.dU(), $$0, $$6.c($$9))) {
                     $$0.b($$5);
                     return $$9;
                  }
               }
            }
         }

         return super.b($$0);
      }
   }

   @Override
   public void a(arq $$0, bxi $$1) {
      if ($$0.an() != bud.a) {
         cpg $$2 = this.a(bwr.bR, bwc.a(this, false, true), $$0x -> {
            if (this.fa().f()) {
               $$0x.a(bws.a, new czk(czo.pK));
            }

            $$0x.gb();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(crj $$0, fex $$1) {
      super.a($$0, $$1);
      this.b($$0.dK(), $$0.dM() * 0.5F);
      this.N = this.aV = this.aX = this.dK();
      this.bI.b();
   }

   @Override
   protected fex b(crj $$0, fex $$1) {
      return new fex(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crj $$0) {
      return (float)(this.h(byp.v) * 0.225 * (double)this.bI.c());
   }

   @Override
   public boolean a() {
      return this.bI.a(this.dX());
   }

   @Nullable
   public cju b(arq $$0, bvy $$1) {
      cju $$2 = bwr.aQ.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cju $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean i(czk $$0) {
      return $$0.a(axk.aw);
   }

   @Override
   public fex cS() {
      return new fex(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   private void j(jf<cjv> $$0) {
      this.al.a(bH, $$0);
   }

   public jf<cjv> t() {
      return this.al.a(bH);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aG ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aG) {
         this.j(c(kk.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cjw.a(this.ae, this.dW(), ctp.a($$0, this.du())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
