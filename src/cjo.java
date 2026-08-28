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

public class cjo {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfq<? extends cfp<? super cjn>>> a = ImmutableList.of(cfq.c, cfq.f, cfq.d, cfq.y);
   static final List<cej<?>> b = ImmutableList.of(
      cej.n, cej.m, cej.E, cej.t, cej.Z, cej.aR, cej.aS, cej.aT, cej.aG, cej.aQ, cej.h, cej.r, new cej[]{cej.O, cej.P, cej.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwn> a() {
      return $$0 -> $$0.a(awx.aa);
   }

   protected static bwh<?> a(bwh<cjn> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqm.a));
      $$0.b(cqm.b);
      $$0.f();
      return $$0;
   }

   static cjn b(cjn $$0) {
      $$0.ec().b(cej.aS);
      $$0.ec().b(cej.aR);
      return $$0.a(cjn.a.a);
   }

   private static void b(bwh<cjn> $$0) {
      $$0.a(cqm.a, 0, ImmutableList.of(new bzs(0.8F), new bwt<cjn>(2.0F) {
         protected void a(arc $$0, cjn $$1, long $$2) {
            cjo.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byi(500, 700), new bxe(cej.P)));
   }

   private static void c(bwh<cjn> $$0) {
      $$0.a(cqm.v, ImmutableList.of(Pair.of(0, new cjo.e())), Set.of(Pair.of(cej.Z, cek.b), Pair.of(cej.aR, cek.a), Pair.of(cej.m, cek.a)));
   }

   private static void d(bwh<cjn> $$0) {
      $$0.a(
         cqm.z,
         ImmutableList.of(Pair.of(0, new cjo.a(160, 180)), Pair.of(0, new cjo.c(40))),
         Set.of(Pair.of(cej.Z, cek.b), Pair.of(cej.m, cek.b), Pair.of(cej.aS, cek.a))
      );
   }

   private static void e(bwh<cjn> $$0) {
      $$0.a(
         cqm.b,
         ImmutableList.of(
            Pair.of(0, new bws(buq.bi) {
               @Override
               protected void a(arc $$0, cgw $$1, long $$2) {
                  cjo.b((cjn)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxl($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(arc $$0, bvn $$1, long $$2) {
                  cjo.b((cjn)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bye(45, 90)),
            Pair.of(3, new cjo.b(40, 100)),
            Pair.of(
               4,
               new byv(
                  ImmutableList.of(
                     Pair.of(bzf.a(1.0F, 3), 2),
                     Pair.of(new cjo.d(40, 80), 1),
                     Pair.of(new cjo.f(40, 80), 1),
                     Pair.of(byx.a(buq.bR, 6.0F), 1),
                     Pair.of(byq.a(1.0F), 1),
                     Pair.of(new bxi(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cej.aS, cek.b))
      );
   }

   static void a(cjn $$0) {
      $$0.ec().a(ImmutableList.of(cqm.z, cqm.v, cqm.b));
   }

   static class a extends bwy<cjn> {
      a(int $$0, int $$1) {
         super(Map.of(cej.Z, cek.b, cej.m, cek.b, cej.aS, cek.a, cej.aG, cek.b), $$0, $$1);
      }

      protected boolean a(arc $$0, cjn $$1) {
         return $$1.gp();
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         return $$1.ec().c(cej.aS).isPresent() && $$1.gs() && !$$1.gz();
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.f);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cej.aG, bae.a, 9600L);
         } else {
            cjo.b($$1);
         }
      }
   }

   static class b extends bwy<cjn> {
      b(int $$0, int $$1) {
         super(Map.of(cej.aT, cek.a), $$0, $$1);
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         return true;
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.b);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.a);
         $$1.ec().b(cej.aT);
      }
   }

   static class c extends bwy<cjn> {
      c(int $$0) {
         super(Map.of(cej.Z, cek.b, cej.m, cek.b, cej.aS, cek.a, cej.aG, cek.a), $$0, $$0);
      }

      protected boolean a(arc $$0, cjn $$1) {
         return true;
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         return $$1.ec().c(cej.aS).isPresent();
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.g);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjn.a.a).x($$3);
         $$1.ec().b(cej.aS);
         $$1.ec().a(cej.aT, true);
      }
   }

   static class d extends bwy<cjn> {
      d(int $$0, int $$1) {
         super(Map.of(cej.Z, cek.b, cej.aS, cek.b, cej.aR, cek.b, cej.aT, cek.b, cej.r, cek.b), $$0, $$1);
      }

      protected boolean a(arc $$0, cjn $$1) {
         return !$$1.x();
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         return true;
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.c);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.a);
      }
   }

   static class e extends bwy<cjn> {
      e() {
         super(Map.of(cej.m, cek.a, cej.Z, cek.b, cej.aR, cek.a), 600);
      }

      protected boolean a(arc $$0, cjn $$1) {
         return $$1.gp();
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cjn.a.a);
            return false;
         } else {
            Optional<ji> $$3 = $$1.ec().c(cej.m).map(cem::a).map(bym::b);
            Optional<ji> $$4 = $$1.ec().c(cej.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.e);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         if ($$1.gs() && $$1.gp()) {
            $$1.ec().a(cej.aS, true);
         }

         $$1.ec().b(cej.m);
         $$1.ec().b(cej.aR);
      }
   }

   static class f extends bwy<cjn> {
      f(int $$0, int $$1) {
         super(Map.of(cej.m, cek.b, cej.aR, cek.b, cej.aG, cek.b), $$0, $$1);
      }

      protected boolean a(arc $$0, cjn $$1) {
         return !$$1.e_() && $$1.gp();
      }

      protected boolean a(arc $$0, cjn $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(arc $$0, cjn $$1, long $$2) {
         $$1.a(cjn.a.d);
      }

      protected void c(arc $$0, cjn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjn.a.a);
         if ($$3) {
            $$1.gr().ifPresent($$1x -> {
               $$1.ec().a(cej.aR, $$1x);
               $$1.ec().a(cej.m, new cem($$1x, 1.25F, 0));
            });
         }
      }
   }
}
