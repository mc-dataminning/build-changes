import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fpg extends cdm {
   @Nullable
   private flf cm;
   protected eji b;
   public float c;
   public float d;
   public float e;
   public final fkw f;

   public fpg(fkw $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = eji.b;
      this.f = $$0;
   }

   @Override
   public boolean N_() {
      flf $$0 = this.a();
      return $$0 != null && $$0.e() == crp.d;
   }

   @Override
   public boolean f() {
      flf $$0 = this.a();
      return $$0 != null && $$0.e() == crp.b;
   }

   @Nullable
   protected flf a() {
      if (this.cm == null) {
         this.cm = esr.N().I().a(this.cv());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public eji C(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gch b() {
      flf $$0 = this.a();
      return $$0 == null ? gbz.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bme.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      clb $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cle.nG)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (esr.N().m.ax().a() && this.gq()) {
            return 0.1F;
         }
      }

      return ati.i(esr.N().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
