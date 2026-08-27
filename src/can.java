import java.util.Optional;
import javax.annotation.Nullable;

public class can extends blv {
   private static final agm<Optional<hx>> c = agp.a(can.class, ago.o);
   private static final agm<Boolean> d = agp.a(can.class, ago.k);
   public int b;

   public can(blz<? extends can> $$0, ctp $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public can(ctp $$0, double $$1, double $$2, double $$3) {
      this(blz.C, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected blv.b aW() {
      return blv.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dM() instanceof and) {
         hx $$0 = this.dm();
         if (((and)this.dM()).D() != null && this.dM().a_($$0).i()) {
            this.dM().b($$0, cwd.a(this.dM(), $$0));
         }
      }
   }

   @Override
   protected void b(sn $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", tc.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(sn $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(tc.b($$0.p("BeamTarget")));
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
   public boolean a(bkt $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cao) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.a(blv.c.a);
            if (!$$0.a(asj.m)) {
               bkt $$2 = $$0.d() != null ? this.dN().d(this, $$0.d()) : null;
               this.dM().a(this, $$2, null, this.dr(), this.dt(), this.dx(), 6.0F, false, ctp.a.b);
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

   private void a(bkt $$0) {
      if (this.dM() instanceof and) {
         dmt $$1 = ((and)this.dM()).D();
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
   public cmy dz() {
      return new cmy(cnb.uY);
   }
}
