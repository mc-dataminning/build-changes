import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bvt {
   public static final int a = 3;
   private final bva b;
   private int c;
   private final bvt.a d = new bvt.a(0, fbx.c, 0.0F, 0.0F);
   @Nullable
   private fbx e;
   @Nullable
   private fbw f;
   @Nullable
   private final Consumer<bvt> g;

   public bvt(bva $$0) {
      this($$0, 3, null);
   }

   public bvt(bva $$0, int $$1) {
      this($$0, $$1, null);
   }

   public bvt(bva $$0, @Nullable Consumer<bvt> $$1) {
      this($$0, 3, $$1);
   }

   public bvt(bva $$0, int $$1, @Nullable Consumer<bvt> $$2) {
      this.c = $$1;
      this.b = $$0;
      this.g = $$2;
   }

   public fbx a() {
      return this.d.a > 0 ? this.d.b : this.b.ds();
   }

   public float b() {
      return this.d.a > 0 ? this.d.c : this.b.dK();
   }

   public float c() {
      return this.d.a > 0 ? this.d.d : this.b.dM();
   }

   public void a(fbx $$0, float $$1, float $$2) {
      if (this.c == 0) {
         this.b.b($$0, $$1, $$2);
         this.f();
      } else {
         this.d.a = this.c;
         this.d.b = $$0;
         this.d.c = $$1;
         this.d.d = $$2;
         this.e = this.b.ds();
         this.f = new fbw(this.b.dM(), this.b.dK());
         if (this.g != null) {
            this.g.accept(this);
         }
      }
   }

   public boolean d() {
      return this.d.a > 0;
   }

   public void a(int $$0) {
      this.c = $$0;
   }

   public void e() {
      if (!this.d()) {
         this.f();
      } else {
         double $$0 = 1.0 / (double)this.d.a;
         if (this.e != null) {
            fbx $$1 = this.b.ds().d(this.e);
            if (this.b.dU().a(this.b, this.b.ax().c(this.d.b.e($$1)))) {
               this.d.a($$1);
            }
         }

         if (this.f != null) {
            float $$2 = this.b.dK() - this.f.j;
            float $$3 = this.b.dM() - this.f.i;
            this.d.a($$2, $$3);
         }

         double $$4 = ayz.d($$0, this.b.dz(), this.d.b.d);
         double $$5 = ayz.d($$0, this.b.dB(), this.d.b.e);
         double $$6 = ayz.d($$0, this.b.dF(), this.d.b.f);
         fbx $$7 = new fbx($$4, $$5, $$6);
         float $$8 = (float)ayz.e($$0, (double)this.b.dK(), (double)this.d.c);
         float $$9 = (float)ayz.d($$0, (double)this.b.dM(), (double)this.d.d);
         this.b.b($$7);
         this.b.b($$8, $$9);
         this.d.a();
         this.e = $$7;
         this.f = new fbw(this.b.dM(), this.b.dK());
      }
   }

   public void f() {
      this.d.a = 0;
      this.e = null;
      this.f = null;
   }

   static class a {
      protected int a;
      fbx b;
      float c;
      float d;

      a(int $$0, fbx $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a() {
         this.a--;
      }

      public void a(fbx $$0) {
         this.b = this.b.e($$0);
      }

      public void a(float $$0, float $$1) {
         this.c += $$0;
         this.d += $$1;
      }
   }
}
