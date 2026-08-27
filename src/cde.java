import java.util.Optional;
import javax.annotation.Nullable;

public class cde extends bof {
   private static final aii<Optional<ib>> c = ail.a(cde.class, aik.o);
   private static final aii<Boolean> d = ail.a(cde.class, aik.k);
   public int b;

   public cde(bol<? extends cde> $$0, cwe $$1) {
      super($$0, $$1);
      this.H = true;
      this.b = this.af.a(100000);
   }

   public cde(cwe $$0, double $$1, double $$2, double $$3) {
      this(bol.D, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bof.b aW() {
      return bof.b.a;
   }

   @Override
   protected void c_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dJ() instanceof apa) {
         ib $$0 = this.dj();
         if (((apa)this.dJ()).D() != null && this.dJ().a_($$0).i()) {
            this.dJ().b($$0, cys.a(this.dJ(), $$0));
         }
      }
   }

   @Override
   protected void b(sy $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", tn.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(sy $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(tn.b($$0.p("BeamTarget")));
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
   public boolean a(bne $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cdf) {
         return false;
      } else {
         if (!this.dE() && !this.dJ().B) {
            this.a(bof.c.a);
            if (!$$0.a(aug.m)) {
               bne $$2 = $$0.d() != null ? this.dK().d(this, $$0.d()) : null;
               this.dJ().a(this, $$2, null, this.do(), this.dq(), this.du(), 6.0F, false, cwe.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void al() {
      this.a(this.dK().n());
      super.al();
   }

   private void a(bne $$0) {
      if (this.dJ() instanceof apa) {
         dpt $$1 = ((apa)this.dJ()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ib $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ib q() {
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
   public cpq dw() {
      return new cpq(cpt.vb);
   }
}
