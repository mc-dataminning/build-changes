import java.util.Optional;
import javax.annotation.Nullable;

public class bwz extends bii {
   private static final adz<Optional<gu>> c = aec.a(bwz.class, aeb.o);
   private static final adz<Boolean> d = aec.a(bwz.class, aeb.k);
   public int b;

   public bwz(bim<? extends bwz> $$0, cpm $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bwz(cpm $$0, double $$1, double $$2, double $$3) {
      this(bim.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bii.b aU() {
      return bii.b.a;
   }

   @Override
   protected void a_() {
      this.al().a(c, Optional.empty());
      this.al().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dK() instanceof akk) {
         gu $$0 = this.dk();
         if (((akk)this.dK()).B() != null && this.dK().a_($$0).i()) {
            this.dK().b($$0, csa.a(this.dK(), $$0));
         }
      }
   }

   @Override
   protected void b(qr $$0) {
      if (this.j() != null) {
         $$0.a("BeamTarget", rd.a(this.j()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(qr $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(rd.b($$0.p("BeamTarget")));
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
   public boolean a(bhg $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bxa) {
         return false;
      } else {
         if (!this.dF() && !this.dK().B) {
            this.a(bii.c.a);
            if (!$$0.a(apn.l)) {
               bhg $$2 = $$0.d() != null ? this.dL().d(this, $$0.d()) : null;
               this.dK().a(this, $$2, null, this.dp(), this.dr(), this.dv(), 6.0F, false, cpm.a.b);
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

   private void a(bhg $$0) {
      if (this.dK() instanceof akk) {
         dim $$1 = ((akk)this.dK()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable gu $$0) {
      this.al().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gu j() {
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
   public ciy dx() {
      return new ciy(cjb.ul);
   }
}
