import javax.annotation.Nullable;

public class cnu extends cnj {
   private static final akg<Byte> a = akk.a(cnu.class, aki.a);
   private static final float b = 0.1F;

   public cnu(bwb<? extends cnu> $$0, dhp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bB.a(1, new cdh(this));
      this.bB.a(2, new ccu<>(this, cjs.class, 6.0F, 1.0, 1.2, $$0 -> !((cjs)$$0).t()));
      this.bB.a(3, new cdt(this, 0.4F));
      this.bB.a(4, new cnu.a(this));
      this.bB.a(5, new cfa(this, 0.8));
      this.bB.a(6, new cdv(this, cqi.class, 8.0F));
      this.bB.a(6, new cei(this));
      this.bC.a(1, new cff(this));
      this.bC.a(2, new cnu.c<>(this, cqi.class));
      this.bC.a(3, new cnu.c<>(this, cis.class));
   }

   @Override
   protected cgb b(dhp $$0) {
      return new cgc(this, $$0);
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dV().C) {
         this.w(this.P);
      }
   }

   public static bxw.a m() {
      return cnj.gt().a(bxx.s, 16.0).a(bxx.v, 0.3F);
   }

   @Override
   protected awj u() {
      return awk.zJ;
   }

   @Override
   protected awj e(buh $$0) {
      return awk.zL;
   }

   @Override
   protected awj l_() {
      return awk.zK;
   }

   @Override
   protected void b(jj $$0, dym $$1) {
      this.a(awk.zM, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(dym $$0, fcu $$1) {
      if (!$$0.a(dkw.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(buw $$0) {
      return $$0.a(buy.s) ? false : super.b($$0);
   }

   public boolean n() {
      return (this.al.a(a) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.al.a(a);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.al.a(a, $$1);
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azs $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cnr $$5 = bwb.be.a(this.dV(), bwa.g);
         if ($$5 != null) {
            $$5.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cnu.b();
         if ($$0.an() == btn.d && $$4.i() < 0.1F * $$1.d()) {
            ((cnu.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cnu.b $$6) {
         js<buu> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new buw($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fcu l(bvs $$0) {
      return $$0.dq() <= this.dq() ? new fcu(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cdx {
      public a(cnu $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.ca();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bx();
         if ($$0 >= 0.5F && this.a.dY().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements bxj {
      @Nullable
      public js<buu> a;

      public void a(azs $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = buy.a;
         } else if ($$1 <= 2) {
            this.a = buy.e;
         } else if ($$1 <= 3) {
            this.a = buy.j;
         } else if ($$1 <= 4) {
            this.a = buy.n;
         }
      }
   }

   static class c<T extends bwr> extends cfg<T> {
      public c(cnu $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bx();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
