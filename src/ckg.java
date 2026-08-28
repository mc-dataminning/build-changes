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

public class ckg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cgi<? extends cgh<? super ckf>>> a = ImmutableList.of(cgi.c, cgi.f, cgi.d, cgi.y);
   static final List<cfb<?>> b = ImmutableList.of(
      cfb.n, cfb.m, cfb.E, cfb.t, cfb.Z, cfb.aR, cfb.aS, cfb.aT, cfb.aG, cfb.aQ, cfb.h, cfb.r, new cfb[]{cfb.O, cfb.P, cfb.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cxg> a() {
      return $$0 -> $$0.a(axt.ac);
   }

   protected static bwz<?> a(bwz<ckf> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(crf.a));
      $$0.b(crf.b);
      $$0.f();
      return $$0;
   }

   static ckf b(ckf $$0) {
      $$0.ec().b(cfb.aS);
      $$0.ec().b(cfb.aR);
      return $$0.a(ckf.a.a);
   }

   private static void b(bwz<ckf> $$0) {
      $$0.a(crf.a, 0, ImmutableList.of(new cak(0.8F), new bxl<ckf>(2.0F) {
         protected void a(arx $$0, ckf $$1, long $$2) {
            ckg.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bza(500, 700), new bxw(cfb.P)));
   }

   private static void c(bwz<ckf> $$0) {
      $$0.a(crf.v, ImmutableList.of(Pair.of(0, new ckg.e())), Set.of(Pair.of(cfb.Z, cfc.b), Pair.of(cfb.aR, cfc.a), Pair.of(cfb.m, cfc.a)));
   }

   private static void d(bwz<ckf> $$0) {
      $$0.a(
         crf.z,
         ImmutableList.of(Pair.of(0, new ckg.a(160, 180)), Pair.of(0, new ckg.c(40))),
         Set.of(Pair.of(cfb.Z, cfc.b), Pair.of(cfb.m, cfc.b), Pair.of(cfb.aS, cfc.a))
      );
   }

   private static void e(bwz<ckf> $$0) {
      $$0.a(
         crf.b,
         ImmutableList.of(
            Pair.of(0, new bxk(bvi.bj) {
               @Override
               protected void a(arx $$0, cho $$1, long $$2) {
                  ckg.b((ckf)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new byd($$0x -> 1.25F, $$0x -> $$0x.e_() ? 2.5 : 3.5) {
               @Override
               protected void b(arx $$0, bwf $$1, long $$2) {
                  ckg.b((ckf)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new byw(45, 90)),
            Pair.of(3, new ckg.b(40, 100)),
            Pair.of(
               4,
               new bzn(
                  ImmutableList.of(
                     Pair.of(bzx.a(1.0F, 3), 2),
                     Pair.of(new ckg.d(40, 80), 1),
                     Pair.of(new ckg.f(40, 80), 1),
                     Pair.of(bzp.a(bvi.bS, 6.0F), 1),
                     Pair.of(bzi.a(1.0F), 1),
                     Pair.of(new bya(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(cfb.aS, cfc.b))
      );
   }

   static void a(ckf $$0) {
      $$0.ec().a(ImmutableList.of(crf.z, crf.v, crf.b));
   }

   static class a extends bxq<ckf> {
      a(int $$0, int $$1) {
         super(Map.of(cfb.Z, cfc.b, cfb.m, cfc.b, cfb.aS, cfc.a, cfb.aG, cfc.b), $$0, $$1);
      }

      protected boolean a(arx $$0, ckf $$1) {
         return $$1.go();
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         return $$1.ec().c(cfb.aS).isPresent() && $$1.gr() && !$$1.gy();
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.f);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.ec().a(cfb.aG, bba.a, 9600L);
         } else {
            ckg.b($$1);
         }
      }
   }

   static class b extends bxq<ckf> {
      b(int $$0, int $$1) {
         super(Map.of(cfb.aT, cfc.a), $$0, $$1);
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         return true;
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.b);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.a);
         $$1.ec().b(cfb.aT);
      }
   }

   static class c extends bxq<ckf> {
      c(int $$0) {
         super(Map.of(cfb.Z, cfc.b, cfb.m, cfc.b, cfb.aS, cfc.a, cfb.aG, cfc.a), $$0, $$0);
      }

      protected boolean a(arx $$0, ckf $$1) {
         return true;
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         return $$1.ec().c(cfb.aS).isPresent();
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.g);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckf.a.a).x($$3);
         $$1.ec().b(cfb.aS);
         $$1.ec().a(cfb.aT, true);
      }
   }

   static class d extends bxq<ckf> {
      d(int $$0, int $$1) {
         super(Map.of(cfb.Z, cfc.b, cfb.aS, cfc.b, cfb.aR, cfc.b, cfb.aT, cfc.b, cfb.r, cfc.b), $$0, $$1);
      }

      protected boolean a(arx $$0, ckf $$1) {
         return !$$1.x();
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         return true;
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.c);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.a);
      }
   }

   static class e extends bxq<ckf> {
      e() {
         super(Map.of(cfb.m, cfc.a, cfb.Z, cfc.b, cfb.aR, cfc.a), 600);
      }

      protected boolean a(arx $$0, ckf $$1) {
         return $$1.go();
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         if (!$$1.go()) {
            $$1.a(ckf.a.a);
            return false;
         } else {
            Optional<jh> $$3 = $$1.ec().c(cfb.m).map(cfe::a).map(bze::b);
            Optional<jh> $$4 = $$1.ec().c(cfb.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.e);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         if ($$1.gr() && $$1.go()) {
            $$1.ec().a(cfb.aS, true);
         }

         $$1.ec().b(cfb.m);
         $$1.ec().b(cfb.aR);
      }
   }

   static class f extends bxq<ckf> {
      f(int $$0, int $$1) {
         super(Map.of(cfb.m, cfc.b, cfb.aR, cfc.b, cfb.aG, cfc.b), $$0, $$1);
      }

      protected boolean a(arx $$0, ckf $$1) {
         return !$$1.e_() && $$1.go();
      }

      protected boolean a(arx $$0, ckf $$1, long $$2) {
         return $$1.go();
      }

      protected void b(arx $$0, ckf $$1, long $$2) {
         $$1.a(ckf.a.d);
      }

      protected void c(arx $$0, ckf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(ckf.a.a);
         if ($$3) {
            $$1.gq().ifPresent($$1x -> {
               $$1.ec().a(cfb.aR, $$1x);
               $$1.ec().a(cfb.m, new cfe($$1x, 1.25F, 0));
            });
         }
      }
   }
}
