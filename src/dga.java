import com.mojang.serialization.MapCodec;

public class dga extends dki {
   public static final MapCodec<dga> a = b(dga::new);

   @Override
   public MapCodec<dga> a() {
      return a;
   }

   protected dga(drw.d $$0) {
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
   public drx a(cxv $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static drx a(daz $$0, iz $$1, drx $$2) {
      drx $$3 = $$0.a_($$1.d());
      drx $$4 = $$0.a_($$1.c());
      drx $$5 = $$0.a_($$1.e());
      drx $$6 = $$0.a_($$1.h());
      drx $$7 = $$0.a_($$1.f());
      drx $$8 = $$0.a_($$1.g());
      deu $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dew.kv) || $$3.a(dew.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dew.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dew.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dew.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dew.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dew.kv)));
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dew.kv) || $$1 == je.a && $$2.a(dew.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      drx $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (je $$5 : je.c.a) {
         iz $$6 = $$2.a($$5);
         drx $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            drx $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dew.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dew.fz);
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
