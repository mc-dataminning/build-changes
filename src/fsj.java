import java.util.function.Consumer;

public interface fsj {
   void j(int var1);

   void k(int var1);

   int F();

   int G();

   int A();

   int y();

   default fta J() {
      return new fta(this.F(), this.G(), this.A(), this.y());
   }

   default void c(int $$0, int $$1) {
      this.j($$0);
      this.k($$1);
   }

   void a(Consumer<foq> var1);
}
