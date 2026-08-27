import java.util.Optional;
import javax.annotation.Nullable;

public class ccl extends bno {
   private static final aie<Optional<hz>> c = aih.a(ccl.class, aig.o);
   private static final aie<Boolean> d = aih.a(ccl.class, aig.k);
   public int b;

   public ccl(bnu<? extends ccl> $$0, cvn $$1) {
      super($$0, $$1);
      this.H = true;
      this.b = this.af.a(100000);
   }

   public ccl(cvn $$0, double $$1, double $$2, double $$3) {
      this(bnu.D, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bno.b aW() {
      return bno.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dM() instanceof aov) {
         hz $$0 = this.dm();
         if (((aov)this.dM()).D() != null && this.dM().a_($$0).i()) {
            this.dM().b($$0, cyb.a(this.dM(), $$0));
         }
      }
   }

   @Override
   protected void b(sw $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", tl.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(sw $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(tl.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bmn $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof ccm) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.a(bno.c.a);
            if (!$$0.a(aub.m)) {
               bmn $$2 = $$0.d() != null ? this.dN().d(this, $$0.d()) : null;
               this.dM().a(this, $$2, null, this.dr(), this.dt(), this.dx(), 6.0F, false, cvn.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void al() {
      this.a(this.dN().n());
      super.al();
   }

   private void a(bmn $$0) {
      if (this.dM() instanceof aov) {
         dor $$1 = ((aov)this.dM()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable hz $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public hz q() {
      return this.an().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.an().b(d, $$0);
   }

   public boolean s() {
      return this.an().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public coz dz() {
      return new coz(cpc.vb);
   }
}
