import com.mojang.serialization.MapCodec;

public class dgf extends dkn {
   public static final MapCodec<dgf> a = b(dgf::new);

   @Override
   public MapCodec<dgf> a() {
      return a;
   }

   protected dgf(dsb.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dsc a(cya $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsc a(dbe $$0, iz $$1, dsc $$2) {
      dsc $$3 = $$0.a_($$1.d());
      dsc $$4 = $$0.a_($$1.c());
      dsc $$5 = $$0.a_($$1.e());
      dsc $$6 = $$0.a_($$1.h());
      dsc $$7 = $$0.a_($$1.f());
      dsc $$8 = $$0.a_($$1.g());
      dez $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfb.kv) || $$3.a(dfb.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfb.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfb.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfb.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfb.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfb.kv)));
   }

   @Override
   protected dsc a(dsc $$0, je $$1, dsc $$2, dbz $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfb.kv) || $$1 == je.a && $$2.a(dfb.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsc $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsc $$0, dcb $$1, iz $$2) {
      dsc $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (je $$5 : je.c.a) {
         iz $$6 = $$2.a($$5);
         dsc $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsc $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfb.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfb.fz);
   }

   @Override
   protected void a(dsd.a<dez, dsc> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsc $$0, eok $$1) {
      return false;
   }
}
