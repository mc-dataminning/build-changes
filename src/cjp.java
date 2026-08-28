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

public class cjp {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfr<? extends cfq<? super cjo>>> a = ImmutableList.of(cfr.c, cfr.f, cfr.d, cfr.y);
   static final List<cek<?>> b = ImmutableList.of(
      cek.n, cek.m, cek.E, cek.t, cek.Z, cek.aR, cek.aS, cek.aT, cek.aG, cek.aQ, cek.h, cek.r, new cek[]{cek.O, cek.P, cek.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwo> a() {
      return $$0 -> $$0.a(awy.aa);
   }

   protected static bwi<?> a(bwi<cjo> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqn.a));
      $$0.b(cqn.b);
      $$0.f();
      return $$0;
   }

   static cjo b(cjo $$0) {
      $$0.eb().b(cek.aS);
      $$0.eb().b(cek.aR);
      return $$0.a(cjo.a.a);
   }

   private static void b(bwi<cjo> $$0) {
      $$0.a(cqn.a, 0, ImmutableList.of(new bzt(0.8F), new bwu<cjo>(2.0F) {
         protected void a(ard $$0, cjo $$1, long $$2) {
            cjp.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byj(500, 700), new bxf(cek.P)));
   }

   private static void c(bwi<cjo> $$0) {
      $$0.a(cqn.v, ImmutableList.of(Pair.of(0, new cjp.e())), Set.of(Pair.of(cek.Z, cel.b), Pair.of(cek.aR, cel.a), Pair.of(cek.m, cel.a)));
   }

   private static void d(bwi<cjo> $$0) {
      $$0.a(
         cqn.z,
         ImmutableList.of(Pair.of(0, new cjp.a(160, 180)), Pair.of(0, new cjp.c(40))),
         Set.of(Pair.of(cek.Z, cel.b), Pair.of(cek.m, cel.b), Pair.of(cek.aS, cel.a))
      );
   }

   private static void e(bwi<cjo> $$0) {
      $$0.a(
         cqn.b,
         ImmutableList.of(
            Pair.of(0, new bwt(bur.bi) {
               @Override
               protected void a(ard $$0, cgx $$1, long $$2) {
                  cjp.b((cjo)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxm($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(ard $$0, bvo $$1, long $$2) {
                  cjp.b((cjo)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byf(45, 90)),
            Pair.of(3, new cjp.b(40, 100)),
            Pair.of(
               4,
               new byw(
                  ImmutableList.of(
                     Pair.of(bzg.a(1.0F, 3), 2),
                     Pair.of(new cjp.d(40, 80), 1),
                     Pair.of(new cjp.f(40, 80), 1),
                     Pair.of(byy.a(bur.bR, 6.0F), 1),
                     Pair.of(byr.a(1.0F), 1),
                     Pair.of(new bxj(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cek.aS, cel.b))
      );
   }

   static void a(cjo $$0) {
      $$0.eb().a(ImmutableList.of(cqn.z, cqn.v, cqn.b));
   }

   static class a extends bwz<cjo> {
      a(int $$0, int $$1) {
         super(Map.of(cek.Z, cel.b, cek.m, cel.b, cek.aS, cel.a, cek.aG, cel.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjo $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         return $$1.eb().c(cek.aS).isPresent() && $$1.gv() && !$$1.gC();
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.f);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cek.aG, baf.a, 9600L);
         } else {
            cjp.b($$1);
         }
      }
   }

   static class b extends bwz<cjo> {
      b(int $$0, int $$1) {
         super(Map.of(cek.aT, cel.a), $$0, $$1);
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.b);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.a);
         $$1.eb().b(cek.aT);
      }
   }

   static class c extends bwz<cjo> {
      c(int $$0) {
         super(Map.of(cek.Z, cel.b, cek.m, cel.b, cek.aS, cel.a, cek.aG, cel.a), $$0, $$0);
      }

      protected boolean a(ard $$0, cjo $$1) {
         return true;
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         return $$1.eb().c(cek.aS).isPresent();
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.g);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjo.a.a).x($$3);
         $$1.eb().b(cek.aS);
         $$1.eb().a(cek.aT, true);
      }
   }

   static class d extends bwz<cjo> {
      d(int $$0, int $$1) {
         super(Map.of(cek.Z, cel.b, cek.aS, cel.b, cek.aR, cel.b, cek.aT, cel.b, cek.r, cel.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjo $$1) {
         return !$$1.x();
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.c);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.a);
      }
   }

   static class e extends bwz<cjo> {
      e() {
         super(Map.of(cek.m, cel.a, cek.Z, cel.b, cek.aR, cel.a), 600);
      }

      protected boolean a(ard $$0, cjo $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         if (!$$1.gs()) {
            $$1.a(cjo.a.a);
            return false;
         } else {
            Optional<ji> $$3 = $$1.eb().c(cek.m).map(cen::a).map(byn::b);
            Optional<ji> $$4 = $$1.eb().c(cek.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.e);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         if ($$1.gv() && $$1.gs()) {
            $$1.eb().a(cek.aS, true);
         }

         $$1.eb().b(cek.m);
         $$1.eb().b(cek.aR);
      }
   }

   static class f extends bwz<cjo> {
      f(int $$0, int $$1) {
         super(Map.of(cek.m, cel.b, cek.aR, cel.b, cek.aG, cel.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjo $$1) {
         return !$$1.e_() && $$1.gs();
      }

      protected boolean a(ard $$0, cjo $$1, long $$2) {
         return $$1.gs();
      }

      protected void b(ard $$0, cjo $$1, long $$2) {
         $$1.a(cjo.a.d);
      }

      protected void c(ard $$0, cjo $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjo.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.eb().a(cek.aR, $$1x);
               $$1.eb().a(cek.m, new cen($$1x, 1.25F, 0));
            });
         }
      }
   }
}
