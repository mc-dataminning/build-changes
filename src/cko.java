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

public class cko {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cgq<? extends cgp<? super ckn>>> a = ImmutableList.of(cgq.c, cgq.f, cgq.d, cgq.y);
   static final List<cfj<?>> b = ImmutableList.of(
      cfj.n, cfj.m, cfj.E, cfj.t, cfj.Z, cfj.aR, cfj.aS, cfj.aT, cfj.aG, cfj.aQ, cfj.h, cfj.r, new cfj[]{cfj.O, cfj.P, cfj.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxo> a() {
      return $$0 -> $$0.a(ayd.ac);
   }

   protected static bxh<?> a(bxh<ckn> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crn.a));
      $$0.b(crn.b);
      $$0.f();
      return $$0;
   }

   static ckn b(ckn $$0) {
      $$0.eb().b(cfj.aS);
      $$0.eb().b(cfj.aR);
      return $$0.a(ckn.a.a);
   }

   private static void b(bxh<ckn> $$0) {
      $$0.a(crn.a, 0, ImmutableList.of(new cas(0.8F), new bxt<ckn>(2.0F) {
         protected void a(ash $$0, ckn $$1, long $$2) {
            cko.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bzi(500, 700), new bye(cfj.P)));
   }

   private static void c(bxh<ckn> $$0) {
      $$0.a(crn.v, ImmutableList.of(Pair.of(0, new cko.e())), Set.of(Pair.of(cfj.Z, cfk.b), Pair.of(cfj.aR, cfk.a), Pair.of(cfj.m, cfk.a)));
   }

   private static void d(bxh<ckn> $$0) {
      $$0.a(
         crn.z,
         ImmutableList.of(Pair.of(0, new cko.a(160, 180)), Pair.of(0, new cko.c(40))),
         Set.of(Pair.of(cfj.Z, cfk.b), Pair.of(cfj.m, cfk.b), Pair.of(cfj.aS, cfk.a))
      );
   }

   private static void e(bxh<ckn> $$0) {
      $$0.a(
         crn.b,
         ImmutableList.of(
            Pair.of(0, new bxs(bvq.bj) {
               @Override
               protected void a(ash $$0, chw $$1, long $$2) {
                  cko.b((ckn)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new byl($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(ash $$0, bwn $$1, long $$2) {
                  cko.b((ckn)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bze(45, 90)),
            Pair.of(3, new cko.b(40, 100)),
            Pair.of(
               4,
               new bzv(
                  ImmutableList.of(
                     Pair.of(caf.a(1.0F, 3), 2),
                     Pair.of(new cko.d(40, 80), 1),
                     Pair.of(new cko.f(40, 80), 1),
                     Pair.of(bzx.a(bvq.bS, 6.0F), 1),
                     Pair.of(bzq.a(1.0F), 1),
                     Pair.of(new byi(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cfj.aS, cfk.b))
      );
   }

   static void a(ckn $$0) {
      $$0.eb().a(ImmutableList.of(crn.z, crn.v, crn.b));
   }

   static class a extends bxy<ckn> {
      a(int $$0, int $$1) {
         super(Map.of(cfj.Z, cfk.b, cfj.m, cfk.b, cfj.aS, cfk.a, cfj.aG, cfk.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckn $$1) {
         return $$1.gm();
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         return $$1.eb().c(cfj.aS).isPresent() && $$1.gp() && !$$1.gw();
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.f);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cfj.aG, bbk.a, 9600L);
         } else {
            cko.b($$1);
         }
      }
   }

   static class b extends bxy<ckn> {
      b(int $$0, int $$1) {
         super(Map.of(cfj.aT, cfk.a), $$0, $$1);
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.b);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.a);
         $$1.eb().b(cfj.aT);
      }
   }

   static class c extends bxy<ckn> {
      c(int $$0) {
         super(Map.of(cfj.Z, cfk.b, cfj.m, cfk.b, cfj.aS, cfk.a, cfj.aG, cfk.a), $$0, $$0);
      }

      protected boolean a(ash $$0, ckn $$1) {
         return true;
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         return $$1.eb().c(cfj.aS).isPresent();
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.g);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckn.a.a).x($$3);
         $$1.eb().b(cfj.aS);
         $$1.eb().a(cfj.aT, true);
      }
   }

   static class d extends bxy<ckn> {
      d(int $$0, int $$1) {
         super(Map.of(cfj.Z, cfk.b, cfj.aS, cfk.b, cfj.aR, cfk.b, cfj.aT, cfk.b, cfj.r, cfk.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckn $$1) {
         return !$$1.x();
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         return true;
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.c);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.a);
      }
   }

   static class e extends bxy<ckn> {
      e() {
         super(Map.of(cfj.m, cfk.a, cfj.Z, cfk.b, cfj.aR, cfk.a), 600);
      }

      protected boolean a(ash $$0, ckn $$1) {
         return $$1.gm();
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         if (!$$1.gm()) {
            $$1.a(ckn.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.eb().c(cfj.m).map(cfm::a).map(bzm::b);
            Optional<jh> $$4 = $$1.eb().c(cfj.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.e);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         if ($$1.gp() && $$1.gm()) {
            $$1.eb().a(cfj.aS, true);
         }

         $$1.eb().b(cfj.m);
         $$1.eb().b(cfj.aR);
      }
   }

   static class f extends bxy<ckn> {
      f(int $$0, int $$1) {
         super(Map.of(cfj.m, cfk.b, cfj.aR, cfk.b, cfj.aG, cfk.b), $$0, $$1);
      }

      protected boolean a(ash $$0, ckn $$1) {
         return !$$1.e_() && $$1.gm();
      }

      protected boolean a(ash $$0, ckn $$1, long $$2) {
         return $$1.gm();
      }

      protected void b(ash $$0, ckn $$1, long $$2) {
         $$1.a(ckn.a.d);
      }

      protected void c(ash $$0, ckn $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckn.a.a);
         if ($$3) {
            $$1.go().ifPresent($$1x -> {
               $$1.eb().a(cfj.aR, $$1x);
               $$1.eb().a(cfj.m, new cfm($$1x, 1.25F, 0));
            });
         }
      }
   }
}
