public class cuc extends cyj {
   protected cuc(dfk.d $$0) {
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
   public dfl a(clp $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dfl a(cpd $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1.d());
      dfl $$3 = $$0.a_($$1.c());
      dfl $$4 = $$0.a_($$1.e());
      dfl $$5 = $$0.a_($$1.h());
      dfl $$6 = $$0.a_($$1.f());
      dfl $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csy.kv) || $$2.a(csy.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csy.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csy.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csy.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csy.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csy.kv)));
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csy.kv) || $$1 == hc.a && $$2.a(csy.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dfl $$0, aks $$1, gw $$2, ase $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      dfl $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hc $$5 : hc.c.a) {
         gw $$6 = $$2.a($$5);
         dfl $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dfl $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csy.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csy.fz);
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
