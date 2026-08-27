import com.mojang.serialization.MapCodec;

public class cxf extends dbm {
   public static final MapCodec<cxf> a = b(cxf::new);

   @Override
   public MapCodec<cxf> a() {
      return a;
   }

   protected cxf(dio.d $$0) {
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
   public dip a(coq $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dip a(cse $$0, hv $$1, dip $$2) {
      dip $$3 = $$0.a_($$1.d());
      dip $$4 = $$0.a_($$1.c());
      dip $$5 = $$0.a_($$1.e());
      dip $$6 = $$0.a_($$1.h());
      dip $$7 = $$0.a_($$1.f());
      dip $$8 = $$0.a_($$1.g());
      cvz $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cwb.kv) || $$3.a(cwb.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cwb.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cwb.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cwb.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cwb.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cwb.kv)));
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cwb.kv) || $$1 == ia.a && $$2.a(cwb.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      dip $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ia $$5 : ia.c.a) {
         hv $$6 = $$2.a($$5);
         dip $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dip $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cwb.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cwb.fz);
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dip $$0, cse $$1, hv $$2, eep $$3) {
      return false;
   }
}
