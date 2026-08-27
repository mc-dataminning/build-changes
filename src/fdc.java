import java.util.function.Consumer;

public interface fdc {
   void m(int var1);

   void n(int var1);

   int B();

   int C();

   int w();

   int u();

   default fdt F() {
      return new fdt(this.B(), this.C(), this.w(), this.u());
   }

   default void c(int $$0, int $$1) {
      this.m($$0);
      this.n($$1);
   }

   void a(Consumer<ezm> var1);
}
