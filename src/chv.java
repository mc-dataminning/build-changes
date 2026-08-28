import java.util.Optional;
import javax.annotation.Nullable;

public class chv extends bsp {
   private static final akg<Optional<iz>> c = akk.a(chv.class, aki.p);
   private static final akg<Boolean> d = akk.a(chv.class, aki.k);
   public int b;

   public chv(bsv<? extends chv> $$0, dbt $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chv(dbt $$0, double $$1, double $$2, double $$3) {
      this(bsv.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsp.b bb() {
      return bsp.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dP() instanceof arb) {
         iz $$0 = this.dp();
         if (((arb)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, deh.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(ur $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", vg.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ur $$0) {
      vg.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bri $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof chw) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(bsp.c.a);
            if (!$$0.a(awn.m)) {
               bri $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, dbt.a.b);
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

   private void a(bri $$0) {
      if (this.dP() instanceof arb) {
         dvs $$1 = ((arb)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable iz $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public iz p() {
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
   public cuk dC() {
      return new cuk(cun.vf);
   }
}
