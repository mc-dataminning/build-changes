import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmd extends bvs {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected jj a;

   protected cmd(bwb<? extends cmd> $$0, dhp $$1) {
      super($$0, $$1);
   }

   protected cmd(bwb<? extends cmd> $$0, dhp $$1, jj $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dV() instanceof arn $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dQ() && !this.g()) {
               this.at();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean g();

   @Override
   public boolean bG() {
      return true;
   }

   @Override
   public boolean v(bvs $$0) {
      if ($$0 instanceof cqi $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(buh $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(arn $$0, buh $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(dhl.c) && $$1.d() instanceof bwt) {
         return false;
      } else {
         if (!this.dQ()) {
            this.c($$0);
            this.bC();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dhi $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bwv $$0, fcu $$1) {
      if (this.dV() instanceof arn $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arn $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tw $$0) {
      jj $$1 = this.j();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tw $$0) {
      jj $$1 = new jj($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dv(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(arn var1, @Nullable bvs var2);

   @Override
   protected boolean bI() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = jj.a($$0, $$1, $$2);
      this.f();
      this.ar = true;
   }

   public jj j() {
      return this.a;
   }

   @Override
   public void a(arn $$0, bwq $$1) {
   }

   @Override
   public void i_() {
   }
}
