import java.util.Optional;
import javax.annotation.Nullable;

public class bzl extends bkv {
   private static final afs<Optional<hx>> c = afv.a(bzl.class, afu.o);
   private static final afs<Boolean> d = afv.a(bzl.class, afu.k);
   public int b;

   public bzl(bkz<? extends bzl> $$0, csf $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bzl(csf $$0, double $$1, double $$2, double $$3) {
      this(bkz.B, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bkv.b aW() {
      return bkv.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dN() instanceof ami) {
         hx $$0 = this.dn();
         if (((ami)this.dN()).C() != null && this.dN().a_($$0).i()) {
            this.dN().b($$0, cus.a(this.dN(), $$0));
         }
      }
   }

   @Override
   protected void b(sd $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", ss.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(sd $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(ss.b($$0.p("BeamTarget")));
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
   public boolean a(bjt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bzm) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.a(bkv.c.a);
            if (!$$0.a(arm.l)) {
               bjt $$2 = $$0.d() != null ? this.dO().d(this, $$0.d()) : null;
               this.dN().a(this, $$2, null, this.ds(), this.du(), this.dy(), 6.0F, false, csf.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void al() {
      this.a(this.dO().n());
      super.al();
   }

   private void a(bjt $$0) {
      if (this.dN() instanceof ami) {
         dkz $$1 = ((ami)this.dN()).C();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable hx $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public hx q() {
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
   public clo dA() {
      return new clo(clr.uX);
   }
}
