import com.mojang.serialization.Dynamic;
import java.util.List;
import javax.annotation.Nullable;

public class cnb extends clx {
   private static final ajx<Boolean> cb = akb.a(cnb.class, ajz.k);
   private static final ajx<Boolean> cc = akb.a(cnb.class, ajz.k);
   private static final int cd = 15;
   private static final int ce = 1;
   private static final float cf = 3.0F;
   private static final float cg = 32.0F;
   private static final float ch = 144.0F;
   public static final int a = 40;
   private static final float ci = 0.4F;
   public static final float b = 0.3F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   private int cj;
   public final buc bY = new buc();
   public final buc bZ = new buc();
   public final buc ca = new buc();

   public cnb(bur<? extends cnb> $$0, dgi $$1) {
      super($$0, $$1);
      this.bO = new cnb.c(this);
      this.bP = new cnb.d(this);
      this.bQ = new cnb.b(this);
      cer $$2 = (cer)this.L();
      $$2.a(true);
      this.bN = 0;
   }

   @Override
   protected cbc G() {
      return new cnb.a(this);
   }

   @Override
   protected bwi.b<cnb> ed() {
      return cnc.a();
   }

   @Override
   protected bwi<?> a(Dynamic<?> $$0) {
      return cnc.d(this.ed().a($$0));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(cb, true);
      $$0.a(cc, false);
   }

   public static bwn.a m() {
      return clx.gu().a(bwo.s, 1.0).a(bwo.v, 0.4F).a(bwo.c, 3.0).a(bwo.m, 32.0).a(bwo.B, 1.0625);
   }

   public boolean p() {
      return this.al.a(cb);
   }

   @Override
   public boolean c(arc $$0, buk $$1) {
      if (!($$1 instanceof bvg)) {
         return false;
      } else {
         this.cj = 15;
         this.dW().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean bI() {
      return super.bI() && this.p();
   }

   @Override
   public void j(double $$0, double $$1, double $$2) {
      if (this.p()) {
         super.j($$0, $$1, $$2);
      }
   }

   @Override
   public bwi<cnb> ec() {
      return (bwi<cnb>)super.ec();
   }

   @Override
   protected void a(arc $$0) {
      bos $$1 = bor.a();
      $$1.a("creakingBrain");
      this.ec().a((arc)this.dW(), this);
      $$1.c();
      cnc.a(this);
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      if (!this.dW().C) {
         boolean $$0 = this.al.a(cb);
         boolean $$1 = this.t();
         if ($$1 != $$0) {
            this.a(ebt.u);
            if ($$1) {
               this.b(awa.gr);
            } else {
               this.U();
               this.b(awa.gq);
            }
         }

         this.al.a(cb, $$1);
      }

      super.d_();
   }

   @Override
   public void h() {
      super.h();
      if (this.dW().C) {
         this.gq();
      }
   }

   @Override
   protected void B(float $$0) {
      float $$1 = Math.min($$0 * 25.0F, 3.0F);
      this.aT.a($$1, 0.4F, 1.0F);
   }

   private void gq() {
      this.bY.a(this.cj > 0, this.af);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 15;
         this.gg();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void gg() {
      this.b(awa.gn);
   }

   @Override
   protected avz u() {
      return this.gp() ? null : awa.gk;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.gt;
   }

   @Override
   protected avz o_() {
      return awa.go;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bvg O_() {
      return this.O();
   }

   @Override
   protected void Z() {
      super.Z();
      agc.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.p()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean t() {
      List<cox> $$0 = this.bE.c(cek.j).orElse(List.of());
      boolean $$1 = this.gp();
      if ($$0.isEmpty()) {
         if ($$1) {
            this.x();
         }

         return true;
      } else {
         boolean $$2 = false;

         for (cox $$3 : $$0) {
            if (this.c((bvg)$$3) && !this.s($$3)) {
               $$2 = true;
               if ((!$$1 || bvg.aH.test($$3))
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

   public void a(cox $$0) {
      this.ec().a(cek.o, $$0);
      this.a(ebt.u);
      this.b(awa.gl);
      this.x(true);
   }

   public void x() {
      this.ec().b(cek.o);
      this.a(ebt.u);
      this.b(awa.gm);
      this.x(false);
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public boolean gp() {
      return this.al.a(cc);
   }

   @Override
   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   class a extends cbc {
      public a(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.p()) {
            super.a();
         }
      }
   }

   class b extends cbf {
      public b(final cnb $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cnb.this.p()) {
            super.b();
         } else {
            cnb.this.t(false);
         }
      }
   }

   class c extends cbg {
      public c(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.p()) {
            super.a();
         }
      }
   }

   class d extends cbh {
      public d(final cnb $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnb.this.p()) {
            super.a();
         }
      }
   }
}
