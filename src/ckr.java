import java.util.Optional;
import javax.annotation.Nullable;

public class ckr extends btz implements bvu {
   private static final akk<Integer> b = ako.a(ckr.class, akm.b);
   private static final akk<dvd> c = ako.a(ckr.class, akm.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   private static final String g = "fuse";
   private static final String h = "explosion_power";
   private static final deo i = new deo() {
      @Override
      public boolean a(den $$0, dea $$1, jg $$2, dvd $$3, float $$4) {
         return $$3.a(dia.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(den $$0, dea $$1, jg $$2, dvd $$3, ere $$4) {
         return $$3.a(dia.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private buv j;
   private boolean k;
   private float l = 4.0F;

   public ckr(bug<? extends ckr> $$0, dev $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public ckr(dev $$0, double $$1, double $$2, double $$3, @Nullable buv $$4) {
      this(bug.bc, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.A.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.j = $$4;
   }

   @Override
   protected void a(ako.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dia.ck.m());
   }

   @Override
   protected btz.b bh() {
      return btz.b.a;
   }

   @Override
   public boolean bI() {
      return !this.dS();
   }

   @Override
   protected double be() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bX();
      this.bg();
      this.a(buz.a, this.dA());
      this.aK();
      this.h(this.dA().c(0.98));
      if (this.aJ()) {
         this.h(this.dA().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.o() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.au();
         if (!this.dX().C) {
            this.t();
         }
      } else {
         this.br();
         if (this.dX().C) {
            this.dX().a(lq.ae, this.dC(), this.dE() + 0.5, this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dX().a(this, den.a(this.dX(), this), this.k ? i : null, this.dC(), this.e(0.0625), this.dI(), this.l, false, dev.a.d);
   }

   @Override
   protected void b(uj $$0) {
      $$0.a("fuse", (short)this.o());
      $$0.a("block_state", uy.a(this.q()));
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(uj $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uy.a(this.dX().a(ly.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azj.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public buv m() {
      return this.j;
   }

   @Override
   public void x(btz $$0) {
      super.x($$0);
      if ($$0 instanceof ckr $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   public int o() {
      return this.am.a(b);
   }

   public void c(dvd $$0) {
      this.am.a(c, $$0);
   }

   public dvd q() {
      return this.am.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public btz b(esc $$0) {
      btz $$1 = super.b($$0);
      if ($$1 instanceof ckr $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
