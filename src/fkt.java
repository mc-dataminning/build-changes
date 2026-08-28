import java.util.function.Consumer;

public class fkt implements fkq {
   private final fko a;
   private final fkt.a b;
   private int c = 0;

   private fkt(fkt.a $$0) {
      this(0, 0, $$0);
   }

   public fkt(int $$0, int $$1, fkt.a $$2) {
      this.a = new fko($$0, $$1);
      this.b = $$2;
   }

   public fkt a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fks b() {
      return this.a.b();
   }

   public fks c() {
      return this.a.c();
   }

   public <T extends fkr> T a(T $$0, fks $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fkr> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fkr> T a(T $$0, Consumer<fks> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fkr> $$0) {
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

   public static fkt d() {
      return new fkt(fkt.a.b);
   }

   public static fkt e() {
      return new fkt(fkt.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fko $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fkr> T a(fko $$0, T $$1, int $$2, fks $$3) {
         return (T)(switch (this) {
            case a -> (fkr)$$0.a($$1, 0, $$2, $$3);
            case b -> (fkr)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
