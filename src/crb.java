import javax.annotation.Nullable;

public class crb extends cqo {
   private static final byte c = 10;
   private static final String d = "explosion_power";
   private static final float e = 4.0F;
   private int i = -1;
   private float j = 4.0F;

   public crb(bup<? extends crb> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   public dvo z() {
      return dil.ck.m();
   }

   @Override
   public void l() {
      super.l();
      if (this.i > 0) {
         this.i--;
         this.dY().a(ls.ae, this.dD(), this.dF() + 0.5, this.dJ(), 0.0, 0.0, 0.0);
      } else if (this.i == 0) {
         this.h(this.dB().j());
      }

      if (this.Q) {
         double $$0 = this.dB().j();
         if ($$0 >= 0.01F) {
            this.h($$0);
         }
      }
   }

   @Override
   public boolean a(bsy $$0, float $$1) {
      if ($$0.c() instanceof coy $$3 && $$3.ca()) {
         bsy $$4 = this.dZ().d(this, $$0.d());
         this.a($$4, $$3.dB().h());
      }

      return super.a($$0, $$1);
   }

   @Override
   public void a(bsy $$0) {
      double $$1 = this.dB().j();
      if (!e($$0) && !($$1 >= 0.01F)) {
         this.b(this.al_());
      } else {
         if (this.i < 0) {
            this.F();
            this.i = this.af.a(20) + this.af.a(20);
         }
      }
   }

   @Override
   protected cwb al_() {
      return cwj.nP;
   }

   @Override
   public cwf dL() {
      return new cwf(cwj.nP);
   }

   protected void h(double $$0) {
      this.a(null, $$0);
   }

   protected void a(@Nullable bsy $$0, double $$1) {
      if (!this.dY().C) {
         double $$2 = Math.min(Math.sqrt($$1), 5.0);
         this.dY().a(this, $$0, null, this.dD(), this.dF(), this.dJ(), (float)((double)this.j + this.af.j() * 1.5 * $$2), false, dff.a.d);
         this.av();
      }
   }

   @Override
   public boolean a(float $$0, float $$1, bsy $$2) {
      if ($$0 >= 3.0F) {
         float $$3 = $$0 / 10.0F;
         this.h((double)($$3 * $$3));
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3 && this.i < 0) {
         this.F();
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.F();
      } else {
         super.b($$0);
      }
   }

   public void F() {
      this.i = 80;
      if (!this.dY().C) {
         this.dY().a(this, (byte)10);
         if (!this.bd()) {
            this.dY().a(null, this.dD(), this.dF(), this.dJ(), awo.zC, awp.e, 1.0F, 1.0F);
         }
      }
   }

   public int G() {
      return this.i;
   }

   public boolean I() {
      return this.i > -1;
   }

   @Override
   public float a(dex $$0, dek $$1, jh $$2, dvo $$3, ero $$4, float $$5) {
      return !this.I() || !$$3.a(axd.O) && !$$1.a_($$2.d()).a(axd.O) ? super.a($$0, $$1, $$2, $$3, $$4, $$5) : 0.0F;
   }

   @Override
   public boolean a(dex $$0, dek $$1, jh $$2, dvo $$3, float $$4) {
      return !this.I() || !$$3.a(axd.O) && !$$1.a_($$2.d()).a(axd.O) ? super.a($$0, $$1, $$2, $$3, $$4) : false;
   }

   @Override
   protected void a(un $$0) {
      super.a($$0);
      if ($$0.b("TNTFuse", 99)) {
         this.i = $$0.h("TNTFuse");
      }

      if ($$0.b("explosion_power", 99)) {
         this.j = azn.a($$0.j("explosion_power"), 0.0F, 128.0F);
      }
   }

   @Override
   protected void b(un $$0) {
      super.b($$0);
      $$0.a("TNTFuse", this.i);
      if (this.j != 4.0F) {
         $$0.a("explosion_power", this.j);
      }
   }

   @Override
   boolean d(bsy $$0) {
      return e($$0);
   }

   private static boolean e(bsy $$0) {
      return $$0.a(axf.i) || $$0.a(axf.l);
   }
}
