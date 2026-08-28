import java.util.Optional;
import javax.annotation.Nullable;

public class cns extends bwi implements byh {
   private static final akj<Integer> b = akn.a(cns.class, akl.b);
   private static final akj<eat> c = akn.a(cns.class, akl.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   public static final String a = "fuse";
   private static final String g = "explosion_power";
   private static final djg h = new djg() {
      @Override
      public boolean a(djf $$0, diq $$1, iv $$2, eat $$3, float $$4) {
         return $$3.a(dmt.eu) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(djf $$0, diq $$1, iv $$2, eat $$3, exa $$4) {
         return $$3.a(dmt.eu) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bxj i;
   private boolean j;
   private float k = 4.0F;

   public cns(bwr<? extends cns> $$0, djm $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cns(djm $$0, double $$1, double $$2, double $$3, @Nullable bxj $$4) {
      this(bwr.bw, $$0);
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
   protected void a(akn.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dmt.cu.m());
   }

   @Override
   protected bwi.c be() {
      return bwi.c.a;
   }

   @Override
   public boolean bE() {
      return !this.dP();
   }

   @Override
   protected double bb() {
      return 0.04;
   }

   @Override
   public void h() {
      this.bU();
      this.bd();
      this.a(bxn.a, this.dx());
      this.aI();
      this.i(this.dx().c(0.98));
      if (this.aH()) {
         this.i(this.dx().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.g() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.aq();
         if (!this.dU().C) {
            this.m();
         }
      } else {
         this.bn();
         if (this.dU().C) {
            this.dU().a(ly.ah, this.dz(), this.dB() + 0.5, this.dF(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dU().a(this, djf.a(this.dU(), this), this.j ? h : null, this.dz(), this.e(0.0625), this.dF(), this.k, false, djm.a.d);
   }

   @Override
   protected void b(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", eat.a, $$1, this.j());
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(tz $$0) {
      ale<uw> $$1 = this.dW().a(un.a);
      this.b($$0.e("fuse"));
      this.c($$0.<eat>a("block_state", eat.a, $$1).orElse(dmt.cu.m()));
      if ($$0.b("explosion_power", 99)) {
         this.k = azm.a($$0.h("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bxj f() {
      return this.i;
   }

   @Override
   public void x(bwi $$0) {
      super.x($$0);
      if ($$0 instanceof cns $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(eat $$0) {
      this.al.a(c, $$0);
   }

   public eat j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bwi b(eya $$0) {
      bwi $$1 = super.b($$0);
      if ($$1 instanceof cns $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(arq $$0, bux $$1, float $$2) {
      return false;
   }
}
