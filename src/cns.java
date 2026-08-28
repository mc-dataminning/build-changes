import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cns extends bwt {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iv a;

   protected cns(bxc<? extends cns> $$0, djx $$1) {
      super($$0, $$1);
   }

   protected cns(bxc<? extends cns> $$0, djx $$1, iv $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dV() instanceof ars $$0) {
         this.ax();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dQ() && !this.g()) {
               this.aq();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean g();

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean v(bwt $$0) {
      if ($$0 instanceof crx $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bvi $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(ars $$0, bvi $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(djt.d) && $$1.d() instanceof bxw) {
         return false;
      } else {
         if (!this.dQ()) {
            this.c($$0);
            this.bB();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(djq $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bxy $$0, ffq $$1) {
      if (this.dV() instanceof ars $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof ars $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tz $$0) {
      $$0.a("block_pos", iv.a, this.j());
   }

   @Override
   public void a(tz $$0) {
      iv $$1 = $$0.<iv>a("block_pos", iv.a).orElse(null);
      if ($$1 != null && $$1.a(this.dv(), 16.0)) {
         this.a = $$1;
      } else {
         b.error("Block-attached entity at invalid position: {}", $$1);
      }
   }

   public abstract void a(ars var1, @Nullable bwt var2);

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = iv.a($$0, $$1, $$2);
      this.f();
      this.ar = true;
   }

   public iv j() {
      return this.a;
   }

   @Override
   public void a(ars $$0, bxt $$1) {
   }

   @Override
   public void i_() {
   }
}
