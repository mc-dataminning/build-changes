import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ckt extends bum {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected ji a;

   protected ckt(but<? extends ckt> $$0, dgj $$1) {
      super($$0, $$1);
   }

   protected ckt(but<? extends ckt> $$0, dgj $$1, ji $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void l();

   @Override
   public void h() {
      if (this.dV() instanceof ard $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dQ() && !this.m()) {
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
   public boolean v(bum $$0) {
      if ($$0 instanceof coy $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(btc $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(ard $$0, btc $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dgf.c) && $$1.d() instanceof bvk) {
         return false;
      } else {
         if (!this.dQ()) {
            this.c($$0);
            this.bD();
            this.a($$0, $$1.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dgb $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bvm $$0, fbb $$1) {
      if (this.dV() instanceof ard $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof ard $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tq $$0) {
      ji $$1 = this.p();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tq $$0) {
      ji $$1 = new ji($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dv(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(ard var1, @Nullable bum var2);

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = ji.a($$0, $$1, $$2);
      this.l();
      this.ar = true;
   }

   public ji p() {
      return this.a;
   }

   @Override
   public void a(ard $$0, bvh $$1) {
   }

   @Override
   public void m_() {
   }
}
