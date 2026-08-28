import com.mojang.serialization.MapCodec;

public class dgg extends dko {
   public static final MapCodec<dgg> a = b(dgg::new);

   @Override
   public MapCodec<dgg> a() {
      return a;
   }

   protected dgg(dsc.d $$0) {
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
   public dsd a(cyb $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsd a(dbf $$0, iz $$1, dsd $$2) {
      dsd $$3 = $$0.a_($$1.d());
      dsd $$4 = $$0.a_($$1.c());
      dsd $$5 = $$0.a_($$1.e());
      dsd $$6 = $$0.a_($$1.h());
      dsd $$7 = $$0.a_($$1.f());
      dsd $$8 = $$0.a_($$1.g());
      dfa $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfc.kv) || $$3.a(dfc.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfc.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfc.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfc.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfc.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfc.kv)));
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfc.kv) || $$1 == je.a && $$2.a(dfc.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      dsd $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (je $$5 : je.c.a) {
         iz $$6 = $$2.a($$5);
         dsd $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsd $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfc.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfc.fz);
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsd $$0, eol $$1) {
      return false;
   }
}
