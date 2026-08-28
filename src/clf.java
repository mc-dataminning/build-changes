import java.util.Optional;
import javax.annotation.Nullable;

public class clf extends bvs {
   private static final akg<Optional<jj>> b = akk.a(clf.class, aki.p);
   private static final akg<Boolean> c = akk.a(clf.class, aki.k);
   public int a;

   public clf(bwb<? extends clf> $$0, dhp $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public clf(dhp $$0, double $$1, double $$2, double $$3) {
      this(bwb.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bvs.d bg() {
      return bvs.d.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dV() instanceof arn) {
         jj $$0 = this.dv();
         if (((arn)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dkh.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(tw $$0) {
      if (this.f() != null) {
         $$0.a("beam_target", ul.a(this.f()));
      }

      $$0.a("ShowBottom", this.g());
   }

   @Override
   protected void a(tw $$0) {
      ul.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public final boolean b(buh $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof clg);
   }

   @Override
   public final boolean a(arn $$0, buh $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof clg) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bvs.e.a);
            if (!$$1.a(axb.l)) {
               buh $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dhp.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arn $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(arn $$0, buh $$1) {
      ecm $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable jj $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public jj f() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean g() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.f() != null;
   }

   @Override
   public cxy dI() {
      return new cxy(cyc.wj);
   }
}
