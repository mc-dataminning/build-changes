import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvd extends bui {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private arr i;
   private final Set<bui> j = Sets.newHashSet();
   private int k;

   public bvd(bup<? extends bvd> $$0, dff $$1) {
      super($$0, $$1);
      this.f = 2;
      this.b = this.af.g();
      this.g = this.af.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public awp do() {
      return awp.d;
   }

   @Nullable
   public arr m() {
      return this.i;
   }

   public void b(@Nullable arr $$0) {
      this.i = $$0;
   }

   private void t() {
      jh $$0 = this.v();
      dvo $$1 = this.dY().a_($$0);
      if ($$1.a(dil.ss)) {
         ((dmx)$$1.b()).e($$1, this.dY(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dY().y_()) {
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.nV, awp.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dY().a(this.dD(), this.dF(), this.dJ(), awo.nU, awp.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            bse $$0 = this.dY().ak();
            if ($$0 == bse.c || $$0 == bse.d) {
               this.b(4);
            }

            this.t();
            b(this.dY(), this.v());
            this.a(eak.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dY() instanceof arq) {
               List<bui> $$1 = this.dY()
                  .a(
                     this,
                     new ezm(this.dD() - 15.0, this.dF() - 15.0, this.dJ() - 15.0, this.dD() + 15.0, this.dF() + 6.0 + 15.0, this.dJ() + 15.0),
                     $$0 -> $$0.bN() && !this.j.contains($$0)
                  );

               for (arr $$2 : ((arq)this.dY()).a($$0 -> $$0.f(this) < 256.0F)) {
                  ao.V.a($$2, this, $$1);
               }
            }

            this.av();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dY() instanceof arq)) {
            this.dY().c(2);
         } else if (!this.h) {
            List<bui> $$3 = this.dY()
               .a(this, new ezm(this.dD() - 3.0, this.dF() - 3.0, this.dJ() - 3.0, this.dD() + 3.0, this.dF() + 6.0 + 3.0, this.dJ() + 3.0), bui::bN);

            for (bui $$4 : $$3) {
               $$4.a((arq)this.dY(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               ao.F.a(this.i, $$3);
            }
         }
      }
   }

   private jh v() {
      ezr $$0 = this.dw();
      return jh.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.h && !this.dY().C && this.dY().ac().b(dfb.b)) {
         jh $$1 = this.dy();
         dvo $$2 = dhw.a(this.dY(), $$1);
         if (this.dY().a_($$1).l() && $$2.a((dfi)this.dY(), $$1)) {
            this.dY().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            jh $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = dhw.a(this.dY(), $$4);
            if (this.dY().a_($$4).l() && $$2.a((dfi)this.dY(), $$4)) {
               this.dY().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dff $$0, jh $$1) {
      dvo $$2 = $$0.a_($$1);
      jh $$3;
      dvo $$4;
      if ($$2.a(dil.ss)) {
         $$3 = $$1.a($$2.c(dmx.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dro) {
         $$0.b($$3, dro.c($$0.a_($$3)));
         jh.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dff $$0, jh $$1, jh.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jh> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jh> c(dff $$0, jh $$1) {
      for (jh $$2 : jh.a($$0.A, 10, $$1, 1)) {
         dvo $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dro) {
            dro.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cM();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(aks.a $$0) {
   }

   @Override
   protected void a(un $$0) {
   }

   @Override
   protected void b(un $$0) {
   }

   public int o() {
      return this.k;
   }

   public Stream<bui> q() {
      return this.j.stream().filter(bui::bN);
   }
}
