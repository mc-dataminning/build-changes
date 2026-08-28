import com.mojang.serialization.MapCodec;

public class dnt extends dsg {
   public static final MapCodec<dnt> a = b(dnt::new);

   @Override
   public MapCodec<dnt> a() {
      return a;
   }

   protected dnt(ean.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.C
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public eao a(ddd $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static eao a(din $$0, iv $$1, eao $$2) {
      eao $$3 = $$0.a_($$1.e());
      eao $$4 = $$0.a_($$1.d());
      eao $$5 = $$0.a_($$1.f());
      eao $$6 = $$0.a_($$1.i());
      eao $$7 = $$0.a_($$1.g());
      eao $$8 = $$0.a_($$1.h());
      dmm $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dmo.lb) || $$3.a(dmo.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dmo.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dmo.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dmo.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dmo.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dmo.lb)));
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dmo.lb) || $$4 == jb.a && $$6.a(dmo.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      eao $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jb $$5 : jb.c.a) {
         iv $$6 = $$2.a($$5);
         eao $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            eao $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dmo.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dmo.fY);
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
