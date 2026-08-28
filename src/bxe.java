import java.util.function.Consumer;
import javax.annotation.Nullable;

public class bxe {
   public static final int a = 3;
   private final bwi b;
   private int c;
   private final bxe.a d = new bxe.a(0, ffc.c, 0.0F, 0.0F);
   @Nullable
   private ffc e;
   @Nullable
   private ffb f;
   @Nullable
   private final Consumer<bxe> g;

   public bxe(bwi $$0) {
      this($$0, 3, null);
   }

   public bxe(bwi $$0, int $$1) {
      this($$0, $$1, null);
   }

   public bxe(bwi $$0, @Nullable Consumer<bxe> $$1) {
      this($$0, 3, $$1);
   }

   public bxe(bwi $$0, int $$1, @Nullable Consumer<bxe> $$2) {
      this.c = $$1;
      this.b = $$0;
      this.g = $$2;
   }

   public ffc a() {
      return this.d.a > 0 ? this.d.b : this.b.ds();
   }

   public float b() {
      return this.d.a > 0 ? this.d.c : this.b.dK();
   }

   public float c() {
      return this.d.a > 0 ? this.d.d : this.b.dM();
   }

   public void a(ffc $$0, float $$1, float $$2) {
      if (this.c == 0) {
         this.b.b($$0, $$1, $$2);
         this.f();
      } else {
         this.d.a = this.c;
         this.d.b = $$0;
         this.d.c = $$1;
         this.d.d = $$2;
         this.e = this.b.ds();
         this.f = new ffb(this.b.dM(), this.b.dK());
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
            ffc $$1 = this.b.ds().d(this.e);
            if (this.b.dU().a(this.b, this.b.au().c(this.d.b.e($$1)))) {
               this.d.a($$1);
            }
         }

         if (this.f != null) {
            float $$2 = this.b.dK() - this.f.k;
            float $$3 = this.b.dM() - this.f.j;
            this.d.a($$2, $$3);
         }

         double $$4 = azm.d($$0, this.b.dz(), this.d.b.d);
         double $$5 = azm.d($$0, this.b.dB(), this.d.b.e);
         double $$6 = azm.d($$0, this.b.dF(), this.d.b.f);
         ffc $$7 = new ffc($$4, $$5, $$6);
         float $$8 = (float)azm.e($$0, (double)this.b.dK(), (double)this.d.c);
         float $$9 = (float)azm.d($$0, (double)this.b.dM(), (double)this.d.d);
         this.b.b($$7);
         this.b.b($$8, $$9);
         this.d.a();
         this.e = $$7;
         this.f = new ffb(this.b.dM(), this.b.dK());
      }
   }

   public void f() {
      this.d.a = 0;
      this.e = null;
      this.f = null;
   }

   static class a {
      protected int a;
      ffc b;
      float c;
      float d;

      a(int $$0, ffc $$1, float $$2, float $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public void a() {
         this.a--;
      }

      public void a(ffc $$0) {
         this.b = this.b.e($$0);
      }

      public void a(float $$0, float $$1) {
         this.c += $$0;
         this.d += $$1;
      }
   }
}
