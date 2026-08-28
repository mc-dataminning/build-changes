import java.util.function.Consumer;

public interface fop {
   void m(int var1);

   void n(int var1);

   int D();

   int E();

   int y();

   int w();

   default fph H() {
      return new fph(this.D(), this.E(), this.y(), this.w());
   }

   default void c(int $$0, int $$1) {
      this.m($$0);
      this.n($$1);
   }

   void a(Consumer<fkx> var1);
}
