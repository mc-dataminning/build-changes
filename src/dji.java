import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dji extends dnj implements djo, dqr {
   public static final MapCodec<dji> a = b(dji::new);
   private static final dxn b = dxm.J;
   private static final dxt<dyg> c = dxm.bo;
   private static final int d = -1;
   private static final Object2IntMap<dyg> e = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyg.b, 10);
      $$0.put(dyg.c, 10);
      $$0.put(dyg.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyg, fbt> j = ImmutableMap.of(
      dyg.a,
      djl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyg.b,
      djl.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyg.c,
      djl.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyg.d,
      fbq.a()
   );
   private static final fbt k = djl.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbt> l = ImmutableMap.of(
      jn.c, fbq.b(djj.b, k, fbd.e), jn.d, fbq.b(djj.c, k, fbd.e), jn.f, fbq.b(djj.d, k, fbd.e), jn.e, fbq.b(djj.e, k, fbd.e)
   );
   private final Map<dww, fbt> m;

   @Override
   public MapCodec<dji> a() {
      return a;
   }

   protected dji(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jn.c).b(c, dyg.a));
      this.m = this.a(dji::o);
   }

   private static fbt o(dww $$0) {
      return fbq.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dgi $$0, azh $$1, ji $$2, jn $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      ji.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dgj)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jn.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         djj.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jn.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dww $$0) {
      return $$0.l() || $$0.a(djn.J) || $$0.a(djn.th);
   }

   protected static boolean a(dgj $$0, ji $$1, dww $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dgi $$0, ji $$1, esy $$2, jn $$3) {
      dww $$4 = djn.tf.m().b(b, Boolean.valueOf($$2.a(esz.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgh $$0, dww $$1, fav $$2, cpp $$3) {
      this.a($$1, $$0, $$2.b(), dyg.d, awa.hW);
   }

   @Override
   protected esy b_(dww $$0) {
      return $$0.c(b) ? esz.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      ji $$3 = $$2.e();
      dww $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(djn.tg) || $$4.a(awp.bA);
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, esz.c, esz.c.a($$1));
         }

         return $$4 == jn.b && $$6.a(this) ? djn.tg.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      dww $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      ji $$4 = $$2.d();
      dww $$5 = $$0.a_($$4);
      if (a((dgj)$$0, $$4, $$5)) {
         jn $$6 = $$3.c(aF);
         djj.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, buk $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyg.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyg.b, null);
         }
      }
   }

   @Override
   protected void a(dww $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyg $$4 = $$0.c(c);
         if ($$4 == dyg.b) {
            this.a($$0, $$1, $$2, dyg.c, awa.hW);
         } else if ($$4 == dyg.c) {
            this.a($$0, $$1, $$2, dyg.d, awa.hW);
         } else if ($$4 == dyg.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dww $$0, dgh $$1, ji $$2, djl $$3, @Nullable eug $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgh $$0, ji $$1, avz $$2) {
      float $$3 = ayz.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(ji $$0, buk $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dww $$0, dgh $$1, ji $$2, dyg $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dww $$0, dgh $$1, ji $$2) {
      a($$0, $$1, $$2, dyg.a);
      if ($$0.c(c) != dyg.a) {
         a($$1, $$2, awa.hX);
      }
   }

   private static void a(dww $$0, dgh $$1, ji $$2, dyg $$3) {
      dyg $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ebs.c, $$2);
      }
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.m.get($$0);
   }

   @Override
   public dww a(daf $$0) {
      dww $$1 = $$0.q().a_($$0.a().e());
      esy $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(djn.tf) || $$1.a(djn.tg);
      return this.m().b(b, Boolean.valueOf($$2.a(esz.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, aF, c);
   }
}
