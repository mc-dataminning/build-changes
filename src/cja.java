import javax.annotation.Nullable;

public class cja extends cin {
   private static final akj<je<cjb>> bF = akn.a(cja.class, akl.y);

   public cja(bwm<? extends cja> $$0, div $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bF, ctg.a(this.dX(), cjc.a));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctg.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctg.a($$0, this.dX(), mg.aL).ifPresent(this::j);
   }

   @Nullable
   public cja b(arq $$0, bvt $$1) {
      cja $$2 = bwm.C.a($$0, bwl.e);
      if ($$2 != null && $$1 instanceof cja $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public bxu a(djm $$0, btz $$1, bwl $$2, @Nullable bxu $$3) {
      cjc.a(this.ae, this.dX(), ctd.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(je<cjb> $$0) {
      this.al.a(bF, $$0);
   }

   public je<cjb> t() {
      return this.al.a(bF);
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.aH ? c((ki<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.aH);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.aH) {
         this.j(c(kj.aH, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
