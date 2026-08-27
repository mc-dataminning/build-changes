public class ctq extends cxx {
   protected ctq(dey.d $$0) {
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
   public dez a(clf $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dez a(cor $$0, gu $$1) {
      dez $$2 = $$0.a_($$1.d());
      dez $$3 = $$0.a_($$1.c());
      dez $$4 = $$0.a_($$1.e());
      dez $$5 = $$0.a_($$1.h());
      dez $$6 = $$0.a_($$1.f());
      dez $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csm.kv) || $$2.a(csm.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csm.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csm.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csm.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csm.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csm.kv)));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csm.kv) || $$1 == ha.a && $$2.a(csm.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dez $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      dez $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ha $$5 : ha.c.a) {
         gu $$6 = $$2.a($$5);
         dez $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dez $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csm.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csm.fz);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
