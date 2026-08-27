import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class brz extends brh {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqi i;
   private final Set<brh> j = Sets.newHashSet();
   private int k;

   public brz(brn<? extends brz> $$0, dad $$1) {
      super($$0, $$1);
      this.au = true;
      this.f = 2;
      this.b = this.ah.g();
      this.g = this.ah.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public avd dc() {
      return avd.d;
   }

   @Nullable
   public aqi p() {
      return this.i;
   }

   public void b(@Nullable aqi $$0) {
      this.i = $$0;
   }

   private void v() {
      in $$0 = this.w();
      dqh $$1 = this.dN().a_($$0);
      if ($$1.a(ddg.ss)) {
         ((dht)$$1.b()).d($$1, this.dN(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dN().x_()) {
            this.dN().a(this.ds(), this.du(), this.dy(), avc.nM, avd.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dN().a(this.ds(), this.du(), this.dy(), avc.nL, avd.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bpj $$0 = this.dN().ak();
            if ($$0 == bpj.c || $$0 == bpj.d) {
               this.b(4);
            }

            this.v();
            b(this.dN(), this.w());
            this.a(dva.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dN() instanceof aqh) {
               List<brh> $$1 = this.dN()
                  .a(
                     this,
                     new etk(this.ds() - 15.0, this.du() - 15.0, this.dy() - 15.0, this.ds() + 15.0, this.du() + 6.0 + 15.0, this.dy() + 15.0),
                     $$0 -> $$0.bB() && !this.j.contains($$0)
                  );

               for (aqi $$2 : ((aqh)this.dN()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dN() instanceof aqh)) {
            this.dN().c(2);
         } else if (!this.h) {
            List<brh> $$3 = this.dN()
               .a(this, new etk(this.ds() - 3.0, this.du() - 3.0, this.dy() - 3.0, this.ds() + 3.0, this.du() + 6.0 + 3.0, this.dy() + 3.0), brh::bB);

            for (brh $$4 : $$3) {
               $$4.a((aqh)this.dN(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private in w() {
      etp $$0 = this.dl();
      return in.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dN().B && this.dN().aa().b(czz.b)) {
         in $$1 = this.dn();
         dqh $$2 = dcr.a(this.dN(), $$1);
         if (this.dN().a_($$1).i() && $$2.a((dag)this.dN(), $$1)) {
            this.dN().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            in $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = dcr.a(this.dN(), $$4);
            if (this.dN().a_($$4).i() && $$2.a((dag)this.dN(), $$4)) {
               this.dN().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dad $$0, in $$1) {
      dqh $$2 = $$0.a_($$1);
      in $$3;
      dqh $$4;
      if ($$2.a(ddg.ss)) {
         $$3 = $$1.a($$2.c(dht.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dmj) {
         $$0.b($$3, dmj.c($$0.a_($$3)));
         in.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dad $$0, in $$1, in.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<in> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<in> c(dad $$0, in $$1) {
      for (in $$2 : in.a($$0.z, 10, $$1, 1)) {
         dqh $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dmj) {
            dmj.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cB();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ajq.a $$0) {
   }

   @Override
   protected void a(ua $$0) {
   }

   @Override
   protected void b(ua $$0) {
   }

   public int r() {
      return this.k;
   }

   public Stream<brh> u() {
      return this.j.stream().filter(brh::bB);
   }
}
