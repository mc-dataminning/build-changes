import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzt extends bzi {
   private static final aef<Byte> b = aei.a(bzt.class, aeh.a);
   private static final float c = 0.1F;

   public bzt(biu<? extends bzt> $$0, cpv $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpv(this));
      this.bO.a(3, new bqh(this, 0.4F));
      this.bO.a(4, new bzt.a(this));
      this.bO.a(5, new bro(this, 0.8));
      this.bO.a(6, new bqj(this, cbu.class, 8.0F));
      this.bO.a(6, new bqw(this));
      this.bP.a(1, new brt(this));
      this.bP.a(2, new bzt.c<>(this, cbu.class));
      this.bP.a(3, new bzt.c<>(this, bvd.class));
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsp b(cpv $$0) {
      return new bsq(this, $$0);
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

   public static bkl.a t() {
      return bzi.gj().a(bkm.a, 16.0).a(bkm.d, 0.3F);
   }

   @Override
   protected apd w() {
      return ape.wY;
   }

   @Override
   protected apd d(bho $$0) {
      return ape.xa;
   }

   @Override
   protected apd l_() {
      return ape.wZ;
   }

   @Override
   protected void b(gw $$0, dfj $$1) {
      this.a(ape.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean c_() {
      return this.y();
   }

   @Override
   public void a(dfj $$0, ehn $$1) {
      if (!$$0.a(csw.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjl eR() {
      return bjl.c;
   }

   @Override
   public boolean c(bid $$0) {
      return $$0.c() == bif.s ? false : super.c($$0);
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
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qx $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      asc $$5 = $$0.D_();
      if ($$5.a(100) == 0) {
         bzq $$6 = biu.aJ.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzt.b();
         if ($$0.ai() == bgv.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzt.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzt.b $$7) {
         bib $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bid($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bjs $$0, bir $$1) {
      return 0.65F;
   }

   @Override
   protected float l(biq $$0) {
      return $$0.dg() <= this.dg() ? -0.3125F : 0.0F;
   }

   static class a extends bql {
      public a(bzt $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bn();
         if ($$0 >= 0.5F && this.a.ef().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bjz {
      @Nullable
      public bib a;

      public void a(asc $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bif.a;
         } else if ($$1 <= 2) {
            this.a = bif.e;
         } else if ($$1 <= 3) {
            this.a = bif.j;
         } else if ($$1 <= 4) {
            this.a = bif.n;
         }
      }
   }

   static class c<T extends bjg> extends bru<T> {
      public c(bzt $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bn();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
