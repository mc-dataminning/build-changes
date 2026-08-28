import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djf extends dlt implements dib {
   public static final MapCodec<djf> a = b(djf::new);
   public static final int b = 2;
   public static final dwd c = dvt.ar;
   protected static final int d = 4;
   protected static final int e = 5;
   protected static final int f = 2;
   protected static final int g = 6;
   protected static final int h = 7;
   protected static final int i = 3;
   protected static final int j = 8;
   protected static final int k = 9;
   protected static final int l = 4;
   protected static final fab[] m = new fab[]{
      dhy.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), dhy.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), dhy.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final fab[] n = new fab[]{
      dhy.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), dhy.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), dhy.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final fab[] o = new fab[]{
      dhy.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), dhy.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), dhy.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final fab[] G = new fab[]{
      dhy.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), dhy.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), dhy.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   @Override
   public MapCodec<djf> a() {
      return a;
   }

   public djf(dvc.d $$0) {
      super($$0);
      this.l(this.F.b().b(aF, jl.c).b(c, Integer.valueOf(0)));
   }

   @Override
   protected boolean f(dvd $$0) {
      return $$0.c(c) < 2;
   }

   @Override
   protected void b(dvd $$0, arm $$1, jg $$2, azr $$3) {
      if ($$1.A.a(5) == 0) {
         int $$4 = $$0.c(c);
         if ($$4 < 2) {
            $$1.a($$2, $$0.b(c, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   protected boolean a(dvd $$0, dey $$1, jg $$2) {
      dvd $$3 = $$1.a_($$2.a($$0.c(aF)));
      return $$3.a(awz.A);
   }

   @Override
   protected fab a(dvd $$0, dea $$1, jg $$2, ezm $$3) {
      int $$4 = $$0.c(c);
      switch ((jl)$$0.c(aF)) {
         case d:
            return G[$$4];
         case c:
         default:
            return o[$$4];
         case e:
            return n[$$4];
         case f:
            return m[$$4];
      }
   }

   @Nullable
   @Override
   public dvd a(czm $$0) {
      dvd $$1 = this.m();
      dey $$2 = $$0.q();
      jg $$3 = $$0.a();

      for (jl $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.b(aF, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   protected dvd a(dvd $$0, jl $$1, dvd $$2, dew $$3, jg $$4, jg $$5) {
      return $$1 == $$0.c(aF) && !$$0.a($$3, $$4) ? dia.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean b(dey $$0, jg $$1, dvd $$2) {
      return $$2.c(c) < 2;
   }

   @Override
   public boolean a(dev $$0, azr $$1, jg $$2, dvd $$3) {
      return true;
   }

   @Override
   public void a(arm $$0, azr $$1, jg $$2, dvd $$3) {
      $$0.a($$2, $$3.b(c, Integer.valueOf($$3.c(c) + 1)), 2);
   }

   @Override
   protected void a(dve.a<dhy, dvd> $$0) {
      $$0.a(aF, c);
   }

   @Override
   protected boolean a(dvd $$0, ert $$1) {
      return false;
   }
}
