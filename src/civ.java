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

public class civ {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cex<? extends cew<? super ciu>>> a = ImmutableList.of(cex.c, cex.f, cex.d, cex.y);
   static final List<cdq<?>> b = ImmutableList.of(
      cdq.n, cdq.m, cdq.E, cdq.t, cdq.Z, cdq.aR, cdq.aS, cdq.aT, cdq.aG, cdq.aQ, cdq.h, cdq.r, new cdq[]{cdq.O, cdq.P, cdq.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cvs> a() {
      return $$0 -> $$0.a(axe.X);
   }

   protected static bvo<?> a(bvo<ciu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpp.a));
      $$0.b(cpp.b);
      $$0.f();
      return $$0;
   }

   static ciu b(ciu $$0) {
      $$0.dY().b(cdq.aS);
      $$0.dY().b(cdq.aR);
      return $$0.a(ciu.a.a);
   }

   private static void b(bvo<ciu> $$0) {
      $$0.a(cpp.a, 0, ImmutableList.of(new byz(0.8F), new bwa<ciu>(2.0F) {
         protected void a(arj $$0, ciu $$1, long $$2) {
            civ.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bxp(500, 700), new bwl(cdq.P)));
   }

   private static void c(bvo<ciu> $$0) {
      $$0.a(cpp.v, ImmutableList.of(Pair.of(0, new civ.e())), Set.of(Pair.of(cdq.Z, cdr.b), Pair.of(cdq.aR, cdr.a), Pair.of(cdq.m, cdr.a)));
   }

   private static void d(bvo<ciu> $$0) {
      $$0.a(
         cpp.z,
         ImmutableList.of(Pair.of(0, new civ.a(160, 180)), Pair.of(0, new civ.c(40))),
         Set.of(Pair.of(cdq.Z, cdr.b), Pair.of(cdq.m, cdr.b), Pair.of(cdq.aS, cdr.a))
      );
   }

   private static void e(bvo<ciu> $$0) {
      $$0.a(
         cpp.b,
         ImmutableList.of(
            Pair.of(0, new bvz(bty.aR) {
               @Override
               protected void a(arj $$0, cgd $$1, long $$2) {
                  civ.b((ciu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bws($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arj $$0, buv $$1, long $$2) {
                  civ.b((ciu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bxl(45, 90)),
            Pair.of(3, new civ.b(40, 100)),
            Pair.of(
               4,
               new byc(
                  ImmutableList.of(
                     Pair.of(bym.a(1.0F, 3), 2),
                     Pair.of(new civ.d(40, 80), 1),
                     Pair.of(new civ.f(40, 80), 1),
                     Pair.of(bye.a(bty.by, 6.0F), 1),
                     Pair.of(bxx.a(1.0F), 1),
                     Pair.of(new bwp(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cdq.aS, cdr.b))
      );
   }

   static void a(ciu $$0) {
      $$0.dY().a(ImmutableList.of(cpp.z, cpp.v, cpp.b));
   }

   static class a extends bwf<ciu> {
      a(int $$0, int $$1) {
         super(Map.of(cdq.Z, cdr.b, cdq.m, cdr.b, cdq.aS, cdr.a, cdq.aG, cdr.b), $$0, $$1);
      }

      protected boolean a(arj $$0, ciu $$1) {
         return $$1.go();
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         return $$1.dY().c(cdq.aS).isPresent() && $$1.gr() && !$$1.gy();
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.f);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dY().a(cdq.aG, bak.a, 9600L);
         } else {
            civ.b($$1);
         }
      }
   }

   static class b extends bwf<ciu> {
      b(int $$0, int $$1) {
         super(Map.of(cdq.aT, cdr.a), $$0, $$1);
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         return true;
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.b);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.a);
         $$1.dY().b(cdq.aT);
      }
   }

   static class c extends bwf<ciu> {
      c(int $$0) {
         super(Map.of(cdq.Z, cdr.b, cdq.m, cdr.b, cdq.aS, cdr.a, cdq.aG, cdr.a), $$0, $$0);
      }

      protected boolean a(arj $$0, ciu $$1) {
         return true;
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         return $$1.dY().c(cdq.aS).isPresent();
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.g);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ciu.a.a).x($$3);
         $$1.dY().b(cdq.aS);
         $$1.dY().a(cdq.aT, true);
      }
   }

   static class d extends bwf<ciu> {
      d(int $$0, int $$1) {
         super(Map.of(cdq.Z, cdr.b, cdq.aS, cdr.b, cdq.aR, cdr.b, cdq.aT, cdr.b, cdq.r, cdr.b), $$0, $$1);
      }

      protected boolean a(arj $$0, ciu $$1) {
         return !$$1.y();
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         return true;
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.c);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.a);
      }
   }

   static class e extends bwf<ciu> {
      e() {
         super(Map.of(cdq.m, cdr.a, cdq.Z, cdr.b, cdq.aR, cdr.a), 600);
      }

      protected boolean a(arj $$0, ciu $$1) {
         return $$1.go();
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         if (!$$1.go()) {
            $$1.a(ciu.a.a);
            return false;
         } else {
            Optional<jf> $$3 = $$1.dY().c(cdq.m).map(cdt::a).map(bxt::b);
            Optional<jf> $$4 = $$1.dY().c(cdq.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.e);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         if ($$1.gr() && $$1.go()) {
            $$1.dY().a(cdq.aS, true);
         }

         $$1.dY().b(cdq.m);
         $$1.dY().b(cdq.aR);
      }
   }

   static class f extends bwf<ciu> {
      f(int $$0, int $$1) {
         super(Map.of(cdq.m, cdr.b, cdq.aR, cdr.b, cdq.aG, cdr.b), $$0, $$1);
      }

      protected boolean a(arj $$0, ciu $$1) {
         return !$$1.p_() && $$1.go();
      }

      protected boolean a(arj $$0, ciu $$1, long $$2) {
         return $$1.go();
      }

      protected void b(arj $$0, ciu $$1, long $$2) {
         $$1.a(ciu.a.d);
      }

      protected void c(arj $$0, ciu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ciu.a.a);
         if ($$3) {
            $$1.gq().ifPresent($$1x -> {
               $$1.dY().a(cdq.aR, $$1x);
               $$1.dY().a(cdq.m, new cdt($$1x, 1.25F, 0));
            });
         }
      }
   }
}
