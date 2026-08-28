import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cii {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final brv h = brv.a(5, 16);
   private static final ImmutableList<cfs<? extends cfr<? super cih>>> i = ImmutableList.of(cfs.c, cfs.f, cfs.u, cfs.o, cfs.k);
   private static final ImmutableList<cel<?>> j = ImmutableList.of(
      cel.Z, cel.x, cel.y, cel.m, cel.n, cel.E, cel.t, cel.h, cel.O, cel.P, cel.Q, cel.R, new cel[]{cel.r, cel.K, cel.G}
   );
   private static final byl<cih> k = can.a(
      (Function<can.b<cih>, ? extends App<can.c<cih>, caq<cih>>>)($$0 -> $$0.group($$0.c(cel.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.q()) {
                  $$1.gp();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwj.b<cih> a() {
      return bwj.a(j, i);
   }

   protected static bwj<?> a(bwj<cih> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cql.a));
      $$0.b(cql.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwj<cih> $$0) {
      $$0.a(cql.a, 0, ImmutableList.of(new bzu(0.8F), new cii.b(2.0F), new byg(45, 90), new byk() {
         @Override
         protected boolean a(arp $$0, bvj $$1) {
            if ($$1 instanceof cih $$2 && $$2.q()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bxg(cel.P), new bxg(cel.Q), k));
   }

   private static void c(bwj<cih> $$0) {
      $$0.a(
         cql.b,
         ImmutableList.of(
            Pair.of(0, bza.a(bus.bO, 6.0F, brv.a(30, 60))),
            Pair.of(1, new bwu(bus.e, 1.0F, 1)),
            Pair.of(2, new byx(ImmutableList.of(Pair.of(new bxn($$0x -> 1.25F, $$0x -> $$0x.e_() ? 1.0 : 2.0), 1), Pair.of(bwx.a(h, 1.25F), 1)))),
            Pair.of(3, new byr(brv.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byx(ImmutableMap.of(cel.m, cem.b), ImmutableList.of(Pair.of(bys.a(1.0F), 1), Pair.of(bzh.a(1.0F, 3), 1), Pair.of(new bxk(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwj<cih> $$0) {
      $$0.a(cql.g, ImmutableList.of(Pair.of(0, new cii.a())), Set.of(Pair.of(cel.G, cem.a), Pair.of(cel.Z, cem.b)));
   }

   public static void a(cih $$0) {
      $$0.eb().a(ImmutableList.of(cql.g, cql.b));
   }

   public static Predicate<cwm> b() {
      return $$0 -> $$0.a(axl.am);
   }

   public static class a extends bxa<cih> {
      static final int c = 5 * bao.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arp $$0, cih $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gm()) {
            $$1.a(cih.a.c);
            if ($$1.aJ()) {
               $$1.a(awn.aj);
            }
         } else {
            cih.a $$3 = $$1.gn();
            long $$4 = $$1.eb().e(cel.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cih.a.c) {
               if (this.f == 0 && $$1.aJ() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cih.a.d.b()) {
                  $$1.a(awn.an);
                  $$1.a(cih.a.d);
               }
            } else if ($$3 == cih.a.d && $$4 > (long)cih.a.d.b()) {
               $$1.a(cih.a.c);
            }
         }
      }

      private int a(cih $$0) {
         return cih.a.c.b() + $$0.dY().a(100, 400);
      }

      protected boolean a(arp $$0, cih $$1) {
         return $$1.aJ();
      }

      protected boolean b(arp $$0, cih $$1, long $$2) {
         return $$1.gn().a();
      }

      protected void c(arp $$0, cih $$1, long $$2) {
         $$1.go();
      }

      protected void d(arp $$0, cih $$1, long $$2) {
         if (!$$1.gy()) {
            $$1.gp();
         }
      }
   }

   public static class b extends bwv<cih> {
      public b(float $$0) {
         super($$0, $$0x -> axe.G);
      }

      protected void a(arp $$0, cih $$1, long $$2) {
         $$1.gp();
         super.b($$0, $$1, $$2);
      }
   }
}
