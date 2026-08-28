import java.util.Optional;
import javax.annotation.Nullable;

public class cla extends bui implements bwd {
   private static final ako<Integer> b = aks.a(cla.class, akq.b);
   private static final ako<dvo> c = aks.a(cla.class, akq.i);
   private static final int d = 80;
   private static final float e = 4.0F;
   private static final String f = "block_state";
   private static final String g = "fuse";
   private static final String h = "explosion_power";
   private static final dey i = new dey() {
      @Override
      public boolean a(dex $$0, dek $$1, jh $$2, dvo $$3, float $$4) {
         return $$3.a(dil.ed) ? false : super.a($$0, $$1, $$2, $$3, $$4);
      }

      @Override
      public Optional<Float> a(dex $$0, dek $$1, jh $$2, dvo $$3, ero $$4) {
         return $$3.a(dil.ed) ? Optional.empty() : super.a($$0, $$1, $$2, $$3, $$4);
      }
   };
   @Nullable
   private bve j;
   private boolean k;
   private float l = 4.0F;

   public cla(bup<? extends cla> $$0, dff $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public cla(dff $$0, double $$1, double $$2, double $$3, @Nullable bve $$4) {
      this(bup.bc, $$0);
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
   protected void a(aks.a $$0) {
      $$0.a(b, 80);
      $$0.a(c, dil.ck.m());
   }

   @Override
   protected bui.b bi() {
      return bui.b.a;
   }

   @Override
   public boolean bJ() {
      return !this.dT();
   }

   @Override
   protected double bf() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bY();
      this.bh();
      this.a(bvi.a, this.dB());
      this.aM();
      this.h(this.dB().c(0.98));
      if (this.aL()) {
         this.h(this.dB().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.o() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.av();
         if (!this.dY().C) {
            this.t();
         }
      } else {
         this.bs();
         if (this.dY().C) {
            this.dY().a(ls.ae, this.dD(), this.dF() + 0.5, this.dJ(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void t() {
      this.dY().a(this, dex.a(this.dY(), this), this.k ? i : null, this.dD(), this.e(0.0625), this.dJ(), this.l, false, dff.a.d);
   }

   @Override
   protected void b(un $$0) {
      $$0.a("fuse", (short)this.o());
      $$0.a("block_state", vc.a(this.q()));
      if (this.l != 4.0F) {
         $$0.a("explosion_power", this.l);
      }
   }

   @Override
   protected void a(un $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(vc.a(this.dY().a(ma.f), $$0.p("block_state")));
      }

      if ($$0.b("explosion_power", 99)) {
         this.l = azn.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Nullable
   public bve m() {
      return this.j;
   }

   @Override
   public void x(bui $$0) {
      super.x($$0);
      if ($$0 instanceof cla $$1) {
         this.j = $$1.j;
      }
   }

   public void b(int $$0) {
      this.am.a(b, $$0);
   }

   public int o() {
      return this.am.a(b);
   }

   public void c(dvo $$0) {
      this.am.a(c, $$0);
   }

   public dvo q() {
      return this.am.a(c);
   }

   private void a(boolean $$0) {
      this.k = $$0;
   }

   @Nullable
   @Override
   public bui b(esm $$0) {
      bui $$1 = super.b($$0);
      if ($$1 instanceof cla $$2) {
         $$2.a(true);
      }

      return $$1;
   }
}
