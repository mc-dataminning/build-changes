import java.util.function.Consumer;

public class fjr implements fjo {
   private final fjm a;
   private final fjr.a b;
   private int c = 0;

   private fjr(fjr.a $$0) {
      this(0, 0, $$0);
   }

   public fjr(int $$0, int $$1, fjr.a $$2) {
      this.a = new fjm($$0, $$1);
      this.b = $$2;
   }

   public fjr a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fjq b() {
      return this.a.b();
   }

   public fjq c() {
      return this.a.c();
   }

   public <T extends fjp> T a(T $$0, fjq $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fjp> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fjp> T a(T $$0, Consumer<fjq> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fjp> $$0) {
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

   public static fjr d() {
      return new fjr(fjr.a.b);
   }

   public static fjr e() {
      return new fjr(fjr.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fjm $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fjp> T a(fjm $$0, T $$1, int $$2, fjq $$3) {
         return (T)(switch (this) {
            case a -> (fjp)$$0.a($$1, 0, $$2, $$3);
            case b -> (fjp)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
