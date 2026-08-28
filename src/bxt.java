import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxt extends bwt {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private art h;
   private final Set<bwt> i = Sets.newHashSet();
   private int j;

   public bxt(bxc<? extends bxt> $$0, djx $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awq dm() {
      return awq.d;
   }

   @Nullable
   public art f() {
      return this.h;
   }

   public void b(@Nullable art $$0) {
      this.h = $$0;
   }

   private void m() {
      iv $$0 = this.n();
      ebe $$1 = this.dV().a_($$0);
      if ($$1.a(dne.ta)) {
         ((drx)$$1.b()).d($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().A_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awp.oI, awq.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awp.oH, awq.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            buo $$0 = this.dV().an();
            if ($$0 == buo.c || $$0 == buo.d) {
               this.b(4);
            }

            this.m();
            b(this.dV(), this.n());
            this.a(ege.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof ars) {
               List<bwt> $$1 = this.dV()
                  .a(
                     this,
                     new ffl(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bJ() && !this.i.contains($$0)
                  );

               for (art $$2 : ((ars)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
                  aq.V.a($$2, this, $$1);
               }
            }

            this.aq();
         } else if (this.e < -this.ae.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ae.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.dV() instanceof ars)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bwt> $$3 = this.dV()
               .a(this, new ffl(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bwt::bJ);

            for (bwt $$4 : $$3) {
               $$4.a((ars)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               aq.F.a(this.h, $$3);
            }
         }
      }
   }

   private iv n() {
      ffq $$0 = this.dt();
      return iv.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof ars $$1 && $$1.O().c(djt.b)) {
         iv $$3 = this.dv();
         ebe $$4 = dmp.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dka)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iv $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dmp.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dka)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(djx $$0, iv $$1) {
      ebe $$2 = $$0.a_($$1);
      iv $$3;
      ebe $$4;
      if ($$2.a(dne.ta)) {
         $$3 = $$1.a($$2.c(drx.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dwy) {
         $$0.b($$3, dwy.c($$0.a_($$3)));
         iv.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(djx $$0, iv $$1, iv.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iv> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iv> c(djx $$0, iv $$1) {
      for (iv $$2 : iv.a($$0.A, 10, $$1, 1)) {
         ebe $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dwy) {
            dwy.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cK();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akp.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bwt> j() {
      return this.i.stream().filter(bwt::bJ);
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }
}
