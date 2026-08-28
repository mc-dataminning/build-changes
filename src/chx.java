import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import org.slf4j.Logger;

public class chx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cea<? extends cdz<? super chw>>> a = ImmutableList.of(cea.c, cea.f, cea.d, cea.y);
   static final List<cct<?>> b = ImmutableList.of(
      cct.n, cct.m, cct.E, cct.t, cct.Z, cct.aR, cct.aS, cct.aT, cct.aG, cct.aQ, cct.h, cct.r, new cct[]{cct.O, cct.P, cct.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cup> a() {
      return $$0 -> $$0.a(awy.X);
   }

   protected static bur<?> a(bur<chw> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   static chw b(chw $$0) {
      $$0.dS().b(cct.aS);
      $$0.dS().b(cct.aR);
      return $$0.a(chw.a.a);
   }

   private static void b(bur<chw> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byc(0.8F), new bvd<chw>(2.0F) {
         protected void a(arf $$0, chw $$1, long $$2) {
            chx.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bws(500, 700), new bvo(cct.P)));
   }

   private static void c(bur<chw> $$0) {
      $$0.a(com.v, ImmutableList.of(Pair.of(0, new chx.e())), Set.of(Pair.of(cct.Z, ccu.b), Pair.of(cct.aR, ccu.a), Pair.of(cct.m, ccu.a)));
   }

   private static void d(bur<chw> $$0) {
      $$0.a(
         com.z,
         ImmutableList.of(Pair.of(0, new chx.a(160, 180)), Pair.of(0, new chx.c(40))),
         Set.of(Pair.of(cct.Z, ccu.b), Pair.of(cct.m, ccu.b), Pair.of(cct.aS, ccu.a))
      );
   }

   private static void e(bur<chw> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, new bvc(bta.aR) {
               @Override
               protected void a(arf $$0, cff $$1, long $$2) {
                  chx.b((chw)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvv($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arf $$0, bty $$1, long $$2) {
                  chx.b((chw)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwo(45, 90)),
            Pair.of(3, new chx.b(40, 100)),
            Pair.of(
               4,
               new bxf(
                  ImmutableList.of(
                     Pair.of(bxp.a(1.0F, 3), 2),
                     Pair.of(new chx.d(40, 80), 1),
                     Pair.of(new chx.f(40, 80), 1),
                     Pair.of(bxh.a(bta.by, 6.0F), 1),
                     Pair.of(bxa.a(1.0F), 1),
                     Pair.of(new bvs(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cct.aS, ccu.b))
      );
   }

   static void a(chw $$0) {
      $$0.dS().a(ImmutableList.of(com.z, com.v, com.b));
   }

   static class a extends bvi<chw> {
      a(int $$0, int $$1) {
         super(Map.of(cct.Z, ccu.b, cct.m, ccu.b, cct.aS, ccu.a, cct.aG, ccu.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chw $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         return $$1.dS().c(cct.aS).isPresent() && $$1.gy() && !$$1.gu();
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.f);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(cct.aG, bac.a, 9600L);
         } else {
            chx.b($$1);
         }
      }
   }

   static class b extends bvi<chw> {
      b(int $$0, int $$1) {
         super(Map.of(cct.aT, ccu.a), $$0, $$1);
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.b);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.a);
         $$1.dS().b(cct.aT);
      }
   }

   static class c extends bvi<chw> {
      c(int $$0) {
         super(Map.of(cct.Z, ccu.b, cct.m, ccu.b, cct.aS, ccu.a, cct.aG, ccu.a), $$0, $$0);
      }

      protected boolean a(arf $$0, chw $$1) {
         return true;
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         return $$1.dS().c(cct.aS).isPresent();
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.g);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chw.a.a).w($$3);
         $$1.dS().b(cct.aS);
         $$1.dS().a(cct.aT, true);
      }
   }

   static class d extends bvi<chw> {
      d(int $$0, int $$1) {
         super(Map.of(cct.Z, ccu.b, cct.aS, ccu.b, cct.aR, ccu.b, cct.aT, ccu.b, cct.r, ccu.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chw $$1) {
         return !$$1.y();
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         return true;
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.c);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.a);
      }
   }

   static class e extends bvi<chw> {
      e() {
         super(Map.of(cct.m, ccu.a, cct.Z, ccu.b, cct.aR, ccu.a), 600);
      }

      protected boolean a(arf $$0, chw $$1) {
         return $$1.gq();
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(chw.a.a);
            return false;
         } else {
            Optional<iz> $$3 = $$1.dS().c(cct.m).map(ccw::a).map(bww::b);
            Optional<iz> $$4 = $$1.dS().c(cct.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.e);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         if ($$1.gy() && $$1.gq()) {
            $$1.dS().a(cct.aS, true);
         }

         $$1.dS().b(cct.m);
         $$1.dS().b(cct.aR);
      }
   }

   static class f extends bvi<chw> {
      f(int $$0, int $$1) {
         super(Map.of(cct.m, ccu.b, cct.aR, ccu.b, cct.aG, ccu.b), $$0, $$1);
      }

      protected boolean a(arf $$0, chw $$1) {
         return !$$1.p_() && $$1.gq();
      }

      protected boolean a(arf $$0, chw $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arf $$0, chw $$1, long $$2) {
         $$1.a(chw.a.d);
      }

      protected void c(arf $$0, chw $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chw.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.dS().a(cct.aR, $$1x);
               $$1.dS().a(cct.m, new ccw($$1x, 1.25F, 0));
            });
         }
      }
   }
}
