import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dlx extends dqa implements dmd, dtj {
   public static final MapCodec<dlx> a = b(dlx::new);
   private static final eaq b = eap.I;
   private static final eax<ebl> c = eap.bo;
   private static final int d = -1;
   private static final Object2IntMap<ebl> f = af.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ebl.b, 10);
      $$0.put(ebl.c, 10);
      $$0.put(ebl.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<ebl, ffc> C = Maps.newEnumMap(
      Map.of(ebl.a, dma.b(16.0, 11.0, 15.0), ebl.b, dma.b(16.0, 11.0, 15.0), ebl.c, dma.b(16.0, 11.0, 13.0), ebl.d, fez.a())
   );
   private final Function<dzz, ffc> Q;

   @Override
   public MapCodec<dlx> a() {
      return a;
   }

   protected dlx(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)).b(e, ja.c).b(c, ebl.a));
      this.Q = this.q();
   }

   private Function<dzz, ffc> q() {
      Map<ja, ffc> $$0 = fez.c(dma.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fez.a(C.get($$1.c(c)), $$0.get($$1.c(e))), new ebc[]{b});
   }

   public static void a(diw $$0, azv $$1, iu $$2, ja $$3) {
      int $$4 = azm.a($$1, 2, 5);
      iu.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dix)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ja.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dly.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ja.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(dzz $$0) {
      return $$0.l() || $$0.a(dmc.J) || $$0.a(dmc.tm);
   }

   protected static boolean a(dix $$0, iu $$1, dzz $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(diw $$0, iu $$1, ewg $$2, ja $$3) {
      dzz $$4 = dmc.tk.m().b(b, Boolean.valueOf($$2.a(ewh.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(div $$0, dzz $$1, fee $$2, crs $$3) {
      this.a($$1, $$0, $$2.b(), ebl.d, awn.hX);
   }

   @Override
   protected ewg b_(dzz $$0) {
      return $$0.c(b) ? ewh.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      iu $$3 = $$2.e();
      dzz $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dmc.tl) || $$4.a(axc.bA);
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if ($$4 == ja.a && !$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, ewh.c, ewh.c.a($$1));
         }

         return $$4 == ja.b && $$6.a(this) ? dmc.tl.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      dzz $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      iu $$4 = $$2.d();
      dzz $$5 = $$0.a_($$4);
      if (a((dix)$$0, $$4, $$5)) {
         ja $$6 = $$3.c(e);
         dly.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, bwd $$3) {
      if (!$$1.C) {
         if ($$0.c(c) == ebl.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, ebl.b, null);
         }
      }
   }

   @Override
   protected void a(dzz $$0, arq $$1, iu $$2, azv $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         ebl $$4 = $$0.c(c);
         if ($$4 == ebl.b) {
            this.a($$0, $$1, $$2, ebl.c, awn.hX);
         } else if ($$4 == ebl.c) {
            this.a($$0, $$1, $$2, ebl.d, awn.hX);
         } else if ($$4 == ebl.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(dzz $$0, div $$1, iu $$2, dma $$3, @Nullable exo $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(div $$0, iu $$1, awm $$2) {
      float $$3 = azm.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awo.e, 1.0F, $$3);
   }

   private static boolean a(iu $$0, bwd $$1) {
      return $$1.aJ() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dzz $$0, div $$1, iu $$2, ebl $$3, @Nullable awm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dzz $$0, div $$1, iu $$2) {
      a($$0, $$1, $$2, ebl.a);
      if ($$0.c(c) != ebl.a) {
         a($$1, $$2, awn.hY);
      }
   }

   private static void a(dzz $$0, div $$1, iu $$2, ebl $$3) {
      ebl $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eez.c, $$2);
      }
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return C.get($$0.c(c));
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.Q.apply($$0);
   }

   @Override
   public dzz a(dcr $$0) {
      dzz $$1 = $$0.q().a_($$0.a().e());
      ewg $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dmc.tk) || $$1.a(dmc.tl);
      return this.m().b(b, Boolean.valueOf($$2.a(ewh.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, e, c);
   }
}
