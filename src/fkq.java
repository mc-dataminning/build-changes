import java.util.function.Consumer;

public class fkq implements fkn {
   private final fkl a;
   private final fkq.a b;
   private int c = 0;

   private fkq(fkq.a $$0) {
      this(0, 0, $$0);
   }

   public fkq(int $$0, int $$1, fkq.a $$2) {
      this.a = new fkl($$0, $$1);
      this.b = $$2;
   }

   public fkq a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fkp b() {
      return this.a.b();
   }

   public fkp c() {
      return this.a.c();
   }

   public <T extends fko> T a(T $$0, fkp $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fko> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fko> T a(T $$0, Consumer<fkp> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fko> $$0) {
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

   public static fkq d() {
      return new fkq(fkq.a.b);
   }

   public static fkq e() {
      return new fkq(fkq.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fkl $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fko> T a(fkl $$0, T $$1, int $$2, fkp $$3) {
         return (T)(switch (this) {
            case a -> (fko)$$0.a($$1, 0, $$2, $$3);
            case b -> (fko)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
