import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dhg extends dlf implements dhm, dol {
   public static final MapCodec<dhg> a = b(dhg::new);
   private static final dvf b = dve.C;
   private static final dvm<dvz> c = dve.bl;
   private static final int d = -1;
   private static final Object2IntMap<dvz> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dvz.b, 10);
      $$0.put(dvz.c, 10);
      $$0.put(dvz.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dvz, ezm> j = ImmutableMap.of(
      dvz.a,
      dhj.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dvz.b,
      dhj.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dvz.c,
      dhj.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dvz.d,
      ezj.a()
   );
   private static final ezm k = dhj.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jj, ezm> l = ImmutableMap.of(
      jj.c, ezj.b(dhh.b, k, eyw.e), jj.d, ezj.b(dhh.c, k, eyw.e), jj.f, ezj.b(dhh.d, k, eyw.e), jj.e, ezj.b(dhh.e, k, eyw.e)
   );
   private final Map<duo, ezm> m;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   protected dhg(dun.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jj.c).b(c, dvz.a));
      this.m = this.a(dhg::o);
   }

   private static ezm o(duo $$0) {
      return ezj.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(deh $$0, azl $$1, je $$2, jj $$3) {
      int $$4 = azd.a($$1, 2, 5);
      je.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jj.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dhh.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jj.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(duo $$0) {
      return $$0.l() || $$0.a(dhl.G) || $$0.a(dhl.sF);
   }

   protected static boolean a(dei $$0, je $$1, duo $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(deh $$0, je $$1, eqp $$2, jj $$3) {
      duo $$4 = dhl.sD.o().b(b, Boolean.valueOf($$2.a(eqq.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(deg $$0, duo $$1, eyo $$2, coo $$3) {
      this.a($$1, $$0, $$2.b(), dvz.d, awe.hC);
   }

   @Override
   protected eqp b_(duo $$0) {
      return $$0.c(b) ? eqq.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      je $$3 = $$2.e();
      duo $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dhl.sE) || $$4.a(awt.bz);
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if ($$1 == jj.a && !$$0.a($$3, $$4)) {
         return dhl.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eqq.c, eqq.c.a($$3));
         }

         return $$1 == jj.b && $$2.a(this) ? dhl.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      duo $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      je $$4 = $$2.d();
      duo $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jj $$6 = $$3.c(aF);
         dhh.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, bto $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dvz.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dvz.b, null);
         }
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dvz $$4 = $$0.c(c);
         if ($$4 == dvz.b) {
            this.a($$0, $$1, $$2, dvz.c, awe.hC);
         } else if ($$4 == dvz.c) {
            this.a($$0, $$1, $$2, dvz.d, awe.hC);
         } else if ($$4 == dvz.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(duo $$0, deg $$1, je $$2, dhj $$3, @Nullable erx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(deg $$0, je $$1, awd $$2) {
      float $$3 = azd.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awf.e, 1.0F, $$3);
   }

   private static boolean a(je $$0, bto $$1) {
      return $$1.aH() && $$1.dq().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(duo $$0, deg $$1, je $$2, dvz $$3, @Nullable awd $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(duo $$0, deg $$1, je $$2) {
      a($$0, $$1, $$2, dvz.a);
      if ($$0.c(c) != dvz.a) {
         a($$1, $$2, awe.hD);
      }
   }

   private static void a(duo $$0, deg $$1, je $$2, dvz $$3) {
      dvz $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dzl.c, $$2);
      }
   }

   @Override
   protected ezm b(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return this.m.get($$0);
   }

   @Override
   public duo a(czk $$0) {
      duo $$1 = $$0.q().a_($$0.a().e());
      eqp $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dhl.sD) || $$1.a(dhl.sE);
      return this.o().b(b, Boolean.valueOf($$2.a(eqq.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, aF, c);
   }
}
