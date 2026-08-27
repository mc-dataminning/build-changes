import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cby extends cbn {
   private static final afs<Byte> b = afv.a(cby.class, afu.a);
   private static final float c = 0.1F;

   public cby(bkz<? extends cby> $$0, csf $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsa(this));
      this.bO.a(3, new bsm(this, 0.4F));
      this.bO.a(4, new cby.a(this));
      this.bO.a(5, new btt(this, 0.8));
      this.bO.a(6, new bso(this, cdz.class, 8.0F));
      this.bO.a(6, new btb(this));
      this.bP.a(1, new bty(this));
      this.bP.a(2, new cby.c<>(this, cdz.class));
      this.bP.a(3, new cby.c<>(this, bxi.class));
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected buu b(csf $$0) {
      return new buv(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dN().B) {
         this.w(this.P);
      }
   }

   public static bmq.a w() {
      return cbn.gl().a(bmr.l, 16.0).a(bmr.m, 0.3F);
   }

   @Override
   protected aqu y() {
      return aqv.xt;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.xv;
   }

   @Override
   protected aqu n_() {
      return aqv.xu;
   }

   @Override
   protected void b(hx $$0, dhn $$1) {
      this.a(aqv.xw, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dhn $$0, ejz $$1) {
      if (!$$0.a(cvh.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public blq eT() {
      return blq.c;
   }

   @Override
   public boolean c(bki $$0) {
      return $$0.c() == bkk.s ? false : super.c($$0);
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
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      atw $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         cbv $$6 = bkz.aJ.a(this.dN());
         if ($$6 != null) {
            $$6.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cby.b();
         if ($$0.aj() == biy.d && $$5.i() < 0.1F * $$1.d()) {
            ((cby.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cby.b $$7) {
         bkg $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bki($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bkv $$0) {
      return $$0.dh() <= this.dh() ? -0.3125F : 0.0F;
   }

   static class a extends bsq {
      public a(cby $$0) {
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

   public static class b implements bme {
      @Nullable
      public bkg a;

      public void a(atw $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bkk.a;
         } else if ($$1 <= 2) {
            this.a = bkk.e;
         } else if ($$1 <= 3) {
            this.a = bkk.j;
         } else if ($$1 <= 4) {
            this.a = bkk.n;
         }
      }
   }

   static class c<T extends bll> extends btz<T> {
      public c(cby $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
