import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmx extends bwf {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iu a;

   protected cmx(bwo<? extends cmx> $$0, dja $$1) {
      super($$0, $$1);
   }

   protected cmx(bwo<? extends cmx> $$0, dja $$1, iu $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dV() instanceof arq $$0) {
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
   public boolean v(bwf $$0) {
      if ($$0 instanceof crc $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(buu $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(arq $$0, buu $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(diw.d) && $$1.d() instanceof bxg) {
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
   public boolean a(dit $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bxi $$0, feq $$1) {
      if (this.dV() instanceof arq $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void i(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arq $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tz $$0) {
      iu $$1 = this.j();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tz $$0) {
      iu $$1 = new iu($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dv(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(arq var1, @Nullable bwf var2);

   @Override
   protected boolean bI() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = iu.a($$0, $$1, $$2);
      this.f();
      this.ar = true;
   }

   public iu j() {
      return this.a;
   }

   @Override
   public void a(arq $$0, bxd $$1) {
   }

   @Override
   public void i_() {
   }
}
