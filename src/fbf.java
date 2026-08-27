import java.util.function.Consumer;

public class fbf implements fbc {
   private final fba a;
   private final fbf.a b;
   private int c = 0;

   private fbf(fbf.a $$0) {
      this(0, 0, $$0);
   }

   public fbf(int $$0, int $$1, fbf.a $$2) {
      this.a = new fba($$0, $$1);
      this.b = $$2;
   }

   public fbf a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fbe b() {
      return this.a.b();
   }

   public fbe c() {
      return this.a.c();
   }

   public <T extends fbd> T a(T $$0, fbe $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fbd> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fbd> T a(T $$0, Consumer<fbe> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fbd> $$0) {
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
   public void n(int $$0) {
      this.a.n($$0);
   }

   @Override
   public void o(int $$0) {
      this.a.o($$0);
   }

   @Override
   public int B() {
      return this.a.B();
   }

   @Override
   public int C() {
      return this.a.C();
   }

   public static fbf d() {
      return new fbf(fbf.a.b);
   }

   public static fbf e() {
      return new fbf(fbf.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fba $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fbd> T a(fba $$0, T $$1, int $$2, fbe $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
