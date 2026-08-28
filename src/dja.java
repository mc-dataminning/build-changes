import com.mojang.serialization.MapCodec;

public class dja extends dgv {
   public static final MapCodec<dja> i = b(dja::new);

   @Override
   public MapCodec<? extends dja> a() {
      return i;
   }

   protected dja(dsb.d $$0) {
      super(1.0F, 1.0F, 16.0F, 16.0F, 16.0F, $$0);
      this.k(
         this.E
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
      );
   }

   @Override
   public dsc a(cya $$0) {
      dbe $$1 = $$0.q();
      iz $$2 = $$0.a();
      env $$3 = $$0.q().b_($$0.a());
      iz $$4 = $$2.e();
      iz $$5 = $$2.f();
      iz $$6 = $$2.g();
      iz $$7 = $$2.h();
      dsc $$8 = $$1.a_($$4);
      dsc $$9 = $$1.a_($$5);
      dsc $$10 = $$1.a_($$6);
      dsc $$11 = $$1.a_($$7);
      return this.o()
         .a(a, Boolean.valueOf(this.a($$8, $$8.d($$1, $$4, je.d))))
         .a(c, Boolean.valueOf(this.a($$9, $$9.d($$1, $$5, je.c))))
         .a(d, Boolean.valueOf(this.a($$10, $$10.d($$1, $$6, je.f))))
         .a(b, Boolean.valueOf(this.a($$11, $$11.d($$1, $$7, je.e))))
         .a(e, Boolean.valueOf($$3.a() == enw.c));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if ($$0.c(e)) {
         $$3.a($$4, enw.c, enw.c.a($$3));
      }

      return $$1.o().d() ? $$0.a(f.get($$1), Boolean.valueOf(this.a($$2, $$2.d($$3, $$5, $$1.g())))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ewk c(dsc $$0, dbe $$1, iz $$2, evw $$3) {
      return ewh.a();
   }

   @Override
   protected boolean a(dsc $$0, dsc $$1, je $$2) {
      if ($$1.a(this)) {
         if (!$$2.o().d()) {
            return true;
         }

         if ($$0.c(f.get($$2)) && $$1.c(f.get($$2.g()))) {
            return true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   public final boolean a(dsc $$0, boolean $$1) {
      return !j($$0) && $$1 || $$0.b() instanceof dja || $$0.a(awp.L);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(a, b, d, c, e);
   }
}
