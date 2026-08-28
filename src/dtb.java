import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dtb extends dmm {
   public static final MapCodec<dtb> a = b(dtb::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final ebo d = ebe.bc;
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
   public MapCodec<dtb> a() {
      return a;
   }

   public dtb(ean.d $$0) {
      super($$0);
      this.l(this.C.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bug a(czk $$0, eao $$1, djh $$2, iv $$3, crj $$4, buf $$5, fet $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bug.a;
      } else {
         return (bug)($$5 == buf.a && a($$4.b(buf.b)) && o($$1) ? bug.e : bug.f);
      }
   }

   @Override
   protected bug a(eao $$0, djh $$1, iv $$2, crj $$3, fet $$4) {
      if ($$0.c(d) == 0) {
         return bug.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.d($$0, $$1, $$2);
         }

         return bug.a;
      } else {
         if ($$3 instanceof arr $$5) {
            arr.a $$6 = $$5.T();
            arr.a $$7 = new arr.a($$1.aj(), $$2, 0.0F, false);
            if ($$6 == null || !$$6.a($$7)) {
               $$5.a($$7, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wn, awo.e, 1.0F, 1.0F);
               return bug.b;
            }
         }

         return bug.c;
      }
   }

   private static boolean a(czk $$0) {
      return $$0.a(czo.fQ);
   }

   private static boolean o(eao $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(iv $$0, djh $$1) {
      ewv $$2 = $$1.b_($$0);
      if (!$$2.a(axh.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            ewv $$4 = $$1.b_($$0.e());
            return !$$4.a(axh.a);
         }
      }
   }

   private void d(eao $$0, djh $$1, final iv $$2) {
      $$1.a($$2, false);
      boolean $$3 = jb.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(axh.a);
      djb $$5 = new djb() {
         @Override
         public Optional<Float> a(dja $$0, din $$1, iv $$2x, eao $$3, ewv $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(dmo.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fex $$6 = $$2.b();
      $$1.a(null, $$1.al().a($$6), $$5, $$6, 5.0F, true, djh.a.b);
   }

   public static boolean a(djh $$0) {
      return $$0.B_().m();
   }

   public static void a(@Nullable bwi $$0, djh $$1, iv $$2, eao $$3) {
      eao $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(efo.c, $$2, efo.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awn.wl, awo.e, 1.0F, 1.0F);
   }

   @Override
   public void a(eao $$0, djh $$1, iv $$2, azv $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awn.wk, awo.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(ly.aK, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(eap.a<dmm, eao> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(eao $$0) {
      return true;
   }

   public static int a(eao $$0, int $$1) {
      return azm.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(eao $$0, djh $$1, iv $$2) {
      return a($$0, 15);
   }

   public static Optional<fex> a(bwr<?> $$0, dir $$1, iv $$2) {
      Optional<fex> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fex> a(bwr<?> $$0, dir $$1, iv $$2, boolean $$3) {
      iv.a $$4 = new iv.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         ka $$5 = (ka)var5.next();
         $$4.g($$2).h($$5);
         fex $$6 = cuc.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(eao $$0, exk $$1) {
      return false;
   }
}
