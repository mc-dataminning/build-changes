import java.util.Optional;
import javax.annotation.Nullable;

public class cjn extends bue {
   private static final akl<Optional<jh>> c = akp.a(cjn.class, akn.p);
   private static final akl<Boolean> d = akp.a(cjn.class, akn.k);
   public int b;

   public cjn(bul<? extends cjn> $$0, dfb $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.af.a(100000);
   }

   public cjn(dfb $$0, double $$1, double $$2, double $$3) {
      this(bul.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bue.b bh() {
      return bue.b.a;
   }

   @Override
   protected void a(akp.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aL();
      this.bX();
      if (this.dX() instanceof arn) {
         jh $$0 = this.dx();
         if (((arn)this.dX()).D() != null && this.dX().a_($$0).l()) {
            this.dX().b($$0, dhr.a(this.dX(), $$0));
         }
      }
   }

   @Override
   protected void b(uk $$0) {
      if (this.m() != null) {
         $$0.a("beam_target", uz.a(this.m()));
      }

      $$0.a("ShowBottom", this.o());
   }

   @Override
   protected void a(uk $$0) {
      uz.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cjo) {
         return false;
      } else {
         if (!this.dS() && !this.dX().C) {
            this.a(bue.c.a);
            if (!$$0.a(axc.l)) {
               bsu $$2 = $$0.d() != null ? this.dY().d(this, $$0.d()) : null;
               this.dX().a(this, $$2, null, this.dC(), this.dE(), this.dI(), 6.0F, false, dfb.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void au() {
      this.a(this.dY().p());
      super.au();
   }

   private void a(bsu $$0) {
      if (this.dX() instanceof arn) {
         dzi $$1 = ((arn)this.dX()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable jh $$0) {
      this.aw().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public jh m() {
      return this.aw().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.aw().a(d, $$0);
   }

   public boolean o() {
      return this.aw().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.m() != null;
   }

   @Override
   public cwb dK() {
      return new cwb(cwf.vh);
   }
}
