import javax.annotation.Nullable;

public class cjw extends cjh {
   private static final akn<jg<cjx>> bI = akr.a(cjw.class, akp.z);

   public cjw(bxe<? extends cjw> $$0, djz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akr.a $$0) {
      super.a($$0);
      $$0.a(bI, cui.a(this.dX(), cjy.a));
   }

   @Override
   public void b(ua $$0) {
      super.b($$0);
      cui.a($$0, this.t());
   }

   @Override
   public void a(ua $$0) {
      super.a($$0);
      cui.a($$0, this.dX(), mi.aM).ifPresent(this::j);
   }

   @Nullable
   public cjw b(aru $$0, bwl $$1) {
      cjw $$2 = bxe.D.a($$0, bxd.e);
      if ($$2 != null && $$1 instanceof cjw $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public byo a(dkq $$0, bur $$1, bxd $$2, @Nullable byo $$3) {
      cjy.a(this.ae, this.dX(), cuf.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(jg<cjx> $$0) {
      this.al.a(bI, $$0);
   }

   public jg<cjx> t() {
      return this.al.a(bI);
   }

   @Nullable
   @Override
   public <T> T a(kk<? extends T> $$0) {
      return $$0 == kl.aI ? c((kk<T>)$$0, this.t()) : super.a($$0);
   }

   @Override
   protected void a(kg $$0) {
      this.a($$0, kl.aI);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(kk<T> $$0, T $$1) {
      if ($$0 == kl.aI) {
         this.j(c(kl.aI, $$1));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
