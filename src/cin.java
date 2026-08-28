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

public class cin {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cep<? extends ceo<? super cim>>> a = ImmutableList.of(cep.c, cep.f, cep.d, cep.y);
   static final List<cdi<?>> b = ImmutableList.of(
      cdi.n, cdi.m, cdi.E, cdi.t, cdi.Z, cdi.aR, cdi.aS, cdi.aT, cdi.aG, cdi.aQ, cdi.h, cdi.r, new cdi[]{cdi.O, cdi.P, cdi.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cvl> a() {
      return $$0 -> $$0.a(axb.X);
   }

   protected static bvg<?> a(bvg<cim> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpg.a));
      $$0.b(cpg.b);
      $$0.f();
      return $$0;
   }

   static cim b(cim $$0) {
      $$0.dX().b(cdi.aS);
      $$0.dX().b(cdi.aR);
      return $$0.a(cim.a.a);
   }

   private static void b(bvg<cim> $$0) {
      $$0.a(cpg.a, 0, ImmutableList.of(new byr(0.8F), new bvs<cim>(2.0F) {
         protected void a(arg $$0, cim $$1, long $$2) {
            cin.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bxh(500, 700), new bwd(cdi.P)));
   }

   private static void c(bvg<cim> $$0) {
      $$0.a(cpg.v, ImmutableList.of(Pair.of(0, new cin.e())), Set.of(Pair.of(cdi.Z, cdj.b), Pair.of(cdi.aR, cdj.a), Pair.of(cdi.m, cdj.a)));
   }

   private static void d(bvg<cim> $$0) {
      $$0.a(
         cpg.z,
         ImmutableList.of(Pair.of(0, new cin.a(160, 180)), Pair.of(0, new cin.c(40))),
         Set.of(Pair.of(cdi.Z, cdj.b), Pair.of(cdi.m, cdj.b), Pair.of(cdi.aS, cdj.a))
      );
   }

   private static void e(bvg<cim> $$0) {
      $$0.a(
         cpg.b,
         ImmutableList.of(
            Pair.of(0, new bvr(btq.aR) {
               @Override
               protected void a(arg $$0, cfv $$1, long $$2) {
                  cin.b((cim)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bwk($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(arg $$0, bun $$1, long $$2) {
                  cin.b((cim)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bxd(45, 90)),
            Pair.of(3, new cin.b(40, 100)),
            Pair.of(
               4,
               new bxu(
                  ImmutableList.of(
                     Pair.of(bye.a(1.0F, 3), 2),
                     Pair.of(new cin.d(40, 80), 1),
                     Pair.of(new cin.f(40, 80), 1),
                     Pair.of(bxw.a(btq.by, 6.0F), 1),
                     Pair.of(bxp.a(1.0F), 1),
                     Pair.of(new bwh(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cdi.aS, cdj.b))
      );
   }

   static void a(cim $$0) {
      $$0.dX().a(ImmutableList.of(cpg.z, cpg.v, cpg.b));
   }

   static class a extends bvx<cim> {
      a(int $$0, int $$1) {
         super(Map.of(cdi.Z, cdj.b, cdi.m, cdj.b, cdi.aS, cdj.a, cdi.aG, cdj.b), $$0, $$1);
      }

      protected boolean a(arg $$0, cim $$1) {
         return $$1.go();
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         return $$1.dX().c(cdi.aS).isPresent() && $$1.gr() && !$$1.gy();
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.f);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dX().a(cdi.aG, bah.a, 9600L);
         } else {
            cin.b($$1);
         }
      }
   }

   static class b extends bvx<cim> {
      b(int $$0, int $$1) {
         super(Map.of(cdi.aT, cdj.a), $$0, $$1);
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         return true;
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.b);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.a);
         $$1.dX().b(cdi.aT);
      }
   }

   static class c extends bvx<cim> {
      c(int $$0) {
         super(Map.of(cdi.Z, cdj.b, cdi.m, cdj.b, cdi.aS, cdj.a, cdi.aG, cdj.a), $$0, $$0);
      }

      protected boolean a(arg $$0, cim $$1) {
         return true;
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         return $$1.dX().c(cdi.aS).isPresent();
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.g);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cim.a.a).x($$3);
         $$1.dX().b(cdi.aS);
         $$1.dX().a(cdi.aT, true);
      }
   }

   static class d extends bvx<cim> {
      d(int $$0, int $$1) {
         super(Map.of(cdi.Z, cdj.b, cdi.aS, cdj.b, cdi.aR, cdj.b, cdi.aT, cdj.b, cdi.r, cdj.b), $$0, $$1);
      }

      protected boolean a(arg $$0, cim $$1) {
         return !$$1.y();
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         return true;
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.c);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.a);
      }
   }

   static class e extends bvx<cim> {
      e() {
         super(Map.of(cdi.m, cdj.a, cdi.Z, cdj.b, cdi.aR, cdj.a), 600);
      }

      protected boolean a(arg $$0, cim $$1) {
         return $$1.go();
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         if (!$$1.go()) {
            $$1.a(cim.a.a);
            return false;
         } else {
            Optional<je> $$3 = $$1.dX().c(cdi.m).map(cdl::a).map(bxl::b);
            Optional<je> $$4 = $$1.dX().c(cdi.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.e);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         if ($$1.gr() && $$1.go()) {
            $$1.dX().a(cdi.aS, true);
         }

         $$1.dX().b(cdi.m);
         $$1.dX().b(cdi.aR);
      }
   }

   static class f extends bvx<cim> {
      f(int $$0, int $$1) {
         super(Map.of(cdi.m, cdj.b, cdi.aR, cdj.b, cdi.aG, cdj.b), $$0, $$1);
      }

      protected boolean a(arg $$0, cim $$1) {
         return !$$1.o_() && $$1.go();
      }

      protected boolean a(arg $$0, cim $$1, long $$2) {
         return $$1.go();
      }

      protected void b(arg $$0, cim $$1, long $$2) {
         $$1.a(cim.a.d);
      }

      protected void c(arg $$0, cim $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cim.a.a);
         if ($$3) {
            $$1.gq().ifPresent($$1x -> {
               $$1.dX().a(cdi.aR, $$1x);
               $$1.dX().a(cdi.m, new cdl($$1x, 1.25F, 0));
            });
         }
      }
   }
}
