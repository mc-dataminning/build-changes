import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class btm extends bsr {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aqv i;
   private final Set<bsr> j = Sets.newHashSet();
   private int k;

   public btm(bsx<? extends btm> $$0, dcw $$1) {
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
   public avq df() {
      return avq.d;
   }

   @Nullable
   public aqv p() {
      return this.i;
   }

   public void b(@Nullable aqv $$0) {
      this.i = $$0;
   }

   private void v() {
      jd $$0 = this.w();
      dtc $$1 = this.dP().a_($$0);
      if ($$1.a(dga.ss)) {
         ((dkn)$$1.b()).d($$1, this.dP(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dP().x_()) {
            this.dP().a(this.du(), this.dw(), this.dA(), avp.nW, avq.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dP().a(this.du(), this.dw(), this.dA(), avp.nV, avq.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bqo $$0 = this.dP().al();
            if ($$0 == bqo.c || $$0 == bqo.d) {
               this.b(4);
            }

            this.v();
            b(this.dP(), this.w());
            this.a(dxz.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dP() instanceof aqu) {
               List<bsr> $$1 = this.dP()
                  .a(
                     this,
                     new ewv(this.du() - 15.0, this.dw() - 15.0, this.dA() - 15.0, this.du() + 15.0, this.dw() + 6.0 + 15.0, this.dA() + 15.0),
                     $$0 -> $$0.bE() && !this.j.contains($$0)
                  );

               for (aqv $$2 : ((aqu)this.dP()).a($$0 -> $$0.f(this) < 256.0F)) {
                  an.V.a($$2, this, $$1);
               }
            }

            this.aq();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dP() instanceof aqu)) {
            this.dP().c(2);
         } else if (!this.h) {
            List<bsr> $$3 = this.dP()
               .a(this, new ewv(this.du() - 3.0, this.dw() - 3.0, this.dA() - 3.0, this.du() + 3.0, this.dw() + 6.0 + 3.0, this.dA() + 3.0), bsr::bE);

            for (bsr $$4 : $$3) {
               $$4.a((aqu)this.dP(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               an.F.a(this.i, $$3);
            }
         }
      }
   }

   private jd w() {
      exa $$0 = this.dn();
      return jd.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dP().B && this.dP().ab().b(dcs.b)) {
         jd $$1 = this.dp();
         dtc $$2 = dfl.a(this.dP(), $$1);
         if (this.dP().a_($$1).i() && $$2.a((dcz)this.dP(), $$1)) {
            this.dP().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            jd $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = dfl.a(this.dP(), $$4);
            if (this.dP().a_($$4).i() && $$2.a((dcz)this.dP(), $$4)) {
               this.dP().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dcw $$0, jd $$1) {
      dtc $$2 = $$0.a_($$1);
      jd $$3;
      dtc $$4;
      if ($$2.a(dga.ss)) {
         $$3 = $$1.a($$2.c(dkn.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dpe) {
         $$0.b($$3, dpe.c($$0.a_($$3)));
         jd.a $$7 = $$1.k();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dcw $$0, jd $$1, jd.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jd> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jd> c(dcw $$0, jd $$1) {
      for (jd $$2 : jd.a($$0.z, 10, $$1, 1)) {
         dtc $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dpe) {
            dpe.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cE();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   protected void a(ub $$0) {
   }

   @Override
   protected void b(ub $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bsr> t() {
      return this.j.stream().filter(bsr::bE);
   }
}
