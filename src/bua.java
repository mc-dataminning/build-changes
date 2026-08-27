import java.util.Optional;
import javax.annotation.Nullable;

public class bua extends bfj {
   private static final aby<Optional<gu>> c = acb.a(bua.class, aca.o);
   private static final aby<Boolean> d = acb.a(bua.class, aca.k);
   public int b;

   public bua(bfn<? extends bua> $$0, cmm $$1) {
      super($$0, $$1);
      this.H = true;
      this.b = this.af.a(100000);
   }

   public bua(cmm $$0, double $$1, double $$2, double $$3) {
      this(bfn.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bfj.b aS() {
      return bfj.b.a;
   }

   @Override
   protected void a_() {
      this.aj().a(c, Optional.empty());
      this.aj().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dI() instanceof aif) {
         gu $$0 = this.di();
         if (((aif)this.dI()).B() != null && this.dI().a_($$0).i()) {
            this.dI().b($$0, cpb.a(this.dI(), $$0));
         }
      }
   }

   @Override
   protected void b(qr $$0) {
      if (this.j() != null) {
         $$0.a("BeamTarget", rd.a(this.j()));
      }

      $$0.a("ShowBottom", this.k());
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
   public boolean bo() {
      return true;
   }

   @Override
   public boolean a(ben $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bub) {
         return false;
      } else {
         if (!this.dD() && !this.dI().B) {
            this.a(bfj.c.a);
            if (!$$0.a(amy.l)) {
               ben $$2 = $$0.d() != null ? this.dJ().d(this, $$0.d()) : null;
               this.dI().a(this, $$2, null, this.dn(), this.dp(), this.dt(), 6.0F, false, cmm.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ah() {
      this.a(this.dJ().n());
      super.ah();
   }

   private void a(ben $$0) {
      if (this.dI() instanceof aif) {
         dfn $$1 = ((aif)this.dI()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable gu $$0) {
      this.aj().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gu j() {
      return this.aj().b(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.aj().b(d, $$0);
   }

   public boolean k() {
      return this.aj().b(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.j() != null;
   }

   @Override
   public cfz dv() {
      return new cfz(cgc.ul);
   }
}
