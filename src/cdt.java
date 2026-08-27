import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class cdt {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bzy<? extends bzx<? super cds>>> a = ImmutableList.of(bzy.c, bzy.f, bzy.d, bzy.y);
   static final List<byr<?>> b = ImmutableList.of(
      byr.n, byr.m, byr.E, byr.t, byr.Z, byr.aR, byr.aS, byr.aT, byr.aG, byr.aQ, byr.h, byr.r, new byr[]{byr.O, byr.P, byr.R}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static ctk a() {
      return ctk.a(cqn.vf);
   }

   protected static bqp<?> a(bqp<cds> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(ckh.a));
      $$0.b(ckh.b);
      $$0.f();
      return $$0;
   }

   static cds b(cds $$0) {
      $$0.dP().b(byr.aS);
      $$0.dP().b(byr.aR);
      return $$0.a(cds.a.a);
   }

   private static void b(bqp<cds> $$0) {
      $$0.a(ckh.a, 0, ImmutableList.of(new bua(0.8F), new brb<cds>(2.0F) {
         protected void a(apf $$0, cds $$1, long $$2) {
            cdt.b($$1);
            super.b($$0, $$1, $$2);
         }
      }, new bsq(500, 700), new brm(byr.P)));
   }

   private static void c(bqp<cds> $$0) {
      $$0.a(ckh.v, ImmutableList.of(Pair.of(0, new cdt.e())), Set.of(Pair.of(byr.Z, bys.b), Pair.of(byr.aR, bys.a), Pair.of(byr.m, bys.a)));
   }

   private static void d(bqp<cds> $$0) {
      $$0.a(
         ckh.z,
         ImmutableList.of(Pair.of(0, new cdt.a(160, 180)), Pair.of(0, new cdt.c(40))),
         Set.of(Pair.of(byr.Z, bys.b), Pair.of(byr.m, bys.b), Pair.of(byr.aS, bys.a))
      );
   }

   private static void e(bqp<cds> $$0) {
      $$0.a(
         ckh.b,
         ImmutableList.of(
            Pair.of(0, new bra(bpc.aQ) {
               @Override
               protected void a(apf $$0, cbd $$1, long $$2) {
                  cdt.b((cds)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new brt($$0x -> 1.25F, $$0x -> $$0x.o_() ? 2.5 : 3.5) {
               @Override
               protected void b(apf $$0, bpw $$1, long $$2) {
                  cdt.b((cds)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bsm(45, 90)),
            Pair.of(3, new cdt.b(40, 100)),
            Pair.of(
               4,
               new btd(
                  ImmutableList.of(
                     Pair.of(btn.a(1.0F, 3), 2),
                     Pair.of(new cdt.d(40, 80), 1),
                     Pair.of(new cdt.f(40, 80), 1),
                     Pair.of(btf.a(bpc.bx, 6.0F), 1),
                     Pair.of(bsy.a(1.0F), 1),
                     Pair.of(new brq(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(byr.aS, bys.b))
      );
   }

   static void a(cds $$0) {
      $$0.dP().a(ImmutableList.of(ckh.z, ckh.v, ckh.b));
   }

   static class a extends brg<cds> {
      a(int $$0, int $$1) {
         super(Map.of(byr.Z, bys.b, byr.m, bys.b, byr.aS, bys.a, byr.aG, bys.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cds $$1) {
         return $$1.gn();
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         return $$1.dP().c(byr.aS).isPresent() && $$1.gv() && !$$1.gr();
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.f);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dP().a(byr.aG, axy.a, 9600L);
         } else {
            cdt.b($$1);
         }
      }
   }

   static class b extends brg<cds> {
      b(int $$0, int $$1) {
         super(Map.of(byr.aT, bys.a), $$0, $$1);
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         return true;
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.b);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.a);
         $$1.dP().b(byr.aT);
      }
   }

   static class c extends brg<cds> {
      c(int $$0) {
         super(Map.of(byr.Z, bys.b, byr.m, bys.b, byr.aS, bys.a, byr.aG, bys.a), $$0, $$0);
      }

      protected boolean a(apf $$0, cds $$1) {
         return true;
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         return $$1.dP().c(byr.aS).isPresent();
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.g);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cds.a.a).w($$3);
         $$1.dP().b(byr.aS);
         $$1.dP().a(byr.aT, true);
      }
   }

   static class d extends brg<cds> {
      d(int $$0, int $$1) {
         super(Map.of(byr.Z, bys.b, byr.aS, bys.b, byr.aR, bys.b, byr.aT, bys.b, byr.r, bys.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cds $$1) {
         return !$$1.y();
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         return true;
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.c);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.a);
      }
   }

   static class e extends brg<cds> {
      e() {
         super(Map.of(byr.m, bys.a, byr.Z, bys.b, byr.aR, bys.a), 600);
      }

      protected boolean a(apf $$0, cds $$1) {
         return $$1.gn();
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         if (!$$1.gn()) {
            $$1.a(cds.a.a);
            return false;
         } else {
            Optional<ib> $$3 = $$1.dP().c(byr.m).map(byu::a).map(bsu::b);
            Optional<ib> $$4 = $$1.dP().c(byr.aR);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.e);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         if ($$1.gv() && $$1.gn()) {
            $$1.dP().a(byr.aS, true);
         }

         $$1.dP().b(byr.m);
         $$1.dP().b(byr.aR);
      }
   }

   static class f extends brg<cds> {
      f(int $$0, int $$1) {
         super(Map.of(byr.m, bys.b, byr.aR, bys.b, byr.aG, bys.b), $$0, $$1);
      }

      protected boolean a(apf $$0, cds $$1) {
         return !$$1.o_() && $$1.gn();
      }

      protected boolean a(apf $$0, cds $$1, long $$2) {
         return $$1.gn();
      }

      protected void b(apf $$0, cds $$1, long $$2) {
         $$1.a(cds.a.d);
      }

      protected void c(apf $$0, cds $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(cds.a.a);
         if ($$3) {
            $$1.gu().ifPresent($$1x -> {
               $$1.dP().a(byr.aR, $$1x);
               $$1.dP().a(byr.m, new byu($$1x, 1.25F, 0));
            });
         }
      }
   }
}
