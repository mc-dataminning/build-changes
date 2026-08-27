import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cet {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cay<? extends cax<? super ces>>> a = ImmutableList.of(cay.c, cay.f, cay.d, cay.y);
   static final List<bzr<?>> b = ImmutableList.of(
      bzr.n, bzr.m, bzr.E, bzr.t, bzr.Z, bzr.aR, bzr.aS, bzr.aT, bzr.aG, bzr.aQ, bzr.h, bzr.r, new bzr[]{bzr.O, bzr.P, bzr.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cvg a() {
      return cvg.a(crm.vg);
   }

   protected static brp<?> a(brp<ces> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cli.a));
      $$0.b(cli.b);
      $$0.f();
      return $$0;
   }

   static ces b(ces $$0) {
      $$0.dP().b(bzr.aS);
      $$0.dP().b(bzr.aR);
      return $$0.a(ces.a.a);
   }

   private static void b(brp<ces> $$0) {
      $$0.a(cli.a, 0, ImmutableList.of(new bva(0.8F), new bsb<ces>(2.0F) {
         protected void a(aps $$0, ces $$1, long $$2) {
            cet.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new btq(500, 700), new bsm(bzr.P)));
   }

   private static void c(brp<ces> $$0) {
      $$0.a(cli.v, ImmutableList.of(Pair.of(0, new cet.e())), Set.of(Pair.of(bzr.Z, bzs.b), Pair.of(bzr.aR, bzs.a), Pair.of(bzr.m, bzs.a)));
   }

   private static void d(brp<ces> $$0) {
      $$0.a(
         cli.z,
         ImmutableList.of(Pair.of(0, new cet.a(160, 180)), Pair.of(0, new cet.c(40))),
         Set.of(Pair.of(bzr.Z, bzs.b), Pair.of(bzr.m, bzs.b), Pair.of(bzr.aS, bzs.a))
      );
   }

   private static void e(brp<ces> $$0) {
      $$0.a(
         cli.b,
         ImmutableList.of(
            Pair.of(0, new bsa(bqb.aQ) {
               @Override
               protected void a(aps $$0, ccd $$1, long $$2) {
                  cet.b((ces)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bst($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aps $$0, bqw $$1, long $$2) {
                  cet.b((ces)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new btm(45, 90)),
            Pair.of(3, new cet.b(40, 100)),
            Pair.of(
               4,
               new bud(
                  ImmutableList.of(
                     Pair.of(bun.a(1.0F, 3), 2),
                     Pair.of(new cet.d(40, 80), 1),
                     Pair.of(new cet.f(40, 80), 1),
                     Pair.of(buf.a(bqb.bx, 6.0F), 1),
                     Pair.of(bty.a(1.0F), 1),
                     Pair.of(new bsq(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bzr.aS, bzs.b))
      );
   }

   static void a(ces $$0) {
      $$0.dP().a(ImmutableList.of(cli.z, cli.v, cli.b));
   }

   static class a extends bsg<ces> {
      a(int $$0, int $$1) {
         super(Map.of(bzr.Z, bzs.b, bzr.m, bzs.b, bzr.aS, bzs.a, bzr.aG, bzs.b), $$0, $$1);
      }

      protected boolean a(aps $$0, ces $$1) {
         return $$1.gn();
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         return $$1.dP().c(bzr.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.f);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(bzr.aG, aym.a, 9600L);
         } else {
            cet.b($$1);
         }
      }
   }

   static class b extends bsg<ces> {
      b(int $$0, int $$1) {
         super(Map.of(bzr.aT, bzs.a), $$0, $$1);
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         return true;
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.b);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.a);
         $$1.dP().b(bzr.aT);
      }
   }

   static class c extends bsg<ces> {
      c(int $$0) {
         super(Map.of(bzr.Z, bzs.b, bzr.m, bzs.b, bzr.aS, bzs.a, bzr.aG, bzs.a), $$0, $$0);
      }

      protected boolean a(aps $$0, ces $$1) {
         return true;
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         return $$1.dP().c(bzr.aS).isPresent();
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.g);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ces.a.a).w($$3);
         $$1.dP().b(bzr.aS);
         $$1.dP().a(bzr.aT, true);
      }
   }

   static class d extends bsg<ces> {
      d(int $$0, int $$1) {
         super(Map.of(bzr.Z, bzs.b, bzr.aS, bzs.b, bzr.aR, bzs.b, bzr.aT, bzs.b, bzr.r, bzs.b), $$0, $$1);
      }

      protected boolean a(aps $$0, ces $$1) {
         return !$$1.y();
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         return true;
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.c);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.a);
      }
   }

   static class e extends bsg<ces> {
      e() {
         super(Map.of(bzr.m, bzs.a, bzr.Z, bzs.b, bzr.aR, bzs.a), 600);
      }

      protected boolean a(aps $$0, ces $$1) {
         return $$1.gn();
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(ces.a.a);
            return false;
         } else {
            Optional<ib> $$3 = $$1.dP().c(bzr.m).map(bzu::a).map(btu::b);
            Optional<ib> $$4 = $$1.dP().c(bzr.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.e);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dP().a(bzr.aS, true);
         }

         $$1.dP().b(bzr.m);
         $$1.dP().b(bzr.aR);
      }
   }

   static class f extends bsg<ces> {
      f(int $$0, int $$1) {
         super(Map.of(bzr.m, bzs.b, bzr.aR, bzs.b, bzr.aG, bzs.b), $$0, $$1);
      }

      protected boolean a(aps $$0, ces $$1) {
         return !$$1.p_() && $$1.gn();
      }

      protected boolean a(aps $$0, ces $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(aps $$0, ces $$1, long $$2) {
         $$1.a(ces.a.d);
      }

      protected void c(aps $$0, ces $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ces.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dP().a(bzr.aR, $$1x);
               $$1.dP().a(bzr.m, new bzu($$1x, 1.25F, 0));
            });
         }
      }
   }
}
