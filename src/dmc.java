import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmc extends dqg implements dmi, dtq {
   public static final MapCodec<dmc> a = b(dmc::new);
   private static final eay b = eax.I;
   private static final ebf<ebt> c = eax.bo;
   private static final int d = -1;
   private static final Object2IntMap<ebt> f = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ebt.b, 10);
      $$0.put(ebt.c, 10);
      $$0.put(ebt.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<ebt, ffk> D = Maps.newEnumMap(
      Map.of(ebt.a, dmf.b(16.0, 11.0, 15.0), ebt.b, dmf.b(16.0, 11.0, 15.0), ebt.c, dmf.b(16.0, 11.0, 13.0), ebt.d, ffh.a())
   );
   private final Function<eah, ffk> R;

   @Override
   public MapCodec<dmc> a() {
      return a;
   }

   protected dmc(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, ja.c).b(c, ebt.a));
      this.R = this.q();
   }

   private Function<eah, ffk> q() {
      Map<ja, ffk> $$0 = ffh.c(dmf.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> ffh.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ebk[]{b});
   }

   public static void a(djb $$0, azv $$1, iu $$2, ja $$3) {
      int $$4 = azm.a($$1, 2, 5);
      iu.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((djc)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ja.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dmd.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ja.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(eah $$0) {
      return $$0.l() || $$0.a(dmh.J) || $$0.a(dmh.tp);
   }

   protected static boolean a(djc $$0, iu $$1, eah $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(djb $$0, iu $$1, ewo $$2, ja $$3) {
      eah $$4 = dmh.tn.m().b(b, Boolean.valueOf($$2.a(ewp.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dja $$0, eah $$1, fem $$2, crx $$3) {
      this.a($$1, $$0, $$2.b(), ebt.d, awn.hZ);
   }

   @Override
   protected ewo b_(eah $$0) {
      return $$0.c(b) ? ewp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      iu $$3 = $$2.e();
      eah $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dmh.to) || $$4.a(axc.bB);
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if ($$4 == ja.a && !$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ewp.c, ewp.c.a($$1));
         }

         return $$4 == ja.b && $$6.a(this) ? dmh.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      eah $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      iu $$4 = $$2.d();
      eah $$5 = $$0.a_($$4);
      if (a((djc)$$0, $$4, $$5)) {
         ja $$6 = $$3.c(e);
         dmd.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, bwf $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == ebt.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, ebt.b, null);
         }
      }
   }

   @Override
   protected void a(eah $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         ebt $$4 = $$0.c(c);
         if ($$4 == ebt.b) {
            this.a($$0, $$1, $$2, ebt.c, awn.hZ);
         } else if ($$4 == ebt.c) {
            this.a($$0, $$1, $$2, ebt.d, awn.hZ);
         } else if ($$4 == ebt.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dja $$0, iu $$1, awm $$2) {
      float $$3 = azm.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awo.e, 1.0F, $$3);
   }

   private static boolean a(iu $$0, bwf $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(eah $$0, dja $$1, iu $$2, ebt $$3, @Nullable awm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(eah $$0, dja $$1, iu $$2) {
      a($$0, $$1, $$2, ebt.a);
      if ($$0.c(c) != ebt.a) {
         a($$1, $$2, awn.ia);
      }
   }

   private static void a(eah $$0, dja $$1, iu $$2, ebt $$3) {
      ebt $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, efh.c, $$2);
      }
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eah a(dcw $$0) {
      eah $$1 = $$0.q().a_($$0.a().e());
      ewo $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dmh.tn) || $$1.a(dmh.to);
      return this.m().b(b, Boolean.valueOf($$2.a(ewp.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, e, c);
   }
}
