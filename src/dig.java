import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class dig extends dme implements dim, dpk {
   public static final MapCodec<dig> a = b(dig::new);
   private static final dwf b = dwe.C;
   private static final dwl<dwy> c = dwe.bl;
   private static final int d = -1;
   private static final Object2IntMap<dwy> e = ae.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dwy.b, 10);
      $$0.put(dwy.c, 10);
      $$0.put(dwy.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dwy, fal> j = ImmutableMap.of(
      dwy.a,
      dij.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwy.b,
      dij.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dwy.c,
      dij.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dwy.d,
      fai.a()
   );
   private static final fal k = dij.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<jm, fal> l = ImmutableMap.of(
      jm.c, fai.b(dih.b, k, ezv.e), jm.d, fai.b(dih.c, k, ezv.e), jm.f, fai.b(dih.d, k, ezv.e), jm.e, fai.b(dih.e, k, ezv.e)
   );
   private final Map<dvo, fal> m;

   @Override
   public MapCodec<dig> a() {
      return a;
   }

   protected dig(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(false)).b(aF, jm.c).b(c, dwy.a));
      this.m = this.a(dig::o);
   }

   private static fal o(dvo $$0) {
      return fai.a(j.get($$0.c(c)), l.get($$0.c(aF)));
   }

   public static void a(dfg $$0, azv $$1, jh $$2, jm $$3) {
      int $$4 = azn.a($$1, 2, 5);
      jh.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jm.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dih.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jm.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean q(dvo $$0) {
      return $$0.l() || $$0.a(dil.G) || $$0.a(dil.sF);
   }

   protected static boolean a(dfh $$0, jh $$1, dvo $$2) {
      return !$$0.s($$1) && q($$2);
   }

   protected static boolean a(dfg $$0, jh $$1, ero $$2, jm $$3) {
      dvo $$4 = dil.sD.m().b(b, Boolean.valueOf($$2.a(erp.c))).b(aF, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(dff $$0, dvo $$1, ezn $$2, cpk $$3) {
      this.a($$1, $$0, $$2.b(), dwy.d, awo.hC);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(b) ? erp.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      jh $$3 = $$2.e();
      dvo $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dil.sE) || $$4.a(axd.bz);
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$4 == jm.a && !$$0.a($$1, $$3)) {
         return dil.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, erp.c, erp.c.a($$1));
         }

         return $$4 == jm.b && $$6.a(this) ? dil.sE.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean b(dfi $$0, jh $$1, dvo $$2) {
      dvo $$3 = $$0.a_($$1.d());
      return q($$3);
   }

   @Override
   public boolean a(dff $$0, azv $$1, jh $$2, dvo $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, jh $$2, dvo $$3) {
      jh $$4 = $$2.d();
      dvo $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         jm $$6 = $$3.c(aF);
         dih.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, bui $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == dwy.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dwy.b, null);
         }
      }
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      } else {
         dwy $$4 = $$0.c(c);
         if ($$4 == dwy.b) {
            this.a($$0, $$1, $$2, dwy.c, awo.hC);
         } else if ($$4 == dwy.c) {
            this.a($$0, $$1, $$2, dwy.d, awo.hC);
         } else if ($$4 == dwy.d) {
            e($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if ($$1.C($$2)) {
         e($$0, $$1, $$2);
      }
   }

   private static void a(dff $$0, jh $$1, awn $$2) {
      float $$3 = azn.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awp.e, 1.0F, $$3);
   }

   private static boolean a(jh $$0, bui $$1) {
      return $$1.aL() && $$1.dw().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dvo $$0, dff $$1, jh $$2, dwy $$3, @Nullable awn $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void e(dvo $$0, dff $$1, jh $$2) {
      a($$0, $$1, $$2, dwy.a);
      if ($$0.c(c) != dwy.a) {
         a($$1, $$2, awo.hD);
      }
   }

   private static void a(dvo $$0, dff $$1, jh $$2, dwy $$3) {
      dwy $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eak.c, $$2);
      }
   }

   @Override
   protected fal b(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return this.m.get($$0);
   }

   @Override
   public dvo a(czw $$0) {
      dvo $$1 = $$0.q().a_($$0.a().e());
      ero $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dil.sD) || $$1.a(dil.sE);
      return this.m().b(b, Boolean.valueOf($$2.a(erp.c))).b(aF, $$3 ? $$1.c(aF) : $$0.g().g());
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, aF, c);
   }
}
