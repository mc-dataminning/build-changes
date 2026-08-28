import java.util.Optional;
import javax.annotation.Nullable;

public class cod extends bwt implements bys {
   private static final akl<Integer> b = akp.a(cod.class, akn.b);
   private static final akl<ebe> c = akp.a(cod.class, akn.i);
   private static final short d = 80;
   private static final float e = 4.0F;
   private static final ebe f = dne.cu.m();
   private static final String g = "block_state";
   public static final String a = "fuse";
   private static final String h = "explosion_power";
   private static final djr i = new djr() {
      @Override
      public boolean a(djq $$0, djb $$1, iv $$2, ebe $$3, float $$4) {
         return $$3.a(dne.eu) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(djq $$0, djb $$1, iv $$2, ebe $$3, exo $$4) {
         return $$3.a(dne.eu) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bxu j;
   private boolean k;
   private float l = 4.0F;

   public cod(bxc<? extends cod> $$0, djx $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cod(djx $$0, double $$1, double $$2, double $$3, @Nullable bxu $$4) {
      this(bxc.bx, $$0);
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
   protected void a(akp.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, f);
   }

   @Override
   protected bwt.c bf() {
      return bwt.c.a;
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
      this.a(bxy.a, this.dy());
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
            this.dV().a(ly.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dV().a(this, djq.a(this.dV(), this), this.k ? i : null, this.dA(), this.e(0.0625), this.dG(), this.l, false, djx.a.d);
   }

   @Override
   protected void b(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", ebe.a, $$1, this.j());
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(tz $$0) {
      alg<uy> $$1 = this.dX().a(un.a);
      this.b($$0.b("fuse", (short)80));
      this.c($$0.<ebe>a("block_state", ebe.a, $$1).orElse(f));
      this.l = azo.a($$0.b("explosion_power", 4.0F), 0.0F, 128.0F);
   }

   @Nullable
   public bxu f() {
      return this.j;
   }

   @Override
   public void x(bwt $$0) {
      super.x($$0);
      if ($$0 instanceof cod $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(ebe $$0) {
      this.al.a(c, $$0);
   }

   public ebe j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bwt b(eyo $$0) {
      bwt $$1 = super.b($$0);
      if ($$1 instanceof cod $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(ars $$0, bvi $$1, float $$2) {
      return false;
   }
}
