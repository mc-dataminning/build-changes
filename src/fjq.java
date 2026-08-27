import java.util.function.Consumer;

public class fjq implements fjn {
   private final fjl a;
   private final fjq.a b;
   private int c = 0;

   private fjq(fjq.a $$0) {
      this(0, 0, $$0);
   }

   public fjq(int $$0, int $$1, fjq.a $$2) {
      this.a = new fjl($$0, $$1);
      this.b = $$2;
   }

   public fjq a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fjp b() {
      return this.a.b();
   }

   public fjp c() {
      return this.a.c();
   }

   public <T extends fjo> T a(T $$0, fjp $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fjo> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fjo> T a(T $$0, Consumer<fjp> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fjo> $$0) {
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

   public static fjq d() {
      return new fjq(fjq.a.b);
   }

   public static fjq e() {
      return new fjq(fjq.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fjl $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fjo> T a(fjl $$0, T $$1, int $$2, fjp $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
