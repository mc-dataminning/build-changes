import java.util.function.Consumer;

public class fea implements fdx {
   private final fdv a;
   private final fea.a b;
   private int c = 0;

   private fea(fea.a $$0) {
      this(0, 0, $$0);
   }

   public fea(int $$0, int $$1, fea.a $$2) {
      this.a = new fdv($$0, $$1);
      this.b = $$2;
   }

   public fea a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fdz b() {
      return this.a.b();
   }

   public fdz c() {
      return this.a.c();
   }

   public <T extends fdy> T a(T $$0, fdz $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fdy> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fdy> T a(T $$0, Consumer<fdz> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fdy> $$0) {
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

   public static fea d() {
      return new fea(fea.a.b);
   }

   public static fea e() {
      return new fea(fea.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fdv $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fdy> T a(fdv $$0, T $$1, int $$2, fdz $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
