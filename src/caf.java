import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class caf {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bwn<? extends bwm<? super cae>>> a = ImmutableList.of(bwn.c, bwn.f, bwn.d, bwn.w);
   static final List<bvh<?>> b = ImmutableList.of(
      bvh.n, bvh.m, bvh.E, bvh.t, bvh.Y, bvh.aQ, bvh.aR, bvh.aS, bvh.aF, bvh.aP, bvh.h, bvh.r, new bvh[]{bvh.N, bvh.O, bvh.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cps a() {
      return cps.a(cmu.vb);
   }

   protected static bnf<?> a(bnf<cae> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cgn.a));
      $$0.b(cgn.b);
      $$0.f();
      return $$0;
   }

   static cae b(cae $$0) {
      $$0.dO().b(bvh.aR);
      $$0.dO().b(bvh.aQ);
      return $$0.a(cae.a.a);
   }

   private static void b(bnf<cae> $$0) {
      $$0.a(cgn.a, 0, ImmutableList.of(new bqq(0.8F), new bnr(2.0F) {
         @Override
         protected void b(amz $$0, bmo $$1, long $$2) {
            caf.b((cae)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bpg(500, 700), new boc(bvh.O)));
   }

   private static void c(bnf<cae> $$0) {
      $$0.a(cgn.v, ImmutableList.of(Pair.of(0, new caf.e())), Set.of(Pair.of(bvh.Y, bvi.b), Pair.of(bvh.aQ, bvi.a), Pair.of(bvh.m, bvi.a)));
   }

   private static void d(bnf<cae> $$0) {
      $$0.a(
         cgn.z,
         ImmutableList.of(Pair.of(0, new caf.a(160, 180)), Pair.of(0, new caf.c(40))),
         Set.of(Pair.of(bvh.Y, bvi.b), Pair.of(bvh.m, bvi.b), Pair.of(bvh.aR, bvi.a))
      );
   }

   private static void e(bnf<cae> $$0) {
      $$0.a(
         cgn.b,
         ImmutableList.of(
            Pair.of(0, new bnq(blt.aO, 1.0F) {
               @Override
               protected void a(amz $$0, bxs $$1, long $$2) {
                  caf.b((cae)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new boj($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(amz $$0, bmo $$1, long $$2) {
                  caf.b((cae)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bpc(45, 90)),
            Pair.of(3, new caf.b(40, 100)),
            Pair.of(
               4,
               new bpt(
                  ImmutableList.of(
                     Pair.of(bqd.a(1.0F, 3), 2),
                     Pair.of(new caf.d(40, 80), 1),
                     Pair.of(new caf.f(40, 80), 1),
                     Pair.of(bpv.a(blt.bv, 6.0F), 1),
                     Pair.of(bpo.a(1.0F), 1),
                     Pair.of(new bog(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bvh.aR, bvi.b))
      );
   }

   static void a(cae $$0) {
      $$0.dO().a(ImmutableList.of(cgn.z, cgn.v, cgn.b));
   }

   static class a extends bnw<cae> {
      a(int $$0, int $$1) {
         super(Map.of(bvh.Y, bvi.b, bvh.m, bvi.b, bvh.aR, bvi.a, bvh.aF, bvi.b), $$0, $$1);
      }

      protected boolean a(amz $$0, cae $$1) {
         return $$1.ge();
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         return $$1.dO().c(bvh.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.f);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bvh.aF, avm.a, 9600L);
         } else {
            caf.b($$1);
         }
      }
   }

   static class b extends bnw<cae> {
      b(int $$0, int $$1) {
         super(Map.of(bvh.aS, bvi.a), $$0, $$1);
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         return true;
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.b);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.a);
         $$1.dO().b(bvh.aS);
      }
   }

   static class c extends bnw<cae> {
      c(int $$0) {
         super(Map.of(bvh.Y, bvi.b, bvh.m, bvi.b, bvh.aR, bvi.a, bvh.aF, bvi.a), $$0, $$0);
      }

      protected boolean a(amz $$0, cae $$1) {
         return true;
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         return $$1.dO().c(bvh.aR).isPresent();
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.g);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cae.a.a).w($$3);
         $$1.dO().b(bvh.aR);
         $$1.dO().a(bvh.aS, true);
      }
   }

   static class d extends bnw<cae> {
      d(int $$0, int $$1) {
         super(Map.of(bvh.Y, bvi.b, bvh.aR, bvi.b, bvh.aQ, bvi.b, bvh.aS, bvi.b, bvh.r, bvi.b), $$0, $$1);
      }

      protected boolean a(amz $$0, cae $$1) {
         return !$$1.A();
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         return true;
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.c);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.a);
      }
   }

   static class e extends bnw<cae> {
      e() {
         super(Map.of(bvh.m, bvi.a, bvh.Y, bvi.b, bvh.aQ, bvi.a), 600);
      }

      protected boolean a(amz $$0, cae $$1) {
         return $$1.ge();
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(cae.a.a);
            return false;
         } else {
            Optional<hx> $$3 = $$1.dO().c(bvh.m).map(bvk::a).map(bpk::b);
            Optional<hx> $$4 = $$1.dO().c(bvh.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.e);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dO().a(bvh.aR, true);
         }

         $$1.dO().b(bvh.m);
         $$1.dO().b(bvh.aQ);
      }
   }

   static class f extends bnw<cae> {
      f(int $$0, int $$1) {
         super(Map.of(bvh.m, bvi.b, bvh.aQ, bvi.b, bvh.aF, bvi.b), $$0, $$1);
      }

      protected boolean a(amz $$0, cae $$1) {
         return !$$1.o_() && $$1.ge();
      }

      protected boolean a(amz $$0, cae $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(amz $$0, cae $$1, long $$2) {
         $$1.a(cae.a.d);
      }

      protected void c(amz $$0, cae $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cae.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dO().a(bvh.aQ, $$1x);
               $$1.dO().a(bvh.m, new bvk($$1x, 1.25F, 0));
            });
         }
      }
   }
}
