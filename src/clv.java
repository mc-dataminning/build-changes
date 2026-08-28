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

public class clv {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<chn<? extends chm<? super clu>>> a = ImmutableList.of(chn.c, chn.f, chn.d, chn.y);
   static final List<cgg<?>> b = ImmutableList.of(
      cgg.o, cgg.n, cgg.F, cgg.u, cgg.aa, cgg.aS, cgg.aT, cgg.aU, cgg.aH, cgg.aR, cgg.h, cgg.s, new cgg[]{cgg.P, cgg.Q, cgg.S}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<czd> a() {
      return $$0 -> $$0.a(axk.ab);
   }

   protected static bye<?> a(bye<clu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(csw.a));
      $$0.b(csw.b);
      $$0.f();
      return $$0;
   }

   static clu b(clu $$0) {
      $$0.ec().b(cgg.aT);
      $$0.ec().b(cgg.aS);
      return $$0.a(clu.a.a);
   }

   private static void b(bye<clu> $$0) {
      $$0.a(csw.a, 0, ImmutableList.of(new cbp(0.8F), new byq<clu>(2.0F) {
         protected void a(arq $$0, clu $$1, long $$2) {
            clv.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new caf(500, 700), new bzb(cgg.Q)));
   }

   private static void c(bye<clu> $$0) {
      $$0.a(csw.v, ImmutableList.of(Pair.of(0, new clv.e())), Set.of(Pair.of(cgg.aa, cgh.b), Pair.of(cgg.aS, cgh.a), Pair.of(cgg.n, cgh.a)));
   }

   private static void d(bye<clu> $$0) {
      $$0.a(
         csw.z,
         ImmutableList.of(Pair.of(0, new clv.a(160, 180)), Pair.of(0, new clv.c(40))),
         Set.of(Pair.of(cgg.aa, cgh.b), Pair.of(cgg.n, cgh.b), Pair.of(cgg.aT, cgh.a))
      );
   }

   private static void e(bye<clu> $$0) {
      $$0.a(
         csw.b,
         ImmutableList.of(
            Pair.of(0, new byp(bwo.bj) {
               @Override
               protected void a(arq $$0, ciu $$1, long $$2) {
                  clv.b((clu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bzi($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(arq $$0, bxm $$1, long $$2) {
                  clv.b((clu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new cab(45, 90)),
            Pair.of(3, new clv.b(40, 100)),
            Pair.of(
               4,
               new cas(
                  ImmutableList.of(
                     Pair.of(cbc.a(1.0F, 3), 2),
                     Pair.of(new clv.d(40, 80), 1),
                     Pair.of(new clv.f(40, 80), 1),
                     Pair.of(cau.a(bwo.bS, 6.0F), 1),
                     Pair.of(can.a(1.0F), 1),
                     Pair.of(new bzf(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cgg.aT, cgh.b))
      );
   }

   static void a(clu $$0) {
      $$0.ec().a(ImmutableList.of(csw.z, csw.v, csw.b));
   }

   static class a extends byv<clu> {
      a(int $$0, int $$1) {
         super(Map.of(cgg.aa, cgh.b, cgg.n, cgh.b, cgg.aT, cgh.a, cgg.aH, cgh.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clu $$1) {
         return $$1.gr();
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         return $$1.ec().c(cgg.aT).isPresent() && $$1.gu() && !$$1.gB();
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.f);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cgg.aH, bau.a, 9600L);
         } else {
            clv.b($$1);
         }
      }
   }

   static class b extends byv<clu> {
      b(int $$0, int $$1) {
         super(Map.of(cgg.aU, cgh.a), $$0, $$1);
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.b);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.a);
         $$1.ec().b(cgg.aU);
      }
   }

   static class c extends byv<clu> {
      c(int $$0) {
         super(Map.of(cgg.aa, cgh.b, cgg.n, cgh.b, cgg.aT, cgh.a, cgg.aH, cgh.a), $$0, $$0);
      }

      protected boolean a(arq $$0, clu $$1) {
         return true;
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         return $$1.ec().c(cgg.aT).isPresent();
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.g);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clu.a.a).w($$3);
         $$1.ec().b(cgg.aT);
         $$1.ec().a(cgg.aU, true);
      }
   }

   static class d extends byv<clu> {
      d(int $$0, int $$1) {
         super(Map.of(cgg.aa, cgh.b, cgg.aT, cgh.b, cgg.aS, cgh.b, cgg.aU, cgh.b, cgg.s, cgh.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clu $$1) {
         return !$$1.x();
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         return true;
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.c);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.a);
      }
   }

   static class e extends byv<clu> {
      e() {
         super(Map.of(cgg.n, cgh.a, cgg.aa, cgh.b, cgg.aS, cgh.a), 600);
      }

      protected boolean a(arq $$0, clu $$1) {
         return $$1.gr();
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         if (!$$1.gr()) {
            $$1.a(clu.a.a);
            return false;
         } else {
            Optional<iu> $$3 = $$1.ec().c(cgg.n).map(cgj::a).map(caj::b);
            Optional<iu> $$4 = $$1.ec().c(cgg.aS);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.e);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         if ($$1.gu() && $$1.gr()) {
            $$1.ec().a(cgg.aT, true);
         }

         $$1.ec().b(cgg.n);
         $$1.ec().b(cgg.aS);
      }
   }

   static class f extends byv<clu> {
      f(int $$0, int $$1) {
         super(Map.of(cgg.n, cgh.b, cgg.aS, cgh.b, cgg.aH, cgh.b), $$0, $$1);
      }

      protected boolean a(arq $$0, clu $$1) {
         return !$$1.n_() && $$1.gr();
      }

      protected boolean a(arq $$0, clu $$1, long $$2) {
         return $$1.gr();
      }

      protected void b(arq $$0, clu $$1, long $$2) {
         $$1.a(clu.a.d);
      }

      protected void c(arq $$0, clu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(clu.a.a);
         if ($$3) {
            $$1.gt().ifPresent($$1x -> {
               $$1.ec().a(cgg.aS, $$1x);
               $$1.ec().a(cgg.n, new cgj($$1x, 1.25F, 0));
            });
         }
      }
   }
}
