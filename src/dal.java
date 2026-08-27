import com.mojang.serialization.MapCodec;

public class dal extends des {
   public static final MapCodec<dal> a = b(dal::new);

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   protected dal(dmd.d $$0) {
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
   public dme a(crx $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dme a(cvk $$0, ib $$1, dme $$2) {
      dme $$3 = $$0.a_($$1.d());
      dme $$4 = $$0.a_($$1.c());
      dme $$5 = $$0.a_($$1.e());
      dme $$6 = $$0.a_($$1.h());
      dme $$7 = $$0.a_($$1.f());
      dme $$8 = $$0.a_($$1.g());
      czf $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(czh.kv) || $$3.a(czh.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(czh.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(czh.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(czh.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(czh.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(czh.kv)));
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(czh.kv) || $$1 == ih.a && $$2.a(czh.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$2.a($$5);
         dme $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dme $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(czh.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(czh.fz);
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }
}
