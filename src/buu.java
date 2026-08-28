import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class buu extends btz {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private arn i;
   private final Set<btz> j = Sets.newHashSet();
   private int k;

   public buu(bug<? extends buu> $$0, dev $$1) {
      super($$0, $$1);
      this.f = 2;
      this.b = this.af.g();
      this.g = this.af.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public awl dn() {
      return awl.d;
   }

   @Nullable
   public arn m() {
      return this.i;
   }

   public void b(@Nullable arn $$0) {
      this.i = $$0;
   }

   private void t() {
      jg $$0 = this.v();
      dvd $$1 = this.dX().a_($$0);
      if ($$1.a(dia.ss)) {
         ((dmm)$$1.b()).e($$1, this.dX(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dX().y_()) {
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.nV, awl.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dX().a(this.dC(), this.dE(), this.dI(), awk.nU, awl.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            brv $$0 = this.dX().am();
            if ($$0 == brv.c || $$0 == brv.d) {
               this.b(4);
            }

            this.t();
            b(this.dX(), this.v());
            this.a(eaa.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dX() instanceof arm) {
               List<btz> $$1 = this.dX()
                  .a(
                     this,
                     new ezc(this.dC() - 15.0, this.dE() - 15.0, this.dI() - 15.0, this.dC() + 15.0, this.dE() + 6.0 + 15.0, this.dI() + 15.0),
                     $$0 -> $$0.bM() && !this.j.contains($$0)
                  );

               for (arn $$2 : ((arm)this.dX()).a($$0 -> $$0.f(this) < 256.0F)) {
                  an.V.a($$2, this, $$1);
               }
            }

            this.au();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dX() instanceof arm)) {
            this.dX().c(2);
         } else if (!this.h) {
            List<btz> $$3 = this.dX()
               .a(this, new ezc(this.dC() - 3.0, this.dE() - 3.0, this.dI() - 3.0, this.dC() + 3.0, this.dE() + 6.0 + 3.0, this.dI() + 3.0), btz::bM);

            for (btz $$4 : $$3) {
               $$4.a((arm)this.dX(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               an.F.a(this.i, $$3);
            }
         }
      }
   }

   private jg v() {
      ezh $$0 = this.dv();
      return jg.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.h && !this.dX().C && this.dX().ac().b(der.b)) {
         jg $$1 = this.dx();
         dvd $$2 = dhl.a(this.dX(), $$1);
         if (this.dX().a_($$1).l() && $$2.a((dey)this.dX(), $$1)) {
            this.dX().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            jg $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = dhl.a(this.dX(), $$4);
            if (this.dX().a_($$4).l() && $$2.a((dey)this.dX(), $$4)) {
               this.dX().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dev $$0, jg $$1) {
      dvd $$2 = $$0.a_($$1);
      jg $$3;
      dvd $$4;
      if ($$2.a(dia.ss)) {
         $$3 = $$1.a($$2.c(dmm.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof drd) {
         $$0.b($$3, drd.c($$0.a_($$3)));
         jg.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dev $$0, jg $$1, jg.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jg> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jg> c(dev $$0, jg $$1) {
      for (jg $$2 : jg.a($$0.A, 10, $$1, 1)) {
         dvd $$3 = $$0.a_($$2);
         if ($$3.b() instanceof drd) {
            drd.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cL();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(uj $$0) {
   }

   @Override
   protected void b(uj $$0) {
   }

   public int o() {
      return this.k;
   }

   public Stream<btz> q() {
      return this.j.stream().filter(btz::bM);
   }
}
