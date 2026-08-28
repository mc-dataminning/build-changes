import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bwq extends bvs {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private aro h;
   private final Set<bvs> i = Sets.newHashSet();
   private int j;

   public bwq(bwb<? extends bwq> $$0, dhp $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awl dm() {
      return awl.d;
   }

   @Nullable
   public aro f() {
      return this.h;
   }

   public void b(@Nullable aro $$0) {
      this.h = $$0;
   }

   private void m() {
      jj $$0 = this.n();
      dym $$1 = this.dV().a_($$0);
      if ($$1.a(dkw.sW)) {
         ((dpn)$$1.b()).e($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().w_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.oE, awl.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awk.oD, awl.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            btn $$0 = this.dV().an();
            if ($$0 == btn.c || $$0 == btn.d) {
               this.b(4);
            }

            this.m();
            a(this.dV(), this.n());
            this.a(edm.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof arn) {
               List<bvs> $$1 = this.dV()
                  .a(
                     this,
                     new fcp(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bK() && !this.i.contains($$0)
                  );

               for (aro $$2 : ((arn)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof arn)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bvs> $$3 = this.dV()
               .a(this, new fcp(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bvs::bK);

            for (bvs $$4 : $$3) {
               $$4.a((arn)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ap.F.a(this.h, $$3);
            }
         }
      }
   }

   private jj n() {
      fcu $$0 = this.dt();
      return jj.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof arn $$1 && $$1.O().c(dhl.b)) {
         jj $$3 = this.dv();
         dym $$4 = dkh.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dhs)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            jj $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dkh.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dhs)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void a(dhp $$0, jj $$1) {
      dym $$2 = $$0.a_($$1);
      jj $$3;
      dym $$4;
      if ($$2.a(dkw.sW)) {
         $$3 = $$1.a($$2.c(dpn.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof duh) {
         $$0.b($$3, duh.c($$0.a_($$3)));
         jj.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dhp $$0, jj $$1, jj.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<jj> $$5 = b($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<jj> b(dhp $$0, jj $$1) {
      for (jj $$2 : jj.a($$0.A, 10, $$1, 1)) {
         dym $$3 = $$0.a_($$2);
         if ($$3.b() instanceof duh) {
            duh.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(tw $$0) {
   }

   @Override
   protected void b(tw $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bvs> j() {
      return this.i.stream().filter(bvs::bK);
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      return false;
   }
}
