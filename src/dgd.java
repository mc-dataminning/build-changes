import com.mojang.serialization.MapCodec;

public class dgd extends dkl {
   public static final MapCodec<dgd> a = b(dgd::new);

   @Override
   public MapCodec<dgd> a() {
      return a;
   }

   protected dgd(drz.d $$0) {
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
   public dsa a(cxy $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsa a(dbc $$0, iz $$1, dsa $$2) {
      dsa $$3 = $$0.a_($$1.d());
      dsa $$4 = $$0.a_($$1.c());
      dsa $$5 = $$0.a_($$1.e());
      dsa $$6 = $$0.a_($$1.h());
      dsa $$7 = $$0.a_($$1.f());
      dsa $$8 = $$0.a_($$1.g());
      dex $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dez.kv) || $$3.a(dez.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dez.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dez.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dez.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dez.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dez.kv)));
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dez.kv) || $$1 == je.a && $$2.a(dez.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      dsa $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (je $$5 : je.c.a) {
         iz $$6 = $$2.a($$5);
         dsa $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsa $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dez.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dez.fz);
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsa $$0, eoi $$1) {
      return false;
   }
}
