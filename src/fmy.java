import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fmy extends cbp {
   @Nullable
   private fja ck;
   protected ehi b;
   public float c;
   public float d;
   public float e;
   public final fis f;

   public fmy(fis $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehi.b;
      this.f = $$0;
   }

   @Override
   public boolean G_() {
      fja $$0 = this.a();
      return $$0 != null && $$0.e() == cpn.d;
   }

   @Override
   public boolean f() {
      fja $$0 = this.a();
      return $$0 != null && $$0.e() == cpn.b;
   }

   @Nullable
   protected fja a() {
      if (this.ck == null) {
         this.ck = eqq.O().J().a(this.cv());
      }

      return this.ck;
   }

   @Override
   public void l() {
      this.b = this.dn();
      super.l();
   }

   public ehi C(float $$0) {
      return this.b.a(this.dn(), (double)$$0);
   }

   public fzz b() {
      fja $$0 = this.a();
      return $$0 == null ? fzr.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fR().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bkh.d) / this.fR().b() + 1.0F) / 2.0F;
      if (this.fR().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cja $$1 = this.fn();
      if (this.fl()) {
         if ($$1.a(cjd.nG)) {
            int $$2 = this.fp();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqq.O().m.av().a() && this.go()) {
            return 0.1F;
         }
      }

      return ars.i(eqq.O().m.ag().c().floatValue(), 1.0F, $$0);
   }
}
