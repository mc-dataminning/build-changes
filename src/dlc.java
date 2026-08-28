import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dlc extends deu {
   public static final MapCodec<dlc> a = b(dlc::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dsx d = dsn.aZ;
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
   public MapCodec<dlc> a() {
      return a;
   }

   public dlc(drw.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected bqr a(cuk $$0, drx $$1, dbt $$2, iz $$3, cms $$4, bqo $$5, evi $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bqr.a($$2.B);
      } else {
         return $$5 == bqo.a && a($$4.b(bqo.b)) && m($$1) ? bqr.e : bqr.d;
      }
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$0.c(d) == 0) {
         return bqp.e;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bqp.a($$1.B);
      } else {
         if (!$$1.B) {
            arc $$5 = (arc)$$3;
            if ($$5.T() != $$1.af() || !$$2.equals($$5.R())) {
               $$5.a($$1.af(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avw.vw, avx.e, 1.0F, 1.0F);
               return bqp.a;
            }
         }

         return bqp.c;
      }
   }

   private static boolean a(cuk $$0) {
      return $$0.a(cun.fu);
   }

   private static boolean m(drx $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iz $$0, dbt $$1) {
      enq $$2 = $$1.b_($$0);
      if (!$$2.a(awr.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            enq $$4 = $$1.b_($$0.d());
            return !$$4.a(awr.a);
         }
      }
   }

   private void d(drx $$0, dbt $$1, final iz $$2) {
      $$1.a($$2, false);
      boolean $$3 = je.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(awr.a);
      dbm $$5 = new dbm() {
         @Override
         public Optional<Float> a(dbl $$0, daz $$1, iz $$2x, drx $$3, enq $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dew.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      evm $$6 = $$2.b();
      $$1.a(null, $$1.aj().a($$6), $$5, $$6, 5.0F, true, dbt.a.b);
   }

   public static boolean a(dbt $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bsp $$0, dbt $$1, iz $$2, drx $$3) {
      drx $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dwq.c, $$2, dwq.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avw.vu, avx.e, 1.0F, 1.0F);
   }

   @Override
   public void a(drx $$0, dbt $$1, iz $$2, azc $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avw.vt, avx.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lj.aH, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(drx $$0) {
      return true;
   }

   public static int a(drx $$0, int $$1) {
      return ayu.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(drx $$0, dbt $$1, iz $$2) {
      return a($$0, 15);
   }

   public static Optional<evm> a(bsv<?> $$0, dbd $$1, iz $$2) {
      Optional<evm> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<evm> a(bsv<?> $$0, dbd $$1, iz $$2, boolean $$3) {
      iz.a $$4 = new iz.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         kd $$5 = (kd)var5.next();
         $$4.g($$2).h($$5);
         evm $$6 = cot.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(drx $$0, eof $$1) {
      return false;
   }
}
