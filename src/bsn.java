import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bsn extends brv {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqu i;
   private final Set<brv> j = Sets.newHashSet();
   private int k;

   public bsn(bsb<? extends bsn> $$0, dca $$1) {
      super($$0, $$1);
      this.ay = true;
      this.f = 2;
      this.b = this.al.g();
      this.g = this.al.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public avq dj() {
      return avq.d;
   }

   @Nullable
   public aqu p() {
      return this.i;
   }

   public void b(@Nullable aqu $$0) {
      this.i = $$0;
   }

   private void u() {
      ir $$0 = this.w();
      dtc $$1 = this.dU().a_($$0);
      if ($$1.a(dfe.tD)) {
         ((djv)$$1.b()).d($$1, this.dU(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dU().x_()) {
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.om, avq.d, 10000.0F, 0.8F + this.al.i() * 0.2F, false);
            this.dU().a(this.dz(), this.dB(), this.dF(), avo.ol, avq.d, 2.0F, 0.5F + this.al.i() * 0.2F, false);
         } else {
            bpx $$0 = this.dU().al();
            if ($$0 == bpx.c || $$0 == bpx.d) {
               this.b(4);
            }

            this.u();
            b(this.dU(), this.w());
            this.a(dxv.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dU() instanceof aqt) {
               List<brv> $$1 = this.dU()
                  .a(
                     this,
                     new ewp(this.dz() - 15.0, this.dB() - 15.0, this.dF() - 15.0, this.dz() + 15.0, this.dB() + 6.0 + 15.0, this.dF() + 15.0),
                     $$0 -> $$0.bI() && !this.j.contains($$0)
                  );

               for (aqu $$2 : ((aqt)this.dU()).a($$0 -> $$0.f(this) < 256.0F)) {
                  an.V.a($$2, this, $$1);
               }
            }

            this.ao();
         } else if (this.f < -this.al.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.al.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dU() instanceof aqt)) {
            this.dU().c(2);
         } else if (!this.h) {
            List<brv> $$3 = this.dU()
               .a(this, new ewp(this.dz() - 3.0, this.dB() - 3.0, this.dF() - 3.0, this.dz() + 3.0, this.dB() + 6.0 + 3.0, this.dF() + 3.0), brv::bI);

            for (brv $$4 : $$3) {
               $$4.a((aqt)this.dU(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               an.F.a(this.i, $$3);
            }
         }
      }
   }

   private ir w() {
      ewu $$0 = this.ds();
      return ir.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dU().C && this.dU().ab().b(dbw.b)) {
         ir $$1 = this.du();
         dtc $$2 = deo.a(this.dU(), $$1);
         if (this.dU().a_($$1).i() && $$2.a((dcd)this.dU(), $$1)) {
            this.dU().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ir $$4 = $$1.b(this.al.a(3) - 1, this.al.a(3) - 1, this.al.a(3) - 1);
            $$2 = deo.a(this.dU(), $$4);
            if (this.dU().a_($$4).i() && $$2.a((dcd)this.dU(), $$4)) {
               this.dU().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dca $$0, ir $$1) {
      dtc $$2 = $$0.a_($$1);
      ir $$3;
      dtc $$4;
      if ($$2.a(dfe.tD)) {
         $$3 = $$1.a($$2.c(djv.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof doy) {
         $$0.b($$3, doy.c($$0.a_($$3)));
         ir.a $$7 = $$1.j();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dca $$0, ir $$1, ir.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ir> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ir> c(dca $$0, ir $$1) {
      for (ir $$2 : ir.a($$0.A, 10, $$1, 1)) {
         dtc $$3 = $$0.a_($$2);
         if ($$3.b() instanceof doy) {
            doy.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cI();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akc.a $$0) {
   }

   @Override
   protected void a(uk $$0) {
   }

   @Override
   protected void b(uk $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<brv> t() {
      return this.j.stream().filter(brv::bI);
   }
}
