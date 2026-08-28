import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dgs extends dkr implements dgy, dnx {
   public static final MapCodec<dgs> a = b(dgs::new);
   private static final dur b = duq.C;
   private static final duy<dvl> c = duq.bl;
   private static final int d = -1;
   private static final Object2IntMap<dvl> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dvl.b, 10);
      $$0.put(dvl.c, 10);
      $$0.put(dvl.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dvl, eyx> j = ImmutableMap.of(
      dvl.a,
      dgv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dvl.b,
      dgv.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dvl.c,
      dgv.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dvl.d,
      eyu.a()
   );
   private static final eyx k = dgv.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jj, eyx> l = ImmutableMap.of(
      jj.c, eyu.b(dgt.b, k, eyi.e), jj.d, eyu.b(dgt.c, k, eyi.e), jj.f, eyu.b(dgt.d, k, eyi.e), jj.e, eyu.b(dgt.e, k, eyi.e)
   );
   private final Map<dua, eyx> m;

   @Override
   public MapCodec<dgs> a() {
      return a;
   }

   protected dgs(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(b, Boolean.valueOf(false)).b(aE, jj.c).b(c, dvl.a));
      this.m = this.a(dgs::o);
   }

   private static eyx o(dua $$0) {
      return eyu.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(ddt $$0, azk $$1, je $$2, jj $$3) {
      int $$4 = azc.a($$1, 2, 5);
      je.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jj.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dgt.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jj.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dua $$0) {
      return $$0.l() || $$0.a(dgx.G) || $$0.a(dgx.sF);
   }

   protected static boolean a(ddu $$0, je $$1, dua $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(ddt $$0, je $$1, eqb $$2, jj $$3) {
      dua $$4 = dgx.sD.o().b(b, Boolean.valueOf($$2.a(eqc.c))).b(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dds $$0, dua $$1, eya $$2, coi $$3) {
      this.a($$1, $$0, $$2.a(), dvl.d, awd.hC);
   }

   @Override
   protected eqb b_(dua $$0) {
      return $$0.c(b) ? eqc.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      je $$3 = $$2.e();
      dua $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dgx.sE) || $$4.a(aws.bz);
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !$$0.a($$3, $$4)) {
         return dgx.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eqc.c, eqc.c.a($$3));
         }

         return $$1 == jj.b && $$2.a(this) ? dgx.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      dua $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      je $$4 = $$2.d();
      dua $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jj $$6 = $$3.c(aE);
         dgt.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, btj $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dvl.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dvl.b, null);
         }
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dvl $$4 = $$0.c(c);
         if ($$4 == dvl.b) {
            this.a($$0, $$1, $$2, dvl.c, awd.hC);
         } else if ($$4 == dvl.c) {
            this.a($$0, $$1, $$2, dvl.d, awd.hC);
         } else if ($$4 == dvl.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dua $$0, dds $$1, je $$2, dgv $$3, @Nullable erj $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dds $$0, je $$1, awc $$2) {
      float $$3 = azc.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awe.e, 1.0F, $$3);
   }

   private static boolean a(je $$0, btj $$1) {
      return $$1.aH() && $$1.dq().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dua $$0, dds $$1, je $$2, dvl $$3, @Nullable awc $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dua $$0, dds $$1, je $$2) {
      a($$0, $$1, $$2, dvl.a);
      if ($$0.c(c) != dvl.a) {
         a($$1, $$2, awd.hD);
      }
   }

   private static void a(dua $$0, dds $$1, je $$2, dvl $$3) {
      dvl $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dyx.c, $$2);
      }
   }

   @Override
   protected eyx b(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return this.m.get($$0);
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a().e());
      eqb $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dgx.sD) || $$1.a(dgx.sE);
      return this.o().b(b, Boolean.valueOf($$2.a(eqc.c))).b(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, aE, c);
   }
}
