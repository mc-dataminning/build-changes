import com.mojang.serialization.MapCodec;

public class djp extends dnw {
   public static final MapCodec<djp> a = b(djp::new);

   @Override
   public MapCodec<djp> a() {
      return a;
   }

   protected djp(dvn.d $$0) {
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
   public dvo a(czw $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dvo a(dek $$0, jh $$1, dvo $$2) {
      dvo $$3 = $$0.a_($$1.e());
      dvo $$4 = $$0.a_($$1.d());
      dvo $$5 = $$0.a_($$1.f());
      dvo $$6 = $$0.a_($$1.i());
      dvo $$7 = $$0.a_($$1.g());
      dvo $$8 = $$0.a_($$1.h());
      dij $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dil.kv) || $$3.a(dil.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dil.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dil.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dil.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dil.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dil.kv)));
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dil.kv) || $$4 == jm.a && $$6.a(dil.fz);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      dvo $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$2.a($$5);
         dvo $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dvo $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dil.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dil.fz);
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
