import java.util.function.Consumer;

public class fpa implements fox {
   private final fov a;
   private final fpa.a b;
   private int c = 0;

   private fpa(fpa.a $$0) {
      this(0, 0, $$0);
   }

   public fpa(int $$0, int $$1, fpa.a $$2) {
      this.a = new fov($$0, $$1);
      this.b = $$2;
   }

   public fpa a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public foz b() {
      return this.a.b();
   }

   public foz c() {
      return this.a.c();
   }

   public <T extends foy> T a(T $$0, foz $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends foy> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends foy> T a(T $$0, Consumer<foz> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<foy> $$0) {
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

   public static fpa d() {
      return new fpa(fpa.a.b);
   }

   public static fpa e() {
      return new fpa(fpa.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fov $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends foy> T a(fov $$0, T $$1, int $$2, foz $$3) {
         return (T)(switch (this) {
            case a -> (foy)$$0.a($$1, 0, $$2, $$3);
            case b -> (foy)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
