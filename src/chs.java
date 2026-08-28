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

public class chs {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdv<? extends cdu<? super chr>>> a = ImmutableList.of(cdv.c, cdv.f, cdv.d, cdv.y);
   static final List<cco<?>> b = ImmutableList.of(
      cco.n, cco.m, cco.E, cco.t, cco.Z, cco.aR, cco.aS, cco.aT, cco.aG, cco.aQ, cco.h, cco.r, new cco[]{cco.O, cco.P, cco.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cuk> a() {
      return $$0 -> $$0.a(awu.X);
   }

   protected static bum<?> a(bum<chr> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(coh.a));
      $$0.b(coh.b);
      $$0.f();
      return $$0;
   }

   static chr b(chr $$0) {
      $$0.dS().b(cco.aS);
      $$0.dS().b(cco.aR);
      return $$0.a(chr.a.a);
   }

   private static void b(bum<chr> $$0) {
      $$0.a(coh.a, 0, ImmutableList.of(new bxx(0.8F), new buy<chr>(2.0F) {
         protected void a(arb $$0, chr $$1, long $$2) {
            chs.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwn(500, 700), new bvj(cco.P)));
   }

   private static void c(bum<chr> $$0) {
      $$0.a(coh.v, ImmutableList.of(Pair.of(0, new chs.e())), Set.of(Pair.of(cco.Z, ccp.b), Pair.of(cco.aR, ccp.a), Pair.of(cco.m, ccp.a)));
   }

   private static void d(bum<chr> $$0) {
      $$0.a(
         coh.z,
         ImmutableList.of(Pair.of(0, new chs.a(160, 180)), Pair.of(0, new chs.c(40))),
         Set.of(Pair.of(cco.Z, ccp.b), Pair.of(cco.m, ccp.b), Pair.of(cco.aS, ccp.a))
      );
   }

   private static void e(bum<chr> $$0) {
      $$0.a(
         coh.b,
         ImmutableList.of(
            Pair.of(0, new bux(bsv.aR) {
               @Override
               protected void a(arb $$0, cfa $$1, long $$2) {
                  chs.b((chr)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bvq($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(arb $$0, btt $$1, long $$2) {
                  chs.b((chr)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bwj(45, 90)),
            Pair.of(3, new chs.b(40, 100)),
            Pair.of(
               4,
               new bxa(
                  ImmutableList.of(
                     Pair.of(bxk.a(1.0F, 3), 2),
                     Pair.of(new chs.d(40, 80), 1),
                     Pair.of(new chs.f(40, 80), 1),
                     Pair.of(bxc.a(bsv.by, 6.0F), 1),
                     Pair.of(bwv.a(1.0F), 1),
                     Pair.of(new bvn(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cco.aS, ccp.b))
      );
   }

   static void a(chr $$0) {
      $$0.dS().a(ImmutableList.of(coh.z, coh.v, coh.b));
   }

   static class a extends bvd<chr> {
      a(int $$0, int $$1) {
         super(Map.of(cco.Z, ccp.b, cco.m, ccp.b, cco.aS, ccp.a, cco.aG, ccp.b), $$0, $$1);
      }

      protected boolean a(arb $$0, chr $$1) {
         return $$1.gq();
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         return $$1.dS().c(cco.aS).isPresent() && $$1.gy() && !$$1.gu();
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.f);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(cco.aG, azx.a, 9600L);
         } else {
            chs.b($$1);
         }
      }
   }

   static class b extends bvd<chr> {
      b(int $$0, int $$1) {
         super(Map.of(cco.aT, ccp.a), $$0, $$1);
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         return true;
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.b);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.a);
         $$1.dS().b(cco.aT);
      }
   }

   static class c extends bvd<chr> {
      c(int $$0) {
         super(Map.of(cco.Z, ccp.b, cco.m, ccp.b, cco.aS, ccp.a, cco.aG, ccp.a), $$0, $$0);
      }

      protected boolean a(arb $$0, chr $$1) {
         return true;
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         return $$1.dS().c(cco.aS).isPresent();
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.g);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chr.a.a).w($$3);
         $$1.dS().b(cco.aS);
         $$1.dS().a(cco.aT, true);
      }
   }

   static class d extends bvd<chr> {
      d(int $$0, int $$1) {
         super(Map.of(cco.Z, ccp.b, cco.aS, ccp.b, cco.aR, ccp.b, cco.aT, ccp.b, cco.r, ccp.b), $$0, $$1);
      }

      protected boolean a(arb $$0, chr $$1) {
         return !$$1.y();
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         return true;
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.c);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.a);
      }
   }

   static class e extends bvd<chr> {
      e() {
         super(Map.of(cco.m, ccp.a, cco.Z, ccp.b, cco.aR, ccp.a), 600);
      }

      protected boolean a(arb $$0, chr $$1) {
         return $$1.gq();
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         if (!$$1.gq()) {
            $$1.a(chr.a.a);
            return false;
         } else {
            Optional<iz> $$3 = $$1.dS().c(cco.m).map(ccr::a).map(bwr::b);
            Optional<iz> $$4 = $$1.dS().c(cco.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.e);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         if ($$1.gy() && $$1.gq()) {
            $$1.dS().a(cco.aS, true);
         }

         $$1.dS().b(cco.m);
         $$1.dS().b(cco.aR);
      }
   }

   static class f extends bvd<chr> {
      f(int $$0, int $$1) {
         super(Map.of(cco.m, ccp.b, cco.aR, ccp.b, cco.aG, ccp.b), $$0, $$1);
      }

      protected boolean a(arb $$0, chr $$1) {
         return !$$1.p_() && $$1.gq();
      }

      protected boolean a(arb $$0, chr $$1, long $$2) {
         return $$1.gq();
      }

      protected void b(arb $$0, chr $$1, long $$2) {
         $$1.a(chr.a.d);
      }

      protected void c(arb $$0, chr $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chr.a.a);
         if ($$3) {
            $$1.gx().ifPresent($$1x -> {
               $$1.dS().a(cco.aR, $$1x);
               $$1.dS().a(cco.m, new ccr($$1x, 1.25F, 0));
            });
         }
      }
   }
}
