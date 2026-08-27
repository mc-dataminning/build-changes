import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ddx extends dhw implements ded, dlb {
   public static final MapCodec<ddx> a = b(ddx::new);
   private static final dru b = drt.C;
   private static final dsb<dso> c = drt.bl;
   private static final int d = -1;
   private static final Object2IntMap<dso> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dso.b, 10);
      $$0.put(dso.c, 10);
      $$0.put(dso.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dso, evf> j = ImmutableMap.of(
      dso.a,
      dea.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dso.b,
      dea.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dso.c,
      dea.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dso.d,
      evc.a()
   );
   private static final evf k = dea.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<it, evf> l = ImmutableMap.of(
      it.c, evc.b(ddy.b, k, euq.e), it.d, evc.b(ddy.c, k, euq.e), it.f, evc.b(ddy.d, k, euq.e), it.e, evc.b(ddy.e, k, euq.e)
   );
   private final Map<drd, evf> m;

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(drc.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, it.c).a(c, dso.a));
      this.m = this.a(ddx::m);
   }

   private static evf m(drd $$0) {
      return evc.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(dba $$0, aym $$1, io $$2, it $$3) {
      int $$4 = ayf.a($$1, 2, 5);
      io.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(it.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         ddy.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(it.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(drd $$0) {
      return $$0.i() || $$0.a(dec.G) || $$0.a(dec.sF);
   }

   protected static boolean a(dbb $$0, io $$1, drd $$2) {
      return !$$0.s($$1) && n($$2);
   }

   protected static boolean a(dba $$0, io $$1, emw $$2, it $$3) {
      drd $$4 = dec.sD.n().a(b, Boolean.valueOf($$2.a(emx.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected void a(daz $$0, drd $$1, eui $$2, cmq $$3) {
      this.a($$1, $$0, $$2.a(), dso.d, avi.hB);
   }

   @Override
   protected emw b_(drd $$0) {
      return $$0.c(b) ? emx.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      io $$3 = $$2.d();
      drd $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(dec.sE) || $$4.a(avx.by);
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if ($$1 == it.a && !$$0.a($$3, $$4)) {
         return dec.a.n();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, emx.c, emx.c.a($$3));
         }

         return $$1 == it.b && $$2.a(this) ? dec.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(dbc $$0, io $$1, drd $$2) {
      drd $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(daz $$0, aym $$1, io $$2, drd $$3) {
      return true;
   }

   @Override
   public void a(aqn $$0, aym $$1, io $$2, drd $$3) {
      io $$4 = $$2.c();
      drd $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         it $$6 = $$3.c(aE);
         ddy.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, brw $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dso.a && a($$2, $$3) && !$$1.C($$2)) {
            this.a($$0, $$1, $$2, dso.b, null);
         }
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      } else {
         dso $$4 = $$0.c(c);
         if ($$4 == dso.b) {
            this.a($$0, $$1, $$2, dso.c, avi.hB);
         } else if ($$4 == dso.c) {
            this.a($$0, $$1, $$2, dso.d, avi.hB);
         } else if ($$4 == dso.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   protected void a(drd $$0, daz $$1, io $$2, dea $$3, io $$4, boolean $$5) {
      if ($$1.C($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(daz $$0, io $$1, avh $$2) {
      float $$3 = ayf.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, avj.e, 1.0F, $$3);
   }

   private static boolean a(io $$0, brw $$1) {
      return $$1.aE() && $$1.dn().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(drd $$0, daz $$1, io $$2, dso $$3, @Nullable avh $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(drd $$0, daz $$1, io $$2) {
      a($$0, $$1, $$2, dso.a);
      if ($$0.c(c) != dso.a) {
         a($$1, $$2, avi.hC);
      }
   }

   private static void a(drd $$0, daz $$1, io $$2, dso $$3) {
      dso $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dvw.c, $$2);
      }
   }

   @Override
   protected evf b(drd $$0, daf $$1, io $$2, eur $$3) {
      return j.get($$0.c(c));
   }

   @Override
   protected evf a(drd $$0, daf $$1, io $$2, eur $$3) {
      return this.m.get($$0);
   }

   @Override
   public drd a(cxb $$0) {
      drd $$1 = $$0.q().a_($$0.a().d());
      emw $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(dec.sD) || $$1.a(dec.sE);
      return this.n().a(b, Boolean.valueOf($$2.a(emx.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, aE, c);
   }
}
