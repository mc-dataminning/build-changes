import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cfa {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cbd<? extends cbc<? super cez>>> a = ImmutableList.of(cbd.c, cbd.f, cbd.d, cbd.y);
   static final List<bzw<?>> b = ImmutableList.of(
      bzw.n, bzw.m, bzw.E, bzw.t, bzw.Z, bzw.aR, bzw.aS, bzw.aT, bzw.aG, bzw.aQ, bzw.h, bzw.r, new bzw[]{bzw.O, bzw.P, bzw.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cvp a() {
      return cvp.a(crv.vg);
   }

   protected static bru<?> a(bru<cez> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(clp.a));
      $$0.b(clp.b);
      $$0.f();
      return $$0;
   }

   static cez b(cez $$0) {
      $$0.dP().b(bzw.aS);
      $$0.dP().b(bzw.aR);
      return $$0.a(cez.a.a);
   }

   private static void b(bru<cez> $$0) {
      $$0.a(clp.a, 0, ImmutableList.of(new bvf(0.8F), new bsg<cez>(2.0F) {
         protected void a(apu $$0, cez $$1, long $$2) {
            cfa.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new btv(500, 700), new bsr(bzw.P)));
   }

   private static void c(bru<cez> $$0) {
      $$0.a(clp.v, ImmutableList.of(Pair.of(0, new cfa.e())), Set.of(Pair.of(bzw.Z, bzx.b), Pair.of(bzw.aR, bzx.a), Pair.of(bzw.m, bzx.a)));
   }

   private static void d(bru<cez> $$0) {
      $$0.a(
         clp.z,
         ImmutableList.of(Pair.of(0, new cfa.a(160, 180)), Pair.of(0, new cfa.c(40))),
         Set.of(Pair.of(bzw.Z, bzx.b), Pair.of(bzw.m, bzx.b), Pair.of(bzw.aS, bzx.a))
      );
   }

   private static void e(bru<cez> $$0) {
      $$0.a(
         clp.b,
         ImmutableList.of(
            Pair.of(0, new bsf(bqg.aQ) {
               @Override
               protected void a(apu $$0, cci $$1, long $$2) {
                  cfa.b((cez)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bsy($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(apu $$0, brb $$1, long $$2) {
                  cfa.b((cez)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new btr(45, 90)),
            Pair.of(3, new cfa.b(40, 100)),
            Pair.of(
               4,
               new bui(
                  ImmutableList.of(
                     Pair.of(bus.a(1.0F, 3), 2),
                     Pair.of(new cfa.d(40, 80), 1),
                     Pair.of(new cfa.f(40, 80), 1),
                     Pair.of(buk.a(bqg.bx, 6.0F), 1),
                     Pair.of(bud.a(1.0F), 1),
                     Pair.of(new bsv(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bzw.aS, bzx.b))
      );
   }

   static void a(cez $$0) {
      $$0.dP().a(ImmutableList.of(clp.z, clp.v, clp.b));
   }

   static class a extends bsl<cez> {
      a(int $$0, int $$1) {
         super(Map.of(bzw.Z, bzx.b, bzw.m, bzx.b, bzw.aS, bzx.a, bzw.aG, bzx.b), $$0, $$1);
      }

      protected boolean a(apu $$0, cez $$1) {
         return $$1.gn();
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         return $$1.dP().c(bzw.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.f);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(bzw.aG, ayo.a, 9600L);
         } else {
            cfa.b($$1);
         }
      }
   }

   static class b extends bsl<cez> {
      b(int $$0, int $$1) {
         super(Map.of(bzw.aT, bzx.a), $$0, $$1);
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         return true;
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.b);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.a);
         $$1.dP().b(bzw.aT);
      }
   }

   static class c extends bsl<cez> {
      c(int $$0) {
         super(Map.of(bzw.Z, bzx.b, bzw.m, bzx.b, bzw.aS, bzx.a, bzw.aG, bzx.a), $$0, $$0);
      }

      protected boolean a(apu $$0, cez $$1) {
         return true;
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         return $$1.dP().c(bzw.aS).isPresent();
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.g);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cez.a.a).w($$3);
         $$1.dP().b(bzw.aS);
         $$1.dP().a(bzw.aT, true);
      }
   }

   static class d extends bsl<cez> {
      d(int $$0, int $$1) {
         super(Map.of(bzw.Z, bzx.b, bzw.aS, bzx.b, bzw.aR, bzx.b, bzw.aT, bzx.b, bzw.r, bzx.b), $$0, $$1);
      }

      protected boolean a(apu $$0, cez $$1) {
         return !$$1.y();
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         return true;
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.c);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.a);
      }
   }

   static class e extends bsl<cez> {
      e() {
         super(Map.of(bzw.m, bzx.a, bzw.Z, bzx.b, bzw.aR, bzx.a), 600);
      }

      protected boolean a(apu $$0, cez $$1) {
         return $$1.gn();
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(cez.a.a);
            return false;
         } else {
            Optional<id> $$3 = $$1.dP().c(bzw.m).map(bzz::a).map(btz::b);
            Optional<id> $$4 = $$1.dP().c(bzw.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.e);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dP().a(bzw.aS, true);
         }

         $$1.dP().b(bzw.m);
         $$1.dP().b(bzw.aR);
      }
   }

   static class f extends bsl<cez> {
      f(int $$0, int $$1) {
         super(Map.of(bzw.m, bzx.b, bzw.aR, bzx.b, bzw.aG, bzx.b), $$0, $$1);
      }

      protected boolean a(apu $$0, cez $$1) {
         return !$$1.p_() && $$1.gn();
      }

      protected boolean a(apu $$0, cez $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(apu $$0, cez $$1, long $$2) {
         $$1.a(cez.a.d);
      }

      protected void c(apu $$0, cez $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cez.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dP().a(bzw.aR, $$1x);
               $$1.dP().a(bzw.m, new bzz($$1x, 1.25F, 0));
            });
         }
      }
   }
}
