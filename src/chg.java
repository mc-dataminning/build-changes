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

public class chg {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<cdj<? extends cdi<? super chf>>> a = ImmutableList.of(cdj.c, cdj.f, cdj.d, cdj.y);
   static final List<ccc<?>> b = ImmutableList.of(
      ccc.n, ccc.m, ccc.E, ccc.t, ccc.Z, ccc.aR, ccc.aS, ccc.aT, ccc.aG, ccc.aQ, ccc.h, ccc.r, new ccc[]{ccc.O, ccc.P, ccc.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static Predicate<cua> a() {
      return $$0 -> $$0.a(awd.X);
   }

   protected static bua<?> a(bua<chf> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cnw.a));
      $$0.b(cnw.b);
      $$0.f();
      return $$0;
   }

   static chf b(chf $$0) {
      $$0.dT().b(ccc.aS);
      $$0.dT().b(ccc.aR);
      return $$0.a(chf.a.a);
   }

   private static void b(bua<chf> $$0) {
      $$0.a(cnw.a, 0, ImmutableList.of(new bxl(0.8F), new bum<chf>(2.0F) {
         protected void a(aqk $$0, chf $$1, long $$2) {
            chg.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bwb(500, 700), new bux(ccc.P)));
   }

   private static void c(bua<chf> $$0) {
      $$0.a(cnw.v, ImmutableList.of(Pair.of(0, new chg.e())), Set.of(Pair.of(ccc.Z, ccd.b), Pair.of(ccc.aR, ccd.a), Pair.of(ccc.m, ccd.a)));
   }

   private static void d(bua<chf> $$0) {
      $$0.a(
         cnw.z,
         ImmutableList.of(Pair.of(0, new chg.a(160, 180)), Pair.of(0, new chg.c(40))),
         Set.of(Pair.of(ccc.Z, ccd.b), Pair.of(ccc.m, ccd.b), Pair.of(ccc.aS, ccd.a))
      );
   }

   private static void e(bua<chf> $$0) {
      $$0.a(
         cnw.b,
         ImmutableList.of(
            Pair.of(0, new bul(bsj.aR) {
               @Override
               protected void a(aqk $$0, ceo $$1, long $$2) {
                  chg.b((chf)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bve($$0x -> 1.25F, $$0x -> $$0x.p_() ? 2.5 : 3.5) {
               @Override
               protected void b(aqk $$0, bth $$1, long $$2) {
                  chg.b((chf)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bvx(45, 90)),
            Pair.of(3, new chg.b(40, 100)),
            Pair.of(
               4,
               new bwo(
                  ImmutableList.of(
                     Pair.of(bwy.a(1.0F, 3), 2),
                     Pair.of(new chg.d(40, 80), 1),
                     Pair.of(new chg.f(40, 80), 1),
                     Pair.of(bwq.a(bsj.by, 6.0F), 1),
                     Pair.of(bwj.a(1.0F), 1),
                     Pair.of(new bvb(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(ccc.aS, ccd.b))
      );
   }

   static void a(chf $$0) {
      $$0.dT().a(ImmutableList.of(cnw.z, cnw.v, cnw.b));
   }

   static class a extends bur<chf> {
      a(int $$0, int $$1) {
         super(Map.of(ccc.Z, ccd.b, ccc.m, ccd.b, ccc.aS, ccd.a, ccc.aG, ccd.b), $$0, $$1);
      }

      protected boolean a(aqk $$0, chf $$1) {
         return $$1.gn();
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         return $$1.dT().c(ccc.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.f);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dT().a(ccc.aG, azh.a, 9600L);
         } else {
            chg.b($$1);
         }
      }
   }

   static class b extends bur<chf> {
      b(int $$0, int $$1) {
         super(Map.of(ccc.aT, ccd.a), $$0, $$1);
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         return true;
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.b);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.a);
         $$1.dT().b(ccc.aT);
      }
   }

   static class c extends bur<chf> {
      c(int $$0) {
         super(Map.of(ccc.Z, ccd.b, ccc.m, ccd.b, ccc.aS, ccd.a, ccc.aG, ccd.a), $$0, $$0);
      }

      protected boolean a(aqk $$0, chf $$1) {
         return true;
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         return $$1.dT().c(ccc.aS).isPresent();
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.g);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chf.a.a).w($$3);
         $$1.dT().b(ccc.aS);
         $$1.dT().a(ccc.aT, true);
      }
   }

   static class d extends bur<chf> {
      d(int $$0, int $$1) {
         super(Map.of(ccc.Z, ccd.b, ccc.aS, ccd.b, ccc.aR, ccd.b, ccc.aT, ccd.b, ccc.r, ccd.b), $$0, $$1);
      }

      protected boolean a(aqk $$0, chf $$1) {
         return !$$1.y();
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         return true;
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.c);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.a);
      }
   }

   static class e extends bur<chf> {
      e() {
         super(Map.of(ccc.m, ccd.a, ccc.Z, ccd.b, ccc.aR, ccd.a), 600);
      }

      protected boolean a(aqk $$0, chf $$1) {
         return $$1.gn();
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(chf.a.a);
            return false;
         } else {
            Optional<ja> $$3 = $$1.dT().c(ccc.m).map(ccf::a).map(bwf::b);
            Optional<ja> $$4 = $$1.dT().c(ccc.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.e);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dT().a(ccc.aS, true);
         }

         $$1.dT().b(ccc.m);
         $$1.dT().b(ccc.aR);
      }
   }

   static class f extends bur<chf> {
      f(int $$0, int $$1) {
         super(Map.of(ccc.m, ccd.b, ccc.aR, ccd.b, ccc.aG, ccd.b), $$0, $$1);
      }

      protected boolean a(aqk $$0, chf $$1) {
         return !$$1.p_() && $$1.gn();
      }

      protected boolean a(aqk $$0, chf $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(aqk $$0, chf $$1, long $$2) {
         $$1.a(chf.a.d);
      }

      protected void c(aqk $$0, chf $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(chf.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dT().a(ccc.aR, $$1x);
               $$1.dT().a(ccc.m, new ccf($$1x, 1.25F, 0));
            });
         }
      }
   }
}
