import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cns extends cmo {
   private static final aks<Boolean> cc = akw.a(cns.class, aku.k);
   private static final aks<Boolean> cd = akw.a(cns.class, aku.k);
   private static final int ce = 15;
   private static final int cf = 1;
   private static final float cg = 3.0F;
   private static final float ch = 32.0F;
   private static final float ci = 144.0F;
   public static final int a = 40;
   private static final float cj = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   private int ck;
   public final but bZ = new but();
   public final but ca = new but();
   public final but cb = new but();

   public cns(bvi<? extends cns> $$0, dgz $$1) {
      super($$0, $$1);
      this.bP = new cns.c(this);
      this.bQ = new cns.d(this);
      this.bR = new cns.b(this);
      cfi $$2 = (cfi)this.L();
      $$2.a(true);
      this.bO = 0;
   }

   @Override
   protected cbt G() {
      return new cns.a(this);
   }

   @Override
   protected bwz.b<cns> ed() {
      return cnt.a();
   }

   @Override
   protected bwz<?> a(Dynamic<?> $$0) {
      return cnt.d(this.ed().a($$0));
   }

   @Override
   protected void a(akw.a $$0) {
      super.a($$0);
      $$0.a(cc, true);
      $$0.a(cd, false);
   }

   public static bxe.a m() {
      return cmo.gt().a(bxf.s, 1.0).a(bxf.v, 0.4F).a(bxf.c, 3.0).a(bxf.m, 32.0).a(bxf.B, 1.0625);
   }

   public boolean p() {
      return this.al.a(cc);
   }

   @Override
   public boolean c(arx $$0, bvb $$1) {
      if (!($$1 instanceof bvx)) {
         return false;
      } else {
         this.ck = 15;
         this.dW().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean bI() {
      return super.bI() && this.p();
   }

   @Override
   public bwz<cns> ec() {
      return (bwz<cns>)super.ec();
   }

   @Override
   protected void a(arx $$0) {
      bpj $$1 = bpi.a();
      $$1.a("creakingBrain");
      this.ec().a((arx)this.dW(), this);
      $$1.c();
      cnt.a(this);
   }

   @Override
   public void d_() {
      if (this.ck > 0) {
         this.ck--;
      }

      if (!this.dW().C) {
         boolean $$0 = this.al.a(cc);
         boolean $$1 = this.t();
         if ($$1 != $$0) {
            this.a(eck.u);
            if ($$1) {
               this.b(awv.gr);
            } else {
               this.U();
               this.b(awv.gq);
            }
         }

         this.al.a(cc, $$1);
      }

      super.d_();
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         this.gp();
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gp() {
      this.bZ.a(this.ck > 0, this.af);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.ck = 15;
         this.gf();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void gf() {
      this.b(awv.gn);
   }

   @Override
   protected awu u() {
      return this.go() ? null : awv.gk;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.gt;
   }

   @Override
   protected awu o_() {
      return awv.go;
   }

   @Override
   protected void b(jh $$0, dxo $$1) {
      this.a(awv.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bvx O_() {
      return this.O();
   }

   @Override
   protected void Y() {
      super.Y();
      agy.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.p()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean t() {
      List<cpo> $$0 = this.bF.c(cfb.j).orElse(List.of());
      boolean $$1 = this.go();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.x();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cpo $$3 : $$0) {
            if (this.c((bvx)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bvx.aH.test($$3))
                  && this.a($$3, 0.5, false, true, new double[]{this.dF(), this.dD() + 0.5 * (double)this.ek(), (this.dF() + this.dD()) / 2.0})) {
                  if ($$1) {
                     return false;
                  }

                  if ($$3.g(this) < 144.0) {
                     this.a($$3);
                     return false;
                  }
               }
            }
         }

         if (!$$2 && $$1) {
            this.x();
         }

         return true;
      }
   }

   public void a(cpo $$0) {
      this.ec().a(cfb.o, $$0);
      this.a(eck.u);
      this.b(awv.gl);
      this.x(true);
   }

   public void x() {
      this.ec().b(cfb.o);
      this.a(eck.u);
      this.b(awv.gm);
      this.x(false);
   }

   public void x(boolean $$0) {
      this.al.a(cd, $$0);
   }

   public boolean go() {
      return this.al.a(cd);
   }

   @Override
   public float a(jh $$0, dhc $$1) {
      return 0.0F;
   }

   class a extends cbt {
      public a(final cns $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cns.this.p()) {
            super.a();
         }
      }
   }

   class b extends cbw {
      public b(final cns $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cns.this.p()) {
            super.b();
         } else {
            cns.this.t(false);
         }
      }
   }

   class c extends cbx {
      public c(final cns $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cns.this.p()) {
            super.a();
         }
      }
   }

   class d extends cby {
      public d(final cns $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cns.this.p()) {
            super.a();
         }
      }
   }
}
