import com.mojang.serialization.MapCodec;

public class dkf extends dgx {
   public static final MapCodec<dkf> b = b(dkf::new);
   public static final dso c = dsn.w;

   @Override
   public MapCodec<dkf> a() {
      return b;
   }

   public dkf(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(a, je.d).a(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected drx a(drx $$0, dlh $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected drx a(drx $$0, djr $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.a(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$0.c(a) == $$1 && !$$0.c(c)) {
         this.a($$3, $$4);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private void a(dbu $$0, iz $$1) {
      if (!$$0.x_() && !$$0.P().a($$1, this)) {
         $$0.a($$1, this, 2);
      }
   }

   protected void a(dbt $$0, iz $$1, drx $$2) {
      je $$3 = $$2.c(a);
      iz $$4 = $$1.a($$3.g());
      $$0.a($$4, this, $$1);
      $$0.a($$4, this, $$3);
   }

   @Override
   protected boolean e_(drx $$0) {
      return true;
   }

   @Override
   protected int b(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.b($$1, $$2, $$3);
   }

   @Override
   protected int a(drx $$0, daz $$1, iz $$2, je $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.x_() && $$0.c(c) && !$$1.P().a($$2, this)) {
            drx $$5 = $$0.a(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, drx $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B && $$0.c(c) && $$1.P().a($$2, this)) {
            this.a($$1, $$2, $$0.a(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(a, $$0.d().g().g());
   }
}
