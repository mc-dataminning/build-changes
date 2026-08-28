import java.util.Optional;
import javax.annotation.Nullable;

public class chn extends bsh {
   private static final ajp<Optional<ja>> c = ajt.a(chn.class, ajr.p);
   private static final ajp<Boolean> d = ajt.a(chn.class, ajr.k);
   public int b;

   public chn(bsn<? extends chn> $$0, dcg $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chn(dcg $$0, double $$1, double $$2, double $$3) {
      this(bsn.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsh.c bd() {
      return bsh.c.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dR() instanceof aqm) {
         ja $$0 = this.dr();
         if (((aqm)this.dR()).D() != null && this.dR().a_($$0).i()) {
            this.dR().b($$0, dev.a(this.dR(), $$0));
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
   public boolean bB() {
      return true;
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cho) {
         return false;
      } else {
         if (!this.dM() && !this.dR().B) {
            this.a(bsh.d.a);
            if (!$$0.a(avy.m)) {
               bra $$2 = $$0.d() != null ? this.dS().d(this, $$0.d()) : null;
               this.dR().a(this, $$2, null, this.dw(), this.dy(), this.dC(), 6.0F, false, dcg.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ap() {
      this.a(this.dS().o());
      super.ap();
   }

   private void a(bra $$0) {
      if (this.dR() instanceof aqm) {
         dwj $$1 = ((aqm)this.dR()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ja $$0) {
      this.ar().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ja p() {
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
   public cud dE() {
      return new cud(cug.vf);
   }
}
