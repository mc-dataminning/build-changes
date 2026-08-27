import com.mojang.serialization.MapCodec;

public class dak extends cxd {
   public static final MapCodec<dak> b = b(dak::new);
   public static final dhz c = dhy.w;

   @Override
   public MapCodec<dak> a() {
      return b;
   }

   public dak(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, hx.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(a, c);
   }

   @Override
   public dhi a(dhi $$0, dbm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   public dhi a(dhi $$0, czw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(csb $$0, ht $$1) {
      if (!$$0.x_() && !$$0.M().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(csa $$0, ht $$1, dhi $$2) {
      hx $$3 = $$2.c(a);
      ht $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   public boolean f_(dhi $$0) {
      return true;
   }

   @Override
   public int b(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   public int a(dhi $$0, crg $$1, ht $$2, hx $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   public void b(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.M().a($$2, this)) {
            dhi $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, dhi $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.M().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dhi a(cnr $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
