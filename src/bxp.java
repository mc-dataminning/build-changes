import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxp {
   public static final int a = 3;
   private final bwt b;
   private int c;
   private final bxp.a d = new bxp.a(0, ffq.c, 0.0F, 0.0F);
   @Nullable
   private ffq e;
   @Nullable
   private ffp f;
   @Nullable
   private final Consumer<bxp> g;

   public bxp(bwt $$0) {
      this($$0, 3, null);
   }

   public bxp(bwt $$0, int $$1) {
      this($$0, $$1, null);
   }

   public bxp(bwt $$0, @Nullable Consumer<bxp> $$1) {
      this($$0, 3, $$1);
   }

   public bxp(bwt $$0, int $$1, @Nullable Consumer<bxp> $$2) {
      this.c = $$1;
      this.b = $$0;
      this.g = $$2;
   }

   public ffq a() {
      return this.d.a > 0 ? this.d.b : this.b.dt();
   }

   public float b() {
      return this.d.a > 0 ? this.d.c : this.b.dL();
   }

   public float c() {
      return this.d.a > 0 ? this.d.d : this.b.dN();
   }

   public void a(ffq $$0, float $$1, float $$2) {
      if (this.c == 0) {
         this.b.b($$0, $$1, $$2);
         this.f();
      } else {
         this.d.a = this.c;
         this.d.b = $$0;
         this.d.c = $$1;
         this.d.d = $$2;
         this.e = this.b.dt();
         this.f = new ffp(this.b.dN(), this.b.dL());
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
            ffq $$1 = this.b.dt().d(this.e);
            if (this.b.dV().a(this.b, this.b.au().c(this.d.b.e($$1)))) {
               this.d.a($$1);
            }
         }

         if (this.f != null) {
            float $$2 = this.b.dL() - this.f.k;
            float $$3 = this.b.dN() - this.f.j;
            this.d.a($$2, $$3);
         }

         double $$4 = azo.d($$0, this.b.dA(), this.d.b.d);
         double $$5 = azo.d($$0, this.b.dC(), this.d.b.e);
         double $$6 = azo.d($$0, this.b.dG(), this.d.b.f);
         ffq $$7 = new ffq($$4, $$5, $$6);
         float $$8 = (float)azo.e($$0, (double)this.b.dL(), (double)this.d.c);
         float $$9 = (float)azo.d($$0, (double)this.b.dN(), (double)this.d.d);
         this.b.b($$7);
         this.b.b($$8, $$9);
         this.d.a();
         this.e = $$7;
         this.f = new ffp(this.b.dN(), this.b.dL());
      }
   }

   public void f() {
      this.d.a = 0;
      this.e = null;
      this.f = null;
   }

   static class a {
      protected int a;
      ffq b;
      float c;
      float d;

      a(int $$0, ffq $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a() {
         this.a--;
      }

      public void a(ffq $$0) {
         this.b = this.b.e($$0);
      }

      public void a(float $$0, float $$1) {
         this.c += $$0;
         this.d += $$1;
      }
   }
}
