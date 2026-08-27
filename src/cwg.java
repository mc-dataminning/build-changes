import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cwg extends dae implements cwm, ddj {
   public static final MapCodec<cwg> a = b(cwg::new);
   private static final djr b = djq.C;
   private static final djy<dkl> c = djq.bl;
   private static final int d = -1;
   private static final Object2IntMap<dkl> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dkl.b, 10);
      $$0.put(dkl.c, 10);
      $$0.put(dkl.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dkl, emf> j = ImmutableMap.of(
      dkl.a,
      cwj.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dkl.b,
      cwj.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dkl.c,
      cwj.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dkl.d,
      emc.a()
   );
   private static final emf k = cwj.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ic, emf> l = ImmutableMap.of(
      ic.c, emc.b(cwh.b, k, elq.e), ic.d, emc.b(cwh.c, k, elq.e), ic.f, emc.b(cwh.d, k, elq.e), ic.e, emc.b(cwh.e, k, elq.e)
   );
   private final Map<dja, emf> m;

   @Override
   public MapCodec<cwg> a() {
      return a;
   }

   protected cwg(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ic.c).a(c, dkl.a));
      this.m = this.a(cwg::h);
   }

   private static emf h(dja $$0) {
      return emc.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(ctj $$0, aup $$1, hx $$2, ic $$3) {
      int $$4 = aui.a($$1, 2, 5);
      hx.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ic.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cwh.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ic.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dja $$0) {
      return $$0.i() || $$0.a(cwl.G) || $$0.a(cwl.sF);
   }

   protected static boolean a(ctk $$0, hx $$1, dja $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(ctj $$0, hx $$1, eek $$2, ic $$3) {
      dja $$4 = cwl.sD.o().a(b, Boolean.valueOf($$2.a(eel.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cti $$0, dja $$1, eli $$2, cft $$3) {
      this.a($$1, $$0, $$2.a(), dkl.d, arm.gX);
   }

   @Override
   public eek c_(dja $$0) {
      return $$0.c(b) ? eel.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dja $$0, ctl $$1, hx $$2) {
      hx $$3 = $$2.d();
      dja $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cwl.sE) || $$4.a(asb.bx);
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      if ($$1 == ic.a && !$$0.a($$3, $$4)) {
         return cwl.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eel.c, eel.c.a($$3));
         }

         return $$1 == ic.b && $$2.a(this) ? cwl.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      dja $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      hx $$4 = $$2.c();
      dja $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ic $$6 = $$3.c(aE);
         cwh.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, blp $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dkl.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dkl.b, null);
         }
      }
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dkl $$4 = $$0.c(c);
         if ($$4 == dkl.b) {
            this.a($$0, $$1, $$2, dkl.c, arm.gX);
         } else if ($$4 == dkl.c) {
            this.a($$0, $$1, $$2, dkl.d, arm.gX);
         } else if ($$4 == dkl.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cti $$0, hx $$1, arl $$2) {
      float $$3 = aui.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, arn.e, 1.0F, $$3);
   }

   private static boolean a(hx $$0, blp $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dja $$0, cti $$1, hx $$2, dkl $$3, @Nullable arl $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dja $$0, cti $$1, hx $$2) {
      a($$0, $$1, $$2, dkl.a);
      if ($$0.c(c) != dkl.a) {
         a($$1, $$2, arm.gY);
      }
   }

   private static void a(dja $$0, cti $$1, hx $$2, dkl $$3) {
      dkl $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dnk.c, $$2);
      }
   }

   @Override
   public emf b(dja $$0, cso $$1, hx $$2, elr $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public emf a(dja $$0, cso $$1, hx $$2, elr $$3) {
      return this.m.get($$0);
   }

   @Override
   public dja a(cpa $$0) {
      dja $$1 = $$0.q().a_($$0.a().d());
      eek $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cwl.sD) || $$1.a(cwl.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eel.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, aE, c);
   }
}
