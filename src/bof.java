import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bof extends bno {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aow i;
   private final Set<bno> j = Sets.newHashSet();
   private int k;

   public bof(bnu<? extends bof> $$0, cvn $$1) {
      super($$0, $$1);
      this.as = true;
      this.f = 2;
      this.b = this.af.g();
      this.g = this.af.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public atl db() {
      return atl.d;
   }

   @Nullable
   public aow q() {
      return this.i;
   }

   public void b(@Nullable aow $$0) {
      this.i = $$0;
   }

   private void w() {
      hz $$0 = this.x();
      dlf $$1 = this.dM().a_($$0);
      if ($$1.a(cyq.ss)) {
         ((ddc)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().y_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.nx, atl.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), atk.nw, atl.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            blr $$0 = this.dM().ak();
            if ($$0 == blr.c || $$0 == blr.d) {
               this.b(4);
            }

            this.w();
            b(this.dM(), this.x());
            this.b(dpp.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof aov) {
               List<bno> $$1 = this.dM()
                  .a(
                     this,
                     new enn(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (aow $$2 : ((aov)this.dM()).a($$0 -> $$0.e(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dM() instanceof aov)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<bno> $$3 = this.dM()
               .a(this, new enn(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), bno::bx);

            for (bno $$4 : $$3) {
               $$4.a((aov)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private hz x() {
      ens $$0 = this.dk();
      return hz.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().Z().b(cvj.b)) {
         hz $$1 = this.dm();
         dlf $$2 = cyb.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((cvq)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            hz $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = cyb.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((cvq)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cvn $$0, hz $$1) {
      dlf $$2 = $$0.a_($$1);
      hz $$3;
      dlf $$4;
      if ($$2.a(cyq.ss)) {
         $$3 = $$1.a($$2.c(ddc.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dhr) {
         $$0.b($$3, dhr.c($$0.a_($$3)));
         hz.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cvn $$0, hz $$1, hz.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<hz> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<hz> c(cvn $$0, hz $$1) {
      for (hz $$2 : hz.a($$0.z, 10, $$1, 1)) {
         dlf $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dhr) {
            dhr.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cA();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sw $$0) {
   }

   @Override
   protected void b(sw $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bno> u() {
      return this.j.stream().filter(bno::bx);
   }
}
