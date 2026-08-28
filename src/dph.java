import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dph extends dhy {
   public static final MapCodec<dph> a = b(dph::new);
   public static final int b = 8;
   public static final dwd c = dvt.aF;
   protected static final fab[] d = new fab[]{
      ezy.a(),
      dhy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dhy.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dph> a() {
      return a;
   }

   protected dph(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      switch ($$1) {
         case a:
            return $$0.c(c) < 5;
         case b:
            return false;
         case c:
            return false;
         default:
            return false;
      }
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected fab b(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected fab b_(dvd $$0, dea $$1, jg $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected fab c(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dvd $$0) {
      return true;
   }

   @Override
   protected float c(dvd $$0, dea $$1, jg $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.e());
      if ($$3.a(awz.cq)) {
         return false;
      } else {
         return $$3.a(awz.cr) ? true : dhy.a($$3.g($$1, $$2.e()), jl.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.a(dfe.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dvd $$0, czm $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.j()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == jl.b : true;
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.b(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(c);
   }
}
