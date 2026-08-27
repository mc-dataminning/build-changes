import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cdu {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bzz<? extends bzy<? super cdt>>> a = ImmutableList.of(bzz.c, bzz.f, bzz.d, bzz.y);
   static final List<bys<?>> b = ImmutableList.of(
      bys.n, bys.m, bys.E, bys.t, bys.Z, bys.aR, bys.aS, bys.aT, bys.aG, bys.aQ, bys.h, bys.r, new bys[]{bys.O, bys.P, bys.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static ctm a() {
      return ctm.a(cqp.vg);
   }

   protected static bqq<?> a(bqq<cdt> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckj.a));
      $$0.b(ckj.b);
      $$0.f();
      return $$0;
   }

   static cdt b(cdt $$0) {
      $$0.dP().b(bys.aS);
      $$0.dP().b(bys.aR);
      return $$0.a(cdt.a.a);
   }

   private static void b(bqq<cdt> $$0) {
      $$0.a(ckj.a, 0, ImmutableList.of(new bub(0.8F), new brc<cdt>(2.0F) {
         protected void a(apf $$0, cdt $$1, long $$2) {
            cdu.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bsr(500, 700), new brn(bys.P)));
   }

   private static void c(bqq<cdt> $$0) {
      $$0.a(ckj.v, ImmutableList.of(Pair.of(0, new cdu.e())), Set.of(Pair.of(bys.Z, byt.b), Pair.of(bys.aR, byt.a), Pair.of(bys.m, byt.a)));
   }

   private static void d(bqq<cdt> $$0) {
      $$0.a(
         ckj.z,
         ImmutableList.of(Pair.of(0, new cdu.a(160, 180)), Pair.of(0, new cdu.c(40))),
         Set.of(Pair.of(bys.Z, byt.b), Pair.of(bys.m, byt.b), Pair.of(bys.aS, byt.a))
      );
   }

   private static void e(bqq<cdt> $$0) {
      $$0.a(
         ckj.b,
         ImmutableList.of(
            Pair.of(0, new brb(bpd.aR) {
               @Override
               protected void a(apf $$0, cbe $$1, long $$2) {
                  cdu.b((cdt)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new bru($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(apf $$0, bpx $$1, long $$2) {
                  cdu.b((cdt)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bsn(45, 90)),
            Pair.of(3, new cdu.b(40, 100)),
            Pair.of(
               4,
               new bte(
                  ImmutableList.of(
                     Pair.of(bto.a(1.0F, 3), 2),
                     Pair.of(new cdu.d(40, 80), 1),
                     Pair.of(new cdu.f(40, 80), 1),
                     Pair.of(btg.a(bpd.by, 6.0F), 1),
                     Pair.of(bsz.a(1.0F), 1),
                     Pair.of(new brr(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bys.aS, byt.b))
      );
   }

   static void a(cdt $$0) {
      $$0.dP().a(ImmutableList.of(ckj.z, ckj.v, ckj.b));
   }

   static class a extends brh<cdt> {
      a(int $$0, int $$1) {
         super(Map.of(bys.Z, byt.b, bys.m, byt.b, bys.aS, byt.a, bys.aG, byt.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cdt $$1) {
         return $$1.gn();
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         return $$1.dP().c(bys.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.f);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(bys.aG, axy.a, 9600L);
         } else {
            cdu.b($$1);
         }
      }
   }

   static class b extends brh<cdt> {
      b(int $$0, int $$1) {
         super(Map.of(bys.aT, byt.a), $$0, $$1);
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         return true;
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.b);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.a);
         $$1.dP().b(bys.aT);
      }
   }

   static class c extends brh<cdt> {
      c(int $$0) {
         super(Map.of(bys.Z, byt.b, bys.m, byt.b, bys.aS, byt.a, bys.aG, byt.a), $$0, $$0);
      }

      protected boolean a(apf $$0, cdt $$1) {
         return true;
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         return $$1.dP().c(bys.aS).isPresent();
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.g);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cdt.a.a).w($$3);
         $$1.dP().b(bys.aS);
         $$1.dP().a(bys.aT, true);
      }
   }

   static class d extends brh<cdt> {
      d(int $$0, int $$1) {
         super(Map.of(bys.Z, byt.b, bys.aS, byt.b, bys.aR, byt.b, bys.aT, byt.b, bys.r, byt.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cdt $$1) {
         return !$$1.y();
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         return true;
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.c);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.a);
      }
   }

   static class e extends brh<cdt> {
      e() {
         super(Map.of(bys.m, byt.a, bys.Z, byt.b, bys.aR, byt.a), 600);
      }

      protected boolean a(apf $$0, cdt $$1) {
         return $$1.gn();
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(cdt.a.a);
            return false;
         } else {
            Optional<ib> $$3 = $$1.dP().c(bys.m).map(byv::a).map(bsv::b);
            Optional<ib> $$4 = $$1.dP().c(bys.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.e);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dP().a(bys.aS, true);
         }

         $$1.dP().b(bys.m);
         $$1.dP().b(bys.aR);
      }
   }

   static class f extends brh<cdt> {
      f(int $$0, int $$1) {
         super(Map.of(bys.m, byt.b, bys.aR, byt.b, bys.aG, byt.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cdt $$1) {
         return !$$1.o_() && $$1.gn();
      }

      protected boolean a(apf $$0, cdt $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(apf $$0, cdt $$1, long $$2) {
         $$1.a(cdt.a.d);
      }

      protected void c(apf $$0, cdt $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cdt.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dP().a(bys.aR, $$1x);
               $$1.dP().a(bys.m, new byv($$1x, 1.25F, 0));
            });
         }
      }
   }
}
