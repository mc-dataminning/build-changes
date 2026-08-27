import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bwv {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<btd<? extends btc<? super bwu>>> a = ImmutableList.of(btd.c, btd.f, btd.d, btd.w);
   static final List<bry<?>> b = ImmutableList.of(
      bry.n, bry.m, bry.E, bry.t, bry.Y, bry.aQ, bry.aR, bry.aS, bry.aF, bry.aP, bry.h, bry.r, new bry[]{bry.N, bry.O, bry.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static clw a() {
      return clw.a(ciz.uo);
   }

   protected static bjx<?> a(bjx<bwu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ccw.a));
      $$0.b(ccw.b);
      $$0.f();
      return $$0;
   }

   static bwu b(bwu $$0) {
      $$0.dM().b(bry.aR);
      $$0.dM().b(bry.aQ);
      return $$0.a(bwu.a.a);
   }

   private static void b(bjx<bwu> $$0) {
      $$0.a(ccw.a, 0, ImmutableList.of(new bnh(0.8F), new bkj(2.0F) {
         @Override
         protected void b(aki $$0, bjf $$1, long $$2) {
            bwv.b((bwu)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new blx(500, 700), new bku(bry.O)));
   }

   private static void c(bjx<bwu> $$0) {
      $$0.a(ccw.v, ImmutableList.of(Pair.of(0, new bwv.e())), Set.of(Pair.of(bry.Y, brz.b), Pair.of(bry.aQ, brz.a), Pair.of(bry.m, brz.a)));
   }

   private static void d(bjx<bwu> $$0) {
      $$0.a(
         ccw.z,
         ImmutableList.of(Pair.of(0, new bwv.a(160, 180)), Pair.of(0, new bwv.c(40))),
         Set.of(Pair.of(bry.Y, brz.b), Pair.of(bry.m, brz.b), Pair.of(bry.aR, brz.a))
      );
   }

   private static void e(bjx<bwu> $$0) {
      $$0.a(
         ccw.b,
         ImmutableList.of(
            Pair.of(0, new bki(bik.aN, 1.0F) {
               @Override
               protected void a(aki $$0, bui $$1, long $$2) {
                  bwv.b((bwu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blb($$0x -> 1.25F, $$0x -> $$0x.i_() ? 2.5 : 3.5) {
               @Override
               protected void b(aki $$0, bjf $$1, long $$2) {
                  bwv.b((bwu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new blt(45, 90)),
            Pair.of(3, new bwv.b(40, 100)),
            Pair.of(
               4,
               new bmk(
                  ImmutableList.of(
                     Pair.of(bmu.a(1.0F, 3), 2),
                     Pair.of(new bwv.d(40, 80), 1),
                     Pair.of(new bwv.f(40, 80), 1),
                     Pair.of(bmm.a(bik.bt, 6.0F), 1),
                     Pair.of(bmf.a(1.0F), 1),
                     Pair.of(new bky(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bry.aR, brz.b))
      );
   }

   static void a(bwu $$0) {
      $$0.dM().a(ImmutableList.of(ccw.z, ccw.v, ccw.b));
   }

   static class a extends bko<bwu> {
      a(int $$0, int $$1) {
         super(Map.of(bry.Y, brz.b, bry.m, brz.b, bry.aR, brz.a, bry.aF, brz.b), $$0, $$1);
      }

      protected boolean a(aki $$0, bwu $$1) {
         return $$1.fZ();
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         return $$1.dM().c(bry.aR).isPresent() && $$1.gh() && !$$1.gd();
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.f);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dM().a(bry.aF, asn.a, 9600L);
         } else {
            bwv.b($$1);
         }
      }
   }

   static class b extends bko<bwu> {
      b(int $$0, int $$1) {
         super(Map.of(bry.aS, brz.a), $$0, $$1);
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         return true;
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.b);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.a);
         $$1.dM().b(bry.aS);
      }
   }

   static class c extends bko<bwu> {
      c(int $$0) {
         super(Map.of(bry.Y, brz.b, bry.m, brz.b, bry.aR, brz.a, bry.aF, brz.a), $$0, $$0);
      }

      protected boolean a(aki $$0, bwu $$1) {
         return true;
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         return $$1.dM().c(bry.aR).isPresent();
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.g);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwu.a.a).w($$3);
         $$1.dM().b(bry.aR);
         $$1.dM().a(bry.aS, true);
      }
   }

   static class d extends bko<bwu> {
      d(int $$0, int $$1) {
         super(Map.of(bry.Y, brz.b, bry.aR, brz.b, bry.aQ, brz.b, bry.aS, brz.b, bry.r, brz.b), $$0, $$1);
      }

      protected boolean a(aki $$0, bwu $$1) {
         return !$$1.t();
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         return true;
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.c);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.a);
      }
   }

   static class e extends bko<bwu> {
      e() {
         super(Map.of(bry.m, brz.a, bry.Y, brz.b, bry.aQ, brz.a), 600);
      }

      protected boolean a(aki $$0, bwu $$1) {
         return $$1.fZ();
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         if (!$$1.fZ()) {
            $$1.a(bwu.a.a);
            return false;
         } else {
            Optional<gv> $$3 = $$1.dM().c(bry.m).map(bsb::a).map(bmb::b);
            Optional<gv> $$4 = $$1.dM().c(bry.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.e);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         if ($$1.gh() && $$1.fZ()) {
            $$1.dM().a(bry.aR, true);
         }

         $$1.dM().b(bry.m);
         $$1.dM().b(bry.aQ);
      }
   }

   static class f extends bko<bwu> {
      f(int $$0, int $$1) {
         super(Map.of(bry.m, brz.b, bry.aQ, brz.b, bry.aF, brz.b), $$0, $$1);
      }

      protected boolean a(aki $$0, bwu $$1) {
         return !$$1.i_() && $$1.fZ();
      }

      protected boolean a(aki $$0, bwu $$1, long $$2) {
         return $$1.fZ();
      }

      protected void b(aki $$0, bwu $$1, long $$2) {
         $$1.a(bwu.a.d);
      }

      protected void c(aki $$0, bwu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwu.a.a);
         if ($$3) {
            $$1.gg().ifPresent($$1x -> {
               $$1.dM().a(bry.aQ, $$1x);
               $$1.dM().a(bry.m, new bsb($$1x, 1.25F, 0));
            });
         }
      }
   }
}
