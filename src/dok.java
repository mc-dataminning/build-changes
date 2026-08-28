import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dok extends djk implements djn {
   public static final MapCodec<dok> a = b(dok::new);
   public static final dxm b = dxl.e;
   private static final dxs<dyg> c = dxl.aa;
   private static final dxs<dyg> d = dxl.Z;
   private static final dxs<dyg> e = dxl.ab;
   private static final dxs<dyg> f = dxl.ac;
   private static final Map<jn, dxs<dyg>> g = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, c);
      $$0.put(jn.f, d);
      $$0.put(jn.d, e);
      $$0.put(jn.e, f);
   }));
   private static final float h = 1.0F;
   private static final fbs i = djk.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbs j = djk.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbs k = djk.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbs l = djk.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbs m = djk.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fbs o = djk.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fbs G = djk.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fbs H = djk.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fbs I = djk.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dwv, fbs> J;

   @Override
   public MapCodec<dok> a() {
      return a;
   }

   public dok(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dyg.a).b(d, dyg.a).b(e, dyg.a).b(f, dyg.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dok::o)));
   }

   @Override
   protected fbs d_(dwv $$0) {
      return fbp.a();
   }

   private static fbs o(dwv $$0) {
      fbs $$1 = fbp.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyg)$$0.c(c)) {
         case a -> $$1;
         case b -> fbp.a($$1, H);
         case c -> fbp.a($$1, l);
      };

      $$1 = switch ((dyg)$$0.c(e)) {
         case a -> $$1;
         case b -> fbp.a($$1, I);
         case c -> fbp.a($$1, m);
      };

      $$1 = switch ((dyg)$$0.c(d)) {
         case a -> $$1;
         case b -> fbp.a($$1, G);
         case c -> fbp.a($$1, k);
      };

      $$1 = switch ((dyg)$$0.c(f)) {
         case a -> $$1;
         case b -> fbp.a($$1, o);
         case c -> fbp.a($$1, j);
      };
      return $$1.c() ? fbp.b() : $$1;
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fbs b(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(b) ? i : fbp.a();
   }

   @Override
   protected boolean e_(dwv $$0) {
      return true;
   }

   @Override
   protected boolean a(dwv $$0, dgj $$1, ji $$2) {
      dwv $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dwv $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dxs<dyg> $$1 : g.values()) {
            if ($$0.c($$1) != dyg.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dfl $$0, ji $$1, jn $$2) {
      return $$2 == jn.b ? false : dom.a($$0, $$1, $$2);
   }

   private static dwv a(dwv $$0, dfl $$1, ji $$2, boolean $$3) {
      dwv $$4 = null;
      dwv $$5 = null;
      $$3 |= $$0.c(b);

      for (jn $$6 : jn.c.a) {
         dxs<dyg> $$7 = a($$6);
         dyg $$8 = a($$1, $$2, $$6) ? ($$3 ? dyg.b : $$0.c($$7)) : dyg.a;
         if ($$8 == dyg.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(djm.tX) && $$4.c($$7) != dyg.a && !$$4.c(b)) {
               $$8 = dyg.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(djm.tX) && $$5.c($$7) == dyg.a) {
                  $$8 = dyg.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dgh $$0, ji $$1, azg $$2, int $$3) {
      dwv $$4 = djm.tX.m();
      dwv $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dwv $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, @Nullable bvf $$3, cwn $$4) {
      if (!$$0.C) {
         azg $$5 = $$0.H_();
         dwv $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dwv a(dfl $$0, ji $$1, BooleanSupplier $$2) {
      ji $$3 = $$1.d();
      dwv $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(djm.tX);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dwv $$6 = djm.tX.m().b(b, Boolean.valueOf(false));
         dwv $$7 = a($$6, $$0, $$1.d(), true);

         for (jn $$8 : jn.c.a) {
            dxs<dyg> $$9 = a($$8);
            if ($$7.c($$9) != dyg.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyg.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : djm.a.m();
      } else {
         return djm.a.m();
      }
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      if (!$$0.a($$1, $$3)) {
         return djm.a.m();
      } else {
         dwv $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? djm.a.m() : $$8;
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return switch ($$1) {
         case c -> (dwv)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dwv)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dwv)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return switch ($$1) {
         case b -> (dwv)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dwv)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dxs<dyg> a(jn $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dgj $$0, ji $$1, dwv $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgg $$0, azg $$1, ji $$2, dwv $$3) {
      return true;
   }

   @Override
   public void a(arc $$0, azg $$1, ji $$2, dwv $$3) {
      dwv $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
