import java.util.Optional;
import javax.annotation.Nullable;

public class cdw extends bow {
   private static final aim<Optional<ib>> c = aiq.a(cdw.class, aio.o);
   private static final aim<Boolean> d = aiq.a(cdw.class, aio.k);
   public int b;

   public cdw(bpc<? extends cdw> $$0, cwz $$1) {
      super($$0, $$1);
      this.I = true;
      this.b = this.ag.a(100000);
   }

   public cdw(cwz $$0, double $$1, double $$2, double $$3) {
      this(bpc.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bow.b aZ() {
      return bow.b.a;
   }

   @Override
   protected void a(aiq.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dM() instanceof apf) {
         ib $$0 = this.dm();
         if (((apf)this.dM()).D() != null && this.dM().a_($$0).i()) {
            this.dM().b($$0, czn.a(this.dM(), $$0));
         }
      }
   }

   @Override
   protected void b(ta $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", tp.a(this.p()));
      }

      $$0.a("ShowBottom", this.r());
   }

   @Override
   protected void a(ta $$0) {
      tp.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bw() {
      return true;
   }

   @Override
   public boolean a(bnv $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cdx) {
         return false;
      } else {
         if (!this.dH() && !this.dM().B) {
            this.a(bow.c.a);
            if (!$$0.a(aup.m)) {
               bnv $$2 = $$0.d() != null ? this.dN().d(this, $$0.d()) : null;
               this.dM().a(this, $$2, null, this.dr(), this.dt(), this.dx(), 6.0F, false, cwz.a.b);
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

   private void a(bnv $$0) {
      if (this.dM() instanceof apf) {
         dqp $$1 = ((apf)this.dM()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ib $$0) {
      this.an().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ib p() {
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
   public cqk dz() {
      return new cqk(cqn.vc);
   }
}
