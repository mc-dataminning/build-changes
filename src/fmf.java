import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fmf extends cbl {
   @Nullable
   private fil ck;
   protected ehf b;
   public float c;
   public float d;
   public float e;
   public final fie f;

   public fmf(fie $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehf.b;
      this.f = $$0;
   }

   @Override
   public boolean G_() {
      fil $$0 = this.a();
      return $$0 != null && $$0.e() == cph.d;
   }

   @Override
   public boolean f() {
      fil $$0 = this.a();
      return $$0 != null && $$0.e() == cph.b;
   }

   @Nullable
   protected fil a() {
      if (this.ck == null) {
         this.ck = eqn.N().I().a(this.cv());
      }

      return this.ck;
   }

   @Override
   public void l() {
      this.b = this.dn();
      super.l();
   }

   public ehf C(float $$0) {
      return this.b.a(this.dn(), (double)$$0);
   }

   public fzg b() {
      fil $$0 = this.a();
      return $$0 == null ? fyy.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fR().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bkd.d) / this.fR().b() + 1.0F) / 2.0F;
      if (this.fR().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      ciw $$1 = this.fn();
      if (this.fl()) {
         if ($$1.a(ciz.nG)) {
            int $$2 = this.fp();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqn.N().m.au().a() && this.go()) {
            return 0.1F;
         }
      }

      return aro.i(eqn.N().m.af().c().floatValue(), 1.0F, $$0);
   }
}
