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

public class clb {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cha<? extends cgz<? super cla>>> a = ImmutableList.of(cha.c, cha.f, cha.d, cha.y);
   static final List<cft<?>> b = ImmutableList.of(
      cft.o, cft.n, cft.F, cft.u, cft.aa, cft.aS, cft.aT, cft.aU, cft.aH, cft.aR, cft.h, cft.s, new cft[]{cft.P, cft.Q, cft.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxy> a() {
      return $$0 -> $$0.a(axi.aa);
   }

   protected static bxr<?> a(bxr<cla> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crz.a));
      $$0.b(crz.b);
      $$0.f();
      return $$0;
   }

   static cla b(cla $$0) {
      $$0.eb().b(cft.aT);
      $$0.eb().b(cft.aS);
      return $$0.a(cla.a.a);
   }

   private static void b(bxr<cla> $$0) {
      $$0.a(crz.a, 0, ImmutableList.of(new cbc(0.8F), new byd<cla>(2.0F) {
         protected void a(arn $$0, cla $$1, long $$2) {
            clb.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bzs(500, 700), new byo(cft.Q)));
   }

   private static void c(bxr<cla> $$0) {
      $$0.a(crz.v, ImmutableList.of(Pair.of(0, new clb.e())), Set.of(Pair.of(cft.aa, cfu.b), Pair.of(cft.aS, cfu.a), Pair.of(cft.n, cfu.a)));
   }

   private static void d(bxr<cla> $$0) {
      $$0.a(
         crz.z,
         ImmutableList.of(Pair.of(0, new clb.a(160, 180)), Pair.of(0, new clb.c(40))),
         Set.of(Pair.of(cft.aa, cfu.b), Pair.of(cft.n, cfu.b), Pair.of(cft.aT, cfu.a))
      );
   }

   private static void e(bxr<cla> $$0) {
      $$0.a(
         crz.b,
         ImmutableList.of(
            Pair.of(0, new byc(bwb.bi) {
               @Override
               protected void a(arn $$0, cig $$1, long $$2) {
                  clb.b((cla)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new byv($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(arn $$0, bwz $$1, long $$2) {
                  clb.b((cla)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bzo(45, 90)),
            Pair.of(3, new clb.b(40, 100)),
            Pair.of(
               4,
               new caf(
                  ImmutableList.of(
                     Pair.of(cap.a(1.0F, 3), 2),
                     Pair.of(new clb.d(40, 80), 1),
                     Pair.of(new clb.f(40, 80), 1),
                     Pair.of(cah.a(bwb.bR, 6.0F), 1),
                     Pair.of(caa.a(1.0F), 1),
                     Pair.of(new bys(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cft.aT, cfu.b))
      );
   }

   static void a(cla $$0) {
      $$0.eb().a(ImmutableList.of(crz.z, crz.v, crz.b));
   }

   static class a extends byi<cla> {
      a(int $$0, int $$1) {
         super(Map.of(cft.aa, cfu.b, cft.n, cfu.b, cft.aT, cfu.a, cft.aH, cfu.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cla $$1) {
         return $$1.gq();
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         return $$1.eb().c(cft.aT).isPresent() && $$1.gt() && !$$1.gA();
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.f);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cft.aH, baq.a, 9600L);
         } else {
            clb.b($$1);
         }
      }
   }

   static class b extends byi<cla> {
      b(int $$0, int $$1) {
         super(Map.of(cft.aU, cfu.a), $$0, $$1);
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         return true;
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.b);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.a);
         $$1.eb().b(cft.aU);
      }
   }

   static class c extends byi<cla> {
      c(int $$0) {
         super(Map.of(cft.aa, cfu.b, cft.n, cfu.b, cft.aT, cfu.a, cft.aH, cfu.a), $$0, $$0);
      }

      protected boolean a(arn $$0, cla $$1) {
         return true;
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         return $$1.eb().c(cft.aT).isPresent();
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.g);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cla.a.a).w($$3);
         $$1.eb().b(cft.aT);
         $$1.eb().a(cft.aU, true);
      }
   }

   static class d extends byi<cla> {
      d(int $$0, int $$1) {
         super(Map.of(cft.aa, cfu.b, cft.aT, cfu.b, cft.aS, cfu.b, cft.aU, cfu.b, cft.s, cfu.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cla $$1) {
         return !$$1.x();
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         return true;
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.c);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.a);
      }
   }

   static class e extends byi<cla> {
      e() {
         super(Map.of(cft.n, cfu.a, cft.aa, cfu.b, cft.aS, cfu.a), 600);
      }

      protected boolean a(arn $$0, cla $$1) {
         return $$1.gq();
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(cla.a.a);
            return false;
         } else {
            Optional<jj> $$3 = $$1.eb().c(cft.n).map(cfw::a).map(bzw::b);
            Optional<jj> $$4 = $$1.eb().c(cft.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.e);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         if ($$1.gt() && $$1.gq()) {
            $$1.eb().a(cft.aT, true);
         }

         $$1.eb().b(cft.n);
         $$1.eb().b(cft.aS);
      }
   }

   static class f extends byi<cla> {
      f(int $$0, int $$1) {
         super(Map.of(cft.n, cfu.b, cft.aS, cfu.b, cft.aH, cfu.b), $$0, $$1);
      }

      protected boolean a(arn $$0, cla $$1) {
         return !$$1.n_() && $$1.gq();
      }

      protected boolean a(arn $$0, cla $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arn $$0, cla $$1, long $$2) {
         $$1.a(cla.a.d);
      }

      protected void c(arn $$0, cla $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cla.a.a);
         if ($$3) {
            $$1.gs().ifPresent($$1x -> {
               $$1.eb().a(cft.aS, $$1x);
               $$1.eb().a(cft.n, new cfw($$1x, 1.25F, 0));
            });
         }
      }
   }
}
