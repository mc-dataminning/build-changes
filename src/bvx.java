import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvx extends bva {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private are h;
   private final Set<bva> i = Sets.newHashSet();
   private int j;

   public bvx(bvi<? extends bvx> $$0, dgz $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awb dl() {
      return awb.d;
   }

   @Nullable
   public are f() {
      return this.h;
   }

   public void b(@Nullable are $$0) {
      this.h = $$0;
   }

   private void m() {
      ji $$0 = this.n();
      dxq $$1 = this.dU().a_($$0);
      if ($$1.a(dkg.sU)) {
         ((dox)$$1.b()).e($$1, this.dU(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dU().w_()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.oE, awb.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dU().a(this.dz(), this.dB(), this.dF(), awa.oD, awb.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bsv $$0 = this.dU().an();
            if ($$0 == bsv.c || $$0 == bsv.d) {
               this.b(4);
            }

            this.m();
            a(this.dU(), this.n());
            this.a(ecp.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dU() instanceof ard) {
               List<bva> $$1 = this.dU()
                  .a(
                     this,
                     new fbs(this.dz() - 15.0, this.dB() - 15.0, this.dF() - 15.0, this.dz() + 15.0, this.dB() + 6.0 + 15.0, this.dF() + 15.0),
                     $$0 -> $$0.bJ() && !this.i.contains($$0)
                  );

               for (are $$2 : ((ard)this.dU()).a($$0 -> $$0.f(this) < 256.0F)) {
                  ap.V.a($$2, this, $$1);
               }
            }

            this.at();
         } else if (this.e < -this.ae.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ae.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.dU() instanceof ard)) {
            this.dU().c(2);
         } else if (!this.g) {
            List<bva> $$3 = this.dU()
               .a(this, new fbs(this.dz() - 3.0, this.dB() - 3.0, this.dF() - 3.0, this.dz() + 3.0, this.dB() + 6.0 + 3.0, this.dF() + 3.0), bva::bJ);

            for (bva $$4 : $$3) {
               $$4.a((ard)this.dU(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ap.F.a(this.h, $$3);
            }
         }
      }
   }

   private ji n() {
      fbx $$0 = this.ds();
      return ji.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dU() instanceof ard $$1 && $$1.O().b(dgv.b)) {
         ji $$3 = this.du();
         dxq $$4 = djr.a(this.dU(), $$3);
         if (this.dU().a_($$3).l() && $$4.a((dhc)this.dU(), $$3)) {
            this.dU().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            ji $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = djr.a(this.dU(), $$6);
            if (this.dU().a_($$6).l() && $$4.a((dhc)this.dU(), $$6)) {
               this.dU().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void a(dgz $$0, ji $$1) {
      dxq $$2 = $$0.a_($$1);
      ji $$3;
      dxq $$4;
      if ($$2.a(dkg.sU)) {
         $$3 = $$1.a($$2.c(dox.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dtp) {
         $$0.b($$3, dtp.c($$0.a_($$3)));
         ji.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dgz $$0, ji $$1, ji.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ji> $$5 = b($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ji> b(dgz $$0, ji $$1) {
      for (ji $$2 : ji.a($$0.A, 10, $$1, 1)) {
         dxq $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dtp) {
            dtp.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akb.a $$0) {
   }

   @Override
   protected void a(tq $$0) {
   }

   @Override
   protected void b(tq $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bva> j() {
      return this.i.stream().filter(bva::bJ);
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
