import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class djh extends dni implements djn, dqq {
   public static final MapCodec<djh> a = b(djh::new);
   private static final dxm b = dxl.J;
   private static final dxs<dyf> c = dxl.bo;
   private static final int d = -1;
   private static final Object2IntMap<dyf> e = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dyf.b, 10);
      $$0.put(dyf.c, 10);
      $$0.put(dyf.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dyf, fbs> j = ImmutableMap.of(
      dyf.a,
      djk.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyf.b,
      djk.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dyf.c,
      djk.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dyf.d,
      fbp.a()
   );
   private static final fbs k = djk.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jn, fbs> l = ImmutableMap.of(
      jn.c, fbp.b(dji.b, k, fbc.e), jn.d, fbp.b(dji.c, k, fbc.e), jn.f, fbp.b(dji.d, k, fbc.e), jn.e, fbp.b(dji.e, k, fbc.e)
   );
   private final Map<dwv, fbs> m;

   @Override
   public MapCodec<djh> a() {
      return a;
   }

   protected djh(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jn.c).b(c, dyf.a));
      this.m = this.a(djh::o);
   }

   private static fbs o(dwv $$0) {
      return fbp.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dgh $$0, azg $$1, ji $$2, jn $$3) {
      int $$4 = ayy.a($$1, 2, 5);
      ji.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dgi)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jn.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dji.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jn.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dwv $$0) {
      return $$0.l() || $$0.a(djm.J) || $$0.a(djm.th);
   }

   protected static boolean a(dgi $$0, ji $$1, dwv $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dgh $$0, ji $$1, esx $$2, jn $$3) {
      dwv $$4 = djm.tf.m().b(b, Boolean.valueOf($$2.a(esy.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgg $$0, dwv $$1, fau $$2, cpo $$3) {
      this.a($$1, $$0, $$2.b(), dyf.d, avz.hW);
   }

   @Override
   protected esx b_(dwv $$0) {
      return $$0.c(b) ? esy.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      ji $$3 = $$2.e();
      dwv $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(djm.tg) || $$4.a(awo.bA);
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, esy.c, esy.c.a($$1));
         }

         return $$4 == jn.b && $$6.a(this) ? djm.tg.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      dwv $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      ji $$4 = $$2.d();
      dwv $$5 = $$0.a_($$4);
      if (a((dgi)$$0, $$4, $$5)) {
         jn $$6 = $$3.c(aF);
         dji.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, buj $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dyf.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dyf.b, null);
         }
      }
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dyf $$4 = $$0.c(c);
         if ($$4 == dyf.b) {
            this.a($$0, $$1, $$2, dyf.c, avz.hW);
         } else if ($$4 == dyf.c) {
            this.a($$0, $$1, $$2, dyf.d, avz.hW);
         } else if ($$4 == dyf.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgg $$0, ji $$1, avy $$2) {
      float $$3 = ayy.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awa.e, 1.0F, $$3);
   }

   private static boolean a(ji $$0, buj $$1) {
      return $$1.aJ() && $$1.du().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dwv $$0, dgg $$1, ji $$2, dyf $$3, @Nullable avy $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dwv $$0, dgg $$1, ji $$2) {
      a($$0, $$1, $$2, dyf.a);
      if ($$0.c(c) != dyf.a) {
         a($$1, $$2, avz.hX);
      }
   }

   private static void a(dwv $$0, dgg $$1, ji $$2, dyf $$3) {
      dyf $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ebr.c, $$2);
      }
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.m.get($$0);
   }

   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a().e());
      esx $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(djm.tf) || $$1.a(djm.tg);
      return this.m().b(b, Boolean.valueOf($$2.a(esy.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, aF, c);
   }
}
