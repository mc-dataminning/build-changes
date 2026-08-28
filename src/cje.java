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

public class cje {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfg<? extends cff<? super cjd>>> a = ImmutableList.of(cfg.c, cfg.f, cfg.d, cfg.y);
   static final List<cdz<?>> b = ImmutableList.of(
      cdz.n, cdz.m, cdz.E, cdz.t, cdz.Z, cdz.aR, cdz.aS, cdz.aT, cdz.aG, cdz.aQ, cdz.h, cdz.r, new cdz[]{cdz.O, cdz.P, cdz.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cvx> a() {
      return $$0 -> $$0.a(axi.Y);
   }

   protected static bvx<?> a(bvx<cjd> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cpz.a));
      $$0.b(cpz.b);
      $$0.f();
      return $$0;
   }

   static cjd b(cjd $$0) {
      $$0.ed().b(cdz.aS);
      $$0.ed().b(cdz.aR);
      return $$0.a(cjd.a.a);
   }

   private static void b(bvx<cjd> $$0) {
      $$0.a(cpz.a, 0, ImmutableList.of(new bzi(0.8F), new bwj<cjd>(2.0F) {
         protected void a(arm $$0, cjd $$1, long $$2) {
            cje.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bxy(500, 700), new bwu(cdz.P)));
   }

   private static void c(bvx<cjd> $$0) {
      $$0.a(cpz.v, ImmutableList.of(Pair.of(0, new cje.e())), Set.of(Pair.of(cdz.Z, cea.b), Pair.of(cdz.aR, cea.a), Pair.of(cdz.m, cea.a)));
   }

   private static void d(bvx<cjd> $$0) {
      $$0.a(
         cpz.z,
         ImmutableList.of(Pair.of(0, new cje.a(160, 180)), Pair.of(0, new cje.c(40))),
         Set.of(Pair.of(cdz.Z, cea.b), Pair.of(cdz.m, cea.b), Pair.of(cdz.aS, cea.a))
      );
   }

   private static void e(bvx<cjd> $$0) {
      $$0.a(
         cpz.b,
         ImmutableList.of(
            Pair.of(0, new bwi(bug.aR) {
               @Override
               protected void a(arm $$0, cgm $$1, long $$2) {
                  cje.b((cjd)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxb($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arm $$0, bvd $$1, long $$2) {
                  cje.b((cjd)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bxu(45, 90)),
            Pair.of(3, new cje.b(40, 100)),
            Pair.of(
               4,
               new byl(
                  ImmutableList.of(
                     Pair.of(byv.a(1.0F, 3), 2),
                     Pair.of(new cje.d(40, 80), 1),
                     Pair.of(new cje.f(40, 80), 1),
                     Pair.of(byn.a(bug.by, 6.0F), 1),
                     Pair.of(byg.a(1.0F), 1),
                     Pair.of(new bwy(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cdz.aS, cea.b))
      );
   }

   static void a(cjd $$0) {
      $$0.ed().a(ImmutableList.of(cpz.z, cpz.v, cpz.b));
   }

   static class a extends bwo<cjd> {
      a(int $$0, int $$1) {
         super(Map.of(cdz.Z, cea.b, cdz.m, cea.b, cdz.aS, cea.a, cdz.aG, cea.b), $$0, $$1);
      }

      protected boolean a(arm $$0, cjd $$1) {
         return $$1.gv();
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         return $$1.ed().c(cdz.aS).isPresent() && $$1.gy() && !$$1.gF();
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.f);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ed().a(cdz.aG, bao.a, 9600L);
         } else {
            cje.b($$1);
         }
      }
   }

   static class b extends bwo<cjd> {
      b(int $$0, int $$1) {
         super(Map.of(cdz.aT, cea.a), $$0, $$1);
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         return true;
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.b);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.a);
         $$1.ed().b(cdz.aT);
      }
   }

   static class c extends bwo<cjd> {
      c(int $$0) {
         super(Map.of(cdz.Z, cea.b, cdz.m, cea.b, cdz.aS, cea.a, cdz.aG, cea.a), $$0, $$0);
      }

      protected boolean a(arm $$0, cjd $$1) {
         return true;
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         return $$1.ed().c(cdz.aS).isPresent();
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.g);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjd.a.a).x($$3);
         $$1.ed().b(cdz.aS);
         $$1.ed().a(cdz.aT, true);
      }
   }

   static class d extends bwo<cjd> {
      d(int $$0, int $$1) {
         super(Map.of(cdz.Z, cea.b, cdz.aS, cea.b, cdz.aR, cea.b, cdz.aT, cea.b, cdz.r, cea.b), $$0, $$1);
      }

      protected boolean a(arm $$0, cjd $$1) {
         return !$$1.y();
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         return true;
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.c);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.a);
      }
   }

   static class e extends bwo<cjd> {
      e() {
         super(Map.of(cdz.m, cea.a, cdz.Z, cea.b, cdz.aR, cea.a), 600);
      }

      protected boolean a(arm $$0, cjd $$1) {
         return $$1.gv();
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         if (!$$1.gv()) {
            $$1.a(cjd.a.a);
            return false;
         } else {
            Optional<jg> $$3 = $$1.ed().c(cdz.m).map(cec::a).map(byc::b);
            Optional<jg> $$4 = $$1.ed().c(cdz.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.e);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         if ($$1.gy() && $$1.gv()) {
            $$1.ed().a(cdz.aS, true);
         }

         $$1.ed().b(cdz.m);
         $$1.ed().b(cdz.aR);
      }
   }

   static class f extends bwo<cjd> {
      f(int $$0, int $$1) {
         super(Map.of(cdz.m, cea.b, cdz.aR, cea.b, cdz.aG, cea.b), $$0, $$1);
      }

      protected boolean a(arm $$0, cjd $$1) {
         return !$$1.p_() && $$1.gv();
      }

      protected boolean a(arm $$0, cjd $$1, long $$2) {
         return $$1.gv();
      }

      protected void b(arm $$0, cjd $$1, long $$2) {
         $$1.a(cjd.a.d);
      }

      protected void c(arm $$0, cjd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjd.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.ed().a(cdz.aR, $$1x);
               $$1.ed().a(cdz.m, new cec($$1x, 1.25F, 0));
            });
         }
      }
   }
}
