import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Optional;
import javax.annotation.Nullable;

public class cvu extends cpn {
   public static final int a = 0;
   public static final int b = 4;
   public static final ddb c = dcr.aZ;
   private static final ImmutableList<hz> d = ImmutableList.of(
      new hz(0, 0, -1), new hz(-1, 0, 0), new hz(0, 0, 1), new hz(1, 0, 0), new hz(-1, 0, -1), new hz(1, 0, -1), new hz(-1, 0, 1), new hz(1, 0, 1)
   );
   private static final ImmutableList<hz> e = new Builder()
      .addAll(d)
      .addAll(d.stream().map(hz::o).iterator())
      .addAll(d.stream().map(hz::p).iterator())
      .add(new hz(0, 1, 0))
      .build();

   public cvu(dca.d $$0) {
      super($$0);
      this.k(this.C.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public bdx a(dcb $$0, cmm $$1, gu $$2, byo $$3, bdw $$4, eee $$5) {
      cfz $$6 = $$3.b($$4);
      if ($$4 == bdw.a && !a($$6) && a($$3.b(bdw.b))) {
         return bdx.d;
      } else if (a($$6) && h($$0)) {
         a($$3, $$1, $$2, $$0);
         if (!$$3.fO().d) {
            $$6.h(1);
         }

         return bdx.a($$1.B);
      } else if ($$0.c(c) == 0) {
         return bdx.d;
      } else if (!a($$1)) {
         if (!$$1.B) {
            this.d($$0, $$1, $$2);
         }

         return bdx.a($$1.B);
      } else {
         if (!$$1.B) {
            aig $$7 = (aig)$$3;
            if ($$7.P() != $$1.ac() || !$$2.equals($$7.N())) {
               $$7.a($$1.ac(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.tM, ami.e, 1.0F, 1.0F);
               return bdx.a;
            }
         }

         return bdx.b;
      }
   }

   private static boolean a(cfz $$0) {
      return $$0.a(cgc.eY);
   }

   private static boolean h(dcb $$0) {
      return $$0.c(c) < 4;
   }

   private static boolean a(gu $$0, cmm $$1) {
      dxe $$2 = $$1.b_($$0);
      if (!$$2.a(anb.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            dxe $$4 = $$1.b_($$0.d());
            return !$$4.a(anb.a);
         }
      }
   }

   private void d(dcb $$0, cmm $$1, final gu $$2) {
      $$1.a($$2, false);
      boolean $$3 = ha.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.c()).a(anb.a);
      cmf $$5 = new cmf() {
         @Override
         public Optional<Float> a(cme $$0, cls $$1, gu $$2x, dcb $$3, dxe $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(cpo.G.d()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      eei $$6 = $$2.b();
      $$1.a(null, $$1.ag().a($$6), $$5, $$6, 5.0F, true, cmm.a.b);
   }

   public static boolean a(cmm $$0) {
      return $$0.x_().m();
   }

   public static void a(@Nullable bfj $$0, cmm $$1, gu $$2, dcb $$3) {
      dcb $$4 = $$3.a(c, Integer.valueOf($$3.c(c) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(dgl.c, $$2, dgl.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.tK, ami.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      if ($$0.c(c) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, amh.tJ, ami.e, 1.0F, 1.0F);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(iv.aB, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dcc.a<cpn, dcb> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean d_(dcb $$0) {
      return true;
   }

   public static int a(dcb $$0, int $$1) {
      return apa.d((float)($$0.c(c) - 0) / 4.0F * (float)$$1);
   }

   @Override
   public int a(dcb $$0, cmm $$1, gu $$2) {
      return a($$0, 15);
   }

   public static Optional<eei> a(bfn<?> $$0, clw $$1, gu $$2) {
      Optional<eei> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<eei> a(bfn<?> $$0, clw $$1, gu $$2, boolean $$3) {
      gu.a $$4 = new gu.a();
      UnmodifiableIterator var5 = e.iterator();

      while (var5.hasNext()) {
         hz $$5 = (hz)var5.next();
         $$4.g($$2).h($$5);
         eei $$6 = cak.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(dcb $$0, cls $$1, gu $$2, dxu $$3) {
      return false;
   }
}
