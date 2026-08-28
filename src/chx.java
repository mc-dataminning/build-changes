import java.util.Optional;
import javax.annotation.Nullable;

public class chx extends bsq {
   private static final ajv<Optional<jd>> c = ajz.a(chx.class, ajx.p);
   private static final ajv<Boolean> d = ajz.a(chx.class, ajx.k);
   public int b;

   public chx(bsw<? extends chx> $$0, dcu $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chx(dcu $$0, double $$1, double $$2, double $$3) {
      this(bsw.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsq.b bc() {
      return bsq.b.a;
   }

   @Override
   protected void a(ajz.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dQ() instanceof aqt) {
         jd $$0 = this.dq();
         if (((aqt)this.dQ()).D() != null && this.dQ().a_($$0).i()) {
            this.dQ().b($$0, dfj.a(this.dQ(), $$0));
         }
      }
   }

   @Override
   protected void b(ua $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", up.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ua $$0) {
      up.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(brj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof chy) {
         return false;
      } else {
         if (!this.dL() && !this.dQ().B) {
            this.a(bsq.c.a);
            if (!$$0.a(awf.l)) {
               brj $$2 = $$0.d() != null ? this.dR().d(this, $$0.d()) : null;
               this.dQ().a(this, $$2, null, this.dv(), this.dx(), this.dB(), 6.0F, false, dcu.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ap() {
      this.a(this.dR().o());
      super.ap();
   }

   private void a(brj $$0) {
      if (this.dQ() instanceof aqt) {
         dwy $$1 = ((aqt)this.dQ()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable jd $$0) {
      this.ar().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public jd p() {
      return this.ar().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ar().a(d, $$0);
   }

   public boolean s() {
      return this.ar().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cuo dD() {
      return new cuo(cur.vf);
   }
}
