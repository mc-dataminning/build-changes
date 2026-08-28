import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cod extends bxe {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iw a;

   protected cod(bxn<? extends cod> $$0, dkj $$1) {
      super($$0, $$1);
   }

   protected cod(bxn<? extends cod> $$0, dkj $$1, iw $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void e();

   @Override
   public void g() {
      if (this.dV() instanceof asb $$0) {
         this.ax();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dQ() && !this.f()) {
               this.aq();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean f();

   @Override
   public boolean bF() {
      return true;
   }

   @Override
   public boolean v(bxe $$0) {
      if ($$0 instanceof csi $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bvt $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(asb $$0, bvt $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(dkf.d) && $$1.d() instanceof byh) {
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
   public boolean a(dkc $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(byj $$0, fgc $$1) {
      if (this.dV() instanceof asb $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof asb $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(ua $$0) {
      $$0.a("block_pos", iw.a, this.i());
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

   public abstract void a(asb var1, @Nullable bxe var2);

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = iw.a($$0, $$1, $$2);
      this.e();
      this.ar = true;
   }

   public iw i() {
      return this.a;
   }

   @Override
   public void a(asb $$0, bye $$1) {
   }

   @Override
   public void h_() {
   }
}
