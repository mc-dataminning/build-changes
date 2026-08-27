import java.util.function.Consumer;

public class eyn implements eyk {
   private final eyi a;
   private final eyn.a b;
   private int c = 0;

   private eyn(eyn.a $$0) {
      this(0, 0, $$0);
   }

   public eyn(int $$0, int $$1, eyn.a $$2) {
      this.a = new eyi($$0, $$1);
      this.b = $$2;
   }

   public eyn a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public eym b() {
      return this.a.b();
   }

   public eym c() {
      return this.a.c();
   }

   public <T extends eyl> T a(T $$0, eym $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends eyl> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends eyl> T a(T $$0, Consumer<eym> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<eyl> $$0) {
      this.a.b($$0);
   }

   @Override
   public void a() {
      this.a.a();
   }

   @Override
   public int k() {
      return this.a.k();
   }

   @Override
   public int i() {
      return this.a.i();
   }

   @Override
   public void f(int $$0) {
      this.a.f($$0);
   }

   @Override
   public void g(int $$0) {
      this.a.g($$0);
   }

   @Override
   public int p() {
      return this.a.p();
   }

   @Override
   public int r() {
      return this.a.r();
   }

   public static eyn d() {
      return new eyn(eyn.a.b);
   }

   public static eyn e() {
      return new eyn(eyn.a.a);
   }

   public static enum a {
      a,
      b;

      void a(eyi $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends eyl> T a(eyi $$0, T $$1, int $$2, eym $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
