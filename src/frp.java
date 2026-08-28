import java.util.function.Consumer;

public interface frp {
   void k(int var1);

   void l(int var1);

   int D();

   int E();

   int y();

   int w();

   default fsg H() {
      return new fsg(this.D(), this.E(), this.y(), this.w());
   }

   default void c(int $$0, int $$1) {
      this.k($$0);
      this.l($$1);
   }

   void a(Consumer<fnw> var1);
}
