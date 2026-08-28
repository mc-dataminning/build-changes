import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cih extends bsd {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected ja b;

   protected cih(bsj<? extends cih> $$0, dcd $$1) {
      super($$0, $$1);
   }

   protected cih(bsj<? extends cih> $$0, dcd $$1, ja $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void p();

   @Override
   public void l() {
      if (!this.dP().B) {
         this.av();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dK() && !this.s()) {
               this.ao();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean s();

   @Override
   public boolean bz() {
      return true;
   }

   @Override
   public boolean u(bsd $$0) {
      if ($$0 instanceof cmh $$1) {
         return !this.dP().a($$1, this.b) ? true : this.a(this.dQ().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(bqw $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else {
         if (!this.dK() && !this.dP().B) {
            this.an();
            this.bv();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public void a(btd $$0, evz $$1) {
      if (!this.dP().B && !this.dK() && $$1.g() > 0.0) {
         this.an();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dP().B && !this.dK() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.an();
         this.b(null);
      }
   }

   @Override
   public void b(tx $$0) {
      ja $$1 = this.u();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(tx $$0) {
      ja $$1 = new ja($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dp(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable bsd var1);

   @Override
   protected boolean bB() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = ja.a($$0, $$1, $$2);
      this.p();
      this.av = true;
   }

   public ja u() {
      return this.b;
   }

   @Override
   public void a(aqk $$0, bsx $$1) {
   }

   @Override
   public void j_() {
   }
}
