import java.util.function.Consumer;

public class fau implements far {
   private final fap a;
   private final fau.a b;
   private int c = 0;

   private fau(fau.a $$0) {
      this(0, 0, $$0);
   }

   public fau(int $$0, int $$1, fau.a $$2) {
      this.a = new fap($$0, $$1);
      this.b = $$2;
   }

   public fau a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fat b() {
      return this.a.b();
   }

   public fat c() {
      return this.a.c();
   }

   public <T extends fas> T a(T $$0, fat $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fas> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fas> T a(T $$0, Consumer<fat> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fas> $$0) {
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

   public static fau d() {
      return new fau(fau.a.b);
   }

   public static fau e() {
      return new fau(fau.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fap $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fas> T a(fap $$0, T $$1, int $$2, fat $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
