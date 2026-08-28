import java.util.function.Consumer;

public interface frp {
   void m(int var1);

   void n(int var1);

   int D();

   int E();

   int y();

   int w();

   default fsg H() {
      return new fsg(this.D(), this.E(), this.y(), this.w());
   }

   default void c(int $$0, int $$1) {
      this.m($$0);
      this.n($$1);
   }

   void a(Consumer<fnw> var1);
}
