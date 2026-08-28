import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cjp extends btj {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected je b;

   protected cjp(btq<? extends cjp> $$0, dds $$1) {
      super($$0, $$1);
   }

   protected cjp(btq<? extends cjp> $$0, dds $$1, je $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void m();

   @Override
   public void l() {
      if (!this.dS().B) {
         this.az();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dN() && !this.o()) {
               this.as();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean o();

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean v(btj $$0) {
      if ($$0 instanceof cnp $$1) {
         return !this.dS().a($$1, this.b) ? true : this.a(this.dT().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(bsb $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dS().ac().b(ddo.c) && $$0.d() instanceof buh) {
         return false;
      } else {
         if (!this.dN() && !this.dS().B) {
            this.ar();
            this.bA();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(ddk $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void a(buj $$0, eye $$1) {
      if (!this.dS().B && !this.dN() && $$1.h() > 0.0) {
         this.ar();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dS().B && !this.dN() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.ar();
         this.b(null);
      }
   }

   @Override
   public void b(uf $$0) {
      je $$1 = this.q();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(uf $$0) {
      je $$1 = new je($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.ds(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable btj var1);

   @Override
   protected boolean bG() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = je.a($$0, $$1, $$2);
      this.m();
      this.as = true;
   }

   public je q() {
      return this.b;
   }

   @Override
   public void a(arg $$0, bue $$1) {
   }

   @Override
   public void i_() {
   }
}
