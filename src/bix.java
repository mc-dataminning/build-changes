import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bix extends bii {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private akl i;
   private final Set<bii> j = Sets.newHashSet();
   private int k;

   public bix(bim<? extends bix> $$0, cpm $$1) {
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
   public aox da() {
      return aox.d;
   }

   @Nullable
   public akl j() {
      return this.i;
   }

   public void b(@Nullable akl $$0) {
      this.i = $$0;
   }

   private void p() {
      gu $$0 = this.q();
      dfa $$1 = this.dK().a_($$0);
      if ($$1.a(csn.rr)) {
         ((cwy)$$1.b()).d($$1, this.dK(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dK().r_()) {
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.mu, aox.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dK().a(this.dp(), this.dr(), this.dv(), aow.mt, aox.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bgn $$0 = this.dK().ai();
            if ($$0 == bgn.c || $$0 == bgn.d) {
               this.b(4);
            }

            this.p();
            b(this.dK(), this.q());
            this.a(djk.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dK() instanceof akk) {
               List<bii> $$1 = this.dK()
                  .a(
                     this,
                     new egz(this.dp() - 15.0, this.dr() - 15.0, this.dv() - 15.0, this.dp() + 15.0, this.dr() + 6.0 + 15.0, this.dv() + 15.0),
                     $$0 -> $$0.bv() && !this.j.contains($$0)
                  );

               for (akl $$2 : ((akk)this.dK()).a($$0 -> $$0.e(this) < 256.0F)) {
                  ai.S.a($$2, this, $$1);
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
         if (!(this.dK() instanceof akk)) {
            this.dK().c(2);
         } else if (!this.h) {
            List<bii> $$3 = this.dK()
               .a(this, new egz(this.dp() - 3.0, this.dr() - 3.0, this.dv() - 3.0, this.dp() + 3.0, this.dr() + 6.0 + 3.0, this.dv() + 3.0), bii::bv);

            for (bii $$4 : $$3) {
               $$4.a((akk)this.dK(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               ai.E.a(this.i, $$3);
            }
         }
      }
   }

   private gu q() {
      ehe $$0 = this.di();
      return gu.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dK().B && this.dK().X().b(cpi.b)) {
         gu $$1 = this.dk();
         dfa $$2 = csa.a(this.dK(), $$1);
         if (this.dK().a_($$1).i() && $$2.a((cpp)this.dK(), $$1)) {
            this.dK().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            gu $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = csa.a(this.dK(), $$4);
            if (this.dK().a_($$4).i() && $$2.a((cpp)this.dK(), $$4)) {
               this.dK().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cpm $$0, gu $$1) {
      dfa $$2 = $$0.a_($$1);
      gu $$3;
      dfa $$4;
      if ($$2.a(csn.rr)) {
         $$3 = $$1.a($$2.c(cwy.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dbo) {
         $$0.b($$3, dbo.c($$0.a_($$3)));
         gu.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cpm $$0, gu $$1, gu.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<gu> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<gu> c(cpm $$0, gu $$1) {
      for (gu $$2 : gu.a($$0.z, 10, $$1, 1)) {
         dfa $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dbo) {
            dbo.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(qr $$0) {
   }

   @Override
   protected void b(qr $$0) {
   }

   public int m() {
      return this.k;
   }

   public Stream<bii> o() {
      return this.j.stream().filter(bii::bv);
   }
}
