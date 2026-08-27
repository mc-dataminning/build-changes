import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkn extends dde {
   public static final MapCodec<dkn> a = b(dkn::new);
   public static final int b = 8;
   public static final drh c = dqx.aF;
   protected static final eui[] d = new eui[]{
      euf.a(),
      dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 10.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 12.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0),
      dde.a(0.0, 0.0, 0.0, 16.0, 16.0, 16.0)
   };
   public static final int e = 5;

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   protected dkn(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(1)));
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
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
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected eui b(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d[$$0.c(c) - 1];
   }

   @Override
   protected eui b_(dqh $$0, czj $$1, in $$2) {
      return d[$$0.c(c)];
   }

   @Override
   protected eui c(dqh $$0, czj $$1, in $$2, etu $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected float d(dqh $$0, czj $$1, in $$2) {
      return $$0.c(c) == 8 ? 0.2F : 1.0F;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.d());
      if ($$3.a(avr.co)) {
         return false;
      } else {
         return $$3.a(avr.cp) ? true : dde.a($$3.k($$1, $$2.d()), is.b) || $$3.a(this) && $$3.c(c) == 8;
      }
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      return !$$0.a($$3, $$4) ? ddg.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.a(dam.b, $$2) > 11) {
         c($$0, $$1, $$2);
         $$1.a($$2, false);
      }
   }

   @Override
   protected boolean a(dqh $$0, cwi $$1) {
      int $$2 = $$0.c(c);
      if (!$$1.n().a(this.q()) || $$2 >= 8) {
         return $$2 == 1;
      } else {
         return $$1.c() ? $$1.k() == is.b : true;
      }
   }

   @Nullable
   @Override
   public dqh a(cwi $$0) {
      dqh $$1 = $$0.q().a_($$0.a());
      if ($$1.a(this)) {
         int $$2 = $$1.c(c);
         return $$1.a(c, Integer.valueOf(Math.min(8, $$2 + 1)));
      } else {
         return super.a($$0);
      }
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(c);
   }
}
