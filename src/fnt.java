import java.util.Optional;
import java.util.function.Consumer;
import org.joml.Quaternionf;
import org.joml.Vector3f;

public class fnt extends fnq {
   private final dkp a;
   private float b;
   private float F;
   private float G;
   private float H;

   fnt(fjr $$0, double $$1, double $$2, double $$3, dkp $$4, int $$5) {
      super($$0, $$1, $$2, $$3, 0.0, 0.0, 0.0);
      this.D = 0.3F;
      this.a = $$4;
      this.t = $$5;
      Optional<eif> $$6 = $$4.a($$0);
      if ($$6.isPresent()) {
         eif $$7 = $$6.get();
         double $$8 = $$1 - $$7.a();
         double $$9 = $$2 - $$7.b();
         double $$10 = $$3 - $$7.c();
         this.F = this.b = (float)asy.d($$8, $$10);
         this.H = this.G = (float)asy.d($$9, Math.sqrt($$8 * $$8 + $$10 * $$10));
      }
   }

   @Override
   public void a(eml $$0, eqz $$1, float $$2) {
      float $$3 = asy.a(((float)this.s + $$2 - (float) (Math.PI * 2)) * 0.05F) * 2.0F;
      float $$4 = asy.i($$2, this.F, this.b);
      float $$5 = asy.i($$2, this.H, this.G) + (float) (Math.PI / 2);
      this.a($$0, $$1, $$2, $$3x -> $$3x.rotateY($$4).rotateX(-$$5).rotateY($$3));
      this.a($$0, $$1, $$2, $$3x -> $$3x.rotateY((float) -Math.PI + $$4).rotateX($$5).rotateY($$3));
   }

   private void a(eml $$0, eqz $$1, float $$2, Consumer<Quaternionf> $$3) {
      eif $$4 = $$1.b();
      float $$5 = (float)(asy.d((double)$$2, this.d, this.g) - $$4.a());
      float $$6 = (float)(asy.d((double)$$2, this.e, this.h) - $$4.b());
      float $$7 = (float)(asy.d((double)$$2, this.f, this.i) - $$4.c());
      Vector3f $$8 = new Vector3f(0.5F, 0.5F, 0.5F).normalize();
      Quaternionf $$9 = new Quaternionf().setAngleAxis(0.0F, $$8.x(), $$8.y(), $$8.z());
      $$3.accept($$9);
      Vector3f[] $$10 = new Vector3f[]{
         new Vector3f(-1.0F, -1.0F, 0.0F), new Vector3f(-1.0F, 1.0F, 0.0F), new Vector3f(1.0F, 1.0F, 0.0F), new Vector3f(1.0F, -1.0F, 0.0F)
      };
      float $$11 = this.b($$2);

      for (int $$12 = 0; $$12 < 4; $$12++) {
         Vector3f $$13 = $$10[$$12];
         $$13.rotate($$9);
         $$13.mul($$11);
         $$13.add($$5, $$6, $$7);
      }

      float $$14 = this.c();
      float $$15 = this.d();
      float $$16 = this.e();
      float $$17 = this.f();
      int $$18 = this.a($$2);
      $$0.a((double)$$10[0].x(), (double)$$10[0].y(), (double)$$10[0].z()).a($$15, $$17).a(this.v, this.w, this.x, this.y).b($$18).e();
      $$0.a((double)$$10[1].x(), (double)$$10[1].y(), (double)$$10[1].z()).a($$15, $$16).a(this.v, this.w, this.x, this.y).b($$18).e();
      $$0.a((double)$$10[2].x(), (double)$$10[2].y(), (double)$$10[2].z()).a($$14, $$16).a(this.v, this.w, this.x, this.y).b($$18).e();
      $$0.a((double)$$10[3].x(), (double)$$10[3].y(), (double)$$10[3].z()).a($$14, $$17).a(this.v, this.w, this.x, this.y).b($$18).e();
   }

   @Override
   public int a(float $$0) {
      return 240;
   }

   @Override
   public fmu b() {
      return fmu.c;
   }

   @Override
   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         Optional<eif> $$0 = this.a.a(this.c);
         if ($$0.isEmpty()) {
            this.k();
         } else {
            int $$1 = this.t - this.s;
            double $$2 = 1.0 / (double)$$1;
            eif $$3 = $$0.get();
            this.g = asy.d($$2, this.g, $$3.a());
            this.h = asy.d($$2, this.h, $$3.b());
            this.i = asy.d($$2, this.i, $$3.c());
            double $$4 = this.g - $$3.a();
            double $$5 = this.h - $$3.b();
            double $$6 = this.i - $$3.c();
            this.F = this.b;
            this.b = (float)asy.d($$4, $$6);
            this.H = this.G;
            this.G = (float)asy.d($$5, Math.sqrt($$4 * $$4 + $$6 * $$6));
         }
      }
   }

   public static class a implements fmt<jw> {
      private final fnl a;

      public a(fnl $$0) {
         this.a = $$0;
      }

      public fmq a(jw $$0, fjr $$1, double $$2, double $$3, double $$4, double $$5, double $$6, double $$7) {
         fnt $$8 = new fnt($$1, $$2, $$3, $$4, $$0.c(), $$0.d());
         $$8.a(this.a);
         $$8.e(1.0F);
         return $$8;
      }
   }
}
