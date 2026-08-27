import com.mojang.serialization.MapCodec;

public class cwg extends dan {
   public static final MapCodec<cwg> a = b(cwg::new);

   @Override
   public MapCodec<cwg> a() {
      return a;
   }

   protected cwg(dhh.d $$0) {
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
   public dhi a(cnr $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dhi a(crg $$0, ht $$1, dhi $$2) {
      dhi $$3 = $$0.a_($$1.d());
      dhi $$4 = $$0.a_($$1.c());
      dhi $$5 = $$0.a_($$1.e());
      dhi $$6 = $$0.a_($$1.h());
      dhi $$7 = $$0.a_($$1.f());
      dhi $$8 = $$0.a_($$1.g());
      cva $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cvc.kv) || $$3.a(cvc.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cvc.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cvc.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cvc.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cvc.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cvc.kv)));
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cvc.kv) || $$1 == hx.a && $$2.a(cvc.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dhi $$0, ame $$1, ht $$2, ats $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dhi $$0, csd $$1, ht $$2) {
      dhi $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hx $$5 : hx.c.a) {
         ht $$6 = $$2.a($$5);
         dhi $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dhi $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cvc.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cvc.fz);
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dhi $$0, crg $$1, ht $$2, edi $$3) {
      return false;
   }
}
