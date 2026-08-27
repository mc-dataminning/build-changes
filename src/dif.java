import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dif extends dby {
   public static final MapCodec<dif> a = b(dif::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dpz d = dpp.aZ;
   private static final ImmutableList<jg> e = ImmutableList.of(
      new jg(0, 0, -1), new jg(-1, 0, 0), new jg(0, 0, 1), new jg(1, 0, 0), new jg(-1, 0, -1), new jg(1, 0, -1), new jg(-1, 0, 1), new jg(1, 0, 1)
   );
   private static final ImmutableList<jg> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(jg::o).iterator())
      .addAll(e.stream().map(jg::p).iterator())
      .add(new jg(0, 1, 0))
      .build();

   @Override
   public MapCodec<dif> a() {
      return a;
   }

   public dif(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      if (a($$0) && m($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return boc.a($$2.B);
      } else {
         return $$5 == bnz.a && a($$4.b(bnz.b)) && m($$1) ? boc.e : boc.d;
      }
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$0.c(d) == 0) {
         return boa.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return boa.a($$1.B);
      } else {
         if (!$$1.B) {
            apt $$5 = (apt)$$3;
            if ($$5.T() != $$1.ae() || !$$2.equals($$5.R())) {
               $$5.a($$1.ae(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.vd, aun.e, 1.0F, 1.0F);
               return boa.a;
            }
         }

         return boa.b;
      }
   }

   private static boolean a(crj $$0) {
      return $$0.a(crm.ft);
   }

   private static boolean m(doz $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ib $$0, cyx $$1) {
      eks $$2 = $$1.b_($$0);
      if (!$$2.a(avh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eks $$4 = $$1.b_($$0.d());
            return !$$4.a(avh.a);
         }
      }
   }

   private void d(doz $$0, cyx $$1, final ib $$2) {
      $$1.a($$2, false);
      boolean $$3 = ih.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(avh.a);
      cyq $$5 = new cyq() {
         @Override
         public Optional<Float> a(cyp $$0, cyd $$1, ib $$2x, doz $$3, eks $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dca.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      esa $$6 = $$2.b();
      $$1.a(null, $$1.ai().a($$6), $$5, $$6, 5.0F, true, cyx.a.b);
   }

   public static boolean a(cyx $$0) {
      return $$0.D_().m();
   }

   public static void a(@Nullable bpv $$0, cyx $$1, ib $$2, doz $$3) {
      doz $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dts.c, $$2, dts.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aum.vb, aun.e, 1.0F, 1.0F);
   }

   @Override
   public void a(doz $$0, cyx $$1, ib $$2, axr $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, aum.va, aun.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(kl.aF, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean d_(doz $$0) {
      return true;
   }

   public static int a(doz $$0, int $$1) {
      return axk.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(doz $$0, cyx $$1, ib $$2) {
      return a($$0, 15);
   }

   public static Optional<esa> a(bqb<?> $$0, cyh $$1, ib $$2) {
      Optional<esa> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<esa> a(bqb<?> $$0, cyh $$1, ib $$2, boolean $$3) {
      ib.a $$4 = new ib.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         jg $$5 = (jg)var5.next();
         $$4.g($$2).h($$5);
         esa $$6 = clt.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
