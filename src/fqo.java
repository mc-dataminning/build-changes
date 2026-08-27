import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fqo extends fqf<cqi> implements fsl {
   private float D;
   private float E;
   private final fsf F = new fsf();
   private boolean G;
   private boolean H;

   public fqo(cly $$0) {
      super($$0.cp, $$0.gl(), xe.c("container.crafting"));
      this.r = 97;
   }

   @Override
   public void C() {
      if (this.m.q.f()) {
         this.m.a(new fqc(this.m.s, this.m.s.h.y(), this.m.m.I().c()));
      } else {
         this.F.h();
      }
   }

   @Override
   protected void aN_() {
      if (this.m.q.f()) {
         this.m.a(new fqc(this.m.s, this.m.s.h.y(), this.m.m.I().c()));
      } else {
         super.aN_();
         this.G = this.n < 379;
         this.F.a(this.n, this.o, this.m, this.G, this.w);
         this.z = this.F.a(this.n, this.c);
         this.c(new fiz(this.z + 104, this.o / 2 - 22, 20, 18, fsf.a, $$0 -> {
            this.F.e();
            this.z = this.F.a(this.n, this.c);
            $$0.c(this.z + 104, this.o / 2 - 22);
            this.H = true;
         }));
         this.d(this.F);
      }
   }

   @Override
   protected void b(fia $$0, int $$1, int $$2) {
      $$0.a(this.p, this.l, this.r, this.s, 4210752, false);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      if (this.F.f() && this.G) {
         this.b($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.F.a($$0, $$1, $$2, $$3);
         this.F.a($$0, this.z, this.A, false, $$3);
      }

      this.a($$0, $$1, $$2);
      this.F.a($$0, this.z, this.A, $$1, $$2);
      this.D = (float)$$1;
      this.E = (float)$$2;
   }

   @Override
   protected void a(fia $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.z;
      int $$5 = this.A;
      $$0.a(a, $$4, $$5, 0, 0, this.c, this.d);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.D, this.E, this.m.s);
   }

   public static void a(fia $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, bso $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.bj;
      float $$17 = $$9.dK();
      float $$18 = $$9.dM();
      float $$19 = $$9.bm;
      float $$20 = $$9.bl;
      $$9.bj = 180.0F + $$12 * 20.0F;
      $$9.r(180.0F + $$12 * 40.0F);
      $$9.s(-$$13 * 20.0F);
      $$9.bl = $$9.dK();
      $$9.bm = $$9.dK();
      float $$21 = $$9.em();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dp() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.bj = $$16;
      $$9.r($$17);
      $$9.s($$18);
      $$9.bm = $$19;
      $$9.bl = $$20;
      $$0.f();
   }

   public static void a(fia $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, bso $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      ezy.e();
      gko $$8 = fgj.Q().aq();
      if ($$6 != null) {
         $$6.conjugate();
         $$8.a($$6);
      }

      $$8.a(false);
      RenderSystem.runAsFancy(() -> $$8.a($$7, 0.0, 0.0, 0.0, 0.0F, 1.0F, $$0.c(), $$0.d(), 15728880));
      $$0.e();
      $$8.a(true);
      $$0.c().b();
      ezy.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.F.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.F.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.G || !this.F.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.F.a($$0, $$1, $$2)) {
         this.a(this.F);
         return true;
      } else {
         return this.G && this.F.f() ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.H) {
         this.H = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.F.a($$0, $$1, this.z, this.A, this.c, this.d, $$4) && $$5;
   }

   @Override
   protected void a(cre $$0, int $$1, int $$2, cpp $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.F.a($$0);
   }

   @Override
   public void E() {
      this.F.i();
   }

   @Override
   public fsf F() {
      return this.F;
   }
}
