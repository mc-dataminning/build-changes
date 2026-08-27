import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import org.slf4j.Logger;

public class bxk {
   private static final Logger c = LogUtils.getLogger();
   private static final int d = 6;
   static final List<bts<? extends btr<? super bxj>>> a = ImmutableList.of(bts.c, bts.f, bts.d, bts.w);
   static final List<bsn<?>> b = ImmutableList.of(
      bsn.n, bsn.m, bsn.E, bsn.t, bsn.Y, bsn.aQ, bsn.aR, bsn.aS, bsn.aF, bsn.aP, bsn.h, bsn.r, new bsn[]{bsn.N, bsn.O, bsn.Q}
   );
   private static final int e = 9600;
   private static final float f = 1.0F;
   private static final float g = 2.0F;
   private static final float h = 1.25F;
   private static final float i = 1.25F;

   public static cmm a() {
      return cmm.a(cjo.uo);
   }

   protected static bkm<?> a(bkm<bxj> $$0) {
      b($$0);
      e($$0);
      c($$0);
      d($$0);
      $$0.a(Set.of(cdl.a));
      $$0.b(cdl.b);
      $$0.f();
      return $$0;
   }

   static bxj b(bxj $$0) {
      $$0.dN().b(bsn.aR);
      $$0.dN().b(bsn.aQ);
      return $$0.a(bxj.a.a);
   }

   private static void b(bkm<bxj> $$0) {
      $$0.a(cdl.a, 0, ImmutableList.of(new bnw(0.8F), new bky(2.0F) {
         @Override
         protected void b(akt $$0, bjv $$1, long $$2) {
            bxk.b((bxj)$$1);
            super.b($$0, $$1, $$2);
         }
      }, new bmm(500, 700), new blj(bsn.O)));
   }

   private static void c(bkm<bxj> $$0) {
      $$0.a(cdl.v, ImmutableList.of(Pair.of(0, new bxk.e())), Set.of(Pair.of(bsn.Y, bso.b), Pair.of(bsn.aQ, bso.a), Pair.of(bsn.m, bso.a)));
   }

   private static void d(bkm<bxj> $$0) {
      $$0.a(
         cdl.z,
         ImmutableList.of(Pair.of(0, new bxk.a(160, 180)), Pair.of(0, new bxk.c(40))),
         Set.of(Pair.of(bsn.Y, bso.b), Pair.of(bsn.m, bso.b), Pair.of(bsn.aR, bso.a))
      );
   }

   private static void e(bkm<bxj> $$0) {
      $$0.a(
         cdl.b,
         ImmutableList.of(
            Pair.of(0, new bkx(bja.aN, 1.0F) {
               @Override
               protected void a(akt $$0, bux $$1, long $$2) {
                  bxk.b((bxj)$$1);
                  super.a($$0, $$1, $$2);
               }
            }),
            Pair.of(1, new blq($$0x -> 1.25F, $$0x -> $$0x.m_() ? 2.5 : 3.5) {
               @Override
               protected void b(akt $$0, bjv $$1, long $$2) {
                  bxk.b((bxj)$$1);
                  super.b($$0, $$1, $$2);
               }
            }),
            Pair.of(2, new bmi(45, 90)),
            Pair.of(3, new bxk.b(40, 100)),
            Pair.of(
               4,
               new bmz(
                  ImmutableList.of(
                     Pair.of(bnj.a(1.0F, 3), 2),
                     Pair.of(new bxk.d(40, 80), 1),
                     Pair.of(new bxk.f(40, 80), 1),
                     Pair.of(bnb.a(bja.bt, 6.0F), 1),
                     Pair.of(bmu.a(1.0F), 1),
                     Pair.of(new bln(5, 20), 2)
                  )
               )
            )
         ),
         Set.of(Pair.of(bsn.aR, bso.b))
      );
   }

   static void a(bxj $$0) {
      $$0.dN().a(ImmutableList.of(cdl.z, cdl.v, cdl.b));
   }

   static class a extends bld<bxj> {
      a(int $$0, int $$1) {
         super(Map.of(bsn.Y, bso.b, bsn.m, bso.b, bsn.aR, bso.a, bsn.aF, bso.b), $$0, $$1);
      }

      protected boolean a(akt $$0, bxj $$1) {
         return $$1.ge();
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         return $$1.dN().c(bsn.aR).isPresent() && $$1.gm() && !$$1.gi();
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.f);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         if ($$3) {
            $$1.dN().a(bsn.aF, atc.a, 9600L);
         } else {
            bxk.b($$1);
         }
      }
   }

   static class b extends bld<bxj> {
      b(int $$0, int $$1) {
         super(Map.of(bsn.aS, bso.a), $$0, $$1);
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         return true;
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.b);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.a);
         $$1.dN().b(bsn.aS);
      }
   }

   static class c extends bld<bxj> {
      c(int $$0) {
         super(Map.of(bsn.Y, bso.b, bsn.m, bso.b, bsn.aR, bso.a, bsn.aF, bso.a), $$0, $$0);
      }

      protected boolean a(akt $$0, bxj $$1) {
         return true;
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         return $$1.dN().c(bsn.aR).isPresent();
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.g);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxj.a.a).w($$3);
         $$1.dN().b(bsn.aR);
         $$1.dN().a(bsn.aS, true);
      }
   }

   static class d extends bld<bxj> {
      d(int $$0, int $$1) {
         super(Map.of(bsn.Y, bso.b, bsn.aR, bso.b, bsn.aQ, bso.b, bsn.aS, bso.b, bsn.r, bso.b), $$0, $$1);
      }

      protected boolean a(akt $$0, bxj $$1) {
         return !$$1.y();
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         return true;
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.c);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.a);
      }
   }

   static class e extends bld<bxj> {
      e() {
         super(Map.of(bsn.m, bso.a, bsn.Y, bso.b, bsn.aQ, bso.a), 600);
      }

      protected boolean a(akt $$0, bxj $$1) {
         return $$1.ge();
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         if (!$$1.ge()) {
            $$1.a(bxj.a.a);
            return false;
         } else {
            Optional<gw> $$3 = $$1.dN().c(bsn.m).map(bsq::a).map(bmq::b);
            Optional<gw> $$4 = $$1.dN().c(bsn.aQ);
            return !$$3.isEmpty() && !$$4.isEmpty() ? $$4.get().equals($$3.get()) : false;
         }
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.e);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         if ($$1.gm() && $$1.ge()) {
            $$1.dN().a(bsn.aR, true);
         }

         $$1.dN().b(bsn.m);
         $$1.dN().b(bsn.aQ);
      }
   }

   static class f extends bld<bxj> {
      f(int $$0, int $$1) {
         super(Map.of(bsn.m, bso.b, bsn.aQ, bso.b, bsn.aF, bso.b), $$0, $$1);
      }

      protected boolean a(akt $$0, bxj $$1) {
         return !$$1.m_() && $$1.ge();
      }

      protected boolean a(akt $$0, bxj $$1, long $$2) {
         return $$1.ge();
      }

      protected void b(akt $$0, bxj $$1, long $$2) {
         $$1.a(bxj.a.d);
      }

      protected void c(akt $$0, bxj $$1, long $$2) {
         boolean $$3 = this.a($$2);
         $$1.a(bxj.a.a);
         if ($$3) {
            $$1.gl().ifPresent($$1x -> {
               $$1.dN().a(bsn.aQ, $$1x);
               $$1.dN().a(bsn.m, new bsq($$1x, 1.25F, 0));
            });
         }
      }
   }
}
