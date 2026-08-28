import java.util.function.Consumer;

public class fmb implements fly {
   private final flw a;
   private final fmb.a b;
   private int c = 0;

   private fmb(fmb.a $$0) {
      this(0, 0, $$0);
   }

   public fmb(int $$0, int $$1, fmb.a $$2) {
      this.a = new flw($$0, $$1);
      this.b = $$2;
   }

   public fmb a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fma b() {
      return this.a.b();
   }

   public fma c() {
      return this.a.c();
   }

   public <T extends flz> T a(T $$0, fma $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends flz> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends flz> T a(T $$0, Consumer<fma> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<flz> $$0) {
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

   public static fmb d() {
      return new fmb(fmb.a.b);
   }

   public static fmb e() {
      return new fmb(fmb.a.a);
   }

   public static enum a {
      a,
      b;

      void a(flw $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends flz> T a(flw $$0, T $$1, int $$2, fma $$3) {
         return (T)(switch (this) {
            case a -> (flz)$$0.a($$1, 0, $$2, $$3);
            case b -> (flz)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
