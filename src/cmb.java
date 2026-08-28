import java.util.Optional;
import javax.annotation.Nullable;

public class cmb extends bvj implements bxe {
   private static final alc<Integer> a = alg.a(cmb.class, ale.b);
   private static final alc<dxu> b = alg.a(cmb.class, ale.i);
   private static final int c = 80;
   private static final float d = 4.0F;
   private static final String e = "block_state";
   private static final String f = "fuse";
   private static final String g = "explosion_power";
   private static final dha h = new dha() {
      @Override
      public boolean a(dgz $$0, dgm $$1, jh $$2, dxu $$3, float $$4) {
         return $$3.a(dkn.eq) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dgz $$0, dgm $$1, jh $$2, dxu $$3, etw $$4) {
         return $$3.a(dkn.eq) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bwf i;
   private boolean j;
   private float k = 4.0F;

   public cmb(bvq<? extends cmb> $$0, dhh $$1) {
      super($$0, $$1);
      this.I = true;
   }

   public cmb(dhh $$0, double $$1, double $$2, double $$3, @Nullable bwf $$4) {
      this(bvq.bw, $$0);
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
      $$0.a(b, dkn.cr.m());
   }

   @Override
   protected bvj.b bg() {
      return bvj.b.a;
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
      this.a(bwj.a, this.dy());
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
      this.dV().a(this, dgz.a(this.dV(), this), this.j ? h : null, this.dA(), this.e(0.0625), this.dG(), this.k, false, dhh.a.d);
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
   public bwf l() {
      return this.i;
   }

   @Override
   public void x(bvj $$0) {
      super.x($$0);
      if ($$0 instanceof cmb $$1) {
         this.i = $$1.i;
      }
   }

   public void b(int $$0) {
      this.al.a(a, $$0);
   }

   public int m() {
      return this.al.a(a);
   }

   public void c(dxu $$0) {
      this.al.a(b, $$0);
   }

   public dxu s() {
      return this.al.a(b);
   }

   private void a(boolean $$0) {
      this.j = $$0;
   }

   @Nullable
   @Override
   public bvj b(euw $$0) {
      bvj $$1 = super.b($$0);
      if ($$1 instanceof cmb $$2) {
         $$2.a(true);
      }

      return $$1;
   }

   @Override
   public final boolean a(ash $$0, btz $$1, float $$2) {
      return false;
   }
}
