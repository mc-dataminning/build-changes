import java.util.Optional;
import javax.annotation.Nullable;

public class ckk extends bvb {
   private static final aks<Optional<jh>> b = akw.a(ckk.class, aku.p);
   private static final aks<Boolean> c = akw.a(ckk.class, aku.k);
   public int a;

   public ckk(bvi<? extends ckk> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public ckk(dgz $$0, double $$1, double $$2, double $$3) {
      this(bvi.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.a;
   }

   @Override
   protected void a(akw.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dW() instanceof arx) {
         jh $$0 = this.dw();
         if (((arx)this.dW()).F() != null && this.dW().a_($$0).l()) {
            this.dW().b($$0, djq.a(this.dW(), $$0));
         }
      }
   }

   @Override
   protected void b(um $$0) {
      if (this.l() != null) {
         $$0.a("beam_target", vb.a(this.l()));
      }

      $$0.a("ShowBottom", this.m());
   }

   @Override
   protected void a(um $$0) {
      vb.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public final boolean b(btr $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof ckl);
   }

   @Override
   public final boolean a(arx $$0, btr $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof ckl) {
         return false;
      } else {
         if (!this.dR()) {
            this.a(bvb.d.a);
            if (!$$1.a(axm.l)) {
               btr $$3 = $$1.d() != null ? this.dX().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dB(), this.dD(), this.dH(), 6.0F, false, dgz.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arx $$0) {
      this.a($$0, this.dX().p());
      super.c($$0);
   }

   private void a(arx $$0, btr $$1) {
      ebm $$2 = $$0.F();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable jh $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public jh l() {
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
   public cxg dJ() {
      return new cxg(cxk.wf);
   }
}
