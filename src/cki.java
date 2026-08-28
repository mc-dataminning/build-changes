import java.util.Optional;
import javax.annotation.Nullable;

public class cki extends btr implements bvl {
   private static final akh<Integer> b = akl.a(cki.class, akj.b);
   private static final akh<dus> c = akl.a(cki.class, akj.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   private static final String g = "fuse";
   private static final String h = "explosion_power";
   private static final dec i = new dec() {
      @Override
      public boolean a(deb $$0, ddo $$1, jf $$2, dus $$3, float $$4) {
         return $$3.a(dho.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(deb $$0, ddo $$1, jf $$2, dus $$3, eqt $$4) {
         return $$3.a(dho.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bun j;
   private boolean k;
   private float l = 4.0F;

   public cki(bty<? extends cki> $$0, dej $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cki(dej $$0, double $$1, double $$2, double $$3, @Nullable bun $$4) {
      this(bty.bc, $$0);
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
   protected void a(akl.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dho.ck.n());
   }

   @Override
   protected btr.b bf() {
      return btr.b.a;
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
      this.a(bur.a, this.dv());
      if (!this.dS().x_()) {
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
            this.dS().a(lo.ae, this.dx(), this.dz() + 0.5, this.dD(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dS().a(this, deb.a(this.dS(), this), this.k ? i : null, this.dx(), this.e(0.0625), this.dD(), this.l, false, dej.a.d);
   }

   @Override
   protected void b(ug $$0) {
      $$0.a("fuse", (short)this.o());
      $$0.a("block_state", uv.a(this.q()));
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(ug $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(uv.a(this.dS().a(lw.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azf.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bun m() {
      return this.j;
   }

   @Override
   public void x(btr $$0) {
      super.x($$0);
      if ($$0 instanceof cki $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   public int o() {
      return this.am.a(b);
   }

   public void c(dus $$0) {
      this.am.a(c, $$0);
   }

   public dus q() {
      return this.am.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public btr b(err $$0) {
      btr $$1 = super.b($$0);
      if ($$1 instanceof cki $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
