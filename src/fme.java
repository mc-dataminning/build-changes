import java.util.function.Consumer;

public class fme implements fmb {
   private final flz a;
   private final fme.a b;
   private int c = 0;

   private fme(fme.a $$0) {
      this(0, 0, $$0);
   }

   public fme(int $$0, int $$1, fme.a $$2) {
      this.a = new flz($$0, $$1);
      this.b = $$2;
   }

   public fme a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fmd b() {
      return this.a.b();
   }

   public fmd c() {
      return this.a.c();
   }

   public <T extends fmc> T a(T $$0, fmd $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fmc> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fmc> T a(T $$0, Consumer<fmd> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fmc> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int x() {
      return this.a.x();
   }

   @Override
   public int v() {
      return this.a.v();
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
   public int C() {
      return this.a.C();
   }

   @Override
   public int D() {
      return this.a.D();
   }

   public static fme d() {
      return new fme(fme.a.b);
   }

   public static fme e() {
      return new fme(fme.a.a);
   }

   public static enum a {
      a,
      b;

      void a(flz $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fmc> T a(flz $$0, T $$1, int $$2, fmd $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
