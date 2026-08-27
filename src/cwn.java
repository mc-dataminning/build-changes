import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cwn extends dal implements cwt, ddq {
   public static final MapCodec<cwn> a = b(cwn::new);
   private static final djy b = djx.C;
   private static final dkf<dks> c = djx.bl;
   private static final int d = -1;
   private static final Object2IntMap<dks> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dks.b, 10);
      $$0.put(dks.c, 10);
      $$0.put(dks.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dks, emm> j = ImmutableMap.of(
      dks.a,
      cwq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dks.b,
      cwq.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dks.c,
      cwq.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dks.d,
      emj.a()
   );
   private static final emm k = cwq.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emm> l = ImmutableMap.of(
      ic.c, emj.b(cwo.b, k, elx.e), ic.d, emj.b(cwo.c, k, elx.e), ic.f, emj.b(cwo.d, k, elx.e), ic.e, emj.b(cwo.e, k, elx.e)
   );
   private final Map<djh, emm> m;

   @Override
   public MapCodec<cwn> a() {
      return a;
   }

   protected cwn(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ic.c).a(c, dks.a));
      this.m = this.a(cwn::h);
   }

   private static emm h(djh $$0) {
      return emj.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(ctq $$0, auv $$1, hx $$2, ic $$3) {
      int $$4 = auo.a($$1, 2, 5);
      hx.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ic.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cwo.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ic.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(djh $$0) {
      return $$0.i() || $$0.a(cws.G) || $$0.a(cws.sF);
   }

   protected static boolean a(ctr $$0, hx $$1, djh $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(ctq $$0, hx $$1, eer $$2, ic $$3) {
      djh $$4 = cws.sD.o().a(b, Boolean.valueOf($$2.a(ees.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(ctp $$0, djh $$1, elp $$2, cga $$3) {
      this.a($$1, $$0, $$2.a(), dks.d, ars.gX);
   }

   @Override
   public eer c_(djh $$0) {
      return $$0.c(b) ? ees.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      hx $$3 = $$2.d();
      djh $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cws.sE) || $$4.a(ash.bx);
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cws.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ees.c, ees.c.a($$3));
         }

         return $$1 == ic.b && $$2.a(this) ? cws.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(cts $$0, hx $$1, djh $$2) {
      djh $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(ctp $$0, auv $$1, hx $$2, djh $$3) {
      return true;
   }

   @Override
   public void a(and $$0, auv $$1, hx $$2, djh $$3) {
      hx $$4 = $$2.c();
      djh $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ic $$6 = $$3.c(aE);
         cwo.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, blv $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dks.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dks.b, null);
         }
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dks $$4 = $$0.c(c);
         if ($$4 == dks.b) {
            this.a($$0, $$1, $$2, dks.c, ars.gX);
         } else if ($$4 == dks.c) {
            this.a($$0, $$1, $$2, dks.d, ars.gX);
         } else if ($$4 == dks.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(ctp $$0, hx $$1, arr $$2) {
      float $$3 = auo.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, art.e, 1.0F, $$3);
   }

   private static boolean a(hx $$0, blv $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(djh $$0, ctp $$1, hx $$2, dks $$3, @Nullable arr $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(djh $$0, ctp $$1, hx $$2) {
      a($$0, $$1, $$2, dks.a);
      if ($$0.c(c) != dks.a) {
         a($$1, $$2, ars.gY);
      }
   }

   private static void a(djh $$0, ctp $$1, hx $$2, dks $$3) {
      dks $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dnr.c, $$2);
      }
   }

   @Override
   public emm b(djh $$0, csv $$1, hx $$2, ely $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public emm a(djh $$0, csv $$1, hx $$2, ely $$3) {
      return this.m.get($$0);
   }

   @Override
   public djh a(cph $$0) {
      djh $$1 = $$0.q().a_($$0.a().d());
      eer $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cws.sD) || $$1.a(cws.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(ees.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, aE, c);
   }
}
