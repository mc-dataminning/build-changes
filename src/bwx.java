import java.util.Optional;
import javax.annotation.Nullable;

public class bwx extends big {
   private static final adx<Optional<gv>> c = aea.a(bwx.class, adz.o);
   private static final adx<Boolean> d = aea.a(bwx.class, adz.k);
   public int b;

   public bwx(bik<? extends bwx> $$0, cpk $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bwx(cpk $$0, double $$1, double $$2, double $$3) {
      this(bik.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected big.b aU() {
      return big.b.a;
   }

   @Override
   protected void a_() {
      this.al().a(c, Optional.empty());
      this.al().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dK() instanceof aki) {
         gv $$0 = this.dk();
         if (((aki)this.dK()).B() != null && this.dK().a_($$0).i()) {
            this.dK().b($$0, cry.a(this.dK(), $$0));
         }
      }
   }

   @Override
   protected void b(qs $$0) {
      if (this.j() != null) {
         $$0.a("BeamTarget", re.a(this.j()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(qs $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(re.b($$0.p("BeamTarget")));
      }

      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean br() {
      return true;
   }

   @Override
   public boolean a(bhe $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bwy) {
         return false;
      } else {
         if (!this.dF() && !this.dK().B) {
            this.a(big.c.a);
            if (!$$0.a(apl.l)) {
               bhe $$2 = $$0.d() != null ? this.dL().d(this, $$0.d()) : null;
               this.dK().a(this, $$2, null, this.dp(), this.dr(), this.dv(), 6.0F, false, cpk.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void aj() {
      this.a(this.dL().n());
      super.aj();
   }

   private void a(bhe $$0) {
      if (this.dK() instanceof aki) {
         dik $$1 = ((aki)this.dK()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable gv $$0) {
      this.al().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gv j() {
      return this.al().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.al().b(d, $$0);
   }

   public boolean m() {
      return this.al().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.j() != null;
   }

   @Override
   public ciw dx() {
      return new ciw(ciz.ul);
   }
}
