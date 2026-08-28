import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cjf extends cio implements bww {
   private static final akh<Integer> bF = akl.a(cjf.class, akj.b);
   private static final akh<je<cjg>> bG = akl.a(cjf.class, akj.A);
   private final bwv bH = new bwv(this.al, bF);

   public cjf(bwj<? extends cjf> $$0, dip $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cdp(this));
      this.bC.a(1, new ceo(this, 1.25));
      this.bC.a(3, new cdh(this, 1.0));
      this.bC.a(4, new cfd(this, 1.2, $$0 -> $$0.a(cyw.ov), false));
      this.bC.a(4, new cfd(this, 1.2, $$0 -> $$0.a(axi.av), false));
      this.bC.a(5, new cdu(this, 1.1));
      this.bC.a(6, new cfi(this, 1.0));
      this.bC.a(7, new ced(this, cqs.class, 6.0F));
      this.bC.a(8, new ceq(this));
   }

   public static bye.a q() {
      return cio.gv().a(byf.s, 10.0).a(byf.v, 0.25);
   }

   @Nullable
   @Override
   public bwz cW() {
      return (bwz)(this.ak() && this.cZ() instanceof cqs $$0 && $$0.b(cyw.ov) ? $$0 : super.cW());
   }

   @Override
   public void a(akh<?> $$0) {
      if (bF.equals($$0) && this.dV().C) {
         this.bH.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
      $$0.a(bG, cta.a(this.dX(), cjh.d));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cta.a($$0, this.t());
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      cta.a($$0, this.dX(), mg.aY).ifPresent(this::j);
   }

   @Override
   protected awk u() {
      return awl.uk;
   }

   @Override
   protected awk e(bup $$0) {
      return awl.um;
   }

   @Override
   protected awk l_() {
      return awl.ul;
   }

   @Override
   protected void b(iu $$0, dzo $$1) {
      this.a(awl.uo, 0.15F, 1.0F);
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      boolean $$2 = this.k($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bty.a;
      } else {
         bty $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cys $$4 = $$0.b($$1);
            return (bty)(this.a($$4, bwk.h) ? $$4.a($$0, this, $$1) : bty.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bwk $$0) {
      return $$0 != bwk.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwk $$0) {
      return $$0 == bwk.h || super.f($$0);
   }

   @Override
   protected je<awk> a(bwk $$0, cys $$1, dhb $$2) {
      return (je<awk>)($$0 == bwk.h ? awl.un : super.a($$0, $$1, $$2));
   }

   @Override
   public fdw b(bwz $$0) {
      ja $$1 = this.cP();
      if ($$1.o() == ja.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = ctk.a($$1);
         iu $$3 = this.dv();
         iu.a $$4 = new iu.a();
         UnmodifiableIterator var6 = $$0.fN().iterator();

         while (var6.hasNext()) {
            bxl $$5 = (bxl)var6.next();
            fdr $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (ctk.a($$8)) {
                  fdw $$9 = fdw.a($$4, $$8);
                  if (ctk.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(aro $$0, bwy $$1) {
      if ($$0.an() != btv.a) {
         cop $$2 = this.a(bwj.bR, bvu.a(this, false, true), $$0x -> {
            if (this.fa().f()) {
               $$0x.a(bwk.a, new cys(cyw.pF));
            }

            $$0x.fY();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cqs $$0, fdw $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bH.b();
   }

   @Override
   protected fdw b(cqs $$0, fdw $$1) {
      return new fdw(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqs $$0) {
      return (float)(this.h(byf.v) * 0.225 * (double)this.bH.c());
   }

   @Override
   public boolean a() {
      return this.bH.a(this.dY());
   }

   @Nullable
   public cjf b(aro $$0, bvq $$1) {
      cjf $$2 = bwj.aQ.a($$0, bwi.e);
      if ($$2 != null && $$1 instanceof cjf $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean k(cys $$0) {
      return $$0.a(axi.av);
   }

   @Override
   public fdw cT() {
      return new fdw(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(je<cjg> $$0) {
      this.al.a(bG, $$0);
   }

   public je<cjg> t() {
      return this.al.a(bG);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aG ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aG);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aG) {
         this.j(c(kj.aG, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      cjh.a(this.ae, this.dX(), csx.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
