public class cua extends cyh {
   protected cua(dfi.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.C
            .b()
            .a(a, Boolean.valueOf(false))
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
      );
   }

   @Override
   public dfj a(cln $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dfj a(cpb $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1.d());
      dfj $$3 = $$0.a_($$1.c());
      dfj $$4 = $$0.a_($$1.e());
      dfj $$5 = $$0.a_($$1.h());
      dfj $$6 = $$0.a_($$1.f());
      dfj $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csw.kv) || $$2.a(csw.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csw.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csw.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csw.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csw.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csw.kv)));
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csw.kv) || $$1 == ha.a && $$2.a(csw.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      dfj $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ha $$5 : ha.c.a) {
         gw $$6 = $$2.a($$5);
         dfj $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dfj $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csw.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csw.fz);
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
