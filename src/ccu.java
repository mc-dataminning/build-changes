import javax.annotation.Nullable;
import org.joml.Vector3f;

public class ccu extends ccj {
   private static final agj<Byte> b = agm.a(ccu.class, agl.a);
   private static final float c = 0.1F;

   public ccu(blt<? extends ccu> $$0, cti $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsv(this));
      this.bO.a(3, new bth(this, 0.4F));
      this.bO.a(4, new ccu.a(this));
      this.bO.a(5, new buo(this, 0.8));
      this.bO.a(6, new btj(this, cfb.class, 8.0F));
      this.bO.a(6, new btw(this));
      this.bP.a(1, new but(this));
      this.bP.a(2, new ccu.c<>(this, cfb.class));
      this.bP.a(3, new ccu.c<>(this, bye.class));
   }

   @Override
   protected Vector3f a(blp $$0, blq $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bvp b(cti $$0) {
      return new bvq(this, $$0);
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

   public static bnk.a w() {
      return ccj.gk().a(bnl.l, 16.0).a(bnl.m, 0.3F);
   }

   @Override
   protected arl y() {
      return arm.xO;
   }

   @Override
   protected arl d(bkn $$0) {
      return arm.xQ;
   }

   @Override
   protected arl n_() {
      return arm.xP;
   }

   @Override
   protected void b(hx $$0, dja $$1) {
      this.a(arm.xR, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dja $$0, elm $$1) {
      if (!$$0.a(cwl.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bmk eS() {
      return bmk.c;
   }

   @Override
   public boolean c(blc $$0) {
      return $$0.c() == ble.s ? false : super.c($$0);
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
   public bmy a(ctx $$0, bjt $$1, bmj $$2, @Nullable bmy $$3, @Nullable sl $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      aup $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         ccr $$6 = blt.aK.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new ccu.b();
         if ($$0.ak() == bjs.d && $$5.i() < 0.1F * $$1.d()) {
            ((ccu.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof ccu.b $$7) {
         bla $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new blc($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bmr $$0, blq $$1) {
      return 0.65F;
   }

   @Override
   protected float l(blp $$0) {
      return $$0.dg() <= this.dg() ? -0.3125F : 0.0F;
   }

   static class a extends btl {
      public a(ccu $$0) {
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

   public static class b implements bmy {
      @Nullable
      public bla a;

      public void a(aup $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = ble.a;
         } else if ($$1 <= 2) {
            this.a = ble.e;
         } else if ($$1 <= 3) {
            this.a = ble.j;
         } else if ($$1 <= 4) {
            this.a = ble.n;
         }
      }
   }

   static class c<T extends bmf> extends buu<T> {
      public c(ccu $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
