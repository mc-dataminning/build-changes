import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bwu {
   public static final int a = 3;
   private final bwa b;
   private int c;
   private final bwu.a d = new bwu.a(0, fdw.c, 0.0F, 0.0F);
   @Nullable
   private fdw e;
   @Nullable
   private fdv f;
   @Nullable
   private final Consumer<bwu> g;

   public bwu(bwa $$0) {
      this($$0, 3, null);
   }

   public bwu(bwa $$0, int $$1) {
      this($$0, $$1, null);
   }

   public bwu(bwa $$0, @Nullable Consumer<bwu> $$1) {
      this($$0, 3, $$1);
   }

   public bwu(bwa $$0, int $$1, @Nullable Consumer<bwu> $$2) {
      this.c = $$1;
      this.b = $$0;
      this.g = $$2;
   }

   public fdw a() {
      return this.d.a > 0 ? this.d.b : this.b.dt();
   }

   public float b() {
      return this.d.a > 0 ? this.d.c : this.b.dL();
   }

   public float c() {
      return this.d.a > 0 ? this.d.d : this.b.dN();
   }

   public void a(fdw $$0, float $$1, float $$2) {
      if (this.c == 0) {
         this.b.b($$0, $$1, $$2);
         this.f();
      } else {
         this.d.a = this.c;
         this.d.b = $$0;
         this.d.c = $$1;
         this.d.d = $$2;
         this.e = this.b.dt();
         this.f = new fdv(this.b.dN(), this.b.dL());
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
            fdw $$1 = this.b.dt().d(this.e);
            if (this.b.dV().a(this.b, this.b.ax().c(this.d.b.e($$1)))) {
               this.d.a($$1);
            }
         }

         if (this.f != null) {
            float $$2 = this.b.dL() - this.f.j;
            float $$3 = this.b.dN() - this.f.i;
            this.d.a($$2, $$3);
         }

         double $$4 = azk.d($$0, this.b.dA(), this.d.b.d);
         double $$5 = azk.d($$0, this.b.dC(), this.d.b.e);
         double $$6 = azk.d($$0, this.b.dG(), this.d.b.f);
         fdw $$7 = new fdw($$4, $$5, $$6);
         float $$8 = (float)azk.e($$0, (double)this.b.dL(), (double)this.d.c);
         float $$9 = (float)azk.d($$0, (double)this.b.dN(), (double)this.d.d);
         this.b.b($$7);
         this.b.b($$8, $$9);
         this.d.a();
         this.e = $$7;
         this.f = new fdv(this.b.dN(), this.b.dL());
      }
   }

   public void f() {
      this.d.a = 0;
      this.e = null;
      this.f = null;
   }

   static class a {
      protected int a;
      fdw b;
      float c;
      float d;

      a(int $$0, fdw $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a() {
         this.a--;
      }

      public void a(fdw $$0) {
         this.b = this.b.e($$0);
      }

      public void a(float $$0, float $$1) {
         this.c += $$0;
         this.d += $$1;
      }
   }
}
