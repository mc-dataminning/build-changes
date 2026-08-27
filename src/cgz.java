import java.util.Optional;
import javax.annotation.Nullable;

public class cgz extends brv {
   private static final ajy<Optional<ir>> c = akc.a(cgz.class, aka.p);
   private static final ajy<Boolean> d = akc.a(cgz.class, aka.k);
   public int b;

   public cgz(bsb<? extends cgz> $$0, dca $$1) {
      super($$0, $$1);
      this.K = true;
      this.b = this.al.a(100000);
   }

   public cgz(dca $$0, double $$1, double $$2, double $$3) {
      this(bsb.G, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected brv.c bf() {
      return brv.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dU() instanceof aqt) {
         ir $$0 = this.du();
         if (((aqt)this.dU()).D() != null && this.dU().a_($$0).i()) {
            this.dU().b($$0, deo.a(this.dU(), $$0));
         }
      }
   }

   @Override
   protected void b(uk $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", uz.a(this.p()));
      }

      $$0.a("ShowBottom", this.r());
   }

   @Override
   protected void a(uk $$0) {
      uz.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean a(bqt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cha) {
         return false;
      } else {
         if (!this.dP() && !this.dU().C) {
            this.a(brv.d.a);
            if (!$$0.a(awg.m)) {
               bqt $$2 = $$0.d() != null ? this.dX().d(this, $$0.d()) : null;
               this.dU().a(this, $$2, null, this.dz(), this.dB(), this.dF(), 6.0F, false, dca.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void an() {
      this.a(this.dX().o());
      super.an();
   }

   private void a(bqt $$0) {
      if (this.dU() instanceof aqt) {
         dwx $$1 = ((aqt)this.dU()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ir $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ir p() {
      return this.ap().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ap().a(d, $$0);
   }

   public boolean r() {
      return this.ap().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cuh dH() {
      return new cuh(cuk.wQ);
   }
}
