import java.util.function.Consumer;

public class fez implements few {
   private final feu a;
   private final fez.a b;
   private int c = 0;

   private fez(fez.a $$0) {
      this(0, 0, $$0);
   }

   public fez(int $$0, int $$1, fez.a $$2) {
      this.a = new feu($$0, $$1);
      this.b = $$2;
   }

   public fez a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fey b() {
      return this.a.b();
   }

   public fey c() {
      return this.a.c();
   }

   public <T extends fex> T a(T $$0, fey $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fex> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fex> T a(T $$0, Consumer<fey> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fex> $$0) {
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

   public static fez d() {
      return new fez(fez.a.b);
   }

   public static fez e() {
      return new fez(fez.a.a);
   }

   public static enum a {
      a,
      b;

      void a(feu $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fex> T a(feu $$0, T $$1, int $$2, fey $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
