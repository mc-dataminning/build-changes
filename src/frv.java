import java.util.function.Consumer;

public interface frv {
   void k(int var1);

   void l(int var1);

   int D();

   int E();

   int y();

   int w();

   default fsm H() {
      return new fsm(this.D(), this.E(), this.y(), this.w());
   }

   default void c(int $$0, int $$1) {
      this.k($$0);
      this.l($$1);
   }

   void a(Consumer<foc> var1);
}
