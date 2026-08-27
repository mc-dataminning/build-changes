import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhi extends daa {
   public static final MapCodec<dhi> a = b(dhi::new);
   public static final int b = 8;
   public static final dnz c = dnp.aF;
   protected static final eqk[] d = new eqk[]{
      eqh.a(),
      daa.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      daa.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dhi> a() {
      return a;
   }

   protected dhi(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
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
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected eqk b_(dmz $$0, cwf $$1, ib $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected eqk c(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(dmz $$0) {
      return true;
   }

   @Override
   protected float d(dmz $$0, cwf $$1, ib $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.d());
      if ($$3.a(aun.ci)) {
         return false;
      } else {
         return $$3.a(aun.cj) ? true : daa.a($$3.k($$1, $$2.d()), ih.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dac.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if ($$1.a(cxi.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dmz $$0, css $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.l()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ih.b : true;
      }
   }

   @Nullable
   @Override
   public dmz a(css $$0) {
      dmz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(c);
   }
}
