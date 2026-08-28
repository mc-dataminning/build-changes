import java.util.Optional;
import javax.annotation.Nullable;

public class chj extends bsd {
   private static final ajp<Optional<ja>> c = ajt.a(chj.class, ajr.p);
   private static final ajp<Boolean> d = ajt.a(chj.class, ajr.k);
   public int b;

   public chj(bsj<? extends chj> $$0, dcd $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chj(dcd $$0, double $$1, double $$2, double $$3) {
      this(bsj.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected bsd.b bb() {
      return bsd.b.a;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dP() instanceof aqk) {
         ja $$0 = this.dp();
         if (((aqk)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, des.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(tx $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", um.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(tx $$0) {
      um.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof chk) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(bsd.c.a);
            if (!$$0.a(avw.m)) {
               bqw $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, dcd.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void an() {
      this.a(this.dQ().o());
      super.an();
   }

   private void a(bqw $$0) {
      if (this.dP() instanceof aqk) {
         dwc $$1 = ((aqk)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable ja $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public ja p() {
      return this.ap().a(c).orElse(null);
   }

   public void a(boolean $$0) {
      this.ap().a(d, $$0);
   }

   public boolean s() {
      return this.ap().a(d);
   }

   @Override
   public boolean a(double $$0) {
      return super.a($$0) || this.p() != null;
   }

   @Override
   public cua dC() {
      return new cua(cud.vf);
   }
}
