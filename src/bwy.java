import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bwy extends bwa {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private arp h;
   private final Set<bwa> i = Sets.newHashSet();
   private int j;

   public bwy(bwj<? extends bwy> $$0, dip $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awm dm() {
      return awm.d;
   }

   @Nullable
   public arp f() {
      return this.h;
   }

   public void b(@Nullable arp $$0) {
      this.h = $$0;
   }

   private void m() {
      iu $$0 = this.n();
      dzo $$1 = this.dV().a_($$0);
      if ($$1.a(dlw.sW)) {
         ((dqn)$$1.b()).d($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().w_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awl.oE, awm.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awl.oD, awm.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            btv $$0 = this.dV().an();
            if ($$0 == btv.c || $$0 == btv.d) {
               this.b(4);
            }

            this.m();
            b(this.dV(), this.n());
            this.a(eeo.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof aro) {
               List<bwa> $$1 = this.dV()
                  .a(
                     this,
                     new fdr(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bK() && !this.i.contains($$0)
                  );

               for (arp $$2 : ((aro)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof aro)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bwa> $$3 = this.dV()
               .a(this, new fdr(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bwa::bK);

            for (bwa $$4 : $$3) {
               $$4.a((aro)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ap.F.a(this.h, $$3);
            }
         }
      }
   }

   private iu n() {
      fdw $$0 = this.dt();
      return iu.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof aro $$1 && $$1.O().c(dil.b)) {
         iu $$3 = this.dv();
         dzo $$4 = dlh.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((dis)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iu $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dlh.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((dis)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(dip $$0, iu $$1) {
      dzo $$2 = $$0.a_($$1);
      iu $$3;
      dzo $$4;
      if ($$2.a(dlw.sW)) {
         $$3 = $$1.a($$2.c(dqn.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dvj) {
         $$0.b($$3, dvj.c($$0.a_($$3)));
         iu.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dip $$0, iu $$1, iu.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iu> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iu> c(dip $$0, iu $$1) {
      for (iu $$2 : iu.a($$0.A, 10, $$1, 1)) {
         dzo $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dvj) {
            dvj.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akl.a $$0) {
   }

   @Override
   protected void a(tx $$0) {
   }

   @Override
   protected void b(tx $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bwa> j() {
      return this.i.stream().filter(bwa::bK);
   }

   @Override
   public final boolean a(aro $$0, bup $$1, float $$2) {
      return false;
   }
}
