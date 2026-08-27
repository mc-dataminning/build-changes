import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmx extends dkg {
   public static final MapCodec<dmx> b = b(dmx::new);
   @Nullable
   private static dqm h;
   @Nullable
   private static dqm i;

   @Override
   public MapCodec<dmx> a() {
      return b;
   }

   protected dmx(dqg.d $$0) {
      super(dkg.b.d, $$0);
   }

   @Override
   public void a(dad $$0, in $$1, dqh $$2, @Nullable bsa $$3, csz $$4) {
      a($$0, $$1);
   }

   public static void a(dad $$0, in $$1) {
      if ($$0.c_($$1) instanceof doy $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dad $$0, in $$1, doy $$2) {
      if (!$$0.B) {
         dqh $$3 = $$2.n();
         boolean $$4 = $$3.a(ddg.gG) || $$3.a(ddg.gH);
         if ($$4 && $$1.v() >= $$0.I_() && $$0.ak() != bpj.a) {
            dqm.b $$5 = s().a($$0, $$1);
            if ($$5 != null) {
               chf $$6 = brn.bo.a($$0);
               if ($$6 != null) {
                  ddy.a($$0, $$5);
                  in $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == is.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aZ = $$5.b().o() == is.a.a ? 0.0F : 90.0F;
                  $$6.r();

                  for (aqi $$8 : $$0.a(aqi.class, $$6.cI().g(50.0))) {
                     am.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  ddy.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dad $$0, in $$1, csz $$2) {
      return $$2.a(ctc.um) && $$1.v() >= $$0.I_() + 2 && $$0.ak() != bpj.a && !$$0.B ? y().a($$0, $$1) != null : false;
   }

   private static dqm s() {
      if (h == null) {
         h = dqn.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(avr.aF)).a('^', dql.a(dqq.a(ddg.gG).or(dqq.a(ddg.gH)))).a('~', $$0 -> $$0.a().i()).b();
      }

      return h;
   }

   private static dqm y() {
      if (i == null) {
         i = dqn.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(avr.aF)).a('~', $$0 -> $$0.a().i()).b();
      }

      return i;
   }
}
