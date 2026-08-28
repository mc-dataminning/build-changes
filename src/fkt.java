import java.util.function.Consumer;

public interface fkt {
   void m(int var1);

   void n(int var1);

   int C();

   int D();

   int x();

   int v();

   default flk G() {
      return new flk(this.C(), this.D(), this.x(), this.v());
   }

   default void c(int $$0, int $$1) {
      this.m($$0);
      this.n($$1);
   }

   void a(Consumer<fhc> var1);
}
