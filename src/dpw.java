import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpw extends dku implements dkx {
   public static final MapCodec<dpw> a = b(dpw::new);
   public static final dzd b = dzc.d;
   public static final dzk<dzz> c = dzc.aa;
   public static final dzk<dzz> d = dzc.Z;
   public static final dzk<dzz> e = dzc.ab;
   public static final dzk<dzz> f = dzc.ac;
   public static final Map<jo, dzk<dzz>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jo.c, c, jo.f, d, jo.d, e, jo.e, f)));
   private final Function<dym, fdo> h;

   @Override
   public MapCodec<dpw> a() {
      return a;
   }

   public dpw(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, dzz.a).b(d, dzz.a).b(e, dzz.a).b(f, dzz.a));
      this.h = this.b();
   }

   @Override
   protected fdo d_(dym $$0) {
      return fdl.a();
   }

   public Function<dym, fdo> b() {
      Map<jo, fdo> $$0 = fdl.c(dku.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jo, fdo> $$1 = fdl.d(dku.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fdo $$3 = $$2.c(b) ? $$1.get(jo.a) : fdl.a();

         for (Entry<jo, dzk<dzz>> $$4 : g.entrySet()) {
            switch ((dzz)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fdl.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fdl.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fdl.b() : $$3;
      });
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fdo b(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fdl.a();
   }

   @Override
   protected boolean e_(dym $$0) {
      return true;
   }

   @Override
   protected boolean a(dym $$0, dhs $$1, jj $$2) {
      dym $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(dym $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dzk<dzz> $$1 : g.values()) {
            if ($$0.c($$1) != dzz.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgv $$0, jj $$1, jo $$2) {
      return $$2 == jo.b ? false : dpy.a($$0, $$1, $$2);
   }

   private static dym a(dym $$0, dgv $$1, jj $$2, boolean $$3) {
      dym $$4 = null;
      dym $$5 = null;
      $$3 |= $$0.c(b);

      for (jo $$6 : jo.c.a) {
         dzk<dzz> $$7 = a($$6);
         dzz $$8 = a($$1, $$2, $$6) ? ($$3 ? dzz.b : $$0.c($$7)) : dzz.a;
         if ($$8 == dzz.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dkw.ub) && $$4.c($$7) != dzz.a && !$$4.c(b)) {
               $$8 = dzz.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dkw.ub) && $$5.c($$7) == dzz.a) {
                  $$8 = dzz.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dhq $$0, jj $$1, azs $$2, int $$3) {
      dym $$4 = dkw.ub.m();
      dym $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      dym $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         dym $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, @Nullable bwr $$3, cxy $$4) {
      if (!$$0.C) {
         azs $$5 = $$0.C_();
         dym $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dym a(dgv $$0, jj $$1, BooleanSupplier $$2) {
      jj $$3 = $$1.d();
      dym $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dkw.ub);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dym $$6 = dkw.ub.m().b(b, Boolean.valueOf(false));
         dym $$7 = a($$6, $$0, $$1.d(), true);

         for (jo $$8 : jo.c.a) {
            dzk<dzz> $$9 = a($$8);
            if ($$7.c($$9) != dzz.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dzz.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dkw.a.m();
      } else {
         return dkw.a.m();
      }
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkw.a.m();
      } else {
         dym $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dkw.a.m() : $$8;
      }
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dym a(dym $$0, drm $$1) {
      return switch ($$1) {
         case c -> (dym)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dym)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dym)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dym a(dym $$0, dpv $$1) {
      return switch ($$1) {
         case b -> (dym)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dym)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dzk<dzz> a(jo $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dhs $$0, jj $$1, dym $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dhp $$0, azs $$1, jj $$2, dym $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jj $$2, dym $$3) {
      dym $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
