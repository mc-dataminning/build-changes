import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class cks extends bul {
   private static final Logger b = LogUtils.getLogger();
   private int c;
   protected jh a;

   protected cks(bus<? extends cks> $$0, dfm $$1) {
      super($$0, $$1);
   }

   protected cks(bus<? extends cks> $$0, dfm $$1, jh $$2) {
      this($$0, $$1);
      this.a = $$2;
   }

   protected abstract void j();

   @Override
   public void h() {
      if (this.dV() instanceof arp $$0) {
         this.aA();
         if (this.c++ == 100) {
            this.c = 0;
            if (!this.dQ() && !this.l()) {
               this.at();
               this.a($$0, null);
            }
         }
      }
   }

   public abstract boolean l();

   @Override
   public boolean bH() {
      return true;
   }

   @Override
   public boolean v(bul $$0) {
      if ($$0 instanceof cou $$1) {
         return !this.dV().a($$1, this.a) ? true : this.b(this.dW().a($$1), 0.0F);
      } else {
         return false;
      }
   }

   @Override
   public boolean b(btb $$0) {
      return !this.d($$0);
   }

   @Override
   public boolean a(arp $$0, btb $$1, float $$2) {
      if (this.d($$1)) {
         return false;
      } else if (!$$0.N().b(dfi.c) && $$1.d() instanceof bvj) {
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
   public boolean a(dfe $$0) {
      return $$0.h() ? super.a($$0) : true;
   }

   @Override
   public void a(bvl $$0, ezy $$1) {
      if (this.dV() instanceof arp $$2 && !this.dQ() && $$1.h() > 0.0) {
         this.c($$2);
         this.a($$2, null);
      }
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.dV() instanceof arp $$3 && !this.dQ() && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 > 0.0) {
         this.c($$3);
         this.a($$3, null);
      }
   }

   @Override
   public void b(ul $$0) {
      jh $$1 = this.n();
      $$0.a("TileX", $$1.u());
      $$0.a("TileY", $$1.v());
      $$0.a("TileZ", $$1.w());
   }

   @Override
   public void a(ul $$0) {
      jh $$1 = new jh($$0.h("TileX"), $$0.h("TileY"), $$0.h("TileZ"));
      if (!$$1.a(this.dv(), 16.0)) {
         b.error("Block-attached entity at invalid position: {}", $$1);
      } else {
         this.a = $$1;
      }
   }

   public abstract void a(arp var1, @Nullable bul var2);

   @Override
   protected boolean bJ() {
      return false;
   }

   @Override
   public void a_(double $$0, double $$1, double $$2) {
      this.a = jh.a($$0, $$1, $$2);
      this.j();
      this.ar = true;
   }

   public jh n() {
      return this.a;
   }

   @Override
   public void a(arp $$0, bvg $$1) {
   }

   @Override
   public void l_() {
   }
}
