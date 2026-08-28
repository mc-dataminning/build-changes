import java.util.Optional;
import javax.annotation.Nullable;

public class ckt extends bvk {
   private static final alc<Optional<jh>> b = alg.a(ckt.class, ale.p);
   private static final alc<Boolean> c = alg.a(ckt.class, ale.k);
   public int a;

   public ckt(bvr<? extends ckt> $$0, dhi $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public ckt(dhi $$0, double $$1, double $$2, double $$3) {
      this(bvr.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bvk.c bg() {
      return bvk.c.a;
   }

   @Override
   protected void a(alg.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dW() instanceof ash) {
         jh $$0 = this.dw();
         if (((ash)this.dW()).E() != null && this.dW().a_($$0).l()) {
            this.dW().b($$0, djz.a(this.dW(), $$0));
         }
      }
   }

   @Override
   protected void b(ux $$0) {
      if (this.l() != null) {
         $$0.a("beam_target", vm.a(this.l()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(ux $$0) {
      vm.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public final boolean b(bua $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cku);
   }

   @Override
   public final boolean a(ash $$0, bua $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cku) {
         return false;
      } else {
         if (!this.dR()) {
            this.a(bvk.d.a);
            if (!$$1.a(axw.l)) {
               bua $$3 = $$1.d() != null ? this.dX().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dB(), this.dD(), this.dH(), 6.0F, false, dhi.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(ash $$0) {
      this.a($$0, this.dX().p());
      super.c($$0);
   }

   private void a(ash $$0, bua $$1) {
      ebt $$2 = $$0.E();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable jh $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public jh l() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean m() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.l() != null;
   }

   @Override
   public cxp dJ() {
      return new cxp(cxt.vV);
   }
}
