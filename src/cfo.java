import java.util.Optional;
import javax.annotation.Nullable;

public class cfo extends bql {
   private static final ajk<Optional<im>> c = ajo.a(cfo.class, ajm.p);
   private static final ajk<Boolean> d = ajo.a(cfo.class, ajm.k);
   public int b;

   public cfo(bqr<? extends cfo> $$0, czu $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public cfo(czu $$0, double $$1, double $$2, double $$3) {
      this(bqr.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bql.b aZ() {
      return bql.b.a;
   }

   @Override
   protected void a(ajo.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dN() instanceof aqe) {
         im $$0 = this.dn();
         if (((aqe)this.dN()).D() != null && this.dN().a_($$0).i()) {
            this.dN().b($$0, dci.a(this.dN(), $$0));
         }
      }
   }

   @Override
   protected void b(ty $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", un.a(this.p()));
      }

      $$0.a("ShowBottom", this.r());
   }

   @Override
   protected void a(ty $$0) {
      un.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cfp) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.a(bql.c.a);
            if (!$$0.a(avq.m)) {
               bpj $$2 = $$0.d() != null ? this.dO().d(this, $$0.d()) : null;
               this.dN().a(this, $$2, null, this.ds(), this.du(), this.dy(), 6.0F, false, czu.a.b);
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

   private void a(bpj $$0) {
      if (this.dN() instanceof aqe) {
         dtt $$1 = ((aqe)this.dN()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable im $$0) {
      this.an().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public im p() {
      return this.an().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.an().a(d, $$0);
   }

   public boolean r() {
      return this.an().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public csd dA() {
      return new csd(csg.vf);
   }
}
