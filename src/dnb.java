import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dnb extends drf implements dnh, dup {
   public static final MapCodec<dnb> a = b(dnb::new);
   private static final ebx b = ebw.I;
   private static final ece<ecs> c = ebw.bo;
   private static final int d = -1;
   private static final Object2IntMap<ecs> f = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ecs.b, 10);
      $$0.put(ecs.c, 10);
      $$0.put(ecs.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<ecs, fgm> D = Maps.newEnumMap(
      Map.of(ecs.a, dne.b(16.0, 11.0, 15.0), ecs.b, dne.b(16.0, 11.0, 15.0), ecs.c, dne.b(16.0, 11.0, 13.0), ecs.d, fgj.a())
   );
   private final Function<ebg, fgm> R;

   @Override
   public MapCodec<dnb> a() {
      return a;
   }

   protected dnb(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jc.c).b(c, ecs.a));
      this.R = this.q();
   }

   private Function<ebg, fgm> q() {
      Map<jc, fgm> $$0 = fgj.c(dne.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fgj.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ecj[]{b});
   }

   public static void a(dka $$0, azz $$1, iw $$2, jc $$3) {
      int $$4 = azq.a($$1, 2, 5);
      iw.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((dkb)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jc.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dnc.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jc.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(ebg $$0) {
      return $$0.l() || $$0.a(dng.J) || $$0.a(dng.tp);
   }

   protected static boolean a(dkb $$0, iw $$1, ebg $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(dka $$0, iw $$1, exq $$2, jc $$3) {
      ebg $$4 = dng.tn.m().b(b, Boolean.valueOf($$2.a(exr.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(djz $$0, ebg $$1, ffo $$2, csu $$3) {
      this.a($$1, $$0, $$2.b(), ecs.d, awr.hZ);
   }

   @Override
   protected exq b_(ebg $$0) {
      return $$0.c(b) ? exr.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebg $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dng.to) || $$4.a(axg.bB);
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if ($$4 == jc.a && !$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exr.c, exr.c.a($$1));
         }

         return $$4 == jc.b && $$6.a(this) ? dng.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      ebg $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      iw $$4 = $$2.d();
      ebg $$5 = $$0.a_($$4);
      if (a((dkb)$$0, $$4, $$5)) {
         jc $$6 = $$3.c(e);
         dnc.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, bwv $$3, bxo $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == ecs.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, ecs.b, null);
         }
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         ecs $$4 = $$0.c(c);
         if ($$4 == ecs.b) {
            this.a($$0, $$1, $$2, ecs.c, awr.hZ);
         } else if ($$4 == ecs.c) {
            this.a($$0, $$1, $$2, ecs.d, awr.hZ);
         } else if ($$4 == ecs.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(ebg $$0, djz $$1, iw $$2, dne $$3, @Nullable eyy $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(djz $$0, iw $$1, awq $$2) {
      float $$3 = azq.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aws.e, 1.0F, $$3);
   }

   private static boolean a(iw $$0, bwv $$1) {
      return $$1.aH() && $$1.dt().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(ebg $$0, djz $$1, iw $$2, ecs $$3, @Nullable awq $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(ebg $$0, djz $$1, iw $$2) {
      a($$0, $$1, $$2, ecs.a);
      if ($$0.c(c) != ecs.a) {
         a($$1, $$2, awr.ia);
      }
   }

   private static void a(ebg $$0, djz $$1, iw $$2, ecs $$3) {
      ecs $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, egg.c, $$2);
      }
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.R.apply($$0);
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a().e());
      exq $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dng.tn) || $$1.a(dng.to);
      return this.m().b(b, Boolean.valueOf($$2.a(exr.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, e, c);
   }
}
