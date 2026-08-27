import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dgb extends dde {
   public static final MapCodec<dgb> a = b(dgb::new);
   public static final drh b = dqx.aQ;
   protected static final eui c = dde.a(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
   public static final int d = 7;

   @Override
   public MapCodec<dgb> a() {
      return a;
   }

   protected dgb(dqg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$1 == is.b && !$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      dqh $$3 = $$1.a_($$2.c());
      return !$$3.e() || $$3.b() instanceof dgd || $$3.b() instanceof dpz;
   }

   @Override
   public dqh a(cwi $$0) {
      return !this.n().a((dag)$$0.q(), $$0.a()) ? ddg.j.n() : super.a($$0);
   }

   @Override
   protected boolean f_(dqh $$0) {
      return true;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      return c;
   }

   @Override
   protected void a(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if (!$$0.a($$1, $$2)) {
         a(null, $$0, $$1, $$2);
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      int $$4 = $$0.c(b);
      if (!a((dag)$$1, $$2) && !$$1.r($$2.c())) {
         if ($$4 > 0) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 - 1)), 2);
         } else if (!a((czj)$$1, $$2)) {
            a(null, $$0, $$1, $$2);
         }
      } else if ($$4 < 7) {
         $$1.a($$2, $$0.a(b, Integer.valueOf(7)), 2);
      }
   }

   @Override
   public void a(dad $$0, dqh $$1, in $$2, brh $$3, float $$4) {
      if (!$$0.B && $$0.z.i() < $$4 - 0.5F && $$3 instanceof bsa && ($$3 instanceof clh || $$0.aa().b(czz.c)) && $$3.dh() * $$3.dh() * $$3.di() > 0.512F) {
         a($$3, $$1, $$0, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   public static void a(@Nullable brh $$0, dqh $$1, dad $$2, in $$3) {
      dqh $$4 = a($$1, ddg.j.n(), $$2, $$3);
      $$2.b($$3, $$4);
      $$2.a(dva.c, $$3, dva.a.a($$0, $$4));
   }

   private static boolean a(czj $$0, in $$1) {
      return $$0.a_($$1.c()).a(avr.cx);
   }

   private static boolean a(dag $$0, in $$1) {
      for (in $$2 : in.c($$1.b(-4, 0, -4), $$1.b(4, 1, 4))) {
         if ($$0.b_($$2).a(avw.a)) {
            return true;
         }
      }

      return false;
   }

   @Override
   protected void a(dqi.a<dde, dqh> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dqh $$0, emp $$1) {
      return false;
   }
}
