import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bxd extends bwf {
   private static final int b = 2;
   private static final double c = 3.0;
   private static final double d = 15.0;
   private int e;
   public long a;
   private int f;
   private boolean g;
   @Nullable
   private arr h;
   private final Set<bwf> i = Sets.newHashSet();
   private int j;

   public bxd(bwo<? extends bxd> $$0, dja $$1) {
      super($$0, $$1);
      this.e = 2;
      this.a = this.ae.g();
      this.f = this.ae.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.g = $$0;
   }

   @Override
   public awo dm() {
      return awo.d;
   }

   @Nullable
   public arr f() {
      return this.h;
   }

   public void b(@Nullable arr $$0) {
      this.h = $$0;
   }

   private void m() {
      iu $$0 = this.n();
      eah $$1 = this.dV().a_($$0);
      if ($$1.a(dmh.ta)) {
         ((dra)$$1.b()).d($$1, this.dV(), $$0);
      }
   }

   @Override
   public void h() {
      super.h();
      if (this.e == 2) {
         if (this.dV().w_()) {
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.oI, awo.d, 10000.0F, 0.8F + this.ae.i() * 0.2F, false);
            this.dV().a(this.dA(), this.dC(), this.dG(), awn.oH, awo.d, 2.0F, 0.5F + this.ae.i() * 0.2F, false);
         } else {
            bua $$0 = this.dV().an();
            if ($$0 == bua.c || $$0 == bua.d) {
               this.b(4);
            }

            this.m();
            b(this.dV(), this.n());
            this.a(efh.G);
         }
      }

      this.e--;
      if (this.e < 0) {
         if (this.f == 0) {
            if (this.dV() instanceof arq) {
               List<bwf> $$1 = this.dV()
                  .a(
                     this,
                     new fel(this.dA() - 15.0, this.dC() - 15.0, this.dG() - 15.0, this.dA() + 15.0, this.dC() + 6.0 + 15.0, this.dG() + 15.0),
                     $$0 -> $$0.bK() && !this.i.contains($$0)
                  );

               for (arr $$2 : ((arq)this.dV()).a($$0 -> $$0.f(this) < 256.0F)) {
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
         if (!(this.dV() instanceof arq)) {
            this.dV().c(2);
         } else if (!this.g) {
            List<bwf> $$3 = this.dV()
               .a(this, new fel(this.dA() - 3.0, this.dC() - 3.0, this.dG() - 3.0, this.dA() + 3.0, this.dC() + 6.0 + 3.0, this.dG() + 3.0), bwf::bK);

            for (bwf $$4 : $$3) {
               $$4.a((arq)this.dV(), this);
            }

            this.i.addAll($$3);
            if (this.h != null) {
               ap.F.a(this.h, $$3);
            }
         }
      }
   }

   private iu n() {
      feq $$0 = this.dt();
      return iu.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.g && this.dV() instanceof arq $$1 && $$1.O().c(diw.b)) {
         iu $$3 = this.dv();
         eah $$4 = dls.a(this.dV(), $$3);
         if (this.dV().a_($$3).l() && $$4.a((djd)this.dV(), $$3)) {
            this.dV().b($$3, $$4);
            this.j++;
         }

         for (int $$5 = 0; $$5 < $$0; $$5++) {
            iu $$6 = $$3.b(this.ae.a(3) - 1, this.ae.a(3) - 1, this.ae.a(3) - 1);
            $$4 = dls.a(this.dV(), $$6);
            if (this.dV().a_($$6).l() && $$4.a((djd)this.dV(), $$6)) {
               this.dV().b($$6, $$4);
               this.j++;
            }
         }
      }
   }

   private static void b(dja $$0, iu $$1) {
      eah $$2 = $$0.a_($$1);
      iu $$3;
      eah $$4;
      if ($$2.a(dmh.ta)) {
         $$3 = $$1.a($$2.c(dra.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dwb) {
         $$0.b($$3, dwb.c($$0.a_($$3)));
         iu.a $$7 = $$1.k();
         int $$8 = $$0.A.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.A.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(dja $$0, iu $$1, iu.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<iu> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<iu> c(dja $$0, iu $$1) {
      for (iu $$2 : iu.a($$0.A, 10, $$1, 1)) {
         eah $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dwb) {
            dwb.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(akn.a $$0) {
   }

   @Override
   protected void a(tz $$0) {
   }

   @Override
   protected void b(tz $$0) {
   }

   public int g() {
      return this.j;
   }

   public Stream<bwf> j() {
      return this.i.stream().filter(bwf::bK);
   }

   @Override
   public final boolean a(arq $$0, buu $$1, float $$2) {
      return false;
   }
}
