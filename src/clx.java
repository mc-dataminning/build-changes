import javax.annotation.Nullable;

public class clx extends clm {
   private static final akk<Byte> b = ako.a(clx.class, akm.a);
   private static final float c = 0.1F;

   public clx(bug<? extends clx> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bS.a(1, new cbn(this));
      this.bS.a(2, new cba<>(this, chv.class, 6.0F, 1.0, 1.2, $$0 -> !((chv)$$0).t()));
      this.bS.a(3, new cbz(this, 0.4F));
      this.bS.a(4, new clx.a(this));
      this.bS.a(5, new cdg(this, 0.8));
      this.bS.a(6, new ccb(this, coh.class, 8.0F));
      this.bS.a(6, new cco(this));
      this.bT.a(1, new cdl(this));
      this.bT.a(2, new clx.c<>(this, coh.class));
      this.bT.a(3, new clx.c<>(this, cgy.class));
   }

   @Override
   protected ceh b(dev $$0) {
      return new cei(this, $$0);
   }

   @Override
   protected void a(ako.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dX().C) {
         this.x(this.Q);
      }
   }

   public static bwc.a t() {
      return clm.gB().a(bwd.s, 16.0).a(bwd.v, 0.3F);
   }

   @Override
   protected awj w() {
      return awk.yP;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.yR;
   }

   @Override
   protected awj o_() {
      return awk.yQ;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.yS, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dvd $$0, ezh $$1) {
      if (!$$0.a(dia.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bte $$0) {
      return $$0.a(btg.s) ? false : super.b($$0);
   }

   public boolean y() {
      return (this.am.a(b) & 1) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.am.a(b, $$1);
   }

   @Nullable
   @Override
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azr $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         clu $$5 = bug.aN.a(this.dX(), buf.g);
         if ($$5 != null) {
            $$5.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new clx.b();
         if ($$0.am() == brv.d && $$4.i() < 0.1F * $$1.d()) {
            ((clx.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof clx.b $$6) {
         jp<btc> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bte($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ezh l(btz $$0) {
      return $$0.ds() <= this.ds() ? new ezh(0.0, 0.3125 * (double)this.el(), 0.0) : super.l($$0);
   }

   static class a extends ccd {
      public a(clx $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.cb();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bz();
         if ($$0 >= 0.5F && this.a.ea().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bvo {
      @Nullable
      public jp<btc> a;

      public void a(azr $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = btg.a;
         } else if ($$1 <= 2) {
            this.a = btg.e;
         } else if ($$1 <= 3) {
            this.a = btg.j;
         } else if ($$1 <= 4) {
            this.a = btg.n;
         }
      }
   }

   static class c<T extends buv> extends cdm<T> {
      public c(clx $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bz();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
