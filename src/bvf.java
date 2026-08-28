import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bvf extends buk {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private ard h;
   private final Set<buk> i = Sets.newHashSet();
   private int j;

   public bvf(bur<? extends bvf> $$0, dgi $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awb dn() {
      return awb.d;
   }

   @Nullable
   public ard l() {
      return this.h;
   }

   public void b(@Nullable ard $$0) {
      this.h = $$0;
   }

   private void s() {
      ji $$0 = this.t();
      dwx $$1 = this.dW().a_($$0);
      if ($$1.a(djo.sU)) {
         ((dod)$$1.b()).e($$1, this.dW(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dW().B_()) {
            this.dW().a(this.dB(), this.dD(), this.dH(), awa.ou, awb.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dW().a(this.dB(), this.dD(), this.dH(), awa.ot, awb.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bsg $$0 = this.dW().am();
            if ($$0 == bsg.c || $$0 == bsg.d) {
               this.b(4);
            }

            this.s();
            a(this.dW(), this.t());
            this.a(ebt.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dW() instanceof arc) {
               List<buk> $$1 = this.dW()
                  .a(
                     this,
                     new fav(this.dB() - 15.0, this.dD() - 15.0, this.dH() - 15.0, this.dB() + 15.0, this.dD() + 6.0 + 15.0, this.dH() + 15.0),
                     $$0 -> $$0.bL() && !this.i.contains($$0)
                  );

               for (ard $$2 : ((arc)this.dW()).a($$0 -> $$0.f(this) < 256.0F)) {
                  ap.V.a($$2, this, $$1);
               }
            }

            this.at();
         } else if (this.e < -this.ae.a(10)) {
            this.f--;
            this.e = 1;
            this.a = this.ae.g();
            this.b(0);
         }
      }

      if (this.e >= 0) {
         if (!(this.dW() instanceof arc)) {
            this.dW().c(2);
         } else if (!this.g) {
            List<buk> $$3 = this.dW()
               .a(this, new fav(this.dB() - 3.0, this.dD() - 3.0, this.dH() - 3.0, this.dB() + 3.0, this.dD() + 6.0 + 3.0, this.dH() + 3.0), buk::bL);

            for (buk $$4 : $$3) {
               $$4.a((arc)this.dW(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ap.F.a(this.h, $$3);
            }
         }
      }
   }

   private ji t() {
      fba $$0 = this.du();
      return ji.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dW() instanceof arc $$1 && $$1.O().b(dge.b)) {
         ji $$3 = this.dw();
         dwx $$4 = diz.a(this.dW(), $$3);
         if (this.dW().a_($$3).l() && $$4.a((dgl)this.dW(), $$3)) {
            this.dW().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            ji $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = diz.a(this.dW(), $$6);
            if (this.dW().a_($$6).l() && $$4.a((dgl)this.dW(), $$6)) {
               this.dW().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void a(dgi $$0, ji $$1) {
      dwx $$2 = $$0.a_($$1);
      ji $$3;
      dwx $$4;
      if ($$2.a(djo.sU)) {
         $$3 = $$1.a($$2.c(dod.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dsw) {
         $$0.b($$3, dsw.c($$0.a_($$3)));
         ji.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dgi $$0, ji $$1, ji.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ji> $$5 = b($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ji> b(dgi $$0, ji $$1) {
      for (ji $$2 : ji.a($$0.A, 10, $$1, 1)) {
         dwx $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dsw) {
            dsw.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akb.a $$0) {
   }

   @Override
   protected void a(tq $$0) {
   }

   @Override
   protected void b(tq $$0) {
   }

   public int m() {
      return this.j;
   }

   public Stream<buk> p() {
      return this.i.stream().filter(buk::bL);
   }

   @Override
   public final boolean a(arc $$0, bta $$1, float $$2) {
      return false;
   }
}
