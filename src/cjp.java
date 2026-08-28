import com.google.common.collect.UnmodifiableIterator;
import javax.annotation.Nullable;

public class cjp extends ciu implements bxb {
   private static final akj<Integer> bG = akn.a(cjp.class, akl.b);
   private static final akj<je<cjq>> bH = akn.a(cjp.class, akl.C);
   private final bxa bI = new bxa(this.al, bG);

   public cjp(bwo<? extends cjp> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(0, new cdu(this));
      this.bD.a(1, new cet(this, 1.25));
      this.bD.a(3, new cdm(this, 1.0));
      this.bD.a(4, new cfi(this, 1.2, $$0 -> $$0.a(czh.oA), false));
      this.bD.a(4, new cfi(this, 1.2, $$0 -> $$0.a(axk.aw), false));
      this.bD.a(5, new cdz(this, 1.1));
      this.bD.a(6, new cfn(this, 1.0));
      this.bD.a(7, new cei(this, crc.class, 6.0F));
      this.bD.a(8, new cev(this));
   }

   public static byj.a q() {
      return ciu.gw().a(byk.s, 10.0).a(byk.v, 0.25);
   }

   @Nullable
   @Override
   public bxe cW() {
      return (bxe)(this.ak() && this.cZ() instanceof crc $$0 && $$0.b(czh.oA) ? $$0 : super.cW());
   }

   @Override
   public void a(akj<?> $$0) {
      if (bG.equals($$0) && this.dV().C) {
         this.bI.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, 0);
      $$0.a(bH, ctl.a(this.dX(), cjr.d));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctl.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctl.a($$0, this.dX(), mg.ba).ifPresent(this::j);
   }

   @Override
   protected awm u() {
      return awn.uo;
   }

   @Override
   protected awm e(buu $$0) {
      return awn.uq;
   }

   @Override
   protected awm l_() {
      return awn.up;
   }

   @Override
   protected void b(iu $$0, eah $$1) {
      this.a(awn.us, 0.15F, 1.0F);
   }

   @Override
   public bud b(crc $$0, buc $$1) {
      boolean $$2 = this.i($$0.b($$1));
      if (!$$2 && this.ak() && !this.ca() && !$$0.fY()) {
         if (!this.dV().C) {
            $$0.n(this);
         }

         return bud.a;
      } else {
         bud $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            czd $$4 = $$0.b($$1);
            return (bud)(this.a($$4, bwp.h) ? $$4.a($$0, this, $$1) : bud.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e(bwp $$0) {
      return $$0 != bwp.h ? super.e($$0) : this.bK() && !this.n_();
   }

   @Override
   protected boolean f(bwp $$0) {
      return $$0 == bwp.h || super.f($$0);
   }

   @Override
   protected je<awm> a(bwp $$0, czd $$1, dhm $$2) {
      return (je<awm>)($$0 == bwp.h ? awn.ur : super.a($$0, $$1, $$2));
   }

   @Override
   public feq b(bxe $$0) {
      ja $$1 = this.cP();
      if ($$1.o() == ja.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = ctv.a($$1);
         iu $$3 = this.dv();
         iu.a $$4 = new iu.a();
         UnmodifiableIterator var6 = $$0.fO().iterator();

         while (var6.hasNext()) {
            bxq $$5 = (bxq)var6.next();
            fel $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dV().j($$4);
               if (ctv.a($$8)) {
                  feq $$9 = feq.a($$4, $$8);
                  if (ctv.a(this.dV(), $$0, $$6.c($$9))) {
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
   public void a(arq $$0, bxd $$1) {
      if ($$0.an() != bua.a) {
         coz $$2 = this.a(bwo.bR, bvz.a(this, false, true), $$0x -> {
            if (this.fb().f()) {
               $$0x.a(bwp.a, new czd(czh.pK));
            }

            $$0x.fZ();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(crc $$0, feq $$1) {
      super.a($$0, $$1);
      this.b($$0.dL(), $$0.dN() * 0.5F);
      this.N = this.aV = this.aX = this.dL();
      this.bI.b();
   }

   @Override
   protected feq b(crc $$0, feq $$1) {
      return new feq(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(crc $$0) {
      return (float)(this.h(byk.v) * 0.225 * (double)this.bI.c());
   }

   @Override
   public boolean a() {
      return this.bI.a(this.dY());
   }

   @Nullable
   public cjp b(arq $$0, bvv $$1) {
      cjp $$2 = bwo.aQ.a($$0, bwn.e);
      if ($$2 != null && $$1 instanceof cjp $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean i(czd $$0) {
      return $$0.a(axk.aw);
   }

   @Override
   public feq cT() {
      return new feq(0.0, (double)(0.6F * this.cS()), (double)(this.dq() * 0.4F));
   }

   private void j(je<cjq> $$0) {
      this.al.a(bH, $$0);
   }

   public je<cjq> t() {
      return this.al.a(bH);
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
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cjr.a(this.ae, this.dX(), cti.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
