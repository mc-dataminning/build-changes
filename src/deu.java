import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class deu extends dit implements dfa, dly {
   public static final MapCodec<deu> a = b(deu::new);
   private static final dsr b = dsq.C;
   private static final dsy<dtl> c = dsq.bl;
   private static final int d = -1;
   private static final Object2IntMap<dtl> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dtl.b, 10);
      $$0.put(dtl.c, 10);
      $$0.put(dtl.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dtl, ewi> j = ImmutableMap.of(
      dtl.a,
      dex.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtl.b,
      dex.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dtl.c,
      dex.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dtl.d,
      ewf.a()
   );
   private static final ewi k = dex.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewi> l = ImmutableMap.of(
      je.c, ewf.b(dev.b, k, evt.e), je.d, ewf.b(dev.c, k, evt.e), je.f, ewf.b(dev.d, k, evt.e), je.e, ewf.b(dev.e, k, evt.e)
   );
   private final Map<dsa, ewi> m;

   @Override
   public MapCodec<deu> a() {
      return a;
   }

   protected deu(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dtl.a));
      this.m = this.a(deu::m);
   }

   private static ewi m(dsa $$0) {
      return ewf.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dbx $$0, azf $$1, iz $$2, je $$3) {
      int $$4 = ayx.a($$1, 2, 5);
      iz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(je.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dev.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dsa $$0) {
      return $$0.i() || $$0.a(dez.G) || $$0.a(dez.sF);
   }

   protected static boolean a(dby $$0, iz $$1, dsa $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dbx $$0, iz $$1, ent $$2, je $$3) {
      dsa $$4 = dez.sD.o().a(b, Boolean.valueOf($$2.a(enu.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dbw $$0, dsa $$1, evl $$2, cnn $$3) {
      this.a($$1, $$0, $$2.a(), dtl.d, avz.hB);
   }

   @Override
   protected ent b_(dsa $$0) {
      return $$0.c(b) ? enu.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      iz $$3 = $$2.d();
      dsa $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dez.sE) || $$4.a(awo.by);
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dez.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, enu.c, enu.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dez.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dbz $$0, iz $$1, dsa $$2) {
      dsa $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dbw $$0, azf $$1, iz $$2, dsa $$3) {
      return true;
   }

   @Override
   public void a(are $$0, azf $$1, iz $$2, dsa $$3) {
      iz $$4 = $$2.c();
      dsa $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         dev.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, bss $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dtl.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dtl.b, null);
         }
      }
   }

   @Override
   protected void a(dsa $$0, are $$1, iz $$2, azf $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dtl $$4 = $$0.c(c);
         if ($$4 == dtl.b) {
            this.a($$0, $$1, $$2, dtl.c, avz.hB);
         } else if ($$4 == dtl.c) {
            this.a($$0, $$1, $$2, dtl.d, avz.hB);
         } else if ($$4 == dtl.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dsa $$0, dbw $$1, iz $$2, dex $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dbw $$0, iz $$1, avy $$2) {
      float $$3 = ayx.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awa.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bss $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dsa $$0, dbw $$1, iz $$2, dtl $$3, @Nullable avy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dsa $$0, dbw $$1, iz $$2) {
      a($$0, $$1, $$2, dtl.a);
      if ($$0.c(c) != dtl.a) {
         a($$1, $$2, avz.hC);
      }
   }

   private static void a(dsa $$0, dbw $$1, iz $$2, dtl $$3) {
      dtl $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dwt.c, $$2);
      }
   }

   @Override
   protected ewi b(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return this.m.get($$0);
   }

   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a().d());
      ent $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dez.sD) || $$1.a(dez.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(enu.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(b, aE, c);
   }
}
