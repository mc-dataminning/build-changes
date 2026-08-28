import java.util.function.Consumer;

public class fry implements frv {
   private final frt a;
   private final fry.a b;
   private int c = 0;

   private fry(fry.a $$0) {
      this(0, 0, $$0);
   }

   public fry(int $$0, int $$1, fry.a $$2) {
      this.a = new frt($$0, $$1);
      this.b = $$2;
   }

   public fry a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public frx b() {
      return this.a.b();
   }

   public frx c() {
      return this.a.c();
   }

   public <T extends frw> T a(T $$0, frx $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends frw> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends frw> T a(T $$0, Consumer<frx> $$1) {
      return this.b.a(this.a, $$0, this.c++, ae.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<frw> $$0) {
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
   public void k(int $$0) {
      this.a.k($$0);
   }

   @Override
   public void l(int $$0) {
      this.a.l($$0);
   }

   @Override
   public int D() {
      return this.a.D();
   }

   @Override
   public int E() {
      return this.a.E();
   }

   public static fry d() {
      return new fry(fry.a.b);
   }

   public static fry e() {
      return new fry(fry.a.a);
   }

   public static enum a {
      a,
      b;

      void a(frt $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends frw> T a(frt $$0, T $$1, int $$2, frx $$3) {
         return (T)(switch (this) {
            case a -> (frw)$$0.a($$1, 0, $$2, $$3);
            case b -> (frw)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
