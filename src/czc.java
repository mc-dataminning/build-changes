import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import javax.annotation.Nullable;

public class czc extends csv {
   public static final int a = 0;
   public static final int b = 4;
   public static final dgj c = dfz.aZ;
   private static final ImmutableList<ib> d = ImmutableList.of(
      new ib(0, 0, -1), new ib(-1, 0, 0), new ib(0, 0, 1), new ib(1, 0, 0), new ib(-1, 0, -1), new ib(1, 0, -1), new ib(-1, 0, 1), new ib(1, 0, 1)
   );
   private static final ImmutableList<ib> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(ib::o).iterator())
      .addAll(d.stream().map(ib::p).iterator())
      .add(new ib(0, 1, 0))
      .build();

   public czc(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public bgy a(dfj $$0, cpv $$1, gw $$2, cbu $$3, bgx $$4, ehj $$5) {
      cjf $$6 = $$3.b($$4);
      if ($$4 == bgx.a && !a($$6) && a($$3.b(bgx.b))) {
         return bgy.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fS().d) {
            $$6.h(1);
         }

         return bgy.a($$1.B);
      } else if ($$0.c(c) == 0) {
         return bgy.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bgy.a($$1.B);
      } else {
         if (!$$1.B) {
            aks $$7 = (aks)$$3;
            if ($$7.R() != $$1.ac() || !$$2.equals($$7.P())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ape.tM, apf.e, 1.0F, 1.0F);
               return bgy.a;
            }
         }

         return bgy.b;
      }
   }

   private static boolean a(cjf $$0) {
      return $$0.a(cji.eY);
   }

   private static boolean h(dfj $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gw $$0, cpv $$1) {
      eam $$2 = $$1.b_($$0);
      if (!$$2.a(apy.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eam $$4 = $$1.b_($$0.d());
            return !$$4.a(apy.a);
         }
      }
   }

   private void d(dfj $$0, cpv $$1, final gw $$2) {
      $$1.a($$2, false);
      boolean $$3 = hc.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(apy.a);
      cpo $$5 = new cpo() {
         @Override
         public Optional<Float> a(cpn $$0, cpb $$1, gw $$2x, dfj $$3, eam $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(csw.G.d()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ehn $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cpv.a.b);
   }

   public static boolean a(cpv $$0) {
      return $$0.C_().m();
   }

   public static void a(@Nullable biq $$0, cpv $$1, gw $$2, dfj $$3) {
      dfj $$4 = $$3.a(c, Integer.valueOf($$3.c(c) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(djt.c, $$2, djt.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ape.tK, apf.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, ape.tJ, apf.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ix.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(dfj $$0) {
      return true;
   }

   public static int a(dfj $$0, int $$1) {
      return arx.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dfj $$0, cpv $$1, gw $$2) {
      return a($$0, 15);
   }

   public static Optional<ehn> a(biu<?> $$0, cpf $$1, gw $$2) {
      Optional<ehn> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ehn> a(biu<?> $$0, cpf $$1, gw $$2, boolean $$3) {
      gw.a $$4 = new gw.a();
      UnmodifiableIterator var5 = e.iterator();

      while (var5.hasNext()) {
         ib $$5 = (ib)var5.next();
         $$4.g($$2).h($$5);
         ehn $$6 = cdq.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dfj $$0, cpb $$1, gw $$2, ebc $$3) {
      return false;
   }
}
