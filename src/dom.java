import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class dom extends djm implements djp {
   public static final MapCodec<dom> a = b(dom::new);
   public static final dxo b = dxn.e;
   private static final dxu<dyi> c = dxn.aa;
   private static final dxu<dyi> d = dxn.Z;
   private static final dxu<dyi> e = dxn.ab;
   private static final dxu<dyi> f = dxn.ac;
   private static final Map<jn, dxu<dyi>> g = ImmutableMap.copyOf(af.a(Maps.newEnumMap(jn.class), $$0 -> {
      $$0.put(jn.c, c);
      $$0.put(jn.f, d);
      $$0.put(jn.d, e);
      $$0.put(jn.e, f);
   }));
   private static final float h = 1.0F;
   private static final fbu i = djm.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);
   private static final fbu j = djm.a(0.0, 0.0, 0.0, 1.0, 16.0, 16.0);
   private static final fbu k = djm.a(15.0, 0.0, 0.0, 16.0, 16.0, 16.0);
   private static final fbu l = djm.a(0.0, 0.0, 0.0, 16.0, 16.0, 1.0);
   private static final fbu m = djm.a(0.0, 0.0, 15.0, 16.0, 16.0, 16.0);
   private static final int n = 10;
   private static final fbu o = djm.a(0.0, 0.0, 0.0, 1.0, 10.0, 16.0);
   private static final fbu G = djm.a(15.0, 0.0, 0.0, 16.0, 10.0, 16.0);
   private static final fbu H = djm.a(0.0, 0.0, 0.0, 16.0, 10.0, 1.0);
   private static final fbu I = djm.a(0.0, 0.0, 15.0, 16.0, 10.0, 16.0);
   private final Map<dwx, fbu> J;

   @Override
   public MapCodec<dom> a() {
      return a;
   }

   public dom(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Boolean.valueOf(true)).b(c, dyi.a).b(d, dyi.a).b(e, dyi.a).b(f, dyi.a));
      this.J = ImmutableMap.copyOf(this.F.a().stream().collect(Collectors.toMap(Function.identity(), dom::o)));
   }

   @Override
   protected fbu d_(dwx $$0) {
      return fbr.a();
   }

   private static fbu o(dwx $$0) {
      fbu $$1 = fbr.a();
      if ($$0.c(b)) {
         $$1 = i;
      }
      $$1 = switch ((dyi)$$0.c(c)) {
         case a -> $$1;
         case b -> fbr.a($$1, H);
         case c -> fbr.a($$1, l);
      };

      $$1 = switch ((dyi)$$0.c(e)) {
         case a -> $$1;
         case b -> fbr.a($$1, I);
         case c -> fbr.a($$1, m);
      };

      $$1 = switch ((dyi)$$0.c(d)) {
         case a -> $$1;
         case b -> fbr.a($$1, G);
         case c -> fbr.a($$1, k);
      };

      $$1 = switch ((dyi)$$0.c(f)) {
         case a -> $$1;
         case b -> fbr.a($$1, o);
         case c -> fbr.a($$1, j);
      };
      return $$1.c() ? fbr.b() : $$1;
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return this.J.get($$0);
   }

   @Override
   protected fbu b(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      return $$0.c(b) ? i : fbr.a();
   }

   @Override
   protected boolean e_(dwx $$0) {
      return true;
   }

   @Override
   protected boolean a(dwx $$0, dgl $$1, ji $$2) {
      dwx $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean q(dwx $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (dxu<dyi> $$1 : g.values()) {
            if ($$0.c($$1) != dyi.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dfn $$0, ji $$1, jn $$2) {
      return $$2 == jn.b ? false : doo.a($$0, $$1, $$2);
   }

   private static dwx a(dwx $$0, dfn $$1, ji $$2, boolean $$3) {
      dwx $$4 = null;
      dwx $$5 = null;
      $$3 |= $$0.c(b);

      for (jn $$6 : jn.c.a) {
         dxu<dyi> $$7 = a($$6);
         dyi $$8 = a($$1, $$2, $$6) ? ($$3 ? dyi.b : $$0.c($$7)) : dyi.a;
         if ($$8 == dyi.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(djo.tX) && $$4.c($$7) != dyi.a && !$$4.c(b)) {
               $$8 = dyi.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(djo.tX) && $$5.c($$7) == dyi.a) {
                  $$8 = dyi.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dwx a(dag $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dgj $$0, ji $$1, azh $$2, int $$3) {
      dwx $$4 = djo.tX.m();
      dwx $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, 3);
      dwx $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, @Nullable bvh $$3, cwp $$4) {
      if (!$$0.C) {
         azh $$5 = $$0.H_();
         dwx $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dwx a(dfn $$0, ji $$1, BooleanSupplier $$2) {
      ji $$3 = $$1.d();
      dwx $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(djo.tX);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dwx $$6 = djo.tX.m().b(b, Boolean.valueOf(false));
         dwx $$7 = a($$6, $$0, $$1.d(), true);

         for (jn $$8 : jn.c.a) {
            dxu<dyi> $$9 = a($$8);
            if ($$7.c($$9) != dyi.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, dyi.a);
            }
         }

         return q($$7) && $$7 != $$4 ? $$7 : djo.a.m();
      } else {
         return djo.a.m();
      }
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      if (!$$0.a($$1, $$3)) {
         return djo.a.m();
      } else {
         dwx $$8 = a($$0, $$1, $$3, false);
         return !q($$8) ? djo.a.m() : $$8;
      }
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return switch ($$1) {
         case c -> (dwx)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dwx)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dwx)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return switch ($$1) {
         case b -> (dwx)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dwx)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static dxu<dyi> a(jn $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dgl $$0, ji $$1, dwx $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dgi $$0, azh $$1, ji $$2, dwx $$3) {
      return true;
   }

   @Override
   public void a(ard $$0, azh $$1, ji $$2, dwx $$3) {
      dwx $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
