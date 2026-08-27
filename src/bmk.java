import com.google.common.collect.Sets;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public class bmk extends blv {
   private static final int c = 2;
   private static final double d = 3.0;
   private static final double e = 15.0;
   private int f;
   public long b;
   private int g;
   private boolean h;
   @Nullable
   private ane i;
   private final Set<blv> j = Sets.newHashSet();
   private int k;

   public bmk(blz<? extends bmk> $$0, ctp $$1) {
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
   public art db() {
      return art.d;
   }

   @Nullable
   public ane q() {
      return this.i;
   }

   public void b(@Nullable ane $$0) {
      this.i = $$0;
   }

   private void w() {
      hx $$0 = this.x();
      djh $$1 = this.dM().a_($$0);
      if ($$1.a(cws.ss)) {
         ((dbe)$$1.b()).d($$1, this.dM(), $$0);
      }
   }

   @Override
   public void l() {
      super.l();
      if (this.f == 2) {
         if (this.dM().y_()) {
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.ni, art.d, 10000.0F, 0.8F + this.ag.i() * 0.2F, false);
            this.dM().a(this.dr(), this.dt(), this.dx(), ars.nh, art.d, 2.0F, 0.5F + this.ag.i() * 0.2F, false);
         } else {
            bjy $$0 = this.dM().ak();
            if ($$0 == bjy.c || $$0 == bjy.d) {
               this.b(4);
            }

            this.w();
            b(this.dM(), this.x());
            this.a(dnr.G);
         }
      }

      this.f--;
      if (this.f < 0) {
         if (this.g == 0) {
            if (this.dM() instanceof and) {
               List<blv> $$1 = this.dM()
                  .a(
                     this,
                     new elo(this.dr() - 15.0, this.dt() - 15.0, this.dx() - 15.0, this.dr() + 15.0, this.dt() + 6.0 + 15.0, this.dx() + 15.0),
                     $$0 -> $$0.bx() && !this.j.contains($$0)
                  );

               for (ane $$2 : ((and)this.dM()).a($$0 -> $$0.e(this) < 256.0F)) {
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
         if (!(this.dM() instanceof and)) {
            this.dM().c(2);
         } else if (!this.h) {
            List<blv> $$3 = this.dM()
               .a(this, new elo(this.dr() - 3.0, this.dt() - 3.0, this.dx() - 3.0, this.dr() + 3.0, this.dt() + 6.0 + 3.0, this.dx() + 3.0), blv::bx);

            for (blv $$4 : $$3) {
               $$4.a((and)this.dM(), this);
            }

            this.j.addAll($$3);
            if (this.i != null) {
               am.F.a(this.i, $$3);
            }
         }
      }
   }

   private hx x() {
      elt $$0 = this.dk();
      return hx.a($$0.c, $$0.d - 1.0E-6, $$0.e);
   }

   private void b(int $$0) {
      if (!this.h && !this.dM().B && this.dM().Z().b(ctl.b)) {
         hx $$1 = this.dm();
         djh $$2 = cwd.a(this.dM(), $$1);
         if (this.dM().a_($$1).i() && $$2.a((cts)this.dM(), $$1)) {
            this.dM().b($$1, $$2);
            this.k++;
         }

         for (int $$3 = 0; $$3 < $$0; $$3++) {
            hx $$4 = $$1.b(this.ag.a(3) - 1, this.ag.a(3) - 1, this.ag.a(3) - 1);
            $$2 = cwd.a(this.dM(), $$4);
            if (this.dM().a_($$4).i() && $$2.a((cts)this.dM(), $$4)) {
               this.dM().b($$4, $$2);
               this.k++;
            }
         }
      }
   }

   private static void b(ctp $$0, hx $$1) {
      djh $$2 = $$0.a_($$1);
      hx $$3;
      djh $$4;
      if ($$2.a(cws.ss)) {
         $$3 = $$1.a($$2.c(dbe.a).g());
         $$4 = $$0.a_($$3);
      } else {
         $$3 = $$1;
         $$4 = $$2;
      }

      if ($$4.b() instanceof dft) {
         $$0.b($$3, dft.c($$0.a_($$3)));
         hx.a $$7 = $$1.j();
         int $$8 = $$0.z.a(3) + 3;

         for (int $$9 = 0; $$9 < $$8; $$9++) {
            int $$10 = $$0.z.a(8) + 1;
            a($$0, $$3, $$7, $$10);
         }
      }
   }

   private static void a(ctp $$0, hx $$1, hx.a $$2, int $$3) {
      $$2.g($$1);

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Optional<hx> $$5 = c($$0, $$2);
         if ($$5.isEmpty()) {
            break;
         }

         $$2.g($$5.get());
      }
   }

   private static Optional<hx> c(ctp $$0, hx $$1) {
      for (hx $$2 : hx.a($$0.z, 10, $$1, 1)) {
         djh $$3 = $$0.a_($$2);
         if ($$3.b() instanceof dft) {
            dft.b($$3).ifPresent($$2x -> $$0.b($$2, $$2x));
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
   protected void a(sn $$0) {
   }

   @Override
   protected void b(sn $$0) {
   }

   public int s() {
      return this.k;
   }

   public Stream<blv> u() {
      return this.j.stream().filter(blv::bx);
   }
}
