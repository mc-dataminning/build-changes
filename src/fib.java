import java.util.ArrayList;
import java.util.List;
import java.util.function.BooleanSupplier;

public class fib {
   public static final float a = 200.0F;
   private final List<fib.a> b = new ArrayList<>();

   public fib a(fib.a $$0) {
      this.b.add($$0);
      return this;
   }

   public fib a(fib $$0, BooleanSupplier $$1) {
      return this.a(($$2, $$3) -> {
         if ($$1.getAsBoolean()) {
            $$0.b($$2, $$3);
         }
      });
   }

   public void a(fhz $$0, fgf $$1) {
      $$0.c().a();
      this.b($$0, $$1);
      $$0.c().b();
   }

   private void b(fhz $$0, fgf $$1) {
      for (fib.a $$2 : this.b) {
         $$2.render($$0, $$1);
         $$0.c().a(0.0F, 0.0F, 200.0F);
      }
   }

   public interface a {
      void render(fhz var1, fgf var2);
   }
}
