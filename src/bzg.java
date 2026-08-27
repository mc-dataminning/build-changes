import java.util.Optional;
import javax.annotation.Nullable;

public class bzg extends bkq {
   private static final afo<Optional<ht>> c = afr.a(bzg.class, afq.o);
   private static final afo<Boolean> d = afr.a(bzg.class, afq.k);
   public int b;

   public bzg(bku<? extends bzg> $$0, csa $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public bzg(csa $$0, double $$1, double $$2, double $$3) {
      this(bku.B, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bkq.b aW() {
      return bkq.b.a;
   }

   @Override
   protected void b_() {
      this.an().a(c, Optional.empty());
      this.an().a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dN() instanceof ame) {
         ht $$0 = this.dn();
         if (((ame)this.dN()).C() != null && this.dN().a_($$0).i()) {
            this.dN().b($$0, cun.a(this.dN(), $$0));
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
   public boolean bt() {
      return true;
   }

   @Override
   public boolean a(bjo $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof bzh) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.a(bkq.c.a);
            if (!$$0.a(ari.l)) {
               bjo $$2 = $$0.d() != null ? this.dO().d(this, $$0.d()) : null;
               this.dN().a(this, $$2, null, this.ds(), this.du(), this.dy(), 6.0F, false, csa.a.b);
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

   private void a(bjo $$0) {
      if (this.dN() instanceof ame) {
         dku $$1 = ((ame)this.dN()).C();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ht $$0) {
      this.an().b(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ht q() {
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
   public clj dA() {
      return new clj(clm.uX);
   }
}
