import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxv extends bwv {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private arv h;
   private final Set<bwv> i = Sets.newHashSet();
   private int j;

   public bxv(bxe<? extends bxv> $$0, djz $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public aws dm() {
      return aws.d;
   }

   @Nullable
   public arv f() {
      return this.h;
   }

   public void b(@Nullable arv $$0) {
      this.h = $$0;
   }

   private void m() {
      iw $$0 = this.n();
      ebg $$1 = this.dV().a_($$0);
      if ($$1.a(dng.ta)) {
         ((drz)$$1.b()).d($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().A_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awr.oI, aws.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awr.oH, aws.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            buq $$0 = this.dV().an();
            if ($$0 == buq.c || $$0 == buq.d) {
               this.b(4);
            }

            this.m();
            b(this.dV(), this.n());
            this.a(egg.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof aru) {
               List<bwv> $$1 = this.dV()
                  .a(
                     this,
                     new ffn(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bJ() && !this.i.contains($$0)
                  );

               for (arv $$2 : ((aru)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof aru)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bwv> $$3 = this.dV()
               .a(this, new ffn(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bwv::bJ);

            for (bwv $$4 : $$3) {
               $$4.a((aru)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               aq.F.a(this.h, $$3);
            }
         }
      }
   }

   private iw n() {
      ffs $$0 = this.dt();
      return iw.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof aru $$1 && $$1.O().c(djv.b)) {
         iw $$3 = this.dv();
         ebg $$4 = dmr.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dkc)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iw $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dmr.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dkc)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(djz $$0, iw $$1) {
      ebg $$2 = $$0.a_($$1);
      iw $$3;
      ebg $$4;
      if ($$2.a(dng.ta)) {
         $$3 = $$1.a($$2.c(drz.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dxa) {
         $$0.b($$3, dxa.c($$0.a_($$3)));
         iw.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(djz $$0, iw $$1, iw.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iw> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iw> c(djz $$0, iw $$1) {
      for (iw $$2 : iw.a($$0.A, 10, $$1, 1)) {
         ebg $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dxa) {
            dxa.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akr.a $$0) {
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

   public Stream<bwv> j() {
      return this.i.stream().filter(bwv::bJ);
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return false;
   }
}
