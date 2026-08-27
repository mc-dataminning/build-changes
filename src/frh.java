import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class frh extends cer {
   @Nullable
   private fnc cm;
   protected elb b;
   public float c;
   public float d;
   public float e;
   public final fmt f;

   public frh(fmt $$0, GameProfile $$1) {
      super($$0, $$0.S(), $$0.T(), $$1);
      this.b = elb.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fnc $$0 = this.a();
      return $$0 != null && $$0.e() == csv.d;
   }

   @Override
   public boolean f() {
      fnc $$0 = this.a();
      return $$0 != null && $$0.e() == csv.b;
   }

   @Nullable
   protected fnc a() {
      if (this.cm == null) {
         this.cm = euk.N().I().a(this.cw());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public elb C(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public geo b() {
      fnc $$0 = this.a();
      return $$0 == null ? geg.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bnb.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cmh $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cmk.or)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (euk.N().m.ax().a() && this.gq()) {
            return 0.1F;
         }
      }

      return aty.i(euk.N().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
