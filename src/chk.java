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

public class chk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdn<? extends cdm<? super chj>>> a = ImmutableList.of(cdn.c, cdn.f, cdn.d, cdn.y);
   static final List<ccg<?>> b = ImmutableList.of(
      ccg.n, ccg.m, ccg.E, ccg.t, ccg.Z, ccg.aR, ccg.aS, ccg.aT, ccg.aG, ccg.aQ, ccg.h, ccg.r, new ccg[]{ccg.O, ccg.P, ccg.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cud> a() {
      return $$0 -> $$0.a(awf.X);
   }

   protected static bue<?> a(bue<chj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coa.a));
      $$0.b(coa.b);
      $$0.f();
      return $$0;
   }

   static chj b(chj $$0) {
      $$0.dV().b(ccg.aS);
      $$0.dV().b(ccg.aR);
      return $$0.a(chj.a.a);
   }

   private static void b(bue<chj> $$0) {
      $$0.a(coa.a, 0, ImmutableList.of(new bxp(0.8F), new buq<chj>(2.0F) {
         protected void a(aqm $$0, chj $$1, long $$2) {
            chk.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwf(500, 700), new bvb(ccg.P)));
   }

   private static void c(bue<chj> $$0) {
      $$0.a(coa.v, ImmutableList.of(Pair.of(0, new chk.e())), Set.of(Pair.of(ccg.Z, cch.b), Pair.of(ccg.aR, cch.a), Pair.of(ccg.m, cch.a)));
   }

   private static void d(bue<chj> $$0) {
      $$0.a(
         coa.z,
         ImmutableList.of(Pair.of(0, new chk.a(160, 180)), Pair.of(0, new chk.c(40))),
         Set.of(Pair.of(ccg.Z, cch.b), Pair.of(ccg.m, cch.b), Pair.of(ccg.aS, cch.a))
      );
   }

   private static void e(bue<chj> $$0) {
      $$0.a(
         coa.b,
         ImmutableList.of(
            Pair.of(0, new bup(bsn.aR) {
               @Override
               protected void a(aqm $$0, ces $$1, long $$2) {
                  chk.b((chj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvi($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqm $$0, btl $$1, long $$2) {
                  chk.b((chj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwb(45, 90)),
            Pair.of(3, new chk.b(40, 100)),
            Pair.of(
               4,
               new bws(
                  ImmutableList.of(
                     Pair.of(bxc.a(1.0F, 3), 2),
                     Pair.of(new chk.d(40, 80), 1),
                     Pair.of(new chk.f(40, 80), 1),
                     Pair.of(bwu.a(bsn.by, 6.0F), 1),
                     Pair.of(bwn.a(1.0F), 1),
                     Pair.of(new bvf(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccg.aS, cch.b))
      );
   }

   static void a(chj $$0) {
      $$0.dV().a(ImmutableList.of(coa.z, coa.v, coa.b));
   }

   static class a extends buv<chj> {
      a(int $$0, int $$1) {
         super(Map.of(ccg.Z, cch.b, ccg.m, cch.b, ccg.aS, cch.a, ccg.aG, cch.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chj $$1) {
         return $$1.gn();
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         return $$1.dV().c(ccg.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.f);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dV().a(ccg.aG, azk.a, 9600L);
         } else {
            chk.b($$1);
         }
      }
   }

   static class b extends buv<chj> {
      b(int $$0, int $$1) {
         super(Map.of(ccg.aT, cch.a), $$0, $$1);
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.b);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.a);
         $$1.dV().b(ccg.aT);
      }
   }

   static class c extends buv<chj> {
      c(int $$0) {
         super(Map.of(ccg.Z, cch.b, ccg.m, cch.b, ccg.aS, cch.a, ccg.aG, cch.a), $$0, $$0);
      }

      protected boolean a(aqm $$0, chj $$1) {
         return true;
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         return $$1.dV().c(ccg.aS).isPresent();
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.g);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chj.a.a).w($$3);
         $$1.dV().b(ccg.aS);
         $$1.dV().a(ccg.aT, true);
      }
   }

   static class d extends buv<chj> {
      d(int $$0, int $$1) {
         super(Map.of(ccg.Z, cch.b, ccg.aS, cch.b, ccg.aR, cch.b, ccg.aT, cch.b, ccg.r, cch.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chj $$1) {
         return !$$1.x();
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         return true;
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.c);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.a);
      }
   }

   static class e extends buv<chj> {
      e() {
         super(Map.of(ccg.m, cch.a, ccg.Z, cch.b, ccg.aR, cch.a), 600);
      }

      protected boolean a(aqm $$0, chj $$1) {
         return $$1.gn();
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(chj.a.a);
            return false;
         } else {
            Optional<ja> $$3 = $$1.dV().c(ccg.m).map(ccj::a).map(bwj::b);
            Optional<ja> $$4 = $$1.dV().c(ccg.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.e);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dV().a(ccg.aS, true);
         }

         $$1.dV().b(ccg.m);
         $$1.dV().b(ccg.aR);
      }
   }

   static class f extends buv<chj> {
      f(int $$0, int $$1) {
         super(Map.of(ccg.m, cch.b, ccg.aR, cch.b, ccg.aG, cch.b), $$0, $$1);
      }

      protected boolean a(aqm $$0, chj $$1) {
         return !$$1.o_() && $$1.gn();
      }

      protected boolean a(aqm $$0, chj $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(aqm $$0, chj $$1, long $$2) {
         $$1.a(chj.a.d);
      }

      protected void c(aqm $$0, chj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chj.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dV().a(ccg.aR, $$1x);
               $$1.dV().a(ccg.m, new ccj($$1x, 1.25F, 0));
            });
         }
      }
   }
}
