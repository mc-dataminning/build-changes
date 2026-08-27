import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class blu extends blf {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private amq i;
   private final Set<blf> j = Sets.newHashSet();
   private int k;

   public blu(blj<? extends blu> $$0, csy $$1) {
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
   public ard db() {
      return ard.d;
   }

   @Nullable
   public amq q() {
      return this.i;
   }

   public void b(@Nullable amq $$0) {
      this.i = $$0;
   }

   private void w() {
      hv $$0 = this.x();
      dip $$1 = this.dM().a_($$0);
      if ($$1.a(cwb.ss)) {
         ((dan)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().y_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.ni, ard.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), arc.nh, ard.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bji $$0 = this.dM().aj();
            if ($$0 == bji.c || $$0 == bji.d) {
               this.b(4);
            }

            this.w();
            b(this.dM(), this.x());
            this.a(dmz.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof amp) {
               List<blf> $$1 = this.dM()
                  .a(
                     this,
                     new ekw(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (amq $$2 : ((amp)this.dM()).a($$0 -> $$0.e(this) < 256.0F)) {
                  am.T.a($$2, this, $$1);
               }
            }

            this.am();
         } else if (this.f < -this.ag.a(10)) {
            this.g--;
            this.f = 1;
            this.b = this.ag.g();
            this.b(0);
         }
      }

      if (this.f >= 0) {
         if (!(this.dM() instanceof amp)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<blf> $$3 = this.dM()
               .a(this, new ekw(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), blf::bx);

            for (blf $$4 : $$3) {
               $$4.a((amp)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private hv x() {
      elb $$0 = this.dk();
      return hv.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().Y().b(csu.b)) {
         hv $$1 = this.dm();
         dip $$2 = cvm.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((ctb)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            hv $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cvm.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((ctb)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(csy $$0, hv $$1) {
      dip $$2 = $$0.a_($$1);
      hv $$3;
      dip $$4;
      if ($$2.a(cwb.ss)) {
         $$3 = $$1.a($$2.c(dan.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dfb) {
         $$0.b($$3, dfb.c($$0.a_($$3)));
         hv.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(csy $$0, hv $$1, hv.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<hv> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<hv> c(csy $$0, hv $$1) {
      for (hv $$2 : hv.a($$0.z, 10, $$1, 1)) {
         dip $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dfb) {
            dfb.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void c_() {
   }

   @Override
   protected void a(sj $$0) {
   }

   @Override
   protected void b(sj $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<blf> u() {
      return this.j.stream().filter(blf::bx);
   }
}
