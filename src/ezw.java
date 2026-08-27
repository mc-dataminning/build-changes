import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class ezw extends ezo<cfd> implements fbr {
   private float x;
   private float y;
   private final fbl z = new fbl();
   private boolean A;
   private boolean B;

   public ezw(cbn $$0) {
      super($$0.bP, $$0.fQ(), tf.c("container.crafting"));
      this.l = 97;
   }

   @Override
   public void B() {
      if (this.f.t.g()) {
         this.f.a(new ezl(this.f.v, this.f.v.cl.x(), this.f.m.E().c()));
      } else {
         this.z.h();
      }
   }

   @Override
   protected void aE_() {
      if (this.f.t.g()) {
         this.f.a(new ezl(this.f.v, this.f.v.cl.x(), this.f.m.E().c()));
      } else {
         super.aE_();
         this.A = this.g < 379;
         this.z.a(this.g, this.h, this.f, this.A, this.p);
         this.t = this.z.a(this.g, this.c);
         this.d(new est(this.t + 104, this.h / 2 - 22, 20, 18, fbl.a, $$0 -> {
            this.z.f();
            this.t = this.z.a(this.g, this.c);
            $$0.b(this.t + 104, this.h / 2 - 22);
            this.B = true;
         }));
         this.e(this.z);
         this.c(this.z);
      }
   }

   @Override
   protected void b(erw $$0, int $$1, int $$2) {
      $$0.a(this.i, this.e, this.l, this.m, 4210752, false);
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (this.z.g() && this.A) {
         this.b($$0, $$1, $$2, $$3);
         this.z.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.z.a($$0, $$1, $$2, $$3);
         this.z.a($$0, this.t, this.u, false, $$3);
      }

      this.a($$0, $$1, $$2);
      this.z.a($$0, this.t, this.u, $$1, $$2);
      this.x = (float)$$1;
      this.y = (float)$$2;
   }

   @Override
   protected void a(erw $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.t;
      int $$5 = this.u;
      $$0.a(a, $$4, $$5, 0, 0, this.c, this.k);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.x, this.y, this.f.v);
   }

   public static void a(erw $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, biy $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aU;
      float $$17 = $$9.dA();
      float $$18 = $$9.dC();
      float $$19 = $$9.aX;
      float $$20 = $$9.aW;
      $$9.aU = 180.0F + $$12 * 20.0F;
      $$9.r(180.0F + $$12 * 40.0F);
      $$9.s(-$$13 * 20.0F);
      $$9.aW = $$9.dA();
      $$9.aX = $$9.dA();
      Vector3f $$21 = new Vector3f(0.0F, $$9.dg() / 2.0F + $$6, 0.0F);
      a($$0, $$10, $$11, $$5, $$21, $$14, $$15, $$9);
      $$9.aU = $$16;
      $$9.r($$17);
      $$9.s($$18);
      $$9.aX = $$19;
      $$9.aW = $$20;
      $$0.f();
   }

   public static void a(erw $$0, float $$1, float $$2, int $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, biy $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().a(new Matrix4f().scaling((float)$$3, (float)$$3, (float)(-$$3)));
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      ekc.c();
      fsm $$8 = eqm.O().ao();
      if ($$6 != null) {
         $$6.conjugate();
         $$8.a($$6);
      }

      $$8.a(false);
      RenderSystem.runAsFancy(() -> $$8.a($$7, 0.0, 0.0, 0.0, 0.0F, 1.0F, $$0.c(), $$0.d(), 15728880));
      $$0.e();
      $$8.a(true);
      $$0.c().b();
      ekc.b();
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.A || !this.z.g()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.z.a($$0, $$1, $$2)) {
         this.a(this.z);
         return true;
      } else {
         return this.A && this.z.g() ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.B) {
         this.B = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.z.a($$0, $$1, this.t, this.u, this.c, this.k, $$4) && $$5;
   }

   @Override
   protected void a(cfw $$0, int $$1, int $$2, cen $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0);
   }

   @Override
   public void D() {
      this.z.i();
   }

   @Override
   public fbl E() {
      return this.z;
   }
}
