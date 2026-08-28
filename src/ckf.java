import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ckf extends cjk implements bxr {
   private static final akl<Integer> bI = akp.a(ckf.class, akn.b);
   private static final akl<jf<ckg>> bJ = akp.a(ckf.class, akn.D);
   private final bxq bK = new bxq(this.al, bI);

   public ckf(bxc<? extends ckf> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cek(this));
      this.bF.a(1, new cfj(this, 1.25));
      this.bF.a(3, new cec(this, 1.0));
      this.bF.a(4, new cfy(this, 1.2, $$0 -> $$0.a(dac.oA), false));
      this.bF.a(4, new cfy(this, 1.2, $$0 -> $$0.a(axm.aw), false));
      this.bF.a(5, new cep(this, 1.1));
      this.bF.a(6, new cgd(this, 1.0));
      this.bF.a(7, new cey(this, crx.class, 6.0F));
      this.bF.a(8, new cfl(this));
   }

   public static byz.a q() {
      return cjk.gz().a(bza.s, 10.0).a(bza.v, 0.25);
   }

   @Nullable
   @Override
   public bxu cW() {
      return (bxu)(this.fZ() && this.cZ() instanceof crx $$0 && $$0.b(dac.oA) ? $$0 : super.cW());
   }

   @Override
   public void a(akl<?> $$0) {
      if (bI.equals($$0) && this.dV().C) {
         this.bK.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
      $$0.a(bJ, cug.a(this.dX(), ckh.d));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cug.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cug.a($$0, this.dX(), mh.ba).ifPresent(this::j);
   }

   @Override
   protected awo u() {
      return awp.uo;
   }

   @Override
   protected awo e(bvi $$0) {
      return awp.uq;
   }

   @Override
   protected awo l_() {
      return awp.up;
   }

   @Override
   protected void b(iv $$0, ebe $$1) {
      this.a(awp.us, 0.15F, 1.0F);
   }

   @Override
   public bur b(crx $$0, buq $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bur.a;
      } else {
         bur $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czy $$4 = $$0.b($$1);
            return (bur)(this.a($$4, bxd.h) ? $$4.a($$0, this, $$1) : bur.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bxd $$0) {
      return $$0 != bxd.h ? super.e($$0) : this.bJ() && !this.n_();
   }

   @Override
   protected boolean f(bxd $$0) {
      return $$0 == bxd.h || super.f($$0);
   }

   @Override
   protected jf<awo> a(bxd $$0, czy $$1, dih $$2) {
      return (jf<awo>)($$0 == bxd.h ? awp.ur : super.a($$0, $$1, $$2));
   }

   @Override
   public ffq b(bxu $$0) {
      jb $$1 = this.cP();
      if ($$1.o() == jb.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cuq.a($$1);
         iv $$3 = this.dv();
         iv.a $$4 = new iv.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            byg $$5 = (byg)var6.next();
            ffl $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (cuq.a($$8)) {
                  ffq $$9 = ffq.a($$4, $$8);
                  if (cuq.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(ars $$0, bxt $$1) {
      if ($$0.an() != buo.a) {
         cpu $$2 = this.a(bxc.bS, bwn.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(bxd.a, new czy(dac.pK));
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
   protected void a(crx $$0, ffq $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bK.b();
   }

   @Override
   protected ffq b(crx $$0, ffq $$1) {
      return new ffq(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crx $$0) {
      return (float)(this.h(bza.v) * 0.225 * (double)this.bK.c());
   }

   @Override
   public boolean a() {
      return this.bK.a(this.dY());
   }

   @Nullable
   public ckf b(ars $$0, bwj $$1) {
      ckf $$2 = bxc.aR.a($$0, bxb.e);
      if ($$2 != null && $$1 instanceof ckf $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean i(czy $$0) {
      return $$0.a(axm.aw);
   }

   @Override
   public ffq cT() {
      return new ffq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(jf<ckg> $$0) {
      this.al.a(bJ, $$0);
   }

   public jf<ckg> t() {
      return this.al.a(bJ);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aH ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aH) {
         this.j(c(kk.aH, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      ckh.a(this.ae, this.dX(), cud.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
