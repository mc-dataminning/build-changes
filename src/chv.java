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

public class chv {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdy<? extends cdx<? super chu>>> a = ImmutableList.of(cdy.c, cdy.f, cdy.d, cdy.y);
   static final List<ccr<?>> b = ImmutableList.of(
      ccr.n, ccr.m, ccr.E, ccr.t, ccr.Z, ccr.aR, ccr.aS, ccr.aT, ccr.aG, ccr.aQ, ccr.h, ccr.r, new ccr[]{ccr.O, ccr.P, ccr.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cun> a() {
      return $$0 -> $$0.a(awx.X);
   }

   protected static bup<?> a(bup<chu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cok.a));
      $$0.b(cok.b);
      $$0.f();
      return $$0;
   }

   static chu b(chu $$0) {
      $$0.dS().b(ccr.aS);
      $$0.dS().b(ccr.aR);
      return $$0.a(chu.a.a);
   }

   private static void b(bup<chu> $$0) {
      $$0.a(cok.a, 0, ImmutableList.of(new bya(0.8F), new bvb<chu>(2.0F) {
         protected void a(are $$0, chu $$1, long $$2) {
            chv.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwq(500, 700), new bvm(ccr.P)));
   }

   private static void c(bup<chu> $$0) {
      $$0.a(cok.v, ImmutableList.of(Pair.of(0, new chv.e())), Set.of(Pair.of(ccr.Z, ccs.b), Pair.of(ccr.aR, ccs.a), Pair.of(ccr.m, ccs.a)));
   }

   private static void d(bup<chu> $$0) {
      $$0.a(
         cok.z,
         ImmutableList.of(Pair.of(0, new chv.a(160, 180)), Pair.of(0, new chv.c(40))),
         Set.of(Pair.of(ccr.Z, ccs.b), Pair.of(ccr.m, ccs.b), Pair.of(ccr.aS, ccs.a))
      );
   }

   private static void e(bup<chu> $$0) {
      $$0.a(
         cok.b,
         ImmutableList.of(
            Pair.of(0, new bva(bsy.aR) {
               @Override
               protected void a(are $$0, cfd $$1, long $$2) {
                  chv.b((chu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvt($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(are $$0, btw $$1, long $$2) {
                  chv.b((chu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwm(45, 90)),
            Pair.of(3, new chv.b(40, 100)),
            Pair.of(
               4,
               new bxd(
                  ImmutableList.of(
                     Pair.of(bxn.a(1.0F, 3), 2),
                     Pair.of(new chv.d(40, 80), 1),
                     Pair.of(new chv.f(40, 80), 1),
                     Pair.of(bxf.a(bsy.by, 6.0F), 1),
                     Pair.of(bwy.a(1.0F), 1),
                     Pair.of(new bvq(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccr.aS, ccs.b))
      );
   }

   static void a(chu $$0) {
      $$0.dS().a(ImmutableList.of(cok.z, cok.v, cok.b));
   }

   static class a extends bvg<chu> {
      a(int $$0, int $$1) {
         super(Map.of(ccr.Z, ccs.b, ccr.m, ccs.b, ccr.aS, ccs.a, ccr.aG, ccs.b), $$0, $$1);
      }

      protected boolean a(are $$0, chu $$1) {
         return $$1.gq();
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         return $$1.dS().c(ccr.aS).isPresent() && $$1.gy() && !$$1.gu();
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.f);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(ccr.aG, baa.a, 9600L);
         } else {
            chv.b($$1);
         }
      }
   }

   static class b extends bvg<chu> {
      b(int $$0, int $$1) {
         super(Map.of(ccr.aT, ccs.a), $$0, $$1);
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         return true;
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.b);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.a);
         $$1.dS().b(ccr.aT);
      }
   }

   static class c extends bvg<chu> {
      c(int $$0) {
         super(Map.of(ccr.Z, ccs.b, ccr.m, ccs.b, ccr.aS, ccs.a, ccr.aG, ccs.a), $$0, $$0);
      }

      protected boolean a(are $$0, chu $$1) {
         return true;
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         return $$1.dS().c(ccr.aS).isPresent();
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.g);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chu.a.a).w($$3);
         $$1.dS().b(ccr.aS);
         $$1.dS().a(ccr.aT, true);
      }
   }

   static class d extends bvg<chu> {
      d(int $$0, int $$1) {
         super(Map.of(ccr.Z, ccs.b, ccr.aS, ccs.b, ccr.aR, ccs.b, ccr.aT, ccs.b, ccr.r, ccs.b), $$0, $$1);
      }

      protected boolean a(are $$0, chu $$1) {
         return !$$1.y();
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         return true;
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.c);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.a);
      }
   }

   static class e extends bvg<chu> {
      e() {
         super(Map.of(ccr.m, ccs.a, ccr.Z, ccs.b, ccr.aR, ccs.a), 600);
      }

      protected boolean a(are $$0, chu $$1) {
         return $$1.gq();
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(chu.a.a);
            return false;
         } else {
            Optional<iz> $$3 = $$1.dS().c(ccr.m).map(ccu::a).map(bwu::b);
            Optional<iz> $$4 = $$1.dS().c(ccr.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.e);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         if ($$1.gy() && $$1.gq()) {
            $$1.dS().a(ccr.aS, true);
         }

         $$1.dS().b(ccr.m);
         $$1.dS().b(ccr.aR);
      }
   }

   static class f extends bvg<chu> {
      f(int $$0, int $$1) {
         super(Map.of(ccr.m, ccs.b, ccr.aR, ccs.b, ccr.aG, ccs.b), $$0, $$1);
      }

      protected boolean a(are $$0, chu $$1) {
         return !$$1.p_() && $$1.gq();
      }

      protected boolean a(are $$0, chu $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(are $$0, chu $$1, long $$2) {
         $$1.a(chu.a.d);
      }

      protected void c(are $$0, chu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chu.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.dS().a(ccr.aR, $$1x);
               $$1.dS().a(ccr.m, new ccu($$1x, 1.25F, 0));
            });
         }
      }
   }
}
