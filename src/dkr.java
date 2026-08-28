import com.mojang.serialization.MapCodec;

public class dkr extends dpd {
   public static final MapCodec<dkr> a = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dwv.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.F
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
   public dww a(daf $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dww a(dfm $$0, ji $$1, dww $$2) {
      dww $$3 = $$0.a_($$1.e());
      dww $$4 = $$0.a_($$1.d());
      dww $$5 = $$0.a_($$1.f());
      dww $$6 = $$0.a_($$1.i());
      dww $$7 = $$0.a_($$1.g());
      dww $$8 = $$0.a_($$1.h());
      djl $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(djn.kX) || $$3.a(djn.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(djn.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(djn.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(djn.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(djn.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(djn.kX)));
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(djn.kX) || $$4 == jn.a && $$6.a(djn.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$2.a($$5);
         dww $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dww $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(djn.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(djn.fU);
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dww $$0, etn $$1) {
      return false;
   }
}
