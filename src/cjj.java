import javax.annotation.Nullable;

public class cjj extends ciu {
   private static final akj<jf<cjk>> bG = akn.a(cjj.class, akl.z);

   public cjj(bwr<? extends cjj> $$0, djm $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, ctv.a(this.dW(), cjl.a));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctv.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctv.a($$0, this.dW(), mh.aM).ifPresent(this::j);
   }

   @Nullable
   public cjj b(arq $$0, bvy $$1) {
      cjj $$2 = bwr.C.a($$0, bwq.e);
      if ($$2 != null && $$1 instanceof cjj $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public byb a(dkd $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      cjl.a(this.ae, this.dW(), cts.a($$0, this.du())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(jf<cjk> $$0) {
      this.al.a(bG, $$0);
   }

   public jf<cjk> t() {
      return this.al.a(bG);
   }

   @Nullable
   @Override
   public <T> T a(kj<? extends T> $$0) {
      return $$0 == kk.aI ? c((kj<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kf $$0) {
      this.a($$0, kk.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kj<T> $$0, T $$1) {
      if ($$0 == kk.aI) {
         this.j(c(kk.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
