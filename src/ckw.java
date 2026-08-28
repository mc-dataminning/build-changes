import java.util.Optional;
import javax.annotation.Nullable;

public class ckw extends bue implements bvz {
   private static final akl<Integer> b = akp.a(ckw.class, akn.b);
   private static final akl<dvj> c = akp.a(ckw.class, akn.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   private static final String g = "fuse";
   private static final String h = "explosion_power";
   private static final deu i = new deu() {
      @Override
      public boolean a(det $$0, deg $$1, jh $$2, dvj $$3, float $$4) {
         return $$3.a(dig.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(det $$0, deg $$1, jh $$2, dvj $$3, erk $$4) {
         return $$3.a(dig.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bva j;
   private boolean k;
   private float l = 4.0F;

   public ckw(bul<? extends ckw> $$0, dfb $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public ckw(dfb $$0, double $$1, double $$2, double $$3, @Nullable bva $$4) {
      this(bul.bc, $$0);
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
   protected void a(akp.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dig.ck.m());
   }

   @Override
   protected bue.b bh() {
      return bue.b.a;
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
      this.a(bve.a, this.dA());
      this.aL();
      this.h(this.dA().c(0.98));
      if (this.aK()) {
         this.h(this.dA().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.o() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.av();
         if (!this.dX().C) {
            this.t();
         }
      } else {
         this.br();
         if (this.dX().C) {
            this.dX().a(lr.ae, this.dC(), this.dE() + 0.5, this.dI(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dX().a(this, det.a(this.dX(), this), this.k ? i : null, this.dC(), this.e(0.0625), this.dI(), this.l, false, dfb.a.d);
   }

   @Override
   protected void b(uk $$0) {
      $$0.a("fuse", (short)this.o());
      $$0.a("block_state", uz.a(this.q()));
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(uk $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uz.a(this.dX().a(lz.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azk.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bva m() {
      return this.j;
   }

   @Override
   public void x(bue $$0) {
      super.x($$0);
      if ($$0 instanceof ckw $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   public int o() {
      return this.am.a(b);
   }

   public void c(dvj $$0) {
      this.am.a(c, $$0);
   }

   public dvj q() {
      return this.am.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bue b(esi $$0) {
      bue $$1 = super.b($$0);
      if ($$1 instanceof ckw $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
