import java.util.function.Consumer;

public class fam implements faj {
   private final fah a;
   private final fam.a b;
   private int c = 0;

   private fam(fam.a $$0) {
      this(0, 0, $$0);
   }

   public fam(int $$0, int $$1, fam.a $$2) {
      this.a = new fah($$0, $$1);
      this.b = $$2;
   }

   public fam a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fal b() {
      return this.a.b();
   }

   public fal c() {
      return this.a.c();
   }

   public <T extends fak> T a(T $$0, fal $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fak> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fak> T a(T $$0, Consumer<fal> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fak> $$0) {
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

   public static fam d() {
      return new fam(fam.a.b);
   }

   public static fam e() {
      return new fam(fam.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fah $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fak> T a(fah $$0, T $$1, int $$2, fal $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
