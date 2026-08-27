import java.util.Optional;
import javax.annotation.Nullable;

public class chb extends brw {
   private static final ajs<Optional<io>> c = ajw.a(chb.class, aju.p);
   private static final ajs<Boolean> d = ajw.a(chb.class, aju.k);
   public int b;

   public chb(bsc<? extends chb> $$0, daz $$1) {
      super($$0, $$1);
      this.J = true;
      this.b = this.ah.a(100000);
   }

   public chb(daz $$0, double $$1, double $$2, double $$3) {
      this(bsc.E, $$0);
      this.a_($$1, $$2, $$3);
   }

   @Override
   protected brw.b bb() {
      return brw.b.a;
   }

   @Override
   protected void a(ajw.a $$0) {
      $$0.a(c, Optional.empty());
      $$0.a(d, true);
   }

   @Override
   public void l() {
      this.b++;
      if (this.dP() instanceof aqn) {
         io $$0 = this.dp();
         if (((aqn)this.dP()).D() != null && this.dP().a_($$0).i()) {
            this.dP().b($$0, ddn.a(this.dP(), $$0));
         }
      }
   }

   @Override
   protected void b(ud $$0) {
      if (this.p() != null) {
         $$0.a("beam_target", us.a(this.p()));
      }

      $$0.a("ShowBottom", this.s());
   }

   @Override
   protected void a(ud $$0) {
      us.a($$0, "beam_target").ifPresent(this::a);
      if ($$0.b("ShowBottom", 1)) {
         this.a($$0.q("ShowBottom"));
      }
   }

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean a(bqp $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if ($$0.d() instanceof chc) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.a(brw.c.a);
            if (!$$0.a(avz.m)) {
               bqp $$2 = $$0.d() != null ? this.dQ().d(this, $$0.d()) : null;
               this.dP().a(this, $$2, null, this.du(), this.dw(), this.dA(), 6.0F, false, daz.a.b);
            }

            this.a($$0);
         }

         return true;
      }
   }

   @Override
   public void an() {
      this.a(this.dQ().n());
      super.an();
   }

   private void a(bqp $$0) {
      if (this.dP() instanceof aqn) {
         duy $$1 = ((aqn)this.dP()).D();
         if ($$1 != null) {
            $$1.a(this, $$0);
         }
      }
   }

   public void a(@Nullable io $$0) {
      this.ap().a(c, Optional.ofNullable($$0));
   }

   @Nullable
   public io p() {
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
   public ctq dC() {
      return new ctq(ctt.vf);
   }
}
