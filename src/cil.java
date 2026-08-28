import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cil extends bsh {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected ja b;

   protected cil(bsn<? extends cil> $$0, dcg $$1) {
      super($$0, $$1);
   }

   protected cil(bsn<? extends cil> $$0, dcg $$1, ja $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void p();

   @Override
   public void l() {
      if (!this.dR().B) {
         this.ax();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dM() && !this.s()) {
               this.aq();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean s();

   @Override
   public boolean bB() {
      return true;
   }

   @Override
   public boolean u(bsh $$0) {
      if ($$0 instanceof cml $$1) {
         return !this.dR().a($$1, this.b) ? true : this.a(this.dS().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(bra $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dM() && !this.dR().B) {
            this.ap();
            this.bx();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(bth $$0, ewh $$1) {
      if (!this.dR().B && !this.dM() && $$1.g() > 0.0) {
         this.ap();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dR().B && !this.dM() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.ap();
         this.b(null);
      }
   }

   @Override
   public void b(tx $$0) {
      ja $$1 = this.t();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tx $$0) {
      ja $$1 = new ja($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dr(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable bsh var1);

   @Override
   protected boolean bD() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = ja.a($$0, $$1, $$2);
      this.p();
      this.av = true;
   }

   public ja t() {
      return this.b;
   }

   @Override
   public void a(aqm $$0, btb $$1) {
   }

   @Override
   public void i_() {
   }
}
