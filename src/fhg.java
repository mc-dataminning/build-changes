import java.util.function.Consumer;

public class fhg implements fhd {
   private final fhb a;
   private final fhg.a b;
   private int c = 0;

   private fhg(fhg.a $$0) {
      this(0, 0, $$0);
   }

   public fhg(int $$0, int $$1, fhg.a $$2) {
      this.a = new fhb($$0, $$1);
      this.b = $$2;
   }

   public fhg a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fhf b() {
      return this.a.b();
   }

   public fhf c() {
      return this.a.c();
   }

   public <T extends fhe> T a(T $$0, fhf $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fhe> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fhe> T a(T $$0, Consumer<fhf> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fhe> $$0) {
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

   public static fhg d() {
      return new fhg(fhg.a.b);
   }

   public static fhg e() {
      return new fhg(fhg.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fhb $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fhe> T a(fhb $$0, T $$1, int $$2, fhf $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
