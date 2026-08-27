import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class ctx extends cxu implements cud, daz {
   public static final MapCodec<ctx> a = b(ctx::new);
   private static final dgs b = dgr.C;
   private static final dgz<dhm> c = dgr.bl;
   private static final int d = -1;
   private static final Object2IntMap<dhm> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dhm.b, 10);
      $$0.put(dhm.c, 10);
      $$0.put(dhm.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dhm, eiy> j = ImmutableMap.of(
      dhm.a,
      cua.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dhm.b,
      cua.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dhm.c,
      cua.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dhm.d,
      eiv.a()
   );
   private static final eiy k = cua.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hx, eiy> l = ImmutableMap.of(
      hx.c, eiv.b(cty.b, k, eij.e), hx.d, eiv.b(cty.c, k, eij.e), hx.f, eiv.b(cty.d, k, eij.e), hx.e, eiv.b(cty.e, k, eij.e)
   );
   private final Map<dgb, eiy> m;

   @Override
   public MapCodec<ctx> a() {
      return a;
   }

   protected ctx(dga.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, hx.c).a(c, dhm.a));
      this.m = this.a(ctx::h);
   }

   private static eiy h(dgb $$0) {
      return eiv.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(cra $$0, ate $$1, ht $$2, hx $$3) {
      int $$4 = asy.a($$1, 2, 5);
      ht.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hx.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cty.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hx.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dgb $$0) {
      return $$0.i() || $$0.a(cuc.G) || $$0.a(cuc.rE);
   }

   protected static boolean a(crb $$0, ht $$1, dgb $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(cra $$0, ht $$1, ebe $$2, hx $$3) {
      dgb $$4 = cuc.rC.o().a(b, Boolean.valueOf($$2.a(ebf.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(cqz $$0, dgb $$1, eib $$2, cdp $$3) {
      this.a($$1, $$0, $$2.a(), dhm.d, aqd.gw);
   }

   @Override
   public ebe c_(dgb $$0) {
      return $$0.c(b) ? ebf.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgb $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cuc.rD) || $$4.a(aqs.bx);
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cuc.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ebf.c, ebf.c.a($$3));
         }

         return $$1 == hx.b && $$2.a(this) ? cuc.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      dgb $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      ht $$4 = $$2.c();
      dgb $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         hx $$6 = $$3.c(aE);
         cty.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, bjt $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dhm.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dhm.b, null);
         }
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dhm $$4 = $$0.c(c);
         if ($$4 == dhm.b) {
            this.a($$0, $$1, $$2, dhm.c, aqd.gw);
         } else if ($$4 == dhm.c) {
            this.a($$0, $$1, $$2, dhm.d, aqd.gw);
         } else if ($$4 == dhm.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dgb $$0, cqz $$1, ht $$2, cua $$3, ht $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(cqz $$0, ht $$1, aqc $$2) {
      float $$3 = asy.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aqe.e, 1.0F, $$3);
   }

   private static boolean a(ht $$0, bjt $$1) {
      return $$1.aA() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dgb $$0, cqz $$1, ht $$2, dhm $$3, @Nullable aqc $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dgb $$0, cqz $$1, ht $$2) {
      a($$0, $$1, $$2, dhm.a);
      if ($$0.c(c) != dhm.a) {
         a($$1, $$2, aqd.gx);
      }
   }

   private static void a(dgb $$0, cqz $$1, ht $$2, dhm $$3) {
      dhm $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dkl.c, $$2);
      }
   }

   @Override
   public eiy c(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public eiy a(dgb $$0, cqf $$1, ht $$2, eik $$3) {
      return this.m.get($$0);
   }

   @Override
   public dgb a(cmr $$0) {
      dgb $$1 = $$0.q().a_($$0.a().d());
      ebe $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cuc.rC) || $$1.a(cuc.rD);
      return this.o().a(b, Boolean.valueOf($$2.a(ebf.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, aE, c);
   }
}
