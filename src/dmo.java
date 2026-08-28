import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dmo extends dqs implements dmu, duc {
   public static final MapCodec<dmo> a = b(dmo::new);
   private static final ebk b = ebj.I;
   private static final ebr<ecf> c = ebj.bo;
   private static final int d = -1;
   private static final Object2IntMap<ecf> f = ag.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(ecf.b, 10);
      $$0.put(ecf.c, 10);
      $$0.put(ecf.d, 100);
   });
   private static final int g = 5;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<ecf, ffw> D = Maps.newEnumMap(
      Map.of(ecf.a, dmr.b(16.0, 11.0, 15.0), ecf.b, dmr.b(16.0, 11.0, 15.0), ecf.c, dmr.b(16.0, 11.0, 13.0), ecf.d, fft.a())
   );
   private final Function<eat, ffw> R;

   @Override
   public MapCodec<dmo> a() {
      return a;
   }

   protected dmo(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jb.c).b(c, ecf.a));
      this.R = this.q();
   }

   private Function<eat, ffw> q() {
      Map<jb, ffw> $$0 = fft.c(dmr.b(6.0, 0.0, 13.0).a(0.0, 0.0, 0.25).d());
      return this.a($$1 -> fft.a(D.get($$1.c(c)), $$0.get($$1.c(e))), new ebw[]{b});
   }

   public static void a(djn $$0, azv $$1, iv $$2, jb $$3) {
      int $$4 = azm.a($$1, 2, 5);
      iv.a $$5 = $$2.k();
      int $$6 = 0;

      while ($$6 < $$4 && a((djo)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(jb.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         dmp.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(jb.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean o(eat $$0) {
      return $$0.l() || $$0.a(dmt.J) || $$0.a(dmt.tp);
   }

   protected static boolean a(djo $$0, iv $$1, eat $$2) {
      return !$$0.t($$1) && o($$2);
   }

   protected static boolean a(djn $$0, iv $$1, exa $$2, jb $$3) {
      eat $$4 = dmt.tn.m().b(b, Boolean.valueOf($$2.a(exb.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(djm $$0, eat $$1, fey $$2, csh $$3) {
      this.a($$1, $$0, $$2.b(), ecf.d, awn.hZ);
   }

   @Override
   protected exa b_(eat $$0) {
      return $$0.c(b) ? exb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      iv $$3 = $$2.e();
      eat $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dmt.to) || $$4.a(axc.bB);
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if ($$4 == jb.a && !$$0.a($$1, $$3)) {
         return dmt.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, exb.c, exb.c.a($$1));
         }

         return $$4 == jb.b && $$6.a(this) ? dmt.to.m($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   public boolean a(djp $$0, iv $$1, eat $$2) {
      eat $$3 = $$0.a_($$1.d());
      return o($$3);
   }

   @Override
   public boolean a(djm $$0, azv $$1, iv $$2, eat $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iv $$2, eat $$3) {
      iv $$4 = $$2.d();
      eat $$5 = $$0.a_($$4);
      if (a((djo)$$0, $$4, $$5)) {
         jb $$6 = $$3.c(e);
         dmp.a($$0, $$2, $$3.y(), $$6);
         a($$0, $$4, $$5.y(), $$6);
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, bwi $$3, bxb $$4) {
      if (!$$1.C) {
         if ($$0.c(c) == ecf.a && a($$2, $$3) && !$$1.D($$2)) {
            this.a($$0, $$1, $$2, ecf.b, null);
         }
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      } else {
         ecf $$4 = $$0.c(c);
         if ($$4 == ecf.b) {
            this.a($$0, $$1, $$2, ecf.c, awn.hZ);
         } else if ($$4 == ecf.c) {
            this.a($$0, $$1, $$2, ecf.d, awn.hZ);
         } else if ($$4 == ecf.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(eat $$0, djm $$1, iv $$2, dmr $$3, @Nullable eyi $$4, boolean $$5) {
      if ($$1.D($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(djm $$0, iv $$1, awm $$2) {
      float $$3 = azm.b($$0.A, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, awo.e, 1.0F, $$3);
   }

   private static boolean a(iv $$0, bwi $$1) {
      return $$1.aH() && $$1.ds().e > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(eat $$0, djm $$1, iv $$2, ecf $$3, @Nullable awm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = f.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(eat $$0, djm $$1, iv $$2) {
      a($$0, $$1, $$2, ecf.a);
      if ($$0.c(c) != ecf.a) {
         a($$1, $$2, awn.ia);
      }
   }

   private static void a(eat $$0, djm $$1, iv $$2, ecf $$3) {
      ecf $$4 = $$0.c(c);
      $$1.a($$2, $$0.b(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, eft.c, $$2);
      }
   }

   @Override
   protected ffw b(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return D.get($$0.c(c));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public eat a(ddg $$0) {
      eat $$1 = $$0.q().a_($$0.a().e());
      exa $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dmt.tn) || $$1.a(dmt.to);
      return this.m().b(b, Boolean.valueOf($$2.a(exb.c))).b(e, $$3 ? $$1.c(e) : $$0.g().g());
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, e, c);
   }
}
