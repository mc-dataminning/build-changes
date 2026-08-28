import java.util.Optional;
import javax.annotation.Nullable;

public class cne extends bwd implements bya {
   private static final akj<Integer> b = akn.a(cne.class, akl.b);
   private static final akj<dzz> c = akn.a(cne.class, akl.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   public static final String a = "fuse";
   private static final String g = "explosion_power";
   private static final dip h = new dip() {
      @Override
      public boolean a(dio $$0, dib $$1, iu $$2, dzz $$3, float $$4) {
         return $$3.a(dmc.er) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dio $$0, dib $$1, iu $$2, dzz $$3, ewg $$4) {
         return $$3.a(dmc.er) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bxc i;
   private boolean j;
   private float k = 4.0F;

   public cne(bwm<? extends cne> $$0, div $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cne(div $$0, double $$1, double $$2, double $$3, @Nullable bxc $$4) {
      this(bwm.bw, $$0);
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
      $$0.a(c, dmc.cs.m());
   }

   @Override
   protected bwd.d bg() {
      return bwd.d.a;
   }

   @Override
   public boolean bG() {
      return !this.dQ();
   }

   @Override
   protected double bd() {
      return 0.04;
   }

   @Override
   public void h() {
      this.bW();
      this.bf();
      this.a(bxg.a, this.dy());
      this.aK();
      this.i(this.dy().c(0.98));
      if (this.aJ()) {
         this.i(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.g() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dV().C) {
            this.m();
         }
      } else {
         this.bp();
         if (this.dV().C) {
            this.dV().a(lx.ah, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void m() {
      this.dV().a(this, dio.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, div.a.d);
   }

   @Override
   protected void b(tz $$0) {
      $$0.a("fuse", (short)this.g());
      $$0.a("block_state", uo.a(this.j()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(tz $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uo.a(this.dV().a(mg.i), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = azm.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bxc f() {
      return this.i;
   }

   @Override
   public void x(bwd $$0) {
      super.x($$0);
      if ($$0 instanceof cne $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(b, $$0);
   }

   public int g() {
      return this.al.a(b);
   }

   public void c(dzz $$0) {
      this.al.a(c, $$0);
   }

   public dzz j() {
      return this.al.a(c);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bwd b(exg $$0) {
      bwd $$1 = super.b($$0);
      if ($$1 instanceof cne $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(arq $$0, bus $$1, float $$2) {
      return false;
   }
}
