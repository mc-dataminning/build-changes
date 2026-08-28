import java.util.Optional;
import javax.annotation.Nullable;

public class cjv extends bum {
   private static final ajy<Optional<ji>> b = akc.a(cjv.class, aka.p);
   private static final ajy<Boolean> c = akc.a(cjv.class, aka.k);
   public int a;

   public cjv(but<? extends cjv> $$0, dgj $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cjv(dgj $$0, double $$1, double $$2, double $$3) {
      this(but.R, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bum.c bg() {
      return bum.c.a;
   }

   @Override
   protected void a(akc.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dV() instanceof ard) {
         ji $$0 = this.dv();
         if (((ard)this.dV()).F() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, dja.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(tq $$0) {
      if (this.l() != null) {
         $$0.a("beam_target", uf.a(this.l()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(tq $$0) {
      uf.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public final boolean b(btc $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cjw);
   }

   @Override
   public final boolean a(ard $$0, btc $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cjw) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bum.d.a);
            if (!$$1.a(awr.l)) {
               btc $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dgj.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(ard $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(ard $$0, btc $$1) {
      eaw $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable ji $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public ji l() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean m() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.l() != null;
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.wf);
   }
}
