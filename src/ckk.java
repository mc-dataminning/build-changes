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

public class ckk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cgm<? extends cgl<? super ckj>>> a = ImmutableList.of(cgm.c, cgm.f, cgm.d, cgm.y);
   static final List<cff<?>> b = ImmutableList.of(
      cff.n, cff.m, cff.E, cff.t, cff.Z, cff.aR, cff.aS, cff.aT, cff.aG, cff.aQ, cff.h, cff.r, new cff[]{cff.O, cff.P, cff.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxk> a() {
      return $$0 -> $$0.a(ayd.ac);
   }

   protected static bxd<?> a(bxd<ckj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crj.a));
      $$0.b(crj.b);
      $$0.f();
      return $$0;
   }

   static ckj b(ckj $$0) {
      $$0.eb().b(cff.aS);
      $$0.eb().b(cff.aR);
      return $$0.a(ckj.a.a);
   }

   private static void b(bxd<ckj> $$0) {
      $$0.a(crj.a, 0, ImmutableList.of(new cao(0.8F), new bxp<ckj>(2.0F) {
         protected void a(ash $$0, ckj $$1, long $$2) {
            ckk.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bze(500, 700), new bya(cff.P)));
   }

   private static void c(bxd<ckj> $$0) {
      $$0.a(crj.v, ImmutableList.of(Pair.of(0, new ckk.e())), Set.of(Pair.of(cff.Z, cfg.b), Pair.of(cff.aR, cfg.a), Pair.of(cff.m, cfg.a)));
   }

   private static void d(bxd<ckj> $$0) {
      $$0.a(
         crj.z,
         ImmutableList.of(Pair.of(0, new ckk.a(160, 180)), Pair.of(0, new ckk.c(40))),
         Set.of(Pair.of(cff.Z, cfg.b), Pair.of(cff.m, cfg.b), Pair.of(cff.aS, cfg.a))
      );
   }

   private static void e(bxd<ckj> $$0) {
      $$0.a(
         crj.b,
         ImmutableList.of(
            Pair.of(0, new bxo(bvm.bj) {
               @Override
               protected void a(ash $$0, chs $$1, long $$2) {
                  ckk.b((ckj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new byh($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(ash $$0, bwj $$1, long $$2) {
                  ckk.b((ckj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bza(45, 90)),
            Pair.of(3, new ckk.b(40, 100)),
            Pair.of(
               4,
               new bzr(
                  ImmutableList.of(
                     Pair.of(cab.a(1.0F, 3), 2),
                     Pair.of(new ckk.d(40, 80), 1),
                     Pair.of(new ckk.f(40, 80), 1),
                     Pair.of(bzt.a(bvm.bS, 6.0F), 1),
                     Pair.of(bzm.a(1.0F), 1),
                     Pair.of(new bye(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cff.aS, cfg.b))
      );
   }

   static void a(ckj $$0) {
      $$0.eb().a(ImmutableList.of(crj.z, crj.v, crj.b));
   }

   static class a extends bxu<ckj> {
      a(int $$0, int $$1) {
         super(Map.of(cff.Z, cfg.b, cff.m, cfg.b, cff.aS, cfg.a, cff.aG, cfg.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckj $$1) {
         return $$1.gm();
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         return $$1.eb().c(cff.aS).isPresent() && $$1.gp() && !$$1.gw();
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.f);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cff.aG, bbk.a, 9600L);
         } else {
            ckk.b($$1);
         }
      }
   }

   static class b extends bxu<ckj> {
      b(int $$0, int $$1) {
         super(Map.of(cff.aT, cfg.a), $$0, $$1);
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.b);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.a);
         $$1.eb().b(cff.aT);
      }
   }

   static class c extends bxu<ckj> {
      c(int $$0) {
         super(Map.of(cff.Z, cfg.b, cff.m, cfg.b, cff.aS, cfg.a, cff.aG, cfg.a), $$0, $$0);
      }

      protected boolean a(ash $$0, ckj $$1) {
         return true;
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         return $$1.eb().c(cff.aS).isPresent();
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.g);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckj.a.a).x($$3);
         $$1.eb().b(cff.aS);
         $$1.eb().a(cff.aT, true);
      }
   }

   static class d extends bxu<ckj> {
      d(int $$0, int $$1) {
         super(Map.of(cff.Z, cfg.b, cff.aS, cfg.b, cff.aR, cfg.b, cff.aT, cfg.b, cff.r, cfg.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckj $$1) {
         return !$$1.x();
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.c);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.a);
      }
   }

   static class e extends bxu<ckj> {
      e() {
         super(Map.of(cff.m, cfg.a, cff.Z, cfg.b, cff.aR, cfg.a), 600);
      }

      protected boolean a(ash $$0, ckj $$1) {
         return $$1.gm();
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         if (!$$1.gm()) {
            $$1.a(ckj.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.eb().c(cff.m).map(cfi::a).map(bzi::b);
            Optional<jh> $$4 = $$1.eb().c(cff.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.e);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         if ($$1.gp() && $$1.gm()) {
            $$1.eb().a(cff.aS, true);
         }

         $$1.eb().b(cff.m);
         $$1.eb().b(cff.aR);
      }
   }

   static class f extends bxu<ckj> {
      f(int $$0, int $$1) {
         super(Map.of(cff.m, cfg.b, cff.aR, cfg.b, cff.aG, cfg.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckj $$1) {
         return !$$1.e_() && $$1.gm();
      }

      protected boolean a(ash $$0, ckj $$1, long $$2) {
         return $$1.gm();
      }

      protected void b(ash $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.d);
      }

      protected void c(ash $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckj.a.a);
         if ($$3) {
            $$1.go().ifPresent($$1x -> {
               $$1.eb().a(cff.aR, $$1x);
               $$1.eb().a(cff.m, new cfi($$1x, 1.25F, 0));
            });
         }
      }
   }
}
