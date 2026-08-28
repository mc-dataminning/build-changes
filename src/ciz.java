import java.util.Optional;
import javax.annotation.Nullable;

public class ciz extends btr {
   private static final akh<Optional<jf>> c = akl.a(ciz.class, akj.p);
   private static final akh<Boolean> d = akl.a(ciz.class, akj.k);
   public int b;

   public ciz(bty<? extends ciz> $$0, dej $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.af.a(100000);
   }

   public ciz(dej $$0, double $$1, double $$2, double $$3) {
      this(bty.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected btr.b bf() {
      return btr.b.a;
   }

   @Override
   protected void a(akl.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aW();
      this.bT();
      if (this.dS() instanceof arj) {
         jf $$0 = this.ds();
         if (((arj)this.dS()).D() != null && this.dS().a_($$0).l()) {
            this.dS().b($$0, dgz.a(this.dS(), $$0));
         }
      }
   }

   @Override
   protected void b(ug $$0) {
      if (this.m() != null) {
         $$0.a("beam_target", uv.a(this.m()));
      }

      $$0.a("ShowBottom", this.o());
   }

   @Override
   protected void a(ug $$0) {
      uv.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean a(bsj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cja) {
         return false;
      } else {
         if (!this.dN() && !this.dS().B) {
            this.a(btr.c.a);
            if (!$$0.a(awx.l)) {
               bsj $$2 = $$0.d() != null ? this.dT().d(this, $$0.d()) : null;
               this.dS().a(this, $$2, null, this.dx(), this.dz(), this.dD(), 6.0F, false, dej.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ar() {
      this.a(this.dT().p());
      super.ar();
   }

   private void a(bsj $$0) {
      if (this.dS() instanceof arj) {
         dyr $$1 = ((arj)this.dS()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable jf $$0) {
      this.at().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public jf m() {
      return this.at().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.at().a(d, $$0);
   }

   public boolean o() {
      return this.at().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.m() != null;
   }

   @Override
   public cvs dF() {
      return new cvs(cvw.vh);
   }
}
