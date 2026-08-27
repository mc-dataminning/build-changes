public class ctv extends cyc {
   protected ctv(dfd.d $$0) {
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
   public dfe a(cli $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dfe a(cow $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1.d());
      dfe $$3 = $$0.a_($$1.c());
      dfe $$4 = $$0.a_($$1.e());
      dfe $$5 = $$0.a_($$1.h());
      dfe $$6 = $$0.a_($$1.f());
      dfe $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csr.kv) || $$2.a(csr.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csr.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csr.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csr.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csr.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csr.kv)));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csr.kv) || $$1 == hc.a && $$2.a(csr.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hc $$5 : hc.c.a) {
         gw $$6 = $$2.a($$5);
         dfe $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dfe $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csr.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csr.fz);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
