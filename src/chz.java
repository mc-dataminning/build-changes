import java.util.Optional;
import javax.annotation.Nullable;

public class chz extends bsr {
   private static final ajw<Optional<jd>> c = aka.a(chz.class, ajy.p);
   private static final ajw<Boolean> d = aka.a(chz.class, ajy.k);
   public int b;

   public chz(bsx<? extends chz> $$0, dcw $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chz(dcw $$0, double $$1, double $$2, double $$3) {
      this(bsx.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsr.b bc() {
      return bsr.b.a;
   }

   @Override
   protected void a(aka.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      this.aT();
      this.bP();
      if (this.dP() instanceof aqu) {
         jd $$0 = this.dp();
         if (((aqu)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, dfl.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(ub $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", uq.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ub $$0) {
      uq.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof cia) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(bsr.c.a);
            if (!$$0.a(awg.l)) {
               brk $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, dcw.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void ap() {
      this.a(this.dQ().o());
      super.ap();
   }

   private void a(brk $$0) {
      if (this.dP() instanceof aqu) {
         dxb $$1 = ((aqu)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable jd $$0) {
      this.ar().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public jd p() {
      return this.ar().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ar().a(d, $$0);
   }

   public boolean s() {
      return this.ar().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cuq dC() {
      return new cuq(cut.vf);
   }
}
