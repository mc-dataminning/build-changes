import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bjh extends bis {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private akt i;
   private final Set<bis> j = Sets.newHashSet();
   private int k;

   public bjh(biw<? extends bjh> $$0, cpx $$1) {
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
   public apg da() {
      return apg.d;
   }

   @Nullable
   public akt q() {
      return this.i;
   }

   public void b(@Nullable akt $$0) {
      this.i = $$0;
   }

   private void v() {
      gw $$0 = this.w();
      dfl $$1 = this.dL().a_($$0);
      if ($$1.a(csy.rr)) {
         ((cxj)$$1.b()).d($$1, this.dL(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dL().w_()) {
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.mu, apg.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dL().a(this.dq(), this.ds(), this.dw(), apf.mt, apg.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bgx $$0 = this.dL().ai();
            if ($$0 == bgx.c || $$0 == bgx.d) {
               this.b(4);
            }

            this.v();
            b(this.dL(), this.w());
            this.a(djv.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dL() instanceof aks) {
               List<bis> $$1 = this.dL()
                  .a(
                     this,
                     new ehk(this.dq() - 15.0, this.ds() - 15.0, this.dw() - 15.0, this.dq() + 15.0, this.ds() + 6.0 + 15.0, this.dw() + 15.0),
                     $$0 -> $$0.bv() && !this.j.contains($$0)
                  );

               for (akt $$2 : ((aks)this.dL()).a($$0 -> $$0.e(this) < 256.0F)) {
                  al.S.a($$2, this, $$1);
               }
            }

            this.ak();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dL() instanceof aks)) {
            this.dL().c(2);
         } else if (!this.h) {
            List<bis> $$3 = this.dL()
               .a(this, new ehk(this.dq() - 3.0, this.ds() - 3.0, this.dw() - 3.0, this.dq() + 3.0, this.ds() + 6.0 + 3.0, this.dw() + 3.0), bis::bv);

            for (bis $$4 : $$3) {
               $$4.a((aks)this.dL(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               al.E.a(this.i, $$3);
            }
         }
      }
   }

   private gw w() {
      ehp $$0 = this.dj();
      return gw.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dL().B && this.dL().X().b(cpt.b)) {
         gw $$1 = this.dl();
         dfl $$2 = csl.a(this.dL(), $$1);
         if (this.dL().a_($$1).i() && $$2.a((cqa)this.dL(), $$1)) {
            this.dL().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            gw $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = csl.a(this.dL(), $$4);
            if (this.dL().a_($$4).i() && $$2.a((cqa)this.dL(), $$4)) {
               this.dL().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cpx $$0, gw $$1) {
      dfl $$2 = $$0.a_($$1);
      gw $$3;
      dfl $$4;
      if ($$2.a(csy.rr)) {
         $$3 = $$1.a($$2.c(cxj.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dbz) {
         $$0.b($$3, dbz.c($$0.a_($$3)));
         gw.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cpx $$0, gw $$1, gw.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<gw> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<gw> c(cpx $$0, gw $$1) {
      for (gw $$2 : gw.a($$0.z, 10, $$1, 1)) {
         dfl $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dbz) {
            dbz.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cz();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a_() {
   }

   @Override
   protected void a(qy $$0) {
   }

   @Override
   protected void b(qy $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<bis> t() {
      return this.j.stream().filter(bis::bv);
   }
}
