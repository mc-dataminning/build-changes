import java.util.function.Consumer;

public class fll implements fli {
   private final flg a;
   private final fll.a b;
   private int c = 0;

   private fll(fll.a $$0) {
      this(0, 0, $$0);
   }

   public fll(int $$0, int $$1, fll.a $$2) {
      this.a = new flg($$0, $$1);
      this.b = $$2;
   }

   public fll a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public flk b() {
      return this.a.b();
   }

   public flk c() {
      return this.a.c();
   }

   public <T extends flj> T a(T $$0, flk $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends flj> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flj> T a(T $$0, Consumer<flk> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flj> $$0) {
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

   public static fll d() {
      return new fll(fll.a.b);
   }

   public static fll e() {
      return new fll(fll.a.a);
   }

   public static enum a {
      a,
      b;

      void a(flg $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends flj> T a(flg $$0, T $$1, int $$2, flk $$3) {
         return (T)(switch (this) {
            case a -> (flj)$$0.a($$1, 0, $$2, $$3);
            case b -> (flj)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
