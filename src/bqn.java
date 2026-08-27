import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bqn extends bpv {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private apt i;
   private final Set<bpv> j = Sets.newHashSet();
   private int k;

   public bqn(bqb<? extends bqn> $$0, cyx $$1) {
      super($$0, $$1);
      this.at = true;
      this.f = 2;
      this.b = this.ag.g();
      this.g = this.ag.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public aun db() {
      return aun.d;
   }

   @Nullable
   public apt p() {
      return this.i;
   }

   public void b(@Nullable apt $$0) {
      this.i = $$0;
   }

   private void v() {
      ib $$0 = this.w();
      doz $$1 = this.dM().a_($$0);
      if ($$1.a(dca.ss)) {
         ((dgm)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().x_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.nH, aun.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.nG, aun.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bnx $$0 = this.dM().ak();
            if ($$0 == bnx.c || $$0 == bnx.d) {
               this.b(4);
            }

            this.v();
            b(this.dM(), this.w());
            this.a(dts.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof aps) {
               List<bpv> $$1 = this.dM()
                  .a(
                     this,
                     new erv(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bA() && !this.j.contains($$0)
                  );

               for (apt $$2 : ((aps)this.dM()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dM() instanceof aps)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<bpv> $$3 = this.dM()
               .a(this, new erv(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), bpv::bA);

            for (bpv $$4 : $$3) {
               $$4.a((aps)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private ib w() {
      esa $$0 = this.dk();
      return ib.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().aa().b(cyt.b)) {
         ib $$1 = this.dm();
         doz $$2 = dbl.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((cza)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ib $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = dbl.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((cza)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cyx $$0, ib $$1) {
      doz $$2 = $$0.a_($$1);
      ib $$3;
      doz $$4;
      if ($$2.a(dca.ss)) {
         $$3 = $$1.a($$2.c(dgm.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dlc) {
         $$0.b($$3, dlc.c($$0.a_($$3)));
         ib.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cyx $$0, ib $$1, ib.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ib> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ib> c(cyx $$0, ib $$1) {
      for (ib $$2 : ib.a($$0.z, 10, $$1, 1)) {
         doz $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dlc) {
            dlc.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(ajc.a $$0) {
   }

   @Override
   protected void a(tm $$0) {
   }

   @Override
   protected void b(tm $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<bpv> u() {
      return this.j.stream().filter(bpv::bA);
   }
}
