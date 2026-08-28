import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cjl extends cis implements bwz {
   private static final akj<Integer> bF = akn.a(cjl.class, akl.b);
   private static final akj<je<cjm>> bG = akn.a(cjl.class, akl.B);
   private final bwy bH = new bwy(this.al, bF);

   public cjl(bwm<? extends cjl> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new cds(this));
      this.bC.a(1, new cer(this, 1.25));
      this.bC.a(3, new cdk(this, 1.0));
      this.bC.a(4, new cfg(this, 1.2, $$0 -> $$0.a(czc.ox), false));
      this.bC.a(4, new cfg(this, 1.2, $$0 -> $$0.a(axk.av), false));
      this.bC.a(5, new cdx(this, 1.1));
      this.bC.a(6, new cfl(this, 1.0));
      this.bC.a(7, new ceg(this, cqy.class, 6.0F));
      this.bC.a(8, new cet(this));
   }

   public static byh.a q() {
      return cis.gv().a(byi.s, 10.0).a(byi.v, 0.25);
   }

   @Nullable
   @Override
   public bxc cW() {
      return (bxc)(this.ak() && this.cZ() instanceof cqy $$0 && $$0.b(czc.ox) ? $$0 : super.cW());
   }

   @Override
   public void a(akj<?> $$0) {
      if (bF.equals($$0) && this.dV().C) {
         this.bH.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, 0);
      $$0.a(bG, ctg.a(this.dX(), cjn.d));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctg.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctg.a($$0, this.dX(), mg.aZ).ifPresent(this::j);
   }

   @Override
   protected awm u() {
      return awn.ul;
   }

   @Override
   protected awm e(bus $$0) {
      return awn.un;
   }

   @Override
   protected awm l_() {
      return awn.um;
   }

   @Override
   protected void b(iu $$0, dzz $$1) {
      this.a(awn.up, 0.15F, 1.0F);
   }

   @Override
   public bub b(cqy $$0, bua $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fX()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bub.a;
      } else {
         bub $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cyy $$4 = $$0.b($$1);
            return (bub)(this.a($$4, bwn.h) ? $$4.a($$0, this, $$1) : bub.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bwn $$0) {
      return $$0 != bwn.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwn $$0) {
      return $$0 == bwn.h || super.f($$0);
   }

   @Override
   protected je<awm> a(bwn $$0, cyy $$1, dhh $$2) {
      return (je<awm>)($$0 == bwn.h ? awn.uo : super.a($$0, $$1, $$2));
   }

   @Override
   public fei b(bxc $$0) {
      ja $$1 = this.cP();
      if ($$1.o() == ja.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = ctq.a($$1);
         iu $$3 = this.dv();
         iu.a $$4 = new iu.a();
         UnmodifiableIterator var6 = $$0.fN().iterator();

         while (var6.hasNext()) {
            bxo $$5 = (bxo)var6.next();
            fed $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (ctq.a($$8)) {
                  fei $$9 = fei.a($$4, $$8);
                  if (ctq.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(arq $$0, bxb $$1) {
      if ($$0.an() != bty.a) {
         cov $$2 = this.a(bwm.bR, bvx.a(this, false, true), $$0x -> {
            if (this.fa().f()) {
               $$0x.a(bwn.a, new cyy(czc.pH));
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
   protected void a(cqy $$0, fei $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bH.b();
   }

   @Override
   protected fei b(cqy $$0, fei $$1) {
      return new fei(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cqy $$0) {
      return (float)(this.h(byi.v) * 0.225 * (double)this.bH.c());
   }

   @Override
   public boolean a() {
      return this.bH.a(this.dY());
   }

   @Nullable
   public cjl b(arq $$0, bvt $$1) {
      cjl $$2 = bwm.aQ.a($$0, bwl.e);
      if ($$2 != null && $$1 instanceof cjl $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean j(cyy $$0) {
      return $$0.a(axk.av);
   }

   @Override
   public fei cT() {
      return new fei(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(je<cjm> $$0) {
      this.al.a(bG, $$0);
   }

   public je<cjm> t() {
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
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      cjn.a(this.ae, this.dX(), ctd.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
