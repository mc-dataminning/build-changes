import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fpy extends cdz {
   @Nullable
   private flx cm;
   protected ejz b;
   public float c;
   public float d;
   public float e;
   public final flo f;

   public fpy(flo $$0, GameProfile $$1) {
      super($$0, $$0.S(), $$0.T(), $$1);
      this.b = ejz.b;
      this.f = $$0;
   }

   @Override
   public boolean P_() {
      flx $$0 = this.a();
      return $$0 != null && $$0.e() == csc.d;
   }

   @Override
   public boolean f() {
      flx $$0 = this.a();
      return $$0 != null && $$0.e() == csc.b;
   }

   @Nullable
   protected flx a() {
      if (this.cm == null) {
         this.cm = eti.N().I().a(this.cw());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.dq();
      super.l();
   }

   public ejz C(float $$0) {
      return this.b.a(this.dq(), (double)$$0);
   }

   public gcz b() {
      flx $$0 = this.a();
      return $$0 == null ? gcr.a(this.cw()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fU().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bmr.m) / this.fU().b() + 1.0F) / 2.0F;
      if (this.fU().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      clo $$1 = this.fq();
      if (this.fo()) {
         if ($$1.a(clr.or)) {
            int $$2 = this.fs();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eti.N().m.ax().a() && this.gr()) {
            return 0.1F;
         }
      }

      return atq.i(eti.N().m.ah().c().floatValue(), 1.0F, $$0);
   }
}
