import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fpt extends cdu {
   @Nullable
   private fls cm;
   protected eju b;
   public float c;
   public float d;
   public float e;
   public final flj f;

   public fpt(flj $$0, GameProfile $$1) {
      super($$0, $$0.S(), $$0.T(), $$1);
      this.b = eju.b;
      this.f = $$0;
   }

   @Override
   public boolean O_() {
      fls $$0 = this.a();
      return $$0 != null && $$0.e() == crx.d;
   }

   @Override
   public boolean f() {
      fls $$0 = this.a();
      return $$0 != null && $$0.e() == crx.b;
   }

   @Nullable
   protected fls a() {
      if (this.cm == null) {
         this.cm = etd.N().I().a(this.cw());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.dq();
      super.l();
   }

   public eju C(float $$0) {
      return this.b.a(this.dq(), (double)$$0);
   }

   public gcu b() {
      fls $$0 = this.a();
      return $$0 == null ? gcm.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fU().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bmm.m) / this.fU().b() + 1.0F) / 2.0F;
      if (this.fU().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      clj $$1 = this.fq();
      if (this.fo()) {
         if ($$1.a(clm.or)) {
            int $$2 = this.fs();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (etd.N().m.ax().a() && this.gr()) {
            return 0.1F;
         }
      }

      return atm.i(etd.N().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
