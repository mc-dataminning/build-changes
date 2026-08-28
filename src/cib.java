import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.util.Pair;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;

public class cib {
   private static final float a = 2.0F;
   private static final float b = 1.0F;
   private static final float c = 1.25F;
   private static final float d = 1.25F;
   private static final float e = 1.0F;
   private static final double f = 2.0;
   private static final double g = 1.0;
   private static final bro h = bro.a(5, 16);
   private static final ImmutableList<cfl<? extends cfk<? super cia>>> i = ImmutableList.of(cfl.c, cfl.f, cfl.u, cfl.o, cfl.k);
   private static final ImmutableList<cee<?>> j = ImmutableList.of(
      cee.Z, cee.x, cee.y, cee.m, cee.n, cee.E, cee.t, cee.h, cee.O, cee.P, cee.Q, cee.R, new cee[]{cee.r, cee.K, cee.G}
   );
   private static final bye<cia> k = cag.a(
      (Function<cag.b<cia>, ? extends App<cag.c<cia>, caj<cia>>>)($$0 -> $$0.group($$0.c(cee.G)).apply($$0, $$0x -> ($$0xx, $$1, $$2) -> {
               if ($$1.t()) {
                  $$1.gx();
                  return true;
               } else {
                  return false;
               }
            }))
   );

   public static bwc.b<cia> a() {
      return bwc.a(j, i);
   }

   protected static bwc<?> a(bwc<cia> $$0) {
      b($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cqe.a));
      $$0.b(cqe.b);
      $$0.f();
      return $$0;
   }

   private static void b(bwc<cia> $$0) {
      $$0.a(cqe.a, 0, ImmutableList.of(new bzn(0.8F), new cib.b(2.0F), new bxz(45, 90), new byd() {
         @Override
         protected boolean a(arn $$0, bvc $$1) {
            if ($$1 instanceof cia $$2 && $$2.t()) {
               return false;
            }

            return super.a($$0, $$1);
         }
      }, new bwz(cee.P), new bwz(cee.Q), k));
   }

   private static void c(bwc<cia> $$0) {
      $$0.a(
         cqe.b,
         ImmutableList.of(
            Pair.of(0, byt.a(bul.by, 6.0F, bro.a(30, 60))),
            Pair.of(1, new bwn(bul.c, 1.0F, 1)),
            Pair.of(2, new byq(ImmutableList.of(Pair.of(new bxg($$0x -> 1.25F, $$0x -> $$0x.p_() ? 1.0 : 2.0), 1), Pair.of(bwq.a(h, 1.25F), 1)))),
            Pair.of(3, new byk(bro.a(150, 250), 30.0F, 0.0F, 0.0F)),
            Pair.of(
               4, new byq(ImmutableMap.of(cee.m, cef.b), ImmutableList.of(Pair.of(byl.a(1.0F), 1), Pair.of(bza.a(1.0F, 3), 1), Pair.of(new bxd(30, 60), 1)))
            )
         )
      );
   }

   private static void d(bwc<cia> $$0) {
      $$0.a(cqe.g, ImmutableList.of(Pair.of(0, new cib.a())), Set.of(Pair.of(cee.G, cef.a), Pair.of(cee.Z, cef.b)));
   }

   public static void a(cia $$0) {
      $$0.ed().a(ImmutableList.of(cqe.g, cqe.b));
   }

   public static Predicate<cwb> b() {
      return $$0 -> $$0.a(axj.al);
   }

   public static class a extends bwt<cia> {
      static final int c = 5 * bal.e * 20;
      static final int d = 5;
      static final int e = 75;
      int f = 0;
      boolean g;

      public a() {
         super(Map.of(), c);
      }

      protected void a(arn $$0, cia $$1, long $$2) {
         super.c($$0, $$1, $$2);
         if (this.f > 0) {
            this.f--;
         }

         if ($$1.gu()) {
            $$1.a(cia.a.c);
            if ($$1.aK()) {
               $$1.a(awl.aj);
            }
         } else {
            cia.a $$3 = $$1.gv();
            long $$4 = $$1.ed().e(cee.G);
            boolean $$5 = $$4 > 75L;
            if ($$5 != this.g) {
               this.f = this.a($$1);
            }

            this.g = $$5;
            if ($$3 == cia.a.c) {
               if (this.f == 0 && $$1.aK() && $$5) {
                  $$0.a($$1, (byte)64);
                  this.f = this.a($$1);
               }

               if ($$4 < (long)cia.a.d.b()) {
                  $$1.a(awl.an);
                  $$1.a(cia.a.d);
               }
            } else if ($$3 == cia.a.d && $$4 > (long)cia.a.d.b()) {
               $$1.a(cia.a.c);
            }
         }
      }

      private int a(cia $$0) {
         return cia.a.c.b() + $$0.ea().a(100, 400);
      }

      protected boolean a(arn $$0, cia $$1) {
         return $$1.aK();
      }

      protected boolean b(arn $$0, cia $$1, long $$2) {
         return $$1.gv().a();
      }

      protected void c(arn $$0, cia $$1, long $$2) {
         $$1.gw();
      }

      protected void d(arn $$0, cia $$1, long $$2) {
         if (!$$1.gG()) {
            $$1.gx();
         }
      }
   }

   public static class b extends bwo<cia> {
      public b(float $$0) {
         super($$0, $$0x -> axc.G);
      }

      protected void a(arn $$0, cia $$1, long $$2) {
         $$1.gx();
         super.b($$0, $$1, $$2);
      }
   }
}
