import java.util.function.Consumer;

public class fns implements fnp {
   private final fnn a;
   private final fns.a b;
   private int c = 0;

   private fns(fns.a $$0) {
      this(0, 0, $$0);
   }

   public fns(int $$0, int $$1, fns.a $$2) {
      this.a = new fnn($$0, $$1);
      this.b = $$2;
   }

   public fns a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public fnr b() {
      return this.a.b();
   }

   public fnr c() {
      return this.a.c();
   }

   public <T extends fnq> T a(T $$0, fnr $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends fnq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends fnq> T a(T $$0, Consumer<fnr> $$1) {
      return this.b.a(this.a, $$0, this.c++, ad.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<fnq> $$0) {
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

   public static fns d() {
      return new fns(fns.a.b);
   }

   public static fns e() {
      return new fns(fns.a.a);
   }

   public static enum a {
      a,
      b;

      void a(fnn $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends fnq> T a(fnn $$0, T $$1, int $$2, fnr $$3) {
         return (T)(switch (this) {
            case a -> (fnq)$$0.a($$1, 0, $$2, $$3);
            case b -> (fnq)$$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
