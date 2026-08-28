import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsj extends dps {
   public static final MapCodec<dsj> b = b(dsj::new);
   @Nullable
   private static dwa h;
   @Nullable
   private static dwa i;

   @Override
   public MapCodec<dsj> a() {
      return b;
   }

   protected dsj(dvu.d $$0) {
      super(dps.b.d, $$0);
   }

   @Override
   public void a(dfm $$0, jh $$1, dvv $$2, @Nullable bvh $$3, cwm $$4) {
      a($$0, $$1);
   }

   public static void a(dfm $$0, jh $$1) {
      if ($$0.c_($$1) instanceof dum $$2) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dfm $$0, jh $$1, dum $$2) {
      if (!$$0.C) {
         dvv $$3 = $$2.m();
         boolean $$4 = $$3.a(dis.gG) || $$3.a(dis.gH);
         if ($$4 && $$1.v() >= $$0.K_() && $$0.ak() != bsh.a) {
            dwa.b $$5 = q().a($$0, $$1);
            if ($$5 != null) {
               ckp $$6 = bus.bF.a($$0, bur.k);
               if ($$6 != null) {
                  djk.a($$0, $$5);
                  jh $$7 = $$5.a(1, 2, 0).d();
                  $$6.b((double)$$7.u() + 0.5, (double)$$7.v() + 0.55, (double)$$7.w() + 0.5, $$5.b().o() == jm.a.a ? 0.0F : 90.0F, 0.0F);
                  $$6.aW = $$5.b().o() == jm.a.a ? 0.0F : 90.0F;
                  $$6.n();

                  for (arq $$8 : $$0.a(arq.class, $$6.cR().g(50.0))) {
                     ao.o.a($$8, $$6);
                  }

                  $$0.b($$6);
                  djk.b($$0, $$5);
               }
            }
         }
      }
   }

   public static boolean b(dfm $$0, jh $$1, cwm $$2) {
      return $$2.a(cwq.uE) && $$1.v() >= $$0.K_() + 2 && $$0.ak() != bsh.a && !$$0.C ? r().a($$0, $$1) != null : false;
   }

   private static dwa q() {
      if (h == null) {
         h = dwb.a().a("^^^", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aH)).a('^', dvz.a(dwe.a(dis.gG).or(dwe.a(dis.gH)))).a('~', $$0 -> $$0.a().l()).b();
      }

      return h;
   }

   private static dwa r() {
      if (i == null) {
         i = dwb.a().a("   ", "###", "~#~").a('#', $$0 -> $$0.a().a(axc.aH)).a('~', $$0 -> $$0.a().l()).b();
      }

      return i;
   }
}
