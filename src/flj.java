import java.util.function.Consumer;

public class flj implements flg {
   private final fle a;
   private final flj.a b;
   private int c = 0;

   private flj(flj.a $$0) {
      this(0, 0, $$0);
   }

   public flj(int $$0, int $$1, flj.a $$2) {
      this.a = new fle($$0, $$1);
      this.b = $$2;
   }

   public flj a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fli b() {
      return this.a.b();
   }

   public fli c() {
      return this.a.c();
   }

   public <T extends flh> T a(T $$0, fli $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends flh> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flh> T a(T $$0, Consumer<fli> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flh> $$0) {
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

   public static flj d() {
      return new flj(flj.a.b);
   }

   public static flj e() {
      return new flj(flj.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fle $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends flh> T a(fle $$0, T $$1, int $$2, fli $$3) {
         return (T)(switch (this) {
            case a -> (flh)$$0.a($$1, 0, $$2, $$3);
            case b -> (flh)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
