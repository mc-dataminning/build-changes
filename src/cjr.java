import java.util.Optional;
import javax.annotation.Nullable;

public class cjr extends bui {
   private static final ako<Optional<jh>> c = aks.a(cjr.class, akq.p);
   private static final ako<Boolean> d = aks.a(cjr.class, akq.k);
   public int b;

   public cjr(bup<? extends cjr> $$0, dff $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.af.a(100000);
   }

   public cjr(dff $$0, double $$1, double $$2, double $$3) {
      this(bup.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   protected void a(aks.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aM();
      this.bY();
      if (this.dY() instanceof arq) {
         jh $$0 = this.dy();
         if (((arq)this.dY()).D() != null && this.dY().a_($$0).l()) {
            this.dY().b($$0, dhw.a(this.dY(), $$0));
         }
      }
   }

   @Override
   protected void b(un $$0) {
      if (this.m() != null) {
         $$0.a("beam_target", vc.a(this.m()));
      }

      $$0.a("ShowBottom", this.o());
   }

   @Override
   protected void a(un $$0) {
      vc.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cjs) {
         return false;
      } else {
         if (!this.dT() && !this.dY().C) {
            this.a(bui.c.a);
            if (!$$0.a(axf.l)) {
               bsy $$2 = $$0.d() != null ? this.dZ().d(this, $$0.d()) : null;
               this.dY().a(this, $$2, null, this.dD(), this.dF(), this.dJ(), 6.0F, false, dff.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void au() {
      this.a(this.dZ().p());
      super.au();
   }

   private void a(bsy $$0) {
      if (this.dY() instanceof arq) {
         dzm $$1 = ((arq)this.dY()).D();
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
   public cwf dL() {
      return new cwf(cwj.vx);
   }
}
