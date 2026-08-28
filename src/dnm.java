import com.mojang.serialization.MapCodec;

public class dnm extends drz {
   public static final MapCodec<dnm> a = b(dnm::new);

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(eag.d $$0) {
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
   public eah a(dcw $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static eah a(dig $$0, iu $$1, eah $$2) {
      eah $$3 = $$0.a_($$1.e());
      eah $$4 = $$0.a_($$1.d());
      eah $$5 = $$0.a_($$1.f());
      eah $$6 = $$0.a_($$1.i());
      eah $$7 = $$0.a_($$1.g());
      eah $$8 = $$0.a_($$1.h());
      dmf $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dmh.lb) || $$3.a(dmh.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dmh.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dmh.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dmh.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dmh.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dmh.lb)));
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dmh.lb) || $$4 == ja.a && $$6.a(dmh.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$2.a($$5);
         eah $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            eah $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dmh.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dmh.fY);
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(eah $$0, exd $$1) {
      return false;
   }
}
