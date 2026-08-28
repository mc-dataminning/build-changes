import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cnu extends bwv {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iw a;

   protected cnu(bxe<? extends cnu> $$0, djz $$1) {
      super($$0, $$1);
   }

   protected cnu(bxe<? extends cnu> $$0, djz $$1, iw $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dV() instanceof aru $$0) {
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
   public boolean v(bwv $$0) {
      if ($$0 instanceof crz $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bvk $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(aru $$0, bvk $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(djv.d) && $$1.d() instanceof bxy) {
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
   public boolean a(djs $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bya $$0, ffs $$1) {
      if (this.dV() instanceof aru $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof aru $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(ua $$0) {
      $$0.a("block_pos", iw.a, this.j());
   }

   @Override
   public void a(ua $$0) {
      iw $$1 = $$0.<iw>a("block_pos", iw.a).orElse(null);
      if ($$1 != null && $$1.a(this.dv(), 16.0)) {
         this.a = $$1;
      } else {
         b.error("Block-attached entity at invalid position: {}", $$1);
      }
   }

   public abstract void a(aru var1, @Nullable bwv var2);

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = iw.a($$0, $$1, $$2);
      this.f();
      this.ar = true;
   }

   public iw j() {
      return this.a;
   }

   @Override
   public void a(aru $$0, bxv $$1) {
   }

   @Override
   public void i_() {
   }
}
