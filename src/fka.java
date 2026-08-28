import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fka {
   public static final float a = 200.0F;
   private final List<fka.a> b = new ArrayList<>();

   public fka a(fka.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fka a(fka $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fjx $$0, fib $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fjx $$0, fib $$1) {
      for (fka.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fjx var1, fib var2);
   }
}
