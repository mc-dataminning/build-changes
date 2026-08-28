import java.util.Optional;
import javax.annotation.Nullable;

public class cjt extends buk {
   private static final ajx<Optional<ji>> b = akb.a(cjt.class, ajz.p);
   private static final ajx<Boolean> c = akb.a(cjt.class, ajz.k);
   public int a;

   public cjt(bur<? extends cjt> $$0, dgi $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cjt(dgi $$0, double $$1, double $$2, double $$3) {
      this(bur.S, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected buk.c bg() {
      return buk.c.a;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dW() instanceof arc) {
         ji $$0 = this.dw();
         if (((arc)this.dW()).F() != null && this.dW().a_($$0).l()) {
            this.dW().b($$0, diz.a(this.dW(), $$0));
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
   public final boolean b(bta $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cju);
   }

   @Override
   public final boolean a(arc $$0, bta $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cju) {
         return false;
      } else {
         if (!this.dR()) {
            this.a(buk.d.a);
            if (!$$1.a(awr.l)) {
               bta $$3 = $$1.d() != null ? this.dX().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dB(), this.dD(), this.dH(), 6.0F, false, dgi.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arc $$0) {
      this.a($$0, this.dX().p());
      super.c($$0);
   }

   private void a(arc $$0, bta $$1) {
      eav $$2 = $$0.F();
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
   public cwp dJ() {
      return new cwp(cwt.wf);
   }
}
