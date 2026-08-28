import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class coa extends cmw {
   private static final alc<Boolean> cb = alg.a(coa.class, ale.k);
   private static final alc<Boolean> cc = alg.a(coa.class, ale.k);
   private static final int cd = 20;
   private static final int ce = 1;
   private static final float cf = 2.0F;
   private static final float cg = 32.0F;
   private static final float ch = 144.0F;
   public static final int a = 40;
   private static final float ci = 0.3F;
   public static final float b = 0.2F;
   public static final int c = 16545810;
   public static final int d = 6250335;
   private int cj;
   public final bvb bZ = new bvb();
   public final bvb ca = new bvb();

   public coa(bvq<? extends coa> $$0, dhh $$1) {
      super($$0, $$1);
      this.bP = new coa.c(this);
      this.bQ = new coa.d(this);
      this.bR = new coa.b(this);
      cfq $$2 = (cfq)this.L();
      $$2.a(true);
      this.bO = 0;
   }

   @Override
   protected ccb G() {
      return new coa.a(this);
   }

   @Override
   protected bxh.b<coa> ed() {
      return cob.a();
   }

   @Override
   protected bxh<?> a(Dynamic<?> $$0) {
      return cob.d(this.ed().a($$0));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, true);
      $$0.a(cc, false);
   }

   public static bxm.a m() {
      return cmw.gt().a(bxn.s, 1.0).a(bxn.v, 0.3F).a(bxn.c, 2.0).a(bxn.m, 32.0).a(bxn.B, 1.0);
   }

   public boolean p() {
      return this.al.a(cb);
   }

   @Override
   public boolean c(ash $$0, bvj $$1) {
      if (!($$1 instanceof bwf)) {
         return false;
      } else {
         this.cj = 20;
         this.dW().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean bI() {
      return super.bI() && this.p();
   }

   @Override
   public bxh<coa> ec() {
      return (bxh<coa>)super.ec();
   }

   @Override
   protected void a(ash $$0) {
      bps $$1 = bpr.a();
      $$1.a("creakingBrain");
      this.ec().a((ash)this.dW(), this);
      $$1.c();
      cob.a(this);
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
            this.a(ecq.u);
            if ($$1) {
               this.b(axf.gr);
            } else {
               this.U();
               this.b(axf.gq);
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
         this.go();
      }
   }

   private void go() {
      this.bZ.a(this.cj > 0, this.af);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 20;
         this.gf();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void gf() {
      this.b(axf.gn);
   }

   @Override
   protected axe u() {
      return this.x() ? null : axf.gk;
   }

   @Override
   protected axe e(btz $$0) {
      return axf.gt;
   }

   @Override
   protected axe o_() {
      return axf.go;
   }

   @Override
   protected void b(jh $$0, dxu $$1) {
      this.a(axf.gp, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bwf O_() {
      return this.O();
   }

   @Override
   protected void Y() {
      super.Y();
      ahj.a(this);
   }

   @Override
   public void p(double $$0, double $$1, double $$2) {
      if (this.p()) {
         super.p($$0, $$1, $$2);
      }
   }

   public boolean t() {
      List<cpw> $$0 = this.bF.c(cfj.j).orElse(List.of());
      if ($$0.isEmpty()) {
         if (this.x()) {
            this.a(ecq.u);
            this.b(axf.gm);
            this.x(false);
         }

         return true;
      } else {
         Predicate<bwf> $$1 = this.x() ? bwf.aH : $$0x -> true;

         for (cpw $$2 : $$0) {
            if (!$$2.b() && this.a($$2, 0.5, false, true, $$1, new DoubleSupplier[]{this::dF, this::dD, () -> (this.dF() + this.dD()) / 2.0})) {
               if (this.x()) {
                  return false;
               }

               if ($$2.g(this) < 144.0) {
                  this.a(ecq.u);
                  this.b(axf.gl);
                  this.x(true);
                  this.ec().a(cfj.o, $$2);
                  return false;
               }
            }
         }

         return true;
      }
   }

   public void x(boolean $$0) {
      this.al.a(cc, $$0);
   }

   public boolean x() {
      return this.al.a(cc);
   }

   @Override
   public float a(jh $$0, dhk $$1) {
      return 0.0F;
   }

   class a extends ccb {
      public a(final coa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coa.this.p()) {
            super.a();
         }
      }
   }

   class b extends cce {
      public b(final coa $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (coa.this.p()) {
            super.b();
         } else {
            coa.this.t(false);
         }
      }
   }

   class c extends ccf {
      public c(final coa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coa.this.p()) {
            super.a();
         }
      }
   }

   class d extends ccg {
      public d(final coa $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (coa.this.p()) {
            super.a();
         }
      }
   }
}
