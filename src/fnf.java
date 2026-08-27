import com.mojang.authlib.GameProfile;
import javax.annotation.Nullable;

public abstract class fnf extends cbw {
   @Nullable
   private fjh cm;
   protected ehp b;
   public float c;
   public float d;
   public float e;
   public final fiz f;

   public fnf(fiz $$0, GameProfile $$1) {
      super($$0, $$0.R(), $$0.S(), $$1);
      this.b = ehp.b;
      this.f = $$0;
   }

   @Override
   public boolean M_() {
      fjh $$0 = this.a();
      return $$0 != null && $$0.e() == cpu.d;
   }

   @Override
   public boolean f() {
      fjh $$0 = this.a();
      return $$0 != null && $$0.e() == cpu.b;
   }

   @Nullable
   protected fjh a() {
      if (this.cm == null) {
         this.cm = eqx.O().J().a(this.cv());
      }

      return this.cm;
   }

   @Override
   public void l() {
      this.b = this.do();
      super.l();
   }

   public ehp C(float $$0) {
      return this.b.a(this.do(), (double)$$0);
   }

   public gag b() {
      fjh $$0 = this.a();
      return $$0 == null ? fzy.a(this.cv()) : $$0.g();
   }

   public float c() {
      float $$0 = 1.0F;
      if (this.fS().b) {
         $$0 *= 1.1F;
      }

      $$0 *= ((float)this.b(bko.d) / this.fS().b() + 1.0F) / 2.0F;
      if (this.fS().b() == 0.0F || Float.isNaN($$0) || Float.isInfinite($$0)) {
         $$0 = 1.0F;
      }

      cjh $$1 = this.fo();
      if (this.fm()) {
         if ($$1.a(cjk.nG)) {
            int $$2 = this.fq();
            float $$3 = (float)$$2 / 20.0F;
            if ($$3 > 1.0F) {
               $$3 = 1.0F;
            } else {
               $$3 *= $$3;
            }

            $$0 *= 1.0F - $$3 * 0.15F;
         } else if (eqx.O().m.aw().a() && this.gp()) {
            return 0.1F;
         }
      }

      return ary.i(eqx.O().m.ag().c().floatValue(), 1.0F, $$0);
   }
}
