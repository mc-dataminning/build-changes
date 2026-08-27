import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bxe {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<btm<? extends btl<? super bxd>>> a = ImmutableList.of(btm.c, btm.f, btm.d, btm.w);
   static final List<bsh<?>> b = ImmutableList.of(
      bsh.n, bsh.m, bsh.E, bsh.t, bsh.Y, bsh.aQ, bsh.aR, bsh.aS, bsh.aF, bsh.aP, bsh.h, bsh.r, new bsh[]{bsh.N, bsh.O, bsh.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cmg a() {
      return cmg.a(cji.uo);
   }

   protected static bkg<?> a(bkg<bxd> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cdf.a));
      $$0.b(cdf.b);
      $$0.f();
      return $$0;
   }

   static bxd b(bxd $$0) {
      $$0.dN().b(bsh.aR);
      $$0.dN().b(bsh.aQ);
      return $$0.a(bxd.a.a);
   }

   private static void b(bkg<bxd> $$0) {
      $$0.a(cdf.a, 0, ImmutableList.of(new bnq(0.8F), new bks(2.0F) {
         @Override
         protected void b(akr $$0, bjp $$1, long $$2) {
            bxe.b((bxd)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bmg(500, 700), new bld(bsh.O)));
   }

   private static void c(bkg<bxd> $$0) {
      $$0.a(cdf.v, ImmutableList.of(Pair.of(0, new bxe.e())), Set.of(Pair.of(bsh.Y, bsi.b), Pair.of(bsh.aQ, bsi.a), Pair.of(bsh.m, bsi.a)));
   }

   private static void d(bkg<bxd> $$0) {
      $$0.a(
         cdf.z,
         ImmutableList.of(Pair.of(0, new bxe.a(160, 180)), Pair.of(0, new bxe.c(40))),
         Set.of(Pair.of(bsh.Y, bsi.b), Pair.of(bsh.m, bsi.b), Pair.of(bsh.aR, bsi.a))
      );
   }

   private static void e(bkg<bxd> $$0) {
      $$0.a(
         cdf.b,
         ImmutableList.of(
            Pair.of(0, new bkr(biu.aN, 1.0F) {
               @Override
               protected void a(akr $$0, bur $$1, long $$2) {
                  bxe.b((bxd)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blk($$0x -> 1.25F, $$0x -> $$0x.m_() ? 2.5 : 3.5) {
               @Override
               protected void b(akr $$0, bjp $$1, long $$2) {
                  bxe.b((bxd)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bmc(45, 90)),
            Pair.of(3, new bxe.b(40, 100)),
            Pair.of(
               4,
               new bmt(
                  ImmutableList.of(
                     Pair.of(bnd.a(1.0F, 3), 2),
                     Pair.of(new bxe.d(40, 80), 1),
                     Pair.of(new bxe.f(40, 80), 1),
                     Pair.of(bmv.a(biu.bt, 6.0F), 1),
                     Pair.of(bmo.a(1.0F), 1),
                     Pair.of(new blh(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bsh.aR, bsi.b))
      );
   }

   static void a(bxd $$0) {
      $$0.dN().a(ImmutableList.of(cdf.z, cdf.v, cdf.b));
   }

   static class a extends bkx<bxd> {
      a(int $$0, int $$1) {
         super(Map.of(bsh.Y, bsi.b, bsh.m, bsi.b, bsh.aR, bsi.a, bsh.aF, bsi.b), $$0, $$1);
      }

      protected boolean a(akr $$0, bxd $$1) {
         return $$1.gd();
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         return $$1.dN().c(bsh.aR).isPresent() && $$1.gl() && !$$1.gh();
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.f);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(bsh.aF, asx.a, 9600L);
         } else {
            bxe.b($$1);
         }
      }
   }

   static class b extends bkx<bxd> {
      b(int $$0, int $$1) {
         super(Map.of(bsh.aS, bsi.a), $$0, $$1);
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         return true;
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.b);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.a);
         $$1.dN().b(bsh.aS);
      }
   }

   static class c extends bkx<bxd> {
      c(int $$0) {
         super(Map.of(bsh.Y, bsi.b, bsh.m, bsi.b, bsh.aR, bsi.a, bsh.aF, bsi.a), $$0, $$0);
      }

      protected boolean a(akr $$0, bxd $$1) {
         return true;
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         return $$1.dN().c(bsh.aR).isPresent();
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.g);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxd.a.a).w($$3);
         $$1.dN().b(bsh.aR);
         $$1.dN().a(bsh.aS, true);
      }
   }

   static class d extends bkx<bxd> {
      d(int $$0, int $$1) {
         super(Map.of(bsh.Y, bsi.b, bsh.aR, bsi.b, bsh.aQ, bsi.b, bsh.aS, bsi.b, bsh.r, bsi.b), $$0, $$1);
      }

      protected boolean a(akr $$0, bxd $$1) {
         return !$$1.y();
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         return true;
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.c);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.a);
      }
   }

   static class e extends bkx<bxd> {
      e() {
         super(Map.of(bsh.m, bsi.a, bsh.Y, bsi.b, bsh.aQ, bsi.a), 600);
      }

      protected boolean a(akr $$0, bxd $$1) {
         return $$1.gd();
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         if (!$$1.gd()) {
            $$1.a(bxd.a.a);
            return false;
         } else {
            Optional<gw> $$3 = $$1.dN().c(bsh.m).map(bsk::a).map(bmk::b);
            Optional<gw> $$4 = $$1.dN().c(bsh.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.e);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         if ($$1.gl() && $$1.gd()) {
            $$1.dN().a(bsh.aR, true);
         }

         $$1.dN().b(bsh.m);
         $$1.dN().b(bsh.aQ);
      }
   }

   static class f extends bkx<bxd> {
      f(int $$0, int $$1) {
         super(Map.of(bsh.m, bsi.b, bsh.aQ, bsi.b, bsh.aF, bsi.b), $$0, $$1);
      }

      protected boolean a(akr $$0, bxd $$1) {
         return !$$1.m_() && $$1.gd();
      }

      protected boolean a(akr $$0, bxd $$1, long $$2) {
         return $$1.gd();
      }

      protected void b(akr $$0, bxd $$1, long $$2) {
         $$1.a(bxd.a.d);
      }

      protected void c(akr $$0, bxd $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxd.a.a);
         if ($$3) {
            $$1.gk().ifPresent($$1x -> {
               $$1.dN().a(bsh.aQ, $$1x);
               $$1.dN().a(bsh.m, new bsk($$1x, 1.25F, 0));
            });
         }
      }
   }
}
