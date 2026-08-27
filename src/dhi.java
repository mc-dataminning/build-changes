import com.mojang.serialization.MapCodec;

public class dhi extends deb {
   public static final MapCodec<dhi> b = b(dhi::new);
   public static final dpq c = dpp.w;

   @Override
   public MapCodec<dhi> a() {
      return b;
   }

   public dhi(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ih.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(cyy $$0, ib $$1) {
      if (!$$0.x_() && !$$0.O().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(cyx $$0, ib $$1, doz $$2) {
      ih $$3 = $$2.c(a);
      ib $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean f_(doz $$0) {
      return true;
   }

   @Override
   protected int b(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(doz $$0, cyd $$1, ib $$2, ih $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.O().a($$2, this)) {
            doz $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, doz $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.O().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
