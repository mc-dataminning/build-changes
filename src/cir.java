import java.util.Optional;
import javax.annotation.Nullable;

public class cir extends btj {
   private static final akg<Optional<je>> c = akk.a(cir.class, aki.p);
   private static final akg<Boolean> d = akk.a(cir.class, aki.k);
   public int b;

   public cir(btq<? extends cir> $$0, dds $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.af.a(100000);
   }

   public cir(dds $$0, double $$1, double $$2, double $$3) {
      this(btq.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected btj.b bf() {
      return btj.b.a;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aW();
      this.bT();
      if (this.dS() instanceof arg) {
         je $$0 = this.ds();
         if (((arg)this.dS()).D() != null && this.dS().a_($$0).l()) {
            this.dS().b($$0, dgi.a(this.dS(), $$0));
         }
      }
   }

   @Override
   protected void b(uf $$0) {
      if (this.m() != null) {
         $$0.a("beam_target", uu.a(this.m()));
      }

      $$0.a("ShowBottom", this.o());
   }

   @Override
   protected void a(uf $$0) {
      uu.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cis) {
         return false;
      } else {
         if (!this.dN() && !this.dS().B) {
            this.a(btj.c.a);
            if (!$$0.a(awu.l)) {
               bsb $$2 = $$0.d() != null ? this.dT().d(this, $$0.d()) : null;
               this.dS().a(this, $$2, null, this.dx(), this.dz(), this.dD(), 6.0F, false, dds.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ar() {
      this.a(this.dT().p());
      super.ar();
   }

   private void a(bsb $$0) {
      if (this.dS() instanceof arg) {
         dxz $$1 = ((arg)this.dS()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable je $$0) {
      this.at().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public je m() {
      return this.at().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.at().a(d, $$0);
   }

   public boolean o() {
      return this.at().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.m() != null;
   }

   @Override
   public cvl dF() {
      return new cvl(cvo.vh);
   }
}
