import java.util.function.Consumer;

public interface evm {
   void e(int var1);

   void f(int var1);

   int p();

   int r();

   int k();

   int h();

   default ewd s() {
      return new ewd(this.p(), this.r(), this.k(), this.h());
   }

   default void b(int $$0, int $$1) {
      this.e($$0);
      this.f($$1);
   }

   void a(Consumer<esg> var1);
}
