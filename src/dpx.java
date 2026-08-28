import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dpx extends djk {
   public static final MapCodec<dpx> a = b(dpx::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dxu d = dxl.bc;
   private static final ImmutableList<km> e = ImmutableList.of(
      new km(0, 0, -1), new km(-1, 0, 0), new km(0, 0, 1), new km(1, 0, 0), new km(-1, 0, -1), new km(1, 0, -1), new km(-1, 0, 1), new km(1, 0, 1)
   );
   private static final ImmutableList<km> f = new Builder()
      .addAll(e)
      .addAll(e.stream().map(km::p).iterator())
      .addAll(e.stream().map(km::q).iterator())
      .add(new km(0, 1, 0))
      .build();

   @Override
   public MapCodec<dpx> a() {
      return a;
   }

   public dpx(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bsi.a;
      } else {
         return (bsi)($$5 == bsh.a && a($$4.b(bsh.b)) && o($$1) ? bsi.e : bsi.f);
      }
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$0.c(d) == 0) {
         return bsi.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bsi.a;
      } else {
         if (!$$1.C) {
            ard $$5 = (ard)$$3;
            if ($$5.V() != $$1.ai() || !$$2.equals($$5.T())) {
               $$5.a($$1.ai(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vZ, awa.e, 1.0F, 1.0F);
               return bsi.b;
            }
         }

         return bsi.c;
      }
   }

   private static boolean a(cwn $$0) {
      return $$0.a(cwr.fJ);
   }

   private static boolean o(dwv $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ji $$0, dgg $$1) {
      esx $$2 = $$1.b_($$0);
      if (!$$2.a(awu.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            esx $$4 = $$1.b_($$0.e());
            return !$$4.a(awu.a);
         }
      }
   }

   private void e(dwv $$0, dgg $$1, final ji $$2) {
      $$1.a($$2, false);
      boolean $$3 = jn.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(awu.a);
      dfz $$5 = new dfz() {
         @Override
         public Optional<Float> a(dfy $$0, dfl $$1, ji $$2x, dwv $$3, esx $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(djm.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fay $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dgg.a.b);
   }

   public static boolean a(dgg $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable buj $$0, dgg $$1, ji $$2, dwv $$3) {
      dwv $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ebr.c, $$2, ebr.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, avz.vX, awa.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dwv $$0, dgg $$1, ji $$2, azg $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, avz.vW, awa.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lt.aJ, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   public static int a(dwv $$0, int $$1) {
      return ayy.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return a($$0, 15);
   }

   public static Optional<fay> a(buq<?> $$0, dfp $$1, ji $$2) {
      Optional<fay> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fay> a(buq<?> $$0, dfp $$1, ji $$2, boolean $$3) {
      ji.a $$4 = new ji.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         km $$5 = (km)var5.next();
         $$4.g($$2).h($$5);
         fay $$6 = cra.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
