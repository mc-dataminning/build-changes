import javax.annotation.Nullable;
import org.joml.Vector3f;

public class bzv extends bzk {
   private static final aeg<Byte> b = aej.a(bzv.class, aei.a);
   private static final float c = 0.1F;

   public bzv(biw<? extends bzv> $$0, cpx $$1) {
      super($$0, $$1);
   }

   @Override
   protected void z() {
      this.bO.a(1, new bpx(this));
      this.bO.a(3, new bqj(this, 0.4F));
      this.bO.a(4, new bzv.a(this));
      this.bO.a(5, new brq(this, 0.8));
      this.bO.a(6, new bql(this, cbw.class, 8.0F));
      this.bO.a(6, new bqy(this));
      this.bP.a(1, new brv(this));
      this.bP.a(2, new bzv.c<>(this, cbw.class));
      this.bP.a(3, new bzv.c<>(this, bvf.class));
   }

   @Override
   protected Vector3f a(bis $$0, bit $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bsr b(cpx $$0) {
      return new bss(this, $$0);
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

   public static bkn.a t() {
      return bzk.gj().a(bko.a, 16.0).a(bko.d, 0.3F);
   }

   @Override
   protected ape w() {
      return apf.wY;
   }

   @Override
   protected ape d(bhq $$0) {
      return apf.xa;
   }

   @Override
   protected ape l_() {
      return apf.wZ;
   }

   @Override
   protected void b(gw $$0, dfl $$1) {
      this.a(apf.xb, 0.15F, 1.0F);
   }

   @Override
   public boolean c_() {
      return this.y();
   }

   @Override
   public void a(dfl $$0, ehp $$1) {
      if (!$$0.a(csy.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bjn eR() {
      return bjn.c;
   }

   @Override
   public boolean c(bif $$0) {
      return $$0.c() == bih.s ? false : super.c($$0);
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
   public bkb a(cqm $$0, bgy $$1, bjm $$2, @Nullable bkb $$3, @Nullable qy $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      ase $$5 = $$0.D_();
      if ($$5.a(100) == 0) {
         bzs $$6 = biw.aJ.a(this.dL());
         if ($$6 != null) {
            $$6.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new bzv.b();
         if ($$0.ai() == bgx.d && $$5.i() < 0.1F * $$1.d()) {
            ((bzv.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof bzv.b $$7) {
         bid $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bif($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bju $$0, bit $$1) {
      return 0.65F;
   }

   @Override
   protected float l(bis $$0) {
      return $$0.df() <= this.df() ? -0.3125F : 0.0F;
   }

   static class a extends bqn {
      public a(bzv $$0) {
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

   public static class b implements bkb {
      @Nullable
      public bid a;

      public void a(ase $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bih.a;
         } else if ($$1 <= 2) {
            this.a = bih.e;
         } else if ($$1 <= 3) {
            this.a = bih.j;
         } else if ($$1 <= 4) {
            this.a = bih.n;
         }
      }
   }

   static class c<T extends bji> extends brw<T> {
      public c(bzv $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bm();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
