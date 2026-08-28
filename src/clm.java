import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class clm extends bva {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected ji a;

   protected clm(bvi<? extends clm> $$0, dgz $$1) {
      super($$0, $$1);
   }

   protected clm(bvi<? extends clm> $$0, dgz $$1, ji $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dU() instanceof ard $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dP() && !this.g()) {
               this.at();
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
   public boolean v(bva $$0) {
      if ($$0 instanceof cpr $$1) {
         return !this.dU().a($$1, this.a) ? true : this.b(this.dV().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(btp $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(ard $$0, btp $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dgv.c) && $$1.d() instanceof bwa) {
         return false;
      } else {
         if (!this.dP()) {
            this.c($$0);
            this.bB();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dgs $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bwc $$0, fbx $$1) {
      if (this.dU() instanceof ard $$2 && !this.dP() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dU() instanceof ard $$3 && !this.dP() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tq $$0) {
      ji $$1 = this.j();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tq $$0) {
      ji $$1 = new ji($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.du(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(ard var1, @Nullable bva var2);

   @Override
   protected boolean bH() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = ji.a($$0, $$1, $$2);
      this.f();
      this.ar = true;
   }

   public ji j() {
      return this.a;
   }

   @Override
   public void a(ard $$0, bvx $$1) {
   }

   @Override
   public void i_() {
   }
}
