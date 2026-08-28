import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dkb extends dod implements dkh, drl {
   public static final MapCodec<dkb> a = b(dkb::new);
   private static final dyh b = dyg.I;
   private static final dyo<dzb> c = dyg.bo;
   private static final int d = -1;
   private static final Object2IntMap<dzb> f = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dzb.b, 10);
      $$0.put(dzb.c, 10);
      $$0.put(dzb.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dzb, fcr> C = Maps.newEnumMap(
      Map.of(dzb.a, dke.b(16.0, 11.0, 15.0), dzb.b, dke.b(16.0, 11.0, 15.0), dzb.c, dke.b(16.0, 11.0, 13.0), dzb.d, fco.a())
   );
   private final Function<dxq, fcr> Q;

   @Override
   public MapCodec<dkb> a() {
      return a;
   }

   protected dkb(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, jn.c).b(c, dzb.a));
      this.Q = this.q();
   }

   private Function<dxq, fcr> q() {
      Map<jn, fcr> $$0 = fco.c(dke.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fco.a(C.get($$1.c(c)), $$0.get($$1.c(e))), new dyt[]{b});
   }

   public static void a(dha $$0, azh $$1, ji $$2, jn $$3) {
      int $$4 = ayz.a($$1, 2, 5);
      ji.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dhb)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jn.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dkc.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jn.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(dxq $$0) {
      return $$0.l() || $$0.a(dkg.J) || $$0.a(dkg.tj);
   }

   protected static boolean a(dhb $$0, ji $$1, dxq $$2) {
      return !$$0.s($$1) && o($$2);
   }

   protected static boolean a(dha $$0, ji $$1, etw $$2, jn $$3) {
      dxq $$4 = dkg.th.m().b(b, Boolean.valueOf($$2.a(etx.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dgz $$0, dxq $$1, fbt $$2, cqk $$3) {
      this.a($$1, $$0, $$2.b(), dzb.d, awa.hW);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.e();
      dxq $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dkg.ti) || $$4.a(awp.bA);
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.a && !$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return $$4 == jn.b && $$6.a(this) ? dkg.ti.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      dxq $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      ji $$4 = $$2.d();
      dxq $$5 = $$0.a_($$4);
      if (a((dhb)$$0, $$4, $$5)) {
         jn $$6 = $$3.c(e);
         dkc.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, bva $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dzb.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dzb.b, null);
         }
      }
   }

   @Override
   protected void a(dxq $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dzb $$4 = $$0.c(c);
         if ($$4 == dzb.b) {
            this.a($$0, $$1, $$2, dzb.c, awa.hW);
         } else if ($$4 == dzb.c) {
            this.a($$0, $$1, $$2, dzb.d, awa.hW);
         } else if ($$4 == dzb.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dxq $$0, dgz $$1, ji $$2, dke $$3, @Nullable eve $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dgz $$0, ji $$1, avz $$2) {
      float $$3 = ayz.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awb.e, 1.0F, $$3);
   }

   private static boolean a(ji $$0, bva $$1) {
      return $$1.aJ() && $$1.ds().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dxq $$0, dgz $$1, ji $$2, dzb $$3, @Nullable avz $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dxq $$0, dgz $$1, ji $$2) {
      a($$0, $$1, $$2, dzb.a);
      if ($$0.c(c) != dzb.a) {
         a($$1, $$2, awa.hX);
      }
   }

   private static void a(dxq $$0, dgz $$1, ji $$2, dzb $$3) {
      dzb $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, ecp.c, $$2);
      }
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return C.get($$0.c(c));
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dxq a(dax $$0) {
      dxq $$1 = $$0.q().a_($$0.a().e());
      etw $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dkg.th) || $$1.a(dkg.ti);
      return this.m().b(b, Boolean.valueOf($$2.a(etx.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, e, c);
   }
}
