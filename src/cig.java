import com.google.common.collect.UnmodifiableIterator;
import java.util.Optional;
import javax.annotation.Nullable;

public class cig extends chp implements bvv, bwo, bwy<jr<cih>> {
   private static final ajx<Boolean> bF = akb.a(cig.class, ajz.k);
   private static final ajx<Integer> bG = akb.a(cig.class, ajz.b);
   private static final ajx<jr<cih>> bH = akb.a(cig.class, ajz.A);
   private final bvu bJ = new bvu(this.al, bG, bF);

   public cig(bvi<? extends cig> $$0, dgz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bC.a(0, new ccq(this));
      this.bC.a(1, new cdp(this, 1.25));
      this.bC.a(3, new cci(this, 1.0));
      this.bC.a(4, new cee(this, 1.2, $$0 -> $$0.a(cxl.ov), false));
      this.bC.a(4, new cee(this, 1.2, $$0 -> $$0.a(awy.av), false));
      this.bC.a(5, new ccv(this, 1.1));
      this.bC.a(6, new cej(this, 1.0));
      this.bC.a(7, new cde(this, cpr.class, 6.0F));
      this.bC.a(8, new cdr(this));
   }

   public static bxf.a q() {
      return chp.gx().a(bxg.s, 10.0).a(bxg.v, 0.25);
   }

   @Nullable
   @Override
   public bvy cV() {
      return (bvy)(this.j() && this.cY() instanceof cpr $$0 && $$0.b(cxl.ov) ? $$0 : super.cV());
   }

   @Override
   public void a(ajx<?> $$0) {
      if (bG.equals($$0) && this.dU().C) {
         this.bJ.a();
      }

      super.a($$0);
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(bF, false);
      $$0.a(bG, 0);
      ke<cih> $$1 = this.dW().e(mc.aU);
      $$0.a(bH, $$1.a(cii.d).or($$1::a).orElseThrow());
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      this.t().e().ifPresent($$1 -> $$0.a("variant", $$1.a().toString()));
      this.bJ.a($$0);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.bJ.b($$0);
      Optional.ofNullable(aku.c($$0.l("variant"))).map($$0x -> akt.a(mc.aU, $$0x)).flatMap($$0x -> this.dW().e(mc.aU).a($$0x)).ifPresent(this::j);
   }

   @Override
   protected avz u() {
      return awa.uk;
   }

   @Override
   protected avz e(btp $$0) {
      return awa.um;
   }

   @Override
   protected avz l_() {
      return awa.ul;
   }

   @Override
   protected void b(ji $$0, dxq $$1) {
      this.a(awa.uo, 0.15F, 1.0F);
   }

   @Override
   public bsy b(cpr $$0, bsx $$1) {
      boolean $$2 = this.j($$0.b($$1));
      if (!$$2 && this.j() && !this.bZ() && !$$0.ga()) {
         if (!this.dU().C) {
            $$0.n(this);
         }

         return bsy.a;
      } else {
         bsy $$3 = super.b($$0, $$1);
         if (!$$3.a()) {
            cxh $$4 = $$0.b($$1);
            return (bsy)($$4.a(cxl.op) ? $$4.a($$0, this, $$1) : bsy.e);
         } else {
            return $$3;
         }
      }
   }

   @Override
   public boolean e() {
      return this.bJ() && !this.n_();
   }

   @Override
   protected void f(ard $$0) {
      super.f($$0);
      if (this.j()) {
         this.a($$0, cxl.op);
      }
   }

   @Override
   public boolean j() {
      return this.bJ.d();
   }

   @Override
   public void a(cxh $$0, @Nullable awb $$1) {
      this.bJ.a(true);
      if ($$1 != null) {
         this.dU().a(null, this, awa.un, $$1, 0.5F, 1.0F);
      }
   }

   @Override
   public fbx b(bvy $$0) {
      jn $$1 = this.cO();
      if ($$1.o() == jn.a.b) {
         return super.b($$0);
      } else {
         int[][] $$2 = crw.a($$1);
         ji $$3 = this.du();
         ji.a $$4 = new ji.a();
         UnmodifiableIterator var6 = $$0.fQ().iterator();

         while (var6.hasNext()) {
            bwk $$5 = (bwk)var6.next();
            fbs $$6 = $$0.f($$5);

            for (int[] $$7 : $$2) {
               $$4.d($$3.u() + $$7[0], $$3.v(), $$3.w() + $$7[1]);
               double $$8 = this.dU().j($$4);
               if (crw.a($$8)) {
                  fbx $$9 = fbx.a($$4, $$8);
                  if (crw.a(this.dU(), $$0, $$6.c($$9))) {
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
   public void a(ard $$0, bvx $$1) {
      if ($$0.an() != bsv.a) {
         cnn $$2 = this.a(bvi.bQ, buu.a(this, false, true), $$0x -> {
            if (this.eZ().f()) {
               $$0x.a(bvj.a, new cxh(cxl.pD));
            }

            $$0x.ga();
         });
         if ($$2 == null) {
            super.a($$0, $$1);
         }
      } else {
         super.a($$0, $$1);
      }
   }

   @Override
   protected void a(cpr $$0, fbx $$1) {
      super.a($$0, $$1);
      this.b($$0.dK(), $$0.dM() * 0.5F);
      this.N = this.aV = this.aX = this.dK();
      this.bJ.b();
   }

   @Override
   protected fbx b(cpr $$0, fbx $$1) {
      return new fbx(0.0, 0.0, 1.0);
   }

   @Override
   protected float c(cpr $$0) {
      return (float)(this.h(bxg.v) * 0.225 * (double)this.bJ.c());
   }

   @Override
   public boolean a() {
      return this.bJ.a(this.dX());
   }

   @Nullable
   public cig b(ard $$0, buq $$1) {
      cig $$2 = bvi.aQ.a($$0, bvh.e);
      if ($$2 != null && $$1 instanceof cig $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public boolean j(cxh $$0) {
      return $$0.a(awy.av);
   }

   @Override
   public fbx cS() {
      return new fbx(0.0, (double)(0.6F * this.cR()), (double)(this.dp() * 0.4F));
   }

   public void j(jr<cih> $$0) {
      this.al.a(bH, $$0);
   }

   public jr<cih> t() {
      return this.al.a(bH);
   }

   @Override
   public bwr a(dhq $$0, bsw $$1, bvh $$2, @Nullable bwr $$3) {
      jr<dic> $$4 = $$0.t(this.du());
      cii.a(this.ae, this.dW(), $$4).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }
}
