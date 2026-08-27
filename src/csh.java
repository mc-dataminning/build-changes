import com.google.common.collect.ImmutableMap;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csh extends cwd implements csm, czl {
   private static final dfp a = dfo.C;
   private static final dfw<dgj> b = dfo.bl;
   private static final int c = -1;
   private static final Object2IntMap<dgj> d = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgj.b, 10);
      $$0.put(dgj.c, 10);
      $$0.put(dgj.d, 100);
   });
   private static final int e = 5;
   private static final int f = 6;
   private static final int g = 11;
   private static final int h = 13;
   private static final Map<dgj, ehy> i = ImmutableMap.of(
      dgj.a,
      csk.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgj.b,
      csk.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgj.c,
      csk.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgj.d,
      ehv.a()
   );
   private static final ehy j = csk.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hb, ehy> k = ImmutableMap.of(
      hb.c, ehv.b(csi.a, j, ehj.e), hb.d, ehv.b(csi.b, j, ehj.e), hb.f, ehv.b(csi.c, j, ehj.e), hb.e, ehv.b(csi.d, j, ehj.e)
   );
   private final Map<dey, ehy> l;

   protected csh(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(aC, hb.c).a(b, dgj.a));
      this.l = this.a(csh::h);
   }

   private static ehy h(dey $$0) {
      return ehv.a(i.get($$0.c(b)), k.get($$0.c(aC)));
   }

   public static void a(cpl $$0, art $$1, gv $$2, hb $$3) {
      int $$4 = aro.a($$1, 2, 5);
      gv.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a((cpm)$$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hb.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         csi.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hb.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dey $$0) {
      return $$0.i() || $$0.a(csl.G) || $$0.a(csl.rE);
   }

   protected static boolean a(cpm $$0, gv $$1, dey $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cpl $$0, gv $$1, eab $$2, hb $$3) {
      dey $$4 = csl.rC.n().a(a, Boolean.valueOf($$2.a(eac.c))).a(aC, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cpk $$0, dey $$1, ehb $$2, ccd $$3) {
      this.a($$1, $$0, $$2.a(), dgj.d, aou.gu);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(a) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      gv $$3 = $$2.d();
      dey $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(csl.rD) || $$4.a(apj.bx);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$1 == hb.a && !$$0.a($$3, $$4)) {
         return csl.a.n();
      } else {
         if ($$0.c(a)) {
            $$3.a($$4, eac.c, eac.c.a($$3));
         }

         return $$1 == hb.b && $$2.a(this) ? csl.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean a(cpn $$0, gv $$1, dey $$2) {
      dey $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cpk $$0, art $$1, gv $$2, dey $$3) {
      return true;
   }

   @Override
   public void a(aki $$0, art $$1, gv $$2, dey $$3) {
      gv $$4 = $$2.c();
      dey $$5 = $$0.a_($$4);
      if (a((cpm)$$0, $$4, $$5)) {
         hb $$6 = $$3.c(aC);
         csi.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if (!$$1.B) {
         if ($$0.c(b) == dgj.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgj.b, null);
         }
      }
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgj $$4 = $$0.c(b);
         if ($$4 == dgj.b) {
            this.a($$0, $$1, $$2, dgj.c, aou.gu);
         } else if ($$4 == dgj.c) {
            this.a($$0, $$1, $$2, dgj.d, aou.gu);
         } else if ($$4 == dgj.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, csk $$3, gv $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cpk $$0, gv $$1, aot $$2) {
      float $$3 = aro.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aov.e, 1.0F, $$3);
   }

   private static boolean a(gv $$0, big $$1) {
      return $$1.aA() && $$1.di().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dey $$0, cpk $$1, gv $$2, dgj $$3, @Nullable aot $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = d.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dey $$0, cpk $$1, gv $$2) {
      a($$0, $$1, $$2, dgj.a);
      if ($$0.c(b) != dgj.a) {
         a($$1, $$2, aou.gv);
      }
   }

   private static void a(dey $$0, cpk $$1, gv $$2, dgj $$3) {
      dgj $$4 = $$0.c(b);
      $$1.a($$2, $$0.a(b, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dji.c, $$2);
      }
   }

   @Override
   public ehy c(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return i.get($$0.c(b));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return this.l.get($$0);
   }

   @Override
   public dey a(cle $$0) {
      dey $$1 = $$0.q().a_($$0.a().d());
      eab $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(csl.rC) || $$1.a(csl.rD);
      return this.n().a(a, Boolean.valueOf($$2.a(eac.c))).a(aC, $$3 ? $$1.c(aC) : $$0.g().g());
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a, aC, b);
   }
}
