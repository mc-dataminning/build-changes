import java.util.function.Consumer;

public class eys implements eyp {
   private final eyn a;
   private final eys.a b;
   private int c = 0;

   private eys(eys.a $$0) {
      this(0, 0, $$0);
   }

   public eys(int $$0, int $$1, eys.a $$2) {
      this.a = new eyn($$0, $$1);
      this.b = $$2;
   }

   public eys a(int $$0) {
      this.b.a(this.a, $$0);
      return this;
   }

   public eyr b() {
      return this.a.b();
   }

   public eyr c() {
      return this.a.c();
   }

   public <T extends eyq> T a(T $$0, eyr $$1) {
      return this.b.a(this.a, $$0, this.c++, $$1);
   }

   public <T extends eyq> T a(T $$0) {
      return this.a($$0, this.b());
   }

   public <T extends eyq> T a(T $$0, Consumer<eyr> $$1) {
      return this.b.a(this.a, $$0, this.c++, ac.a(this.b(), $$1));
   }

   @Override
   public void b(Consumer<eyq> $$0) {
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

   public static eys d() {
      return new eys(eys.a.b);
   }

   public static eys e() {
      return new eys(eys.a.a);
   }

   public static enum a {
      a,
      b;

      void a(eyn $$0, int $$1) {
         switch (this) {
            case a:
               $$0.a($$1);
               break;
            case b:
               $$0.b($$1);
         }
      }

      public <T extends eyq> T a(eyn $$0, T $$1, int $$2, eyr $$3) {
         return (T)(switch (this) {
            case a -> $$0.a($$1, 0, $$2, $$3);
            case b -> $$0.a($$1, $$2, 0, $$3);
         });
      }
   }
}
