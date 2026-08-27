import java.util.Optional;
import javax.annotation.Nullable;

public class byy extends bki {
   private static final afm<Optional<ht>> c = afp.a(byy.class, afo.o);
   private static final afm<Boolean> d = afp.a(byy.class, afo.k);
   public int b;

   public byy(bkm<? extends byy> $$0, crs $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public byy(crs $$0, double $$1, double $$2, double $$3) {
      this(bkm.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bki.b aU() {
      return bki.b.a;
   }

   @Override
   protected void b_() {
      this.al().a(c, Optional.empty());
      this.al().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dL() instanceof ama) {
         ht $$0 = this.dl();
         if (((ama)this.dL()).B() != null && this.dL().a_($$0).i()) {
            this.dL().b($$0, cug.a(this.dL(), $$0));
         }
      }
   }

   @Override
   protected void b(rz $$0) {
      if (this.q() != null) {
         $$0.a("BeamTarget", so.a(this.q()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(rz $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(so.b($$0.p("BeamTarget")));
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
   public boolean a(bjg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof byz) {
         return false;
      } else {
         if (!this.dG() && !this.dL().B) {
            this.a(bki.c.a);
            if (!$$0.a(are.l)) {
               bjg $$2 = $$0.d() != null ? this.dM().d(this, $$0.d()) : null;
               this.dL().a(this, $$2, null, this.dq(), this.ds(), this.dw(), 6.0F, false, crs.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void aj() {
      this.a(this.dM().n());
      super.aj();
   }

   private void a(bjg $$0) {
      if (this.dL() instanceof ama) {
         dki $$1 = ((ama)this.dL()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ht $$0) {
      this.al().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ht q() {
      return this.al().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.al().b(d, $$0);
   }

   public boolean s() {
      return this.al().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.q() != null;
   }

   @Override
   public clb dy() {
      return new clb(cle.um);
   }
}
