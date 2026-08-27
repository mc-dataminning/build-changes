import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccz extends cco {
   private static final agm<Byte> b = agp.a(ccz.class, ago.a);
   private static final float c = 0.1F;

   public ccz(bly<? extends ccz> $$0, cto $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bta(this));
      this.bO.a(3, new btm(this, 0.4F));
      this.bO.a(4, new ccz.a(this));
      this.bO.a(5, new but(this, 0.8));
      this.bO.a(6, new bto(this, cfh.class, 8.0F));
      this.bO.a(6, new bub(this));
      this.bP.a(1, new buy(this));
      this.bP.a(2, new ccz.c<>(this, cfh.class));
      this.bP.a(3, new ccz.c<>(this, byj.class));
   }

   @Override
   protected Vector3f a(blu $$0, blv $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bvu b(cto $$0) {
      return new bvv(this, $$0);
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(b, (byte)0);
   }

   @Override
   public void l() {
      super.l();
      if (!this.dM().B) {
         this.w(this.P);
      }
   }

   public static bnp.a w() {
      return cco.gk().a(bnq.l, 16.0).a(bnq.m, 0.3F);
   }

   @Override
   protected arq y() {
      return arr.xO;
   }

   @Override
   protected arq d(bks $$0) {
      return arr.xQ;
   }

   @Override
   protected arq n_() {
      return arr.xP;
   }

   @Override
   protected void b(hx $$0, djg $$1) {
      this.a(arr.xR, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(djg $$0, els $$1) {
      if (!$$0.a(cwr.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bmp eS() {
      return bmp.c;
   }

   @Override
   public boolean c(blh $$0) {
      return $$0.c() == blj.s ? false : super.c($$0);
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
   public bnd a(cud $$0, bjy $$1, bmo $$2, @Nullable bnd $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auu $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         ccw $$6 = bly.aK.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ccz.b();
         if ($$0.ak() == bjx.d && $$5.i() < 0.1F * $$1.d()) {
            ((ccz.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof ccz.b $$7) {
         blf $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new blh($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bmw $$0, blv $$1) {
      return 0.65F;
   }

   @Override
   protected float l(blu $$0) {
      return $$0.dg() <= this.dg() ? -0.3125F : 0.0F;
   }

   static class a extends btq {
      public a(ccz $$0) {
         super($$0, 1.0, true);
      }

      @Override
      public boolean a() {
         return super.a() && !this.a.bP();
      }

      @Override
      public boolean b() {
         float $$0 = this.a.bo();
         if ($$0 >= 0.5F && this.a.eg().a(100) == 0) {
            this.a.h(null);
            return false;
         } else {
            return super.b();
         }
      }
   }

   public static class b implements bnd {
      @Nullable
      public blf a;

      public void a(auu $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = blj.a;
         } else if ($$1 <= 2) {
            this.a = blj.e;
         } else if ($$1 <= 3) {
            this.a = blj.j;
         } else if ($$1 <= 4) {
            this.a = blj.n;
         }
      }
   }

   static class c<T extends bmk> extends buz<T> {
      public c(ccz $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
