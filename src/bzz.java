import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzz extends bzo {
   private static final aef<Byte> b = aei.a(bzz.class, aeh.a);
   private static final float c = 0.1F;

   public bzz(bja<? extends bzz> $$0, cqb $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bqb(this));
      this.bO.a(3, new bqn(this, 0.4F));
      this.bO.a(4, new bzz.a(this));
      this.bO.a(5, new bru(this, 0.8));
      this.bO.a(6, new bqp(this, cca.class, 8.0F));
      this.bO.a(6, new brc(this));
      this.bP.a(1, new brz(this));
      this.bP.a(2, new bzz.c<>(this, cca.class));
      this.bP.a(3, new bzz.c<>(this, bvj.class));
   }

   @Override
   protected Vector3f a(biw $$0, bix $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsv b(cqb $$0) {
      return new bsw(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dL().B) {
         this.w(this.P);
      }
   }

   public static bkr.a t() {
      return bzo.gk().a(bks.l, 16.0).a(bks.m, 0.3F);
   }

   @Override
   protected apf w() {
      return apg.wY;
   }

   @Override
   protected apf d(bhu $$0) {
      return apg.xa;
   }

   @Override
   protected apf l_() {
      return apg.wZ;
   }

   @Override
   protected void b(gw $$0, dfd $$1) {
      this.a(apg.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean c_() {
      return this.y();
   }

   @Override
   public void a(dfd $$0, ehh $$1) {
      if (!$$0.a(cte.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjr eR() {
      return bjr.c;
   }

   @Override
   public boolean c(bij $$0) {
      return $$0.c() == bil.s ? false : super.c($$0);
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
   public bkf a(cqq $$0, bhc $$1, bjq $$2, @Nullable bkf $$3, @Nullable qw $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ash $$5 = $$0.D_();
      if ($$5.a(100) == 0) {
         bzw $$6 = bja.aJ.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzz.b();
         if ($$0.ai() == bhb.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzz.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzz.b $$7) {
         bih $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bij($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bjy $$0, bix $$1) {
      return 0.65F;
   }

   @Override
   protected float l(biw $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bqr {
      public a(bzz $$0) {
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

   public static class b implements bkf {
      @Nullable
      public bih a;

      public void a(ash $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bil.a;
         } else if ($$1 <= 2) {
            this.a = bil.e;
         } else if ($$1 <= 3) {
            this.a = bil.j;
         } else if ($$1 <= 4) {
            this.a = bil.n;
         }
      }
   }

   static class c<T extends bjm> extends bsa<T> {
      public c(bzz $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
