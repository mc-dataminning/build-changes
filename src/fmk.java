import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fmk extends cbn {
   @Nullable
   private fiq ck;
   protected ehe b;
   public float c;
   public float d;
   public float e;
   public final fii f;

   public fmk(fii $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehe.b;
      this.f = $$0;
   }

   @Override
   public boolean G_() {
      fiq $$0 = this.a();
      return $$0 != null && $$0.e() == cpj.d;
   }

   @Override
   public boolean f() {
      fiq $$0 = this.a();
      return $$0 != null && $$0.e() == cpj.b;
   }

   @Nullable
   protected fiq a() {
      if (this.ck == null) {
         this.ck = eqm.O().J().a(this.cv());
      }

      return this.ck;
   }

   @Override
   public void l() {
      this.b = this.dn();
      super.l();
   }

   public ehe C(float $$0) {
      return this.b.a(this.dn(), (double)$$0);
   }

   public fzl b() {
      fiq $$0 = this.a();
      return $$0 == null ? fzd.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fR().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bkf.d) / this.fR().b() + 1.0F) / 2.0F;
      if (this.fR().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      ciy $$1 = this.fn();
      if (this.fl()) {
         if ($$1.a(cjb.nG)) {
            int $$2 = this.fp();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqm.O().m.au().a() && this.go()) {
            return 0.1F;
         }
      }

      return arp.i(eqm.O().m.af().c().floatValue(), 1.0F, $$0);
   }
}
