import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class blf extends bkq {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private amf i;
   private final Set<bkq> j = Sets.newHashSet();
   private int k;

   public blf(bku<? extends blf> $$0, csa $$1) {
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
   public aqs dc() {
      return aqs.d;
   }

   @Nullable
   public amf q() {
      return this.i;
   }

   public void b(@Nullable amf $$0) {
      this.i = $$0;
   }

   private void w() {
      ht $$0 = this.x();
      dhi $$1 = this.dN().a_($$0);
      if ($$1.a(cvc.ss)) {
         ((czo)$$1.b()).d($$1, this.dN(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dN().x_()) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.mO, aqs.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dN().a(this.ds(), this.du(), this.dy(), aqr.mN, aqs.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            biu $$0 = this.dN().aj();
            if ($$0 == biu.c || $$0 == biu.d) {
               this.b(4);
            }

            this.w();
            b(this.dN(), this.x());
            this.a(dls.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dN() instanceof ame) {
               List<bkq> $$1 = this.dN()
                  .a(
                     this,
                     new ejp(this.ds() - 15.0, this.du() - 15.0, this.dy() - 15.0, this.ds() + 15.0, this.du() + 6.0 + 15.0, this.dy() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (amf $$2 : ((ame)this.dN()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
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
         if (!(this.dN() instanceof ame)) {
            this.dN().c(2);
         } else if (!this.h) {
            List<bkq> $$3 = this.dN()
               .a(this, new ejp(this.ds() - 3.0, this.du() - 3.0, this.dy() - 3.0, this.ds() + 3.0, this.du() + 6.0 + 3.0, this.dy() + 3.0), bkq::bx);

            for (bkq $$4 : $$3) {
               $$4.a((ame)this.dN(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private ht x() {
      eju $$0 = this.dl();
      return ht.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dN().B && this.dN().Y().b(crw.b)) {
         ht $$1 = this.dn();
         dhi $$2 = cun.a(this.dN(), $$1);
         if (this.dN().a_($$1).i() && $$2.a((csd)this.dN(), $$1)) {
            this.dN().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ht $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cun.a(this.dN(), $$4);
            if (this.dN().a_($$4).i() && $$2.a((csd)this.dN(), $$4)) {
               this.dN().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(csa $$0, ht $$1) {
      dhi $$2 = $$0.a_($$1);
      ht $$3;
      dhi $$4;
      if ($$2.a(cvc.ss)) {
         $$3 = $$1.a($$2.c(czo.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof deb) {
         $$0.b($$3, deb.c($$0.a_($$3)));
         ht.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(csa $$0, ht $$1, ht.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ht> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ht> c(csa $$0, ht $$1) {
      for (ht $$2 : ht.a($$0.z, 10, $$1, 1)) {
         dhi $$3 = $$0.a_($$2);
         if ($$3.b() instanceof deb) {
            deb.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void b_() {
   }

   @Override
   protected void a(rz $$0) {
   }

   @Override
   protected void b(rz $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bkq> u() {
      return this.j.stream().filter(bkq::bx);
   }
}
