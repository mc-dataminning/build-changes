import java.util.Optional;
import javax.annotation.Nullable;

public class cof extends bwv implements byu {
   private static final akn<Integer> b = akr.a(cof.class, akp.b);
   private static final akn<ebg> c = akr.a(cof.class, akp.i);
   private static final short d = 80;
   private static final float e = 4.0F;
   private static final ebg f = dng.cu.m();
   private static final String g = "block_state";
   public static final String a = "fuse";
   private static final String h = "explosion_power";
   private static final djt i = new djt() {
      @Override
      public boolean a(djs $$0, djd $$1, iw $$2, ebg $$3, float $$4) {
         return $$3.a(dng.eu) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(djs $$0, djd $$1, iw $$2, ebg $$3, exq $$4) {
         return $$3.a(dng.eu) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bxw j;
   private boolean k;
   private float l = 4.0F;

   public cof(bxe<? extends cof> $$0, djz $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cof(djz $$0, double $$1, double $$2, double $$3, @Nullable bxw $$4) {
      this(bxe.bx, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.K = $$1;
      this.L = $$2;
      this.M = $$3;
      this.j = $$4;
   }

   @Override
   protected void a(akr.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, f);
   }

   @Override
   protected bwv.c bf() {
      return bwv.c.a;
   }

   @Override
   public boolean bF() {
      return !this.dQ();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void h() {
      this.bV();
      this.be();
      this.a(bya.a, this.dy());
      this.aI();
      this.i(this.dy().c(0.98));
      if (this.aH()) {
         this.i(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.g() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dV().C) {
            this.m();
         }
      } else {
         this.bo();
         if (this.dV().C) {
            this.dV().a(lz.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dV().a(this, djs.a(this.dV(), this), this.k ? i : null, this.dA(), this.e(0.0625), this.dG(), this.l, false, djz.a.d);
   }

   @Override
   protected void b(ua $$0) {
      ali<va> $$1 = this.dX().a(uo.a);
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", ebg.a, $$1, this.j());
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(ua $$0) {
      ali<va> $$1 = this.dX().a(uo.a);
      this.b($$0.b("fuse", (short)80));
      this.c($$0.<ebg>a("block_state", ebg.a, $$1).orElse(f));
      this.l = azq.a($$0.b("explosion_power", 4.0F), 0.0F, 128.0F);
   }

   @Nullable
   public bxw f() {
      return this.j;
   }

   @Override
   public void x(bwv $$0) {
      super.x($$0);
      if ($$0 instanceof cof $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(ebg $$0) {
      this.al.a(c, $$0);
   }

   public ebg j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bwv b(eyq $$0) {
      bwv $$1 = super.b($$0);
      if ($$1 instanceof cof $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(aru $$0, bvk $$1, float $$2) {
      return false;
   }
}
