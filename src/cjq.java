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

public class cjq {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cfs<? extends cfr<? super cjp>>> a = ImmutableList.of(cfs.c, cfs.f, cfs.d, cfs.y);
   static final List<cel<?>> b = ImmutableList.of(
      cel.n, cel.m, cel.E, cel.t, cel.Z, cel.aR, cel.aS, cel.aT, cel.aG, cel.aQ, cel.h, cel.r, new cel[]{cel.O, cel.P, cel.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cwm> a() {
      return $$0 -> $$0.a(axl.ab);
   }

   protected static bwj<?> a(bwj<cjp> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   static cjp b(cjp $$0) {
      $$0.eb().b(cel.aS);
      $$0.eb().b(cel.aR);
      return $$0.a(cjp.a.a);
   }

   private static void b(bwj<cjp> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bzu(0.8F), new bwv<cjp>(2.0F) {
         protected void a(arp $$0, cjp $$1, long $$2) {
            cjq.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new byk(500, 700), new bxg(cel.P)));
   }

   private static void c(bwj<cjp> $$0) {
      $$0.a(cql.v, ImmutableList.of(Pair.of(0, new cjq.e())), Set.of(Pair.of(cel.Z, cem.b), Pair.of(cel.aR, cem.a), Pair.of(cel.m, cem.a)));
   }

   private static void d(bwj<cjp> $$0) {
      $$0.a(
         cql.z,
         ImmutableList.of(Pair.of(0, new cjq.a(160, 180)), Pair.of(0, new cjq.c(40))),
         Set.of(Pair.of(cel.Z, cem.b), Pair.of(cel.m, cem.b), Pair.of(cel.aS, cem.a))
      );
   }

   private static void e(bwj<cjp> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, new bwu(bus.bf) {
               @Override
               protected void a(arp $$0, cgy $$1, long $$2) {
                  cjq.b((cjp)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bxn($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(arp $$0, bvp $$1, long $$2) {
                  cjq.b((cjp)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byg(45, 90)),
            Pair.of(3, new cjq.b(40, 100)),
            Pair.of(
               4,
               new byx(
                  ImmutableList.of(
                     Pair.of(bzh.a(1.0F, 3), 2),
                     Pair.of(new cjq.d(40, 80), 1),
                     Pair.of(new cjq.f(40, 80), 1),
                     Pair.of(byz.a(bus.bO, 6.0F), 1),
                     Pair.of(bys.a(1.0F), 1),
                     Pair.of(new bxk(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cel.aS, cem.b))
      );
   }

   static void a(cjp $$0) {
      $$0.eb().a(ImmutableList.of(cql.z, cql.v, cql.b));
   }

   static class a extends bxa<cjp> {
      a(int $$0, int $$1) {
         super(Map.of(cel.Z, cem.b, cel.m, cem.b, cel.aS, cem.a, cel.aG, cem.b), $$0, $$1);
      }

      protected boolean a(arp $$0, cjp $$1) {
         return $$1.gm();
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         return $$1.eb().c(cel.aS).isPresent() && $$1.gp() && !$$1.gw();
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.f);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.eb().a(cel.aG, bas.a, 9600L);
         } else {
            cjq.b($$1);
         }
      }
   }

   static class b extends bxa<cjp> {
      b(int $$0, int $$1) {
         super(Map.of(cel.aT, cem.a), $$0, $$1);
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         return true;
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.b);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.a);
         $$1.eb().b(cel.aT);
      }
   }

   static class c extends bxa<cjp> {
      c(int $$0) {
         super(Map.of(cel.Z, cem.b, cel.m, cem.b, cel.aS, cem.a, cel.aG, cem.a), $$0, $$0);
      }

      protected boolean a(arp $$0, cjp $$1) {
         return true;
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         return $$1.eb().c(cel.aS).isPresent();
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.g);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjp.a.a).x($$3);
         $$1.eb().b(cel.aS);
         $$1.eb().a(cel.aT, true);
      }
   }

   static class d extends bxa<cjp> {
      d(int $$0, int $$1) {
         super(Map.of(cel.Z, cem.b, cel.aS, cem.b, cel.aR, cem.b, cel.aT, cem.b, cel.r, cem.b), $$0, $$1);
      }

      protected boolean a(arp $$0, cjp $$1) {
         return !$$1.v();
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         return true;
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.c);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.a);
      }
   }

   static class e extends bxa<cjp> {
      e() {
         super(Map.of(cel.m, cem.a, cel.Z, cem.b, cel.aR, cem.a), 600);
      }

      protected boolean a(arp $$0, cjp $$1) {
         return $$1.gm();
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         if (!$$1.gm()) {
            $$1.a(cjp.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.eb().c(cel.m).map(ceo::a).map(byo::b);
            Optional<jh> $$4 = $$1.eb().c(cel.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.e);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         if ($$1.gp() && $$1.gm()) {
            $$1.eb().a(cel.aS, true);
         }

         $$1.eb().b(cel.m);
         $$1.eb().b(cel.aR);
      }
   }

   static class f extends bxa<cjp> {
      f(int $$0, int $$1) {
         super(Map.of(cel.m, cem.b, cel.aR, cem.b, cel.aG, cem.b), $$0, $$1);
      }

      protected boolean a(arp $$0, cjp $$1) {
         return !$$1.e_() && $$1.gm();
      }

      protected boolean a(arp $$0, cjp $$1, long $$2) {
         return $$1.gm();
      }

      protected void b(arp $$0, cjp $$1, long $$2) {
         $$1.a(cjp.a.d);
      }

      protected void c(arp $$0, cjp $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cjp.a.a);
         if ($$3) {
            $$1.go().ifPresent($$1x -> {
               $$1.eb().a(cel.aR, $$1x);
               $$1.eb().a(cel.m, new ceo($$1x, 1.25F, 0));
            });
         }
      }
   }
}
