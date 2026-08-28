import com.mojang.serialization.MapCodec;

public class dkk extends dhc {
   public static final MapCodec<dkk> b = b(dkk::new);
   public static final dst c = dss.w;

   @Override
   public MapCodec<dkk> a() {
      return b;
   }

   public dkk(dsb.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dsc a(dsc $$0, dlm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsc a(dsc $$0, djw $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dbz $$0, iz $$1) {
      if (!$$0.x_() && !$$0.P().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dby $$0, iz $$1, dsc $$2) {
      je $$3 = $$2.c(a);
      iz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(dsc $$0) {
      return true;
   }

   @Override
   protected int b(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(dsc $$0, dbe $$1, iz $$2, je $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.P().a($$2, this)) {
            dsc $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dsc $$0, dby $$1, iz $$2, dsc $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.P().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dsc a(cya $$0) {
      return this.o().a(a, $$0.d().g().g());
   }
}
