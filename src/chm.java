import java.util.Optional;
import javax.annotation.Nullable;

public class chm extends bsg {
   private static final ajp<Optional<ja>> c = ajt.a(chm.class, ajr.p);
   private static final ajp<Boolean> d = ajt.a(chm.class, ajr.k);
   public int b;

   public chm(bsm<? extends chm> $$0, dcf $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chm(dcf $$0, double $$1, double $$2, double $$3) {
      this(bsm.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dQ() instanceof aqm) {
         ja $$0 = this.dq();
         if (((aqm)this.dQ()).D() != null && this.dQ().a_($$0).i()) {
            this.dQ().b($$0, deu.a(this.dQ(), $$0));
         }
      }
   }

   @Override
   protected void b(tx $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", um.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(tx $$0) {
      um.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(bqz $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof chn) {
         return false;
      } else {
         if (!this.dL() && !this.dQ().B) {
            this.a(bsg.c.a);
            if (!$$0.a(avy.m)) {
               bqz $$2 = $$0.d() != null ? this.dR().d(this, $$0.d()) : null;
               this.dQ().a(this, $$2, null, this.dv(), this.dx(), this.dB(), 6.0F, false, dcf.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ao() {
      this.a(this.dR().o());
      super.ao();
   }

   private void a(bqz $$0) {
      if (this.dQ() instanceof aqm) {
         dwi $$1 = ((aqm)this.dQ()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ja $$0) {
      this.aq().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ja p() {
      return this.aq().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.aq().a(d, $$0);
   }

   public boolean s() {
      return this.aq().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cuc dD() {
      return new cuc(cuf.vf);
   }
}
