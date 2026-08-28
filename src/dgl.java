import com.mojang.serialization.MapCodec;

public class dgl extends dkt {
   public static final MapCodec<dgl> a = b(dgl::new);

   @Override
   public MapCodec<dgl> a() {
      return a;
   }

   protected dgl(dsg.d $$0) {
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
   public dsh a(cxk $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsh a(dbj $$0, ja $$1, dsh $$2) {
      dsh $$3 = $$0.a_($$1.d());
      dsh $$4 = $$0.a_($$1.c());
      dsh $$5 = $$0.a_($$1.e());
      dsh $$6 = $$0.a_($$1.h());
      dsh $$7 = $$0.a_($$1.f());
      dsh $$8 = $$0.a_($$1.g());
      dff $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfh.kv) || $$3.a(dfh.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfh.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfh.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfh.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfh.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfh.kv)));
   }

   @Override
   protected dsh a(dsh $$0, jf $$1, dsh $$2, dce $$3, ja $$4, ja $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfh.kv) || $$1 == jf.a && $$2.a(dfh.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsh $$0, aqk $$1, ja $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsh $$0, dcg $$1, ja $$2) {
      dsh $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (jf $$5 : jf.c.a) {
         ja $$6 = $$2.a($$5);
         dsh $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsh $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfh.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfh.fz);
   }

   @Override
   protected void a(dsi.a<dff, dsh> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsh $$0, eoq $$1) {
      return false;
   }
}
