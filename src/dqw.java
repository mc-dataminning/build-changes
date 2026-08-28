import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dqw extends dlu implements dlx {
   public static final MapCodec<dqw> a = b(dqw::new);
   public static final eaf b = eae.d;
   public static final eam<ebb> c = eae.aa;
   public static final eam<ebb> d = eae.Z;
   public static final eam<ebb> e = eae.ab;
   public static final eam<ebb> f = eae.ac;
   public static final Map<ja, eam<ebb>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, c, ja.f, d, ja.d, e, ja.e, f)));
   private final Function<dzo, feq> h;

   @Override
   public MapCodec<dqw> a() {
      return a;
   }

   public dqw(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, ebb.a).b(d, ebb.a).b(e, ebb.a).b(f, ebb.a));
      this.h = this.b();
   }

   @Override
   protected feq d_(dzo $$0) {
      return fen.a();
   }

   public Function<dzo, feq> b() {
      Map<ja, feq> $$0 = fen.c(dlu.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<ja, feq> $$1 = fen.d(dlu.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         feq $$3 = $$2.c(b) ? $$1.get(ja.a) : fen.a();

         for (Entry<ja, eam<ebb>> $$4 : g.entrySet()) {
            switch ((ebb)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fen.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fen.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fen.b() : $$3;
      });
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fen.a();
   }

   @Override
   protected boolean e_(dzo $$0) {
      return true;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(dzo $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (eam<ebb> $$1 : g.values()) {
            if ($$0.c($$1) != ebb.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dhv $$0, iu $$1, ja $$2) {
      return $$2 == ja.b ? false : dqy.a($$0, $$1, $$2);
   }

   private static dzo a(dzo $$0, dhv $$1, iu $$2, boolean $$3) {
      dzo $$4 = null;
      dzo $$5 = null;
      $$3 |= $$0.c(b);

      for (ja $$6 : ja.c.a) {
         eam<ebb> $$7 = a($$6);
         ebb $$8 = a($$1, $$2, $$6) ? ($$3 ? ebb.b : $$0.c($$7)) : ebb.a;
         if ($$8 == ebb.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dlw.ub) && $$4.c($$7) != ebb.a && !$$4.c(b)) {
               $$8 = ebb.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dlw.ub) && $$5.c($$7) == ebb.a) {
                  $$8 = ebb.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(diq $$0, iu $$1, azt $$2, int $$3) {
      dzo $$4 = dlw.ub.m();
      dzo $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      dzo $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         dzo $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, @Nullable bwz $$3, cys $$4) {
      if (!$$0.C) {
         azt $$5 = $$0.C_();
         dzo $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dzo a(dhv $$0, iu $$1, BooleanSupplier $$2) {
      iu $$3 = $$1.d();
      dzo $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dlw.ub);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dzo $$6 = dlw.ub.m().b(b, Boolean.valueOf(false));
         dzo $$7 = a($$6, $$0, $$1.d(), true);

         for (ja $$8 : ja.c.a) {
            eam<ebb> $$9 = a($$8);
            if ($$7.c($$9) != ebb.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ebb.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dlw.a.m();
      } else {
         return dlw.a.m();
      }
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         return dlw.a.m();
      } else {
         dzo $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dlw.a.m() : $$8;
      }
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return switch ($$1) {
         case c -> (dzo)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dzo)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dzo)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return switch ($$1) {
         case b -> (dzo)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dzo)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static eam<ebb> a(ja $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dis $$0, iu $$1, dzo $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dip $$0, azt $$1, iu $$2, dzo $$3) {
      return true;
   }

   @Override
   public void a(aro $$0, azt $$1, iu $$2, dzo $$3) {
      dzo $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
