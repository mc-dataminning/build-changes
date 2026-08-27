import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bww {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bte<? extends btd<? super bwv>>> a = ImmutableList.of(bte.c, bte.f, bte.d, bte.w);
   static final List<brz<?>> b = ImmutableList.of(
      brz.n, brz.m, brz.E, brz.t, brz.Y, brz.aQ, brz.aR, brz.aS, brz.aF, brz.aP, brz.h, brz.r, new brz[]{brz.N, brz.O, brz.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static clx a() {
      return clx.a(cja.uo);
   }

   protected static bjy<?> a(bjy<bwv> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ccx.a));
      $$0.b(ccx.b);
      $$0.f();
      return $$0;
   }

   static bwv b(bwv $$0) {
      $$0.dM().b(brz.aR);
      $$0.dM().b(brz.aQ);
      return $$0.a(bwv.a.a);
   }

   private static void b(bjy<bwv> $$0) {
      $$0.a(ccx.a, 0, ImmutableList.of(new bni(0.8F), new bkk(2.0F) {
         @Override
         protected void b(akk $$0, bjh $$1, long $$2) {
            bww.b((bwv)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bly(500, 700), new bkv(brz.O)));
   }

   private static void c(bjy<bwv> $$0) {
      $$0.a(ccx.v, ImmutableList.of(Pair.of(0, new bww.e())), Set.of(Pair.of(brz.Y, bsa.b), Pair.of(brz.aQ, bsa.a), Pair.of(brz.m, bsa.a)));
   }

   private static void d(bjy<bwv> $$0) {
      $$0.a(
         ccx.z,
         ImmutableList.of(Pair.of(0, new bww.a(160, 180)), Pair.of(0, new bww.c(40))),
         Set.of(Pair.of(brz.Y, bsa.b), Pair.of(brz.m, bsa.b), Pair.of(brz.aR, bsa.a))
      );
   }

   private static void e(bjy<bwv> $$0) {
      $$0.a(
         ccx.b,
         ImmutableList.of(
            Pair.of(0, new bkj(bim.aN, 1.0F) {
               @Override
               protected void a(akk $$0, buj $$1, long $$2) {
                  bww.b((bwv)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blc($$0x -> 1.25F, $$0x -> $$0x.i_() ? 2.5 : 3.5) {
               @Override
               protected void b(akk $$0, bjh $$1, long $$2) {
                  bww.b((bwv)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new blu(45, 90)),
            Pair.of(3, new bww.b(40, 100)),
            Pair.of(
               4,
               new bml(
                  ImmutableList.of(
                     Pair.of(bmv.a(1.0F, 3), 2),
                     Pair.of(new bww.d(40, 80), 1),
                     Pair.of(new bww.f(40, 80), 1),
                     Pair.of(bmn.a(bim.bt, 6.0F), 1),
                     Pair.of(bmg.a(1.0F), 1),
                     Pair.of(new bkz(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(brz.aR, bsa.b))
      );
   }

   static void a(bwv $$0) {
      $$0.dM().a(ImmutableList.of(ccx.z, ccx.v, ccx.b));
   }

   static class a extends bkp<bwv> {
      a(int $$0, int $$1) {
         super(Map.of(brz.Y, bsa.b, brz.m, bsa.b, brz.aR, bsa.a, brz.aF, bsa.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bwv $$1) {
         return $$1.ga();
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         return $$1.dM().c(brz.aR).isPresent() && $$1.gi() && !$$1.ge();
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.f);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dM().a(brz.aF, asp.a, 9600L);
         } else {
            bww.b($$1);
         }
      }
   }

   static class b extends bkp<bwv> {
      b(int $$0, int $$1) {
         super(Map.of(brz.aS, bsa.a), $$0, $$1);
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         return true;
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.b);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.a);
         $$1.dM().b(brz.aS);
      }
   }

   static class c extends bkp<bwv> {
      c(int $$0) {
         super(Map.of(brz.Y, bsa.b, brz.m, bsa.b, brz.aR, bsa.a, brz.aF, bsa.a), $$0, $$0);
      }

      protected boolean a(akk $$0, bwv $$1) {
         return true;
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         return $$1.dM().c(brz.aR).isPresent();
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.g);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwv.a.a).w($$3);
         $$1.dM().b(brz.aR);
         $$1.dM().a(brz.aS, true);
      }
   }

   static class d extends bkp<bwv> {
      d(int $$0, int $$1) {
         super(Map.of(brz.Y, bsa.b, brz.aR, bsa.b, brz.aQ, bsa.b, brz.aS, bsa.b, brz.r, bsa.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bwv $$1) {
         return !$$1.t();
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         return true;
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.c);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.a);
      }
   }

   static class e extends bkp<bwv> {
      e() {
         super(Map.of(brz.m, bsa.a, brz.Y, bsa.b, brz.aQ, bsa.a), 600);
      }

      protected boolean a(akk $$0, bwv $$1) {
         return $$1.ga();
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         if (!$$1.ga()) {
            $$1.a(bwv.a.a);
            return false;
         } else {
            Optional<gu> $$3 = $$1.dM().c(brz.m).map(bsc::a).map(bmc::b);
            Optional<gu> $$4 = $$1.dM().c(brz.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.e);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         if ($$1.gi() && $$1.ga()) {
            $$1.dM().a(brz.aR, true);
         }

         $$1.dM().b(brz.m);
         $$1.dM().b(brz.aQ);
      }
   }

   static class f extends bkp<bwv> {
      f(int $$0, int $$1) {
         super(Map.of(brz.m, bsa.b, brz.aQ, bsa.b, brz.aF, bsa.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bwv $$1) {
         return !$$1.i_() && $$1.ga();
      }

      protected boolean a(akk $$0, bwv $$1, long $$2) {
         return $$1.ga();
      }

      protected void b(akk $$0, bwv $$1, long $$2) {
         $$1.a(bwv.a.d);
      }

      protected void c(akk $$0, bwv $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bwv.a.a);
         if ($$3) {
            $$1.gh().ifPresent($$1x -> {
               $$1.dM().a(brz.aQ, $$1x);
               $$1.dM().a(brz.m, new bsc($$1x, 1.25F, 0));
            });
         }
      }
   }
}
