import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bpo extends box {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private apg i;
   private final Set<box> j = Sets.newHashSet();
   private int k;

   public bpo(bpd<? extends bpo> $$0, cxb $$1) {
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
   public atz db() {
      return atz.d;
   }

   @Nullable
   public apg p() {
      return this.i;
   }

   public void b(@Nullable apg $$0) {
      this.i = $$0;
   }

   private void v() {
      ib $$0 = this.w();
      dnb $$1 = this.dM().a_($$0);
      if ($$1.a(dae.ss)) {
         ((deq)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().x_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.nF, atz.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), aty.nE, atz.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bna $$0 = this.dM().aj();
            if ($$0 == bna.c || $$0 == bna.d) {
               this.b(4);
            }

            this.v();
            b(this.dM(), this.w());
            this.b(drp.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof apf) {
               List<box> $$1 = this.dM()
                  .a(
                     this,
                     new epo(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bA() && !this.j.contains($$0)
                  );

               for (apg $$2 : ((apf)this.dM()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dM() instanceof apf)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<box> $$3 = this.dM()
               .a(this, new epo(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), box::bA);

            for (box $$4 : $$3) {
               $$4.a((apf)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private ib w() {
      ept $$0 = this.dk();
      return ib.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().Z().b(cwx.b)) {
         ib $$1 = this.dm();
         dnb $$2 = czp.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((cxe)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ib $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = czp.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((cxe)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cxb $$0, ib $$1) {
      dnb $$2 = $$0.a_($$1);
      ib $$3;
      dnb $$4;
      if ($$2.a(dae.ss)) {
         $$3 = $$1.a($$2.c(deq.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof djg) {
         $$0.b($$3, djg.c($$0.a_($$3)));
         ib.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cxb $$0, ib $$1, ib.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ib> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ib> c(cxb $$0, ib $$1) {
      for (ib $$2 : ib.a($$0.z, 10, $$1, 1)) {
         dnb $$3 = $$0.a_($$2);
         if ($$3.b() instanceof djg) {
            djg.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(aiq.a $$0) {
   }

   @Override
   protected void a(ta $$0) {
   }

   @Override
   protected void b(ta $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<box> s() {
      return this.j.stream().filter(box::bA);
   }
}
