import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class csz extends cww implements ctf, dab {
   public static final MapCodec<csz> a = b(csz::new);
   private static final dfu b = dft.C;
   private static final dgb<dgo> c = dft.bl;
   private static final int d = -1;
   private static final Object2IntMap<dgo> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dgo.b, 10);
      $$0.put(dgo.c, 10);
      $$0.put(dgo.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dgo, eia> j = ImmutableMap.of(
      dgo.a,
      ctc.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgo.b,
      ctc.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dgo.c,
      ctc.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dgo.d,
      ehx.a()
   );
   private static final eia k = ctc.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ha, eia> l = ImmutableMap.of(
      ha.c, ehx.b(cta.b, k, ehl.e), ha.d, ehx.b(cta.c, k, ehl.e), ha.f, ehx.b(cta.d, k, ehl.e), ha.e, ehx.b(cta.e, k, ehl.e)
   );
   private final Map<dfd, eia> m;

   @Override
   public MapCodec<csz> a() {
      return a;
   }

   protected csz(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ha.c).a(c, dgo.a));
      this.m = this.a(csz::h);
   }

   private static eia h(dfd $$0) {
      return ehx.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cqc $$0, ash $$1, gw $$2, ha $$3) {
      int $$4 = asb.a($$1, 2, 5);
      gw.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ha.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cta.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ha.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dfd $$0) {
      return $$0.i() || $$0.a(cte.G) || $$0.a(cte.rE);
   }

   protected static boolean a(cqd $$0, gw $$1, dfd $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cqc $$0, gw $$1, eag $$2, ha $$3) {
      dfd $$4 = cte.rC.o().a(b, Boolean.valueOf($$2.a(eah.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cqb $$0, dfd $$1, ehd $$2, ccs $$3) {
      this.a($$1, $$0, $$2.a(), dgo.d, apg.gu);
   }

   @Override
   public eag c_(dfd $$0) {
      return $$0.c(b) ? eah.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfd $$0, cqe $$1, gw $$2) {
      gw $$3 = $$2.d();
      dfd $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cte.rD) || $$4.a(apv.bx);
   }

   @Override
   public dfd a(dfd $$0, ha $$1, dfd $$2, cqc $$3, gw $$4, gw $$5) {
      if ($$1 == ha.a && !$$0.a($$3, $$4)) {
         return cte.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eah.c, eah.c.a($$3));
         }

         return $$1 == ha.b && $$2.a(this) ? cte.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cqe $$0, gw $$1, dfd $$2) {
      dfd $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cqb $$0, ash $$1, gw $$2, dfd $$3) {
      return true;
   }

   @Override
   public void a(akt $$0, ash $$1, gw $$2, dfd $$3) {
      gw $$4 = $$2.c();
      dfd $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ha $$6 = $$3.c(aE);
         cta.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, biw $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dgo.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dgo.b, null);
         }
      }
   }

   @Override
   public void a(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dgo $$4 = $$0.c(c);
         if ($$4 == dgo.b) {
            this.a($$0, $$1, $$2, dgo.c, apg.gu);
         } else if ($$4 == dgo.c) {
            this.a($$0, $$1, $$2, dgo.d, apg.gu);
         } else if ($$4 == dgo.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ctc $$3, gw $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cqb $$0, gw $$1, apf $$2) {
      float $$3 = asb.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aph.e, 1.0F, $$3);
   }

   private static boolean a(gw $$0, biw $$1) {
      return $$1.aA() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dfd $$0, cqb $$1, gw $$2, dgo $$3, @Nullable apf $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dfd $$0, cqb $$1, gw $$2) {
      a($$0, $$1, $$2, dgo.a);
      if ($$0.c(c) != dgo.a) {
         a($$1, $$2, apg.gv);
      }
   }

   private static void a(dfd $$0, cqb $$1, gw $$2, dgo $$3) {
      dgo $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, djn.c, $$2);
      }
   }

   @Override
   public eia c(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public eia a(dfd $$0, cph $$1, gw $$2, ehm $$3) {
      return this.m.get($$0);
   }

   @Override
   public dfd a(clt $$0) {
      dfd $$1 = $$0.q().a_($$0.a().d());
      eag $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cte.rC) || $$1.a(cte.rD);
      return this.o().a(b, Boolean.valueOf($$2.a(eah.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(b, aE, c);
   }
}
