import com.mojang.serialization.MapCodec;

public class drr extends doe {
   public static final MapCodec<drr> b = b(drr::new);
   public static final eaq c = eap.A;

   @Override
   public MapCodec<drr> a() {
      return b;
   }

   public drr(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(a, ja.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(diy $$0, djk $$1, iu $$2) {
      if (!$$0.w_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(div $$0, iu $$1, dzz $$2) {
      ja $$3 = $$2.c(a);
      iu $$4 = $$1.a($$3.g());
      exo $$5 = exk.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dzz $$0) {
      return true;
   }

   @Override
   protected int b(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dzz $$0, dib $$1, iu $$2, ja $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dzz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            dzz $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public dzz a(dcr $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
