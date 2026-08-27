import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgn extends czf {
   public static final MapCodec<dgn> a = b(dgn::new);
   public static final int b = 8;
   public static final dne c = dmu.aF;
   protected static final epo[] d = new epo[]{
      epl.a(),
      czf.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      czf.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dgn> a() {
      return a;
   }

   protected dgn(dmd.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      switch ($$3) {
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
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected epo b(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected epo b_(dme $$0, cvk $$1, ib $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected epo c(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dme $$0) {
      return true;
   }

   @Override
   protected float d(dme $$0, cvk $$1, ib $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dme $$0, cwh $$1, ib $$2) {
      dme $$3 = $$1.a_($$2.d());
      if ($$3.a(aue.ch)) {
         return false;
      } else {
         return $$3.a(aue.ci) ? true : czf.a($$3.k($$1, $$2.d()), ih.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? czh.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.a(cwn.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dme $$0, crx $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.l()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ih.b : true;
      }
   }

   @Nullable
   @Override
   public dme a(crx $$0) {
      dme $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c);
   }
}
