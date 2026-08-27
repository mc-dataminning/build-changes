import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cwm extends dak implements cws, ddp {
   public static final MapCodec<cwm> a = b(cwm::new);
   private static final djx b = djw.C;
   private static final dke<dkr> c = djw.bl;
   private static final int d = -1;
   private static final Object2IntMap<dkr> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dkr.b, 10);
      $$0.put(dkr.c, 10);
      $$0.put(dkr.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dkr, eml> j = ImmutableMap.of(
      dkr.a,
      cwp.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dkr.b,
      cwp.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dkr.c,
      cwp.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dkr.d,
      emi.a()
   );
   private static final eml k = cwp.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ic, eml> l = ImmutableMap.of(
      ic.c, emi.b(cwn.b, k, elw.e), ic.d, emi.b(cwn.c, k, elw.e), ic.f, emi.b(cwn.d, k, elw.e), ic.e, emi.b(cwn.e, k, elw.e)
   );
   private final Map<djg, eml> m;

   @Override
   public MapCodec<cwm> a() {
      return a;
   }

   protected cwm(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ic.c).a(c, dkr.a));
      this.m = this.a(cwm::h);
   }

   private static eml h(djg $$0) {
      return emi.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(ctp $$0, auu $$1, hx $$2, ic $$3) {
      int $$4 = aun.a($$1, 2, 5);
      hx.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ic.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cwn.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ic.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(djg $$0) {
      return $$0.i() || $$0.a(cwr.G) || $$0.a(cwr.sF);
   }

   protected static boolean a(ctq $$0, hx $$1, djg $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(ctp $$0, hx $$1, eeq $$2, ic $$3) {
      djg $$4 = cwr.sD.o().a(b, Boolean.valueOf($$2.a(eer.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cto $$0, djg $$1, elo $$2, cfz $$3) {
      this.a($$1, $$0, $$2.a(), dkr.d, arr.gX);
   }

   @Override
   public eeq c_(djg $$0) {
      return $$0.c(b) ? eer.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      hx $$3 = $$2.d();
      djg $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cwr.sE) || $$4.a(asg.bx);
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cwr.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eer.c, eer.c.a($$3));
         }

         return $$1 == ic.b && $$2.a(this) ? cwr.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(ctr $$0, hx $$1, djg $$2) {
      djg $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cto $$0, auu $$1, hx $$2, djg $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auu $$1, hx $$2, djg $$3) {
      hx $$4 = $$2.c();
      djg $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ic $$6 = $$3.c(aE);
         cwn.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, blu $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dkr.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dkr.b, null);
         }
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dkr $$4 = $$0.c(c);
         if ($$4 == dkr.b) {
            this.a($$0, $$1, $$2, dkr.c, arr.gX);
         } else if ($$4 == dkr.c) {
            this.a($$0, $$1, $$2, dkr.d, arr.gX);
         } else if ($$4 == dkr.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cto $$0, hx $$1, arq $$2) {
      float $$3 = aun.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, ars.e, 1.0F, $$3);
   }

   private static boolean a(hx $$0, blu $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(djg $$0, cto $$1, hx $$2, dkr $$3, @Nullable arq $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(djg $$0, cto $$1, hx $$2) {
      a($$0, $$1, $$2, dkr.a);
      if ($$0.c(c) != dkr.a) {
         a($$1, $$2, arr.gY);
      }
   }

   private static void a(djg $$0, cto $$1, hx $$2, dkr $$3) {
      dkr $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dnq.c, $$2);
      }
   }

   @Override
   public eml b(djg $$0, csu $$1, hx $$2, elx $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return this.m.get($$0);
   }

   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a().d());
      eeq $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cwr.sD) || $$1.a(cwr.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eer.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, aE, c);
   }
}
