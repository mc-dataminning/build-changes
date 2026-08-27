import java.util.function.Consumer;

public interface ewb {
   void f(int var1);

   void g(int var1);

   int r();

   int t();

   int l();

   int i();

   default ews s() {
      return new ews(this.r(), this.t(), this.l(), this.i());
   }

   default void b(int $$0, int $$1) {
      this.f($$0);
      this.g($$1);
   }

   void a(Consumer<eso> var1);
}
