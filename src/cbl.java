import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbl extends cba {
   private static final afm<Byte> b = afp.a(cbl.class, afo.a);
   private static final float c = 0.1F;

   public cbl(bkm<? extends cbl> $$0, crs $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new brn(this));
      this.bO.a(3, new brz(this, 0.4F));
      this.bO.a(4, new cbl.a(this));
      this.bO.a(5, new btg(this, 0.8));
      this.bO.a(6, new bsb(this, cdm.class, 8.0F));
      this.bO.a(6, new bso(this));
      this.bP.a(1, new btl(this));
      this.bP.a(2, new cbl.c<>(this, cdm.class));
      this.bP.a(3, new cbl.c<>(this, bwv.class));
   }

   @Override
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected buh b(crs $$0) {
      return new bui(this, $$0);
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         this.w(this.P);
      }
   }

   public static bmd.a t() {
      return cba.gk().a(bme.l, 16.0).a(bme.m, 0.3F);
   }

   @Override
   protected aqm w() {
      return aqn.xc;
   }

   @Override
   protected aqm d(bjg $$0) {
      return aqn.xe;
   }

   @Override
   protected aqm m_() {
      return aqn.xd;
   }

   @Override
   protected void b(ht $$0, dgw $$1) {
      this.a(aqn.xf, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.y();
   }

   @Override
   public void a(dgw $$0, eji $$1) {
      if (!$$0.a(cuv.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bld eR() {
      return bld.c;
   }

   @Override
   public boolean c(bjv $$0) {
      return $$0.c() == bjx.s ? false : super.c($$0);
   }

   public boolean y() {
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
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ato $$5 = $$0.E_();
      if ($$5.a(100) == 0) {
         cbi $$6 = bkm.aJ.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cbl.b();
         if ($$0.ai() == bin.d && $$5.i() < 0.1F * $$1.d()) {
            ((cbl.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cbl.b $$7) {
         bjt $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bjv($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(blk $$0, bkj $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bki $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bsd {
      public a(cbl $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bO();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bm();
         if ($$0 >= 0.5F && this.a.ef().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements blr {
      @Nullable
      public bjt a;

      public void a(ato $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bjx.a;
         } else if ($$1 <= 2) {
            this.a = bjx.e;
         } else if ($$1 <= 3) {
            this.a = bjx.j;
         } else if ($$1 <= 4) {
            this.a = bjx.n;
         }
      }
   }

   static class c<T extends bky> extends btm<T> {
      public c(cbl $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
