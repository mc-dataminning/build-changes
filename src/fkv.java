import java.util.function.Consumer;

public class fkv implements fks {
   private final fkq a;
   private final fkv.a b;
   private int c = 0;

   private fkv(fkv.a $$0) {
      this(0, 0, $$0);
   }

   public fkv(int $$0, int $$1, fkv.a $$2) {
      this.a = new fkq($$0, $$1);
      this.b = $$2;
   }

   public fkv a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fku b() {
      return this.a.b();
   }

   public fku c() {
      return this.a.c();
   }

   public <T extends fkt> T a(T $$0, fku $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fkt> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fkt> T a(T $$0, Consumer<fku> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fkt> $$0) {
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

   public static fkv d() {
      return new fkv(fkv.a.b);
   }

   public static fkv e() {
      return new fkv(fkv.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fkq $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fkt> T a(fkq $$0, T $$1, int $$2, fku $$3) {
         return (T)(switch (this) {
            case a -> (fkt)$$0.a($$1, 0, $$2, $$3);
            case b -> (fkt)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
