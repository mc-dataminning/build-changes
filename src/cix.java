import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cix extends bsr {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected jd b;

   protected cix(bsx<? extends cix> $$0, dcw $$1) {
      super($$0, $$1);
   }

   protected cix(bsx<? extends cix> $$0, dcw $$1, jd $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void p();

   @Override
   public void l() {
      if (!this.dO().B) {
         this.ax();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dJ() && !this.s()) {
               this.aq();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean s();

   @Override
   public boolean bA() {
      return true;
   }

   @Override
   public boolean u(bsr $$0) {
      if ($$0 instanceof cmx $$1) {
         return !this.dO().a($$1, this.b) ? true : this.a(this.dP().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(brk $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dJ() && !this.dO().B) {
            this.ap();
            this.bw();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bts $$0, exc $$1) {
      if (!this.dO().B && !this.dJ() && $$1.g() > 0.0) {
         this.ap();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dO().B && !this.dJ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.ap();
         this.b(null);
      }
   }

   @Override
   public void b(ub $$0) {
      jd $$1 = this.t();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ub $$0) {
      jd $$1 = new jd($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.do(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable bsr var1);

   @Override
   protected boolean bC() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = jd.a($$0, $$1, $$2);
      this.p();
      this.av = true;
   }

   public jd t() {
      return this.b;
   }

   @Override
   public void a(aqu $$0, btm $$1) {
   }

   @Override
   public void i_() {
   }
}
