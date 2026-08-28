import com.mojang.serialization.MapCodec;

public class dij extends dhy {
   public static final MapCodec<dij> a = b(dij::new);
   public static final dwd b = dvt.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fab e = dhy.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fab f = dhy.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   protected dij(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      jg $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dvd $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return e;
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return f;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      for (jl $$3 : jl.c.a) {
         dvd $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axf.b)) {
            return false;
         }
      }

      dvd $$5 = $$1.a_($$2.e());
      return ($$5.a(dia.dQ) || $$5.a(awz.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dvd $$0, dev $$1, jg $$2, btz $$3) {
      $$3.a($$1.ak().k(), 1.0F);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
