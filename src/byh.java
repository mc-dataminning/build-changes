import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class byh {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bup<? extends buo<? super byg>>> a = ImmutableList.of(bup.c, bup.f, bup.d, bup.w);
   static final List<btk<?>> b = ImmutableList.of(
      btk.n, btk.m, btk.E, btk.t, btk.Y, btk.aQ, btk.aR, btk.aS, btk.aF, btk.aP, btk.h, btk.r, new btk[]{btk.N, btk.O, btk.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cnk a() {
      return cnk.a(ckm.uo);
   }

   protected static blj<?> a(blj<byg> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cei.a));
      $$0.b(cei.b);
      $$0.f();
      return $$0;
   }

   static byg b(byg $$0) {
      $$0.dN().b(btk.aR);
      $$0.dN().b(btk.aQ);
      return $$0.a(byg.a.a);
   }

   private static void b(blj<byg> $$0) {
      $$0.a(cei.a, 0, ImmutableList.of(new bot(0.8F), new blv(2.0F) {
         @Override
         protected void b(alq $$0, bks $$1, long $$2) {
            byh.b((byg)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bnj(500, 700), new bmg(btk.O)));
   }

   private static void c(blj<byg> $$0) {
      $$0.a(cei.v, ImmutableList.of(Pair.of(0, new byh.e())), Set.of(Pair.of(btk.Y, btl.b), Pair.of(btk.aQ, btl.a), Pair.of(btk.m, btl.a)));
   }

   private static void d(blj<byg> $$0) {
      $$0.a(
         cei.z,
         ImmutableList.of(Pair.of(0, new byh.a(160, 180)), Pair.of(0, new byh.c(40))),
         Set.of(Pair.of(btk.Y, btl.b), Pair.of(btk.m, btl.b), Pair.of(btk.aR, btl.a))
      );
   }

   private static void e(blj<byg> $$0) {
      $$0.a(
         cei.b,
         ImmutableList.of(
            Pair.of(0, new blu(bjx.aN, 1.0F) {
               @Override
               protected void a(alq $$0, bvu $$1, long $$2) {
                  byh.b((byg)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bmn($$0x -> 1.25F, $$0x -> $$0x.n_() ? 2.5 : 3.5) {
               @Override
               protected void b(alq $$0, bks $$1, long $$2) {
                  byh.b((byg)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bnf(45, 90)),
            Pair.of(3, new byh.b(40, 100)),
            Pair.of(
               4,
               new bnw(
                  ImmutableList.of(
                     Pair.of(bog.a(1.0F, 3), 2),
                     Pair.of(new byh.d(40, 80), 1),
                     Pair.of(new byh.f(40, 80), 1),
                     Pair.of(bny.a(bjx.bt, 6.0F), 1),
                     Pair.of(bnr.a(1.0F), 1),
                     Pair.of(new bmk(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(btk.aR, btl.b))
      );
   }

   static void a(byg $$0) {
      $$0.dN().a(ImmutableList.of(cei.z, cei.v, cei.b));
   }

   static class a extends bma<byg> {
      a(int $$0, int $$1) {
         super(Map.of(btk.Y, btl.b, btk.m, btl.b, btk.aR, btl.a, btk.aF, btl.b), $$0, $$1);
      }

      protected boolean a(alq $$0, byg $$1) {
         return $$1.ge();
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         return $$1.dN().c(btk.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.f);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(btk.aF, atz.a, 9600L);
         } else {
            byh.b($$1);
         }
      }
   }

   static class b extends bma<byg> {
      b(int $$0, int $$1) {
         super(Map.of(btk.aS, btl.a), $$0, $$1);
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         return true;
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.b);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.a);
         $$1.dN().b(btk.aS);
      }
   }

   static class c extends bma<byg> {
      c(int $$0) {
         super(Map.of(btk.Y, btl.b, btk.m, btl.b, btk.aR, btl.a, btk.aF, btl.a), $$0, $$0);
      }

      protected boolean a(alq $$0, byg $$1) {
         return true;
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         return $$1.dN().c(btk.aR).isPresent();
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.g);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(byg.a.a).w($$3);
         $$1.dN().b(btk.aR);
         $$1.dN().a(btk.aS, true);
      }
   }

   static class d extends bma<byg> {
      d(int $$0, int $$1) {
         super(Map.of(btk.Y, btl.b, btk.aR, btl.b, btk.aQ, btl.b, btk.aS, btl.b, btk.r, btl.b), $$0, $$1);
      }

      protected boolean a(alq $$0, byg $$1) {
         return !$$1.y();
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         return true;
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.c);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.a);
      }
   }

   static class e extends bma<byg> {
      e() {
         super(Map.of(btk.m, btl.a, btk.Y, btl.b, btk.aQ, btl.a), 600);
      }

      protected boolean a(alq $$0, byg $$1) {
         return $$1.ge();
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(byg.a.a);
            return false;
         } else {
            Optional<ht> $$3 = $$1.dN().c(btk.m).map(btn::a).map(bnn::b);
            Optional<ht> $$4 = $$1.dN().c(btk.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.e);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dN().a(btk.aR, true);
         }

         $$1.dN().b(btk.m);
         $$1.dN().b(btk.aQ);
      }
   }

   static class f extends bma<byg> {
      f(int $$0, int $$1) {
         super(Map.of(btk.m, btl.b, btk.aQ, btl.b, btk.aF, btl.b), $$0, $$1);
      }

      protected boolean a(alq $$0, byg $$1) {
         return !$$1.n_() && $$1.ge();
      }

      protected boolean a(alq $$0, byg $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(alq $$0, byg $$1, long $$2) {
         $$1.a(byg.a.d);
      }

      protected void c(alq $$0, byg $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(byg.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dN().a(btk.aQ, $$1x);
               $$1.dN().a(btk.m, new btn($$1x, 1.25F, 0));
            });
         }
      }
   }
}
