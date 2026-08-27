import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzl extends bza {
   private static final adz<Byte> b = aec.a(bzl.class, aeb.a);
   private static final float c = 0.1F;

   public bzl(bim<? extends bzl> $$0, cpl $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpn(this));
      this.bO.a(3, new bpz(this, 0.4F));
      this.bO.a(4, new bzl.a(this));
      this.bO.a(5, new brg(this, 0.8));
      this.bO.a(6, new bqb(this, cbm.class, 8.0F));
      this.bO.a(6, new bqo(this));
      this.bP.a(1, new brl(this));
      this.bP.a(2, new bzl.c<>(this, cbm.class));
      this.bP.a(3, new bzl.c<>(this, buv.class));
   }

   @Override
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsh b(cpl $$0) {
      return new bsi(this, $$0);
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

   public static bkd.a q() {
      return bza.gg().a(bke.a, 16.0).a(bke.d, 0.3F);
   }

   @Override
   protected aov r() {
      return aow.wY;
   }

   @Override
   protected aov d(bhg $$0) {
      return aow.xa;
   }

   @Override
   protected aov h_() {
      return aow.wZ;
   }

   @Override
   protected void b(gu $$0, dez $$1) {
      this.a(aow.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean j_() {
      return this.t();
   }

   @Override
   public void a(dez $$0, ehd $$1) {
      if (!$$0.a(csm.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjd eQ() {
      return bjd.c;
   }

   @Override
   public boolean c(bhv $$0) {
      return $$0.c() == bhx.s ? false : super.c($$0);
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
   public bjr a(cqa $$0, bgo $$1, bjc $$2, @Nullable bjr $$3, @Nullable qr $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      aru $$5 = $$0.y_();
      if ($$5.a(100) == 0) {
         bzi $$6 = bim.aJ.a(this.dK());
         if ($$6 != null) {
            $$6.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzl.b();
         if ($$0.ai() == bgn.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzl.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzl.b $$7) {
         bht $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bhv($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bjk $$0, bij $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bii $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bqd {
      public a(bzl $$0) {
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

   public static class b implements bjr {
      @Nullable
      public bht a;

      public void a(aru $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bhx.a;
         } else if ($$1 <= 2) {
            this.a = bhx.e;
         } else if ($$1 <= 3) {
            this.a = bhx.j;
         } else if ($$1 <= 4) {
            this.a = bhx.n;
         }
      }
   }

   static class c<T extends biy> extends brm<T> {
      public c(bzl $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
