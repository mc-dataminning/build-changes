import javax.annotation.Nullable;

public class civ extends bsg implements bua {
   private static final ajp<Integer> c = ajt.a(civ.class, ajr.b);
   private static final ajp<dsk> d = ajt.a(civ.class, ajr.i);
   private static final int e = 80;
   private static final String f = "block_state";
   public static final String b = "fuse";
   @Nullable
   private btb g;

   public civ(bsm<? extends civ> $$0, dcf $$1) {
      super($$0, $$1);
      this.J = true;
   }

   public civ(dcf $$0, double $$1, double $$2, double $$3, @Nullable btb $$4) {
      this(bsm.bc, $$0);
      this.a_($$1, $$2, $$3);
      double $$5 = $$0.z.j() * (float) (Math.PI * 2);
      this.o(-Math.sin($$5) * 0.02, 0.2F, -Math.cos($$5) * 0.02);
      this.b(80);
      this.L = $$1;
      this.M = $$2;
      this.N = $$3;
      this.g = $$4;
   }

   @Override
   protected void a(ajt.a $$0) {
      $$0.a(c, 80);
      $$0.a(d, dfj.ck.o());
   }

   @Override
   protected bsg.b bc() {
      return bsg.b.a;
   }

   @Override
   public boolean bA() {
      return !this.dL();
   }

   @Override
   protected double aZ() {
      return 0.04;
   }

   @Override
   public void l() {
      this.bb();
      this.a(btg.a, this.dt());
      this.i(this.dt().a(0.98));
      if (this.aF()) {
         this.i(this.dt().d(0.7, -0.5, 0.7));
      }

      int $$0 = this.u() - 1;
      this.b($$0);
      if ($$0 <= 0) {
         this.ap();
         if (!this.dQ().B) {
            this.w();
         }
      } else {
         this.bm();
         if (this.dQ().B) {
            this.dQ().a(lj.ae, this.dv(), this.dx() + 0.5, this.dB(), 0.0, 0.0, 0.0);
         }
      }
   }

   private void w() {
      float $$0 = 4.0F;
      this.dQ().a(this, this.dv(), this.e(0.0625), this.dB(), 4.0F, dcf.a.d);
   }

   @Override
   protected void b(tx $$0) {
      $$0.a("fuse", (short)this.u());
      $$0.a("block_state", um.a(this.v()));
   }

   @Override
   protected void a(tx $$0) {
      this.b($$0.g("fuse"));
      if ($$0.b("block_state", 10)) {
         this.c(um.a(this.dQ().a(lr.f), $$0.p("block_state")));
      }
   }

   @Nullable
   public btb p() {
      return this.g;
   }

   @Override
   public void w(bsg $$0) {
      super.w($$0);
      if ($$0 instanceof civ $$1) {
         this.g = $$1.g;
      }
   }

   public void b(int $$0) {
      this.ao.a(c, $$0);
   }

   public int u() {
      return this.ao.a(c);
   }

   public void c(dsk $$0) {
      this.ao.a(d, $$0);
   }

   public dsk v() {
      return this.ao.a(d);
   }
}
