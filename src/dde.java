import com.mojang.serialization.MapCodec;

public class dde extends dhl {
   public static final MapCodec<dde> a = b(dde::new);

   @Override
   public MapCodec<dde> a() {
      return a;
   }

   protected dde(doy.d $$0) {
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
   public doz a(cuo $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static doz a(cyd $$0, ib $$1, doz $$2) {
      doz $$3 = $$0.a_($$1.d());
      doz $$4 = $$0.a_($$1.c());
      doz $$5 = $$0.a_($$1.e());
      doz $$6 = $$0.a_($$1.h());
      doz $$7 = $$0.a_($$1.f());
      doz $$8 = $$0.a_($$1.g());
      dby $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dca.kv) || $$3.a(dca.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dca.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dca.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dca.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dca.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dca.kv)));
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dca.kv) || $$1 == ih.a && $$2.a(dca.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(doz $$0, aps $$1, ib $$2, axr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$2.a($$5);
         doz $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            doz $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dca.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dca.fz);
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
