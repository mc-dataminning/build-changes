import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dev extends diu implements dfb, dlz {
   public static final MapCodec<dev> a = b(dev::new);
   private static final dss b = dsr.C;
   private static final dsz<dtm> c = dsr.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtm> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtm.b, 10);
      $$0.put(dtm.c, 10);
      $$0.put(dtm.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtm, ewj> j = ImmutableMap.of(
      dtm.a,
      dey.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtm.b,
      dey.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtm.c,
      dey.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtm.d,
      ewg.a()
   );
   private static final ewj k = dey.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewj> l = ImmutableMap.of(
      je.c, ewg.b(dew.b, k, evu.e), je.d, ewg.b(dew.c, k, evu.e), je.f, ewg.b(dew.d, k, evu.e), je.e, ewg.b(dew.e, k, evu.e)
   );
   private final Map<dsb, ewj> m;

   @Override
   public MapCodec<dev> a() {
      return a;
   }

   protected dev(dsa.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dtm.a));
      this.m = this.a(dev::m);
   }

   private static ewj m(dsb $$0) {
      return ewg.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dby $$0, azg $$1, iz $$2, je $$3) {
      int $$4 = ayy.a($$1, 2, 5);
      iz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(je.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dew.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsb $$0) {
      return $$0.i() || $$0.a(dfa.G) || $$0.a(dfa.sF);
   }

   protected static boolean a(dbz $$0, iz $$1, dsb $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dby $$0, iz $$1, enu $$2, je $$3) {
      dsb $$4 = dfa.sD.o().a(b, Boolean.valueOf($$2.a(env.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dbx $$0, dsb $$1, evm $$2, cno $$3) {
      this.a($$1, $$0, $$2.a(), dtm.d, avz.hB);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(b) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dfa.sE) || $$4.a(awo.by);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dfa.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, env.c, env.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dfa.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dca $$0, iz $$1, dsb $$2) {
      dsb $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dbx $$0, azg $$1, iz $$2, dsb $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azg $$1, iz $$2, dsb $$3) {
      iz $$4 = $$2.c();
      dsb $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         dew.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, bst $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtm.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtm.b, null);
         }
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtm $$4 = $$0.c(c);
         if ($$4 == dtm.b) {
            this.a($$0, $$1, $$2, dtm.c, avz.hB);
         } else if ($$4 == dtm.c) {
            this.a($$0, $$1, $$2, dtm.d, avz.hB);
         } else if ($$4 == dtm.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsb $$0, dbx $$1, iz $$2, dey $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dbx $$0, iz $$1, avy $$2) {
      float $$3 = ayy.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awa.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bst $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsb $$0, dbx $$1, iz $$2, dtm $$3, @Nullable avy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsb $$0, dbx $$1, iz $$2) {
      a($$0, $$1, $$2, dtm.a);
      if ($$0.c(c) != dtm.a) {
         a($$1, $$2, avz.hC);
      }
   }

   private static void a(dsb $$0, dbx $$1, iz $$2, dtm $$3) {
      dtm $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dwu.c, $$2);
      }
   }

   @Override
   protected ewj b(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsb a(cxz $$0) {
      dsb $$1 = $$0.q().a_($$0.a().d());
      enu $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dfa.sD) || $$1.a(dfa.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(env.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, aE, c);
   }
}
