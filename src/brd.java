import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class brd extends bql {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqf i;
   private final Set<bql> j = Sets.newHashSet();
   private int k;

   public brd(bqr<? extends brd> $$0, czu $$1) {
      super($$0, $$1);
      this.au = true;
      this.f = 2;
      this.b = this.ah.g();
      this.g = this.ah.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public ava dc() {
      return ava.d;
   }

   @Nullable
   public aqf p() {
      return this.i;
   }

   public void b(@Nullable aqf $$0) {
      this.i = $$0;
   }

   private void v() {
      im $$0 = this.w();
      dpy $$1 = this.dN().a_($$0);
      if ($$1.a(dcx.ss)) {
         ((dhk)$$1.b()).d($$1, this.dN(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dN().x_()) {
            this.dN().a(this.ds(), this.du(), this.dy(), auz.nM, ava.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dN().a(this.ds(), this.du(), this.dy(), auz.nL, ava.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bon $$0 = this.dN().ak();
            if ($$0 == bon.c || $$0 == bon.d) {
               this.b(4);
            }

            this.v();
            b(this.dN(), this.w());
            this.a(dur.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dN() instanceof aqe) {
               List<bql> $$1 = this.dN()
                  .a(
                     this,
                     new eta(this.ds() - 15.0, this.du() - 15.0, this.dy() - 15.0, this.ds() + 15.0, this.du() + 6.0 + 15.0, this.dy() + 15.0),
                     $$0 -> $$0.bB() && !this.j.contains($$0)
                  );

               for (aqf $$2 : ((aqe)this.dN()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dN() instanceof aqe)) {
            this.dN().c(2);
         } else if (!this.h) {
            List<bql> $$3 = this.dN()
               .a(this, new eta(this.ds() - 3.0, this.du() - 3.0, this.dy() - 3.0, this.ds() + 3.0, this.du() + 6.0 + 3.0, this.dy() + 3.0), bql::bB);

            for (bql $$4 : $$3) {
               $$4.a((aqe)this.dN(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private im w() {
      etf $$0 = this.dl();
      return im.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dN().B && this.dN().aa().b(czq.b)) {
         im $$1 = this.dn();
         dpy $$2 = dci.a(this.dN(), $$1);
         if (this.dN().a_($$1).i() && $$2.a((czx)this.dN(), $$1)) {
            this.dN().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            im $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = dci.a(this.dN(), $$4);
            if (this.dN().a_($$4).i() && $$2.a((czx)this.dN(), $$4)) {
               this.dN().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(czu $$0, im $$1) {
      dpy $$2 = $$0.a_($$1);
      im $$3;
      dpy $$4;
      if ($$2.a(dcx.ss)) {
         $$3 = $$1.a($$2.c(dhk.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dma) {
         $$0.b($$3, dma.c($$0.a_($$3)));
         im.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(czu $$0, im $$1, im.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<im> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<im> c(czu $$0, im $$1) {
      for (im $$2 : im.a($$0.z, 10, $$1, 1)) {
         dpy $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dma) {
            dma.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cB();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   protected void a(ty $$0) {
   }

   @Override
   protected void b(ty $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<bql> u() {
      return this.j.stream().filter(bql::bB);
   }
}
