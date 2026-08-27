import java.util.Optional;
import javax.annotation.Nullable;

public class cgk extends brh {
   private static final ajm<Optional<in>> c = ajq.a(cgk.class, ajo.p);
   private static final ajm<Boolean> d = ajq.a(cgk.class, ajo.k);
   public int b;

   public cgk(brn<? extends cgk> $$0, dad $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public cgk(dad $$0, double $$1, double $$2, double $$3) {
      this(brn.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected brh.b aZ() {
      return brh.b.a;
   }

   @Override
   protected void a(ajq.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dN() instanceof aqh) {
         in $$0 = this.dn();
         if (((aqh)this.dN()).D() != null && this.dN().a_($$0).i()) {
            this.dN().b($$0, dcr.a(this.dN(), $$0));
         }
      }
   }

   @Override
   protected void b(ua $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", up.a(this.p()));
      }

      $$0.a("ShowBottom", this.r());
   }

   @Override
   protected void a(ua $$0) {
      up.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bx() {
      return true;
   }

   @Override
   public boolean a(bqf $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cgl) {
         return false;
      } else {
         if (!this.dI() && !this.dN().B) {
            this.a(brh.c.a);
            if (!$$0.a(avt.m)) {
               bqf $$2 = $$0.d() != null ? this.dO().d(this, $$0.d()) : null;
               this.dN().a(this, $$2, null, this.ds(), this.du(), this.dy(), 6.0F, false, dad.a.b);
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

   private void a(bqf $$0) {
      if (this.dN() instanceof aqh) {
         duc $$1 = ((aqh)this.dN()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable in $$0) {
      this.an().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public in p() {
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
   public csz dA() {
      return new csz(ctc.vf);
   }
}
