import com.mojang.serialization.MapCodec;

public class dlt extends dqc {
   public static final MapCodec<dlt> a = b(dlt::new);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   protected dlt(dxu.d $$0) {
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
   public dxv a(dbg $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dxv a(dgn $$0, jh $$1, dxv $$2) {
      dxv $$3 = $$0.a_($$1.e());
      dxv $$4 = $$0.a_($$1.d());
      dxv $$5 = $$0.a_($$1.f());
      dxv $$6 = $$0.a_($$1.i());
      dxv $$7 = $$0.a_($$1.g());
      dxv $$8 = $$0.a_($$1.h());
      dkm $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dko.kQ) || $$3.a(dko.fN)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dko.kQ)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dko.kQ)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dko.kQ)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dko.kQ)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dko.kQ)));
   }

   @Override
   protected dxv a(dxv $$0, dhl $$1, dhx $$2, jh $$3, jm $$4, jh $$5, dxv $$6, bam $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dko.kQ) || $$4 == jm.a && $$6.a(dko.fN);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dxv $$0, ash $$1, jh $$2, bam $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dxv $$0, dhl $$1, jh $$2) {
      dxv $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jm $$5 : jm.c.a) {
         jh $$6 = $$2.a($$5);
         dxv $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dxv $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dko.fN)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dko.fN);
   }

   @Override
   protected void a(dxw.a<dkm, dxv> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
