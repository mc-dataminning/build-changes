import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bow extends bof {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private apb i;
   private final Set<bof> j = Sets.newHashSet();
   private int k;

   public bow(bol<? extends bow> $$0, cwe $$1) {
      super($$0, $$1);
      this.as = true;
      this.f = 2;
      this.b = this.af.g();
      this.g = this.af.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public atq cY() {
      return atq.d;
   }

   @Nullable
   public apb q() {
      return this.i;
   }

   public void b(@Nullable apb $$0) {
      this.i = $$0;
   }

   private void w() {
      ib $$0 = this.x();
      dme $$1 = this.dJ().a_($$0);
      if ($$1.a(czh.ss)) {
         ((ddt)$$1.b()).d($$1, this.dJ(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dJ().y_()) {
            this.dJ().a(this.do(), this.dq(), this.du(), atp.ny, atq.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dJ().a(this.do(), this.dq(), this.du(), atp.nx, atq.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            bmi $$0 = this.dJ().aj();
            if ($$0 == bmi.c || $$0 == bmi.d) {
               this.b(4);
            }

            this.w();
            b(this.dJ(), this.x());
            this.b(dqr.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dJ() instanceof apa) {
               List<bof> $$1 = this.dJ()
                  .a(
                     this,
                     new eoq(this.do() - 15.0, this.dq() - 15.0, this.du() - 15.0, this.do() + 15.0, this.dq() + 6.0 + 15.0, this.du() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (apb $$2 : ((apa)this.dJ()).a($$0 -> $$0.e(this) < 256.0F)) {
                  am.V.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dJ() instanceof apa)) {
            this.dJ().c(2);
         } else if (!this.h) {
            List<bof> $$3 = this.dJ()
               .a(this, new eoq(this.do() - 3.0, this.dq() - 3.0, this.du() - 3.0, this.do() + 3.0, this.dq() + 6.0 + 3.0, this.du() + 3.0), bof::bx);

            for (bof $$4 : $$3) {
               $$4.a((apa)this.dJ(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private ib x() {
      eov $$0 = this.dh();
      return ib.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dJ().B && this.dJ().Z().b(cwa.b)) {
         ib $$1 = this.dj();
         dme $$2 = cys.a(this.dJ(), $$1);
         if (this.dJ().a_($$1).i() && $$2.a((cwh)this.dJ(), $$1)) {
            this.dJ().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            ib $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = cys.a(this.dJ(), $$4);
            if (this.dJ().a_($$4).i() && $$2.a((cwh)this.dJ(), $$4)) {
               this.dJ().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cwe $$0, ib $$1) {
      dme $$2 = $$0.a_($$1);
      ib $$3;
      dme $$4;
      if ($$2.a(czh.ss)) {
         $$3 = $$1.a($$2.c(ddt.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dij) {
         $$0.b($$3, dij.c($$0.a_($$3)));
         ib.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cwe $$0, ib $$1, ib.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<ib> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<ib> c(cwe $$0, ib $$1) {
      for (ib $$2 : ib.a($$0.z, 10, $$1, 1)) {
         dme $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dij) {
            dij.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cx();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void c_() {
   }

   @Override
   protected void a(sy $$0) {
   }

   @Override
   protected void b(sy $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bof> u() {
      return this.j.stream().filter(bof::bx);
   }
}
