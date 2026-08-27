import java.util.function.Consumer;

public interface fdy {
   void m(int var1);

   void n(int var1);

   int B();

   int C();

   int w();

   int u();

   default fep F() {
      return new fep(this.B(), this.C(), this.w(), this.u());
   }

   default void c(int $$0, int $$1) {
      this.m($$0);
      this.n($$1);
   }

   void a(Consumer<fai> var1);
}
