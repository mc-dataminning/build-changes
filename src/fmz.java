import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fmz extends cca {
   @Nullable
   private fjb cm;
   protected ehh b;
   public float c;
   public float d;
   public float e;
   public final fis f;

   public fmz(fis $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehh.b;
      this.f = $$0;
   }

   @Override
   public boolean M_() {
      fjb $$0 = this.a();
      return $$0 != null && $$0.e() == cpy.d;
   }

   @Override
   public boolean f() {
      fjb $$0 = this.a();
      return $$0 != null && $$0.e() == cpy.b;
   }

   @Nullable
   protected fjb a() {
      if (this.cm == null) {
         this.cm = eqp.O().J().a(this.cv());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public ehh C(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gaa b() {
      fjb $$0 = this.a();
      return $$0 == null ? fzs.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bks.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cjl $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cjo.nG)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqp.O().m.aw().a() && this.gq()) {
            return 0.1F;
         }
      }

      return asb.i(eqp.O().m.ag().c().floatValue(), 1.0F, $$0);
   }
}
