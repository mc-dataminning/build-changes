import java.util.function.Consumer;

public class fiv implements fis {
   private final fiq a;
   private final fiv.a b;
   private int c = 0;

   private fiv(fiv.a $$0) {
      this(0, 0, $$0);
   }

   public fiv(int $$0, int $$1, fiv.a $$2) {
      this.a = new fiq($$0, $$1);
      this.b = $$2;
   }

   public fiv a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fiu b() {
      return this.a.b();
   }

   public fiu c() {
      return this.a.c();
   }

   public <T extends fit> T a(T $$0, fiu $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fit> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fit> T a(T $$0, Consumer<fiu> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fit> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int x() {
      return this.a.x();
   }

   @Override
   public int v() {
      return this.a.v();
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
   public int C() {
      return this.a.C();
   }

   @Override
   public int D() {
      return this.a.D();
   }

   public static fiv d() {
      return new fiv(fiv.a.b);
   }

   public static fiv e() {
      return new fiv(fiv.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fiq $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fit> T a(fiq $$0, T $$1, int $$2, fiu $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
