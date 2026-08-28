import javax.annotation.Nullable;

public class cje extends cip {
   private static final akj<je<cjf>> bG = akn.a(cje.class, akl.z);

   public cje(bwo<? extends cje> $$0, dja $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bG, ctl.a(this.dX(), cjg.a));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      ctl.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      ctl.a($$0, this.dX(), mg.aM).ifPresent(this::j);
   }

   @Nullable
   public cje b(arq $$0, bvv $$1) {
      cje $$2 = bwo.C.a($$0, bwn.e);
      if ($$2 != null && $$1 instanceof cje $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public bxw a(djr $$0, bub $$1, bwn $$2, @Nullable bxw $$3) {
      cjg.a(this.ae, this.dX(), cti.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(je<cjf> $$0) {
      this.al.a(bG, $$0);
   }

   public je<cjf> t() {
      return this.al.a(bG);
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
