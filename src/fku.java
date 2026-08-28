import java.util.function.Consumer;

public class fku implements fkr {
   private final fkp a;
   private final fku.a b;
   private int c = 0;

   private fku(fku.a $$0) {
      this(0, 0, $$0);
   }

   public fku(int $$0, int $$1, fku.a $$2) {
      this.a = new fkp($$0, $$1);
      this.b = $$2;
   }

   public fku a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fkt b() {
      return this.a.b();
   }

   public fkt c() {
      return this.a.c();
   }

   public <T extends fks> T a(T $$0, fkt $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fks> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fks> T a(T $$0, Consumer<fkt> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fks> $$0) {
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

   public static fku d() {
      return new fku(fku.a.b);
   }

   public static fku e() {
      return new fku(fku.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fkp $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fks> T a(fkp $$0, T $$1, int $$2, fkt $$3) {
         return (T)(switch (this) {
            case a -> (fks)$$0.a($$1, 0, $$2, $$3);
            case b -> (fks)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
