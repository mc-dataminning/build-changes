import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cmn extends bwa {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected iu a;

   protected cmn(bwj<? extends cmn> $$0, dip $$1) {
      super($$0, $$1);
   }

   protected cmn(bwj<? extends cmn> $$0, dip $$1, iu $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void f();

   @Override
   public void h() {
      if (this.dV() instanceof aro $$0) {
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
   public boolean v(bwa $$0) {
      if ($$0 instanceof cqs $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(bup $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(aro $$0, bup $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.O().c(dil.c) && $$1.d() instanceof bxb) {
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
   public boolean a(dii $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bxd $$0, fdw $$1) {
      if (this.dV() instanceof aro $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof aro $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(tx $$0) {
      iu $$1 = this.j();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tx $$0) {
      iu $$1 = new iu($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dv(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(aro var1, @Nullable bwa var2);

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
   public void a(aro $$0, bwy $$1) {
   }

   @Override
   public void i_() {
   }
}
