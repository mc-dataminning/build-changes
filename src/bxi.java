import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxi extends bwi {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private arr h;
   private final Set<bwi> i = Sets.newHashSet();
   private int j;

   public bxi(bwr<? extends bxi> $$0, djm $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awo dl() {
      return awo.d;
   }

   @Nullable
   public arr f() {
      return this.h;
   }

   public void b(@Nullable arr $$0) {
      this.h = $$0;
   }

   private void m() {
      iv $$0 = this.n();
      eat $$1 = this.dU().a_($$0);
      if ($$1.a(dmt.ta)) {
         ((drm)$$1.b()).d($$1, this.dU(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dU().w_()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.oI, awo.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dU().a(this.dz(), this.dB(), this.dF(), awn.oH, awo.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bud $$0 = this.dU().an();
            if ($$0 == bud.c || $$0 == bud.d) {
               this.b(4);
            }

            this.m();
            b(this.dU(), this.n());
            this.a(eft.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dU() instanceof arq) {
               List<bwi> $$1 = this.dU()
                  .a(
                     this,
                     new fex(this.dz() - 15.0, this.dB() - 15.0, this.dF() - 15.0, this.dz() + 15.0, this.dB() + 6.0 + 15.0, this.dF() + 15.0),
                     $$0 -> $$0.bI() && !this.i.contains($$0)
                  );

               for (arr $$2 : ((arq)this.dU()).a($$0 -> $$0.f(this) < 256.0F)) {
                  aq.V.a($$2, this, $$1);
               }
            }

            this.aq();
         } else if (this.e < -this.ae.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ae.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.dU() instanceof arq)) {
            this.dU().c(2);
         } else if (!this.g) {
            List<bwi> $$3 = this.dU()
               .a(this, new fex(this.dz() - 3.0, this.dB() - 3.0, this.dF() - 3.0, this.dz() + 3.0, this.dB() + 6.0 + 3.0, this.dF() + 3.0), bwi::bI);

            for (bwi $$4 : $$3) {
               $$4.a((arq)this.dU(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               aq.F.a(this.h, $$3);
            }
         }
      }
   }

   private iv n() {
      ffc $$0 = this.ds();
      return iv.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dU() instanceof arq $$1 && $$1.O().c(dji.b)) {
         iv $$3 = this.du();
         eat $$4 = dme.a(this.dU(), $$3);
         if (this.dU().a_($$3).l() && $$4.a((djp)this.dU(), $$3)) {
            this.dU().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iv $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dme.a(this.dU(), $$6);
            if (this.dU().a_($$6).l() && $$4.a((djp)this.dU(), $$6)) {
               this.dU().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(djm $$0, iv $$1) {
      eat $$2 = $$0.a_($$1);
      iv $$3;
      eat $$4;
      if ($$2.a(dmt.ta)) {
         $$3 = $$1.a($$2.c(drm.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dwn) {
         $$0.b($$3, dwn.c($$0.a_($$3)));
         iv.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(djm $$0, iv $$1, iv.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iv> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iv> c(djm $$0, iv $$1) {
      for (iv $$2 : iv.a($$0.A, 10, $$1, 1)) {
         eat $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dwn) {
            dwn.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cJ();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bwi> j() {
      return this.i.stream().filter(bwi::bI);
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
