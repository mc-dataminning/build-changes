import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cda extends ccp {
   private static final agm<Byte> b = agp.a(cda.class, ago.a);
   private static final float c = 0.1F;

   public cda(blz<? extends cda> $$0, ctp $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new btb(this));
      this.bO.a(3, new btn(this, 0.4F));
      this.bO.a(4, new cda.a(this));
      this.bO.a(5, new buu(this, 0.8));
      this.bO.a(6, new btp(this, cfi.class, 8.0F));
      this.bO.a(6, new buc(this));
      this.bP.a(1, new buz(this));
      this.bP.a(2, new cda.c<>(this, cfi.class));
      this.bP.a(3, new cda.c<>(this, byk.class));
   }

   @Override
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bvv b(ctp $$0) {
      return new bvw(this, $$0);
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

   public static bnq.a w() {
      return ccp.gk().a(bnr.l, 16.0).a(bnr.m, 0.3F);
   }

   @Override
   protected arr y() {
      return ars.xO;
   }

   @Override
   protected arr d(bkt $$0) {
      return ars.xQ;
   }

   @Override
   protected arr n_() {
      return ars.xP;
   }

   @Override
   protected void b(hx $$0, djh $$1) {
      this.a(ars.xR, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(djh $$0, elt $$1) {
      if (!$$0.a(cws.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bmq eS() {
      return bmq.c;
   }

   @Override
   public boolean c(bli $$0) {
      return $$0.c() == blk.s ? false : super.c($$0);
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
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auv $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         ccx $$6 = blz.aK.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cda.b();
         if ($$0.ak() == bjy.d && $$5.i() < 0.1F * $$1.d()) {
            ((cda.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cda.b $$7) {
         blg $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bli($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bmx $$0, blw $$1) {
      return 0.65F;
   }

   @Override
   protected float l(blv $$0) {
      return $$0.dg() <= this.dg() ? -0.3125F : 0.0F;
   }

   static class a extends btr {
      public a(cda $$0) {
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

   public static class b implements bne {
      @Nullable
      public blg a;

      public void a(auv $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = blk.a;
         } else if ($$1 <= 2) {
            this.a = blk.e;
         } else if ($$1 <= 3) {
            this.a = blk.j;
         } else if ($$1 <= 4) {
            this.a = blk.n;
         }
      }
   }

   static class c<T extends bml> extends bva<T> {
      public c(cda $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
