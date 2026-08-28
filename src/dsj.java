import com.mojang.serialization.MapCodec;

public class dsj extends dov {
   public static final MapCodec<dsj> b = b(dsj::new);
   public static final ebk c = ebj.A;

   @Override
   public MapCodec<dsj> a() {
      return b;
   }

   public dsj(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(a, jb.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected eat a(eat $$0, dtl $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected eat a(eat $$0, dru $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(djp $$0, dkb $$1, iv $$2) {
      if (!$$0.w_() && !$$1.U().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(djm $$0, iv $$1, eat $$2) {
      jb $$3 = $$2.c(a);
      iv $$4 = $$1.a($$3.g());
      eyi $$5 = eye.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(eat $$0) {
      return true;
   }

   @Override
   protected int b(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(eat $$0, diq $$1, iv $$2, jb $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, eat $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.w_() && $$0.c(c) && !$$1.U().a($$2, this)) {
            eat $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, boolean $$3) {
      if ($$0.c(c) && $$1.n().a($$2, this)) {
         this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
      }
   }

   @Override
   public eat a(ddg $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
