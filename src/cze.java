import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cze extends csx {
   public static final int a = 0;
   public static final int b = 4;
   public static final dgl c = dgb.aZ;
   private static final ImmutableList<ib> d = ImmutableList.of(
      new ib(0, 0, -1), new ib(-1, 0, 0), new ib(0, 0, 1), new ib(1, 0, 0), new ib(-1, 0, -1), new ib(1, 0, -1), new ib(-1, 0, 1), new ib(1, 0, 1)
   );
   private static final ImmutableList<ib> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(ib::o).iterator())
      .addAll(d.stream().map(ib::p).iterator())
      .add(new ib(0, 1, 0))
      .build();

   public cze(dfk.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public bha a(dfl $$0, cpx $$1, gw $$2, cbw $$3, bgz $$4, ehl $$5) {
      cjh $$6 = $$3.b($$4);
      if ($$4 == bgz.a && !a($$6) && a($$3.b(bgz.b))) {
         return bha.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fS().d) {
            $$6.h(1);
         }

         return bha.a($$1.B);
      } else if ($$0.c(c) == 0) {
         return bha.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bha.a($$1.B);
      } else {
         if (!$$1.B) {
            akt $$7 = (akt)$$3;
            if ($$7.R() != $$1.ac() || !$$2.equals($$7.P())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.tM, apg.e, 1.0F, 1.0F);
               return bha.a;
            }
         }

         return bha.b;
      }
   }

   private static boolean a(cjh $$0) {
      return $$0.a(cjk.eY);
   }

   private static boolean h(dfl $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gw $$0, cpx $$1) {
      eao $$2 = $$1.b_($$0);
      if (!$$2.a(apz.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eao $$4 = $$1.b_($$0.d());
            return !$$4.a(apz.a);
         }
      }
   }

   private void d(dfl $$0, cpx $$1, final gw $$2) {
      $$1.a($$2, false);
      boolean $$3 = hc.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(apz.a);
      cpq $$5 = new cpq() {
         @Override
         public Optional<Float> a(cpp $$0, cpd $$1, gw $$2x, dfl $$3, eao $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(csy.G.d()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ehp $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cpx.a.b);
   }

   public static boolean a(cpx $$0) {
      return $$0.C_().m();
   }

   public static void a(@Nullable bis $$0, cpx $$1, gw $$2, dfl $$3) {
      dfl $$4 = $$3.a(c, Integer.valueOf($$3.c(c) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(djv.c, $$2, djv.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.tK, apg.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apf.tJ, apg.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ix.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dfm.a<csx, dfl> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(dfl $$0) {
      return true;
   }

   public static int a(dfl $$0, int $$1) {
      return ary.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dfl $$0, cpx $$1, gw $$2) {
      return a($$0, 15);
   }

   public static Optional<ehp> a(biw<?> $$0, cph $$1, gw $$2) {
      Optional<ehp> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ehp> a(biw<?> $$0, cph $$1, gw $$2, boolean $$3) {
      gw.a $$4 = new gw.a();
      UnmodifiableIterator var5 = e.iterator();

      while (var5.hasNext()) {
         ib $$5 = (ib)var5.next();
         $$4.g($$2).h($$5);
         ehp $$6 = cds.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dfl $$0, cpd $$1, gw $$2, ebe $$3) {
      return false;
   }
}
