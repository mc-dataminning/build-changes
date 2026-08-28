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

public class cmm {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cif<? extends cie<? super cml>>> a = ImmutableList.of(cif.c, cif.f, cif.d, cif.y);
   static final List<cgy<?>> b = ImmutableList.of(
      cgy.o, cgy.n, cgy.F, cgy.u, cgy.aa, cgy.aS, cgy.aT, cgy.aU, cgy.aH, cgy.aR, cgy.h, cgy.s, new cgy[]{cgy.P, cgy.Q, cgy.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<daa> a() {
      return $$0 -> $$0.a(axo.ac);
   }

   protected static byw<?> a(byw<cml> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctt.a));
      $$0.b(ctt.b);
      $$0.f();
      return $$0;
   }

   static cml b(cml $$0) {
      $$0.ec().b(cgy.aT);
      $$0.ec().b(cgy.aS);
      return $$0.a(cml.a.a);
   }

   private static void b(byw<cml> $$0) {
      $$0.a(ctt.a, 0, ImmutableList.of(new cch(0.8F), new bzi<cml>(2.0F) {
         protected void a(aru $$0, cml $$1, long $$2) {
            cmm.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cax(500, 700), new bzt(cgy.Q)));
   }

   private static void c(byw<cml> $$0) {
      $$0.a(ctt.v, ImmutableList.of(Pair.of(0, new cmm.e())), Set.of(Pair.of(cgy.aa, cgz.b), Pair.of(cgy.aS, cgz.a), Pair.of(cgy.n, cgz.a)));
   }

   private static void d(byw<cml> $$0) {
      $$0.a(
         ctt.z,
         ImmutableList.of(Pair.of(0, new cmm.a(160, 180)), Pair.of(0, new cmm.c(40))),
         Set.of(Pair.of(cgy.aa, cgz.b), Pair.of(cgy.n, cgz.b), Pair.of(cgy.aT, cgz.a))
      );
   }

   private static void e(byw<cml> $$0) {
      $$0.a(
         ctt.b,
         ImmutableList.of(
            Pair.of(0, new bzh(bxe.bk) {
               @Override
               protected void a(aru $$0, cjm $$1, long $$2) {
                  cmm.b((cml)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new caa($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(aru $$0, bye $$1, long $$2) {
                  cmm.b((cml)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new cat(45, 90)),
            Pair.of(3, new cmm.b(40, 100)),
            Pair.of(
               4,
               new cbk(
                  ImmutableList.of(
                     Pair.of(cbu.a(1.0F, 3), 2),
                     Pair.of(new cmm.d(40, 80), 1),
                     Pair.of(new cmm.f(40, 80), 1),
                     Pair.of(cbm.a(bxe.bT, 6.0F), 1),
                     Pair.of(cbf.a(1.0F), 1),
                     Pair.of(new bzx(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cgy.aT, cgz.b))
      );
   }

   static void a(cml $$0) {
      $$0.ec().a(ImmutableList.of(ctt.z, ctt.v, ctt.b));
   }

   static class a extends bzn<cml> {
      a(int $$0, int $$1) {
         super(Map.of(cgy.aa, cgz.b, cgy.n, cgz.b, cgy.aT, cgz.a, cgy.aH, cgz.b), $$0, $$1);
      }

      protected boolean a(aru $$0, cml $$1) {
         return $$1.gu();
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         return $$1.ec().c(cgy.aT).isPresent() && $$1.gx() && !$$1.gE();
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.f);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cgy.aH, bay.a, 9600L);
         } else {
            cmm.b($$1);
         }
      }
   }

   static class b extends bzn<cml> {
      b(int $$0, int $$1) {
         super(Map.of(cgy.aU, cgz.a), $$0, $$1);
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         return true;
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.b);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.a);
         $$1.ec().b(cgy.aU);
      }
   }

   static class c extends bzn<cml> {
      c(int $$0) {
         super(Map.of(cgy.aa, cgz.b, cgy.n, cgz.b, cgy.aT, cgz.a, cgy.aH, cgz.a), $$0, $$0);
      }

      protected boolean a(aru $$0, cml $$1) {
         return true;
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         return $$1.ec().c(cgy.aT).isPresent();
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.g);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cml.a.a).w($$3);
         $$1.ec().b(cgy.aT);
         $$1.ec().a(cgy.aU, true);
      }
   }

   static class d extends bzn<cml> {
      d(int $$0, int $$1) {
         super(Map.of(cgy.aa, cgz.b, cgy.aT, cgz.b, cgy.aS, cgz.b, cgy.aU, cgz.b, cgy.s, cgz.b), $$0, $$1);
      }

      protected boolean a(aru $$0, cml $$1) {
         return !$$1.x();
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         return true;
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.c);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.a);
      }
   }

   static class e extends bzn<cml> {
      e() {
         super(Map.of(cgy.n, cgz.a, cgy.aa, cgz.b, cgy.aS, cgz.a), 600);
      }

      protected boolean a(aru $$0, cml $$1) {
         return $$1.gu();
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         if (!$$1.gu()) {
            $$1.a(cml.a.a);
            return false;
         } else {
            Optional<iw> $$3 = $$1.ec().c(cgy.n).map(chb::a).map(cbb::b);
            Optional<iw> $$4 = $$1.ec().c(cgy.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.e);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         if ($$1.gx() && $$1.gu()) {
            $$1.ec().a(cgy.aT, true);
         }

         $$1.ec().b(cgy.n);
         $$1.ec().b(cgy.aS);
      }
   }

   static class f extends bzn<cml> {
      f(int $$0, int $$1) {
         super(Map.of(cgy.n, cgz.b, cgy.aS, cgz.b, cgy.aH, cgz.b), $$0, $$1);
      }

      protected boolean a(aru $$0, cml $$1) {
         return !$$1.n_() && $$1.gu();
      }

      protected boolean a(aru $$0, cml $$1, long $$2) {
         return $$1.gu();
      }

      protected void b(aru $$0, cml $$1, long $$2) {
         $$1.a(cml.a.d);
      }

      protected void c(aru $$0, cml $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cml.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.ec().a(cgy.aS, $$1x);
               $$1.ec().a(cgy.n, new chb($$1x, 1.25F, 0));
            });
         }
      }
   }
}
