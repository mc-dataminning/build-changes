import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class czi extends ctc {
   public static final MapCodec<czi> a = b(czi::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dgd d = dft.aZ;
   private static final ImmutableList<hy> e = ImmutableList.of(
      new hy(0, 0, -1), new hy(-1, 0, 0), new hy(0, 0, 1), new hy(1, 0, 0), new hy(-1, 0, -1), new hy(1, 0, -1), new hy(-1, 0, 1), new hy(1, 0, 1)
   );
   private static final ImmutableList<hy> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(hy::o).iterator())
      .addAll(e.stream().map(hy::p).iterator())
      .add(new hy(0, 1, 0))
      .build();

   @Override
   public MapCodec<czi> a() {
      return a;
   }

   public czi(dfc.d $$0) {
      super($$0);
      this.k(this.E.b().a(d, Integer.valueOf(0)));
   }

   @Override
   public bhe a(dfd $$0, cqb $$1, gw $$2, cca $$3, bhd $$4, ehd $$5) {
      cjl $$6 = $$3.b($$4);
      if ($$4 == bhd.a && !a($$6) && a($$3.b(bhd.b))) {
         return bhe.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fT().d) {
            $$6.h(1);
         }

         return bhe.a($$1.B);
      } else if ($$0.c(d) == 0) {
         return bhe.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bhe.a($$1.B);
      } else {
         if (!$$1.B) {
            aku $$7 = (aku)$$3;
            if ($$7.R() != $$1.ac() || !$$2.equals($$7.P())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.tM, aph.e, 1.0F, 1.0F);
               return bhe.a;
            }
         }

         return bhe.b;
      }
   }

   private static boolean a(cjl $$0) {
      return $$0.a(cjo.eY);
   }

   private static boolean h(dfd $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(gw $$0, cqb $$1) {
      eag $$2 = $$1.b_($$0);
      if (!$$2.a(aqa.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eag $$4 = $$1.b_($$0.d());
            return !$$4.a(aqa.a);
         }
      }
   }

   private void d(dfd $$0, cqb $$1, final gw $$2) {
      $$1.a($$2, false);
      boolean $$3 = ha.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(aqa.a);
      cpu $$5 = new cpu() {
         @Override
         public Optional<Float> a(cpt $$0, cph $$1, gw $$2x, dfd $$3, eag $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cte.G.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ehh $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cqb.a.b);
   }

   public static boolean a(cqb $$0) {
      return $$0.C_().m();
   }

   public static void a(@Nullable biw $$0, cqb $$1, gw $$2, dfd $$3) {
      dfd $$4 = $$3.a(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(djn.c, $$2, djn.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.tK, aph.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dfd $$0, cqb $$1, gw $$2, ash $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apg.tJ, aph.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(iv.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dfe.a<ctc, dfd> $$0) {
      $$0.a(d);
   }

   @Override
   public boolean d_(dfd $$0) {
      return true;
   }

   public static int a(dfd $$0, int $$1) {
      return asb.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dfd $$0, cqb $$1, gw $$2) {
      return a($$0, 15);
   }

   public static Optional<ehh> a(bja<?> $$0, cpl $$1, gw $$2) {
      Optional<ehh> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ehh> a(bja<?> $$0, cpl $$1, gw $$2, boolean $$3) {
      gw.a $$4 = new gw.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         hy $$5 = (hy)var5.next();
         $$4.g($$2).h($$5);
         ehh $$6 = cdw.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dfd $$0, cph $$1, gw $$2, eaw $$3) {
      return false;
   }
}
