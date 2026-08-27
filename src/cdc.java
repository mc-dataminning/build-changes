import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cdc {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bzh<? extends bzg<? super cdb>>> a = ImmutableList.of(bzh.c, bzh.f, bzh.d, bzh.y);
   static final List<bya<?>> b = ImmutableList.of(
      bya.n, bya.m, bya.E, bya.t, bya.Z, bya.aR, bya.aS, bya.aT, bya.aG, bya.aQ, bya.h, bya.r, new bya[]{bya.O, bya.P, bya.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static csp a() {
      return csp.a(cpt.ve);
   }

   protected static bpy<?> a(bpy<cdb> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cjn.a));
      $$0.b(cjn.b);
      $$0.f();
      return $$0;
   }

   static cdb b(cdb $$0) {
      $$0.dM().b(bya.aS);
      $$0.dM().b(bya.aR);
      return $$0.a(cdb.a.a);
   }

   private static void b(bpy<cdb> $$0) {
      $$0.a(cjn.a, 0, ImmutableList.of(new btj(0.8F), new bqk(2.0F) {
         @Override
         protected void b(apa $$0, bpf $$1, long $$2) {
            cdc.b((cdb)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new brz(500, 700), new bqv(bya.P)));
   }

   private static void c(bpy<cdb> $$0) {
      $$0.a(cjn.v, ImmutableList.of(Pair.of(0, new cdc.e())), Set.of(Pair.of(bya.Z, byb.b), Pair.of(bya.aR, byb.a), Pair.of(bya.m, byb.a)));
   }

   private static void d(bpy<cdb> $$0) {
      $$0.a(
         cjn.z,
         ImmutableList.of(Pair.of(0, new cdc.a(160, 180)), Pair.of(0, new cdc.c(40))),
         Set.of(Pair.of(bya.Z, byb.b), Pair.of(bya.m, byb.b), Pair.of(bya.aS, byb.a))
      );
   }

   private static void e(bpy<cdb> $$0) {
      $$0.a(
         cjn.b,
         ImmutableList.of(
            Pair.of(0, new bqj(bol.aP) {
               @Override
               protected void a(apa $$0, cam $$1, long $$2) {
                  cdc.b((cdb)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new brc($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(apa $$0, bpf $$1, long $$2) {
                  cdc.b((cdb)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new brv(45, 90)),
            Pair.of(3, new cdc.b(40, 100)),
            Pair.of(
               4,
               new bsm(
                  ImmutableList.of(
                     Pair.of(bsw.a(1.0F, 3), 2),
                     Pair.of(new cdc.d(40, 80), 1),
                     Pair.of(new cdc.f(40, 80), 1),
                     Pair.of(bso.a(bol.bw, 6.0F), 1),
                     Pair.of(bsh.a(1.0F), 1),
                     Pair.of(new bqz(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bya.aS, byb.b))
      );
   }

   static void a(cdb $$0) {
      $$0.dM().a(ImmutableList.of(cjn.z, cjn.v, cjn.b));
   }

   static class a extends bqp<cdb> {
      a(int $$0, int $$1) {
         super(Map.of(bya.Z, byb.b, bya.m, byb.b, bya.aS, byb.a, bya.aG, byb.b), $$0, $$1);
      }

      protected boolean a(apa $$0, cdb $$1) {
         return $$1.gl();
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         return $$1.dM().c(bya.aS).isPresent() && $$1.gt() && !$$1.gp();
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.f);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dM().a(bya.aG, axo.a, 9600L);
         } else {
            cdc.b($$1);
         }
      }
   }

   static class b extends bqp<cdb> {
      b(int $$0, int $$1) {
         super(Map.of(bya.aT, byb.a), $$0, $$1);
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         return true;
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.b);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.a);
         $$1.dM().b(bya.aT);
      }
   }

   static class c extends bqp<cdb> {
      c(int $$0) {
         super(Map.of(bya.Z, byb.b, bya.m, byb.b, bya.aS, byb.a, bya.aG, byb.a), $$0, $$0);
      }

      protected boolean a(apa $$0, cdb $$1) {
         return true;
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         return $$1.dM().c(bya.aS).isPresent();
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.g);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cdb.a.a).w($$3);
         $$1.dM().b(bya.aS);
         $$1.dM().a(bya.aT, true);
      }
   }

   static class d extends bqp<cdb> {
      d(int $$0, int $$1) {
         super(Map.of(bya.Z, byb.b, bya.aS, byb.b, bya.aR, byb.b, bya.aT, byb.b, bya.r, byb.b), $$0, $$1);
      }

      protected boolean a(apa $$0, cdb $$1) {
         return !$$1.A();
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         return true;
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.c);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.a);
      }
   }

   static class e extends bqp<cdb> {
      e() {
         super(Map.of(bya.m, byb.a, bya.Z, byb.b, bya.aR, byb.a), 600);
      }

      protected boolean a(apa $$0, cdb $$1) {
         return $$1.gl();
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         if (!$$1.gl()) {
            $$1.a(cdb.a.a);
            return false;
         } else {
            Optional<ib> $$3 = $$1.dM().c(bya.m).map(byd::a).map(bsd::b);
            Optional<ib> $$4 = $$1.dM().c(bya.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.e);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         if ($$1.gt() && $$1.gl()) {
            $$1.dM().a(bya.aS, true);
         }

         $$1.dM().b(bya.m);
         $$1.dM().b(bya.aR);
      }
   }

   static class f extends bqp<cdb> {
      f(int $$0, int $$1) {
         super(Map.of(bya.m, byb.b, bya.aR, byb.b, bya.aG, byb.b), $$0, $$1);
      }

      protected boolean a(apa $$0, cdb $$1) {
         return !$$1.o_() && $$1.gl();
      }

      protected boolean a(apa $$0, cdb $$1, long $$2) {
         return $$1.gl();
      }

      protected void b(apa $$0, cdb $$1, long $$2) {
         $$1.a(cdb.a.d);
      }

      protected void c(apa $$0, cdb $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cdb.a.a);
         if ($$3) {
            $$1.gs().ifPresent($$1x -> {
               $$1.dM().a(bya.aR, $$1x);
               $$1.dM().a(bya.m, new byd($$1x, 1.25F, 0));
            });
         }
      }
   }
}
