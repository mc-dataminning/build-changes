import com.mojang.serialization.MapCodec;

public class cxp extends dbw {
   public static final MapCodec<cxp> a = b(cxp::new);

   @Override
   public MapCodec<cxp> a() {
      return a;
   }

   protected cxp(diz.d $$0) {
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
   public dja a(cpa $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dja a(cso $$0, hx $$1, dja $$2) {
      dja $$3 = $$0.a_($$1.d());
      dja $$4 = $$0.a_($$1.c());
      dja $$5 = $$0.a_($$1.e());
      dja $$6 = $$0.a_($$1.h());
      dja $$7 = $$0.a_($$1.f());
      dja $$8 = $$0.a_($$1.g());
      cwj $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cwl.kv) || $$3.a(cwl.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cwl.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cwl.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cwl.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cwl.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cwl.kv)));
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cwl.kv) || $$1 == ic.a && $$2.a(cwl.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      dja $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$2.a($$5);
         dja $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dja $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cwl.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cwl.fz);
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dja $$0, cso $$1, hx $$2, efa $$3) {
      return false;
   }
}
