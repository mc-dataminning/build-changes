import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cyt extends csm {
   public static final int a = 0;
   public static final int b = 4;
   public static final dga c = dfq.aZ;
   private static final ImmutableList<hz> d = ImmutableList.of(
      new hz(0, 0, -1), new hz(-1, 0, 0), new hz(0, 0, 1), new hz(1, 0, 0), new hz(-1, 0, -1), new hz(1, 0, -1), new hz(-1, 0, 1), new hz(1, 0, 1)
   );
   private static final ImmutableList<hz> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(hz::o).iterator())
      .addAll(d.stream().map(hz::p).iterator())
      .add(new hz(0, 1, 0))
      .build();

   public cyt(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      ciy $$6 = $$3.b($$4);
      if ($$4 == bgp.a && !a($$6) && a($$3.b(bgp.b))) {
         return bgq.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fR().d) {
            $$6.h(1);
         }

         return bgq.a($$1.B);
      } else if ($$0.c(c) == 0) {
         return bgq.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bgq.a($$1.B);
      } else {
         if (!$$1.B) {
            akl $$7 = (akl)$$3;
            if ($$7.Q() != $$1.ac() || !$$2.equals($$7.O())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.tM, aox.e, 1.0F, 1.0F);
               return bgq.a;
            }
         }

         return bgq.b;
      }
   }

   private static boolean a(ciy $$0) {
      return $$0.a(cjb.eY);
   }

   private static boolean h(dfa $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gu $$0, cpm $$1) {
      ead $$2 = $$1.b_($$0);
      if (!$$2.a(apq.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ead $$4 = $$1.b_($$0.d());
            return !$$4.a(apq.a);
         }
      }
   }

   private void d(dfa $$0, cpm $$1, final gu $$2) {
      $$1.a($$2, false);
      boolean $$3 = ha.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(apq.a);
      cpf $$5 = new cpf() {
         @Override
         public Optional<Float> a(cpe $$0, cos $$1, gu $$2x, dfa $$3, ead $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(csn.G.d()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ehe $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cpm.a.b);
   }

   public static boolean a(cpm $$0) {
      return $$0.x_().m();
   }

   public static void a(@Nullable bii $$0, cpm $$1, gu $$2, dfa $$3) {
      dfa $$4 = $$3.a(c, Integer.valueOf($$3.c(c) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(djk.c, $$2, djk.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.tK, aox.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.tJ, aox.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(iv.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(dfa $$0) {
      return true;
   }

   public static int a(dfa $$0, int $$1) {
      return arp.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dfa $$0, cpm $$1, gu $$2) {
      return a($$0, 15);
   }

   public static Optional<ehe> a(bim<?> $$0, cow $$1, gu $$2) {
      Optional<ehe> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ehe> a(bim<?> $$0, cow $$1, gu $$2, boolean $$3) {
      gu.a $$4 = new gu.a();
      UnmodifiableIterator var5 = e.iterator();

      while (var5.hasNext()) {
         hz $$5 = (hz)var5.next();
         $$4.g($$2).h($$5);
         ehe $$6 = cdj.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
