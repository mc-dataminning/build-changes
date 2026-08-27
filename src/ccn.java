import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class ccn {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bys<? extends byr<? super ccm>>> a = ImmutableList.of(bys.c, bys.f, bys.d, bys.y);
   static final List<bxl<?>> b = ImmutableList.of(
      bxl.n, bxl.m, bxl.E, bxl.t, bxl.Z, bxl.aR, bxl.aS, bxl.aT, bxl.aG, bxl.aQ, bxl.h, bxl.r, new bxl[]{bxl.O, bxl.P, bxl.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static csc a() {
      return csc.a(cpg.ve);
   }

   protected static bpj<?> a(bpj<ccm> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ciy.a));
      $$0.b(ciy.b);
      $$0.f();
      return $$0;
   }

   static ccm b(ccm $$0) {
      $$0.dO().b(bxl.aS);
      $$0.dO().b(bxl.aR);
      return $$0.a(ccm.a.a);
   }

   private static void b(bpj<ccm> $$0) {
      $$0.a(ciy.a, 0, ImmutableList.of(new bsu(0.8F), new bpv(2.0F) {
         @Override
         protected void b(aow $$0, boq $$1, long $$2) {
            ccn.b((ccm)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new brk(500, 700), new bqg(bxl.P)));
   }

   private static void c(bpj<ccm> $$0) {
      $$0.a(ciy.v, ImmutableList.of(Pair.of(0, new ccn.e())), Set.of(Pair.of(bxl.Z, bxm.b), Pair.of(bxl.aR, bxm.a), Pair.of(bxl.m, bxm.a)));
   }

   private static void d(bpj<ccm> $$0) {
      $$0.a(
         ciy.z,
         ImmutableList.of(Pair.of(0, new ccn.a(160, 180)), Pair.of(0, new ccn.c(40))),
         Set.of(Pair.of(bxl.Z, bxm.b), Pair.of(bxl.m, bxm.b), Pair.of(bxl.aS, bxm.a))
      );
   }

   private static void e(bpj<ccm> $$0) {
      $$0.a(
         ciy.b,
         ImmutableList.of(
            Pair.of(0, new bpu(bnw.aP) {
               @Override
               protected void a(aow $$0, bzx $$1, long $$2) {
                  ccn.b((ccm)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bqn($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(aow $$0, boq $$1, long $$2) {
                  ccn.b((ccm)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new brg(45, 90)),
            Pair.of(3, new ccn.b(40, 100)),
            Pair.of(
               4,
               new brx(
                  ImmutableList.of(
                     Pair.of(bsh.a(1.0F, 3), 2),
                     Pair.of(new ccn.d(40, 80), 1),
                     Pair.of(new ccn.f(40, 80), 1),
                     Pair.of(brz.a(bnw.bw, 6.0F), 1),
                     Pair.of(brs.a(1.0F), 1),
                     Pair.of(new bqk(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bxl.aS, bxm.b))
      );
   }

   static void a(ccm $$0) {
      $$0.dO().a(ImmutableList.of(ciy.z, ciy.v, ciy.b));
   }

   static class a extends bqa<ccm> {
      a(int $$0, int $$1) {
         super(Map.of(bxl.Z, bxm.b, bxl.m, bxm.b, bxl.aS, bxm.a, bxl.aG, bxm.b), $$0, $$1);
      }

      protected boolean a(aow $$0, ccm $$1) {
         return $$1.gg();
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         return $$1.dO().c(bxl.aS).isPresent() && $$1.go() && !$$1.gk();
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.f);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bxl.aG, axk.a, 9600L);
         } else {
            ccn.b($$1);
         }
      }
   }

   static class b extends bqa<ccm> {
      b(int $$0, int $$1) {
         super(Map.of(bxl.aT, bxm.a), $$0, $$1);
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         return true;
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.b);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.a);
         $$1.dO().b(bxl.aT);
      }
   }

   static class c extends bqa<ccm> {
      c(int $$0) {
         super(Map.of(bxl.Z, bxm.b, bxl.m, bxm.b, bxl.aS, bxm.a, bxl.aG, bxm.a), $$0, $$0);
      }

      protected boolean a(aow $$0, ccm $$1) {
         return true;
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         return $$1.dO().c(bxl.aS).isPresent();
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.g);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ccm.a.a).w($$3);
         $$1.dO().b(bxl.aS);
         $$1.dO().a(bxl.aT, true);
      }
   }

   static class d extends bqa<ccm> {
      d(int $$0, int $$1) {
         super(Map.of(bxl.Z, bxm.b, bxl.aS, bxm.b, bxl.aR, bxm.b, bxl.aT, bxm.b, bxl.r, bxm.b), $$0, $$1);
      }

      protected boolean a(aow $$0, ccm $$1) {
         return !$$1.A();
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         return true;
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.c);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.a);
      }
   }

   static class e extends bqa<ccm> {
      e() {
         super(Map.of(bxl.m, bxm.a, bxl.Z, bxm.b, bxl.aR, bxm.a), 600);
      }

      protected boolean a(aow $$0, ccm $$1) {
         return $$1.gg();
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         if (!$$1.gg()) {
            $$1.a(ccm.a.a);
            return false;
         } else {
            Optional<hz> $$3 = $$1.dO().c(bxl.m).map(bxo::a).map(bro::b);
            Optional<hz> $$4 = $$1.dO().c(bxl.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.e);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         if ($$1.go() && $$1.gg()) {
            $$1.dO().a(bxl.aS, true);
         }

         $$1.dO().b(bxl.m);
         $$1.dO().b(bxl.aR);
      }
   }

   static class f extends bqa<ccm> {
      f(int $$0, int $$1) {
         super(Map.of(bxl.m, bxm.b, bxl.aR, bxm.b, bxl.aG, bxm.b), $$0, $$1);
      }

      protected boolean a(aow $$0, ccm $$1) {
         return !$$1.o_() && $$1.gg();
      }

      protected boolean a(aow $$0, ccm $$1, long $$2) {
         return $$1.gg();
      }

      protected void b(aow $$0, ccm $$1, long $$2) {
         $$1.a(ccm.a.d);
      }

      protected void c(aow $$0, ccm $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ccm.a.a);
         if ($$3) {
            $$1.gn().ifPresent($$1x -> {
               $$1.dO().a(bxl.aR, $$1x);
               $$1.dO().a(bxl.m, new bxo($$1x, 1.25F, 0));
            });
         }
      }
   }
}
