import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cal {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bwt<? extends bws<? super cak>>> a = ImmutableList.of(bwt.c, bwt.f, bwt.d, bwt.w);
   static final List<bvn<?>> b = ImmutableList.of(
      bvn.n, bvn.m, bvn.E, bvn.t, bvn.Y, bvn.aQ, bvn.aR, bvn.aS, bvn.aF, bvn.aP, bvn.h, bvn.r, new bvn[]{bvn.N, bvn.O, bvn.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cpz a() {
      return cpz.a(cnb.vb);
   }

   protected static bnl<?> a(bnl<cak> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cgu.a));
      $$0.b(cgu.b);
      $$0.f();
      return $$0;
   }

   static cak b(cak $$0) {
      $$0.dO().b(bvn.aR);
      $$0.dO().b(bvn.aQ);
      return $$0.a(cak.a.a);
   }

   private static void b(bnl<cak> $$0) {
      $$0.a(cgu.a, 0, ImmutableList.of(new bqw(0.8F), new bnx(2.0F) {
         @Override
         protected void b(and $$0, bmu $$1, long $$2) {
            cal.b((cak)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bpm(500, 700), new boi(bvn.O)));
   }

   private static void c(bnl<cak> $$0) {
      $$0.a(cgu.v, ImmutableList.of(Pair.of(0, new cal.e())), Set.of(Pair.of(bvn.Y, bvo.b), Pair.of(bvn.aQ, bvo.a), Pair.of(bvn.m, bvo.a)));
   }

   private static void d(bnl<cak> $$0) {
      $$0.a(
         cgu.z,
         ImmutableList.of(Pair.of(0, new cal.a(160, 180)), Pair.of(0, new cal.c(40))),
         Set.of(Pair.of(bvn.Y, bvo.b), Pair.of(bvn.m, bvo.b), Pair.of(bvn.aR, bvo.a))
      );
   }

   private static void e(bnl<cak> $$0) {
      $$0.a(
         cgu.b,
         ImmutableList.of(
            Pair.of(0, new bnw(blz.aO, 1.0F) {
               @Override
               protected void a(and $$0, bxy $$1, long $$2) {
                  cal.b((cak)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bop($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(and $$0, bmu $$1, long $$2) {
                  cal.b((cak)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bpi(45, 90)),
            Pair.of(3, new cal.b(40, 100)),
            Pair.of(
               4,
               new bpz(
                  ImmutableList.of(
                     Pair.of(bqj.a(1.0F, 3), 2),
                     Pair.of(new cal.d(40, 80), 1),
                     Pair.of(new cal.f(40, 80), 1),
                     Pair.of(bqb.a(blz.bv, 6.0F), 1),
                     Pair.of(bpu.a(1.0F), 1),
                     Pair.of(new bom(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bvn.aR, bvo.b))
      );
   }

   static void a(cak $$0) {
      $$0.dO().a(ImmutableList.of(cgu.z, cgu.v, cgu.b));
   }

   static class a extends boc<cak> {
      a(int $$0, int $$1) {
         super(Map.of(bvn.Y, bvo.b, bvn.m, bvo.b, bvn.aR, bvo.a, bvn.aF, bvo.b), $$0, $$1);
      }

      protected boolean a(and $$0, cak $$1) {
         return $$1.ge();
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         return $$1.dO().c(bvn.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.f);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bvn.aF, avs.a, 9600L);
         } else {
            cal.b($$1);
         }
      }
   }

   static class b extends boc<cak> {
      b(int $$0, int $$1) {
         super(Map.of(bvn.aS, bvo.a), $$0, $$1);
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         return true;
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.b);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.a);
         $$1.dO().b(bvn.aS);
      }
   }

   static class c extends boc<cak> {
      c(int $$0) {
         super(Map.of(bvn.Y, bvo.b, bvn.m, bvo.b, bvn.aR, bvo.a, bvn.aF, bvo.a), $$0, $$0);
      }

      protected boolean a(and $$0, cak $$1) {
         return true;
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         return $$1.dO().c(bvn.aR).isPresent();
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.g);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cak.a.a).w($$3);
         $$1.dO().b(bvn.aR);
         $$1.dO().a(bvn.aS, true);
      }
   }

   static class d extends boc<cak> {
      d(int $$0, int $$1) {
         super(Map.of(bvn.Y, bvo.b, bvn.aR, bvo.b, bvn.aQ, bvo.b, bvn.aS, bvo.b, bvn.r, bvo.b), $$0, $$1);
      }

      protected boolean a(and $$0, cak $$1) {
         return !$$1.A();
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         return true;
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.c);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.a);
      }
   }

   static class e extends boc<cak> {
      e() {
         super(Map.of(bvn.m, bvo.a, bvn.Y, bvo.b, bvn.aQ, bvo.a), 600);
      }

      protected boolean a(and $$0, cak $$1) {
         return $$1.ge();
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(cak.a.a);
            return false;
         } else {
            Optional<hx> $$3 = $$1.dO().c(bvn.m).map(bvq::a).map(bpq::b);
            Optional<hx> $$4 = $$1.dO().c(bvn.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.e);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dO().a(bvn.aR, true);
         }

         $$1.dO().b(bvn.m);
         $$1.dO().b(bvn.aQ);
      }
   }

   static class f extends boc<cak> {
      f(int $$0, int $$1) {
         super(Map.of(bvn.m, bvo.b, bvn.aQ, bvo.b, bvn.aF, bvo.b), $$0, $$1);
      }

      protected boolean a(and $$0, cak $$1) {
         return !$$1.o_() && $$1.ge();
      }

      protected boolean a(and $$0, cak $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(and $$0, cak $$1, long $$2) {
         $$1.a(cak.a.d);
      }

      protected void c(and $$0, cak $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cak.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dO().a(bvn.aQ, $$1x);
               $$1.dO().a(bvn.m, new bvq($$1x, 1.25F, 0));
            });
         }
      }
   }
}
