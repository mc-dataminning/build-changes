import javax.annotation.Nullable;

public class cdg extends ccg implements brj, chk {
   private static final aja<Byte> b = aje.a(cdg.class, ajc.a);
   private static final byte c = 16;

   public cdg(bqg<? extends cdg> $$0, czg $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bR.a(1, new byp(this, 1.25, 20, 10.0F));
      this.bR.a(2, new bzd(this, 1.0, 1.0000001E-5F));
      this.bR.a(3, new bxy(this, cka.class, 6.0F));
      this.bR.a(4, new byl(this));
      this.bS.a(1, new bzj<>(this, bqv.class, 10, true, false, $$0 -> $$0 instanceof cgy));
   }

   public static brz.a r() {
      return bqv.A().a(bsa.q, 4.0).a(bsa.r, 0.2F);
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)16);
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      $$0.a("Pumpkin", this.u());
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.e("Pumpkin")) {
         this.w($$0.q("Pumpkin"));
      }
   }

   @Override
   public boolean fm() {
      return true;
   }

   @Override
   public void n_() {
      super.n_();
      if (!this.dM().B) {
         if (this.dM().t(this.dm()).a(avd.ae)) {
            this.a(this.dN().c(), 1.0F);
         }

         if (!this.dM().aa().b(czc.c)) {
            return;
         }

         dpi $$0 = dcj.dN.n();

         for (int $$1 = 0; $$1 < 4; $$1++) {
            int $$2 = axm.a(this.dr() + (double)((float)($$1 % 2 * 2 - 1) * 0.25F));
            int $$3 = axm.a(this.dt());
            int $$4 = axm.a(this.dx() + (double)((float)($$1 / 2 % 2 * 2 - 1) * 0.25F));
            id $$5 = new id($$2, $$3, $$4);
            if (this.dM().a_($$5).i() && $$0.a((czj)this.dM(), $$5)) {
               this.dM().b($$5, $$0);
               this.dM().a(dub.i, $$5, dub.a.a(this, $$0));
            }
         }
      }
   }

   @Override
   public void a(bqt $$0, float $$1) {
      ckx $$2 = new ckx(this.dM(), this);
      double $$3 = $$0.dv() - 1.1F;
      double $$4 = $$0.dr() - this.dr();
      double $$5 = $$3 - $$2.dt();
      double $$6 = $$0.dx() - this.dx();
      double $$7 = Math.sqrt($$4 * $$4 + $$6 * $$6) * 0.2F;
      $$2.c($$4, $$5 + $$7, $$6, 1.6F, 12.0F);
      this.a(auo.yk, 1.0F, 0.4F / (this.ei().i() * 0.4F + 0.8F));
      this.dM().b($$2);
   }

   @Override
   protected bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.rU) && this.a()) {
         this.a(aup.h);
         this.a(dub.M, $$0);
         if (!this.dM().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bof.a(this.dM().B);
      } else {
         return bof.d;
      }
   }

   @Override
   public void a(aup $$0) {
      this.dM().a(null, this, auo.yl, $$0, 1.0F, 1.0F);
      if (!this.dM().x_()) {
         this.w(false);
         this.a(new crs(crv.fk), this.cI());
      }
   }

   @Override
   public boolean a() {
      return this.bA() && this.u();
   }

   public boolean u() {
      return (this.an.a(b) & 16) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.a(b);
      if ($$0) {
         this.an.a(b, (byte)($$1 | 16));
      } else {
         this.an.a(b, (byte)($$1 & -17));
      }
   }

   @Nullable
   @Override
   protected aun v() {
      return auo.yh;
   }

   @Nullable
   @Override
   protected aun d(boy $$0) {
      return auo.yj;
   }

   @Nullable
   @Override
   protected aun o_() {
      return auo.yi;
   }

   @Override
   public esj cJ() {
      return new esj(0.0, (double)(0.75F * this.cI()), (double)(this.dg() * 0.4F));
   }
}
