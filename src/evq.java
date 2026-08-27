import java.util.function.Consumer;

public interface evq {
   void e(int var1);

   void f(int var1);

   int p();

   int r();

   int k();

   int h();

   default ewh s() {
      return new ewh(this.p(), this.r(), this.k(), this.h());
   }

   default void b(int $$0, int $$1) {
      this.e($$0);
      this.f($$1);
   }

   void a(Consumer<esf> var1);
}
