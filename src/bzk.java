import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzk extends byz {
   private static final adx<Byte> b = aea.a(bzk.class, adz.a);
   private static final float c = 0.1F;

   public bzk(bik<? extends bzk> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   protected void w() {
      this.bO.a(1, new bpm(this));
      this.bO.a(3, new bpy(this, 0.4F));
      this.bO.a(4, new bzk.a(this));
      this.bO.a(5, new brf(this, 0.8));
      this.bO.a(6, new bqa(this, cbl.class, 8.0F));
      this.bO.a(6, new bqn(this));
      this.bP.a(1, new brk(this));
      this.bP.a(2, new bzk.c<>(this, cbl.class));
      this.bP.a(3, new bzk.c<>(this, buu.class));
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsg b(cpk $$0) {
      return new bsh(this, $$0);
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

   public static bkc.a q() {
      return byz.gf().a(bkd.a, 16.0).a(bkd.d, 0.3F);
   }

   @Override
   protected aot r() {
      return aou.wY;
   }

   @Override
   protected aot d(bhe $$0) {
      return aou.xa;
   }

   @Override
   protected aot h_() {
      return aou.wZ;
   }

   @Override
   protected void b(gv $$0, dey $$1) {
      this.a(aou.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean j_() {
      return this.t();
   }

   @Override
   public void a(dey $$0, ehf $$1) {
      if (!$$0.a(csl.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjb eQ() {
      return bjb.c;
   }

   @Override
   public boolean c(bht $$0) {
      return $$0.c() == bhv.s ? false : super.c($$0);
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
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      art $$5 = $$0.y_();
      if ($$5.a(100) == 0) {
         bzh $$6 = bik.aJ.a(this.dK());
         if ($$6 != null) {
            $$6.b(this.dp(), this.dr(), this.dv(), this.dA(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzk.b();
         if ($$0.ai() == bgl.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzk.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzk.b $$7) {
         bhr $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bht($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bji $$0, bih $$1) {
      return 0.65F;
   }

   @Override
   protected float l(big $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bqc {
      public a(bzk $$0) {
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

      @Override
      protected double a(biw $$0) {
         return (double)(4.0F + $$0.df());
      }
   }

   public static class b implements bjq {
      @Nullable
      public bhr a;

      public void a(art $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bhv.a;
         } else if ($$1 <= 2) {
            this.a = bhv.e;
         } else if ($$1 <= 3) {
            this.a = bhv.j;
         } else if ($$1 <= 4) {
            this.a = bhv.n;
         }
      }
   }

   static class c<T extends biw> extends brl<T> {
      public c(bzk $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
