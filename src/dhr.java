import com.mojang.serialization.MapCodec;

public class dhr extends dek {
   public static final MapCodec<dhr> b = b(dhr::new);
   public static final dpz c = dpy.w;

   @Override
   public MapCodec<dhr> a() {
      return b;
   }

   public dhr(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ij.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dpi a(dpi $$0, dit $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpi a(dpi $$0, dhd $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dpi $$0, apu $$1, id $$2, axt $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(czh $$0, id $$1) {
      if (!$$0.x_() && !$$0.O().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(czg $$0, id $$1, dpi $$2) {
      ij $$3 = $$2.c(a);
      id $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(dpi $$0) {
      return true;
   }

   @Override
   protected int b(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dpi $$0, cym $$1, id $$2, ij $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.O().a($$2, this)) {
            dpi $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dpi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.O().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
