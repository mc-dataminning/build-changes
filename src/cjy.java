import javax.annotation.Nullable;

public class cjy extends cjn {
   private static final ajp<Byte> b = ajt.a(cjy.class, ajr.a);
   private static final float c = 0.1F;

   public cjy(bsj<? extends cjy> $$0, dcd $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bU.a(1, new bzq(this));
      this.bU.a(2, new bzd<>(this, cfx.class, 6.0F, 1.0, 1.2, $$0 -> !((cfx)$$0).u()));
      this.bU.a(3, new cac(this, 0.4F));
      this.bU.a(4, new cjy.a(this));
      this.bU.a(5, new cbj(this, 0.8));
      this.bU.a(6, new cae(this, cmh.class, 8.0F));
      this.bU.a(6, new car(this));
      this.bV.a(1, new cbo(this));
      this.bV.a(2, new cjy.c<>(this, cmh.class));
      this.bV.a(3, new cjy.c<>(this, cfa.class));
   }

   @Override
   protected cck b(dcd $$0) {
      return new ccl(this, $$0);
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dP().B) {
         this.w(this.Q);
      }
   }

   public static buf.a u() {
      return cjn.gt().a(bug.s, 16.0).a(bug.v, 0.3F);
   }

   @Override
   protected ave v() {
      return avf.yL;
   }

   @Override
   protected ave d(bqw $$0) {
      return avf.yN;
   }

   @Override
   protected ave o_() {
      return avf.yM;
   }

   @Override
   protected void b(ja $$0, dsh $$1) {
      this.a(avf.yO, 0.15F, 1.0F);
   }

   @Override
   public boolean q_() {
      return this.y();
   }

   @Override
   public void a(dsh $$0, evz $$1) {
      if (!$$0.a(dfh.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean c(brl $$0) {
      return $$0.a(brn.s) ? false : super.c($$0);
   }

   public boolean y() {
      return (this.ao.a(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.ao.a(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.ao.a(b, $$1);
   }

   @Nullable
   @Override
   public btr a(dcs $$0, bqb $$1, btc $$2, @Nullable btr $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      aym $$4 = $$0.E_();
      if ($$4.a(100) == 0) {
         cjv $$5 = bsj.aN.a(this.dP());
         if ($$5 != null) {
            $$5.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cjy.b();
         if ($$0.al() == bqa.d && $$4.i() < 0.1F * $$1.d()) {
            ((cjy.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cjy.b $$6) {
         jj<brj> $$7 = $$6.a;
         if ($$7 != null) {
            this.b(new brl($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public evz l(bsd $$0) {
      return $$0.dj() <= this.dj() ? new evz(0.0, 0.3125 * (double)this.eb(), 0.0) : super.l($$0);
   }

   static class a extends cag {
      public a(cjy $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bS();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bt();
         if ($$0 >= 0.5F && this.a.dS().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements btr {
      @Nullable
      public jj<brj> a;

      public void a(aym $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = brn.a;
         } else if ($$1 <= 2) {
            this.a = brn.e;
         } else if ($$1 <= 3) {
            this.a = brn.j;
         } else if ($$1 <= 4) {
            this.a = brn.n;
         }
      }
   }

   static class c<T extends bsy> extends cbp<T> {
      public c(cjy $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bt();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
