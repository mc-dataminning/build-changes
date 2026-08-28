import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtr extends dnc {
   public static final MapCodec<dtr> a = b(dtr::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ece d = ebu.bc;
   private static final ImmutableList<ka> e = ImmutableList.of(
      new ka(0, 0, -1), new ka(-1, 0, 0), new ka(0, 0, 1), new ka(1, 0, 0), new ka(-1, 0, -1), new ka(1, 0, -1), new ka(-1, 0, 1), new ka(1, 0, 1)
   );
   private static final ImmutableList<ka> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(ka::p).iterator())
      .addAll(e.stream().map(ka::q).iterator())
      .add(new ka(0, 1, 0))
      .build();

   @Override
   public MapCodec<dtr> a() {
      return a;
   }

   public dtr(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bur.a;
      } else {
         return (bur)($$5 == buq.a && a($$4.b(buq.b)) && o($$1) ? bur.e : bur.f);
      }
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if ($$0.c(d) == 0) {
         return bur.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bur.a;
      } else {
         if ($$3 instanceof art $$5) {
            art.a $$6 = $$5.T();
            art.a $$7 = new art.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.wn, awq.e, 1.0F, 1.0F);
               return bur.b;
            }
         }

         return bur.c;
      }
   }

   private static boolean a(czy $$0) {
      return $$0.a(dac.fQ);
   }

   private static boolean o(ebe $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iv $$0, djx $$1) {
      exo $$2 = $$1.b_($$0);
      if (!$$2.a(axj.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            exo $$4 = $$1.b_($$0.e());
            return !$$4.a(axj.a);
         }
      }
   }

   private void d(ebe $$0, djx $$1, final iv $$2) {
      $$1.a($$2, false);
      boolean $$3 = jb.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axj.a);
      djr $$5 = new djr() {
         @Override
         public Optional<Float> a(djq $$0, djb $$1, iv $$2x, ebe $$3, exo $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dne.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      ffq $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, djx.a.b);
   }

   public static boolean a(djx $$0) {
      return $$0.F_().m();
   }

   public static void a(@Nullable bwt $$0, djx $$1, iv $$2, ebe $$3) {
      ebe $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ege.c, $$2, ege.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awp.wl, awq.e, 1.0F, 1.0F);
   }

   @Override
   public void a(ebe $$0, djx $$1, iv $$2, azx $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awp.wk, awq.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ly.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(ebe $$0) {
      return true;
   }

   public static int a(ebe $$0, int $$1) {
      return azo.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(ebe $$0, djx $$1, iv $$2) {
      return a($$0, 15);
   }

   public static Optional<ffq> a(bxc<?> $$0, djf $$1, iv $$2) {
      Optional<ffq> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<ffq> a(bxc<?> $$0, djf $$1, iv $$2, boolean $$3) {
      iv.a $$4 = new iv.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ka $$5 = (ka)var5.next();
         $$4.g($$2).h($$5);
         ffq $$6 = cuq.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
