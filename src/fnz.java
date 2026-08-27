import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fnz extends ccx {
   @Nullable
   private fka cm;
   protected eif b;
   public float c;
   public float d;
   public float e;
   public final fjr f;

   public fnz(fjr $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = eif.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      fka $$0 = this.a();
      return $$0 != null && $$0.e() == cqw.d;
   }

   @Override
   public boolean f() {
      fka $$0 = this.a();
      return $$0 != null && $$0.e() == cqw.b;
   }

   @Nullable
   protected fka a() {
      if (this.cm == null) {
         this.cm = ero.O().J().a(this.cv());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public eif C(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gba b() {
      fka $$0 = this.a();
      return $$0 == null ? gas.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(blp.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      ckj $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(ckm.nG)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (ero.O().m.aw().a() && this.gq()) {
            return 0.1F;
         }
      }

      return asy.i(ero.O().m.ag().c().floatValue(), 1.0F, $$0);
   }
}
