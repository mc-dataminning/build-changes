import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbt extends cbi {
   private static final afo<Byte> b = afr.a(cbt.class, afq.a);
   private static final float c = 0.1F;

   public cbt(bku<? extends cbt> $$0, csa $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new brv(this));
      this.bO.a(3, new bsh(this, 0.4F));
      this.bO.a(4, new cbt.a(this));
      this.bO.a(5, new bto(this, 0.8));
      this.bO.a(6, new bsj(this, cdu.class, 8.0F));
      this.bO.a(6, new bsw(this));
      this.bP.a(1, new btt(this));
      this.bP.a(2, new cbt.c<>(this, cdu.class));
      this.bP.a(3, new cbt.c<>(this, bxd.class));
   }

   @Override
   protected Vector3f a(bkq $$0, bkr $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bup b(csa $$0) {
      return new buq(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         this.w(this.P);
      }
   }

   public static bml.a w() {
      return cbi.gl().a(bmm.l, 16.0).a(bmm.m, 0.3F);
   }

   @Override
   protected aqq y() {
      return aqr.xt;
   }

   @Override
   protected aqq d(bjo $$0) {
      return aqr.xv;
   }

   @Override
   protected aqq m_() {
      return aqr.xu;
   }

   @Override
   protected void b(ht $$0, dhi $$1) {
      this.a(aqr.xw, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.A();
   }

   @Override
   public void a(dhi $$0, eju $$1) {
      if (!$$0.a(cvc.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bll eT() {
      return bll.c;
   }

   @Override
   public boolean c(bkd $$0) {
      return $$0.c() == bkf.s ? false : super.c($$0);
   }

   public boolean A() {
      return (this.an.b(b) & 1) != 0;
   }

   public void w(boolean $$0) {
      byte $$1 = this.an.b(b);
      if ($$0) {
         $$1 = (byte)($$1 | 1);
      } else {
         $$1 = (byte)($$1 & -2);
      }

      this.an.b(b, $$1);
   }

   @Nullable
   @Override
   public blz a(csp $$0, biv $$1, blk $$2, @Nullable blz $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ats $$5 = $$0.E_();
      if ($$5.a(100) == 0) {
         cbq $$6 = bku.aJ.a(this.dN());
         if ($$6 != null) {
            $$6.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cbt.b();
         if ($$0.aj() == biu.d && $$5.i() < 0.1F * $$1.d()) {
            ((cbt.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cbt.b $$7) {
         bkb $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bkd($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bls $$0, bkr $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bkq $$0) {
      return $$0.dh() <= this.dh() ? -0.3125F : 0.0F;
   }

   static class a extends bsl {
      public a(cbt $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bo();
         if ($$0 >= 0.5F && this.a.eh().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements blz {
      @Nullable
      public bkb a;

      public void a(ats $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bkf.a;
         } else if ($$1 <= 2) {
            this.a = bkf.e;
         } else if ($$1 <= 3) {
            this.a = bkf.j;
         } else if ($$1 <= 4) {
            this.a = bkf.n;
         }
      }
   }

   static class c<T extends blg> extends btu<T> {
      public c(cbt $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
