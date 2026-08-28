import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkr extends dot implements dkx, dsb {
   public static final MapCodec<dkr> a = b(dkr::new);
   private static final dzd b = dzc.I;
   private static final dzk<dzy> c = dzc.bo;
   private static final int d = -1;
   private static final Object2IntMap<dzy> f = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dzy.b, 10);
      $$0.put(dzy.c, 10);
      $$0.put(dzy.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dzy, fdo> C = Maps.newEnumMap(
      Map.of(dzy.a, dku.b(16.0, 11.0, 15.0), dzy.b, dku.b(16.0, 11.0, 15.0), dzy.c, dku.b(16.0, 11.0, 13.0), dzy.d, fdl.a())
   );
   private final Function<dym, fdo> Q;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   protected dkr(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, jo.c).b(c, dzy.a));
      this.Q = this.q();
   }

   private Function<dym, fdo> q() {
      Map<jo, fdo> $$0 = fdl.c(dku.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fdl.a(C.get($$1.c(c)), $$0.get($$1.c(e))), new dzp[]{b});
   }

   public static void a(dhq $$0, azs $$1, jj $$2, jo $$3) {
      int $$4 = azk.a($$1, 2, 5);
      jj.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dhr)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jo.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dks.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jo.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(dym $$0) {
      return $$0.l() || $$0.a(dkw.J) || $$0.a(dkw.tl);
   }

   protected static boolean a(dhr $$0, jj $$1, dym $$2) {
      return !$$0.s($$1) && o($$2);
   }

   protected static boolean a(dhq $$0, jj $$1, eut $$2, jo $$3) {
      dym $$4 = dkw.tj.m().b(b, Boolean.valueOf($$2.a(euu.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dhp $$0, dym $$1, fcq $$2, crb $$3) {
      this.a($$1, $$0, $$2.b(), dzy.d, awk.hW);
   }

   @Override
   protected eut b_(dym $$0) {
      return $$0.c(b) ? euu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      jj $$3 = $$2.e();
      dym $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dkw.tk) || $$4.a(awz.bA);
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if ($$4 == jo.a && !$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, euu.c, euu.c.a($$1));
         }

         return $$4 == jo.b && $$6.a(this) ? dkw.tk.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      dym $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      jj $$4 = $$2.d();
      dym $$5 = $$0.a_($$4);
      if (a((dhr)$$0, $$4, $$5)) {
         jo $$6 = $$3.c(e);
         dks.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, bvs $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dzy.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dzy.b, null);
         }
      }
   }

   @Override
   protected void a(dym $$0, arn $$1, jj $$2, azs $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dzy $$4 = $$0.c(c);
         if ($$4 == dzy.b) {
            this.a($$0, $$1, $$2, dzy.c, awk.hW);
         } else if ($$4 == dzy.c) {
            this.a($$0, $$1, $$2, dzy.d, awk.hW);
         } else if ($$4 == dzy.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dhp $$0, jj $$1, awj $$2) {
      float $$3 = azk.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awl.e, 1.0F, $$3);
   }

   private static boolean a(jj $$0, bvs $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dym $$0, dhp $$1, jj $$2, dzy $$3, @Nullable awj $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dym $$0, dhp $$1, jj $$2) {
      a($$0, $$1, $$2, dzy.a);
      if ($$0.c(c) != dzy.a) {
         a($$1, $$2, awk.hX);
      }
   }

   private static void a(dym $$0, dhp $$1, jj $$2, dzy $$3) {
      dzy $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, edm.c, $$2);
      }
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return C.get($$0.c(c));
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a().e());
      eut $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dkw.tj) || $$1.a(dkw.tk);
      return this.m().b(b, Boolean.valueOf($$2.a(euu.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, e, c);
   }
}
