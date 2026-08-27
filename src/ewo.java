import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Quaternionf;

public class ewo extends ewg<cce> implements eyi {
   private static final acq w = new acq("textures/gui/recipe_button.png");
   private float x;
   private float y;
   private final eyc z = new eyc();
   private boolean A;
   private boolean C;

   public ewo(byo $$0) {
      super($$0.bQ, $$0.fN(), sw.c("container.crafting"));
      this.l = 97;
   }

   @Override
   public void B() {
      if (this.f.r.g()) {
         this.f.a(new ewd(this.f.t, this.f.t.cl.t(), this.f.m.E().c()));
      } else {
         this.z.h();
      }
   }

   @Override
   protected void b() {
      if (this.f.r.g()) {
         this.f.a(new ewd(this.f.t, this.f.t.cl.t(), this.f.m.E().c()));
      } else {
         super.b();
         this.A = this.g < 379;
         this.z.a(this.g, this.h, this.f, this.A, this.p);
         this.s = this.z.a(this.g, this.c);
         this.d(new ept(this.s + 104, this.h / 2 - 22, 20, 18, 0, 0, 19, w, $$0 -> {
            this.z.f();
            this.s = this.z.a(this.g, this.c);
            $$0.b(this.s + 104, this.h / 2 - 22);
            this.C = true;
         }));
         this.e(this.z);
         this.c(this.z);
      }
   }

   @Override
   protected void b(eox $$0, int $$1, int $$2) {
      $$0.a(this.i, this.e, this.l, this.m, 4210752, false);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      if (this.z.g() && this.A) {
         this.a($$0, $$3, $$1, $$2);
         this.z.a($$0, $$1, $$2, $$3);
      } else {
         this.z.a($$0, $$1, $$2, $$3);
         super.a($$0, $$1, $$2, $$3);
         this.z.a($$0, this.s, this.t, false, $$3);
      }

      this.a($$0, $$1, $$2);
      this.z.a($$0, this.s, this.t, $$1, $$2);
      this.x = (float)$$1;
      this.y = (float)$$2;
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.s;
      int $$5 = this.t;
      $$0.a(a, $$4, $$5, 0, 0, this.c, this.k);
      a($$0, $$4 + 51, $$5 + 75, 30, (float)($$4 + 51) - this.x, (float)($$5 + 75 - 50) - this.y, this.f.t);
   }

   public static void a(eox $$0, int $$1, int $$2, int $$3, float $$4, float $$5, bfz $$6) {
      float $$7 = (float)Math.atan((double)($$4 / 40.0F));
      float $$8 = (float)Math.atan((double)($$5 / 40.0F));
      Quaternionf $$9 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$10 = new Quaternionf().rotateX($$8 * 20.0F * (float) (Math.PI / 180.0));
      $$9.mul($$10);
      float $$11 = $$6.aV;
      float $$12 = $$6.dy();
      float $$13 = $$6.dA();
      float $$14 = $$6.aY;
      float $$15 = $$6.aX;
      $$6.aV = 180.0F + $$7 * 20.0F;
      $$6.a_(180.0F + $$7 * 40.0F);
      $$6.b_(-$$8 * 20.0F);
      $$6.aX = $$6.dy();
      $$6.aY = $$6.dy();
      a($$0, $$1, $$2, $$3, $$9, $$10, $$6);
      $$6.aV = $$11;
      $$6.a_($$12);
      $$6.b_($$13);
      $$6.aY = $$14;
      $$6.aX = $$15;
   }

   public static void a(eox $$0, int $$1, int $$2, int $$3, Quaternionf $$4, @Nullable Quaternionf $$5, bfz $$6) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().a(new Matrix4f().scaling((float)$$3, (float)$$3, (float)(-$$3)));
      $$0.c().a($$4);
      ehf.c();
      fow $$7 = enn.N().an();
      if ($$5 != null) {
         $$5.conjugate();
         $$7.a($$5);
      }

      $$7.a(false);
      RenderSystem.runAsFancy(() -> $$7.a($$6, 0.0, 0.0, 0.0, 0.0F, 1.0F, $$0.c(), $$0.d(), 15728880));
      $$0.e();
      $$7.a(true);
      $$0.c().b();
      ehf.b();
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
      if (this.C) {
         this.C = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
      return this.z.a($$0, $$1, this.s, this.t, this.c, this.k, $$4) && $$5;
   }

   @Override
   protected void a(ccx $$0, int $$1, int $$2, cbo $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.z.a($$0);
   }

   @Override
   public void D() {
      this.z.i();
   }

   @Override
   public eyc E() {
      return this.z;
   }
}
