import java.util.function.Consumer;

public class fsl implements fsi {
   private final fsg a;
   private final fsl.a b;
   private int c = 0;

   private fsl(fsl.a $$0) {
      this(0, 0, $$0);
   }

   public fsl(int $$0, int $$1, fsl.a $$2) {
      this.a = new fsg($$0, $$1);
      this.b = $$2;
   }

   public fsl a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fsk b() {
      return this.a.b();
   }

   public fsk c() {
      return this.a.c();
   }

   public <T extends fsj> T a(T $$0, fsk $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fsj> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fsj> T a(T $$0, Consumer<fsk> $$1) {
      return this.b.a(this.a, $$0, this.c++, af.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fsj> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int A() {
      return this.a.A();
   }

   @Override
   public int y() {
      return this.a.y();
   }

   @Override
   public void j(int $$0) {
      this.a.j($$0);
   }

   @Override
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public int F() {
      return this.a.F();
   }

   @Override
   public int G() {
      return this.a.G();
   }

   public static fsl d() {
      return new fsl(fsl.a.b);
   }

   public static fsl e() {
      return new fsl(fsl.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fsg $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fsj> T a(fsg $$0, T $$1, int $$2, fsk $$3) {
         return (T)(switch (this) {
            case a -> (fsj)$$0.a($$1, 0, $$2, $$3);
            case b -> (fsj)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
