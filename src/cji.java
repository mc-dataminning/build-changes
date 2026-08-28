import java.util.Optional;
import javax.annotation.Nullable;

public class cji extends btz {
   private static final akk<Optional<jg>> c = ako.a(cji.class, akm.p);
   private static final akk<Boolean> d = ako.a(cji.class, akm.k);
   public int b;

   public cji(bug<? extends cji> $$0, dev $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.af.a(100000);
   }

   public cji(dev $$0, double $$1, double $$2, double $$3) {
      this(bug.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aY();
      this.bX();
      if (this.dX() instanceof arm) {
         jg $$0 = this.dx();
         if (((arm)this.dX()).D() != null && this.dX().a_($$0).l()) {
            this.dX().b($$0, dhl.a(this.dX(), $$0));
         }
      }
   }

   @Override
   protected void b(uj $$0) {
      if (this.m() != null) {
         $$0.a("beam_target", uy.a(this.m()));
      }

      $$0.a("ShowBottom", this.o());
   }

   @Override
   protected void a(uj $$0) {
      uy.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public boolean a(bsp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cjj) {
         return false;
      } else {
         if (!this.dS() && !this.dX().C) {
            this.a(btz.c.a);
            if (!$$0.a(axb.l)) {
               bsp $$2 = $$0.d() != null ? this.dY().d(this, $$0.d()) : null;
               this.dX().a(this, $$2, null, this.dC(), this.dE(), this.dI(), 6.0F, false, dev.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void at() {
      this.a(this.dY().p());
      super.at();
   }

   private void a(bsp $$0) {
      if (this.dX() instanceof arm) {
         dzc $$1 = ((arm)this.dX()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable jg $$0) {
      this.av().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public jg m() {
      return this.av().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.av().a(d, $$0);
   }

   public boolean o() {
      return this.av().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.m() != null;
   }

   @Override
   public cvx dK() {
      return new cvx(cwb.vh);
   }
}
