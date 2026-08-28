import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class der extends diq implements dex, dlv {
   public static final MapCodec<der> a = b(der::new);
   private static final dso b = dsn.C;
   private static final dsv<dti> c = dsn.bl;
   private static final int d = -1;
   private static final Object2IntMap<dti> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dti.b, 10);
      $$0.put(dti.c, 10);
      $$0.put(dti.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dti, ewf> j = ImmutableMap.of(
      dti.a,
      deu.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dti.b,
      deu.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dti.c,
      deu.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dti.d,
      ewc.a()
   );
   private static final ewf k = deu.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<je, ewf> l = ImmutableMap.of(
      je.c, ewc.b(des.b, k, evq.e), je.d, ewc.b(des.c, k, evq.e), je.f, ewc.b(des.d, k, evq.e), je.e, ewc.b(des.e, k, evq.e)
   );
   private final Map<drx, ewf> m;

   @Override
   public MapCodec<der> a() {
      return a;
   }

   protected der(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, je.c).a(c, dti.a));
      this.m = this.a(der::m);
   }

   private static ewf m(drx $$0) {
      return ewc.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dbu $$0, azc $$1, iz $$2, je $$3) {
      int $$4 = ayu.a($$1, 2, 5);
      iz.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(je.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         des.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(je.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(drx $$0) {
      return $$0.i() || $$0.a(dew.G) || $$0.a(dew.sF);
   }

   protected static boolean a(dbv $$0, iz $$1, drx $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dbu $$0, iz $$1, enq $$2, je $$3) {
      drx $$4 = dew.sD.n().a(b, Boolean.valueOf($$2.a(enr.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dbt $$0, drx $$1, evi $$2, cnk $$3) {
      this.a($$1, $$0, $$2.a(), dti.d, avw.hB);
   }

   @Override
   protected enq b_(drx $$0) {
      return $$0.c(b) ? enr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drx $$0, dbw $$1, iz $$2) {
      iz $$3 = $$2.d();
      drx $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dew.sE) || $$4.a(awl.by);
   }

   @Override
   protected drx a(drx $$0, je $$1, drx $$2, dbu $$3, iz $$4, iz $$5) {
      if ($$1 == je.a && !$$0.a($$3, $$4)) {
         return dew.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, enr.c, enr.c.a($$3));
         }

         return $$1 == je.b && $$2.a(this) ? dew.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dbw $$0, iz $$1, drx $$2) {
      drx $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(dbt $$0, azc $$1, iz $$2, drx $$3) {
      return true;
   }

   @Override
   public void a(arb $$0, azc $$1, iz $$2, drx $$3) {
      iz $$4 = $$2.c();
      drx $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         je $$6 = $$3.c(aE);
         des.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, bsp $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dti.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dti.b, null);
         }
      }
   }

   @Override
   protected void a(drx $$0, arb $$1, iz $$2, azc $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dti $$4 = $$0.c(c);
         if ($$4 == dti.b) {
            this.a($$0, $$1, $$2, dti.c, avw.hB);
         } else if ($$4 == dti.c) {
            this.a($$0, $$1, $$2, dti.d, avw.hB);
         } else if ($$4 == dti.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(drx $$0, dbt $$1, iz $$2, deu $$3, iz $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dbt $$0, iz $$1, avv $$2) {
      float $$3 = ayu.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avx.e, 1.0F, $$3);
   }

   private static boolean a(iz $$0, bsp $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(drx $$0, dbt $$1, iz $$2, dti $$3, @Nullable avv $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(drx $$0, dbt $$1, iz $$2) {
      a($$0, $$1, $$2, dti.a);
      if ($$0.c(c) != dti.a) {
         a($$1, $$2, avw.hC);
      }
   }

   private static void a(drx $$0, dbt $$1, iz $$2, dti $$3) {
      dti $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dwq.c, $$2);
      }
   }

   @Override
   protected ewf b(drx $$0, daz $$1, iz $$2, evr $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ewf a(drx $$0, daz $$1, iz $$2, evr $$3) {
      return this.m.get($$0);
   }

   @Override
   public drx a(cxv $$0) {
      drx $$1 = $$0.q().a_($$0.a().d());
      enq $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dew.sD) || $$1.a(dew.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(enr.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(b, aE, c);
   }
}
