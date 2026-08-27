import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bwx {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<btf<? extends bte<? super bww>>> a = ImmutableList.of(btf.c, btf.f, btf.d, btf.w);
   static final List<bsa<?>> b = ImmutableList.of(
      bsa.n, bsa.m, bsa.E, bsa.t, bsa.Y, bsa.aQ, bsa.aR, bsa.aS, bsa.aF, bsa.aP, bsa.h, bsa.r, new bsa[]{bsa.N, bsa.O, bsa.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cly a() {
      return cly.a(cjb.uo);
   }

   protected static bjz<?> a(bjz<bww> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ccy.a));
      $$0.b(ccy.b);
      $$0.f();
      return $$0;
   }

   static bww b(bww $$0) {
      $$0.dM().b(bsa.aR);
      $$0.dM().b(bsa.aQ);
      return $$0.a(bww.a.a);
   }

   private static void b(bjz<bww> $$0) {
      $$0.a(ccy.a, 0, ImmutableList.of(new bnj(0.8F), new bkl(2.0F) {
         @Override
         protected void b(akk $$0, bjh $$1, long $$2) {
            bwx.b((bww)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new blz(500, 700), new bkw(bsa.O)));
   }

   private static void c(bjz<bww> $$0) {
      $$0.a(ccy.v, ImmutableList.of(Pair.of(0, new bwx.e())), Set.of(Pair.of(bsa.Y, bsb.b), Pair.of(bsa.aQ, bsb.a), Pair.of(bsa.m, bsb.a)));
   }

   private static void d(bjz<bww> $$0) {
      $$0.a(
         ccy.z,
         ImmutableList.of(Pair.of(0, new bwx.a(160, 180)), Pair.of(0, new bwx.c(40))),
         Set.of(Pair.of(bsa.Y, bsb.b), Pair.of(bsa.m, bsb.b), Pair.of(bsa.aR, bsb.a))
      );
   }

   private static void e(bjz<bww> $$0) {
      $$0.a(
         ccy.b,
         ImmutableList.of(
            Pair.of(0, new bkk(bim.aN, 1.0F) {
               @Override
               protected void a(akk $$0, buk $$1, long $$2) {
                  bwx.b((bww)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bld($$0x -> 1.25F, $$0x -> $$0x.i_() ? 2.5 : 3.5) {
               @Override
               protected void b(akk $$0, bjh $$1, long $$2) {
                  bwx.b((bww)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new blv(45, 90)),
            Pair.of(3, new bwx.b(40, 100)),
            Pair.of(
               4,
               new bmm(
                  ImmutableList.of(
                     Pair.of(bmw.a(1.0F, 3), 2),
                     Pair.of(new bwx.d(40, 80), 1),
                     Pair.of(new bwx.f(40, 80), 1),
                     Pair.of(bmo.a(bim.bt, 6.0F), 1),
                     Pair.of(bmh.a(1.0F), 1),
                     Pair.of(new bla(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bsa.aR, bsb.b))
      );
   }

   static void a(bww $$0) {
      $$0.dM().a(ImmutableList.of(ccy.z, ccy.v, ccy.b));
   }

   static class a extends bkq<bww> {
      a(int $$0, int $$1) {
         super(Map.of(bsa.Y, bsb.b, bsa.m, bsb.b, bsa.aR, bsb.a, bsa.aF, bsb.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bww $$1) {
         return $$1.fZ();
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         return $$1.dM().c(bsa.aR).isPresent() && $$1.gh() && !$$1.gd();
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.f);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dM().a(bsa.aF, asp.a, 9600L);
         } else {
            bwx.b($$1);
         }
      }
   }

   static class b extends bkq<bww> {
      b(int $$0, int $$1) {
         super(Map.of(bsa.aS, bsb.a), $$0, $$1);
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         return true;
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.b);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.a);
         $$1.dM().b(bsa.aS);
      }
   }

   static class c extends bkq<bww> {
      c(int $$0) {
         super(Map.of(bsa.Y, bsb.b, bsa.m, bsb.b, bsa.aR, bsb.a, bsa.aF, bsb.a), $$0, $$0);
      }

      protected boolean a(akk $$0, bww $$1) {
         return true;
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         return $$1.dM().c(bsa.aR).isPresent();
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.g);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bww.a.a).w($$3);
         $$1.dM().b(bsa.aR);
         $$1.dM().a(bsa.aS, true);
      }
   }

   static class d extends bkq<bww> {
      d(int $$0, int $$1) {
         super(Map.of(bsa.Y, bsb.b, bsa.aR, bsb.b, bsa.aQ, bsb.b, bsa.aS, bsb.b, bsa.r, bsb.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bww $$1) {
         return !$$1.t();
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         return true;
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.c);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.a);
      }
   }

   static class e extends bkq<bww> {
      e() {
         super(Map.of(bsa.m, bsb.a, bsa.Y, bsb.b, bsa.aQ, bsb.a), 600);
      }

      protected boolean a(akk $$0, bww $$1) {
         return $$1.fZ();
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         if (!$$1.fZ()) {
            $$1.a(bww.a.a);
            return false;
         } else {
            Optional<gu> $$3 = $$1.dM().c(bsa.m).map(bsd::a).map(bmd::b);
            Optional<gu> $$4 = $$1.dM().c(bsa.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.e);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         if ($$1.gh() && $$1.fZ()) {
            $$1.dM().a(bsa.aR, true);
         }

         $$1.dM().b(bsa.m);
         $$1.dM().b(bsa.aQ);
      }
   }

   static class f extends bkq<bww> {
      f(int $$0, int $$1) {
         super(Map.of(bsa.m, bsb.b, bsa.aQ, bsb.b, bsa.aF, bsb.b), $$0, $$1);
      }

      protected boolean a(akk $$0, bww $$1) {
         return !$$1.i_() && $$1.fZ();
      }

      protected boolean a(akk $$0, bww $$1, long $$2) {
         return $$1.fZ();
      }

      protected void b(akk $$0, bww $$1, long $$2) {
         $$1.a(bww.a.d);
      }

      protected void c(akk $$0, bww $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bww.a.a);
         if ($$3) {
            $$1.gg().ifPresent($$1x -> {
               $$1.dM().a(bsa.aQ, $$1x);
               $$1.dM().a(bsa.m, new bsd($$1x, 1.25F, 0));
            });
         }
      }
   }
}
