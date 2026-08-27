import java.util.function.Consumer;

public interface fbd {
   void n(int var1);

   void o(int var1);

   int B();

   int C();

   int w();

   int u();

   default fbu F() {
      return new fbu(this.B(), this.C(), this.w(), this.u());
   }

   default void c(int $$0, int $$1) {
      this.n($$0);
      this.o($$1);
   }

   void a(Consumer<exp> var1);
}
