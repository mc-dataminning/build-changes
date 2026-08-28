import java.util.Optional;
import javax.annotation.Nullable;

public class ckf extends bto implements bvi {
   private static final akg<Integer> b = akk.a(ckf.class, aki.b);
   private static final akg<duo> c = akk.a(ckf.class, aki.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   private static final String g = "fuse";
   private static final String h = "explosion_power";
   private static final ddz i = new ddz() {
      @Override
      public boolean a(ddy $$0, ddl $$1, je $$2, duo $$3, float $$4) {
         return $$3.a(dhl.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(ddy $$0, ddl $$1, je $$2, duo $$3, eqp $$4) {
         return $$3.a(dhl.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private buk j;
   private boolean k;
   private float l = 4.0F;

   public ckf(btv<? extends ckf> $$0, deg $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public ckf(deg $$0, double $$1, double $$2, double $$3, @Nullable buk $$4) {
      this(btv.bc, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.n(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.j = $$4;
   }

   @Override
   protected void a(akk.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dhl.ck.o());
   }

   @Override
   protected bto.b bf() {
      return bto.b.a;
   }

   @Override
   public boolean bE() {
      return !this.dN();
   }

   @Override
   protected double bc() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bT();
      this.be();
      this.a(buo.a, this.dv());
      if (!this.dS().w_()) {
         this.aI();
      }

      this.h(this.dv().c(0.98));
      if (this.aH()) {
         this.h(this.dv().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.o() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.as();
         if (!this.dS().B) {
            this.t();
         }
      } else {
         this.bp();
         if (this.dS().B) {
            this.dS().a(ln.ae, this.dx(), this.dz() + 0.5, this.dD(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dS().a(this, ddy.a(this.dS(), this), this.k ? i : null, this.dx(), this.e(0.0625), this.dD(), this.l, false, deg.a.d);
   }

   @Override
   protected void b(uf $$0) {
      $$0.a("fuse", (short)this.o());
      $$0.a("block_state", uu.a(this.q()));
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(uf $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uu.a(this.dS().a(lv.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azd.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public buk m() {
      return this.j;
   }

   @Override
   public void x(bto $$0) {
      super.x($$0);
      if ($$0 instanceof ckf $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   public int o() {
      return this.am.a(b);
   }

   public void c(duo $$0) {
      this.am.a(c, $$0);
   }

   public duo q() {
      return this.am.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bto b(ern $$0) {
      bto $$1 = super.b($$0);
      if ($$1 instanceof ckf $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
