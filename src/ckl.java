import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ckl extends bue {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected jh b;

   protected ckl(bul<? extends ckl> $$0, dfb $$1) {
      super($$0, $$1);
   }

   protected ckl(bul<? extends ckl> $$0, dfb $$1, jh $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void m();

   @Override
   public void l() {
      if (!this.dX().C) {
         this.aC();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dS() && !this.o()) {
               this.av();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean o();

   @Override
   public boolean bI() {
      return true;
   }

   @Override
   public boolean v(bue $$0) {
      if ($$0 instanceof com $$1) {
         return !this.dX().a($$1, this.b) ? true : this.a(this.dY().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(bsu $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dX().ac().b(dex.c) && $$0.d() instanceof bvc) {
         return false;
      } else {
         if (!this.dS() && !this.dX().C) {
            this.au();
            this.bE();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(det $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void a(bve $$0, ezn $$1) {
      if (!this.dX().C && !this.dS() && $$1.h() > 0.0) {
         this.au();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dX().C && !this.dS() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.au();
         this.b(null);
      }
   }

   @Override
   public void b(uk $$0) {
      jh $$1 = this.q();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(uk $$0) {
      jh $$1 = new jh($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dx(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable bue var1);

   @Override
   protected boolean bK() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = jh.a($$0, $$1, $$2);
      this.m();
      this.as = true;
   }

   public jh q() {
      return this.b;
   }

   @Override
   public void a(arn $$0, buz $$1) {
   }

   @Override
   public void j_() {
   }
}
