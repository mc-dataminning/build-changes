import javax.annotation.Nullable;

public class cju extends cjf {
   private static final akl<jf<cjv>> bI = akp.a(cju.class, akn.z);

   public cju(bxc<? extends cju> $$0, djx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void a(akp.a $$0) {
      super.a($$0);
      $$0.a(bI, cug.a(this.dX(), cjw.a));
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      cug.a($$0, this.t());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      cug.a($$0, this.dX(), mh.aM).ifPresent(this::j);
   }

   @Nullable
   public cju b(ars $$0, bwj $$1) {
      cju $$2 = bxc.D.a($$0, bxb.e);
      if ($$2 != null && $$1 instanceof cju $$3) {
         $$2.j(this.ae.h() ? this.t() : $$3.t());
      }

      return $$2;
   }

   @Override
   public bym a(dko $$0, bup $$1, bxb $$2, @Nullable bym $$3) {
      cjw.a(this.ae, this.dX(), cud.a($$0, this.dv())).ifPresent(this::j);
      return super.a($$0, $$1, $$2, $$3);
   }

   public void j(jf<cjv> $$0) {
      this.al.a(bI, $$0);
   }

   public jf<cjv> t() {
      return this.al.a(bI);
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
