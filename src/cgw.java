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

public class cgw {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<ccz<? extends ccy<? super cgv>>> a = ImmutableList.of(ccz.c, ccz.f, ccz.d, ccz.y);
   static final List<cbs<?>> b = ImmutableList.of(
      cbs.n, cbs.m, cbs.E, cbs.t, cbs.Z, cbs.aR, cbs.aS, cbs.aT, cbs.aG, cbs.aQ, cbs.h, cbs.r, new cbs[]{cbs.O, cbs.P, cbs.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cto> a() {
      return $$0 -> $$0.a(awe.X);
   }

   protected static btq<?> a(btq<cgv> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnl.a));
      $$0.b(cnl.b);
      $$0.f();
      return $$0;
   }

   static cgv b(cgv $$0) {
      $$0.dS().b(cbs.aS);
      $$0.dS().b(cbs.aR);
      return $$0.a(cgv.a.a);
   }

   private static void b(btq<cgv> $$0) {
      $$0.a(cnl.a, 0, ImmutableList.of(new bxb(0.8F), new buc<cgv>(2.0F) {
         protected void a(aqm $$0, cgv $$1, long $$2) {
            cgw.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bvr(500, 700), new bun(cbs.P)));
   }

   private static void c(btq<cgv> $$0) {
      $$0.a(cnl.v, ImmutableList.of(Pair.of(0, new cgw.e())), Set.of(Pair.of(cbs.Z, cbt.b), Pair.of(cbs.aR, cbt.a), Pair.of(cbs.m, cbt.a)));
   }

   private static void d(btq<cgv> $$0) {
      $$0.a(
         cnl.z,
         ImmutableList.of(Pair.of(0, new cgw.a(160, 180)), Pair.of(0, new cgw.c(40))),
         Set.of(Pair.of(cbs.Z, cbt.b), Pair.of(cbs.m, cbt.b), Pair.of(cbs.aS, cbt.a))
      );
   }

   private static void e(btq<cgv> $$0) {
      $$0.a(
         cnl.b,
         ImmutableList.of(
            Pair.of(0, new bub(bsa.aR) {
               @Override
               protected void a(aqm $$0, cee $$1, long $$2) {
                  cgw.b((cgv)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new buu($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqm $$0, bsx $$1, long $$2) {
                  cgw.b((cgv)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bvn(45, 90)),
            Pair.of(3, new cgw.b(40, 100)),
            Pair.of(
               4,
               new bwe(
                  ImmutableList.of(
                     Pair.of(bwo.a(1.0F, 3), 2),
                     Pair.of(new cgw.d(40, 80), 1),
                     Pair.of(new cgw.f(40, 80), 1),
                     Pair.of(bwg.a(bsa.by, 6.0F), 1),
                     Pair.of(bvz.a(1.0F), 1),
                     Pair.of(new bur(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cbs.aS, cbt.b))
      );
   }

   static void a(cgv $$0) {
      $$0.dS().a(ImmutableList.of(cnl.z, cnl.v, cnl.b));
   }

   static class a extends buh<cgv> {
      a(int $$0, int $$1) {
         super(Map.of(cbs.Z, cbt.b, cbs.m, cbt.b, cbs.aS, cbt.a, cbs.aG, cbt.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, cgv $$1) {
         return $$1.gp();
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         return $$1.dS().c(cbs.aS).isPresent() && $$1.gx() && !$$1.gt();
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.f);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(cbs.aG, azf.a, 9600L);
         } else {
            cgw.b($$1);
         }
      }
   }

   static class b extends buh<cgv> {
      b(int $$0, int $$1) {
         super(Map.of(cbs.aT, cbt.a), $$0, $$1);
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.b);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.a);
         $$1.dS().b(cbs.aT);
      }
   }

   static class c extends buh<cgv> {
      c(int $$0) {
         super(Map.of(cbs.Z, cbt.b, cbs.m, cbt.b, cbs.aS, cbt.a, cbs.aG, cbt.a), $$0, $$0);
      }

      protected boolean a(aqm $$0, cgv $$1) {
         return true;
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         return $$1.dS().c(cbs.aS).isPresent();
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.g);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgv.a.a).w($$3);
         $$1.dS().b(cbs.aS);
         $$1.dS().a(cbs.aT, true);
      }
   }

   static class d extends buh<cgv> {
      d(int $$0, int $$1) {
         super(Map.of(cbs.Z, cbt.b, cbs.aS, cbt.b, cbs.aR, cbt.b, cbs.aT, cbt.b, cbs.r, cbt.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, cgv $$1) {
         return !$$1.y();
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.c);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.a);
      }
   }

   static class e extends buh<cgv> {
      e() {
         super(Map.of(cbs.m, cbt.a, cbs.Z, cbt.b, cbs.aR, cbt.a), 600);
      }

      protected boolean a(aqm $$0, cgv $$1) {
         return $$1.gp();
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cgv.a.a);
            return false;
         } else {
            Optional<io> $$3 = $$1.dS().c(cbs.m).map(cbv::a).map(bvv::b);
            Optional<io> $$4 = $$1.dS().c(cbs.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.e);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         if ($$1.gx() && $$1.gp()) {
            $$1.dS().a(cbs.aS, true);
         }

         $$1.dS().b(cbs.m);
         $$1.dS().b(cbs.aR);
      }
   }

   static class f extends buh<cgv> {
      f(int $$0, int $$1) {
         super(Map.of(cbs.m, cbt.b, cbs.aR, cbt.b, cbs.aG, cbt.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, cgv $$1) {
         return !$$1.p_() && $$1.gp();
      }

      protected boolean a(aqm $$0, cgv $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(aqm $$0, cgv $$1, long $$2) {
         $$1.a(cgv.a.d);
      }

      protected void c(aqm $$0, cgv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgv.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.dS().a(cbs.aR, $$1x);
               $$1.dS().a(cbs.m, new cbv($$1x, 1.25F, 0));
            });
         }
      }
   }
}
