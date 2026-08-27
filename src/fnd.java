import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fnd extends cbu {
   @Nullable
   private fjf cm;
   protected ehn b;
   public float c;
   public float d;
   public float e;
   public final fix f;

   public fnd(fix $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehn.b;
      this.f = $$0;
   }

   @Override
   public boolean M_() {
      fjf $$0 = this.a();
      return $$0 != null && $$0.e() == cps.d;
   }

   @Override
   public boolean f() {
      fjf $$0 = this.a();
      return $$0 != null && $$0.e() == cps.b;
   }

   @Nullable
   protected fjf a() {
      if (this.cm == null) {
         this.cm = eqv.O().J().a(this.cv());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public ehn C(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gae b() {
      fjf $$0 = this.a();
      return $$0 == null ? fzw.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fS().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bkm.d) / this.fS().b() + 1.0F) / 2.0F;
      if (this.fS().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cjf $$1 = this.fo();
      if (this.fm()) {
         if ($$1.a(cji.nG)) {
            int $$2 = this.fq();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqv.O().m.aw().a() && this.gp()) {
            return 0.1F;
         }
      }

      return arw.i(eqv.O().m.ag().c().floatValue(), 1.0F, $$0);
   }
}
