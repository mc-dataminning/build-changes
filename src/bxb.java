import java.util.Optional;
import javax.annotation.Nullable;

public class bxb extends bil {
   private static final aec<Optional<gw>> c = aef.a(bxb.class, aee.o);
   private static final aec<Boolean> d = aef.a(bxb.class, aee.k);
   public int b;

   public bxb(bip<? extends bxb> $$0, cpq $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bxb(cpq $$0, double $$1, double $$2, double $$3) {
      this(bip.B, $$0);
      this.e($$1, $$2, $$3);
   }

   @Override
   protected bil.b aU() {
      return bil.b.a;
   }

   @Override
   protected void a_() {
      this.al().a(c, Optional.empty());
      this.al().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dK() instanceof akn) {
         gw $$0 = this.dk();
         if (((akn)this.dK()).B() != null && this.dK().a_($$0).i()) {
            this.dK().b($$0, cse.a(this.dK(), $$0));
         }
      }
   }

   @Override
   protected void b(qu $$0) {
      if (this.j() != null) {
         $$0.a("BeamTarget", rg.a(this.j()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(qu $$0) {
      if ($$0.b("BeamTarget", 10)) {
         this.a(rg.b($$0.p("BeamTarget")));
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
   public boolean a(bhj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bxc) {
         return false;
      } else {
         if (!this.dF() && !this.dK().B) {
            this.a(bil.c.a);
            if (!$$0.a(apq.l)) {
               bhj $$2 = $$0.d() != null ? this.dL().d(this, $$0.d()) : null;
               this.dK().a(this, $$2, null, this.dp(), this.dr(), this.dv(), 6.0F, false, cpq.a.b);
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

   private void a(bhj $$0) {
      if (this.dK() instanceof akn) {
         diq $$1 = ((akn)this.dK()).B();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable gw $$0) {
      this.al().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public gw j() {
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
   public cja dx() {
      return new cja(cjd.ul);
   }
}
