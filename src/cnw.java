import com.mojang.serialization.Dynamic;
import java.util.List;
import java.util.function.DoubleSupplier;
import java.util.function.Predicate;
import javax.annotation.Nullable;

public class cnw extends cms {
   private static final alc<Boolean> cb = alg.a(cnw.class, ale.k);
   private static final alc<Boolean> cc = alg.a(cnw.class, ale.k);
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
   public final bux bZ = new bux();
   public final bux ca = new bux();

   public cnw(bvm<? extends cnw> $$0, dha $$1) {
      super($$0, $$1);
      this.bP = new cnw.c(this);
      this.bQ = new cnw.d(this);
      this.bR = new cnw.b(this);
      cfm $$2 = (cfm)this.L();
      $$2.a(true);
      this.bO = 0;
   }

   @Override
   protected cbx G() {
      return new cnw.a(this);
   }

   @Override
   protected bxd.b<cnw> ec() {
      return cnx.a();
   }

   @Override
   protected bxd<?> a(Dynamic<?> $$0) {
      return cnx.d(this.ec().a($$0));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(cb, true);
      $$0.a(cc, false);
   }

   public static bxi.a m() {
      return cms.gr().a(bxj.s, 1.0).a(bxj.v, 0.3F).a(bxj.c, 2.0).a(bxj.m, 32.0).a(bxj.B, 1.0);
   }

   public boolean p() {
      return this.al.a(cb);
   }

   @Override
   public boolean c(ash $$0, bvf $$1) {
      if (!($$1 instanceof bwb)) {
         return false;
      } else {
         this.cj = 20;
         this.dV().a(this, (byte)4);
         return super.c($$0, $$1);
      }
   }

   @Override
   public boolean bI() {
      return super.bI() && this.p();
   }

   @Override
   public bxd<cnw> eb() {
      return (bxd<cnw>)super.eb();
   }

   @Override
   protected void a(ash $$0) {
      bpo $$1 = bpn.a();
      $$1.a("creakingBrain");
      this.eb().a((ash)this.dV(), this);
      $$1.c();
      cnx.a(this);
   }

   @Override
   public void d_() {
      if (this.cj > 0) {
         this.cj--;
      }

      if (!this.dV().C) {
         boolean $$0 = this.al.a(cb);
         boolean $$1 = this.t();
         if ($$1 != $$0) {
            this.a(ecj.u);
            if ($$1) {
               this.b(axf.gq);
            } else {
               this.U();
               this.b(axf.gp);
            }
         }

         this.al.a(cb, $$1);
      }

      super.d_();
   }

   @Override
   public void h() {
      super.h();
      if (this.dV().C) {
         this.gm();
      }
   }

   private void gm() {
      this.bZ.a(this.cj > 0, this.af);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 4) {
         this.cj = 20;
         this.gd();
      } else {
         super.b($$0);
      }
   }

   @Override
   public void gd() {
      this.b(axf.gm);
   }

   @Override
   protected axe u() {
      return this.x() ? null : axf.gj;
   }

   @Override
   protected axe e(btv $$0) {
      return axf.gs;
   }

   @Override
   protected axe o_() {
      return axf.gn;
   }

   @Override
   protected void b(jh $$0, dxn $$1) {
      this.a(axf.go, 0.15F, 1.0F);
   }

   @Nullable
   @Override
   public bwb O_() {
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
      List<cps> $$0 = this.bF.c(cff.j).orElse(List.of());
      if ($$0.isEmpty()) {
         if (this.x()) {
            this.a(ecj.u);
            this.b(axf.gl);
            this.x(false);
         }

         return true;
      } else {
         Predicate<bwb> $$1 = this.x() ? bwb.aH : $$0x -> true;

         for (cps $$2 : $$0) {
            if (this.a($$2, 0.5, false, true, $$1, new DoubleSupplier[]{this::dE, this::dC, () -> (this.dE() + this.dC()) / 2.0})) {
               if (this.x()) {
                  return false;
               }

               if ($$2.g(this) < 144.0) {
                  this.a(ecj.u);
                  this.b(axf.gk);
                  this.x(true);
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
   public float a(jh $$0, dhd $$1) {
      return 0.0F;
   }

   class a extends cbx {
      public a(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.p()) {
            super.a();
         }
      }
   }

   class b extends cca {
      public b(final cnw $$0) {
         super($$0);
      }

      @Override
      public void b() {
         if (cnw.this.p()) {
            super.b();
         } else {
            cnw.this.t(false);
         }
      }
   }

   class c extends ccb {
      public c(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.p()) {
            super.a();
         }
      }
   }

   class d extends ccc {
      public d(final cnw $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cnw.this.p()) {
            super.a();
         }
      }
   }
}
