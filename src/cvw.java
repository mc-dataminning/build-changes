import com.google.common.collect.ImmutableMap;
import com.mojang.serialization.MapCodec;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import javax.annotation.Nullable;

public class cvw extends czu implements cwc, dcz {
   public static final MapCodec<cvw> a = b(cvw::new);
   private static final djg b = djf.C;
   private static final djn<dka> c = djf.bl;
   private static final int d = -1;
   private static final Object2IntMap<dka> e = ac.a(new Object2IntArrayMap(), $$0 -> {
      $$0.defaultReturnValue(-1);
      $$0.put(dka.b, 10);
      $$0.put(dka.c, 10);
      $$0.put(dka.d, 100);
   });
   private static final int f = 5;
   private static final int g = 6;
   private static final int h = 11;
   private static final int i = 13;
   private static final Map<dka, elu> j = ImmutableMap.of(
      dka.a,
      cvz.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dka.b,
      cvz.a(0.0, 11.0, 0.0, 16.0, 15.0, 16.0),
      dka.c,
      cvz.a(0.0, 11.0, 0.0, 16.0, 13.0, 16.0),
      dka.d,
      elr.a()
   );
   private static final elu k = cvz.a(0.0, 13.0, 0.0, 16.0, 16.0, 16.0);
   private static final Map<ia, elu> l = ImmutableMap.of(
      ia.c, elr.b(cvx.b, k, elf.e), ia.d, elr.b(cvx.c, k, elf.e), ia.f, elr.b(cvx.d, k, elf.e), ia.e, elr.b(cvx.e, k, elf.e)
   );
   private final Map<dip, elu> m;

   @Override
   public MapCodec<cvw> a() {
      return a;
   }

   protected cvw(dio.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Boolean.valueOf(false)).a(aE, ia.c).a(c, dka.a));
      this.m = this.a(cvw::h);
   }

   private static elu h(dip $$0) {
      return elr.a(j.get($$0.c(c)), l.get($$0.c(aE)));
   }

   public static void a(csz $$0, auf $$1, hv $$2, ia $$3) {
      int $$4 = aty.a($$1, 2, 5);
      hv.a $$5 = $$2.j();
      int $$6 = 0;

      while ($$6 < $$4 && a($$0, $$5, $$0.a_($$5))) {
         $$6++;
         $$5.c(ia.b);
      }

      int $$7 = $$2.v() + $$6 - 1;
      $$5.q($$2.v());

      while ($$5.v() < $$7) {
         cvx.a($$0, $$5, $$0.b_($$5), $$3);
         $$5.c(ia.b);
      }

      a($$0, $$5, $$0.b_($$5), $$3);
   }

   private static boolean n(dip $$0) {
      return $$0.i() || $$0.a(cwb.G) || $$0.a(cwb.sF);
   }

   protected static boolean a(cta $$0, hv $$1, dip $$2) {
      return !$$0.r($$1) && n($$2);
   }

   protected static boolean a(csz $$0, hv $$1, edz $$2, ia $$3) {
      dip $$4 = cwb.sD.o().a(b, Boolean.valueOf($$2.a(eea.c))).a(aE, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   public void a(csy $$0, dip $$1, ekx $$2, cfj $$3) {
      this.a($$1, $$0, $$2.a(), dka.d, arc.gX);
   }

   @Override
   public edz c_(dip $$0) {
      return $$0.c(b) ? eea.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dip $$0, ctb $$1, hv $$2) {
      hv $$3 = $$2.d();
      dip $$4 = $$1.a_($$3);
      return $$4.a(this) || $$4.a(cwb.sE) || $$4.a(arr.bx);
   }

   @Override
   public dip a(dip $$0, ia $$1, dip $$2, csz $$3, hv $$4, hv $$5) {
      if ($$1 == ia.a && !$$0.a($$3, $$4)) {
         return cwb.a.o();
      } else {
         if ($$0.c(b)) {
            $$3.a($$4, eea.c, eea.c.a($$3));
         }

         return $$1 == ia.b && $$2.a(this) ? cwb.sE.l($$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
      }
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      dip $$3 = $$0.a_($$1.c());
      return n($$3);
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      hv $$4 = $$2.c();
      dip $$5 = $$0.a_($$4);
      if (a($$0, $$4, $$5)) {
         ia $$6 = $$3.c(aE);
         cvx.a($$0, $$2, $$3.u(), $$6);
         a($$0, $$4, $$5.u(), $$6);
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, blf $$3) {
      if (!$$1.B) {
         if ($$0.c(c) == dka.a && a($$2, $$3) && !$$1.B($$2)) {
            this.a($$0, $$1, $$2, dka.b, null);
         }
      }
   }

   @Override
   public void a(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      } else {
         dka $$4 = $$0.c(c);
         if ($$4 == dka.b) {
            this.a($$0, $$1, $$2, dka.c, arc.gX);
         } else if ($$4 == dka.c) {
            this.a($$0, $$1, $$2, dka.d, arc.gX);
         } else if ($$4 == dka.d) {
            d($$0, $$1, $$2);
         }
      }
   }

   @Override
   public void a(dip $$0, csy $$1, hv $$2, cvz $$3, hv $$4, boolean $$5) {
      if ($$1.B($$2)) {
         d($$0, $$1, $$2);
      }
   }

   private static void a(csy $$0, hv $$1, arb $$2) {
      float $$3 = aty.b($$0.z, 0.8F, 1.2F);
      $$0.a(null, $$1, $$2, ard.e, 1.0F, $$3);
   }

   private static boolean a(hv $$0, blf $$1) {
      return $$1.aC() && $$1.dk().d > (double)((float)$$0.v() + 0.6875F);
   }

   private void a(dip $$0, csy $$1, hv $$2, dka $$3, @Nullable arb $$4) {
      a($$0, $$1, $$2, $$3);
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      int $$5 = e.getInt($$3);
      if ($$5 != -1) {
         $$1.a($$2, this, $$5);
      }
   }

   private static void d(dip $$0, csy $$1, hv $$2) {
      a($$0, $$1, $$2, dka.a);
      if ($$0.c(c) != dka.a) {
         a($$1, $$2, arc.gY);
      }
   }

   private static void a(dip $$0, csy $$1, hv $$2, dka $$3) {
      dka $$4 = $$0.c(c);
      $$1.a($$2, $$0.a(c, $$3), 2);
      if ($$3.a() && $$3 != $$4) {
         $$1.a(null, dmz.c, $$2);
      }
   }

   @Override
   public elu b(dip $$0, cse $$1, hv $$2, elg $$3) {
      return j.get($$0.c(c));
   }

   @Override
   public elu a(dip $$0, cse $$1, hv $$2, elg $$3) {
      return this.m.get($$0);
   }

   @Override
   public dip a(coq $$0) {
      dip $$1 = $$0.q().a_($$0.a().d());
      edz $$2 = $$0.q().b_($$0.a());
      boolean $$3 = $$1.a(cwb.sD) || $$1.a(cwb.sE);
      return this.o().a(b, Boolean.valueOf($$2.a(eea.c))).a(aE, $$3 ? $$1.c(aE) : $$0.g().g());
   }

   @Override
   protected void a(diq.a<cvz, dip> $$0) {
      $$0.a(b, aE, c);
   }
}
