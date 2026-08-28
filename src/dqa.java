import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.serialization.MapCodec;
import java.util.Optional;
import javax.annotation.Nullable;

public class dqa extends djn {
   public static final MapCodec<dqa> a = b(dqa::new);
   public static final int b = 0;
   public static final int c = 4;
   public static final dxx d = dxo.bc;
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
   public MapCodec<dqa> a() {
      return a;
   }

   public dqa(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(d, Integer.valueOf(0)));
   }

   @Override
   protected bsl a(cwq $$0, dwy $$1, dgj $$2, ji $$3, coy $$4, bsk $$5, fax $$6) {
      if (a($$0) && o($$1)) {
         a($$4, $$2, $$3, $$1);
         $$0.a(1, $$4);
         return bsl.a;
      } else {
         return (bsl)($$5 == bsk.a && a($$4.b(bsk.b)) && o($$1) ? bsl.e : bsl.f);
      }
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if ($$0.c(d) == 0) {
         return bsl.e;
      } else if (!a($$1)) {
         if (!$$1.C) {
            this.e($$0, $$1, $$2);
         }

         return bsl.a;
      } else {
         if (!$$1.C) {
            are $$5 = (are)$$3;
            if ($$5.V() != $$1.ai() || !$$2.equals($$5.T())) {
               $$5.a($$1.ai(), $$2, 0.0F, false, true);
               $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vZ, awb.e, 1.0F, 1.0F);
               return bsl.b;
            }
         }

         return bsl.c;
      }
   }

   private static boolean a(cwq $$0) {
      return $$0.a(cwu.fJ);
   }

   private static boolean o(dwy $$0) {
      return $$0.c(d) < 4;
   }

   private static boolean a(ji $$0, dgj $$1) {
      eta $$2 = $$1.b_($$0);
      if (!$$2.a(awv.a)) {
         return false;
      } else if ($$2.b()) {
         return true;
      } else {
         float $$3 = (float)$$2.e();
         if ($$3 < 2.0F) {
            return false;
         } else {
            eta $$4 = $$1.b_($$0.e());
            return !$$4.a(awv.a);
         }
      }
   }

   private void e(dwy $$0, dgj $$1, final ji $$2) {
      $$1.a($$2, false);
      boolean $$3 = jn.c.a.a().map($$2::a).anyMatch($$1x -> a($$1x, $$1));
      final boolean $$4 = $$3 || $$1.b_($$2.d()).a(awv.a);
      dgc $$5 = new dgc() {
         @Override
         public Optional<Float> a(dgb $$0, dfo $$1, ji $$2x, dwy $$3, eta $$4x) {
            return $$2.equals($$2) && $$4 ? Optional.of(djp.J.e()) : super.a($$0, $$1, $$2, $$3, $$4);
         }
      };
      fbb $$6 = $$2.b();
      $$1.a(null, $$1.ak().a($$6), $$5, $$6, 5.0F, true, dgj.a.b);
   }

   public static boolean a(dgj $$0) {
      return $$0.G_().m();
   }

   public static void a(@Nullable bum $$0, dgj $$1, ji $$2, dwy $$3) {
      dwy $$4 = $$3.b(d, Integer.valueOf($$3.c(d) + 1));
      $$1.a($$2, $$4, 3);
      $$1.a(ebu.c, $$2, ebu.a.a($$0, $$4));
      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, awa.vX, awb.e, 1.0F, 1.0F);
   }

   @Override
   public void a(dwy $$0, dgj $$1, ji $$2, azh $$3) {
      if ($$0.c(d) != 0) {
         if ($$3.a(100) == 0) {
            $$1.a($$2, awa.vW, awb.e, 1.0F, 1.0F, false);
         }

         double $$4 = (double)$$2.u() + 0.5 + (0.5 - $$3.j());
         double $$5 = (double)$$2.v() + 1.0;
         double $$6 = (double)$$2.w() + 0.5 + (0.5 - $$3.j());
         double $$7 = (double)$$3.i() * 0.04;
         $$1.a(lt.aJ, $$4, $$5, $$6, 0.0, $$7, 0.0);
      }
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(d);
   }

   @Override
   protected boolean c_(dwy $$0) {
      return true;
   }

   public static int a(dwy $$0, int $$1) {
      return ayz.d((float)($$0.c(d) - 0) / 4.0F * (float)$$1);
   }

   @Override
   protected int a(dwy $$0, dgj $$1, ji $$2) {
      return a($$0, 15);
   }

   public static Optional<fbb> a(but<?> $$0, dfs $$1, ji $$2) {
      Optional<fbb> $$3 = a($$0, $$1, $$2, true);
      return $$3.isPresent() ? $$3 : a($$0, $$1, $$2, false);
   }

   private static Optional<fbb> a(but<?> $$0, dfs $$1, ji $$2, boolean $$3) {
      ji.a $$4 = new ji.a();
      UnmodifiableIterator var5 = f.iterator();

      while (var5.hasNext()) {
         km $$5 = (km)var5.next();
         $$4.g($$2).h($$5);
         fbb $$6 = crd.a($$0, $$1, $$4, $$3);
         if ($$6 != null) {
            return Optional.of($$6);
         }
      }

      return Optional.empty();
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }
}
