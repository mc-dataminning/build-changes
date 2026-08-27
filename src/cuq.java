import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cuq extends cyo implements cuw, dbt {
   public static final MapCodec<cuq> a = b(cuq::new);
   private static final dhn b = dhm.C;
   private static final dhu<dih> c = dhm.bl;
   private static final int d = -1;
   private static final Object2IntMap<dih> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dih.b, 10);
      $$0.put(dih.c, 10);
      $$0.put(dih.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dih, ekb> j = ImmutableMap.of(
      dih.a,
      cut.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dih.b,
      cut.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dih.c,
      cut.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dih.d,
      ejy.a()
   );
   private static final ekb k = cut.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<hx, ekb> l = ImmutableMap.of(
      hx.c, ejy.b(cur.b, k, ejm.e), hx.d, ejy.b(cur.c, k, ejm.e), hx.f, ejy.b(cur.d, k, ejm.e), hx.e, ejy.b(cur.e, k, ejm.e)
   );
   private final Map<dgw, ekb> m;

   @Override
   public MapCodec<cuq> a() {
      return a;
   }

   protected cuq(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, hx.c).a(c, dih.a));
      this.m = this.a(cuq::h);
   }

   private static ekb h(dgw $$0) {
      return ejy.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(crt $$0, ato $$1, ht $$2, hx $$3) {
      int $$4 = ati.a($$1, 2, 5);
      ht.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(hx.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cur.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(hx.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dgw $$0) {
      return $$0.i() || $$0.a(cuv.G) || $$0.a(cuv.rE);
   }

   protected static boolean a(cru $$0, ht $$1, dgw $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(crt $$0, ht $$1, ecg $$2, hx $$3) {
      dgw $$4 = cuv.rC.o().a(b, Boolean.valueOf($$2.a(ech.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(crs $$0, dgw $$1, eje $$2, cee $$3) {
      this.a($$1, $$0, $$2.a(), dih.d, aqn.gy);
   }

   @Override
   public ecg c_(dgw $$0) {
      return $$0.c(b) ? ech.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      ht $$3 = $$2.d();
      dgw $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cuv.rD) || $$4.a(arc.bx);
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if ($$1 == hx.a && !$$0.a($$3, $$4)) {
         return cuv.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, ech.c, ech.c.a($$3));
         }

         return $$1 == hx.b && $$2.a(this) ? cuv.rD.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      dgw $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      ht $$4 = $$2.c();
      dgw $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         hx $$6 = $$3.c(aE);
         cur.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dih.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dih.b, null);
         }
      }
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dih $$4 = $$0.c(c);
         if ($$4 == dih.b) {
            this.a($$0, $$1, $$2, dih.c, aqn.gy);
         } else if ($$4 == dih.c) {
            this.a($$0, $$1, $$2, dih.d, aqn.gy);
         } else if ($$4 == dih.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, cut $$3, ht $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(crs $$0, ht $$1, aqm $$2) {
      float $$3 = ati.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, aqo.e, 1.0F, $$3);
   }

   private static boolean a(ht $$0, bki $$1) {
      return $$1.aA() && $$1.dj().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dgw $$0, crs $$1, ht $$2, dih $$3, @Nullable aqm $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dgw $$0, crs $$1, ht $$2) {
      a($$0, $$1, $$2, dih.a);
      if ($$0.c(c) != dih.a) {
         a($$1, $$2, aqn.gz);
      }
   }

   private static void a(dgw $$0, crs $$1, ht $$2, dih $$3) {
      dih $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dlg.c, $$2);
      }
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return this.m.get($$0);
   }

   @Override
   public dgw a(cnj $$0) {
      dgw $$1 = $$0.q().a_($$0.a().d());
      ecg $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cuv.rC) || $$1.a(cuv.rD);
      return this.o().a(b, Boolean.valueOf($$2.a(ech.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b, aE, c);
   }
}
