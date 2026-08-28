import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bye extends bxe {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private asc h;
   private final Set<bxe> i = Sets.newHashSet();
   private int j;

   public bye(bxn<? extends bye> $$0, dkj $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awz dm() {
      return awz.d;
   }

   @Nullable
   public asc f() {
      return this.h;
   }

   public void b(@Nullable asc $$0) {
      this.h = $$0;
   }

   private void m() {
      iw $$0 = this.n();
      ebq $$1 = this.dV().a_($$0);
      if ($$1.a(dnq.ta)) {
         ((dsj)$$1.b()).d($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().A_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.oI, awz.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awy.oH, awz.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            buz $$0 = this.dV().an();
            if ($$0 == buz.c || $$0 == buz.d) {
               this.b(4);
            }

            this.m();
            b(this.dV(), this.n());
            this.a(egq.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof asb) {
               List<bxe> $$1 = this.dV()
                  .a(
                     this,
                     new ffx(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bJ() && !this.i.contains($$0)
                  );

               for (asc $$2 : ((asb)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof asb)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bxe> $$3 = this.dV()
               .a(this, new ffx(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bxe::bJ);

            for (bxe $$4 : $$3) {
               $$4.a((asb)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               aq.F.a(this.h, $$3);
            }
         }
      }
   }

   private iw n() {
      fgc $$0 = this.dt();
      return iw.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof asb $$1 && $$1.O().c(dkf.b)) {
         iw $$3 = this.dv();
         ebq $$4 = dnb.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dkm)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iw $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dnb.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dkm)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(dkj $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      iw $$3;
      ebq $$4;
      if ($$2.a(dnq.ta)) {
         $$3 = $$1.a($$2.c(dsj.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dxk) {
         $$0.b($$3, dxk.c($$0.a_($$3)));
         iw.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dkj $$0, iw $$1, iw.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iw> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iw> c(dkj $$0, iw $$1) {
      for (iw $$2 : iw.a($$0.A, 10, $$1, 1)) {
         ebq $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dxk) {
            dxk.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(aky.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
   }

   @Override
   protected void b(ua $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bxe> j() {
      return this.i.stream().filter(bxe::bJ);
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }
}
