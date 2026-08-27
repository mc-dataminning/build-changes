import com.mojang.serialization.MapCodec;

public class dec extends dav {
   public static final MapCodec<dec> b = b(dec::new);
   public static final dma c = dlz.w;

   @Override
   public MapCodec<dec> a() {
      return b;
   }

   public dec(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ie.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dlj a(dlj $$0, dfe $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dlj a(dlj $$0, ddo $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cvs $$0, hz $$1) {
      if (!$$0.y_() && !$$0.N().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cvr $$0, hz $$1, dlj $$2) {
      ie $$3 = $$2.c(a);
      hz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dlj $$0) {
      return true;
   }

   @Override
   protected int b(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dlj $$0, cux $$1, hz $$2, ie $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.N().a($$2, this)) {
            dlj $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dlj $$0, cvr $$1, hz $$2, dlj $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.N().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dlj a(crk $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
