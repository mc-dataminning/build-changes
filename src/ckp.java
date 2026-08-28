import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ckp extends bui {
   private static final Logger c = LogUtils.getLogger();
   private int d;
   protected jh b;

   protected ckp(bup<? extends ckp> $$0, dff $$1) {
      super($$0, $$1);
   }

   protected ckp(bup<? extends ckp> $$0, dff $$1, jh $$2) {
      this($$0, $$1);
      this.b = $$2;
   }

   protected abstract void m();

   @Override
   public void l() {
      if (!this.dY().C) {
         this.aC();
         if (this.d++ == 100) {
            this.d = 0;
            if (!this.dT() && !this.o()) {
               this.av();
               this.b(null);
            }
         }
      }
   }

   public abstract boolean o();

   @Override
   public boolean bJ() {
      return true;
   }

   @Override
   public boolean v(bui $$0) {
      if ($$0 instanceof cor $$1) {
         return !this.dY().a($$1, this.b) ? true : this.a(this.dZ().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if (this.b($$0)) {
         return false;
      } else if (!this.dY().ac().b(dfb.c) && $$0.d() instanceof bvg) {
         return false;
      } else {
         if (!this.dT() && !this.dY().C) {
            this.au();
            this.bF();
            this.b($$0.d());
         }

         return true;
      }
   }

   @Override
   public boolean a(dex $$0) {
      return $$0.g() ? super.a($$0) : true;
   }

   @Override
   public void a(bvi $$0, ezr $$1) {
      if (!this.dY().C && !this.dT() && $$1.h() > 0.0) {
         this.au();
         this.b(null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (!this.dY().C && !this.dT() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.au();
         this.b(null);
      }
   }

   @Override
   public void b(un $$0) {
      jh $$1 = this.q();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(un $$0) {
      jh $$1 = new jh($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dy(), 16.0)) {
         c.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.b = $$1;
      }
   }

   public abstract void b(@Nullable bui var1);

   @Override
   protected boolean bL() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.b = jh.a($$0, $$1, $$2);
      this.m();
      this.as = true;
   }

   public jh q() {
      return this.b;
   }

   @Override
   public void a(arq $$0, bvd $$1) {
   }

   @Override
   public void j_() {
   }
}
