import java.util.Optional;
import javax.annotation.Nullable;

public class cgz extends bru {
   private static final ajr<Optional<io>> c = ajv.a(cgz.class, ajt.p);
   private static final ajr<Boolean> d = ajv.a(cgz.class, ajt.k);
   public int b;

   public cgz(bsa<? extends cgz> $$0, dax $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public cgz(dax $$0, double $$1, double $$2, double $$3) {
      this(bsa.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bru.b bb() {
      return bru.b.a;
   }

   @Override
   protected void a(ajv.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dP() instanceof aqm) {
         io $$0 = this.dp();
         if (((aqm)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, ddl.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(ud $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", us.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ud $$0) {
      us.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bqn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cha) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(bru.c.a);
            if (!$$0.a(avy.m)) {
               bqn $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, dax.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void an() {
      this.a(this.dQ().n());
      super.an();
   }

   private void a(bqn $$0) {
      if (this.dP() instanceof aqm) {
         duw $$1 = ((aqm)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable io $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public io p() {
      return this.ap().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ap().a(d, $$0);
   }

   public boolean s() {
      return this.ap().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cto dC() {
      return new cto(ctr.vf);
   }
}
