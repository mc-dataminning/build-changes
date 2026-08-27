import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bzv {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bwd<? extends bwc<? super bzu>>> a = ImmutableList.of(bwd.c, bwd.f, bwd.d, bwd.w);
   static final List<bux<?>> b = ImmutableList.of(
      bux.n, bux.m, bux.E, bux.t, bux.Y, bux.aQ, bux.aR, bux.aS, bux.aF, bux.aP, bux.h, bux.r, new bux[]{bux.N, bux.O, bux.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cpi a() {
      return cpi.a(cmk.vb);
   }

   protected static bmv<?> a(bmv<bzu> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cgd.a));
      $$0.b(cgd.b);
      $$0.f();
      return $$0;
   }

   static bzu b(bzu $$0) {
      $$0.dO().b(bux.aR);
      $$0.dO().b(bux.aQ);
      return $$0.a(bzu.a.a);
   }

   private static void b(bmv<bzu> $$0) {
      $$0.a(cgd.a, 0, ImmutableList.of(new bqg(0.8F), new bnh(2.0F) {
         @Override
         protected void b(amp $$0, bme $$1, long $$2) {
            bzv.b((bzu)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bow(500, 700), new bns(bux.O)));
   }

   private static void c(bmv<bzu> $$0) {
      $$0.a(cgd.v, ImmutableList.of(Pair.of(0, new bzv.e())), Set.of(Pair.of(bux.Y, buy.b), Pair.of(bux.aQ, buy.a), Pair.of(bux.m, buy.a)));
   }

   private static void d(bmv<bzu> $$0) {
      $$0.a(
         cgd.z,
         ImmutableList.of(Pair.of(0, new bzv.a(160, 180)), Pair.of(0, new bzv.c(40))),
         Set.of(Pair.of(bux.Y, buy.b), Pair.of(bux.m, buy.b), Pair.of(bux.aR, buy.a))
      );
   }

   private static void e(bmv<bzu> $$0) {
      $$0.a(
         cgd.b,
         ImmutableList.of(
            Pair.of(0, new bng(blj.aO, 1.0F) {
               @Override
               protected void a(amp $$0, bxi $$1, long $$2) {
                  bzv.b((bzu)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bnz($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(amp $$0, bme $$1, long $$2) {
                  bzv.b((bzu)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bos(45, 90)),
            Pair.of(3, new bzv.b(40, 100)),
            Pair.of(
               4,
               new bpj(
                  ImmutableList.of(
                     Pair.of(bpt.a(1.0F, 3), 2),
                     Pair.of(new bzv.d(40, 80), 1),
                     Pair.of(new bzv.f(40, 80), 1),
                     Pair.of(bpl.a(blj.bv, 6.0F), 1),
                     Pair.of(bpe.a(1.0F), 1),
                     Pair.of(new bnw(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bux.aR, buy.b))
      );
   }

   static void a(bzu $$0) {
      $$0.dO().a(ImmutableList.of(cgd.z, cgd.v, cgd.b));
   }

   static class a extends bnm<bzu> {
      a(int $$0, int $$1) {
         super(Map.of(bux.Y, buy.b, bux.m, buy.b, bux.aR, buy.a, bux.aF, buy.b), $$0, $$1);
      }

      protected boolean a(amp $$0, bzu $$1) {
         return $$1.ge();
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         return $$1.dO().c(bux.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.f);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dO().a(bux.aF, avc.a, 9600L);
         } else {
            bzv.b($$1);
         }
      }
   }

   static class b extends bnm<bzu> {
      b(int $$0, int $$1) {
         super(Map.of(bux.aS, buy.a), $$0, $$1);
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         return true;
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.b);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.a);
         $$1.dO().b(bux.aS);
      }
   }

   static class c extends bnm<bzu> {
      c(int $$0) {
         super(Map.of(bux.Y, buy.b, bux.m, buy.b, bux.aR, buy.a, bux.aF, buy.a), $$0, $$0);
      }

      protected boolean a(amp $$0, bzu $$1) {
         return true;
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         return $$1.dO().c(bux.aR).isPresent();
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.g);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzu.a.a).w($$3);
         $$1.dO().b(bux.aR);
         $$1.dO().a(bux.aS, true);
      }
   }

   static class d extends bnm<bzu> {
      d(int $$0, int $$1) {
         super(Map.of(bux.Y, buy.b, bux.aR, buy.b, bux.aQ, buy.b, bux.aS, buy.b, bux.r, buy.b), $$0, $$1);
      }

      protected boolean a(amp $$0, bzu $$1) {
         return !$$1.A();
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         return true;
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.c);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.a);
      }
   }

   static class e extends bnm<bzu> {
      e() {
         super(Map.of(bux.m, buy.a, bux.Y, buy.b, bux.aQ, buy.a), 600);
      }

      protected boolean a(amp $$0, bzu $$1) {
         return $$1.ge();
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(bzu.a.a);
            return false;
         } else {
            Optional<hv> $$3 = $$1.dO().c(bux.m).map(bva::a).map(bpa::b);
            Optional<hv> $$4 = $$1.dO().c(bux.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.e);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dO().a(bux.aR, true);
         }

         $$1.dO().b(bux.m);
         $$1.dO().b(bux.aQ);
      }
   }

   static class f extends bnm<bzu> {
      f(int $$0, int $$1) {
         super(Map.of(bux.m, buy.b, bux.aQ, buy.b, bux.aF, buy.b), $$0, $$1);
      }

      protected boolean a(amp $$0, bzu $$1) {
         return !$$1.o_() && $$1.ge();
      }

      protected boolean a(amp $$0, bzu $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(amp $$0, bzu $$1, long $$2) {
         $$1.a(bzu.a.d);
      }

      protected void c(amp $$0, bzu $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzu.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dO().a(bux.aQ, $$1x);
               $$1.dO().a(bux.m, new bva($$1x, 1.25F, 0));
            });
         }
      }
   }
}
