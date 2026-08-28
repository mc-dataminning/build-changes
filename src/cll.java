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

public class cll {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<chi<? extends chh<? super clk>>> a = ImmutableList.of(chi.c, chi.f, chi.d, chi.y);
   static final List<cgb<?>> b = ImmutableList.of(
      cgb.o, cgb.n, cgb.F, cgb.u, cgb.aa, cgb.aS, cgb.aT, cgb.aU, cgb.aH, cgb.aR, cgb.h, cgb.s, new cgb[]{cgb.P, cgb.Q, cgb.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cys> a() {
      return $$0 -> $$0.a(axi.aa);
   }

   protected static bxz<?> a(bxz<clk> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csl.a));
      $$0.b(csl.b);
      $$0.f();
      return $$0;
   }

   static clk b(clk $$0) {
      $$0.eb().b(cgb.aT);
      $$0.eb().b(cgb.aS);
      return $$0.a(clk.a.a);
   }

   private static void b(bxz<clk> $$0) {
      $$0.a(csl.a, 0, ImmutableList.of(new cbk(0.8F), new byl<clk>(2.0F) {
         protected void a(aro $$0, clk $$1, long $$2) {
            cll.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new caa(500, 700), new byw(cgb.Q)));
   }

   private static void c(bxz<clk> $$0) {
      $$0.a(csl.v, ImmutableList.of(Pair.of(0, new cll.e())), Set.of(Pair.of(cgb.aa, cgc.b), Pair.of(cgb.aS, cgc.a), Pair.of(cgb.n, cgc.a)));
   }

   private static void d(bxz<clk> $$0) {
      $$0.a(
         csl.z,
         ImmutableList.of(Pair.of(0, new cll.a(160, 180)), Pair.of(0, new cll.c(40))),
         Set.of(Pair.of(cgb.aa, cgc.b), Pair.of(cgb.n, cgc.b), Pair.of(cgb.aT, cgc.a))
      );
   }

   private static void e(bxz<clk> $$0) {
      $$0.a(
         csl.b,
         ImmutableList.of(
            Pair.of(0, new byk(bwj.bj) {
               @Override
               protected void a(aro $$0, cio $$1, long $$2) {
                  cll.b((clk)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bzd($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(aro $$0, bxh $$1, long $$2) {
                  cll.b((clk)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bzw(45, 90)),
            Pair.of(3, new cll.b(40, 100)),
            Pair.of(
               4,
               new can(
                  ImmutableList.of(
                     Pair.of(cax.a(1.0F, 3), 2),
                     Pair.of(new cll.d(40, 80), 1),
                     Pair.of(new cll.f(40, 80), 1),
                     Pair.of(cap.a(bwj.bS, 6.0F), 1),
                     Pair.of(cai.a(1.0F), 1),
                     Pair.of(new bza(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cgb.aT, cgc.b))
      );
   }

   static void a(clk $$0) {
      $$0.eb().a(ImmutableList.of(csl.z, csl.v, csl.b));
   }

   static class a extends byq<clk> {
      a(int $$0, int $$1) {
         super(Map.of(cgb.aa, cgc.b, cgb.n, cgc.b, cgb.aT, cgc.a, cgb.aH, cgc.b), $$0, $$1);
      }

      protected boolean a(aro $$0, clk $$1) {
         return $$1.gq();
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         return $$1.eb().c(cgb.aT).isPresent() && $$1.gt() && !$$1.gA();
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.f);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cgb.aH, bas.a, 9600L);
         } else {
            cll.b($$1);
         }
      }
   }

   static class b extends byq<clk> {
      b(int $$0, int $$1) {
         super(Map.of(cgb.aU, cgc.a), $$0, $$1);
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         return true;
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.b);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.a);
         $$1.eb().b(cgb.aU);
      }
   }

   static class c extends byq<clk> {
      c(int $$0) {
         super(Map.of(cgb.aa, cgc.b, cgb.n, cgc.b, cgb.aT, cgc.a, cgb.aH, cgc.a), $$0, $$0);
      }

      protected boolean a(aro $$0, clk $$1) {
         return true;
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         return $$1.eb().c(cgb.aT).isPresent();
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.g);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clk.a.a).w($$3);
         $$1.eb().b(cgb.aT);
         $$1.eb().a(cgb.aU, true);
      }
   }

   static class d extends byq<clk> {
      d(int $$0, int $$1) {
         super(Map.of(cgb.aa, cgc.b, cgb.aT, cgc.b, cgb.aS, cgc.b, cgb.aU, cgc.b, cgb.s, cgc.b), $$0, $$1);
      }

      protected boolean a(aro $$0, clk $$1) {
         return !$$1.x();
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         return true;
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.c);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.a);
      }
   }

   static class e extends byq<clk> {
      e() {
         super(Map.of(cgb.n, cgc.a, cgb.aa, cgc.b, cgb.aS, cgc.a), 600);
      }

      protected boolean a(aro $$0, clk $$1) {
         return $$1.gq();
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(clk.a.a);
            return false;
         } else {
            Optional<iu> $$3 = $$1.eb().c(cgb.n).map(cge::a).map(cae::b);
            Optional<iu> $$4 = $$1.eb().c(cgb.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.e);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         if ($$1.gt() && $$1.gq()) {
            $$1.eb().a(cgb.aT, true);
         }

         $$1.eb().b(cgb.n);
         $$1.eb().b(cgb.aS);
      }
   }

   static class f extends byq<clk> {
      f(int $$0, int $$1) {
         super(Map.of(cgb.n, cgc.b, cgb.aS, cgc.b, cgb.aH, cgc.b), $$0, $$1);
      }

      protected boolean a(aro $$0, clk $$1) {
         return !$$1.n_() && $$1.gq();
      }

      protected boolean a(aro $$0, clk $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(aro $$0, clk $$1, long $$2) {
         $$1.a(clk.a.d);
      }

      protected void c(aro $$0, clk $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clk.a.a);
         if ($$3) {
            $$1.gs().ifPresent($$1x -> {
               $$1.eb().a(cgb.aS, $$1x);
               $$1.eb().a(cgb.n, new cge($$1x, 1.25F, 0));
            });
         }
      }
   }
}
