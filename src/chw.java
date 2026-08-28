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

public class chw {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdz<? extends cdy<? super chv>>> a = ImmutableList.of(cdz.c, cdz.f, cdz.d, cdz.y);
   static final List<ccs<?>> b = ImmutableList.of(
      ccs.n, ccs.m, ccs.E, ccs.t, ccs.Z, ccs.aR, ccs.aS, ccs.aT, ccs.aG, ccs.aQ, ccs.h, ccs.r, new ccs[]{ccs.O, ccs.P, ccs.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuq> a() {
      return $$0 -> $$0.a(awn.X);
   }

   protected static buq<?> a(buq<chv> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(com.a));
      $$0.b(com.b);
      $$0.f();
      return $$0;
   }

   static chv b(chv $$0) {
      $$0.dT().b(ccs.aS);
      $$0.dT().b(ccs.aR);
      return $$0.a(chv.a.a);
   }

   private static void b(buq<chv> $$0) {
      $$0.a(com.a, 0, ImmutableList.of(new byb(0.8F), new bvc<chv>(2.0F) {
         protected void a(aqu $$0, chv $$1, long $$2) {
            chw.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwr(500, 700), new bvn(ccs.P)));
   }

   private static void c(buq<chv> $$0) {
      $$0.a(com.v, ImmutableList.of(Pair.of(0, new chw.e())), Set.of(Pair.of(ccs.Z, cct.b), Pair.of(ccs.aR, cct.a), Pair.of(ccs.m, cct.a)));
   }

   private static void d(buq<chv> $$0) {
      $$0.a(
         com.z,
         ImmutableList.of(Pair.of(0, new chw.a(160, 180)), Pair.of(0, new chw.c(40))),
         Set.of(Pair.of(ccs.Z, cct.b), Pair.of(ccs.m, cct.b), Pair.of(ccs.aS, cct.a))
      );
   }

   private static void e(buq<chv> $$0) {
      $$0.a(
         com.b,
         ImmutableList.of(
            Pair.of(0, new bvb(bsx.aR) {
               @Override
               protected void a(aqu $$0, cfe $$1, long $$2) {
                  chw.b((chv)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvu($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqu $$0, btw $$1, long $$2) {
                  chw.b((chv)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwn(45, 90)),
            Pair.of(3, new chw.b(40, 100)),
            Pair.of(
               4,
               new bxe(
                  ImmutableList.of(
                     Pair.of(bxo.a(1.0F, 3), 2),
                     Pair.of(new chw.d(40, 80), 1),
                     Pair.of(new chw.f(40, 80), 1),
                     Pair.of(bxg.a(bsx.by, 6.0F), 1),
                     Pair.of(bwz.a(1.0F), 1),
                     Pair.of(new bvr(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccs.aS, cct.b))
      );
   }

   static void a(chv $$0) {
      $$0.dT().a(ImmutableList.of(com.z, com.v, com.b));
   }

   static class a extends bvh<chv> {
      a(int $$0, int $$1) {
         super(Map.of(ccs.Z, cct.b, ccs.m, cct.b, ccs.aS, cct.a, ccs.aG, cct.b), $$0, $$1);
      }

      protected boolean a(aqu $$0, chv $$1) {
         return $$1.gk();
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         return $$1.dT().c(ccs.aS).isPresent() && $$1.gn() && !$$1.gs();
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.f);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dT().a(ccs.aG, azs.a, 9600L);
         } else {
            chw.b($$1);
         }
      }
   }

   static class b extends bvh<chv> {
      b(int $$0, int $$1) {
         super(Map.of(ccs.aT, cct.a), $$0, $$1);
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         return true;
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.b);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.a);
         $$1.dT().b(ccs.aT);
      }
   }

   static class c extends bvh<chv> {
      c(int $$0) {
         super(Map.of(ccs.Z, cct.b, ccs.m, cct.b, ccs.aS, cct.a, ccs.aG, cct.a), $$0, $$0);
      }

      protected boolean a(aqu $$0, chv $$1) {
         return true;
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         return $$1.dT().c(ccs.aS).isPresent();
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.g);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chv.a.a).x($$3);
         $$1.dT().b(ccs.aS);
         $$1.dT().a(ccs.aT, true);
      }
   }

   static class d extends bvh<chv> {
      d(int $$0, int $$1) {
         super(Map.of(ccs.Z, cct.b, ccs.aS, cct.b, ccs.aR, cct.b, ccs.aT, cct.b, ccs.r, cct.b), $$0, $$1);
      }

      protected boolean a(aqu $$0, chv $$1) {
         return !$$1.x();
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         return true;
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.c);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.a);
      }
   }

   static class e extends bvh<chv> {
      e() {
         super(Map.of(ccs.m, cct.a, ccs.Z, cct.b, ccs.aR, cct.a), 600);
      }

      protected boolean a(aqu $$0, chv $$1) {
         return $$1.gk();
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         if (!$$1.gk()) {
            $$1.a(chv.a.a);
            return false;
         } else {
            Optional<jd> $$3 = $$1.dT().c(ccs.m).map(ccv::a).map(bwv::b);
            Optional<jd> $$4 = $$1.dT().c(ccs.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.e);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         if ($$1.gn() && $$1.gk()) {
            $$1.dT().a(ccs.aS, true);
         }

         $$1.dT().b(ccs.m);
         $$1.dT().b(ccs.aR);
      }
   }

   static class f extends bvh<chv> {
      f(int $$0, int $$1) {
         super(Map.of(ccs.m, cct.b, ccs.aR, cct.b, ccs.aG, cct.b), $$0, $$1);
      }

      protected boolean a(aqu $$0, chv $$1) {
         return !$$1.o_() && $$1.gk();
      }

      protected boolean a(aqu $$0, chv $$1, long $$2) {
         return $$1.gk();
      }

      protected void b(aqu $$0, chv $$1, long $$2) {
         $$1.a(chv.a.d);
      }

      protected void c(aqu $$0, chv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chv.a.a);
         if ($$3) {
            $$1.gm().ifPresent($$1x -> {
               $$1.dT().a(ccs.aR, $$1x);
               $$1.dT().a(ccs.m, new ccv($$1x, 1.25F, 0));
            });
         }
      }
   }
}
