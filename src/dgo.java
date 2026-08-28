import com.mojang.serialization.MapCodec;

public class dgo extends dkw {
   public static final MapCodec<dgo> a = b(dgo::new);

   @Override
   public MapCodec<dgo> a() {
      return a;
   }

   protected dgo(dsk.d $$0) {
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
   public dsl a(cxn $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsl a(dbm $$0, ja $$1, dsl $$2) {
      dsl $$3 = $$0.a_($$1.d());
      dsl $$4 = $$0.a_($$1.c());
      dsl $$5 = $$0.a_($$1.e());
      dsl $$6 = $$0.a_($$1.h());
      dsl $$7 = $$0.a_($$1.f());
      dsl $$8 = $$0.a_($$1.g());
      dfi $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfk.kv) || $$3.a(dfk.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfk.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfk.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfk.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfk.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfk.kv)));
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfk.kv) || $$1 == jf.a && $$2.a(dfk.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      dsl $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (jf $$5 : jf.c.a) {
         ja $$6 = $$2.a($$5);
         dsl $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsl $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfk.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfk.fz);
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }
}
