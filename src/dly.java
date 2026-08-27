import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dly extends dfc {
   public static final MapCodec<dly> a = b(dly::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final duc d = dts.aZ;
   private static final ImmutableList<jv> e = ImmutableList.of(
      new jv(0, 0, -1), new jv(-1, 0, 0), new jv(0, 0, 1), new jv(1, 0, 0), new jv(-1, 0, -1), new jv(1, 0, -1), new jv(-1, 0, 1), new jv(1, 0, 1)
   );
   private static final ImmutableList<jv> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jv::o).iterator())
      .addAll(e.stream().map(jv::p).iterator())
      .add(new jv(0, 1, 0))
      .build();

   @Override
   public MapCodec<dly> a() {
      return a;
   }

   public dly(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqc a(cuh $$0, dtc $$1, dca $$2, ir $$3, cly $$4, bpz $$5, ewq $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqc.a($$2.C);
      } else {
         return $$5 == bpz.a && a($$4.b(bpz.b)) && m($$1) ? bqc.e : bqc.d;
      }
   }

   @Override
   protected bqa a(dtc $$0, dca $$1, ir $$2, cly $$3, ewq $$4) {
      if ($$0.c(d) == 0) {
         return bqa.d;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bqa.a($$1.C);
      } else {
         if (!$$1.C) {
            aqu $$5 = (aqu)$$3;
            if ($$5.V() != $$1.af() || !$$2.equals($$5.T())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.vU, avq.e, 1.0F, 1.0F);
               return bqa.a;
            }
         }

         return bqa.b;
      }
   }

   private static boolean a(cuh $$0) {
      return $$0.a(cuk.gH);
   }

   private static boolean m(dtc $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ir $$0, dca $$1) {
      epe $$2 = $$1.b_($$0);
      if (!$$2.a(awj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            epe $$4 = $$1.b_($$0.d());
            return !$$4.a(awj.a);
         }
      }
   }

   private void d(dtc $$0, dca $$1, final ir $$2) {
      $$1.a($$2, false);
      boolean $$3 = iw.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awj.a);
      dbt $$5 = new dbt() {
         @Override
         public Optional<Float> a(dbs $$0, dbg $$1, ir $$2x, dtc $$3, epe $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfe.al.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ewu $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dca.a.b);
   }

   public static boolean a(dca $$0) {
      return $$0.E_().m();
   }

   public static void a(@Nullable brv $$0, dca $$1, ir $$2, dtc $$3) {
      dtc $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dxv.c, $$2, dxv.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avo.vS, avq.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dtc $$0, dca $$1, ir $$2, ayt $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avo.vR, avq.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lb.aG, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dtc $$0) {
      return true;
   }

   public static int a(dtc $$0, int $$1) {
      return aym.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dtc $$0, dca $$1, ir $$2) {
      return a($$0, 15);
   }

   public static Optional<ewu> a(bsb<?> $$0, dbk $$1, ir $$2) {
      Optional<ewu> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ewu> a(bsb<?> $$0, dbk $$1, ir $$2, boolean $$3) {
      ir.a $$4 = new ir.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jv $$5 = (jv)var5.next();
         $$4.g($$2).h($$5);
         ewu $$6 = cob.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
