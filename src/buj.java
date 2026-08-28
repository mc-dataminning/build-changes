import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class buj extends bto {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private ari i;
   private final Set<bto> j = Sets.newHashSet();
   private int k;

   public buj(btv<? extends buj> $$0, deg $$1) {
      super($$0, $$1);
      this.f = 2;
      this.b = this.af.g();
      this.g = this.af.a(3) + 1;
   }

   public void a(boolean $$0) {
      this.h = $$0;
   }

   @Override
   public awf di() {
      return awf.d;
   }

   @Nullable
   public ari m() {
      return this.i;
   }

   public void b(@Nullable ari $$0) {
      this.i = $$0;
   }

   private void t() {
      je $$0 = this.v();
      duo $$1 = this.dS().a_($$0);
      if ($$1.a(dhl.ss)) {
         ((dly)$$1.b()).d($$1, this.dS(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dS().w_()) {
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.nX, awf.d, 10000.0F, 0.8F + this.af.i() * 0.2F, false);
            this.dS().a(this.dx(), this.dz(), this.dD(), awe.nW, awf.d, 2.0F, 0.5F + this.af.i() * 0.2F, false);
         } else {
            brm $$0 = this.dS().am();
            if ($$0 == brm.c || $$0 == brm.d) {
               this.b(4);
            }

            this.t();
            b(this.dS(), this.v());
            this.a(dzl.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dS() instanceof arh) {
               List<bto> $$1 = this.dS()
                  .a(
                     this,
                     new eyn(this.dx() - 15.0, this.dz() - 15.0, this.dD() - 15.0, this.dx() + 15.0, this.dz() + 6.0 + 15.0, this.dD() + 15.0),
                     $$0 -> $$0.bI() && !this.j.contains($$0)
                  );

               for (ari $$2 : ((arh)this.dS()).a($$0 -> $$0.f(this) < 256.0F)) {
                  an.V.a($$2, this, $$1);
               }
            }

            this.as();
         } else if (this.f < -this.af.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.af.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dS() instanceof arh)) {
            this.dS().c(2);
         } else if (!this.h) {
            List<bto> $$3 = this.dS()
               .a(this, new eyn(this.dx() - 3.0, this.dz() - 3.0, this.dD() - 3.0, this.dx() + 3.0, this.dz() + 6.0 + 3.0, this.dD() + 3.0), bto::bI);

            for (bto $$4 : $$3) {
               $$4.a((arh)this.dS(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               an.F.a(this.i, $$3);
            }
         }
      }
   }

   private je v() {
      eys $$0 = this.dq();
      return je.a($$0.d, $$0.e - 1.0E-6, $$0.f);
   }

   private void b(int $$0) {
      if (!this.h && !this.dS().B && this.dS().ac().b(dec.b)) {
         je $$1 = this.ds();
         duo $$2 = dgw.a(this.dS(), $$1);
         if (this.dS().a_($$1).l() && $$2.a((dej)this.dS(), $$1)) {
            this.dS().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            je $$4 = $$1.b(this.af.a(3) - 1, this.af.a(3) - 1, this.af.a(3) - 1);
            $$2 = dgw.a(this.dS(), $$4);
            if (this.dS().a_($$4).l() && $$2.a((dej)this.dS(), $$4)) {
               this.dS().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(deg $$0, je $$1) {
      duo $$2 = $$0.a_($$1);
      je $$3;
      duo $$4;
      if ($$2.a(dhl.ss)) {
         $$3 = $$1.a($$2.c(dly.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dqp) {
         $$0.b($$3, dqp.c($$0.a_($$3)));
         je.a $$7 = $$1.k();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(deg $$0, je $$1, je.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<je> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<je> c(deg $$0, je $$1) {
      for (je $$2 : je.a($$0.z, 10, $$1, 1)) {
         duo $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dqp) {
            dqp.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
            $$0.c(3002, $$2, -1);
            return Optional.of($$2);
         }
      }

      return Optional.empty();
   }

   @Override
   public boolean a(double $$0) {
      double $$1 = 64.0 * cH();
      return $$0 < $$1 * $$1;
   }

   @Override
   protected void a(akk.a $$0) {
   }

   @Override
   protected void a(uf $$0) {
   }

   @Override
   protected void b(uf $$0) {
   }

   public int o() {
      return this.k;
   }

   public Stream<bto> q() {
      return this.j.stream().filter(bto::bI);
   }
}
