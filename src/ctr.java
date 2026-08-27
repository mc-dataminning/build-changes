public class ctr extends cxy {
   protected ctr(dez.d $$0) {
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
   public dfa a(clg $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dfa a(cos $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1.d());
      dfa $$3 = $$0.a_($$1.c());
      dfa $$4 = $$0.a_($$1.e());
      dfa $$5 = $$0.a_($$1.h());
      dfa $$6 = $$0.a_($$1.f());
      dfa $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csn.kv) || $$2.a(csn.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csn.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csn.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csn.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csn.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csn.kv)));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csn.kv) || $$1 == ha.a && $$2.a(csn.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      dfa $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ha $$5 : ha.c.a) {
         gu $$6 = $$2.a($$5);
         dfa $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dfa $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csn.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csn.fz);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
