import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fsh extends frz<csm> implements fuu {
   private float G;
   private float H;
   private final fuo<?> I;
   private boolean J;
   private boolean K;

   public fsh(coh $$0) {
      super($$0.bZ, $$0.gk(), xh.c("container.crafting"));
      this.v = 97;
      this.I = new fuk($$0.bZ);
   }

   @Override
   public void D() {
      if (this.m.r.f()) {
         this.m.a(new frw(this.m.t, this.m.t.cw.y(), this.m.n.K().c()));
      } else {
         this.I.e();
      }
   }

   @Override
   protected void aS_() {
      if (this.m.r.f()) {
         this.m.a(new frw(this.m.t, this.m.t.cw.y(), this.m.n.K().c()));
      } else {
         super.aS_();
         this.J = this.n < 379;
         this.I.a(this.n, this.o, this.m, this.J);
         this.C = this.I.a(this.n, this.s);
         this.c(new fll(this.C + 104, this.o / 2 - 22, 20, 18, fuo.a, $$0 -> {
            this.I.c();
            this.C = this.I.a(this.n, this.s);
            $$0.c(this.C + 104, this.o / 2 - 22);
            this.K = true;
         }));
         this.d(this.I);
      }
   }

   @Override
   protected void b(fkm $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.v, this.w, 4210752, false);
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
      if (this.I.d() && this.J) {
         this.b($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.I.a($$0, $$1, $$2, $$3);
         this.I.a($$0, this.C, this.D, false);
      }

      this.a($$0, $$1, $$2);
      this.I.a($$0, $$1, $$2, this.B);
      this.G = (float)$$1;
      this.H = (float)$$2;
   }

   @Override
   protected void a(fkm $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.C;
      int $$5 = this.D;
      $$0.a(gig::B, a, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.G, this.H, this.m.t);
   }

   public static void a(fkm $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, buv $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aU;
      float $$17 = $$9.dN();
      float $$18 = $$9.dP();
      float $$19 = $$9.aX;
      float $$20 = $$9.aW;
      $$9.aU = 180.0F + $$12 * 20.0F;
      $$9.v(180.0F + $$12 * 40.0F);
      $$9.w(-$$13 * 20.0F);
      $$9.aW = $$9.dN();
      $$9.aX = $$9.dN();
      float $$21 = $$9.el();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dt() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aU = $$16;
      $$9.v($$17);
      $$9.w($$18);
      $$9.aX = $$19;
      $$9.aW = $$20;
      $$0.e();
   }

   public static void a(fkm $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, buv $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      $$0.d();
      fcp.e();
      gnx $$8 = fja.Q().aq();
      if ($$6 != null) {
         $$8.a($$6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      $$8.a(false);
      $$0.a($$3x -> $$8.a($$7, 0.0, 0.0, 0.0, 1.0F, $$0.c(), $$3x, 15728880));
      $$0.d();
      $$8.a(true);
      $$0.c().b();
      fcp.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.I.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.I.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.J || !this.I.d()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.I.a($$0, $$1, $$2)) {
         this.a(this.I);
         return true;
      } else {
         return this.J && this.I.d() ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.K) {
         this.K = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.s) || $$1 >= (double)($$3 + this.u);
      return this.I.a($$0, $$1, this.C, this.D, this.s, this.u, $$4) && $$5;
   }

   @Override
   protected void a(ctg $$0, int $$1, int $$2, cru $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.I.b($$0);
   }

   @Override
   public void F() {
      this.I.f();
   }

   @Override
   public fuo G() {
      return this.I;
   }
}
