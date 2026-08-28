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

public class cis {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<ceu<? extends cet<? super cir>>> a = ImmutableList.of(ceu.c, ceu.f, ceu.d, ceu.y);
   static final List<cdn<?>> b = ImmutableList.of(
      cdn.n, cdn.m, cdn.E, cdn.t, cdn.Z, cdn.aR, cdn.aS, cdn.aT, cdn.aG, cdn.aQ, cdn.h, cdn.r, new cdn[]{cdn.O, cdn.P, cdn.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cvp> a() {
      return $$0 -> $$0.a(axc.X);
   }

   protected static bvl<?> a(bvl<cir> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpm.a));
      $$0.b(cpm.b);
      $$0.f();
      return $$0;
   }

   static cir b(cir $$0) {
      $$0.dX().b(cdn.aS);
      $$0.dX().b(cdn.aR);
      return $$0.a(cir.a.a);
   }

   private static void b(bvl<cir> $$0) {
      $$0.a(cpm.a, 0, ImmutableList.of(new byw(0.8F), new bvx<cir>(2.0F) {
         protected void a(arh $$0, cir $$1, long $$2) {
            cis.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bxm(500, 700), new bwi(cdn.P)));
   }

   private static void c(bvl<cir> $$0) {
      $$0.a(cpm.v, ImmutableList.of(Pair.of(0, new cis.e())), Set.of(Pair.of(cdn.Z, cdo.b), Pair.of(cdn.aR, cdo.a), Pair.of(cdn.m, cdo.a)));
   }

   private static void d(bvl<cir> $$0) {
      $$0.a(
         cpm.z,
         ImmutableList.of(Pair.of(0, new cis.a(160, 180)), Pair.of(0, new cis.c(40))),
         Set.of(Pair.of(cdn.Z, cdo.b), Pair.of(cdn.m, cdo.b), Pair.of(cdn.aS, cdo.a))
      );
   }

   private static void e(bvl<cir> $$0) {
      $$0.a(
         cpm.b,
         ImmutableList.of(
            Pair.of(0, new bvw(btv.aR) {
               @Override
               protected void a(arh $$0, cga $$1, long $$2) {
                  cis.b((cir)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bwp($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(arh $$0, bus $$1, long $$2) {
                  cis.b((cir)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bxi(45, 90)),
            Pair.of(3, new cis.b(40, 100)),
            Pair.of(
               4,
               new bxz(
                  ImmutableList.of(
                     Pair.of(byj.a(1.0F, 3), 2),
                     Pair.of(new cis.d(40, 80), 1),
                     Pair.of(new cis.f(40, 80), 1),
                     Pair.of(byb.a(btv.by, 6.0F), 1),
                     Pair.of(bxu.a(1.0F), 1),
                     Pair.of(new bwm(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cdn.aS, cdo.b))
      );
   }

   static void a(cir $$0) {
      $$0.dX().a(ImmutableList.of(cpm.z, cpm.v, cpm.b));
   }

   static class a extends bwc<cir> {
      a(int $$0, int $$1) {
         super(Map.of(cdn.Z, cdo.b, cdn.m, cdo.b, cdn.aS, cdo.a, cdn.aG, cdo.b), $$0, $$1);
      }

      protected boolean a(arh $$0, cir $$1) {
         return $$1.gp();
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         return $$1.dX().c(cdn.aS).isPresent() && $$1.gs() && !$$1.gz();
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.f);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dX().a(cdn.aG, bai.a, 9600L);
         } else {
            cis.b($$1);
         }
      }
   }

   static class b extends bwc<cir> {
      b(int $$0, int $$1) {
         super(Map.of(cdn.aT, cdo.a), $$0, $$1);
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         return true;
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.b);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.a);
         $$1.dX().b(cdn.aT);
      }
   }

   static class c extends bwc<cir> {
      c(int $$0) {
         super(Map.of(cdn.Z, cdo.b, cdn.m, cdo.b, cdn.aS, cdo.a, cdn.aG, cdo.a), $$0, $$0);
      }

      protected boolean a(arh $$0, cir $$1) {
         return true;
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         return $$1.dX().c(cdn.aS).isPresent();
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.g);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cir.a.a).x($$3);
         $$1.dX().b(cdn.aS);
         $$1.dX().a(cdn.aT, true);
      }
   }

   static class d extends bwc<cir> {
      d(int $$0, int $$1) {
         super(Map.of(cdn.Z, cdo.b, cdn.aS, cdo.b, cdn.aR, cdo.b, cdn.aT, cdo.b, cdn.r, cdo.b), $$0, $$1);
      }

      protected boolean a(arh $$0, cir $$1) {
         return !$$1.y();
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         return true;
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.c);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.a);
      }
   }

   static class e extends bwc<cir> {
      e() {
         super(Map.of(cdn.m, cdo.a, cdn.Z, cdo.b, cdn.aR, cdo.a), 600);
      }

      protected boolean a(arh $$0, cir $$1) {
         return $$1.gp();
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cir.a.a);
            return false;
         } else {
            Optional<je> $$3 = $$1.dX().c(cdn.m).map(cdq::a).map(bxq::b);
            Optional<je> $$4 = $$1.dX().c(cdn.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.e);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         if ($$1.gs() && $$1.gp()) {
            $$1.dX().a(cdn.aS, true);
         }

         $$1.dX().b(cdn.m);
         $$1.dX().b(cdn.aR);
      }
   }

   static class f extends bwc<cir> {
      f(int $$0, int $$1) {
         super(Map.of(cdn.m, cdo.b, cdn.aR, cdo.b, cdn.aG, cdo.b), $$0, $$1);
      }

      protected boolean a(arh $$0, cir $$1) {
         return !$$1.o_() && $$1.gp();
      }

      protected boolean a(arh $$0, cir $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(arh $$0, cir $$1, long $$2) {
         $$1.a(cir.a.d);
      }

      protected void c(arh $$0, cir $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cir.a.a);
         if ($$3) {
            $$1.gr().ifPresent($$1x -> {
               $$1.dX().a(cdn.aR, $$1x);
               $$1.dX().a(cdn.m, new cdq($$1x, 1.25F, 0));
            });
         }
      }
   }
}
