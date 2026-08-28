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

public class cjr {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cft<? extends cfs<? super cjq>>> a = ImmutableList.of(cft.c, cft.f, cft.d, cft.y);
   static final List<cem<?>> b = ImmutableList.of(
      cem.n, cem.m, cem.E, cem.t, cem.Z, cem.aR, cem.aS, cem.aT, cem.aG, cem.aQ, cem.h, cem.r, new cem[]{cem.O, cem.P, cem.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwq> a() {
      return $$0 -> $$0.a(awy.aa);
   }

   protected static bwk<?> a(bwk<cjq> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqp.a));
      $$0.b(cqp.b);
      $$0.f();
      return $$0;
   }

   static cjq b(cjq $$0) {
      $$0.eb().b(cem.aS);
      $$0.eb().b(cem.aR);
      return $$0.a(cjq.a.a);
   }

   private static void b(bwk<cjq> $$0) {
      $$0.a(cqp.a, 0, ImmutableList.of(new bzv(0.8F), new bww<cjq>(2.0F) {
         protected void a(ard $$0, cjq $$1, long $$2) {
            cjr.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byl(500, 700), new bxh(cem.P)));
   }

   private static void c(bwk<cjq> $$0) {
      $$0.a(cqp.v, ImmutableList.of(Pair.of(0, new cjr.e())), Set.of(Pair.of(cem.Z, cen.b), Pair.of(cem.aR, cen.a), Pair.of(cem.m, cen.a)));
   }

   private static void d(bwk<cjq> $$0) {
      $$0.a(
         cqp.z,
         ImmutableList.of(Pair.of(0, new cjr.a(160, 180)), Pair.of(0, new cjr.c(40))),
         Set.of(Pair.of(cem.Z, cen.b), Pair.of(cem.m, cen.b), Pair.of(cem.aS, cen.a))
      );
   }

   private static void e(bwk<cjq> $$0) {
      $$0.a(
         cqp.b,
         ImmutableList.of(
            Pair.of(0, new bwv(but.bi) {
               @Override
               protected void a(ard $$0, cgz $$1, long $$2) {
                  cjr.b((cjq)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxo($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(ard $$0, bvq $$1, long $$2) {
                  cjr.b((cjq)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byh(45, 90)),
            Pair.of(3, new cjr.b(40, 100)),
            Pair.of(
               4,
               new byy(
                  ImmutableList.of(
                     Pair.of(bzi.a(1.0F, 3), 2),
                     Pair.of(new cjr.d(40, 80), 1),
                     Pair.of(new cjr.f(40, 80), 1),
                     Pair.of(bza.a(but.bR, 6.0F), 1),
                     Pair.of(byt.a(1.0F), 1),
                     Pair.of(new bxl(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cem.aS, cen.b))
      );
   }

   static void a(cjq $$0) {
      $$0.eb().a(ImmutableList.of(cqp.z, cqp.v, cqp.b));
   }

   static class a extends bxb<cjq> {
      a(int $$0, int $$1) {
         super(Map.of(cem.Z, cen.b, cem.m, cen.b, cem.aS, cen.a, cem.aG, cen.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjq $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         return $$1.eb().c(cem.aS).isPresent() && $$1.gv() && !$$1.gC();
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.f);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cem.aG, baf.a, 9600L);
         } else {
            cjr.b($$1);
         }
      }
   }

   static class b extends bxb<cjq> {
      b(int $$0, int $$1) {
         super(Map.of(cem.aT, cen.a), $$0, $$1);
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.b);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.a);
         $$1.eb().b(cem.aT);
      }
   }

   static class c extends bxb<cjq> {
      c(int $$0) {
         super(Map.of(cem.Z, cen.b, cem.m, cen.b, cem.aS, cen.a, cem.aG, cen.a), $$0, $$0);
      }

      protected boolean a(ard $$0, cjq $$1) {
         return true;
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         return $$1.eb().c(cem.aS).isPresent();
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.g);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjq.a.a).x($$3);
         $$1.eb().b(cem.aS);
         $$1.eb().a(cem.aT, true);
      }
   }

   static class d extends bxb<cjq> {
      d(int $$0, int $$1) {
         super(Map.of(cem.Z, cen.b, cem.aS, cen.b, cem.aR, cen.b, cem.aT, cen.b, cem.r, cen.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjq $$1) {
         return !$$1.x();
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         return true;
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.c);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.a);
      }
   }

   static class e extends bxb<cjq> {
      e() {
         super(Map.of(cem.m, cen.a, cem.Z, cen.b, cem.aR, cen.a), 600);
      }

      protected boolean a(ard $$0, cjq $$1) {
         return $$1.gs();
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         if (!$$1.gs()) {
            $$1.a(cjq.a.a);
            return false;
         } else {
            Optional<ji> $$3 = $$1.eb().c(cem.m).map(cep::a).map(byp::b);
            Optional<ji> $$4 = $$1.eb().c(cem.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.e);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         if ($$1.gv() && $$1.gs()) {
            $$1.eb().a(cem.aS, true);
         }

         $$1.eb().b(cem.m);
         $$1.eb().b(cem.aR);
      }
   }

   static class f extends bxb<cjq> {
      f(int $$0, int $$1) {
         super(Map.of(cem.m, cen.b, cem.aR, cen.b, cem.aG, cen.b), $$0, $$1);
      }

      protected boolean a(ard $$0, cjq $$1) {
         return !$$1.e_() && $$1.gs();
      }

      protected boolean a(ard $$0, cjq $$1, long $$2) {
         return $$1.gs();
      }

      protected void b(ard $$0, cjq $$1, long $$2) {
         $$1.a(cjq.a.d);
      }

      protected void c(ard $$0, cjq $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjq.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.eb().a(cem.aR, $$1x);
               $$1.eb().a(cem.m, new cep($$1x, 1.25F, 0));
            });
         }
      }
   }
}
