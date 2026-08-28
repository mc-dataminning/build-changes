import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class drd extends dma implements dmd {
   public static final MapCodec<drd> a = b(drd::new);
   public static final eaq b = eap.d;
   public static final eax<ebm> c = eap.aa;
   public static final eax<ebm> d = eap.Z;
   public static final eax<ebm> e = eap.ab;
   public static final eax<ebm> f = eap.ac;
   public static final Map<ja, eax<ebm>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(ja.c, c, ja.f, d, ja.d, e, ja.e, f)));
   private final Function<dzz, ffc> h;

   @Override
   public MapCodec<drd> a() {
      return a;
   }

   public drd(dzy.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(true)).b(c, ebm.a).b(d, ebm.a).b(e, ebm.a).b(f, ebm.a));
      this.h = this.b();
   }

   @Override
   protected ffc d_(dzz $$0) {
      return fez.a();
   }

   public Function<dzz, ffc> b() {
      Map<ja, ffc> $$0 = fez.c(dma.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<ja, ffc> $$1 = fez.d(dma.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         ffc $$3 = $$2.c(b) ? $$1.get(ja.a) : fez.a();

         for (Entry<ja, eax<ebm>> $$4 : g.entrySet()) {
            switch ((ebm)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fez.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fez.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fez.b() : $$3;
      });
   }

   @Override
   protected ffc a(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected ffc b(dzz $$0, dib $$1, iu $$2, fen $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fez.a();
   }

   @Override
   protected boolean e_(dzz $$0) {
      return true;
   }

   @Override
   protected boolean a(dzz $$0, diy $$1, iu $$2) {
      dzz $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(dzz $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (eax<ebm> $$1 : g.values()) {
            if ($$0.c($$1) != ebm.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(dib $$0, iu $$1, ja $$2) {
      return $$2 == ja.b ? false : drf.a($$0, $$1, $$2);
   }

   private static dzz a(dzz $$0, dib $$1, iu $$2, boolean $$3) {
      dzz $$4 = null;
      dzz $$5 = null;
      $$3 |= $$0.c(b);

      for (ja $$6 : ja.c.a) {
         eax<ebm> $$7 = a($$6);
         ebm $$8 = a($$1, $$2, $$6) ? ($$3 ? ebm.b : $$0.c($$7)) : ebm.a;
         if ($$8 == ebm.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dmc.uc) && $$4.c($$7) != ebm.a && !$$4.c(b)) {
               $$8 = ebm.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dmc.uc) && $$5.c($$7) == ebm.a) {
                  $$8 = ebm.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public dzz a(dcr $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(diw $$0, iu $$1, azv $$2, int $$3) {
      dzz $$4 = dmc.uc.m();
      dzz $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      dzz $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         dzz $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(div $$0, iu $$1, dzz $$2, @Nullable bxc $$3, cyy $$4) {
      if (!$$0.C) {
         azv $$5 = $$0.C_();
         dzz $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static dzz a(dib $$0, iu $$1, BooleanSupplier $$2) {
      iu $$3 = $$1.d();
      dzz $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dmc.uc);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         dzz $$6 = dmc.uc.m().b(b, Boolean.valueOf(false));
         dzz $$7 = a($$6, $$0, $$1.d(), true);

         for (ja $$8 : ja.c.a) {
            eax<ebm> $$9 = a($$8);
            if ($$7.c($$9) != ebm.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ebm.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dmc.a.m();
      } else {
         return dmc.a.m();
      }
   }

   @Override
   protected dzz a(dzz $$0, diy $$1, djk $$2, iu $$3, ja $$4, iu $$5, dzz $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         return dmc.a.m();
      } else {
         dzz $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dmc.a.m() : $$8;
      }
   }

   @Override
   protected void a(eaa.a<dma, dzz> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected dzz a(dzz $$0, dst $$1) {
      return switch ($$1) {
         case c -> (dzz)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (dzz)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (dzz)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected dzz a(dzz $$0, drc $$1) {
      return switch ($$1) {
         case b -> (dzz)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (dzz)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static eax<ebm> a(ja $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(diy $$0, iu $$1, dzz $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(div $$0, azv $$1, iu $$2, dzz $$3) {
      return true;
   }

   @Override
   public void a(arq $$0, azv $$1, iu $$2, dzz $$3) {
      dzz $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
