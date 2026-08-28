import java.util.function.Consumer;

public class fos implements foo {
   private final fom a;
   private final fos.a b;
   private int c = 0;

   private fos(fos.a $$0) {
      this(0, 0, $$0);
   }

   public fos(int $$0, int $$1, fos.a $$2) {
      this.a = new fom($$0, $$1);
      this.b = $$2;
   }

   public fos a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public foq b() {
      return this.a.b();
   }

   public foq c() {
      return this.a.c();
   }

   public <T extends fop> T a(T $$0, foq $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fop> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fop> T a(T $$0, Consumer<foq> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fop> $$0) {
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

   public static fos d() {
      return new fos(fos.a.b);
   }

   public static fos e() {
      return new fos(fos.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fom $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fop> T a(fom $$0, T $$1, int $$2, foq $$3) {
         return (T)(switch (this) {
            case a -> (fop)$$0.a($$1, 0, $$2, $$3);
            case b -> (fop)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
