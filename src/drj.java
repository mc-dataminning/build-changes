import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drj extends dmf implements dmi {
   public static final MapCodec<drj> a = b(drj::new);
   public static final eay b = eax.d;
   public static final ebf<ebu> c = eax.aa;
   public static final ebf<ebu> d = eax.Z;
   public static final ebf<ebu> e = eax.ab;
   public static final ebf<ebu> f = eax.ac;
   public static final Map<ja, ebf<ebu>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, c, ja.f, d, ja.d, e, ja.e, f)));
   private final Function<eah, ffk> h;

   @Override
   public MapCodec<drj> a() {
      return a;
   }

   public drj(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, ebu.a).b(d, ebu.a).b(e, ebu.a).b(f, ebu.a));
      this.h = this.b();
   }

   @Override
   protected ffk d_(eah $$0) {
      return ffh.a();
   }

   public Function<eah, ffk> b() {
      Map<ja, ffk> $$0 = ffh.c(dmf.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<ja, ffk> $$1 = ffh.d(dmf.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         ffk $$3 = $$2.c(b) ? $$1.get(ja.a) : ffh.a();

         for (Entry<ja, ebf<ebu>> $$4 : g.entrySet()) {
            switch ((ebu)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = ffh.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = ffh.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? ffh.b() : $$3;
      });
   }

   @Override
   protected ffk a(eah $$0, dig $$1, iu $$2, fev $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffk b(eah $$0, dig $$1, iu $$2, fev $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : ffh.a();
   }

   @Override
   protected boolean e_(eah $$0) {
      return true;
   }

   @Override
   protected boolean a(eah $$0, djd $$1, iu $$2) {
      eah $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(eah $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ebf<ebu> $$1 : g.values()) {
            if ($$0.c($$1) != ebu.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dig $$0, iu $$1, ja $$2) {
      return $$2 == ja.b ? false : drl.a($$0, $$1, $$2);
   }

   private static eah a(eah $$0, dig $$1, iu $$2, boolean $$3) {
      eah $$4 = null;
      eah $$5 = null;
      $$3 |= $$0.c(b);

      for (ja $$6 : ja.c.a) {
         ebf<ebu> $$7 = a($$6);
         ebu $$8 = a($$1, $$2, $$6) ? ($$3 ? ebu.b : $$0.c($$7)) : ebu.a;
         if ($$8 == ebu.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dmh.uf) && $$4.c($$7) != ebu.a && !$$4.c(b)) {
               $$8 = ebu.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dmh.uf) && $$5.c($$7) == ebu.a) {
                  $$8 = ebu.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public eah a(dcw $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(djb $$0, iu $$1, azv $$2, int $$3) {
      eah $$4 = dmh.uf.m();
      eah $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      eah $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         eah $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(dja $$0, iu $$1, eah $$2, @Nullable bxe $$3, czd $$4) {
      if (!$$0.C) {
         azv $$5 = $$0.C_();
         eah $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static eah a(dig $$0, iu $$1, BooleanSupplier $$2) {
      iu $$3 = $$1.d();
      eah $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dmh.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         eah $$6 = dmh.uf.m().b(b, Boolean.valueOf(false));
         eah $$7 = a($$6, $$0, $$1.d(), true);

         for (ja $$8 : ja.c.a) {
            ebf<ebu> $$9 = a($$8);
            if ($$7.c($$9) != ebu.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ebu.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dmh.a.m();
      } else {
         return dmh.a.m();
      }
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmh.a.m();
      } else {
         eah $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dmh.a.m() : $$8;
      }
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected eah a(eah $$0, dsz $$1) {
      return switch ($$1) {
         case c -> (eah)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (eah)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (eah)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected eah a(eah $$0, dri $$1) {
      return switch ($$1) {
         case b -> (eah)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (eah)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static ebf<ebu> a(ja $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(djd $$0, iu $$1, eah $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(dja $$0, azv $$1, iu $$2, eah $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, eah $$3) {
      eah $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
