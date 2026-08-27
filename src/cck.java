import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cck extends cbz {
   private static final afz<Byte> b = agc.a(cck.class, agb.a);
   private static final float c = 0.1F;

   public cck(blj<? extends cck> $$0, csy $$1) {
      super($$0, $$1);
   }

   @Override
   protected void B() {
      this.bO.a(1, new bsl(this));
      this.bO.a(3, new bsx(this, 0.4F));
      this.bO.a(4, new cck.a(this));
      this.bO.a(5, new bue(this, 0.8));
      this.bO.a(6, new bsz(this, cer.class, 8.0F));
      this.bO.a(6, new btm(this));
      this.bP.a(1, new buj(this));
      this.bP.a(2, new cck.c<>(this, cer.class));
      this.bP.a(3, new cck.c<>(this, bxu.class));
   }

   @Override
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.85F, 0.0F);
   }

   @Override
   protected bvf b(csy $$0) {
      return new bvg(this, $$0);
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

   public static bna.a w() {
      return cbz.gk().a(bnb.l, 16.0).a(bnb.m, 0.3F);
   }

   @Override
   protected arb y() {
      return arc.xO;
   }

   @Override
   protected arb d(bkd $$0) {
      return arc.xQ;
   }

   @Override
   protected arb n_() {
      return arc.xP;
   }

   @Override
   protected void b(hv $$0, dip $$1) {
      this.a(arc.xR, 0.15F, 1.0F);
   }

   @Override
   public boolean e_() {
      return this.A();
   }

   @Override
   public void a(dip $$0, elb $$1) {
      if (!$$0.a(cwb.bs)) {
         super.a($$0, $$1);
      }
   }

   @Override
   public bma eS() {
      return bma.c;
   }

   @Override
   public boolean c(bks $$0) {
      return $$0.c() == bku.s ? false : super.c($$0);
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
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      $$3 = super.a($$0, $$1, $$2, $$3, $$4);
      auf $$5 = $$0.F_();
      if ($$5.a(100) == 0) {
         cch $$6 = blj.aK.a(this.dM());
         if ($$6 != null) {
            $$6.b(this.dr(), this.dt(), this.dx(), this.dC(), 0.0F);
            $$6.a($$0, $$1, $$2, null, null);
            $$6.n(this);
         }
      }

      if ($$3 == null) {
         $$3 = new cck.b();
         if ($$0.aj() == bji.d && $$5.i() < 0.1F * $$1.d()) {
            ((cck.b)$$3).a($$5);
         }
      }

      if ($$3 instanceof cck.b $$7) {
         bkq $$8 = $$7.a;
         if ($$8 != null) {
            this.b(new bks($$8, -1));
         }
      }

      return $$3;
   }

   @Override
   protected float b(bmh $$0, blg $$1) {
      return 0.65F;
   }

   @Override
   protected float l(blf $$0) {
      return $$0.dg() <= this.dg() ? -0.3125F : 0.0F;
   }

   static class a extends btb {
      public a(cck $$0) {
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

   public static class b implements bmo {
      @Nullable
      public bkq a;

      public void a(auf $$0) {
         int $$1 = $$0.a(5);
         if ($$1 <= 1) {
            this.a = bku.a;
         } else if ($$1 <= 2) {
            this.a = bku.e;
         } else if ($$1 <= 3) {
            this.a = bku.j;
         } else if ($$1 <= 4) {
            this.a = bku.n;
         }
      }
   }

   static class c<T extends blv> extends buk<T> {
      public c(cck $$0, Class<T> $$1) {
         super($$0, $$1, true);
      }

      @Override
      public boolean a() {
         float $$0 = this.e.bo();
         return $$0 >= 0.5F ? false : super.a();
      }
   }
}
