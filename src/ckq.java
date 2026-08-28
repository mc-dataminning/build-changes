import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ckq extends buj {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected ji a;

   protected ckq(buq<? extends ckq> $$0, dgg $$1) {
      super($$0, $$1);
   }

   protected ckq(buq<? extends ckq> $$0, dgg $$1, ji $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void l();

   @Override
   public void h() {
      if (this.dW() instanceof arc $$0) {
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
   public boolean v(buj $$0) {
      if ($$0 instanceof cov $$1) {
         return !this.dW().a($$1, this.a) ? true : this.b(this.dX().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bsz $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(arc $$0, bsz $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().b(dgc.c) && $$1.d() instanceof bvh) {
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
   public boolean a(dfy $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bvj $$0, fay $$1) {
      if (this.dW() instanceof arc $$2 && !this.dR() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dW() instanceof arc $$3 && !this.dR() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
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
      if (!$$1.a(this.dw(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(arc var1, @Nullable buj var2);

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
   public void a(arc $$0, bve $$1) {
   }

   @Override
   public void m_() {
   }
}
