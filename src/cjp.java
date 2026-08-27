import javax.annotation.Nullable;

public class cjp extends cjd {
   private static final ajy<Byte> b = akc.a(cjp.class, aka.a);
   private static final float c = 0.1F;

   public cjp(bsb<? extends cjp> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return true;
   }

   @Override
   protected void y() {
      this.cb.a(1, new bzf(this));
      this.cb.a(2, new bys<>(this, cfn.class, 6.0F, 1.0, 1.2, $$0 -> !((cfn)$$0).t()));
      this.cb.a(3, new bzr(this, 0.4F));
      this.cb.a(4, new cjp.a(this));
      this.cb.a(5, new cay(this, 0.8));
      this.cb.a(6, new bzt(this, cly.class, 8.0F));
      this.cb.a(6, new cag(this));
      this.cc.a(1, new cbd(this));
      this.cc.a(2, new cjp.c<>(this, cly.class));
      this.cc.a(3, new cjp.c<>(this, ceq.class));
   }

   @Override
   protected cbz b(dca $$0) {
      return new cca(this, $$0);
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dU().C) {
         this.w(this.R);
      }
   }

   public static btu.a t() {
      return cjd.gG().a(btv.q, 16.0).a(btv.r, 0.3F);
   }

   @Override
   protected avn u() {
      return avo.zg;
   }

   @Override
   protected avn d(bqt $$0) {
      return avo.zi;
   }

   @Override
   protected avn n_() {
      return avo.zh;
   }

   @Override
   protected void b(ir $$0, dtc $$1) {
      this.a(avo.zj, 0.15F, 1.0F);
   }

   @Override
   public boolean p_() {
      return this.x();
   }

   @Override
   public void a(dtc $$0, ewu $$1) {
      if (!$$0.a(dfe.cc)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brh $$0) {
      return $$0.a(brj.s) ? false : super.c($$0);
   }

   public boolean x() {
      return (this.as.a(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.as.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.as.a(b, $$1);
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      ayt $$4 = $$0.F_();
      if ($$4.a(100) == 0) {
         cjm $$5 = bsb.aP.a(this.dU());
         if ($$5 != null) {
            $$5.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cjp.b();
         if ($$0.al() == bpx.d && $$4.i() < 0.1F * $$1.d()) {
            ((cjp.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cjp.b $$6) {
         ja<brf> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brh($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public ewu l(brv $$0) {
      return $$0.do() <= this.do() ? new ewu(0.0, 0.3125 * (double)this.em(), 0.0) : super.l($$0);
   }

   static class a extends bzv {
      public a(cjp $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bX();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.by();
         if ($$0 >= 0.5F && this.a.et().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements btg {
      @Nullable
      public ja<brf> a;

      public void a(ayt $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brj.a;
         } else if ($$1 <= 2) {
            this.a = brj.e;
         } else if ($$1 <= 3) {
            this.a = brj.j;
         } else if ($$1 <= 4) {
            this.a = brj.n;
         }
      }
   }

   static class c<T extends bso> extends cbe<T> {
      public c(cjp $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.by();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
