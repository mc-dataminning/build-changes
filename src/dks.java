import com.mojang.serialization.MapCodec;

public class dks extends dpe {
   public static final MapCodec<dks> a = b(dks::new);

   @Override
   public MapCodec<dks> a() {
      return a;
   }

   protected dks(dww.d $$0) {
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
   public dwx a(dag $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dwx a(dfn $$0, ji $$1, dwx $$2) {
      dwx $$3 = $$0.a_($$1.e());
      dwx $$4 = $$0.a_($$1.d());
      dwx $$5 = $$0.a_($$1.f());
      dwx $$6 = $$0.a_($$1.i());
      dwx $$7 = $$0.a_($$1.g());
      dwx $$8 = $$0.a_($$1.h());
      djm $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(djo.kX) || $$3.a(djo.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(djo.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(djo.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(djo.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(djo.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(djo.kX)));
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(djo.kX) || $$4 == jn.a && $$6.a(djo.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dwx $$0, arc $$1, ji $$2, azh $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jn $$5 : jn.c.a) {
         ji $$6 = $$2.a($$5);
         dwx $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dwx $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(djo.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(djo.fU);
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
