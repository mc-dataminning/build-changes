import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlj extends dfb {
   public static final MapCodec<dlj> a = b(dlj::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dte d = dsu.aZ;
   private static final ImmutableList<kd> e = ImmutableList.of(
      new kd(0, 0, -1), new kd(-1, 0, 0), new kd(0, 0, 1), new kd(1, 0, 0), new kd(-1, 0, -1), new kd(1, 0, -1), new kd(-1, 0, 1), new kd(1, 0, 1)
   );
   private static final ImmutableList<kd> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(kd::o).iterator())
      .addAll(e.stream().map(kd::p).iterator())
      .add(new kd(0, 1, 0))
      .build();

   @Override
   public MapCodec<dlj> a() {
      return a;
   }

   public dlj(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqy.a($$2.B);
      } else {
         return $$5 == bqv.a && a($$4.b(bqv.b)) && m($$1) ? bqy.e : bqy.d;
      }
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$0.c(d) == 0) {
         return bqw.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqw.a($$1.B);
      } else {
         if (!$$1.B) {
            arg $$5 = (arg)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vw, awb.e, 1.0F, 1.0F);
               return bqw.a;
            }
         }

         return bqw.c;
      }
   }

   private static boolean a(cur $$0) {
      return $$0.a(cuu.fu);
   }

   private static boolean m(dse $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dca $$1) {
      enx $$2 = $$1.b_($$0);
      if (!$$2.a(awv.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            enx $$4 = $$1.b_($$0.d());
            return !$$4.a(awv.a);
         }
      }
   }

   private void d(dse $$0, dca $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awv.a);
      dbt $$5 = new dbt() {
         @Override
         public Optional<Float> a(dbs $$0, dbg $$1, iz $$2x, dse $$3, enx $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dfd.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evt $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dca.a.b);
   }

   public static boolean a(dca $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsw $$0, dca $$1, iz $$2, dse $$3) {
      dse $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dwx.c, $$2, dwx.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vu, awb.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awa.vt, awb.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(li.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dse $$0) {
      return true;
   }

   public static int a(dse $$0, int $$1) {
      return ayz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dse $$0, dca $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evt> a(btc<?> $$0, dbk $$1, iz $$2) {
      Optional<evt> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evt> a(btc<?> $$0, dbk $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evt $$6 = cpa.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }
}
