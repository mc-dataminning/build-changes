import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bfy extends bfj {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private aig i;
   private final Set<bfj> j = Sets.newHashSet();
   private int k;

   public bfy(bfn<? extends bfy> $$0, cmm $$1) {
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
   public ami cY() {
      return ami.d;
   }

   @Nullable
   public aig j() {
      return this.i;
   }

   public void b(@Nullable aig $$0) {
      this.i = $$0;
   }

   private void p() {
      gu $$0 = this.q();
      dcb $$1 = this.dI().a_($$0);
      if ($$1.a(cpo.rr)) {
         ((ctz)$$1.b()).d($$1, this.dI(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dI().r_()) {
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.mu, ami.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dI().a(this.dn(), this.dp(), this.dt(), amh.mt, ami.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            bdu $$0 = this.dI().ai();
            if ($$0 == bdu.c || $$0 == bdu.d) {
               this.b(4);
            }

            this.p();
            b(this.dI(), this.q());
            this.a(dgl.H);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dI() instanceof aif) {
               List<bfj> $$1 = this.dI()
                  .a(
                     this,
                     new eed(this.dn() - 15.0, this.dp() - 15.0, this.dt() - 15.0, this.dn() + 15.0, this.dp() + 6.0 + 15.0, this.dt() + 15.0),
                     $$0 -> $$0.bs() && !this.j.contains($$0)
                  );

               for (aig $$2 : ((aif)this.dI()).a($$0 -> $$0.e(this) < 256.0F)) {
                  ai.S.a($$2, this, $$1);
               }
            }

            this.ai();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dI() instanceof aif)) {
            this.dI().c(2);
         } else if (!this.h) {
            List<bfj> $$3 = this.dI()
               .a(this, new eed(this.dn() - 3.0, this.dp() - 3.0, this.dt() - 3.0, this.dn() + 3.0, this.dp() + 6.0 + 3.0, this.dt() + 3.0), bfj::bs);

            for (bfj $$4 : $$3) {
               $$4.a((aif)this.dI(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               ai.E.a(this.i, $$3);
            }
         }
      }
   }

   private gu q() {
      eei $$0 = this.dg();
      return gu.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dI().B && this.dI().X().b(cmi.b)) {
         gu $$1 = this.di();
         dcb $$2 = cpb.a(this.dI(), $$1);
         if (this.dI().a_($$1).i() && $$2.a((cmp)this.dI(), $$1)) {
            this.dI().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            gu $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = cpb.a(this.dI(), $$4);
            if (this.dI().a_($$4).i() && $$2.a((cmp)this.dI(), $$4)) {
               this.dI().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(cmm $$0, gu $$1) {
      dcb $$2 = $$0.a_($$1);
      gu $$3;
      dcb $$4;
      if ($$2.a(cpo.rr)) {
         $$3 = $$1.a($$2.c(ctz.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof cyp) {
         $$0.b($$3, cyp.c($$0.a_($$3)));
         gu.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(cmm $$0, gu $$1, gu.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<gu> $$5 = c($$0, $$2);
         if (!$$5.isPresent()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<gu> c(cmm $$0, gu $$1) {
      for (gu $$2 : gu.a($$0.z, 10, $$1, 1)) {
         dcb $$3 = $$0.a_($$2);
         if ($$3.b() instanceof cyp) {
            cyp.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a_() {
   }

   @Override
   protected void a(qr $$0) {
   }

   @Override
   protected void b(qr $$0) {
   }

   public int k() {
      return this.k;
   }

   public Stream<bfj> o() {
      return this.j.stream().filter(bfj::bs);
   }
}
