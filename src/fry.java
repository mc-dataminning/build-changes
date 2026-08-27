import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fry extends cfb {
   @Nullable
   private fnt cm;
   protected elm b;
   public float c;
   public float d;
   public float e;
   public final fnk f;

   public fry(fnk $$0, GameProfile $$1) {
      super($$0, $$0.T(), $$0.U(), $$1);
      this.b = elm.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      fnt $$0 = this.a();
      return $$0 != null && $$0.e() == ctf.d;
   }

   @Override
   public boolean f() {
      fnt $$0 = this.a();
      return $$0 != null && $$0.e() == ctf.b;
   }

   @Nullable
   protected fnt a() {
      if (this.cm == null) {
         this.cm = eva.N().I().a(this.cw());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.dp();
      super.l();
   }

   public elm C(float $$0) {
      return this.b.a(this.dp(), (double)$$0);
   }

   public gff b() {
      fnt $$0 = this.a();
      return $$0 == null ? gex.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fT().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bnl.m) / this.fT().b() + 1.0F) / 2.0F;
      if (this.fT().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cmr $$1 = this.fp();
      if (this.fn()) {
         if ($$1.a(cmu.or)) {
            int $$2 = this.fr();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eva.N().m.ax().a() && this.gq()) {
            return 0.1F;
         }
      }

      return aui.i(eva.N().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
