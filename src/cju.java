import java.util.Optional;
import javax.annotation.Nullable;

public class cju extends bul {
   private static final akm<Optional<jh>> b = akq.a(cju.class, ako.p);
   private static final akm<Boolean> c = akq.a(cju.class, ako.k);
   public int a;

   public cju(bus<? extends cju> $$0, dfm $$1) {
      super($$0, $$1);
      this.I = true;
      this.a = this.ae.a(100000);
   }

   public cju(dfm $$0, double $$1, double $$2, double $$3) {
      this(bus.Q, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bul.b bg() {
      return bul.b.a;
   }

   @Override
   protected void a(akq.a $$0) {
      $$0.a(b, Optional.empty());
      $$0.a(c, true);
   }

   @Override
   public void h() {
      this.a++;
      this.aK();
      this.bW();
      if (this.dV() instanceof arp) {
         jh $$0 = this.dv();
         if (((arp)this.dV()).E() != null && this.dV().a_($$0).l()) {
            this.dV().b($$0, did.a(this.dV(), $$0));
         }
      }
   }

   @Override
   protected void b(ul $$0) {
      if (this.j() != null) {
         $$0.a("beam_target", va.a(this.j()));
      }

      $$0.a("ShowBottom", this.l());
   }

   @Override
   protected void a(ul $$0) {
      va.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public final boolean b(btb $$0) {
      return this.d($$0) ? false : !($$0.d() instanceof cjv);
   }

   @Override
   public final boolean a(arp $$0, btb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if ($$1.d() instanceof cjv) {
         return false;
      } else {
         if (!this.dQ()) {
            this.a(bul.c.a);
            if (!$$1.a(axe.l)) {
               btb $$3 = $$1.d() != null ? this.dW().d(this, $$1.d()) : null;
               $$0.a(this, $$3, null, this.dA(), this.dC(), this.dG(), 6.0F, false, dfm.a.b);
            }

            this.a($$0, $$1);
         }

         return true;
      }
   }

   @Override
   public void c(arp $$0) {
      this.a($$0, this.dW().p());
      super.c($$0);
   }

   private void a(arp $$0, btb $$1) {
      dzt $$2 = $$0.E();
      if ($$2 != null) {
         $$2.a(this, $$1);
      }
   }

   public void a(@Nullable jh $$0) {
      this.au().a(b, Optional.ofNullable($$0));
   }

   @Nullable
   public jh j() {
      return this.au().a(b).orElse(null);
   }

   public void a(boolean $$0) {
      this.au().a(c, $$0);
   }

   public boolean l() {
      return this.au().a(c);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.j() != null;
   }

   @Override
   public cwm dI() {
      return new cwm(cwq.vx);
   }
}
