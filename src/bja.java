import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bja extends bil {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private ako i;
   private final Set<bil> j = Sets.newHashSet();
   private int k;

   public bja(bip<? extends bja> $$0, cpq $$1) {
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
   public apa da() {
      return apa.d;
   }

   @Nullable
   public ako j() {
      return this.i;
   }

   public void b(@Nullable ako $$0) {
      this.i = $$0;
   }

   private void p() {
      gw $$0 = this.q();
      dfe $$1 = this.dK().a_($$0);
      if ($$1.a(csr.rr)) {
         ((cxc)$$1.b()).d($$1, this.dK(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dK().r_()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.mu, apa.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dK().a(this.dp(), this.dr(), this.dv(), aoz.mt, apa.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bgq $$0 = this.dK().ai();
            if ($$0 == bgq.c || $$0 == bgq.d) {
               this.b(4);
            }

            this.p();
            b(this.dK(), this.q());
            this.a(djo.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dK() instanceof akn) {
               List<bil> $$1 = this.dK()
                  .a(
                     this,
                     new ehd(this.dp() - 15.0, this.dr() - 15.0, this.dv() - 15.0, this.dp() + 15.0, this.dr() + 6.0 + 15.0, this.dv() + 15.0),
                     $$0 -> $$0.bv() && !this.j.contains($$0)
                  );

               for (ako $$2 : ((akn)this.dK()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
               }
            }

            this.ak();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dK() instanceof akn)) {
            this.dK().c(2);
         } else if (!this.h) {
            List<bil> $$3 = this.dK()
               .a(this, new ehd(this.dp() - 3.0, this.dr() - 3.0, this.dv() - 3.0, this.dp() + 3.0, this.dr() + 6.0 + 3.0, this.dv() + 3.0), bil::bv);

            for (bil $$4 : $$3) {
               $$4.a((akn)this.dK(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private gw q() {
      ehi $$0 = this.di();
      return gw.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dK().B && this.dK().X().b(cpm.b)) {
         gw $$1 = this.dk();
         dfe $$2 = cse.a(this.dK(), $$1);
         if (this.dK().a_($$1).i() && $$2.a((cpt)this.dK(), $$1)) {
            this.dK().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            gw $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cse.a(this.dK(), $$4);
            if (this.dK().a_($$4).i() && $$2.a((cpt)this.dK(), $$4)) {
               this.dK().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cpq $$0, gw $$1) {
      dfe $$2 = $$0.a_($$1);
      gw $$3;
      dfe $$4;
      if ($$2.a(csr.rr)) {
         $$3 = $$1.a($$2.c(cxc.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dbs) {
         $$0.b($$3, dbs.c($$0.a_($$3)));
         gw.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cpq $$0, gw $$1, gw.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<gw> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<gw> c(cpq $$0, gw $$1) {
      for (gw $$2 : gw.a($$0.z, 10, $$1, 1)) {
         dfe $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dbs) {
            dbs.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qu $$0) {
   }

   @Override
   protected void b(qu $$0) {
   }

   public int m() {
      return this.k;
   }

   public Stream<bil> o() {
      return this.j.stream().filter(bil::bv);
   }
}
