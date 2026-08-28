import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dpg extends dke implements dkh {
   public static final MapCodec<dpg> a = b(dpg::new);
   public static final dyh b = dyg.d;
   public static final dyo<dzc> c = dyg.aa;
   public static final dyo<dzc> d = dyg.Z;
   public static final dyo<dzc> e = dyg.ab;
   public static final dyo<dzc> f = dyg.ac;
   public static final Map<jn, dyo<dzc>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jn.c, c, jn.f, d, jn.d, e, jn.e, f)));
   private final Function<dxq, fcr> h;

   @Override
   public MapCodec<dpg> a() {
      return a;
   }

   public dpg(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, dzc.a).b(d, dzc.a).b(e, dzc.a).b(f, dzc.a));
      this.h = this.b();
   }

   @Override
   protected fcr d_(dxq $$0) {
      return fco.a();
   }

   public Function<dxq, fcr> b() {
      Map<jn, fcr> $$0 = fco.c(dke.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jn, fcr> $$1 = fco.d(dke.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fcr $$3 = $$2.c(b) ? $$1.get(jn.a) : fco.a();

         for (Entry<jn, dyo<dzc>> $$4 : g.entrySet()) {
            switch ((dzc)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fco.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fco.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fco.b() : $$3;
      });
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fcr b(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fco.a();
   }

   @Override
   protected boolean e_(dxq $$0) {
      return true;
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      dxq $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(dxq $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dyo<dzc> $$1 : g.values()) {
            if ($$0.c($$1) != dzc.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dgf $$0, ji $$1, jn $$2) {
      return $$2 == jn.b ? false : dpi.a($$0, $$1, $$2);
   }

   private static dxq a(dxq $$0, dgf $$1, ji $$2, boolean $$3) {
      dxq $$4 = null;
      dxq $$5 = null;
      $$3 |= $$0.c(b);

      for (jn $$6 : jn.c.a) {
         dyo<dzc> $$7 = a($$6);
         dzc $$8 = a($$1, $$2, $$6) ? ($$3 ? dzc.b : $$0.c($$7)) : dzc.a;
         if ($$8 == dzc.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dkg.tZ) && $$4.c($$7) != dzc.a && !$$4.c(b)) {
               $$8 = dzc.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dkg.tZ) && $$5.c($$7) == dzc.a) {
                  $$8 = dzc.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dha $$0, ji $$1, azh $$2, int $$3) {
      dxq $$4 = dkg.tZ.m();
      dxq $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      dxq $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         dxq $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dgz $$0, ji $$1, dxq $$2, @Nullable bvy $$3, cxh $$4) {
      if (!$$0.C) {
         azh $$5 = $$0.C_();
         dxq $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dxq a(dgf $$0, ji $$1, BooleanSupplier $$2) {
      ji $$3 = $$1.d();
      dxq $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dkg.tZ);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dxq $$6 = dkg.tZ.m().b(b, Boolean.valueOf(false));
         dxq $$7 = a($$6, $$0, $$1.d(), true);

         for (jn $$8 : jn.c.a) {
            dyo<dzc> $$9 = a($$8);
            if ($$7.c($$9) != dzc.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dzc.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dkg.a.m();
      } else {
         return dkg.a.m();
      }
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return dkg.a.m();
      } else {
         dxq $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dkg.a.m() : $$8;
      }
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dxq a(dxq $$0, dqw $$1) {
      return switch ($$1) {
         case c -> (dxq)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dxq)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dxq)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dxq a(dxq $$0, dpf $$1) {
      return switch ($$1) {
         case b -> (dxq)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dxq)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dyo<dzc> a(jn $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dhc $$0, ji $$1, dxq $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgz $$0, azh $$1, ji $$2, dxq $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dxq $$3) {
      dxq $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
