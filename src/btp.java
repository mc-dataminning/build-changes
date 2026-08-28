import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class btp extends bsv {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private arg i;
   private final Set<bsv> j = Sets.newHashSet();
   private int k;

   public btp(btb<? extends btp> $$0, dbz $$1) {
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
   public awb de() {
      return awb.d;
   }

   @Nullable
   public arg p() {
      return this.i;
   }

   public void b(@Nullable arg $$0) {
      this.i = $$0;
   }

   private void v() {
      iz $$0 = this.w();
      dsd $$1 = this.dP().a_($$0);
      if ($$1.a(dfc.ss)) {
         ((djp)$$1.b()).d($$1, this.dP(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dP().x_()) {
            this.dP().a(this.du(), this.dw(), this.dA(), awa.nW, awb.d, 10000.0F, 0.8F + this.ah.i() * 0.2F, false);
            this.dP().a(this.du(), this.dw(), this.dA(), awa.nV, awb.d, 2.0F, 0.5F + this.ah.i() * 0.2F, false);
         } else {
            bqs $$0 = this.dP().al();
            if ($$0 == bqs.c || $$0 == bqs.d) {
               this.b(4);
            }

            this.v();
            b(this.dP(), this.w());
            this.a(dww.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dP() instanceof arf) {
               List<bsv> $$1 = this.dP()
                  .a(
                     this,
                     new evn(this.du() - 15.0, this.dw() - 15.0, this.dA() - 15.0, this.du() + 15.0, this.dw() + 6.0 + 15.0, this.dA() + 15.0),
                     $$0 -> $$0.bD() && !this.j.contains($$0)
                  );

               for (arg $$2 : ((arf)this.dP()).a($$0 -> $$0.f(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.ao();
         } else if (this.f < -this.ah.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ah.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dP() instanceof arf)) {
            this.dP().c(2);
         } else if (!this.h) {
            List<bsv> $$3 = this.dP()
               .a(this, new evn(this.du() - 3.0, this.dw() - 3.0, this.dA() - 3.0, this.du() + 3.0, this.dw() + 6.0 + 3.0, this.dA() + 3.0), bsv::bD);

            for (bsv $$4 : $$3) {
               $$4.a((arf)this.dP(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private iz w() {
      evs $$0 = this.dn();
      return iz.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dP().B && this.dP().ab().b(dbv.b)) {
         iz $$1 = this.dp();
         dsd $$2 = den.a(this.dP(), $$1);
         if (this.dP().a_($$1).i() && $$2.a((dcc)this.dP(), $$1)) {
            this.dP().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            iz $$4 = $$1.b(this.ah.a(3) - 1, this.ah.a(3) - 1, this.ah.a(3) - 1);
            $$2 = den.a(this.dP(), $$4);
            if (this.dP().a_($$4).i() && $$2.a((dcc)this.dP(), $$4)) {
               this.dP().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(dbz $$0, iz $$1) {
      dsd $$2 = $$0.a_($$1);
      iz $$3;
      dsd $$4;
      if ($$2.a(dfc.ss)) {
         $$3 = $$1.a($$2.c(djp.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dof) {
         $$0.b($$3, dof.c($$0.a_($$3)));
         iz.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dbz $$0, iz $$1, iz.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iz> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iz> c(dbz $$0, iz $$1) {
      for (iz $$2 : iz.a($$0.z, 10, $$1, 1)) {
         dsd $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dof) {
            dof.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cD();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(ako.a $$0) {
   }

   @Override
   protected void a(us $$0) {
   }

   @Override
   protected void b(us $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bsv> u() {
      return this.j.stream().filter(bsv::bD);
   }
}
