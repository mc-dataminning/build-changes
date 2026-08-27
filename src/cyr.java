import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyr extends csk {
   public static final int a = 0;
   public static final int b = 4;
   public static final dfy c = dfo.aZ;
   private static final ImmutableList<ia> d = ImmutableList.of(
      new ia(0, 0, -1), new ia(-1, 0, 0), new ia(0, 0, 1), new ia(1, 0, 0), new ia(-1, 0, -1), new ia(1, 0, -1), new ia(-1, 0, 1), new ia(1, 0, 1)
   );
   private static final ImmutableList<ia> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(ia::o).iterator())
      .addAll(d.stream().map(ia::p).iterator())
      .add(new ia(0, 1, 0))
      .build();

   public cyr(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      ciw $$6 = $$3.b($$4);
      if ($$4 == bgn.a && !a($$6) && a($$3.b(bgn.b))) {
         return bgo.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fR().d) {
            $$6.h(1);
         }

         return bgo.a($$1.B);
      } else if ($$0.c(c) == 0) {
         return bgo.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bgo.a($$1.B);
      } else {
         if (!$$1.B) {
            akj $$7 = (akj)$$3;
            if ($$7.Q() != $$1.ac() || !$$2.equals($$7.O())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.tM, aov.e, 1.0F, 1.0F);
               return bgo.a;
            }
         }

         return bgo.b;
      }
   }

   private static boolean a(ciw $$0) {
      return $$0.a(ciz.eY);
   }

   private static boolean h(dey $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gv $$0, cpk $$1) {
      eab $$2 = $$1.b_($$0);
      if (!$$2.a(apo.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eab $$4 = $$1.b_($$0.d());
            return !$$4.a(apo.a);
         }
      }
   }

   private void d(dey $$0, cpk $$1, final gv $$2) {
      $$1.a($$2, false);
      boolean $$3 = hb.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(apo.a);
      cpd $$5 = new cpd() {
         @Override
         public Optional<Float> a(cpc $$0, coq $$1, gv $$2x, dey $$3, eab $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(csl.G.d()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ehf $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cpk.a.b);
   }

   public static boolean a(cpk $$0) {
      return $$0.x_().m();
   }

   public static void a(@Nullable big $$0, cpk $$1, gv $$2, dey $$3) {
      dey $$4 = $$3.a(c, Integer.valueOf($$3.c(c) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dji.c, $$2, dji.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.tK, aov.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.tJ, aov.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(iw.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(dey $$0) {
      return true;
   }

   public static int a(dey $$0, int $$1) {
      return aro.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dey $$0, cpk $$1, gv $$2) {
      return a($$0, 15);
   }

   public static Optional<ehf> a(bik<?> $$0, cou $$1, gv $$2) {
      Optional<ehf> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ehf> a(bik<?> $$0, cou $$1, gv $$2, boolean $$3) {
      gv.a $$4 = new gv.a();
      UnmodifiableIterator var5 = e.iterator();

      while (var5.hasNext()) {
         ia $$5 = (ia)var5.next();
         $$4.g($$2).h($$5);
         ehf $$6 = cdh.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }
}
