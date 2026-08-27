import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class flm extends fle<cnq> implements fnh {
   private float A;
   private float B;
   private final fnb C = new fnb();
   private boolean D;
   private boolean E;

   public flm(cjt $$0) {
      super($$0.bX, $$0.fZ(), wg.c("container.crafting"));
      this.o = 97;
   }

   @Override
   public void C() {
      if (this.j.q.f()) {
         this.j.a(new flb(this.j.s, this.j.s.ct.y(), this.j.m.I().c()));
      } else {
         this.C.h();
      }
   }

   @Override
   protected void aN_() {
      if (this.j.q.f()) {
         this.j.a(new flb(this.j.s, this.j.s.ct.y(), this.j.m.I().c()));
      } else {
         super.aN_();
         this.D = this.k < 379;
         this.C.a(this.k, this.l, this.j, this.D, this.s);
         this.w = this.C.a(this.k, this.c);
         this.c(new feb(this.w + 104, this.l / 2 - 22, 20, 18, fnb.a, $$0 -> {
            this.C.e();
            this.w = this.C.a(this.k, this.c);
            $$0.c(this.w + 104, this.l / 2 - 22);
            this.E = true;
         }));
         this.d(this.C);
      }
   }

   @Override
   protected void b(fdc $$0, int $$1, int $$2) {
      $$0.a(this.m, this.i, this.o, this.p, 4210752, false);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      if (this.C.f() && this.D) {
         this.b($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
      } else {
         super.a($$0, $$1, $$2, $$3);
         this.C.a($$0, $$1, $$2, $$3);
         this.C.a($$0, this.w, this.x, false, $$3);
      }

      this.a($$0, $$1, $$2);
      this.C.a($$0, this.w, this.x, $$1, $$2);
      this.A = (float)$$1;
      this.B = (float)$$2;
   }

   @Override
   protected void a(fdc $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.w;
      int $$5 = this.x;
      $$0.a(a, $$4, $$5, 0, 0, this.c, this.d);
      a($$0, $$4 + 26, $$5 + 8, $$4 + 75, $$5 + 78, 30, 0.0625F, this.A, this.B, this.j.s);
   }

   public static void a(fdc $$0, int $$1, int $$2, int $$3, int $$4, int $$5, float $$6, float $$7, float $$8, bqo $$9) {
      float $$10 = (float)($$1 + $$3) / 2.0F;
      float $$11 = (float)($$2 + $$4) / 2.0F;
      $$0.c($$1, $$2, $$3, $$4);
      float $$12 = (float)Math.atan((double)(($$10 - $$7) / 40.0F));
      float $$13 = (float)Math.atan((double)(($$11 - $$8) / 40.0F));
      Quaternionf $$14 = new Quaternionf().rotateZ((float) Math.PI);
      Quaternionf $$15 = new Quaternionf().rotateX($$13 * 20.0F * (float) (Math.PI / 180.0));
      $$14.mul($$15);
      float $$16 = $$9.aX;
      float $$17 = $$9.dC();
      float $$18 = $$9.dE();
      float $$19 = $$9.ba;
      float $$20 = $$9.aZ;
      $$9.aX = 180.0F + $$12 * 20.0F;
      $$9.r(180.0F + $$12 * 40.0F);
      $$9.s(-$$13 * 20.0F);
      $$9.aZ = $$9.dC();
      $$9.ba = $$9.dC();
      float $$21 = $$9.eb();
      Vector3f $$22 = new Vector3f(0.0F, $$9.dh() / 2.0F + $$6 * $$21, 0.0F);
      float $$23 = (float)$$5 / $$21;
      a($$0, $$10, $$11, $$23, $$22, $$14, $$15, $$9);
      $$9.aX = $$16;
      $$9.r($$17);
      $$9.s($$18);
      $$9.ba = $$19;
      $$9.aZ = $$20;
      $$0.f();
   }

   public static void a(fdc $$0, float $$1, float $$2, float $$3, Vector3f $$4, Quaternionf $$5, @Nullable Quaternionf $$6, bqo $$7) {
      $$0.c().a();
      $$0.c().a((double)$$1, (double)$$2, 50.0);
      $$0.c().b($$3, $$3, -$$3);
      $$0.c().a($$4.x, $$4.y, $$4.z);
      $$0.c().a($$5);
      eve.e();
      gfg $$8 = fbp.Q().aq();
      if ($$6 != null) {
         $$6.conjugate();
         $$8.a($$6);
      }

      $$8.a(false);
      RenderSystem.runAsFancy(() -> $$8.a($$7, 0.0, 0.0, 0.0, 0.0F, 1.0F, $$0.c(), $$0.d(), 15728880));
      $$0.e();
      $$8.a(true);
      $$0.c().b();
      eve.d();
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return this.C.a($$0, $$1, $$2) ? true : super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.C.a($$0, $$1) ? true : super.a($$0, $$1);
   }

   @Override
   protected boolean a(int $$0, int $$1, int $$2, int $$3, double $$4, double $$5) {
      return (!this.D || !this.C.f()) && super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      if (this.C.a($$0, $$1, $$2)) {
         this.a(this.C);
         return true;
      } else {
         return this.D && this.C.f() ? false : super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean b(double $$0, double $$1, int $$2) {
      if (this.E) {
         this.E = false;
         return true;
      } else {
         return super.b($$0, $$1, $$2);
      }
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      boolean $$5 = $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.d);
      return this.C.a($$0, $$1, this.w, this.x, this.c, this.d, $$4) && $$5;
   }

   @Override
   protected void a(cok $$0, int $$1, int $$2, cmy $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.C.a($$0);
   }

   @Override
   public void E() {
      this.C.i();
   }

   @Override
   public fnb F() {
      return this.C;
   }
}
