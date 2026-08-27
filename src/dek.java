import com.mojang.serialization.MapCodec;

public class dek extends dis {
   public static final MapCodec<dek> a = b(dek::new);

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(dqg.d $$0) {
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
   public dqh a(cwi $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dqh a(czj $$0, in $$1, dqh $$2) {
      dqh $$3 = $$0.a_($$1.d());
      dqh $$4 = $$0.a_($$1.c());
      dqh $$5 = $$0.a_($$1.e());
      dqh $$6 = $$0.a_($$1.h());
      dqh $$7 = $$0.a_($$1.f());
      dqh $$8 = $$0.a_($$1.g());
      dde $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(ddg.kv) || $$3.a(ddg.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(ddg.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(ddg.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(ddg.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(ddg.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(ddg.kv)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(ddg.kv) || $$1 == is.a && $$2.a(ddg.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (is $$5 : is.c.a) {
         in $$6 = $$2.a($$5);
         dqh $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dqh $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(ddg.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(ddg.fz);
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
