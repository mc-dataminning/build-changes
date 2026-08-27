import com.mojang.serialization.MapCodec;

public class cwl extends das {
   public static final MapCodec<cwl> a = b(cwl::new);

   @Override
   public MapCodec<cwl> a() {
      return a;
   }

   protected cwl(dhm.d $$0) {
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
   public dhn a(cnw $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dhn a(crl $$0, hx $$1, dhn $$2) {
      dhn $$3 = $$0.a_($$1.d());
      dhn $$4 = $$0.a_($$1.c());
      dhn $$5 = $$0.a_($$1.e());
      dhn $$6 = $$0.a_($$1.h());
      dhn $$7 = $$0.a_($$1.f());
      dhn $$8 = $$0.a_($$1.g());
      cvf $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cvh.kv) || $$3.a(cvh.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cvh.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cvh.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cvh.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cvh.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cvh.kv)));
   }

   @Override
   public dhn a(dhn $$0, ib $$1, dhn $$2, csg $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cvh.kv) || $$1 == ib.a && $$2.a(cvh.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dhn $$0, csi $$1, hx $$2) {
      dhn $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ib $$5 : ib.c.a) {
         hx $$6 = $$2.a($$5);
         dhn $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dhn $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cvh.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cvh.fz);
   }

   @Override
   protected void a(dho.a<cvf, dhn> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dhn $$0, crl $$1, hx $$2, edn $$3) {
      return false;
   }
}
