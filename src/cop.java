import java.util.Optional;
import javax.annotation.Nullable;

public class cop extends bxe implements bzd {
   private static final aku<Integer> b = aky.a(cop.class, akw.b);
   private static final aku<ebq> c = aky.a(cop.class, akw.i);
   private static final short d = 80;
   private static final float e = 4.0F;
   private static final ebq f = dnq.cu.m();
   private static final String g = "block_state";
   public static final String a = "fuse";
   private static final String h = "explosion_power";
   private static final dkd i = new dkd() {
      @Override
      public boolean a(dkc $$0, djn $$1, iw $$2, ebq $$3, float $$4) {
         return $$3.a(dnq.eu) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dkc $$0, djn $$1, iw $$2, ebq $$3, eya $$4) {
         return $$3.a(dnq.eu) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private byf j;
   private boolean k;
   private float l = 4.0F;

   public cop(bxn<? extends cop> $$0, dkj $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cop(dkj $$0, double $$1, double $$2, double $$3, @Nullable byf $$4) {
      this(bxn.bx, $$0);
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
   protected void a(aky.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, f);
   }

   @Override
   protected bxe.c bf() {
      return bxe.c.a;
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
   public void g() {
      this.bV();
      this.be();
      this.a(byj.a, this.dy());
      this.aI();
      this.i(this.dy().c(0.98));
      if (this.aH()) {
         this.i(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.f() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dV().C) {
            this.l();
         }
      } else {
         this.bo();
         if (this.dV().C) {
            this.dV().a(lz.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void l() {
      if (this.dV() instanceof asb $$0 && $$0.O().c(dkf.ad)) {
         this.dV().a(this, dkc.a(this.dV(), this), this.k ? i : null, this.dA(), this.e(0.0625), this.dG(), this.l, false, dkj.a.d);
      }
   }

   @Override
   protected void b(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      $$0.a("fuse", (short)this.f());
      $$0.a("block_state", ebq.a, $$1, this.i());
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(ua $$0) {
      alp<va> $$1 = this.dX().a(uo.a);
      this.b($$0.b("fuse", (short)80));
      this.c($$0.<ebq>a("block_state", ebq.a, $$1).orElse(f));
      this.l = azz.a($$0.b("explosion_power", 4.0F), 0.0F, 128.0F);
   }

   @Nullable
   public byf e() {
      return this.j;
   }

   @Override
   public void x(bxe $$0) {
      super.x($$0);
      if ($$0 instanceof cop $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int f() {
      return this.al.a(b);
   }

   public void c(ebq $$0) {
      this.al.a(c, $$0);
   }

   public ebq i() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bxe b(eza $$0) {
      bxe $$1 = super.b($$0);
      if ($$1 instanceof cop $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(asb $$0, bvt $$1, float $$2) {
      return false;
   }
}
