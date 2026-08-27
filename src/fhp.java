import java.util.function.Consumer;

public class fhp implements fhm {
   private final fhk a;
   private final fhp.a b;
   private int c = 0;

   private fhp(fhp.a $$0) {
      this(0, 0, $$0);
   }

   public fhp(int $$0, int $$1, fhp.a $$2) {
      this.a = new fhk($$0, $$1);
      this.b = $$2;
   }

   public fhp a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fho b() {
      return this.a.b();
   }

   public fho c() {
      return this.a.c();
   }

   public <T extends fhn> T a(T $$0, fho $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fhn> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fhn> T a(T $$0, Consumer<fho> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fhn> $$0) {
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

   public static fhp d() {
      return new fhp(fhp.a.b);
   }

   public static fhp e() {
      return new fhp(fhp.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fhk $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fhn> T a(fhk $$0, T $$1, int $$2, fho $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
