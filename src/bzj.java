import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bzj {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bvr<? extends bvq<? super bzi>>> a = ImmutableList.of(bvr.c, bvr.f, bvr.d, bvr.w);
   static final List<bum<?>> b = ImmutableList.of(
      bum.n, bum.m, bum.E, bum.t, bum.Y, bum.aQ, bum.aR, bum.aS, bum.aF, bum.aP, bum.h, bum.r, new bum[]{bum.N, bum.O, bum.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static coq a() {
      return coq.a(clr.va);
   }

   protected static bml<?> a(bml<bzi> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cfk.a));
      $$0.b(cfk.b);
      $$0.f();
      return $$0;
   }

   static bzi b(bzi $$0) {
      $$0.dP().b(bum.aR);
      $$0.dP().b(bum.aQ);
      return $$0.a(bzi.a.a);
   }

   private static void b(bml<bzi> $$0) {
      $$0.a(cfk.a, 0, ImmutableList.of(new bpv(0.8F), new bmx(2.0F) {
         @Override
         protected void b(ami $$0, blu $$1, long $$2) {
            bzj.b((bzi)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bol(500, 700), new bni(bum.O)));
   }

   private static void c(bml<bzi> $$0) {
      $$0.a(cfk.v, ImmutableList.of(Pair.of(0, new bzj.e())), Set.of(Pair.of(bum.Y, bun.b), Pair.of(bum.aQ, bun.a), Pair.of(bum.m, bun.a)));
   }

   private static void d(bml<bzi> $$0) {
      $$0.a(
         cfk.z,
         ImmutableList.of(Pair.of(0, new bzj.a(160, 180)), Pair.of(0, new bzj.c(40))),
         Set.of(Pair.of(bum.Y, bun.b), Pair.of(bum.m, bun.b), Pair.of(bum.aR, bun.a))
      );
   }

   private static void e(bml<bzi> $$0) {
      $$0.a(
         cfk.b,
         ImmutableList.of(
            Pair.of(0, new bmw(bkz.aN, 1.0F) {
               @Override
               protected void a(ami $$0, bww $$1, long $$2) {
                  bzj.b((bzi)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bnp($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(ami $$0, blu $$1, long $$2) {
                  bzj.b((bzi)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new boh(45, 90)),
            Pair.of(3, new bzj.b(40, 100)),
            Pair.of(
               4,
               new boy(
                  ImmutableList.of(
                     Pair.of(bpi.a(1.0F, 3), 2),
                     Pair.of(new bzj.d(40, 80), 1),
                     Pair.of(new bzj.f(40, 80), 1),
                     Pair.of(bpa.a(bkz.bt, 6.0F), 1),
                     Pair.of(bot.a(1.0F), 1),
                     Pair.of(new bnm(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bum.aR, bun.b))
      );
   }

   static void a(bzi $$0) {
      $$0.dP().a(ImmutableList.of(cfk.z, cfk.v, cfk.b));
   }

   static class a extends bnc<bzi> {
      a(int $$0, int $$1) {
         super(Map.of(bum.Y, bun.b, bum.m, bun.b, bum.aR, bun.a, bum.aF, bun.b), $$0, $$1);
      }

      protected boolean a(ami $$0, bzi $$1) {
         return $$1.gf();
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         return $$1.dP().c(bum.aR).isPresent() && $$1.gn() && !$$1.gj();
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.f);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(bum.aF, aus.a, 9600L);
         } else {
            bzj.b($$1);
         }
      }
   }

   static class b extends bnc<bzi> {
      b(int $$0, int $$1) {
         super(Map.of(bum.aS, bun.a), $$0, $$1);
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         return true;
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.b);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.a);
         $$1.dP().b(bum.aS);
      }
   }

   static class c extends bnc<bzi> {
      c(int $$0) {
         super(Map.of(bum.Y, bun.b, bum.m, bun.b, bum.aR, bun.a, bum.aF, bun.a), $$0, $$0);
      }

      protected boolean a(ami $$0, bzi $$1) {
         return true;
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         return $$1.dP().c(bum.aR).isPresent();
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.g);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzi.a.a).w($$3);
         $$1.dP().b(bum.aR);
         $$1.dP().a(bum.aS, true);
      }
   }

   static class d extends bnc<bzi> {
      d(int $$0, int $$1) {
         super(Map.of(bum.Y, bun.b, bum.aR, bun.b, bum.aQ, bun.b, bum.aS, bun.b, bum.r, bun.b), $$0, $$1);
      }

      protected boolean a(ami $$0, bzi $$1) {
         return !$$1.A();
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         return true;
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.c);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.a);
      }
   }

   static class e extends bnc<bzi> {
      e() {
         super(Map.of(bum.m, bun.a, bum.Y, bun.b, bum.aQ, bun.a), 600);
      }

      protected boolean a(ami $$0, bzi $$1) {
         return $$1.gf();
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         if (!$$1.gf()) {
            $$1.a(bzi.a.a);
            return false;
         } else {
            Optional<hx> $$3 = $$1.dP().c(bum.m).map(bup::a).map(bop::b);
            Optional<hx> $$4 = $$1.dP().c(bum.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.e);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         if ($$1.gn() && $$1.gf()) {
            $$1.dP().a(bum.aR, true);
         }

         $$1.dP().b(bum.m);
         $$1.dP().b(bum.aQ);
      }
   }

   static class f extends bnc<bzi> {
      f(int $$0, int $$1) {
         super(Map.of(bum.m, bun.b, bum.aQ, bun.b, bum.aF, bun.b), $$0, $$1);
      }

      protected boolean a(ami $$0, bzi $$1) {
         return !$$1.o_() && $$1.gf();
      }

      protected boolean a(ami $$0, bzi $$1, long $$2) {
         return $$1.gf();
      }

      protected void b(ami $$0, bzi $$1, long $$2) {
         $$1.a(bzi.a.d);
      }

      protected void c(ami $$0, bzi $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bzi.a.a);
         if ($$3) {
            $$1.gm().ifPresent($$1x -> {
               $$1.dP().a(bum.aQ, $$1x);
               $$1.dP().a(bum.m, new bup($$1x, 1.25F, 0));
            });
         }
      }
   }
}
