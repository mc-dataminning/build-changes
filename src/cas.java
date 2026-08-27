import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cas {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bwx<? extends bww<? super car>>> a = ImmutableList.of(bwx.c, bwx.f, bwx.d, bwx.y);
   static final List<bvq<?>> b = ImmutableList.of(
      bvq.n, bvq.m, bvq.E, bvq.t, bvq.Z, bvq.aR, bvq.aS, bvq.aT, bvq.aG, bvq.aQ, bvq.h, bvq.r, new bvq[]{bvq.O, bvq.P, bvq.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cqh a() {
      return cqh.a(cnj.ve);
   }

   protected static bno<?> a(bno<car> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(chc.a));
      $$0.b(chc.b);
      $$0.f();
      return $$0;
   }

   static car b(car $$0) {
      $$0.dN().b(bvq.aS);
      $$0.dN().b(bvq.aR);
      return $$0.a(car.a.a);
   }

   private static void b(bno<car> $$0) {
      $$0.a(chc.a, 0, ImmutableList.of(new bqz(0.8F), new boa(2.0F) {
         @Override
         protected void b(ane $$0, bmx $$1, long $$2) {
            cas.b((car)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bpp(500, 700), new bol(bvq.P)));
   }

   private static void c(bno<car> $$0) {
      $$0.a(chc.v, ImmutableList.of(Pair.of(0, new cas.e())), Set.of(Pair.of(bvq.Z, bvr.b), Pair.of(bvq.aR, bvr.a), Pair.of(bvq.m, bvr.a)));
   }

   private static void d(bno<car> $$0) {
      $$0.a(
         chc.z,
         ImmutableList.of(Pair.of(0, new cas.a(160, 180)), Pair.of(0, new cas.c(40))),
         Set.of(Pair.of(bvq.Z, bvr.b), Pair.of(bvq.m, bvr.b), Pair.of(bvq.aS, bvr.a))
      );
   }

   private static void e(bno<car> $$0) {
      $$0.a(
         chc.b,
         ImmutableList.of(
            Pair.of(0, new bnz(bmc.aP, 1.0F) {
               @Override
               protected void a(ane $$0, byc $$1, long $$2) {
                  cas.b((car)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bos($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(ane $$0, bmx $$1, long $$2) {
                  cas.b((car)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bpl(45, 90)),
            Pair.of(3, new cas.b(40, 100)),
            Pair.of(
               4,
               new bqc(
                  ImmutableList.of(
                     Pair.of(bqm.a(1.0F, 3), 2),
                     Pair.of(new cas.d(40, 80), 1),
                     Pair.of(new cas.f(40, 80), 1),
                     Pair.of(bqe.a(bmc.bw, 6.0F), 1),
                     Pair.of(bpx.a(1.0F), 1),
                     Pair.of(new bop(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bvq.aS, bvr.b))
      );
   }

   static void a(car $$0) {
      $$0.dN().a(ImmutableList.of(chc.z, chc.v, chc.b));
   }

   static class a extends bof<car> {
      a(int $$0, int $$1) {
         super(Map.of(bvq.Z, bvr.b, bvq.m, bvr.b, bvq.aS, bvr.a, bvq.aG, bvr.b), $$0, $$1);
      }

      protected boolean a(ane $$0, car $$1) {
         return $$1.gf();
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         return $$1.dN().c(bvq.aS).isPresent() && $$1.gn() && !$$1.gj();
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.f);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(bvq.aG, avt.a, 9600L);
         } else {
            cas.b($$1);
         }
      }
   }

   static class b extends bof<car> {
      b(int $$0, int $$1) {
         super(Map.of(bvq.aT, bvr.a), $$0, $$1);
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         return true;
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.b);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.a);
         $$1.dN().b(bvq.aT);
      }
   }

   static class c extends bof<car> {
      c(int $$0) {
         super(Map.of(bvq.Z, bvr.b, bvq.m, bvr.b, bvq.aS, bvr.a, bvq.aG, bvr.a), $$0, $$0);
      }

      protected boolean a(ane $$0, car $$1) {
         return true;
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         return $$1.dN().c(bvq.aS).isPresent();
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.g);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(car.a.a).w($$3);
         $$1.dN().b(bvq.aS);
         $$1.dN().a(bvq.aT, true);
      }
   }

   static class d extends bof<car> {
      d(int $$0, int $$1) {
         super(Map.of(bvq.Z, bvr.b, bvq.aS, bvr.b, bvq.aR, bvr.b, bvq.aT, bvr.b, bvq.r, bvr.b), $$0, $$1);
      }

      protected boolean a(ane $$0, car $$1) {
         return !$$1.A();
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         return true;
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.c);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.a);
      }
   }

   static class e extends bof<car> {
      e() {
         super(Map.of(bvq.m, bvr.a, bvq.Z, bvr.b, bvq.aR, bvr.a), 600);
      }

      protected boolean a(ane $$0, car $$1) {
         return $$1.gf();
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         if (!$$1.gf()) {
            $$1.a(car.a.a);
            return false;
         } else {
            Optional<hx> $$3 = $$1.dN().c(bvq.m).map(bvt::a).map(bpt::b);
            Optional<hx> $$4 = $$1.dN().c(bvq.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.e);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         if ($$1.gn() && $$1.gf()) {
            $$1.dN().a(bvq.aS, true);
         }

         $$1.dN().b(bvq.m);
         $$1.dN().b(bvq.aR);
      }
   }

   static class f extends bof<car> {
      f(int $$0, int $$1) {
         super(Map.of(bvq.m, bvr.b, bvq.aR, bvr.b, bvq.aG, bvr.b), $$0, $$1);
      }

      protected boolean a(ane $$0, car $$1) {
         return !$$1.o_() && $$1.gf();
      }

      protected boolean a(ane $$0, car $$1, long $$2) {
         return $$1.gf();
      }

      protected void b(ane $$0, car $$1, long $$2) {
         $$1.a(car.a.d);
      }

      protected void c(ane $$0, car $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(car.a.a);
         if ($$3) {
            $$1.gm().ifPresent($$1x -> {
               $$1.dN().a(bvq.aR, $$1x);
               $$1.dN().a(bvq.m, new bvt($$1x, 1.25F, 0));
            });
         }
      }
   }
}
