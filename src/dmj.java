import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmj extends dqn implements dmp, dtx {
   public static final MapCodec<dmj> a = b(dmj::new);
   private static final ebf b = ebe.I;
   private static final ebm<eca> c = ebe.bo;
   private static final int d = -1;
   private static final Object2IntMap<eca> f = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(eca.b, 10);
      $$0.put(eca.c, 10);
      $$0.put(eca.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<eca, ffr> D = Maps.newEnumMap(
      Map.of(eca.a, dmm.b(16.0, 11.0, 15.0), eca.b, dmm.b(16.0, 11.0, 15.0), eca.c, dmm.b(16.0, 11.0, 13.0), eca.d, ffo.a())
   );
   private final Function<eao, ffr> R;

   @Override
   public MapCodec<dmj> a() {
      return a;
   }

   protected dmj(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c).b(c, eca.a));
      this.R = this.q();
   }

   private Function<eao, ffr> q() {
      Map<jb, ffr> $$0 = ffo.c(dmm.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> ffo.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ebr[]{b});
   }

   public static void a(dji $$0, azv $$1, iv $$2, jb $$3) {
      int $$4 = azm.a($$1, 2, 5);
      iv.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((djj)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jb.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dmk.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jb.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(eao $$0) {
      return $$0.l() || $$0.a(dmo.J) || $$0.a(dmo.tp);
   }

   protected static boolean a(djj $$0, iv $$1, eao $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(dji $$0, iv $$1, ewv $$2, jb $$3) {
      eao $$4 = dmo.tn.m().b(b, Boolean.valueOf($$2.a(eww.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(djh $$0, eao $$1, fet $$2, cse $$3) {
      this.a($$1, $$0, $$2.b(), eca.d, awn.hZ);
   }

   @Override
   protected ewv b_(eao $$0) {
      return $$0.c(b) ? eww.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eao $$0, djk $$1, iv $$2) {
      iv $$3 = $$2.e();
      eao $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dmo.to) || $$4.a(axc.bB);
   }

   @Override
   protected eao a(eao $$0, djk $$1, djw $$2, iv $$3, jb $$4, iv $$5, eao $$6, azv $$7) {
      if ($$4 == jb.a && !$$0.a($$1, $$3)) {
         return dmo.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, eww.c, eww.c.a($$1));
         }

         return $$4 == jb.b && $$6.a(this) ? dmo.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(djk $$0, iv $$1, eao $$2) {
      eao $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(djh $$0, azv $$1, iv $$2, eao $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eao $$3) {
      iv $$4 = $$2.d();
      eao $$5 = $$0.a_($$4);
      if (a((djj)$$0, $$4, $$5)) {
         jb $$6 = $$3.c(e);
         dmk.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == eca.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, eca.b, null);
         }
      }
   }

   @Override
   protected void a(eao $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         eca $$4 = $$0.c(c);
         if ($$4 == eca.b) {
            this.a($$0, $$1, $$2, eca.c, awn.hZ);
         } else if ($$4 == eca.c) {
            this.a($$0, $$1, $$2, eca.d, awn.hZ);
         } else if ($$4 == eca.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(eao $$0, djh $$1, iv $$2, dmm $$3, @Nullable eyd $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(djh $$0, iv $$1, awm $$2) {
      float $$3 = azm.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awo.e, 1.0F, $$3);
   }

   private static boolean a(iv $$0, bwi $$1) {
      return $$1.aH() && $$1.ds().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(eao $$0, djh $$1, iv $$2, eca $$3, @Nullable awm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(eao $$0, djh $$1, iv $$2) {
      a($$0, $$1, $$2, eca.a);
      if ($$0.c(c) != eca.a) {
         a($$1, $$2, awn.ia);
      }
   }

   private static void a(eao $$0, djh $$1, iv $$2, eca $$3) {
      eca $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, efo.c, $$2);
      }
   }

   @Override
   protected ffr b(eao $$0, din $$1, iv $$2, ffc $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected ffr a(eao $$0, din $$1, iv $$2, ffc $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eao a(ddd $$0) {
      eao $$1 = $$0.q().a_($$0.a().e());
      ewv $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dmo.tn) || $$1.a(dmo.to);
      return this.m().b(b, Boolean.valueOf($$2.a(eww.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(b, e, c);
   }
}
