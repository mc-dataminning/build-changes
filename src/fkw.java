import java.util.function.Consumer;

public class fkw implements fkt {
   private final fkr a;
   private final fkw.a b;
   private int c = 0;

   private fkw(fkw.a $$0) {
      this(0, 0, $$0);
   }

   public fkw(int $$0, int $$1, fkw.a $$2) {
      this.a = new fkr($$0, $$1);
      this.b = $$2;
   }

   public fkw a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fkv b() {
      return this.a.b();
   }

   public fkv c() {
      return this.a.c();
   }

   public <T extends fku> T a(T $$0, fkv $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fku> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fku> T a(T $$0, Consumer<fkv> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fku> $$0) {
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

   public static fkw d() {
      return new fkw(fkw.a.b);
   }

   public static fkw e() {
      return new fkw(fkw.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fkr $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fku> T a(fkr $$0, T $$1, int $$2, fkv $$3) {
         return (T)(switch (this) {
            case a -> (fku)$$0.a($$1, 0, $$2, $$3);
            case b -> (fku)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
