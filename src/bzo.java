import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzo extends bzd {
   private static final aec<Byte> b = aef.a(bzo.class, aee.a);
   private static final float c = 0.1F;

   public bzo(bip<? extends bzo> $$0, cpq $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpq(this));
      this.bO.a(3, new bqc(this, 0.4F));
      this.bO.a(4, new bzo.a(this));
      this.bO.a(5, new brj(this, 0.8));
      this.bO.a(6, new bqe(this, cbp.class, 8.0F));
      this.bO.a(6, new bqr(this));
      this.bP.a(1, new bro(this));
      this.bP.a(2, new bzo.c<>(this, cbp.class));
      this.bP.a(3, new bzo.c<>(this, buy.class));
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsk b(cpq $$0) {
      return new bsl(this, $$0);
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dK().B) {
         this.w(this.P);
      }
   }

   public static bkg.a q() {
      return bzd.gg().a(bkh.a, 16.0).a(bkh.d, 0.3F);
   }

   @Override
   protected aoy r() {
      return aoz.wY;
   }

   @Override
   protected aoy d(bhj $$0) {
      return aoz.xa;
   }

   @Override
   protected aoy h_() {
      return aoz.wZ;
   }

   @Override
   protected void b(gw $$0, dfe $$1) {
      this.a(aoz.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean j_() {
      return this.t();
   }

   @Override
   public void a(dfe $$0, ehi $$1) {
      if (!$$0.a(csr.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjg eQ() {
      return bjg.c;
   }

   @Override
   public boolean c(bhy $$0) {
      return $$0.c() == bia.s ? false : super.c($$0);
   }

   public boolean t() {
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
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      arx $$5 = $$0.y_();
      if ($$5.a(100) == 0) {
         bzl $$6 = bip.aJ.a(this.dK());
         if ($$6 != null) {
            $$6.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzo.b();
         if ($$0.ai() == bgq.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzo.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzo.b $$7) {
         bhw $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bhy($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bjn $$0, bim $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bil $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bqg {
      public a(bzo $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bO();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bm();
         if ($$0 >= 0.5F && this.a.ee().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bju {
      @Nullable
      public bhw a;

      public void a(arx $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bia.a;
         } else if ($$1 <= 2) {
            this.a = bia.e;
         } else if ($$1 <= 3) {
            this.a = bia.j;
         } else if ($$1 <= 4) {
            this.a = bia.n;
         }
      }
   }

   static class c<T extends bjb> extends brp<T> {
      public c(bzo $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
