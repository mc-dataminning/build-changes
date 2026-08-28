import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dhj extends dli implements dhp, doo {
   public static final MapCodec<dhj> a = b(dhj::new);
   private static final dvj b = dvi.C;
   private static final dvq<dwd> c = dvi.bl;
   private static final int d = -1;
   private static final Object2IntMap<dwd> e = ad.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dwd.b, 10);
      $$0.put(dwd.c, 10);
      $$0.put(dwd.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dwd, ezq> j = ImmutableMap.of(
      dwd.a,
      dhm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwd.b,
      dhm.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwd.c,
      dhm.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dwd.d,
      ezn.a()
   );
   private static final ezq k = dhm.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jk, ezq> l = ImmutableMap.of(
      jk.c, ezn.b(dhk.b, k, eza.e), jk.d, ezn.b(dhk.c, k, eza.e), jk.f, ezn.b(dhk.d, k, eza.e), jk.e, ezn.b(dhk.e, k, eza.e)
   );
   private final Map<dus, ezq> m;

   @Override
   public MapCodec<dhj> a() {
      return a;
   }

   protected dhj(dur.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jk.c).b(c, dwd.a));
      this.m = this.a(dhj::o);
   }

   private static ezq o(dus $$0) {
      return ezn.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dek $$0, azn $$1, jf $$2, jk $$3) {
      int $$4 = azf.a($$1, 2, 5);
      jf.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jk.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dhk.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jk.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dus $$0) {
      return $$0.l() || $$0.a(dho.G) || $$0.a(dho.sF);
   }

   protected static boolean a(del $$0, jf $$1, dus $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dek $$0, jf $$1, eqt $$2, jk $$3) {
      dus $$4 = dho.sD.n().b(b, Boolean.valueOf($$2.a(equ.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dej $$0, dus $$1, eys $$2, cor $$3) {
      this.a($$1, $$0, $$2.b(), dwd.d, awg.hC);
   }

   @Override
   protected eqt b_(dus $$0) {
      return $$0.c(b) ? equ.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      jf $$3 = $$2.e();
      dus $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dho.sE) || $$4.a(awv.bz);
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if ($$1 == jk.a && !$$0.a($$3, $$4)) {
         return dho.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, equ.c, equ.c.a($$3));
         }

         return $$1 == jk.b && $$2.a(this) ? dho.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      dus $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      jf $$4 = $$2.d();
      dus $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jk $$6 = $$3.c(aF);
         dhk.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, btr $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dwd.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dwd.b, null);
         }
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dwd $$4 = $$0.c(c);
         if ($$4 == dwd.b) {
            this.a($$0, $$1, $$2, dwd.c, awg.hC);
         } else if ($$4 == dwd.c) {
            this.a($$0, $$1, $$2, dwd.d, awg.hC);
         } else if ($$4 == dwd.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dus $$0, dej $$1, jf $$2, dhm $$3, @Nullable esb $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(dej $$0, jf $$1, awf $$2) {
      float $$3 = azf.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awh.e, 1.0F, $$3);
   }

   private static boolean a(jf $$0, btr $$1) {
      return $$1.aH() && $$1.dq().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dus $$0, dej $$1, jf $$2, dwd $$3, @Nullable awf $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dus $$0, dej $$1, jf $$2) {
      a($$0, $$1, $$2, dwd.a);
      if ($$0.c(c) != dwd.a) {
         a($$1, $$2, awg.hD);
      }
   }

   private static void a(dus $$0, dej $$1, jf $$2, dwd $$3) {
      dwd $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dzp.c, $$2);
      }
   }

   @Override
   protected ezq b(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return this.m.get($$0);
   }

   @Override
   public dus a(czn $$0) {
      dus $$1 = $$0.q().a_($$0.a().e());
      eqt $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dho.sD) || $$1.a(dho.sE);
      return this.n().b(b, Boolean.valueOf($$2.a(equ.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, aF, c);
   }
}
