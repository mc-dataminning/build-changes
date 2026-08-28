import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dib extends dlz implements dih, dpf {
   public static final MapCodec<dib> a = b(dib::new);
   private static final dwa b = dvz.C;
   private static final dwh<dwu> c = dvz.bl;
   private static final int d = -1;
   private static final Object2IntMap<dwu> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dwu.b, 10);
      $$0.put(dwu.c, 10);
      $$0.put(dwu.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dwu, fah> j = ImmutableMap.of(
      dwu.a,
      die.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwu.b,
      die.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwu.c,
      die.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dwu.d,
      fae.a()
   );
   private static final fah k = die.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fah> l = ImmutableMap.of(
      jm.c, fae.b(dic.b, k, ezr.e), jm.d, fae.b(dic.c, k, ezr.e), jm.f, fae.b(dic.d, k, ezr.e), jm.e, fae.b(dic.e, k, ezr.e)
   );
   private final Map<dvj, fah> m;

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   protected dib(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dwu.a));
      this.m = this.a(dib::o);
   }

   private static fah o(dvj $$0) {
      return fae.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dfc $$0, azs $$1, jh $$2, jm $$3) {
      int $$4 = azk.a($$1, 2, 5);
      jh.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jm.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dic.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dvj $$0) {
      return $$0.l() || $$0.a(dig.G) || $$0.a(dig.sF);
   }

   protected static boolean a(dfd $$0, jh $$1, dvj $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dfc $$0, jh $$1, erk $$2, jm $$3) {
      dvj $$4 = dig.sD.m().b(b, Boolean.valueOf($$2.a(erl.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dfb $$0, dvj $$1, ezj $$2, cpg $$3) {
      this.a($$1, $$0, $$2.b(), dwu.d, awl.hC);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(b) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvj $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dig.sE) || $$4.a(axa.bz);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$1 == jm.a && !$$0.a($$3, $$4)) {
         return dig.a.m();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, erl.c, erl.c.a($$3));
         }

         return $$1 == jm.b && $$2.a(this) ? dig.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      dvj $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      jh $$4 = $$2.d();
      dvj $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dic.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dwu.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dwu.b, null);
         }
      }
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dwu $$4 = $$0.c(c);
         if ($$4 == dwu.b) {
            this.a($$0, $$1, $$2, dwu.c, awl.hC);
         } else if ($$4 == dwu.c) {
            this.a($$0, $$1, $$2, dwu.d, awl.hC);
         } else if ($$4 == dwu.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dfb $$0, jh $$1, awk $$2) {
      float $$3 = azk.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awm.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bue $$1) {
      return $$1.aK() && $$1.dv().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dvj $$0, dfb $$1, jh $$2, dwu $$3, @Nullable awk $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dvj $$0, dfb $$1, jh $$2) {
      a($$0, $$1, $$2, dwu.a);
      if ($$0.c(c) != dwu.a) {
         a($$1, $$2, awl.hD);
      }
   }

   private static void a(dvj $$0, dfb $$1, jh $$2, dwu $$3) {
      dwu $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eag.c, $$2);
      }
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return this.m.get($$0);
   }

   @Override
   public dvj a(czs $$0) {
      dvj $$1 = $$0.q().a_($$0.a().e());
      erk $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dig.sD) || $$1.a(dig.sE);
      return this.m().b(b, Boolean.valueOf($$2.a(erl.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b, aF, c);
   }
}
