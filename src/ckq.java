import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ckq extends cjv implements byc {
   private static final aku<Integer> bI = aky.a(ckq.class, akw.b);
   private static final aku<jg<ckr>> bJ = aky.a(ckq.class, akw.D);
   private final byb bK = new byb(this.al, bI);

   public ckq(bxn<? extends ckq> $$0, dkj $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cev(this));
      this.bF.a(1, new cfu(this, 1.25));
      this.bF.a(3, new cen(this, 1.0));
      this.bF.a(4, new cgj(this, 1.2, $$0 -> $$0.a(dao.oA), false));
      this.bF.a(4, new cgj(this, 1.2, $$0 -> $$0.a(axv.ax), false));
      this.bF.a(5, new cfa(this, 1.1));
      this.bF.a(6, new cgo(this, 1.0));
      this.bF.a(7, new cfj(this, csi.class, 6.0F));
      this.bF.a(8, new cfw(this));
   }

   public static bzk.a q() {
      return cjv.gz().a(bzl.s, 10.0).a(bzl.v, 0.25);
   }

   @Nullable
   @Override
   public byf cW() {
      return (byf)(this.fZ() && this.cZ() instanceof csi $$0 && $$0.b(dao.oA) ? $$0 : super.cW());
   }

   @Override
   public void a(aku<?> $$0) {
      if (bI.equals($$0) && this.dV().C) {
         this.bK.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(aky.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
      $$0.a(bJ, cur.a(this.dX(), cks.d));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cur.a($$0, this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cur.a($$0, this.dX(), mi.ba).ifPresent(this::j);
   }

   @Override
   protected awx u() {
      return awy.uo;
   }

   @Override
   protected awx e(bvt $$0) {
      return awy.uq;
   }

   @Override
   protected awx l_() {
      return awy.up;
   }

   @Override
   protected void b(iw $$0, ebq $$1) {
      this.a(awy.us, 0.15F, 1.0F);
   }

   @Override
   public bvc b(csi $$0, bvb $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bvc.a;
      } else {
         bvc $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            dak $$4 = $$0.b($$1);
            return (bvc)(this.a($$4, bxo.h) ? $$4.a($$0, this, $$1) : bvc.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bxo $$0) {
      return $$0 != bxo.h ? super.e($$0) : this.bJ() && !this.n_();
   }

   @Override
   protected boolean f(bxo $$0) {
      return $$0 == bxo.h || super.f($$0);
   }

   @Override
   protected jg<awx> a(bxo $$0, dak $$1, dit $$2) {
      return (jg<awx>)($$0 == bxo.h ? awy.ur : super.a($$0, $$1, $$2));
   }

   @Override
   public fgc b(byf $$0) {
      jc $$1 = this.cP();
      if ($$1.o() == jc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cvb.a($$1);
         iw $$3 = this.dv();
         iw.a $$4 = new iw.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            byr $$5 = (byr)var6.next();
            ffx $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (cvb.a($$8)) {
                  fgc $$9 = fgc.a($$4, $$8);
                  if (cvb.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(asb $$0, bye $$1) {
      if ($$0.an() != buz.a) {
         cqf $$2 = this.a(bxn.bS, bwy.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(bxo.a, new dak(dao.pK));
            }

            $$0x.gc();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(csi $$0, fgc $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bK.b();
   }

   @Override
   protected fgc b(csi $$0, fgc $$1) {
      return new fgc(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(csi $$0) {
      return (float)(this.h(bzl.v) * 0.225 * (double)this.bK.c());
   }

   @Override
   public boolean a() {
      return this.bK.a(this.dY());
   }

   @Nullable
   public ckq b(asb $$0, bwu $$1) {
      ckq $$2 = bxn.aR.a($$0, bxm.e);
      if ($$2 != null && $$1 instanceof ckq $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean i(dak $$0) {
      return $$0.a(axv.ax);
   }

   @Override
   public fgc cT() {
      return new fgc(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(jg<ckr> $$0) {
      this.al.a(bJ, $$0);
   }

   public jg<ckr> t() {
      return this.al.a(bJ);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aH ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aH) {
         this.j(c(kl.aH, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public byx a(dla $$0, bva $$1, bxm $$2, @Nullable byx $$3) {
      cks.a(this.ae, this.dX(), cuo.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
