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
   static final List<cgj<? extends cgi<? super ckj>>> a = ImmutableList.of(cgj.c, cgj.f, cgj.d, cgj.y);
   static final List<cfc<?>> b = ImmutableList.of(
      cfc.n, cfc.m, cfc.E, cfc.t, cfc.Z, cfc.aR, cfc.aS, cfc.aT, cfc.aG, cfc.aQ, cfc.h, cfc.r, new cfc[]{cfc.O, cfc.P, cfc.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxh> a() {
      return $$0 -> $$0.a(awy.aa);
   }

   protected static bxa<?> a(bxa<ckj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cri.a));
      $$0.b(cri.b);
      $$0.f();
      return $$0;
   }

   static ckj b(ckj $$0) {
      $$0.ea().b(cfc.aS);
      $$0.ea().b(cfc.aR);
      return $$0.a(ckj.a.a);
   }

   private static void b(bxa<ckj> $$0) {
      $$0.a(cri.a, 0, ImmutableList.of(new cal(0.8F), new bxm<ckj>(2.0F) {
         protected void a(ard $$0, ckj $$1, long $$2) {
            ckk.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bzb(500, 700), new bxx(cfc.P)));
   }

   private static void c(bxa<ckj> $$0) {
      $$0.a(cri.v, ImmutableList.of(Pair.of(0, new ckk.e())), Set.of(Pair.of(cfc.Z, cfd.b), Pair.of(cfc.aR, cfd.a), Pair.of(cfc.m, cfd.a)));
   }

   private static void d(bxa<ckj> $$0) {
      $$0.a(
         cri.z,
         ImmutableList.of(Pair.of(0, new ckk.a(160, 180)), Pair.of(0, new ckk.c(40))),
         Set.of(Pair.of(cfc.Z, cfd.b), Pair.of(cfc.m, cfd.b), Pair.of(cfc.aS, cfd.a))
      );
   }

   private static void e(bxa<ckj> $$0) {
      $$0.a(
         cri.b,
         ImmutableList.of(
            Pair.of(0, new bxl(bvi.bi) {
               @Override
               protected void a(ard $$0, chp $$1, long $$2) {
                  ckk.b((ckj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bye($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(ard $$0, bwg $$1, long $$2) {
                  ckk.b((ckj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byx(45, 90)),
            Pair.of(3, new ckk.b(40, 100)),
            Pair.of(
               4,
               new bzo(
                  ImmutableList.of(
                     Pair.of(bzy.a(1.0F, 3), 2),
                     Pair.of(new ckk.d(40, 80), 1),
                     Pair.of(new ckk.f(40, 80), 1),
                     Pair.of(bzq.a(bvi.bR, 6.0F), 1),
                     Pair.of(bzj.a(1.0F), 1),
                     Pair.of(new byb(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cfc.aS, cfd.b))
      );
   }

   static void a(ckj $$0) {
      $$0.ea().a(ImmutableList.of(cri.z, cri.v, cri.b));
   }

   static class a extends bxr<ckj> {
      a(int $$0, int $$1) {
         super(Map.of(cfc.Z, cfd.b, cfc.m, cfd.b, cfc.aS, cfd.a, cfc.aG, cfd.b), $$0, $$1);
      }

      protected boolean a(ard $$0, ckj $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         return $$1.ea().c(cfc.aS).isPresent() && $$1.gv() && !$$1.gC();
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.f);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ea().a(cfc.aG, baf.a, 9600L);
         } else {
            ckk.b($$1);
         }
      }
   }

   static class b extends bxr<ckj> {
      b(int $$0, int $$1) {
         super(Map.of(cfc.aT, cfd.a), $$0, $$1);
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.b);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.a);
         $$1.ea().b(cfc.aT);
      }
   }

   static class c extends bxr<ckj> {
      c(int $$0) {
         super(Map.of(cfc.Z, cfd.b, cfc.m, cfd.b, cfc.aS, cfd.a, cfc.aG, cfd.a), $$0, $$0);
      }

      protected boolean a(ard $$0, ckj $$1) {
         return true;
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         return $$1.ea().c(cfc.aS).isPresent();
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.g);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckj.a.a).w($$3);
         $$1.ea().b(cfc.aS);
         $$1.ea().a(cfc.aT, true);
      }
   }

   static class d extends bxr<ckj> {
      d(int $$0, int $$1) {
         super(Map.of(cfc.Z, cfd.b, cfc.aS, cfd.b, cfc.aR, cfd.b, cfc.aT, cfd.b, cfc.r, cfd.b), $$0, $$1);
      }

      protected boolean a(ard $$0, ckj $$1) {
         return !$$1.x();
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.c);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.a);
      }
   }

   static class e extends bxr<ckj> {
      e() {
         super(Map.of(cfc.m, cfd.a, cfc.Z, cfd.b, cfc.aR, cfd.a), 600);
      }

      protected boolean a(ard $$0, ckj $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         if (!$$1.gs()) {
            $$1.a(ckj.a.a);
            return false;
         } else {
            Optional<ji> $$3 = $$1.ea().c(cfc.m).map(cff::a).map(bzf::b);
            Optional<ji> $$4 = $$1.ea().c(cfc.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.e);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         if ($$1.gv() && $$1.gs()) {
            $$1.ea().a(cfc.aS, true);
         }

         $$1.ea().b(cfc.m);
         $$1.ea().b(cfc.aR);
      }
   }

   static class f extends bxr<ckj> {
      f(int $$0, int $$1) {
         super(Map.of(cfc.m, cfd.b, cfc.aR, cfd.b, cfc.aG, cfd.b), $$0, $$1);
      }

      protected boolean a(ard $$0, ckj $$1) {
         return !$$1.n_() && $$1.gs();
      }

      protected boolean a(ard $$0, ckj $$1, long $$2) {
         return $$1.gs();
      }

      protected void b(ard $$0, ckj $$1, long $$2) {
         $$1.a(ckj.a.d);
      }

      protected void c(ard $$0, ckj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckj.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.ea().a(cfc.aR, $$1x);
               $$1.ea().a(cfc.m, new cff($$1x, 1.25F, 0));
            });
         }
      }
   }
}
