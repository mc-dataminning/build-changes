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

public class cgy {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdb<? extends cda<? super cgx>>> a = ImmutableList.of(cdb.c, cdb.f, cdb.d, cdb.y);
   static final List<cbu<?>> b = ImmutableList.of(
      cbu.n, cbu.m, cbu.E, cbu.t, cbu.Z, cbu.aR, cbu.aS, cbu.aT, cbu.aG, cbu.aQ, cbu.h, cbu.r, new cbu[]{cbu.O, cbu.P, cbu.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<ctq> a() {
      return $$0 -> $$0.a(awf.X);
   }

   protected static bts<?> a(bts<cgx> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnn.a));
      $$0.b(cnn.b);
      $$0.f();
      return $$0;
   }

   static cgx b(cgx $$0) {
      $$0.dS().b(cbu.aS);
      $$0.dS().b(cbu.aR);
      return $$0.a(cgx.a.a);
   }

   private static void b(bts<cgx> $$0) {
      $$0.a(cnn.a, 0, ImmutableList.of(new bxd(0.8F), new bue<cgx>(2.0F) {
         protected void a(aqn $$0, cgx $$1, long $$2) {
            cgy.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bvt(500, 700), new bup(cbu.P)));
   }

   private static void c(bts<cgx> $$0) {
      $$0.a(cnn.v, ImmutableList.of(Pair.of(0, new cgy.e())), Set.of(Pair.of(cbu.Z, cbv.b), Pair.of(cbu.aR, cbv.a), Pair.of(cbu.m, cbv.a)));
   }

   private static void d(bts<cgx> $$0) {
      $$0.a(
         cnn.z,
         ImmutableList.of(Pair.of(0, new cgy.a(160, 180)), Pair.of(0, new cgy.c(40))),
         Set.of(Pair.of(cbu.Z, cbv.b), Pair.of(cbu.m, cbv.b), Pair.of(cbu.aS, cbv.a))
      );
   }

   private static void e(bts<cgx> $$0) {
      $$0.a(
         cnn.b,
         ImmutableList.of(
            Pair.of(0, new bud(bsc.aR) {
               @Override
               protected void a(aqn $$0, ceg $$1, long $$2) {
                  cgy.b((cgx)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new buw($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqn $$0, bsz $$1, long $$2) {
                  cgy.b((cgx)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bvp(45, 90)),
            Pair.of(3, new cgy.b(40, 100)),
            Pair.of(
               4,
               new bwg(
                  ImmutableList.of(
                     Pair.of(bwq.a(1.0F, 3), 2),
                     Pair.of(new cgy.d(40, 80), 1),
                     Pair.of(new cgy.f(40, 80), 1),
                     Pair.of(bwi.a(bsc.by, 6.0F), 1),
                     Pair.of(bwb.a(1.0F), 1),
                     Pair.of(new but(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cbu.aS, cbv.b))
      );
   }

   static void a(cgx $$0) {
      $$0.dS().a(ImmutableList.of(cnn.z, cnn.v, cnn.b));
   }

   static class a extends buj<cgx> {
      a(int $$0, int $$1) {
         super(Map.of(cbu.Z, cbv.b, cbu.m, cbv.b, cbu.aS, cbv.a, cbu.aG, cbv.b), $$0, $$1);
      }

      protected boolean a(aqn $$0, cgx $$1) {
         return $$1.gp();
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         return $$1.dS().c(cbu.aS).isPresent() && $$1.gx() && !$$1.gt();
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.f);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dS().a(cbu.aG, azh.a, 9600L);
         } else {
            cgy.b($$1);
         }
      }
   }

   static class b extends buj<cgx> {
      b(int $$0, int $$1) {
         super(Map.of(cbu.aT, cbv.a), $$0, $$1);
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         return true;
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.b);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.a);
         $$1.dS().b(cbu.aT);
      }
   }

   static class c extends buj<cgx> {
      c(int $$0) {
         super(Map.of(cbu.Z, cbv.b, cbu.m, cbv.b, cbu.aS, cbv.a, cbu.aG, cbv.a), $$0, $$0);
      }

      protected boolean a(aqn $$0, cgx $$1) {
         return true;
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         return $$1.dS().c(cbu.aS).isPresent();
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.g);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgx.a.a).w($$3);
         $$1.dS().b(cbu.aS);
         $$1.dS().a(cbu.aT, true);
      }
   }

   static class d extends buj<cgx> {
      d(int $$0, int $$1) {
         super(Map.of(cbu.Z, cbv.b, cbu.aS, cbv.b, cbu.aR, cbv.b, cbu.aT, cbv.b, cbu.r, cbv.b), $$0, $$1);
      }

      protected boolean a(aqn $$0, cgx $$1) {
         return !$$1.y();
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         return true;
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.c);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.a);
      }
   }

   static class e extends buj<cgx> {
      e() {
         super(Map.of(cbu.m, cbv.a, cbu.Z, cbv.b, cbu.aR, cbv.a), 600);
      }

      protected boolean a(aqn $$0, cgx $$1) {
         return $$1.gp();
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         if (!$$1.gp()) {
            $$1.a(cgx.a.a);
            return false;
         } else {
            Optional<io> $$3 = $$1.dS().c(cbu.m).map(cbx::a).map(bvx::b);
            Optional<io> $$4 = $$1.dS().c(cbu.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.e);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         if ($$1.gx() && $$1.gp()) {
            $$1.dS().a(cbu.aS, true);
         }

         $$1.dS().b(cbu.m);
         $$1.dS().b(cbu.aR);
      }
   }

   static class f extends buj<cgx> {
      f(int $$0, int $$1) {
         super(Map.of(cbu.m, cbv.b, cbu.aR, cbv.b, cbu.aG, cbv.b), $$0, $$1);
      }

      protected boolean a(aqn $$0, cgx $$1) {
         return !$$1.p_() && $$1.gp();
      }

      protected boolean a(aqn $$0, cgx $$1, long $$2) {
         return $$1.gp();
      }

      protected void b(aqn $$0, cgx $$1, long $$2) {
         $$1.a(cgx.a.d);
      }

      protected void c(aqn $$0, cgx $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cgx.a.a);
         if ($$3) {
            $$1.gw().ifPresent($$1x -> {
               $$1.dS().a(cbu.aR, $$1x);
               $$1.dS().a(cbu.m, new cbx($$1x, 1.25F, 0));
            });
         }
      }
   }
}
