import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BooleanSupplier;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dsi extends dne implements dnh {
   public static final MapCodec<dsi> a = b(dsi::new);
   public static final ebx b = ebw.d;
   public static final ece<ect> c = ebw.aa;
   public static final ece<ect> d = ebw.Z;
   public static final ece<ect> e = ebw.ab;
   public static final ece<ect> f = ebw.ac;
   public static final Map<jc, ece<ect>> g = ImmutableMap.copyOf(Maps.newEnumMap(Map.of(jc.c, c, jc.f, d, jc.d, e, jc.e, f)));
   private final Function<ebg, fgm> h;

   @Override
   public MapCodec<dsi> a() {
      return a;
   }

   public dsi(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(true)).b(c, ect.a).b(d, ect.a).b(e, ect.a).b(f, ect.a));
      this.h = this.b();
   }

   @Override
   protected fgm d_(ebg $$0) {
      return fgj.a();
   }

   public Function<ebg, fgm> b() {
      Map<jc, fgm> $$0 = fgj.c(dne.a(16.0, 0.0, 10.0, 0.0, 1.0));
      Map<jc, fgm> $$1 = fgj.d(dne.c(16.0, 0.0, 1.0));
      return this.a($$2 -> {
         fgm $$3 = $$2.c(b) ? $$1.get(jc.a) : fgj.a();

         for (Entry<jc, ece<ect>> $$4 : g.entrySet()) {
            switch ((ect)$$2.c($$4.getValue())) {
               case a:
               default:
                  break;
               case b:
                  $$3 = fgj.a($$3, $$0.get($$4.getKey()));
                  break;
               case c:
                  $$3 = fgj.a($$3, $$1.get($$4.getKey()));
            }
         }

         return $$3.c() ? fgj.b() : $$3;
      });
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return this.h.apply($$0);
   }

   @Override
   protected fgm b(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return $$0.c(b) ? this.h.apply(this.m()) : fgj.a();
   }

   @Override
   protected boolean e_(ebg $$0) {
      return true;
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.e());
      return $$0.c(b) ? !$$3.l() : $$3.a(this) && $$3.c(b);
   }

   private static boolean o(ebg $$0) {
      if ($$0.c(b)) {
         return true;
      } else {
         for (ece<ect> $$1 : g.values()) {
            if ($$0.c($$1) != ect.a) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean a(djd $$0, iw $$1, jc $$2) {
      return $$2 == jc.b ? false : dsk.a($$0, $$1, $$2);
   }

   private static ebg a(ebg $$0, djd $$1, iw $$2, boolean $$3) {
      ebg $$4 = null;
      ebg $$5 = null;
      $$3 |= $$0.c(b);

      for (jc $$6 : jc.c.a) {
         ece<ect> $$7 = a($$6);
         ect $$8 = a($$1, $$2, $$6) ? ($$3 ? ect.b : $$0.c($$7)) : ect.a;
         if ($$8 == ect.b) {
            if ($$4 == null) {
               $$4 = $$1.a_($$2.d());
            }

            if ($$4.a(dng.uf) && $$4.c($$7) != ect.a && !$$4.c(b)) {
               $$8 = ect.c;
            }

            if (!$$0.c(b)) {
               if ($$5 == null) {
                  $$5 = $$1.a_($$2.e());
               }

               if ($$5.a(dng.uf) && $$5.c($$7) == ect.a) {
                  $$8 = ect.a;
               }
            }
         }

         $$0 = $$0.b($$7, $$8);
      }

      return $$0;
   }

   @Nullable
   @Override
   public ebg a(ddt $$0) {
      return a(this.m(), $$0.q(), $$0.a(), true);
   }

   public static void a(dka $$0, iw $$1, azz $$2, int $$3) {
      ebg $$4 = dng.uf.m();
      ebg $$5 = a($$4, $$0, $$1, true);
      $$0.a($$1, $$5, $$3);
      ebg $$6 = a($$0, $$1, $$2::h);
      if (!$$6.l()) {
         $$0.a($$1.d(), $$6, $$3);
         ebg $$7 = a($$5, $$0, $$1, true);
         $$0.a($$1, $$7, $$3);
      }
   }

   @Override
   public void a(djz $$0, iw $$1, ebg $$2, @Nullable bxw $$3, daa $$4) {
      if (!$$0.C) {
         azz $$5 = $$0.G_();
         ebg $$6 = a($$0, $$1, $$5::h);
         if (!$$6.l()) {
            $$0.a($$1.d(), $$6, 3);
         }
      }
   }

   private static ebg a(djd $$0, iw $$1, BooleanSupplier $$2) {
      iw $$3 = $$1.d();
      ebg $$4 = $$0.a_($$3);
      boolean $$5 = $$4.a(dng.uf);
      if ((!$$5 || !$$4.c(b)) && ($$5 || $$4.v())) {
         ebg $$6 = dng.uf.m().b(b, Boolean.valueOf(false));
         ebg $$7 = a($$6, $$0, $$1.d(), true);

         for (jc $$8 : jc.c.a) {
            ece<ect> $$9 = a($$8);
            if ($$7.c($$9) != ect.a && !$$2.getAsBoolean()) {
               $$7 = $$7.b($$9, ect.a);
            }
         }

         return o($$7) && $$7 != $$4 ? $$7 : dng.a.m();
      } else {
         return dng.a.m();
      }
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         return dng.a.m();
      } else {
         ebg $$8 = a($$0, $$1, $$3, false);
         return !o($$8) ? dng.a.m() : $$8;
      }
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e, f);
   }

   @Override
   protected ebg a(ebg $$0, dty $$1) {
      return switch ($$1) {
         case c -> (ebg)$$0.b(c, $$0.c(e)).b(d, $$0.c(f)).b(e, $$0.c(c)).b(f, $$0.c(d));
         case d -> (ebg)$$0.b(c, $$0.c(d)).b(d, $$0.c(e)).b(e, $$0.c(f)).b(f, $$0.c(c));
         case b -> (ebg)$$0.b(c, $$0.c(f)).b(d, $$0.c(c)).b(e, $$0.c(d)).b(f, $$0.c(e));
         default -> $$0;
      };
   }

   @Override
   protected ebg a(ebg $$0, dsh $$1) {
      return switch ($$1) {
         case b -> (ebg)$$0.b(c, $$0.c(e)).b(e, $$0.c(c));
         case c -> (ebg)$$0.b(d, $$0.c(f)).b(f, $$0.c(d));
         default -> super.a($$0, $$1);
      };
   }

   @Nullable
   public static ece<ect> a(jc $$0) {
      return g.get($$0);
   }

   @Override
   public boolean a(dkc $$0, iw $$1, ebg $$2) {
      return $$2.c(b) && !a($$0, $$1, () -> true).l();
   }

   @Override
   public boolean a(djz $$0, azz $$1, iw $$2, ebg $$3) {
      return true;
   }

   @Override
   public void a(aru $$0, azz $$1, iw $$2, ebg $$3) {
      ebg $$4 = a($$0, $$2, () -> true);
      if (!$$4.l()) {
         $$0.a($$2.d(), $$4, 3);
      }
   }
}
