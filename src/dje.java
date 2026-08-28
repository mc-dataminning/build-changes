import com.mojang.serialization.MapCodec;

public class dje extends dnl {
   public static final MapCodec<dje> a = b(dje::new);

   @Override
   public MapCodec<dje> a() {
      return a;
   }

   protected dje(dvc.d $$0) {
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
   public dvd a(czm $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dvd a(dea $$0, jg $$1, dvd $$2) {
      dvd $$3 = $$0.a_($$1.e());
      dvd $$4 = $$0.a_($$1.d());
      dvd $$5 = $$0.a_($$1.f());
      dvd $$6 = $$0.a_($$1.i());
      dvd $$7 = $$0.a_($$1.g());
      dvd $$8 = $$0.a_($$1.h());
      dhy $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dia.kv) || $$3.a(dia.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dia.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dia.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dia.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dia.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dia.kv)));
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dia.kv) || $$1 == jl.a && $$2.a(dia.fz);
         return $$0.b(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jl $$5 : jl.c.a) {
         jg $$6 = $$2.a($$5);
         dvd $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dvd $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dia.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dia.fz);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
