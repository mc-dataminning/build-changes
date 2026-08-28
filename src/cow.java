import javax.annotation.Nullable;

public class cow extends cok {
   private static final akj<Byte> a = akn.a(cow.class, akl.a);
   private static final float b = 0.1F;

   public cow(bwr<? extends cow> $$0, djh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.bD.a(1, new cdz(this));
      this.bD.a(2, new cdm<>(this, cko.class, 6.0F, 1.0, 1.2, $$0 -> !((cko)$$0).t()));
      this.bD.a(3, new cel(this, 0.4F));
      this.bD.a(4, new cow.a(this));
      this.bD.a(5, new cfs(this, 0.8));
      this.bD.a(6, new cen(this, crj.class, 8.0F));
      this.bD.a(6, new cfa(this));
      this.bE.a(1, new cfx(this));
      this.bE.a(2, new cow.c<>(this, crj.class));
      this.bE.a(3, new cow.c<>(this, cjp.class));
   }

   @Override
   protected cgt b(djh $$0) {
      return new cgu(this, $$0);
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(a, (byte)0);
   }

   @Override
   public void h() {
      super.h();
      if (!this.dU().C) {
         this.w(this.P);
      }
   }

   public static byo.a m() {
      return cok.gw().a(byp.s, 16.0).a(byp.v, 0.3F);
   }

   @Override
   protected awm u() {
      return awn.zP;
   }

   @Override
   protected awm e(bux $$0) {
      return awn.zR;
   }

   @Override
   protected awm l_() {
      return awn.zQ;
   }

   @Override
   protected void b(iv $$0, eao $$1) {
      this.a(awn.zS, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.n();
   }

   @Override
   public void a(eao $$0, fex $$1) {
      if (!$$0.a(dmo.bz)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public boolean b(bvm $$0) {
      return $$0.a(bvo.s) ? false : super.b($$0);
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
   public byb a(djy $$0, bue $$1, bwq $$2, @Nullable byb $$3) {
      $$3 = super.a($$0, $$1, $$2, $$3);
      azv $$4 = $$0.C_();
      if ($$4.a(100) == 0) {
         cot $$5 = bwr.bf.a(this.dU(), bwq.g);
         if ($$5 != null) {
            $$5.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
            $$5.a($$0, $$1, $$2, null);
            $$5.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cow.b();
         if ($$0.an() == bud.d && $$4.i() < 0.1F * $$1.d()) {
            ((cow.b)$$3).a($$4);
         }
      }

      if ($$3 instanceof cow.b $$6) {
         jf<bvk> $$7 = $$6.a;
         if ($$7 != null) {
            this.a(new bvm($$7, -1));
         }
      }

      return $$3;
   }

   @Override
   public fex l(bwi $$0) {
      return $$0.dp() <= this.dp() ? new fex(0.0, 0.3125 * (double)this.ek(), 0.0) : super.l($$0);
   }

   static class a extends cep {
      public a(cow $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean b() {
         return super.b() && !this.a.bY();
      }

      @Override
      public boolean c() {
         float $$0 = this.a.bv();
         if ($$0 >= 0.5F && this.a.dX().a(100) == 0) {
            this.a.g(null);
            return false;
         } else {
            return super.c();
         }
      }
   }

   public static class b implements byb {
      @Nullable
      public jf<bvk> a;

      public void a(azv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bvo.a;
         } else if ($$1 <= 2) {
            this.a = bvo.e;
         } else if ($$1 <= 3) {
            this.a = bvo.j;
         } else if ($$1 <= 4) {
            this.a = bvo.n;
         }
      }
   }

   static class c<T extends bxj> extends cfy<T> {
      public c(cow $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean b() {
         float $$0 = this.e.bv();
         return $$0 >= 0.5F ? false : super.b();
      }
   }
}
