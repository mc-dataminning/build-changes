import java.util.function.Consumer;

public class fde implements fdb {
   private final fcz a;
   private final fde.a b;
   private int c = 0;

   private fde(fde.a $$0) {
      this(0, 0, $$0);
   }

   public fde(int $$0, int $$1, fde.a $$2) {
      this.a = new fcz($$0, $$1);
      this.b = $$2;
   }

   public fde a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fdd b() {
      return this.a.b();
   }

   public fdd c() {
      return this.a.c();
   }

   public <T extends fdc> T a(T $$0, fdd $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fdc> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fdc> T a(T $$0, Consumer<fdd> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fdc> $$0) {
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

   public static fde d() {
      return new fde(fde.a.b);
   }

   public static fde e() {
      return new fde(fde.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fcz $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fdc> T a(fcz $$0, T $$1, int $$2, fdd $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
