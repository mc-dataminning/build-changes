import java.util.Optional;
import javax.annotation.Nullable;

public class clx extends bva implements bwx {
   private static final ajx<Integer> b = akb.a(clx.class, ajz.b);
   private static final ajx<dxq> c = akb.a(clx.class, ajz.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   public static final String a = "fuse";
   private static final String g = "explosion_power";
   private static final dgt h = new dgt() {
      @Override
      public boolean a(dgs $$0, dgf $$1, ji $$2, dxq $$3, float $$4) {
         return $$3.a(dkg.eq) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dgs $$0, dgf $$1, ji $$2, dxq $$3, etw $$4) {
         return $$3.a(dkg.eq) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bvy i;
   private boolean j;
   private float k = 4.0F;

   public clx(bvi<? extends clx> $$0, dgz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public clx(dgz $$0, double $$1, double $$2, double $$3, @Nullable bvy $$4) {
      this(bvi.bv, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.i = $$4;
   }

   @Override
   protected void a(akb.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dkg.cr.m());
   }

   @Override
   protected bva.c bg() {
      return bva.c.a;
   }

   @Override
   public boolean bF() {
      return !this.dP();
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      this.bV();
      this.bf();
      this.a(bwc.a, this.dx());
      this.aK();
      this.i(this.dx().c(0.98));
      if (this.aJ()) {
         this.i(this.dx().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.g() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dU().C) {
            this.m();
         }
      } else {
         this.bo();
         if (this.dU().C) {
            this.dU().a(lt.ah, this.dz(), this.dB() + 0.5, this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dU().a(this, dgs.a(this.dU(), this), this.j ? h : null, this.dz(), this.e(0.0625), this.dF(), this.k, false, dgz.a.d);
   }

   @Override
   protected void b(tq $$0) {
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", uf.a(this.j()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(tq $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uf.a(this.dU().a(mc.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = ayz.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bvy f() {
      return this.i;
   }

   @Override
   public void x(bva $$0) {
      super.x($$0);
      if ($$0 instanceof clx $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(dxq $$0) {
      this.al.a(c, $$0);
   }

   public dxq j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bva b(euw $$0) {
      bva $$1 = super.b($$0);
      if ($$1 instanceof clx $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(ard $$0, btp $$1, float $$2) {
      return false;
   }
}
