import java.util.function.Consumer;

public interface eyl {
   void f(int var1);

   void g(int var1);

   int p();

   int r();

   int k();

   int i();

   default ezc s() {
      return new ezc(this.p(), this.r(), this.k(), this.i());
   }

   default void b(int $$0, int $$1) {
      this.f($$0);
      this.g($$1);
   }

   void a(Consumer<eux> var1);
}
