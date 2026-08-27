import java.util.function.Consumer;

public class fex implements feu {
   private final fes a;
   private final fex.a b;
   private int c = 0;

   private fex(fex.a $$0) {
      this(0, 0, $$0);
   }

   public fex(int $$0, int $$1, fex.a $$2) {
      this.a = new fes($$0, $$1);
      this.b = $$2;
   }

   public fex a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public few b() {
      return this.a.b();
   }

   public few c() {
      return this.a.c();
   }

   public <T extends fev> T a(T $$0, few $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fev> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fev> T a(T $$0, Consumer<few> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fev> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int w() {
      return this.a.w();
   }

   @Override
   public int u() {
      return this.a.u();
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
   public int B() {
      return this.a.B();
   }

   @Override
   public int C() {
      return this.a.C();
   }

   public static fex d() {
      return new fex(fex.a.b);
   }

   public static fex e() {
      return new fex(fex.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fes $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fev> T a(fes $$0, T $$1, int $$2, few $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
