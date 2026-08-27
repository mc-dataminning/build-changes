public class ctp extends cxw {
   protected ctp(dex.d $$0) {
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
   public dey a(cle $$0) {
      return this.a($$0.q(), $$0.a());
   }

   public dey a(coq $$0, gv $$1) {
      dey $$2 = $$0.a_($$1.d());
      dey $$3 = $$0.a_($$1.c());
      dey $$4 = $$0.a_($$1.e());
      dey $$5 = $$0.a_($$1.h());
      dey $$6 = $$0.a_($$1.f());
      dey $$7 = $$0.a_($$1.g());
      return this.n()
         .a(f, Boolean.valueOf($$2.a(this) || $$2.a(csl.kv) || $$2.a(csl.fz)))
         .a(e, Boolean.valueOf($$3.a(this) || $$3.a(csl.kv)))
         .a(a, Boolean.valueOf($$4.a(this) || $$4.a(csl.kv)))
         .a(b, Boolean.valueOf($$5.a(this) || $$5.a(csl.kv)))
         .a(c, Boolean.valueOf($$6.a(this) || $$6.a(csl.kv)))
         .a(d, Boolean.valueOf($$7.a(this) || $$7.a(csl.kv)));
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(csl.kv) || $$1 == hb.a && $$2.a(csl.fz);
         return $$0.a(g.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      dey $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hb $$5 : hb.c.a) {
         gv $$6 = $$2.a($$5);
         dey $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dey $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(csl.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(csl.fz);
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, b, c, d, e, f);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
