import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fsg extends cfi {
   @Nullable
   private fob cm;
   protected elt b;
   public float c;
   public float d;
   public float e;
   public final fns f;

   public fsg(fns $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = elt.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fob $$0 = this.a();
      return $$0 != null && $$0.e() == ctm.d;
   }

   @Override
   public boolean f() {
      fob $$0 = this.a();
      return $$0 != null && $$0.e() == ctm.b;
   }

   @Nullable
   protected fob a() {
      if (this.cm == null) {
         this.cm = evi.O().J().a(this.cw());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public elt C(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gfm b() {
      fob $$0 = this.a();
      return $$0 == null ? gff.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bnr.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cmy $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cnb.or)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (evi.O().m.ax().a() && this.gq()) {
            return 0.1F;
         }
      }

      return auo.i(evi.O().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
