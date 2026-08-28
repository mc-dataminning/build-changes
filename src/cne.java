import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cne extends bwi {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iv a;

   protected cne(bwr<? extends cne> $$0, djh $$1) {
      super($$0, $$1);
   }

   protected cne(bwr<? extends cne> $$0, djh $$1, iv $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dU() instanceof arq $$0) {
         this.ax();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dP() && !this.g()) {
               this.aq();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean g();

   @Override
   public boolean bE() {
      return true;
   }

   @Override
   public boolean v(bwi $$0) {
      if ($$0 instanceof crj $$1) {
         return !this.dU().a($$1, this.a) ? true : this.b(this.dV().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bux $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(arq $$0, bux $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(djd.d) && $$1.d() instanceof bxl) {
         return false;
      } else {
         if (!this.dP()) {
            this.c($$0);
            this.bA();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dja $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bxn $$0, fex $$1) {
      if (this.dU() instanceof arq $$2 && !this.dP() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof arq $$3 && !this.dP() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
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
      if ($$1 != null && $$1.a(this.du(), 16.0)) {
         this.a = $$1;
      } else {
         b.error("Block-attached entity at invalid position: {}", $$1);
      }
   }

   public abstract void a(arq var1, @Nullable bwi var2);

   @Override
   protected boolean bG() {
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
   public void a(arq $$0, bxi $$1) {
   }

   @Override
   public void i_() {
   }
}
