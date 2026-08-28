import java.util.function.Consumer;

public class foc implements fnz {
   private final fnx a;
   private final foc.a b;
   private int c = 0;

   private foc(foc.a $$0) {
      this(0, 0, $$0);
   }

   public foc(int $$0, int $$1, foc.a $$2) {
      this.a = new fnx($$0, $$1);
      this.b = $$2;
   }

   public foc a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fob b() {
      return this.a.b();
   }

   public fob c() {
      return this.a.c();
   }

   public <T extends foa> T a(T $$0, fob $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends foa> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends foa> T a(T $$0, Consumer<fob> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<foa> $$0) {
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

   public static foc d() {
      return new foc(foc.a.b);
   }

   public static foc e() {
      return new foc(foc.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fnx $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends foa> T a(fnx $$0, T $$1, int $$2, fob $$3) {
         return (T)(switch (this) {
            case a -> (foa)$$0.a($$1, 0, $$2, $$3);
            case b -> (foa)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
