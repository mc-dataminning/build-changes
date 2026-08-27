import com.mojang.serialization.MapCodec;

public class dap extends cxi {
   public static final MapCodec<dap> b = b(dap::new);
   public static final die c = did.w;

   @Override
   public MapCodec<dap> a() {
      return b;
   }

   public dap(dhm.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, ib.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dhn a(dhn $$0, dbr $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhn a(dhn $$0, dab $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(csg $$0, hx $$1) {
      if (!$$0.y_() && !$$0.M().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(csf $$0, hx $$1, dhn $$2) {
      ib $$3 = $$2.c(a);
      hx $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dhn $$0) {
      return true;
   }

   @Override
   public int b(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhn $$0, crl $$1, hx $$2, ib $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.y_() && $$0.c(c) && !$$1.M().a($$2, this)) {
            dhn $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, dhn $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.M().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dhn a(cnw $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
