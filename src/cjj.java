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

public class cjj {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfl<? extends cfk<? super cji>>> a = ImmutableList.of(cfl.c, cfl.f, cfl.d, cfl.y);
   static final List<cee<?>> b = ImmutableList.of(
      cee.n, cee.m, cee.E, cee.t, cee.Z, cee.aR, cee.aS, cee.aT, cee.aG, cee.aQ, cee.h, cee.r, new cee[]{cee.O, cee.P, cee.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwb> a() {
      return $$0 -> $$0.a(axj.aa);
   }

   protected static bwc<?> a(bwc<cji> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   static cji b(cji $$0) {
      $$0.ed().b(cee.aS);
      $$0.ed().b(cee.aR);
      return $$0.a(cji.a.a);
   }

   private static void b(bwc<cji> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new bwo<cji>(2.0F) {
         protected void a(arn $$0, cji $$1, long $$2) {
            cjj.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byd(500, 700), new bwz(cee.P)));
   }

   private static void c(bwc<cji> $$0) {
      $$0.a(cqe.v, ImmutableList.of(Pair.of(0, new cjj.e())), Set.of(Pair.of(cee.Z, cef.b), Pair.of(cee.aR, cef.a), Pair.of(cee.m, cef.a)));
   }

   private static void d(bwc<cji> $$0) {
      $$0.a(
         cqe.z,
         ImmutableList.of(Pair.of(0, new cjj.a(160, 180)), Pair.of(0, new cjj.c(40))),
         Set.of(Pair.of(cee.Z, cef.b), Pair.of(cee.m, cef.b), Pair.of(cee.aS, cef.a))
      );
   }

   private static void e(bwc<cji> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, new bwn(bul.aR) {
               @Override
               protected void a(arn $$0, cgr $$1, long $$2) {
                  cjj.b((cji)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxg($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arn $$0, bvi $$1, long $$2) {
                  cjj.b((cji)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bxz(45, 90)),
            Pair.of(3, new cjj.b(40, 100)),
            Pair.of(
               4,
               new byq(
                  ImmutableList.of(
                     Pair.of(bza.a(1.0F, 3), 2),
                     Pair.of(new cjj.d(40, 80), 1),
                     Pair.of(new cjj.f(40, 80), 1),
                     Pair.of(bys.a(bul.by, 6.0F), 1),
                     Pair.of(byl.a(1.0F), 1),
                     Pair.of(new bxd(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cee.aS, cef.b))
      );
   }

   static void a(cji $$0) {
      $$0.ed().a(ImmutableList.of(cqe.z, cqe.v, cqe.b));
   }

   static class a extends bwt<cji> {
      a(int $$0, int $$1) {
         super(Map.of(cee.Z, cef.b, cee.m, cef.b, cee.aS, cef.a, cee.aG, cef.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cji $$1) {
         return $$1.gu();
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         return $$1.ed().c(cee.aS).isPresent() && $$1.gx() && !$$1.gE();
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.f);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ed().a(cee.aG, bap.a, 9600L);
         } else {
            cjj.b($$1);
         }
      }
   }

   static class b extends bwt<cji> {
      b(int $$0, int $$1) {
         super(Map.of(cee.aT, cef.a), $$0, $$1);
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         return true;
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.b);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.a);
         $$1.ed().b(cee.aT);
      }
   }

   static class c extends bwt<cji> {
      c(int $$0) {
         super(Map.of(cee.Z, cef.b, cee.m, cef.b, cee.aS, cef.a, cee.aG, cef.a), $$0, $$0);
      }

      protected boolean a(arn $$0, cji $$1) {
         return true;
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         return $$1.ed().c(cee.aS).isPresent();
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.g);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cji.a.a).x($$3);
         $$1.ed().b(cee.aS);
         $$1.ed().a(cee.aT, true);
      }
   }

   static class d extends bwt<cji> {
      d(int $$0, int $$1) {
         super(Map.of(cee.Z, cef.b, cee.aS, cef.b, cee.aR, cef.b, cee.aT, cef.b, cee.r, cef.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cji $$1) {
         return !$$1.y();
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         return true;
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.c);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.a);
      }
   }

   static class e extends bwt<cji> {
      e() {
         super(Map.of(cee.m, cef.a, cee.Z, cef.b, cee.aR, cef.a), 600);
      }

      protected boolean a(arn $$0, cji $$1) {
         return $$1.gu();
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         if (!$$1.gu()) {
            $$1.a(cji.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.ed().c(cee.m).map(ceh::a).map(byh::b);
            Optional<jh> $$4 = $$1.ed().c(cee.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.e);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         if ($$1.gx() && $$1.gu()) {
            $$1.ed().a(cee.aS, true);
         }

         $$1.ed().b(cee.m);
         $$1.ed().b(cee.aR);
      }
   }

   static class f extends bwt<cji> {
      f(int $$0, int $$1) {
         super(Map.of(cee.m, cef.b, cee.aR, cef.b, cee.aG, cef.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cji $$1) {
         return !$$1.p_() && $$1.gu();
      }

      protected boolean a(arn $$0, cji $$1, long $$2) {
         return $$1.gu();
      }

      protected void b(arn $$0, cji $$1, long $$2) {
         $$1.a(cji.a.d);
      }

      protected void c(arn $$0, cji $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cji.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.ed().a(cee.aR, $$1x);
               $$1.ed().a(cee.m, new ceh($$1x, 1.25F, 0));
            });
         }
      }
   }
}
