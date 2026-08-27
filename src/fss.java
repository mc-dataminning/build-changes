import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fss extends cfq {
   @Nullable
   private fon cq;
   protected emc b;
   public float c;
   public float d;
   public float e;
   public final foe f;

   public fss(foe $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = emc.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fon $$0 = this.a();
      return $$0 != null && $$0.e() == ctu.d;
   }

   @Override
   public boolean f() {
      fon $$0 = this.a();
      return $$0 != null && $$0.e() == ctu.b;
   }

   @Nullable
   protected fon a() {
      if (this.cq == null) {
         this.cq = evr.O().J().a(this.cw());
      }

      return this.cq;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public emc B(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gga b() {
      fon $$0 = this.a();
      return $$0 == null ? gft.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.g(bnu.o) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cng $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cnj.ot)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (evr.O().m.ax().a() && this.gq()) {
            return 0.1F;
         }
      }

      return aup.i(evr.O().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
