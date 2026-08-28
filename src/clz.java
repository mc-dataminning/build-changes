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

public class clz {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<chs<? extends chr<? super cly>>> a = ImmutableList.of(chs.c, chs.f, chs.d, chs.y);
   static final List<cgl<?>> b = ImmutableList.of(
      cgl.o, cgl.n, cgl.F, cgl.u, cgl.aa, cgl.aS, cgl.aT, cgl.aU, cgl.aH, cgl.aR, cgl.h, cgl.s, new cgl[]{cgl.P, cgl.Q, cgl.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<czn> a() {
      return $$0 -> $$0.a(axk.ab);
   }

   protected static byj<?> a(byj<cly> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ctg.a));
      $$0.b(ctg.b);
      $$0.f();
      return $$0;
   }

   static cly b(cly $$0) {
      $$0.eb().b(cgl.aT);
      $$0.eb().b(cgl.aS);
      return $$0.a(cly.a.a);
   }

   private static void b(byj<cly> $$0) {
      $$0.a(ctg.a, 0, ImmutableList.of(new cbu(0.8F), new byv<cly>(2.0F) {
         protected void a(arq $$0, cly $$1, long $$2) {
            clz.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new cak(500, 700), new bzg(cgl.Q)));
   }

   private static void c(byj<cly> $$0) {
      $$0.a(ctg.v, ImmutableList.of(Pair.of(0, new clz.e())), Set.of(Pair.of(cgl.aa, cgm.b), Pair.of(cgl.aS, cgm.a), Pair.of(cgl.n, cgm.a)));
   }

   private static void d(byj<cly> $$0) {
      $$0.a(
         ctg.z,
         ImmutableList.of(Pair.of(0, new clz.a(160, 180)), Pair.of(0, new clz.c(40))),
         Set.of(Pair.of(cgl.aa, cgm.b), Pair.of(cgl.n, cgm.b), Pair.of(cgl.aT, cgm.a))
      );
   }

   private static void e(byj<cly> $$0) {
      $$0.a(
         ctg.b,
         ImmutableList.of(
            Pair.of(0, new byu(bwr.bj) {
               @Override
               protected void a(arq $$0, ciz $$1, long $$2) {
                  clz.b((cly)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bzn($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(arq $$0, bxr $$1, long $$2) {
                  clz.b((cly)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new cag(45, 90)),
            Pair.of(3, new clz.b(40, 100)),
            Pair.of(
               4,
               new cax(
                  ImmutableList.of(
                     Pair.of(cbh.a(1.0F, 3), 2),
                     Pair.of(new clz.d(40, 80), 1),
                     Pair.of(new clz.f(40, 80), 1),
                     Pair.of(caz.a(bwr.bS, 6.0F), 1),
                     Pair.of(cas.a(1.0F), 1),
                     Pair.of(new bzk(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cgl.aT, cgm.b))
      );
   }

   static void a(cly $$0) {
      $$0.eb().a(ImmutableList.of(ctg.z, ctg.v, ctg.b));
   }

   static class a extends bza<cly> {
      a(int $$0, int $$1) {
         super(Map.of(cgl.aa, cgm.b, cgl.n, cgm.b, cgl.aT, cgm.a, cgl.aH, cgm.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cly $$1) {
         return $$1.gt();
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         return $$1.eb().c(cgl.aT).isPresent() && $$1.gw() && !$$1.gD();
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.f);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cgl.aH, bau.a, 9600L);
         } else {
            clz.b($$1);
         }
      }
   }

   static class b extends bza<cly> {
      b(int $$0, int $$1) {
         super(Map.of(cgl.aU, cgm.a), $$0, $$1);
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.b);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.a);
         $$1.eb().b(cgl.aU);
      }
   }

   static class c extends bza<cly> {
      c(int $$0) {
         super(Map.of(cgl.aa, cgm.b, cgl.n, cgm.b, cgl.aT, cgm.a, cgl.aH, cgm.a), $$0, $$0);
      }

      protected boolean a(arq $$0, cly $$1) {
         return true;
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         return $$1.eb().c(cgl.aT).isPresent();
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.g);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cly.a.a).w($$3);
         $$1.eb().b(cgl.aT);
         $$1.eb().a(cgl.aU, true);
      }
   }

   static class d extends bza<cly> {
      d(int $$0, int $$1) {
         super(Map.of(cgl.aa, cgm.b, cgl.aT, cgm.b, cgl.aS, cgm.b, cgl.aU, cgm.b, cgl.s, cgm.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cly $$1) {
         return !$$1.x();
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.c);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.a);
      }
   }

   static class e extends bza<cly> {
      e() {
         super(Map.of(cgl.n, cgm.a, cgl.aa, cgm.b, cgl.aS, cgm.a), 600);
      }

      protected boolean a(arq $$0, cly $$1) {
         return $$1.gt();
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         if (!$$1.gt()) {
            $$1.a(cly.a.a);
            return false;
         } else {
            Optional<iv> $$3 = $$1.eb().c(cgl.n).map(cgo::a).map(cao::b);
            Optional<iv> $$4 = $$1.eb().c(cgl.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.e);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         if ($$1.gw() && $$1.gt()) {
            $$1.eb().a(cgl.aT, true);
         }

         $$1.eb().b(cgl.n);
         $$1.eb().b(cgl.aS);
      }
   }

   static class f extends bza<cly> {
      f(int $$0, int $$1) {
         super(Map.of(cgl.n, cgm.b, cgl.aS, cgm.b, cgl.aH, cgm.b), $$0, $$1);
      }

      protected boolean a(arq $$0, cly $$1) {
         return !$$1.n_() && $$1.gt();
      }

      protected boolean a(arq $$0, cly $$1, long $$2) {
         return $$1.gt();
      }

      protected void b(arq $$0, cly $$1, long $$2) {
         $$1.a(cly.a.d);
      }

      protected void c(arq $$0, cly $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cly.a.a);
         if ($$3) {
            $$1.gv().ifPresent($$1x -> {
               $$1.eb().a(cgl.aS, $$1x);
               $$1.eb().a(cgl.n, new cgo($$1x, 1.25F, 0));
            });
         }
      }
   }
}
