import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fpt extends fpl<cqw> implements fsg {
   private float E;
   private float F;
   private final fsa G = new fsa();
   private boolean H;
   private boolean I;

   public fpt(cmx $$0) {
      super($$0.cc, $$0.fY(), wz.c("container.crafting"));
      this.s = 97;
   }

   @Override
   public void C() {
      if (this.l.q.f()) {
         this.l.a(new fpi(this.l.s, this.l.s.h.x(), this.l.m.I().c()));
      } else {
         this.G.h();
      }
   }

   @Override
   protected void aT_() {
      if (this.l.q.f()) {
         this.l.a(new fpi(this.l.s, this.l.s.h.x(), this.l.m.I().c()));
      } else {
         super.aT_();
         this.H = this.m < 379;
         this.G.a(this.m, this.n, this.l, this.H, this.x);
         this.A = this.G.a(this.m, this.c);
         this.c(new fiy(this.A + 104, this.n / 2 - 22, 20, 18, fsa.a, $$0 -> {
            this.G.e();
            this.A = this.G.a(this.m, this.c);
            $$0.c(this.A + 104, this.n / 2 - 22);
            this.I = true;
         }));
         this.d(this.G);
      }
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2) {
      $$0.a(this.o, this.k, this.s, this.u, 4210752, false);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (this.G.f() && this.H) {
         this.b($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.G.a($$0, $$1, $$2, $$3);
         this.G.a($$0, this.A, this.B, false, $$3);
      }

      this.a($$0, $$1, $$2);
      this.G.a($$0, this.A, this.B, $$1, $$2);
      this.E = (float)$$1;
      this.F = (float)$$2;
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(a, $$4, $$5, 0, 0, this.c, this.r);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.E, this.F, this.l.s);
   }

   public static void a(fhz $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, btn $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aY;
      float $$17 = $$9.dE();
      float $$18 = $$9.dG();
      float $$19 = $$9.bb;
      float $$20 = $$9.ba;
      $$9.aY = 180.0F + $$12 * 20.0F;
      $$9.t(180.0F + $$12 * 40.0F);
      $$9.u(-$$13 * 20.0F);
      $$9.ba = $$9.dE();
      $$9.bb = $$9.dE();
      float $$21 = $$9.eb();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dk() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aY = $$16;
      $$9.t($$17);
      $$9.u($$18);
      $$9.bb = $$19;
      $$9.ba = $$20;
      $$0.f();
   }

   public static void a(fhz $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, btn $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      faf.e();
      gkh $$8 = fgo.Q().ap();
      if ($$6 != null) {
         $$8.a($$6.conjugate(new Quaternionf()).rotateY((float) Math.PI));
      }

      $$8.a(false);
      RenderSystem.runAsFancy(() -> $$8.a($$7, 0.0, 0.0, 0.0, 0.0F, 1.0F, $$0.c(), $$0.d(), 15728880));
      $$0.e();
      $$8.a(true);
      $$0.c().b();
      faf.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.G.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.G.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.H || !this.G.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.G.a($$0, $$1, $$2)) {
         this.a(this.G);
         return true;
      } else {
         return this.H && this.G.f() ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.I) {
         this.I = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
      return this.G.a($$0, $$1, this.A, this.B, this.c, this.r, $$4) && $$5;
   }

   @Override
   protected void a(crq $$0, int $$1, int $$2, cqe $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.G.a($$0);
   }

   @Override
   public void E() {
      this.G.i();
   }

   @Override
   public fsa F() {
      return this.G;
   }
}
