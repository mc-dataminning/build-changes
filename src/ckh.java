import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class ckh extends cjm implements bxt {
   private static final akn<Integer> bI = akr.a(ckh.class, akp.b);
   private static final akn<jg<cki>> bJ = akr.a(ckh.class, akp.D);
   private final bxs bK = new bxs(this.al, bI);

   public ckh(bxe<? extends ckh> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bF.a(0, new cem(this));
      this.bF.a(1, new cfl(this, 1.25));
      this.bF.a(3, new cee(this, 1.0));
      this.bF.a(4, new cga(this, 1.2, $$0 -> $$0.a(dae.oA), false));
      this.bF.a(4, new cga(this, 1.2, $$0 -> $$0.a(axo.ax), false));
      this.bF.a(5, new cer(this, 1.1));
      this.bF.a(6, new cgf(this, 1.0));
      this.bF.a(7, new cfa(this, crz.class, 6.0F));
      this.bF.a(8, new cfn(this));
   }

   public static bzb.a q() {
      return cjm.gz().a(bzc.s, 10.0).a(bzc.v, 0.25);
   }

   @Nullable
   @Override
   public bxw cW() {
      return (bxw)(this.fZ() && this.cZ() instanceof crz $$0 && $$0.b(dae.oA) ? $$0 : super.cW());
   }

   @Override
   public void a(akn<?> $$0) {
      if (bI.equals($$0) && this.dV().C) {
         this.bK.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, 0);
      $$0.a(bJ, cui.a(this.dX(), ckj.d));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cui.a($$0, this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cui.a($$0, this.dX(), mi.ba).ifPresent(this::j);
   }

   @Override
   protected awq u() {
      return awr.uo;
   }

   @Override
   protected awq e(bvk $$0) {
      return awr.uq;
   }

   @Override
   protected awq l_() {
      return awr.up;
   }

   @Override
   protected void b(iw $$0, ebg $$1) {
      this.a(awr.us, 0.15F, 1.0F);
   }

   @Override
   public but b(crz $$0, bus $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.fZ() && !this.bZ() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return but.a;
      } else {
         but $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            daa $$4 = $$0.b($$1);
            return (but)(this.a($$4, bxf.h) ? $$4.a($$0, this, $$1) : but.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bxf $$0) {
      return $$0 != bxf.h ? super.e($$0) : this.bJ() && !this.n_();
   }

   @Override
   protected boolean f(bxf $$0) {
      return $$0 == bxf.h || super.f($$0);
   }

   @Override
   protected jg<awq> a(bxf $$0, daa $$1, dij $$2) {
      return (jg<awq>)($$0 == bxf.h ? awr.ur : super.a($$0, $$1, $$2));
   }

   @Override
   public ffs b(bxw $$0) {
      jc $$1 = this.cP();
      if ($$1.o() == jc.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = cus.a($$1);
         iw $$3 = this.dv();
         iw.a $$4 = new iw.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            byi $$5 = (byi)var6.next();
            ffn $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (cus.a($$8)) {
                  ffs $$9 = ffs.a($$4, $$8);
                  if (cus.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(aru $$0, bxv $$1) {
      if ($$0.an() != buq.a) {
         cpw $$2 = this.a(bxe.bS, bwp.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(bxf.a, new daa(dae.pK));
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
   protected void a(crz $$0, ffs $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bK.b();
   }

   @Override
   protected ffs b(crz $$0, ffs $$1) {
      return new ffs(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crz $$0) {
      return (float)(this.h(bzc.v) * 0.225 * (double)this.bK.c());
   }

   @Override
   public boolean a() {
      return this.bK.a(this.dY());
   }

   @Nullable
   public ckh b(aru $$0, bwl $$1) {
      ckh $$2 = bxe.aR.a($$0, bxd.e);
      if ($$2 != null && $$1 instanceof ckh $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean i(daa $$0) {
      return $$0.a(axo.ax);
   }

   @Override
   public ffs cT() {
      return new ffs(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(jg<cki> $$0) {
      this.al.a(bJ, $$0);
   }

   public jg<cki> t() {
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
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      ckj.a(this.ae, this.dX(), cuf.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
