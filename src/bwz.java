import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bwz {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bth<? extends btg<? super bwy>>> a = ImmutableList.of(bth.c, bth.f, bth.d, bth.w);
   static final List<bsc<?>> b = ImmutableList.of(
      bsc.n, bsc.m, bsc.E, bsc.t, bsc.Y, bsc.aQ, bsc.aR, bsc.aS, bsc.aF, bsc.aP, bsc.h, bsc.r, new bsc[]{bsc.N, bsc.O, bsc.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cmb a() {
      return cmb.a(cjd.uo);
   }

   protected static bkb<?> a(bkb<bwy> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cda.a));
      $$0.b(cda.b);
      $$0.f();
      return $$0;
   }

   static bwy b(bwy $$0) {
      $$0.dM().b(bsc.aR);
      $$0.dM().b(bsc.aQ);
      return $$0.a(bwy.a.a);
   }

   private static void b(bkb<bwy> $$0) {
      $$0.a(cda.a, 0, ImmutableList.of(new bnl(0.8F), new bkn(2.0F) {
         @Override
         protected void b(akn $$0, bjk $$1, long $$2) {
            bwz.b((bwy)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bmb(500, 700), new bky(bsc.O)));
   }

   private static void c(bkb<bwy> $$0) {
      $$0.a(cda.v, ImmutableList.of(Pair.of(0, new bwz.e())), Set.of(Pair.of(bsc.Y, bsd.b), Pair.of(bsc.aQ, bsd.a), Pair.of(bsc.m, bsd.a)));
   }

   private static void d(bkb<bwy> $$0) {
      $$0.a(
         cda.z,
         ImmutableList.of(Pair.of(0, new bwz.a(160, 180)), Pair.of(0, new bwz.c(40))),
         Set.of(Pair.of(bsc.Y, bsd.b), Pair.of(bsc.m, bsd.b), Pair.of(bsc.aR, bsd.a))
      );
   }

   private static void e(bkb<bwy> $$0) {
      $$0.a(
         cda.b,
         ImmutableList.of(
            Pair.of(0, new bkm(bip.aN, 1.0F) {
               @Override
               protected void a(akn $$0, bum $$1, long $$2) {
                  bwz.b((bwy)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blf($$0x -> 1.25F, $$0x -> $$0x.i_() ? 2.5 : 3.5) {
               @Override
               protected void b(akn $$0, bjk $$1, long $$2) {
                  bwz.b((bwy)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new blx(45, 90)),
            Pair.of(3, new bwz.b(40, 100)),
            Pair.of(
               4,
               new bmo(
                  ImmutableList.of(
                     Pair.of(bmy.a(1.0F, 3), 2),
                     Pair.of(new bwz.d(40, 80), 1),
                     Pair.of(new bwz.f(40, 80), 1),
                     Pair.of(bmq.a(bip.bt, 6.0F), 1),
                     Pair.of(bmj.a(1.0F), 1),
                     Pair.of(new blc(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bsc.aR, bsd.b))
      );
   }

   static void a(bwy $$0) {
      $$0.dM().a(ImmutableList.of(cda.z, cda.v, cda.b));
   }

   static class a extends bks<bwy> {
      a(int $$0, int $$1) {
         super(Map.of(bsc.Y, bsd.b, bsc.m, bsd.b, bsc.aR, bsd.a, bsc.aF, bsd.b), $$0, $$1);
      }

      protected boolean a(akn $$0, bwy $$1) {
         return $$1.ga();
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         return $$1.dM().c(bsc.aR).isPresent() && $$1.gi() && !$$1.ge();
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.f);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dM().a(bsc.aF, ass.a, 9600L);
         } else {
            bwz.b($$1);
         }
      }
   }

   static class b extends bks<bwy> {
      b(int $$0, int $$1) {
         super(Map.of(bsc.aS, bsd.a), $$0, $$1);
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         return true;
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.b);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.a);
         $$1.dM().b(bsc.aS);
      }
   }

   static class c extends bks<bwy> {
      c(int $$0) {
         super(Map.of(bsc.Y, bsd.b, bsc.m, bsd.b, bsc.aR, bsd.a, bsc.aF, bsd.a), $$0, $$0);
      }

      protected boolean a(akn $$0, bwy $$1) {
         return true;
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         return $$1.dM().c(bsc.aR).isPresent();
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.g);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwy.a.a).w($$3);
         $$1.dM().b(bsc.aR);
         $$1.dM().a(bsc.aS, true);
      }
   }

   static class d extends bks<bwy> {
      d(int $$0, int $$1) {
         super(Map.of(bsc.Y, bsd.b, bsc.aR, bsd.b, bsc.aQ, bsd.b, bsc.aS, bsd.b, bsc.r, bsd.b), $$0, $$1);
      }

      protected boolean a(akn $$0, bwy $$1) {
         return !$$1.t();
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         return true;
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.c);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.a);
      }
   }

   static class e extends bks<bwy> {
      e() {
         super(Map.of(bsc.m, bsd.a, bsc.Y, bsd.b, bsc.aQ, bsd.a), 600);
      }

      protected boolean a(akn $$0, bwy $$1) {
         return $$1.ga();
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         if (!$$1.ga()) {
            $$1.a(bwy.a.a);
            return false;
         } else {
            Optional<gw> $$3 = $$1.dM().c(bsc.m).map(bsf::a).map(bmf::b);
            Optional<gw> $$4 = $$1.dM().c(bsc.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.e);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         if ($$1.gi() && $$1.ga()) {
            $$1.dM().a(bsc.aR, true);
         }

         $$1.dM().b(bsc.m);
         $$1.dM().b(bsc.aQ);
      }
   }

   static class f extends bks<bwy> {
      f(int $$0, int $$1) {
         super(Map.of(bsc.m, bsd.b, bsc.aQ, bsd.b, bsc.aF, bsd.b), $$0, $$1);
      }

      protected boolean a(akn $$0, bwy $$1) {
         return !$$1.i_() && $$1.ga();
      }

      protected boolean a(akn $$0, bwy $$1, long $$2) {
         return $$1.ga();
      }

      protected void b(akn $$0, bwy $$1, long $$2) {
         $$1.a(bwy.a.d);
      }

      protected void c(akn $$0, bwy $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwy.a.a);
         if ($$3) {
            $$1.gh().ifPresent($$1x -> {
               $$1.dM().a(bsc.aQ, $$1x);
               $$1.dM().a(bsc.m, new bsf($$1x, 1.25F, 0));
            });
         }
      }
   }
}
