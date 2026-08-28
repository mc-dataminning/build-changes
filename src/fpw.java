import java.util.function.Consumer;

public class fpw implements fpt {
   private final fpr a;
   private final fpw.a b;
   private int c = 0;

   private fpw(fpw.a $$0) {
      this(0, 0, $$0);
   }

   public fpw(int $$0, int $$1, fpw.a $$2) {
      this.a = new fpr($$0, $$1);
      this.b = $$2;
   }

   public fpw a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fpv b() {
      return this.a.b();
   }

   public fpv c() {
      return this.a.c();
   }

   public <T extends fpu> T a(T $$0, fpv $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fpu> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fpu> T a(T $$0, Consumer<fpv> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fpu> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public int w() {
      return this.a.w();
   }

   @Override
   public void m(int $$0) {
      this.a.m($$0);
   }

   @Override
   public void n(int $$0) {
      this.a.n($$0);
   }

   @Override
   public int D() {
      return this.a.D();
   }

   @Override
   public int E() {
      return this.a.E();
   }

   public static fpw d() {
      return new fpw(fpw.a.b);
   }

   public static fpw e() {
      return new fpw(fpw.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fpr $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fpu> T a(fpr $$0, T $$1, int $$2, fpv $$3) {
         return (T)(switch (this) {
            case a -> (fpu)$$0.a($$1, 0, $$2, $$3);
            case b -> (fpu)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
