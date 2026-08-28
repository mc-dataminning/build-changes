import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class don extends djn implements djq {
   public static final MapCodec<don> a = b(don::new);
   public static final dxp b = dxo.e;
   private static final dxv<dyj> c = dxo.aa;
   private static final dxv<dyj> d = dxo.Z;
   private static final dxv<dyj> e = dxo.ab;
   private static final dxv<dyj> f = dxo.ac;
   private static final Map<jn, dxv<dyj>> g = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, c);
      $$0.put(jn.f, d);
      $$0.put(jn.d, e);
      $$0.put(jn.e, f);
   }));
   private static final float h = 1.0F;
   private static final fbv i = djn.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbv j = djn.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbv k = djn.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbv l = djn.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbv m = djn.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fbv o = djn.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fbv G = djn.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fbv H = djn.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fbv I = djn.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dwy, fbv> J;

   @Override
   public MapCodec<don> a() {
      return a;
   }

   public don(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dyj.a).b(d, dyj.a).b(e, dyj.a).b(f, dyj.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), don::o)));
   }

   @Override
   protected fbv d_(dwy $$0) {
      return fbs.a();
   }

   private static fbv o(dwy $$0) {
      fbv $$1 = fbs.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyj)$$0.c(c)) {
         case a -> $$1;
         case b -> fbs.a($$1, H);
         case c -> fbs.a($$1, l);
      };

      $$1 = switch ((dyj)$$0.c(e)) {
         case a -> $$1;
         case b -> fbs.a($$1, I);
         case c -> fbs.a($$1, m);
      };

      $$1 = switch ((dyj)$$0.c(d)) {
         case a -> $$1;
         case b -> fbs.a($$1, G);
         case c -> fbs.a($$1, k);
      };

      $$1 = switch ((dyj)$$0.c(f)) {
         case a -> $$1;
         case b -> fbs.a($$1, o);
         case c -> fbs.a($$1, j);
      };
      return $$1.c() ? fbs.b() : $$1;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fbv b(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      return $$0.c(b) ? i : fbs.a();
   }

   @Override
   protected boolean e_(dwy $$0) {
      return true;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      dwy $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dwy $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dxv<dyj> $$1 : g.values()) {
            if ($$0.c($$1) != dyj.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dfo $$0, ji $$1, jn $$2) {
      return $$2 == jn.b ? false : dop.a($$0, $$1, $$2);
   }

   private static dwy a(dwy $$0, dfo $$1, ji $$2, boolean $$3) {
      dwy $$4 = null;
      dwy $$5 = null;
      $$3 |= $$0.c(b);

      for (jn $$6 : jn.c.a) {
         dxv<dyj> $$7 = a($$6);
         dyj $$8 = a($$1, $$2, $$6) ? ($$3 ? dyj.b : $$0.c($$7)) : dyj.a;
         if ($$8 == dyj.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(djp.tX) && $$4.c($$7) != dyj.a && !$$4.c(b)) {
               $$8 = dyj.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(djp.tX) && $$5.c($$7) == dyj.a) {
                  $$8 = dyj.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dwy a(dah $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dgk $$0, ji $$1, azh $$2, int $$3) {
      dwy $$4 = djp.tX.m();
      dwy $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dwy $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, @Nullable bvi $$3, cwq $$4) {
      if (!$$0.C) {
         azh $$5 = $$0.H_();
         dwy $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dwy a(dfo $$0, ji $$1, BooleanSupplier $$2) {
      ji $$3 = $$1.d();
      dwy $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(djp.tX);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dwy $$6 = djp.tX.m().b(b, Boolean.valueOf(false));
         dwy $$7 = a($$6, $$0, $$1.d(), true);

         for (jn $$8 : jn.c.a) {
            dxv<dyj> $$9 = a($$8);
            if ($$7.c($$9) != dyj.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyj.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : djp.a.m();
      } else {
         return djp.a.m();
      }
   }

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djp.a.m();
      } else {
         dwy $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? djp.a.m() : $$8;
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return switch ($$1) {
         case c -> (dwy)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dwy)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dwy)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dwy a(dwy $$0, dom $$1) {
      return switch ($$1) {
         case b -> (dwy)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dwy)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dxv<dyj> a(jn $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dgm $$0, ji $$1, dwy $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgj $$0, azh $$1, ji $$2, dwy $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwy $$3) {
      dwy $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
