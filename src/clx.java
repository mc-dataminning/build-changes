import java.util.Optional;
import javax.annotation.Nullable;

public class clx extends bvf implements bxa {
   private static final alc<Integer> a = alg.a(clx.class, ale.b);
   private static final alc<dxn> b = alg.a(clx.class, ale.i);
   private static final int c = 80;
   private static final float d = 4.0F;
   private static final String e = "block_state";
   private static final String f = "fuse";
   private static final String g = "explosion_power";
   private static final dgt h = new dgt() {
      @Override
      public boolean a(dgs $$0, dgf $$1, jh $$2, dxn $$3, float $$4) {
         return $$3.a(dkg.eq) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dgs $$0, dgf $$1, jh $$2, dxn $$3, etp $$4) {
         return $$3.a(dkg.eq) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bwb i;
   private boolean j;
   private float k = 4.0F;

   public clx(bvm<? extends clx> $$0, dha $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public clx(dha $$0, double $$1, double $$2, double $$3, @Nullable bwb $$4) {
      this(bvm.bw, $$0);
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
   protected void a(alg.a $$0) {
      $$0.a(a, 80);
      $$0.a(b, dkg.cr.m());
   }

   @Override
   protected bvf.b bg() {
      return bvf.b.a;
   }

   @Override
   public boolean bH() {
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
      this.a(bwf.a, this.dy());
      this.aK();
      this.h(this.dy().c(0.98));
      if (this.aJ()) {
         this.h(this.dy().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.m() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.at();
         if (!this.dV().C) {
            this.t();
         }
      } else {
         this.bq();
         if (this.dV().C) {
            this.dV().a(ls.af, this.dA(), this.dC() + 0.5, this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dV().a(this, dgs.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, dha.a.d);
   }

   @Override
   protected void b(ux $$0) {
      $$0.a("fuse", (short)this.m());
      $$0.a("block_state", vm.a(this.s()));
      if (this.k != 4.0F) {
         $$0.a("explosion_power", this.k);
      }
   }

   @Override
   protected void a(ux $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(vm.a(this.dV().a(mb.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.k = bae.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bwb l() {
      return this.i;
   }

   @Override
   public void x(bvf $$0) {
      super.x($$0);
      if ($$0 instanceof clx $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return this.al.a(a);
   }

   public void c(dxn $$0) {
      this.al.a(b, $$0);
   }

   public dxn s() {
      return this.al.a(b);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bvf b(eup $$0) {
      bvf $$1 = super.b($$0);
      if ($$1 instanceof clx $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(ash $$0, btv $$1, float $$2) {
      return false;
   }
}
