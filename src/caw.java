import javax.annotation.Nullable;
import org.joml.Vector3f;

public class caw extends cal {
   private static final afc<Byte> b = aff.a(caw.class, afe.a);
   private static final float c = 0.1F;

   public caw(bjx<? extends caw> $$0, cqz $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqy(this));
      this.bO.a(3, new brk(this, 0.4F));
      this.bO.a(4, new caw.a(this));
      this.bO.a(5, new bsr(this, 0.8));
      this.bO.a(6, new brm(this, ccx.class, 8.0F));
      this.bO.a(6, new brz(this));
      this.bP.a(1, new bsw(this));
      this.bP.a(2, new caw.c<>(this, ccx.class));
      this.bP.a(3, new caw.c<>(this, bwg.class));
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bts b(cqz $$0) {
      return new btt(this, $$0);
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

   public static blo.a t() {
      return cal.gk().a(blp.l, 16.0).a(blp.m, 0.3F);
   }

   @Override
   protected aqc w() {
      return aqd.xa;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.xc;
   }

   @Override
   protected aqc m_() {
      return aqd.xb;
   }

   @Override
   protected void b(ht $$0, dgb $$1) {
      this.a(aqd.xd, 0.15F, 1.0F);
   }

   @Override
   public boolean d_() {
      return this.y();
   }

   @Override
   public void a(dgb $$0, eif $$1) {
      if (!$$0.a(cuc.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bko eR() {
      return bko.c;
   }

   @Override
   public boolean c(bjg $$0) {
      return $$0.c() == bji.s ? false : super.c($$0);
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
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ate $$5 = $$0.E_();
      if ($$5.a(100) == 0) {
         cat $$6 = bjx.aJ.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new caw.b();
         if ($$0.ai() == bhy.d && $$5.i() < 0.1F * $$1.d()) {
            ((caw.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof caw.b $$7) {
         bje $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bjg($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bjt $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bro {
      public a(caw $$0) {
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

   public static class b implements blc {
      @Nullable
      public bje a;

      public void a(ate $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bji.a;
         } else if ($$1 <= 2) {
            this.a = bji.e;
         } else if ($$1 <= 3) {
            this.a = bji.j;
         } else if ($$1 <= 4) {
            this.a = bji.n;
         }
      }
   }

   static class c<T extends bkj> extends bsx<T> {
      public c(caw $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
