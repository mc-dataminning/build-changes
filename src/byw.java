import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class byw {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bve<? extends bvd<? super byv>>> a = ImmutableList.of(bve.c, bve.f, bve.d, bve.w);
   static final List<btz<?>> b = ImmutableList.of(
      btz.n, btz.m, btz.E, btz.t, btz.Y, btz.aQ, btz.aR, btz.aS, btz.aF, btz.aP, btz.h, btz.r, new btz[]{btz.N, btz.O, btz.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static coc a() {
      return coc.a(cle.up);
   }

   protected static bly<?> a(bly<byv> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cex.a));
      $$0.b(cex.b);
      $$0.f();
      return $$0;
   }

   static byv b(byv $$0) {
      $$0.dN().b(btz.aR);
      $$0.dN().b(btz.aQ);
      return $$0.a(byv.a.a);
   }

   private static void b(bly<byv> $$0) {
      $$0.a(cex.a, 0, ImmutableList.of(new bpi(0.8F), new bmk(2.0F) {
         @Override
         protected void b(ama $$0, blh $$1, long $$2) {
            byw.b((byv)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bny(500, 700), new bmv(btz.O)));
   }

   private static void c(bly<byv> $$0) {
      $$0.a(cex.v, ImmutableList.of(Pair.of(0, new byw.e())), Set.of(Pair.of(btz.Y, bua.b), Pair.of(btz.aQ, bua.a), Pair.of(btz.m, bua.a)));
   }

   private static void d(bly<byv> $$0) {
      $$0.a(
         cex.z,
         ImmutableList.of(Pair.of(0, new byw.a(160, 180)), Pair.of(0, new byw.c(40))),
         Set.of(Pair.of(btz.Y, bua.b), Pair.of(btz.m, bua.b), Pair.of(btz.aR, bua.a))
      );
   }

   private static void e(bly<byv> $$0) {
      $$0.a(
         cex.b,
         ImmutableList.of(
            Pair.of(0, new bmj(bkm.aN, 1.0F) {
               @Override
               protected void a(ama $$0, bwj $$1, long $$2) {
                  byw.b((byv)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bnc($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(ama $$0, blh $$1, long $$2) {
                  byw.b((byv)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bnu(45, 90)),
            Pair.of(3, new byw.b(40, 100)),
            Pair.of(
               4,
               new bol(
                  ImmutableList.of(
                     Pair.of(bov.a(1.0F, 3), 2),
                     Pair.of(new byw.d(40, 80), 1),
                     Pair.of(new byw.f(40, 80), 1),
                     Pair.of(bon.a(bkm.bt, 6.0F), 1),
                     Pair.of(bog.a(1.0F), 1),
                     Pair.of(new bmz(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(btz.aR, bua.b))
      );
   }

   static void a(byv $$0) {
      $$0.dN().a(ImmutableList.of(cex.z, cex.v, cex.b));
   }

   static class a extends bmp<byv> {
      a(int $$0, int $$1) {
         super(Map.of(btz.Y, bua.b, btz.m, bua.b, btz.aR, bua.a, btz.aF, bua.b), $$0, $$1);
      }

      protected boolean a(ama $$0, byv $$1) {
         return $$1.ge();
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         return $$1.dN().c(btz.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.f);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(btz.aF, auj.a, 9600L);
         } else {
            byw.b($$1);
         }
      }
   }

   static class b extends bmp<byv> {
      b(int $$0, int $$1) {
         super(Map.of(btz.aS, bua.a), $$0, $$1);
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         return true;
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.b);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.a);
         $$1.dN().b(btz.aS);
      }
   }

   static class c extends bmp<byv> {
      c(int $$0) {
         super(Map.of(btz.Y, bua.b, btz.m, bua.b, btz.aR, bua.a, btz.aF, bua.a), $$0, $$0);
      }

      protected boolean a(ama $$0, byv $$1) {
         return true;
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         return $$1.dN().c(btz.aR).isPresent();
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.g);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(byv.a.a).w($$3);
         $$1.dN().b(btz.aR);
         $$1.dN().a(btz.aS, true);
      }
   }

   static class d extends bmp<byv> {
      d(int $$0, int $$1) {
         super(Map.of(btz.Y, bua.b, btz.aR, bua.b, btz.aQ, bua.b, btz.aS, bua.b, btz.r, bua.b), $$0, $$1);
      }

      protected boolean a(ama $$0, byv $$1) {
         return !$$1.y();
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         return true;
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.c);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.a);
      }
   }

   static class e extends bmp<byv> {
      e() {
         super(Map.of(btz.m, bua.a, btz.Y, bua.b, btz.aQ, bua.a), 600);
      }

      protected boolean a(ama $$0, byv $$1) {
         return $$1.ge();
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(byv.a.a);
            return false;
         } else {
            Optional<ht> $$3 = $$1.dN().c(btz.m).map(buc::a).map(boc::b);
            Optional<ht> $$4 = $$1.dN().c(btz.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.e);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dN().a(btz.aR, true);
         }

         $$1.dN().b(btz.m);
         $$1.dN().b(btz.aQ);
      }
   }

   static class f extends bmp<byv> {
      f(int $$0, int $$1) {
         super(Map.of(btz.m, bua.b, btz.aQ, bua.b, btz.aF, bua.b), $$0, $$1);
      }

      protected boolean a(ama $$0, byv $$1) {
         return !$$1.n_() && $$1.ge();
      }

      protected boolean a(ama $$0, byv $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(ama $$0, byv $$1, long $$2) {
         $$1.a(byv.a.d);
      }

      protected void c(ama $$0, byv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(byv.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dN().a(btz.aQ, $$1x);
               $$1.dN().a(btz.m, new buc($$1x, 1.25F, 0));
            });
         }
      }
   }
}
