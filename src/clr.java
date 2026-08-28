import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clr extends bvk {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected jh a;

   protected clr(bvr<? extends clr> $$0, dhi $$1) {
      super($$0, $$1);
   }

   protected clr(bvr<? extends clr> $$0, dhi $$1, jh $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void l();

   @Override
   public void h() {
      if (this.dW() instanceof ash $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dR() && !this.m()) {
               this.at();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean m();

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public boolean v(bvk $$0) {
      if ($$0 instanceof cpx $$1) {
         return !this.dW().a($$1, this.a) ? true : this.b(this.dX().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bua $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(ash $$0, bua $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.N().b(dhe.c) && $$1.d() instanceof bwi) {
         return false;
      } else {
         if (!this.dR()) {
            this.c($$0);
            this.bD();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dha $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bwk $$0, fby $$1) {
      if (this.dW() instanceof ash $$2 && !this.dR() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dW() instanceof ash $$3 && !this.dR() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(ux $$0) {
      jh $$1 = this.p();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ux $$0) {
      jh $$1 = new jh($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dw(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(ash var1, @Nullable bvk var2);

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = jh.a($$0, $$1, $$2);
      this.l();
      this.ar = true;
   }

   public jh p() {
      return this.a;
   }

   @Override
   public void a(ash $$0, bwf $$1) {
   }

   @Override
   public void m_() {
   }
}
