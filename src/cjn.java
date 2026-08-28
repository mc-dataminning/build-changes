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

public class cjn {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfp<? extends cfo<? super cjm>>> a = ImmutableList.of(cfp.c, cfp.f, cfp.d, cfp.y);
   static final List<cei<?>> b = ImmutableList.of(
      cei.n, cei.m, cei.E, cei.t, cei.Z, cei.aR, cei.aS, cei.aT, cei.aG, cei.aQ, cei.h, cei.r, new cei[]{cei.O, cei.P, cei.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwf> a() {
      return $$0 -> $$0.a(axm.ab);
   }

   protected static bwg<?> a(bwg<cjm> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqi.a));
      $$0.b(cqi.b);
      $$0.f();
      return $$0;
   }

   static cjm b(cjm $$0) {
      $$0.ee().b(cei.aS);
      $$0.ee().b(cei.aR);
      return $$0.a(cjm.a.a);
   }

   private static void b(bwg<cjm> $$0) {
      $$0.a(cqi.a, 0, ImmutableList.of(new bzr(0.8F), new bws<cjm>(2.0F) {
         protected void a(arq $$0, cjm $$1, long $$2) {
            cjn.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byh(500, 700), new bxd(cei.P)));
   }

   private static void c(bwg<cjm> $$0) {
      $$0.a(cqi.v, ImmutableList.of(Pair.of(0, new cjn.e())), Set.of(Pair.of(cei.Z, cej.b), Pair.of(cei.aR, cej.a), Pair.of(cei.m, cej.a)));
   }

   private static void d(bwg<cjm> $$0) {
      $$0.a(
         cqi.z,
         ImmutableList.of(Pair.of(0, new cjn.a(160, 180)), Pair.of(0, new cjn.c(40))),
         Set.of(Pair.of(cei.Z, cej.b), Pair.of(cei.m, cej.b), Pair.of(cei.aS, cej.a))
      );
   }

   private static void e(bwg<cjm> $$0) {
      $$0.a(
         cqi.b,
         ImmutableList.of(
            Pair.of(0, new bwr(bup.aR) {
               @Override
               protected void a(arq $$0, cgv $$1, long $$2) {
                  cjn.b((cjm)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxk($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arq $$0, bvm $$1, long $$2) {
                  cjn.b((cjm)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byd(45, 90)),
            Pair.of(3, new cjn.b(40, 100)),
            Pair.of(
               4,
               new byu(
                  ImmutableList.of(
                     Pair.of(bze.a(1.0F, 3), 2),
                     Pair.of(new cjn.d(40, 80), 1),
                     Pair.of(new cjn.f(40, 80), 1),
                     Pair.of(byw.a(bup.by, 6.0F), 1),
                     Pair.of(byp.a(1.0F), 1),
                     Pair.of(new bxh(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cei.aS, cej.b))
      );
   }

   static void a(cjm $$0) {
      $$0.ee().a(ImmutableList.of(cqi.z, cqi.v, cqi.b));
   }

   static class a extends bwx<cjm> {
      a(int $$0, int $$1) {
         super(Map.of(cei.Z, cej.b, cei.m, cej.b, cei.aS, cej.a, cei.aG, cej.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cjm $$1) {
         return $$1.gv();
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         return $$1.ee().c(cei.aS).isPresent() && $$1.gy() && !$$1.gF();
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.f);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ee().a(cei.aG, bat.a, 9600L);
         } else {
            cjn.b($$1);
         }
      }
   }

   static class b extends bwx<cjm> {
      b(int $$0, int $$1) {
         super(Map.of(cei.aT, cej.a), $$0, $$1);
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.b);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.a);
         $$1.ee().b(cei.aT);
      }
   }

   static class c extends bwx<cjm> {
      c(int $$0) {
         super(Map.of(cei.Z, cej.b, cei.m, cej.b, cei.aS, cej.a, cei.aG, cej.a), $$0, $$0);
      }

      protected boolean a(arq $$0, cjm $$1) {
         return true;
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         return $$1.ee().c(cei.aS).isPresent();
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.g);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjm.a.a).x($$3);
         $$1.ee().b(cei.aS);
         $$1.ee().a(cei.aT, true);
      }
   }

   static class d extends bwx<cjm> {
      d(int $$0, int $$1) {
         super(Map.of(cei.Z, cej.b, cei.aS, cej.b, cei.aR, cej.b, cei.aT, cej.b, cei.r, cej.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cjm $$1) {
         return !$$1.y();
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.c);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.a);
      }
   }

   static class e extends bwx<cjm> {
      e() {
         super(Map.of(cei.m, cej.a, cei.Z, cej.b, cei.aR, cej.a), 600);
      }

      protected boolean a(arq $$0, cjm $$1) {
         return $$1.gv();
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         if (!$$1.gv()) {
            $$1.a(cjm.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.ee().c(cei.m).map(cel::a).map(byl::b);
            Optional<jh> $$4 = $$1.ee().c(cei.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.e);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         if ($$1.gy() && $$1.gv()) {
            $$1.ee().a(cei.aS, true);
         }

         $$1.ee().b(cei.m);
         $$1.ee().b(cei.aR);
      }
   }

   static class f extends bwx<cjm> {
      f(int $$0, int $$1) {
         super(Map.of(cei.m, cej.b, cei.aR, cej.b, cei.aG, cej.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cjm $$1) {
         return !$$1.p_() && $$1.gv();
      }

      protected boolean a(arq $$0, cjm $$1, long $$2) {
         return $$1.gv();
      }

      protected void b(arq $$0, cjm $$1, long $$2) {
         $$1.a(cjm.a.d);
      }

      protected void c(arq $$0, cjm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjm.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.ee().a(cei.aR, $$1x);
               $$1.ee().a(cei.m, new cel($$1x, 1.25F, 0));
            });
         }
      }
   }
}
