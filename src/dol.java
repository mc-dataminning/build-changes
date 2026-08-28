import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dol extends djl implements djo {
   public static final MapCodec<dol> a = b(dol::new);
   public static final dxn b = dxm.e;
   private static final dxt<dyh> c = dxm.aa;
   private static final dxt<dyh> d = dxm.Z;
   private static final dxt<dyh> e = dxm.ab;
   private static final dxt<dyh> f = dxm.ac;
   private static final Map<jn, dxt<dyh>> g = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, c);
      $$0.put(jn.f, d);
      $$0.put(jn.d, e);
      $$0.put(jn.e, f);
   }));
   private static final float h = 1.0F;
   private static final fbt i = djl.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbt j = djl.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbt k = djl.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbt l = djl.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbt m = djl.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fbt o = djl.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fbt G = djl.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fbt H = djl.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fbt I = djl.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dww, fbt> J;

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   public dol(dwv.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dyh.a).b(d, dyh.a).b(e, dyh.a).b(f, dyh.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dol::o)));
   }

   @Override
   protected fbt d_(dww $$0) {
      return fbq.a();
   }

   private static fbt o(dww $$0) {
      fbt $$1 = fbq.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyh)$$0.c(c)) {
         case a -> $$1;
         case b -> fbq.a($$1, H);
         case c -> fbq.a($$1, l);
      };

      $$1 = switch ((dyh)$$0.c(e)) {
         case a -> $$1;
         case b -> fbq.a($$1, I);
         case c -> fbq.a($$1, m);
      };

      $$1 = switch ((dyh)$$0.c(d)) {
         case a -> $$1;
         case b -> fbq.a($$1, G);
         case c -> fbq.a($$1, k);
      };

      $$1 = switch ((dyh)$$0.c(f)) {
         case a -> $$1;
         case b -> fbq.a($$1, o);
         case c -> fbq.a($$1, j);
      };
      return $$1.c() ? fbq.b() : $$1;
   }

   @Override
   protected fbt a(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fbt b(dww $$0, dfm $$1, ji $$2, fbe $$3) {
      return $$0.c(b) ? i : fbq.a();
   }

   @Override
   protected boolean e_(dww $$0) {
      return true;
   }

   @Override
   protected boolean a(dww $$0, dgk $$1, ji $$2) {
      dww $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dww $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dxt<dyh> $$1 : g.values()) {
            if ($$0.c($$1) != dyh.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dfm $$0, ji $$1, jn $$2) {
      return $$2 == jn.b ? false : don.a($$0, $$1, $$2);
   }

   private static dww a(dww $$0, dfm $$1, ji $$2, boolean $$3) {
      dww $$4 = null;
      dww $$5 = null;
      $$3 |= $$0.c(b);

      for (jn $$6 : jn.c.a) {
         dxt<dyh> $$7 = a($$6);
         dyh $$8 = a($$1, $$2, $$6) ? ($$3 ? dyh.b : $$0.c($$7)) : dyh.a;
         if ($$8 == dyh.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(djn.tX) && $$4.c($$7) != dyh.a && !$$4.c(b)) {
               $$8 = dyh.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(djn.tX) && $$5.c($$7) == dyh.a) {
                  $$8 = dyh.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dww a(daf $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dgi $$0, ji $$1, azh $$2, int $$3) {
      dww $$4 = djn.tX.m();
      dww $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dww $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dgh $$0, ji $$1, dww $$2, @Nullable bvg $$3, cwo $$4) {
      if (!$$0.C) {
         azh $$5 = $$0.H_();
         dww $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dww a(dfm $$0, ji $$1, BooleanSupplier $$2) {
      ji $$3 = $$1.d();
      dww $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(djn.tX);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dww $$6 = djn.tX.m().b(b, Boolean.valueOf(false));
         dww $$7 = a($$6, $$0, $$1.d(), true);

         for (jn $$8 : jn.c.a) {
            dxt<dyh> $$9 = a($$8);
            if ($$7.c($$9) != dyh.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyh.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : djn.a.m();
      } else {
         return djn.a.m();
      }
   }

   @Override
   protected dww a(dww $$0, dgk $$1, dgw $$2, ji $$3, jn $$4, ji $$5, dww $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djn.a.m();
      } else {
         dww $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? djn.a.m() : $$8;
      }
   }

   @Override
   protected void a(dwx.a<djl, dww> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dww a(dww $$0, dqd $$1) {
      return switch ($$1) {
         case c -> (dww)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dww)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dww)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dww a(dww $$0, dok $$1) {
      return switch ($$1) {
         case b -> (dww)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dww)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dxt<dyh> a(jn $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dgk $$0, ji $$1, dww $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgh $$0, azh $$1, ji $$2, dww $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dww $$3) {
      dww $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
