import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djg extends dby {
   public static final MapCodec<djg> a = b(djg::new);
   public static final int b = 8;
   public static final dpz c = dpp.aF;
   protected static final est[] d = new est[]{
      esq.a(),
      dby.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dby.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<djg> a() {
      return a;
   }

   protected djg(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
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
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected est b(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected est b_(doz $$0, cyd $$1, ib $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected est c(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean g_(doz $$0) {
      return true;
   }

   @Override
   protected float d(doz $$0, cyd $$1, ib $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(doz $$0, cza $$1, ib $$2) {
      doz $$3 = $$1.a_($$2.d());
      if ($$3.a(avc.ci)) {
         return false;
      } else {
         return $$3.a(avc.cj) ? true : dby.a($$3.k($$1, $$2.d()), ih.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      return !$$0.a($$3, $$4) ? dca.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(doz $$0, aps $$1, ib $$2, axr $$3) {
      if ($$1.a(czg.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(doz $$0, cuo $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.p()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == ih.b : true;
      }
   }

   @Nullable
   @Override
   public doz a(cuo $$0) {
      doz $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(c);
   }
}
