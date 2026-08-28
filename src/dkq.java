import com.mojang.serialization.MapCodec;

public class dkq extends dpc {
   public static final MapCodec<dkq> a = b(dkq::new);

   @Override
   public MapCodec<dkq> a() {
      return a;
   }

   protected dkq(dwu.d $$0) {
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
   public dwv a(dae $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dwv a(dfl $$0, ji $$1, dwv $$2) {
      dwv $$3 = $$0.a_($$1.e());
      dwv $$4 = $$0.a_($$1.d());
      dwv $$5 = $$0.a_($$1.f());
      dwv $$6 = $$0.a_($$1.i());
      dwv $$7 = $$0.a_($$1.g());
      dwv $$8 = $$0.a_($$1.h());
      djk $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(djm.kX) || $$3.a(djm.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(djm.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(djm.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(djm.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(djm.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(djm.kX)));
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(djm.kX) || $$4 == jn.a && $$6.a(djm.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$2.a($$5);
         dwv $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dwv $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(djm.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(djm.fU);
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
