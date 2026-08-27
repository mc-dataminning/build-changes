import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bjf extends biq {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aks i;
   private final Set<biq> j = Sets.newHashSet();
   private int k;

   public bjf(biu<? extends bjf> $$0, cpv $$1) {
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
   public apf db() {
      return apf.d;
   }

   @Nullable
   public aks q() {
      return this.i;
   }

   public void b(@Nullable aks $$0) {
      this.i = $$0;
   }

   private void v() {
      gw $$0 = this.w();
      dfj $$1 = this.dL().a_($$0);
      if ($$1.a(csw.rr)) {
         ((cxh)$$1.b()).d($$1, this.dL(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dL().w_()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), ape.mu, apf.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dL().a(this.dq(), this.ds(), this.dw(), ape.mt, apf.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bgv $$0 = this.dL().ai();
            if ($$0 == bgv.c || $$0 == bgv.d) {
               this.b(4);
            }

            this.v();
            b(this.dL(), this.w());
            this.a(djt.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dL() instanceof akr) {
               List<biq> $$1 = this.dL()
                  .a(
                     this,
                     new ehi(this.dq() - 15.0, this.ds() - 15.0, this.dw() - 15.0, this.dq() + 15.0, this.ds() + 6.0 + 15.0, this.dw() + 15.0),
                     $$0 -> $$0.bw() && !this.j.contains($$0)
                  );

               for (aks $$2 : ((akr)this.dL()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
               }
            }

            this.al();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dL() instanceof akr)) {
            this.dL().c(2);
         } else if (!this.h) {
            List<biq> $$3 = this.dL()
               .a(this, new ehi(this.dq() - 3.0, this.ds() - 3.0, this.dw() - 3.0, this.dq() + 3.0, this.ds() + 6.0 + 3.0, this.dw() + 3.0), biq::bw);

            for (biq $$4 : $$3) {
               $$4.a((akr)this.dL(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private gw w() {
      ehn $$0 = this.dj();
      return gw.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dL().B && this.dL().X().b(cpr.b)) {
         gw $$1 = this.dl();
         dfj $$2 = csj.a(this.dL(), $$1);
         if (this.dL().a_($$1).i() && $$2.a((cpy)this.dL(), $$1)) {
            this.dL().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            gw $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = csj.a(this.dL(), $$4);
            if (this.dL().a_($$4).i() && $$2.a((cpy)this.dL(), $$4)) {
               this.dL().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cpv $$0, gw $$1) {
      dfj $$2 = $$0.a_($$1);
      gw $$3;
      dfj $$4;
      if ($$2.a(csw.rr)) {
         $$3 = $$1.a($$2.c(cxh.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dbx) {
         $$0.b($$3, dbx.c($$0.a_($$3)));
         gw.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cpv $$0, gw $$1, gw.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<gw> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<gw> c(cpv $$0, gw $$1) {
      for (gw $$2 : gw.a($$0.z, 10, $$1, 1)) {
         dfj $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dbx) {
            dbx.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a_() {
   }

   @Override
   protected void a(qx $$0) {
   }

   @Override
   protected void b(qx $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<biq> t() {
      return this.j.stream().filter(biq::bw);
   }
}
