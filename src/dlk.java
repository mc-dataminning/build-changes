import com.mojang.serialization.MapCodec;

public class dlk extends dpw {
   public static final MapCodec<dlk> a = b(dlk::new);

   @Override
   public MapCodec<dlk> a() {
      return a;
   }

   protected dlk(dxp.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.B
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
   public dxq a(dax $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dxq a(dgf $$0, ji $$1, dxq $$2) {
      dxq $$3 = $$0.a_($$1.e());
      dxq $$4 = $$0.a_($$1.d());
      dxq $$5 = $$0.a_($$1.f());
      dxq $$6 = $$0.a_($$1.i());
      dxq $$7 = $$0.a_($$1.g());
      dxq $$8 = $$0.a_($$1.h());
      dke $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dkg.kX) || $$3.a(dkg.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dkg.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dkg.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dkg.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dkg.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dkg.kX)));
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dkg.kX) || $$4 == jn.a && $$6.a(dkg.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$2.a($$5);
         dxq $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dxq $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dkg.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dkg.fU);
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dxq $$0, eul $$1) {
      return false;
   }
}
