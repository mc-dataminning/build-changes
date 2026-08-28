import java.util.function.Consumer;

public class fkx implements fku {
   private final fks a;
   private final fkx.a b;
   private int c = 0;

   private fkx(fkx.a $$0) {
      this(0, 0, $$0);
   }

   public fkx(int $$0, int $$1, fkx.a $$2) {
      this.a = new fks($$0, $$1);
      this.b = $$2;
   }

   public fkx a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fkw b() {
      return this.a.b();
   }

   public fkw c() {
      return this.a.c();
   }

   public <T extends fkv> T a(T $$0, fkw $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fkv> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fkv> T a(T $$0, Consumer<fkw> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fkv> $$0) {
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

   public static fkx d() {
      return new fkx(fkx.a.b);
   }

   public static fkx e() {
      return new fkx(fkx.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fks $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fkv> T a(fks $$0, T $$1, int $$2, fkw $$3) {
         return (T)(switch (this) {
            case a -> (fkv)$$0.a($$1, 0, $$2, $$3);
            case b -> (fkv)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
